#region Copyright and file header
//  ********************************************************
//              Muhimbi Document Converter Service
//
//                 Copyright 2013, Muhimbi Ltd
//                       www.muhimbi.com
//
//                     All rights reserved
//
//            Original Document author: jeroen.ritmeijer
//
//       Filename: TestForm.cs
//          To do: -
//   Known issues: -
//        History: 07/10/09 - JR - Initial version
//                 06/05/10 - BM - New webservice interface 
//                                is used
//
//  ********************************************************
#endregion Copyright and file header

using System;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Security.Authentication;
using System.ServiceModel;
using System.Text;
using System.Threading;
using System.Windows.Forms;
using TestHarness.DocumentConverterService;


namespace TestHarness
{
    /// <summary>
    /// Sample code for demonstrating various features of the Muhimbi PDF Converter Service.
    /// The majority of the code is placed in this single file to make the sample code easy to follow
    /// </summary>
    /// <remarks>
    /// For more examples and the full object model see 
    /// http://support.muhimbi.com/entries/21272078-Where-can-I-find-details-about-the-PDF-Converter-s-object-model-
    /// </remarks>
    public partial class TestForm : Form
    {
        private static int _threadCount = 0;

        /// <summary>
        /// Constants needed to fix TLS1.2 without .Net patch or registry settings
        /// </summary>
        private const SslProtocols _Tls11 = (SslProtocols)0x00000300;
        private const SecurityProtocolType Tls11 = (SecurityProtocolType)_Tls11;
        private const SslProtocols _Tls12 = (SslProtocols)0x00000C00;
        private const SecurityProtocolType Tls12 = (SecurityProtocolType)_Tls12;

        /// <summary>
        /// Initialise the form.
        /// </summary>
        public TestForm()
        {
            InitializeComponent();

            // HTML related controls
            comboBoxAuthenticationMode.Items.Clear();
            comboBoxAuthenticationMode.Items.AddRange(Enum.GetNames(typeof(AuthenticationMode)));
            comboBoxHtmlRenderingEngine.Items.Clear();
            comboBoxHtmlRenderingEngine.Items.AddRange(Enum.GetNames(typeof(HTMLRenderingEngine)));
            comboBoxMediaType.Items.Clear();
            comboBoxMediaType.Items.AddRange(Enum.GetNames(typeof(MediaType)));
            numericUpDownConversionDelay.Maximum = int.MaxValue;

            // ** Populate the list of OCR languages
            comboBoxOCRLanguage.Items.Clear();
            comboBoxOCRLanguage.Items.AddRange(Enum.GetNames(typeof(OCRLanguage)));
            comboBoxOCRLanguage.Text = "English";
            
            // ** Populate the list of OCR Performance settings.
            comboBoxOCRPerformance.Items.Clear();
            comboBoxOCRPerformance.Items.AddRange(Enum.GetNames(typeof(OCRPerformance)));
            comboBoxOCRPerformance.SelectedIndex = 0;
            
            // Initialize ToC related controls
            tocGroupBox.Enabled = false;
            radioButtonToCFront.Checked = true;
            dataGridViewToCProperties.Rows.Add("title", "Document with Generated TOC");
            textBoxToCTemplate.Text = File.ReadAllText(AppDomain.CurrentDomain.BaseDirectory + @"\TocTemplate.xslt");

            // Fill available PDF profiles
            comboBoxPDFProfile.Items.Clear();
            string[] profiles = Enum.GetNames(typeof(PDFProfile));
            Array.Sort(profiles);
            comboBoxPDFProfile.Items.AddRange(profiles);
            comboBoxPDFProfile.Text = PDFProfile.Default.ToString();
        }


        /// <summary>
        /// Carry out the conversion / processing of the source file using the configuration
        /// settings specified in the form. Conversion is carried out on a separate thread to
        /// allow multiple conversions to take place at once.
        /// </summary>
        /// <param name="sourceFileName">Name of the file to convert including the full path.</param>
        /// <returns>Reference to the thread the conversion is running on.</returns>
        private Thread ConvertSingleFile(string sourceFileName)
        {
            // ** Retrieve the form's data on the main thread
            TestFormSettings formSettings = new TestFormSettings(this);
            
            ThreadStart ts = new ThreadStart(delegate
                {
                    DocumentConverterServiceClient client = null;
                    byte[] sourceFile = null;

                    try
                    {
                        Interlocked.Increment(ref _threadCount);

                        // ** Open the web service
                        client = OpenService(formSettings.textBoxServiceURL, formSettings.wcfMessageSize);
                        Debug("Client opened");

                        //** Set the various open options as specified in the form.
                        OpenOptions openOptions = new OpenOptions();
                        openOptions.Password = formSettings.textBoxPassword;
                        // ** HTTP based file names are treated slightly different
                        if (sourceFileName.StartsWith("http://", StringComparison.CurrentCultureIgnoreCase) == true)
                        {
                            openOptions.OriginalFileName = sourceFileName;
                            openOptions.FileExtension = "html";
                            // ** We need to fake path of the source file so we can later write to the same path.
                            sourceFileName = Path.GetTempFileName();
                        }
                        else
                        {
                            openOptions.OriginalFileName = Path.GetFileName(sourceFileName);
                            openOptions.FileExtension = Path.GetExtension(sourceFileName);
                            // ** Open the source file and read the contents into a byte array
                            Debug("Opening file: " + sourceFileName, false);
                            sourceFile = File.ReadAllBytes(sourceFileName);
                            Debug("File length: " + sourceFile.Length);
                        }
                        openOptions.AllowMacros = (MacroSecurityOption)Enum.Parse(typeof(MacroSecurityOption), formSettings.comboBoxMacroSecurityOptions, true);
                        openOptions.RefreshContent = formSettings.checkBoxRefreshContent;

                        if (formSettings.checkBoxPerformOCR && formSettings.checkBoxOCRRetrieveTextOnly)
                        {
                            //* Only retrieve text using OCR. We are using the batch processing with only minimal input
                            ProcessingOptions processingOptions = new ProcessingOptions();
                            processingOptions.OCRSettings = GetOCRSettings(formSettings);
                            if (processingOptions.OCRSettings == null)
                            {
                                //* Quit if error occured
                                return;
                            }

                            processingOptions.OCRSettings.OutputType = OCROutputType.Text;

                            processingOptions.SourceFiles = new SourceFile[1];
                            processingOptions.SourceFiles[0] = new SourceFile()
                            {
                                File = sourceFile,
                                OpenOptions = openOptions,
                            };

                            //* Retrieve text using the web service
                            BatchResults batchResults = client.ProcessBatch(processingOptions);

                            Debug(string.Format("Retrieved text from {0}", sourceFileName));
                            OCRResult result = batchResults.Results[0].OCRResult;
                            Debug(string.Format("Full text: {0}", result.Text), true);
                            foreach (RegionText regionText in result.RegionTexts)
                            {
                                string regionId = regionText.RegionId == null ? "undefined" : regionText.RegionId;
                                int pageNumber = regionText.PageNumber;
                                string text = regionText.Text;
                                Debug(string.Format("Text for region '{0}' on page {1}: {2}", regionId, pageNumber, text), true);
                            }
                            Debug("Number of pages OCR-ed: " + result.PageCount);
                        }
                        else
                        {
                            // ** Set the various conversion settings as specified in the form.
                            ConversionSettings conversionSettings = new ConversionSettings();
                            conversionSettings.Fidelity = (ConversionFidelities)Enum.Parse(typeof(ConversionFidelities), formSettings.comboBoxFidelity, true);
                            conversionSettings.Format = (OutputFormat)Enum.Parse(typeof(OutputFormat), formSettings.comboBoxFormat, true);
                            conversionSettings.Quality = (ConversionQuality)Enum.Parse(typeof(ConversionQuality), formSettings.comboBoxQuality, true);
                            conversionSettings.StartPage = int.Parse(formSettings.textBoxStartPage);
                            conversionSettings.EndPage = int.Parse(formSettings.textBoxEndPage);
                            conversionSettings.GenerateBookmarks = (BookmarkGenerationOption)Enum.Parse(typeof(BookmarkGenerationOption), formSettings.comboBoxBookmarks, true);
                            conversionSettings.PDFProfile = (PDFProfile)Enum.Parse(typeof(PDFProfile), formSettings.comboBoxPDFProfile, true);
                            conversionSettings.OpenPassword = formSettings.textBoxPDFOpenPassword;
                            conversionSettings.OwnerPassword = formSettings.textBoxPDFOwnerPassword;
                            if (formSettings.checkBoxDisableAnnotations)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableAnotations;
                            if (formSettings.checkBoxDisableAccessibility)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableContentAccessibility;
                            if (formSettings.checkBoxDisableCopyContent)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableContentCopy;
                            if (formSettings.checkBoxDisableDocumentAssembly)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableDocumentAssembly;
                            if (formSettings.checkBoxDisableFormFields)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableFormFields;
                            if (formSettings.checkBoxDisableHighResolutionPrint)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableHighResolutionPrint;
                            if (formSettings.checkBoxDisablePrint)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisablePrint;
                            if (formSettings.checkBoxDisableDocumentSecurity)
                                conversionSettings.SecurityOptions |= SecurityOptions.DisableSecurity;
                            conversionSettings.Range = (ConversionRange)Enum.Parse(typeof(ConversionRange), formSettings.comboBoxRange, true);
                            conversionSettings.PageOrientation = (PageOrientation)Enum.Parse(typeof(PageOrientation), formSettings.comboBoxPageOrientation, true);

                            // ** Specify OCR settings if enabled.
                            if (formSettings.checkBoxPerformOCR)
                            {
                                conversionSettings.OCRSettings = GetOCRSettings(formSettings);
                                if (conversionSettings.OCRSettings == null)
                                {
                                    //* bail out if error occured
                                    return;
                                }
                            }

                            // ** Include sample watermarks if enabled.
                            if (formSettings.checkBoxIncludeSampleWatermarks)
                                conversionSettings.Watermarks = CreateWatermarks();

                            // ** Add converter specific settings if needed. Disabled in this sample
                            /*
                            ConverterSpecificSettings_WordProcessing csc = new ConverterSpecificSettings_WordProcessing();
                            csc.RevisionsAndCommentsDisplayMode = RevisionsAndCommentsDisplayMode.OriginalShowingMarkup;
                            csc.RevisionsAndCommentsMarkupMode = RevisionsAndCommentsMarkupMode.InLine;
                            csc.ProcessDocumentTemplate = true;
                            conversionSettings.ConverterSpecificSettings = csc;
                            */

                            //* If the output format is 'PDF' and ToC is enabled then add TocSettings to ConversionSettings
                            conversionSettings.TOCSettings = GetTOCSettings(formSettings);

                            // ** If the output format is 'PDF' then specify the PDF output specific settings. This is completely optional
                            conversionSettings.OutputFormatSpecificSettings = GetOutputFormatSpecificSettings(formSettings);

                            string destinationFileName;
                            if (sourceFileName.ToLower().Trim().EndsWith(".pdf"))
                            {
                                // ** We don't want to overwrite the source PDF file, so the destination file name is changed.
                                destinationFileName = Path.GetDirectoryName(sourceFileName) + @"\" + Path.GetFileNameWithoutExtension(sourceFileName) + "_processed." + conversionSettings.Format;
                            }
                            else
                            {
                                destinationFileName = Path.GetDirectoryName(sourceFileName) + @"\" + Path.GetFileNameWithoutExtension(sourceFileName) + "." + conversionSettings.Format;
                            }

                            // ** Carry out the actual conversion
                            byte[] convertedFile;
                            convertedFile = client.Convert(sourceFile, openOptions, conversionSettings);

                            Debug("Converted file length: " + convertedFile.Length);
                            Debug("File Converted: " + sourceFileName, true);

                            // ** Let the webbrowser release the file
                            NavigateBrowser("about:blank");

                            // ** Write the PDF file to the local file system.
                            using (FileStream fs = File.Create(destinationFileName))
                            {
                                Debug("Writing file: " + destinationFileName);
                                fs.Write(convertedFile, 0, convertedFile.Length);
                                fs.Close();
                            }

                            // ** Display the converted file if this option has been enabled.
                            NavigateBrowser(destinationFileName);
                        }
                    }
                    catch (FaultException<WebServiceFaultException> ex)
                    {
                        Debug("FaultException occurred: ExceptionType: " + ex.Detail.ExceptionType.ToString() + "\r\n" + ex.ToString(), true);
                    }
                    catch (Exception ex)
                    {
                        Debug(ex.ToString(), true);
                    }
                    finally
                    {
                        CloseService(client);
                        Interlocked.Decrement(ref _threadCount);
                    }
                });

            Thread t = new Thread(ts);
            t.Start();
            return t;
        }
        
        /// <summary>
        /// Convert and Merge all files in a folder while taking the various selected options in account.
        /// </summary>
        /// <remarks>Doesn't carry out OCR processing, but that can easily be added, see 'ConvertSingleFile'. </remarks>
        /// <param name="sourceFileNames">The file names of documents to merge including the full path,</param>
        /// <param name="destinationFileName">The name of the output file including the full path.</param>
        private void MergeFiles(string[] sourceFileNames, string destinationFileName)
        {
            // ** Retrieve the form's data on the main thread
            TestFormSettings formSettings = new TestFormSettings(this);

            DocumentConverterServiceClient client = null;

            try
            {
                // ** Open the web service
                client = OpenService(formSettings.textBoxServiceURL, formSettings.wcfMessageSize);
                Debug("Client opened");

                //** Set the various open options as specified in the form.
                ProcessingOptions options = new ProcessingOptions();
                MergeSettings mergeSettings = new MergeSettings();
                mergeSettings.BreakOnError = false;
                mergeSettings.PDFProfile = (PDFProfile)Enum.Parse(typeof(PDFProfile), formSettings.comboBoxPDFProfile, true);
                mergeSettings.OpenPassword = formSettings.textBoxPDFOpenPassword;
                mergeSettings.OwnerPassword = formSettings.textBoxPDFOwnerPassword;
                if (formSettings.checkBoxDisableAnnotations)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableAnotations;
                if (formSettings.checkBoxDisableAccessibility)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableContentAccessibility;
                if (formSettings.checkBoxDisableCopyContent)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableContentCopy;
                if (formSettings.checkBoxDisableDocumentAssembly)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableDocumentAssembly;
                if (formSettings.checkBoxDisableFormFields)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableFormFields;
                if (formSettings.checkBoxDisableHighResolutionPrint)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableHighResolutionPrint;
                if (formSettings.checkBoxDisablePrint)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisablePrint;
                if (formSettings.checkBoxDisableDocumentSecurity)
                    mergeSettings.SecurityOptions |= SecurityOptions.DisableSecurity;

                //* Add a watermark that will be applied on the entire merged document. Note that this is separate from watermarks applied on the individual files.
                if (formSettings.checkBoxIncludeSampleWatermarks)
                {
                    mergeSettings.Watermarks = CreateWatermarks();
                }

                // ** If the output format is 'PDF' then specify the PDF output specific settings. This is completely optional
                mergeSettings.OutputFormatSpecificSettings = GetOutputFormatSpecificSettings(formSettings);

                // ** If the output format is 'PDF' and ToC is enabled then add TOCSettings to MergeSettings
                mergeSettings.TOCSettings = GetTOCSettings(formSettings);

                // ** What page do we want each new document to appear on?
                mergeSettings.DocumentStartPage = DocumentStartPage.Next;

                //* assign merge settings
                options.MergeSettings = mergeSettings;

                //* Add source files
                List<SourceFile> sourceFiles = new List<SourceFile>();
                foreach (string sourceFileName in sourceFileNames)
                {
                    byte[] sourceFileContent = null;

                    //** Set the various open options as specified in the form.
                    OpenOptions openOptions = new OpenOptions();
                    openOptions.Password = formSettings.textBoxPassword;
                    openOptions.OriginalFileName = Path.GetFileName(sourceFileName);
                    openOptions.FileExtension = Path.GetExtension(sourceFileName);
                    // ** Open the source file and read the contents into a byte array
                    Debug("Opening file: " + sourceFileName);
                    sourceFileContent = File.ReadAllBytes(sourceFileName);
                    Debug("File length: " + sourceFileContent.Length);

                    openOptions.AllowMacros = (MacroSecurityOption)Enum.Parse(typeof(MacroSecurityOption), formSettings.comboBoxMacroSecurityOptions, true);
                    openOptions.RefreshContent = formSettings.checkBoxRefreshContent;

                    // ** Set the various conversion settings as specified in the form.
                    ConversionSettings conversionSettings = new ConversionSettings();
                    conversionSettings.Fidelity = (ConversionFidelities)Enum.Parse(typeof(ConversionFidelities), formSettings.comboBoxFidelity, true);
                    conversionSettings.Format = (OutputFormat)Enum.Parse(typeof(OutputFormat), formSettings.comboBoxFormat, true);
                    conversionSettings.Quality = (ConversionQuality)Enum.Parse(typeof(ConversionQuality), formSettings.comboBoxQuality, true);
                    conversionSettings.StartPage = int.Parse(formSettings.textBoxStartPage);
                    conversionSettings.EndPage = int.Parse(formSettings.textBoxEndPage);
                    conversionSettings.GenerateBookmarks = (BookmarkGenerationOption)Enum.Parse(typeof(BookmarkGenerationOption), formSettings.comboBoxBookmarks, true);
                    conversionSettings.PDFProfile = (PDFProfile)Enum.Parse(typeof(PDFProfile), formSettings.comboBoxPDFProfile, true);

                    conversionSettings.Range = (ConversionRange)Enum.Parse(typeof(ConversionRange), formSettings.comboBoxRange, true);
                    conversionSettings.PageOrientation = (PageOrientation)Enum.Parse(typeof(PageOrientation), formSettings.comboBoxPageOrientation, true);

                    //** We could specify watermarks on the individual files as well, but in this sample we just use watermarks at the merged file level (see above)
                    //conversionSettings.Watermarks = CreateWatermarks();

                    //* create merge settings for each file
                    FileMergeSettings fileMergeSettings = new FileMergeSettings();
                    //* set top level bookmark to original file name
                    fileMergeSettings.TopLevelBookmark = openOptions.OriginalFileName;

                    //* create one source file object and add it to the list
                    SourceFile sourceFile = new SourceFile();
                    sourceFile.OpenOptions = openOptions;
                    sourceFile.ConversionSettings = conversionSettings;
                    sourceFile.File = sourceFileContent;
                    sourceFile.MergeSettings = fileMergeSettings;

                    sourceFiles.Add(sourceFile);
                }
                //* assign source files
                options.SourceFiles = sourceFiles.ToArray();
                
                //* Merge and get the result file (it is the File property of the first Result in the results)
                Debug("Convert and merge started.");
                BatchResults results = client.ProcessBatch(options);
                byte[] mergedFile = results.Results[0].File;
                Debug("Merged file length: " + mergedFile.Length);
                Debug("Files merged, writing file: " + destinationFileName);

                // ** Let the webbrowser release the file
                NavigateBrowser("about:blank");

                // ** Write the PDF file to the local file system.
                using (FileStream fs = File.Create(destinationFileName))
                {
                    fs.Write(mergedFile, 0, mergedFile.Length);
                    fs.Close();
                }

                // ** Dislay the converted file if this option has been enabled.
                NavigateBrowser(destinationFileName);
            }
            catch (FaultException<WebServiceFaultException> ex)
            {
                Debug("FaultException occurred: ExceptionType: " + ex.Detail.ExceptionType.ToString() + "\r\n" + ex.ToString(), true);
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
            finally
            {
                CloseService(client);
            }
        }


        /// <summary>
        /// Open the service using the specified address and configure the bindings.
        /// </summary>
        /// <param name="address">The URL where the Web Service is located.</param>
        /// <param name="wcfMessageSize">The maximum size supported by the WCF message. (in MB)</param>
        /// <returns>An instance of the Web Service.</returns>
        public static DocumentConverterServiceClient OpenService(string address, int wcfMessageSize)
        {
            DocumentConverterServiceClient client = null;

            try
            {
                BasicHttpBinding binding = new BasicHttpBinding();

                if (address.ToLower().StartsWith("https", StringComparison.InvariantCulture))
                {
                    binding.Security.Mode = BasicHttpSecurityMode.Transport;

                    // Enable all security protocols so the Diagnostis Tool can connect to the services with any https protocol
                    if (System.Environment.OSVersion.Version.Major >= 6)
                    {
                        // New Windows versions support all protocols
                        ServicePointManager.SecurityProtocol = SecurityProtocolType.Ssl3 | SecurityProtocolType.Tls | Tls11 | Tls12;
                    }
                    else
                    {
                        // TLS 1.1 and TLS 1.2 are not supported before Windows Server 2008. Don't try to set it as it would throw an exception
                        ServicePointManager.SecurityProtocol = SecurityProtocolType.Ssl3 | SecurityProtocolType.Tls;
                    }
                }
                else
                {
                    binding.Security.Mode = BasicHttpSecurityMode.TransportCredentialOnly;
                }

                // ** Use standard Windows Authentication
                binding.Security.Transport.ClientCredentialType = HttpClientCredentialType.Windows;
                // ** Allow long running conversions
                binding.SendTimeout = TimeSpan.FromMinutes(120);
                binding.ReceiveTimeout = TimeSpan.FromMinutes(120);
                // ** Set the maxmimum file size.Allow file sizes of 100MB to be returned
                binding.MaxReceivedMessageSize = wcfMessageSize * 1024 * 1024 / 3 * 4; // ** Include 1/3 Base 64 overhead, see issue 1193
                binding.ReaderQuotas.MaxArrayLength = wcfMessageSize * 1024 * 1024 / 3 * 4;
                binding.ReaderQuotas.MaxStringContentLength = wcfMessageSize * 1024 * 1024 / 3 * 4;

                // ** We need to specify an identity (any identity) in order to get it past .net3.5 sp1
                EndpointIdentity epi = EndpointIdentity.CreateUpnIdentity("unknown");
                EndpointAddress epa = new EndpointAddress(new Uri(address), epi);

                client = new DocumentConverterServiceClient(binding, epa);

                client.Open();

                return client;
            }
            catch (Exception)
            {
                CloseService(client);
                throw;
            }
        }

        /// <summary>
        /// Check if the client is open and then close it.
        /// </summary>
        /// <param name="client">The client to close</param>
        public static void CloseService(DocumentConverterServiceClient client)
        {
            if (client != null && client.State == CommunicationState.Opened)
                client.Close();
        }


        /// <summary>
        /// Populate the Output specific settings. 
        /// Moved to a separate method to keep to main examples clear.
        /// </summary>
        /// <param name="formSettings">TestFormSettings object with settings specified in the form.</param>
        /// <returns>An instance of OutputFormatSpecificSettings_PDF or null when the output file type is not 'pdf'.</returns>
        private OutputFormatSpecificSettings_PDF GetOutputFormatSpecificSettings(TestFormSettings formSettings)
        {
            if (formSettings.comboBoxFormat.ToLower() == "pdf")
            {
                OutputFormatSpecificSettings_PDF ofss = new OutputFormatSpecificSettings_PDF();
                ofss.FastWebView = formSettings.checkBoxEnableFastWebView;
                ofss.PostProcessFile = formSettings.checkBoxPostProcessFile;
                ofss.SubsetFonts = formSettings.checkBoxSubsetFonts;
                ofss.EmbedAllFonts = formSettings.checkBoxEmbedAllFonts;

                ofss.ViewerPreferences = new PDFViewerPreferences();
                ofss.ViewerPreferences.CenterWindow = formSettings.checkBoxCenterWindow;
                ofss.ViewerPreferences.DisplayTitle = formSettings.checkBoxDisplayTitle;
                ofss.ViewerPreferences.FitWindow = formSettings.checkBoxFitWindow;
                ofss.ViewerPreferences.FullScreen = formSettings.checkBoxFullScreen;
                ofss.ViewerPreferences.HideEmptyNavigationPane = formSettings.checkBoxHideEmptyNavigationPane;
                ofss.ViewerPreferences.HideMenubar = formSettings.checkBoxHideMenubar;
                ofss.ViewerPreferences.HideToolbar = formSettings.checkBoxHideToolbar;
                ofss.ViewerPreferences.HideWindowUI = formSettings.checkBoxHideWindowUI;
                ofss.ViewerPreferences.NavigationPane = (PDFNavigationPane)Enum.Parse(typeof(PDFNavigationPane), formSettings.comboBoxNavigationPane, true);
                ofss.ViewerPreferences.PageLayout = (PDFPageLayout)Enum.Parse(typeof(PDFPageLayout), formSettings.comboBoxPageLayout, true);
                ofss.ViewerPreferences.PageScalingMode = (PDFPageScalingMode)Enum.Parse(typeof(PDFPageScalingMode), formSettings.comboBoxPageScalingMode, true);

                return ofss;
            }

            return null;
        }

        /// <summary>
        /// Populate the OCR settings
        /// Moved to a separate method to keep to main examples clear.
        /// </summary>
        /// <param name="formSettings">TestFormSettings object with settings specified in the form.</param>
        /// <returns>An instance of OCRSettings or null when error occured.</returns>
        private OCRSettings GetOCRSettings(TestFormSettings formSettings)
        {
            OCRSettings ocrSettings = new OCRSettings();
            ocrSettings.Language = formSettings.comboBoxOCRLanguage;
            ocrSettings.Performance = (OCRPerformance)Enum.Parse(typeof(OCRPerformance), formSettings.comboBoxOCRPerformance, true);
            ocrSettings.Paginate = formSettings.checkBoxOCRPaginate;
            ocrSettings.WhiteList = formSettings.textBoxOCRWhiteList;
            ocrSettings.BlackList = formSettings.textBoxOCRBlackList;

            try
            {
                ocrSettings.Regions = TestForm.GetRegions(formSettings.textBoxOCRRegions);
            }
            catch (Exception)
            {
                MessageBox.Show("Invalid OCR regions. The expected format is id|x|y|w|h|pageRegion|startPage|endPage|pageInterval, one region per line.");
                return null;
            }

            return ocrSettings;
        }

        /// <summary>
        /// Populates Table of Content settings
        /// </summary>
        /// <param name="formSettings">TestFormSettings object with settings specified in the form.</param>
        /// <returns>An instance of TOCSettings or null when output is not PDF</returns>
        private TOCSettings GetTOCSettings(TestFormSettings formSettings)
        {
            if (formSettings.comboBoxFormat.ToLower() == "pdf" && formSettings.checkBoxEnableToC)
            {
                NameValuePair[] properties = new NameValuePair[formSettings.dataGridViewToCProperties.Count];
                for (int i = 0; i < formSettings.dataGridViewToCProperties.Count; i++)
                {
                    properties[i] = new NameValuePair
                    {
                        Name = formSettings.dataGridViewToCProperties[i].Key,
                        Value = formSettings.dataGridViewToCProperties[i].Value,
                    };
                }
                TOCSettings tocSettings = new TOCSettings
                {
                    MinimumEntries = 0,
                    Bookmark = formSettings.textBoxToCBookmarkLabel,
                    Location = formSettings.radioButtonToCFront ? TOCLocation.Front : TOCLocation.Back,
                    Properties = properties,
                    Template = formSettings.textBoxToCTemplate,
                    DocumentStartPage = DocumentStartPage.Next
                };

                return tocSettings;
            }

            return null;
        }


        /// <summary>
        /// Event handler for converting a single file.
        /// </summary>
        private void buttonConvertFile_Click(object sender, EventArgs e)
        {
            try
            {
                if (String.IsNullOrEmpty(textBoxFileName.Text) == true)
                    Debug("Please specify a valid file name in the Source field.");
                else
                    ConvertSingleFile(textBoxFileName.Text.Trim('\"'));
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
        }


        /// <summary>
        /// Event handler for batch converting an entire folder.
        /// </summary>
        private void buttonConvertFolder_Click(object sender, EventArgs e)
        {
            // ** Maximum number of parallel conversions (note that the real maximum is configured on the server)
            int MAX_THREAD_COUNT = (int) parallelConversions.Value;
            try
            {
                if (String.IsNullOrEmpty(textBoxFileName.Text) == true || Directory.Exists(textBoxFileName.Text) == false)
                    Debug("Please specify a valid path in the Source field.", true);
                else
                {
                    Debug("Converting folder.", true);

                    checkBoxShowConverted.Checked = false;

                    Thread t = null;
                    string[] files = Directory.GetFiles(textBoxFileName.Text);
                    foreach (string file in files)
                    {
                        if (Path.GetFileNameWithoutExtension(file).EndsWith("_processed") == false)
                        {
                            t = ConvertSingleFile(file);
                            do
                            {
                                Thread.Sleep(50);
                                Application.DoEvents();
                            } while (_threadCount >= MAX_THREAD_COUNT);
                        }
                        else
                        {
                            Debug("File already processed, skipping: " + file);
                        }
                    }
                    Debug("All files converted.", true);
                }

            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
        }

        /// <summary>
        /// Event handler for merging documents in a folder
        /// </summary>
        private void buttonMergeFolder_Click(object sender, EventArgs e)
        {
            try
            {
                if (String.IsNullOrEmpty(textBoxFileName.Text) == true || Directory.Exists(textBoxFileName.Text) == false || Directory.GetParent(textBoxFileName.Text) == null)
                    Debug("Please specify a valid folder in the Source field.", true);
                else
                {
                    //* get files in the folder
                    string[] sourceFileNames = Directory.GetFiles(textBoxFileName.Text);
                    //* resolve destination file name
                    string folderName = new DirectoryInfo(textBoxFileName.Text).Name;
                    DirectoryInfo parentFolder = Directory.GetParent(textBoxFileName.Text);
                    string destinationFileName = Path.Combine(parentFolder.FullName,  folderName + ".pdf");
                    MergeFiles(sourceFileNames, destinationFileName);
                }
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
        }

        delegate void StringParamDelegate(string param);
        delegate void DebugDelegate(string param, Boolean force);

        /// <summary>
        /// Log a message to the screen.
        /// </summary>
        /// <param name="s">The message to log.</param>
        /// <param name="force">Always log, even if verbose logging is off.</param>
        private void Debug(String s, Boolean force)
        {
            // ** Make sure we are on the right thread
            if (this.InvokeRequired)
            {
                s = Thread.CurrentThread.ManagedThreadId + " - " + s;
                Delegate d = new DebugDelegate(Debug);
                this.Invoke(d, new object[] { s, force });
                return;
            }
            
            if (checkBoxVerboseLogging.Checked == true || force == true)
            {
                textBoxDebug.AppendText(DateTime.Now + " - " + s + "\r\n");
                textBoxDebug.SelectionStart = textBoxDebug.Text.Length;
                textBoxDebug.ScrollToCaret();
                Application.DoEvents();
            }
        }

        /// <summary>
        /// Log a message to the screen.
        /// </summary>
        /// <param name="s">The message to log.</param>
        private void Debug(String s)
        {
            Debug(s, false);
        }

        /// <summary>
        /// Navigate the browser control to the specified address. 
        /// Used for displaying PDF and XPS files.
        /// </summary>
        /// <param name="address">The address (file) to navigate to.</param>
        private void NavigateBrowser(string address)
        {
            // ** Make sure we are on the right thread
            if (this.InvokeRequired)
            {
                Delegate d = new StringParamDelegate(NavigateBrowser);
                this.Invoke(d, new object[] { address });
                return;
            }
            if (checkBoxShowConverted.Checked == true)
            {
                webBrowser.Navigate(address);
                // ** A bit Hackey, but it allows the IE frame to be unloaded first.
                if (address == "about:blank")
                {
                    Application.DoEvents();
                    Thread.Sleep(2000);
                }

            }
            labelThreadCount.Text = "In progress: " + _threadCount;
        }

        /// <summary>
        /// Request the server's configuration.
        /// </summary>
        private void buttonRequestConfiguration_Click(object sender, EventArgs e)
        {
            DocumentConverterServiceClient client = null;
            try
            {
                client = OpenService(textBoxServiceURL.Text, 10);
                Debug("Client opened");

                Configuration configuration = client.GetConfiguration();
                Debug("Service URL: " + configuration.ConversionServerAddress);

                Debug("Converters:");

                foreach (ConverterConfiguration c in configuration.Converters)
                {
                    Debug("Converter Type: " + c.ConverterName.ToString() + " - Fidelity: " + c.SupportedFidelity + " - " + string.Join(",", c.SupportedFileExtensions));
                }

                Debug("Operation Types:");

                foreach (OperationTypeConfiguration c in configuration.OperationTypes)
                {
                    Debug(string.Format("Operation Type: {0} - {1}\r\n\tEnabled: {2} - MaxInstances: {3} - MaxRunDuration: {4}",
                        c.OperationType, c.Description, c.Enabled, c.MaximumInstances, c.MaximumRunDuration));
                }
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
            finally
            {
                if (client != null)
                {
                    client.Close();
                }
            }
        }

        /// <summary>
        /// Run Diagnostic test on the Conversion Service.
        /// </summary>
        private void buttonRequestDiagnostics_Click(object sender, EventArgs e)
        {
            DocumentConverterServiceClient client = null;
            try
            {
                client = OpenService(textBoxServiceURL.Text, 10);
                Debug("Client opened");

                Configuration configuration = client.GetConfiguration();
                Debug("Service URL: " + configuration.ConversionServerAddress);

                List<DiagnosticRequestItem> convertersToDiagnose = new List<DiagnosticRequestItem>();

                foreach (ConverterConfiguration c in configuration.Converters)
                {
                    DiagnosticRequestItem requestItem = new DiagnosticRequestItem();
                    requestItem.ConverterName = c.ConverterName;
                    convertersToDiagnose.Add(requestItem);
                }

                Diagnostics diagnostics = client.GetDiagnostics(convertersToDiagnose.ToArray());

                foreach (DiagnosticResultItem item in diagnostics.Items)
                {
                    Debug("ConverterType: " + item.ConverterName + " - Valid: " + item.Valid + " - ExceptionType: " + item.ExceptionType.ToString());
                }
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
            finally
            {
                if (client != null)
                {
                    client.Close();
                }
            }
        }

        /// <summary>
        /// Request service status
        /// </summary>
        private void buttonRequestStatus_Click(object sender, EventArgs e)
        {
            DocumentConverterServiceClient client = null;
            try
            {
                client = OpenService(textBoxServiceURL.Text, 10);
                Debug("Client opened");

                // Create request items
                List<StatusRequestItem> requestItems = new List<StatusRequestItem>();

                // Conversion by extension
                List<string> extensions = new List<string> { "html", "docx", "infopathxml", "xlsx", "ppt", "pub",
                                                                "vsd", "dwg", "tiff", "jpg", "msg", "ps", "pdf" };
                foreach(string extension in extensions)
                {
                    requestItems.Add(new StatusRequestItem
                    {
                        RequestID = requestItems.Count.ToString(), // Simply use element index in list as ID
                        OperationType = OperationType.Convert,
                        Data = string.Format("extension={0}", extension),
                    });
                }

                // Conversion of infopath xml
                string infoPathContent = Convert.ToBase64String(Encoding.UTF8.GetBytes("<?xml version=\"1.0\" encoding=\"UTF-8\"?><?mso-infoPathSolution solutionVersion=\"1.0.0.2\" productVersion=\"12.0.0\" PIVersion=\"1.0.0.0\" href=\"**TEST**\" name=\"urn:schemas-microsoft-com:office:infopath:MS-InfoPath:-myXSD-2009-11-05T15-43-23\" ?><?mso-application progid=\"InfoPath.Document\" versionProgid=\"InfoPath.Document.2\"?>"));
                requestItems.Add(new StatusRequestItem
                {
                    RequestID = requestItems.Count.ToString(), // Simply use element index in list as ID
                    OperationType = OperationType.Convert,
                    Data = string.Format("extension=xml;content={0}", infoPathContent),
                });

                // Conversion by converter
                List<string> converters = new List<string> { "HTML", "WordProcessing", "InfoPath", "SpreadSheets",
                                                                "CrossConverter_MHT", "Presentations", "MicrosoftPublisher",
                                                                "Vector", "CAD", "TIFF", "Image", "MSG", "Postscript", "Passthrough" };

                foreach(string converter in converters)
                {
                    requestItems.Add(new StatusRequestItem
                    {
                        RequestID = requestItems.Count.ToString(), // Simply use element index in list as ID
                        OperationType = OperationType.Convert,
                        Data = string.Format("converter={0}", converter),
                    });
                }

                // Other operations. Simply use element index in list as ID
                requestItems.Add(new StatusRequestItem { RequestID = requestItems.Count.ToString(), OperationType = OperationType.Merge });
                requestItems.Add(new StatusRequestItem { RequestID = requestItems.Count.ToString(), OperationType = OperationType.Split });
                requestItems.Add(new StatusRequestItem { RequestID = requestItems.Count.ToString(), OperationType = OperationType.Secure });
                requestItems.Add(new StatusRequestItem { RequestID = requestItems.Count.ToString(), OperationType = OperationType.Watermark });
                requestItems.Add(new StatusRequestItem { RequestID = requestItems.Count.ToString(), OperationType = OperationType.OCR });

                // Create request
                StatusRequest statusRequest = new StatusRequest();
                statusRequest.StatusRequestItems = requestItems.ToArray();

                // Execute request
                Status status = client.GetStatus(statusRequest);

                // Print results
                Debug(string.Format("Operations ({0}/{1})", status.CurrentInstances, status.MaximumInstances));
                foreach (StatusResultItem item in status.Items)
                {
                    // Get original request
                    StatusRequestItem requestItem = requestItems[Int32.Parse(item.RequestID)];

                    if (string.IsNullOrEmpty(requestItem.Data))
                    {
                        Debug(string.Format("{0} - {1} ({2}/{3})",
                            requestItem.OperationType,
                            item.OperationStatus,
                            item.CurrentInstances,
                            item.MaximumInstances));
                    }
                    else
                    {
                        Debug(string.Format("{0} ({1}) - {2} ({3}/{4})",
                            requestItem.OperationType,
                            requestItem.Data.Length < 32 ? requestItem.Data : requestItem.Data.Substring(0, 32) + "...", // Truncate content
                            item.OperationStatus,
                            item.CurrentInstances,
                            item.MaximumInstances));
                    }
                }
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
            finally
            {
                if (client != null)
                {
                    client.Close();
                }
            }
        }

        /// <summary>
        /// Event handler for the file browse button
        /// </summary>
        private void buttonBrowse_Click(object sender, EventArgs e)
        {
            openFileDialog.FileName = string.Empty;
            DialogResult result = openFileDialog.ShowDialog();
            if(result == DialogResult.OK)
                textBoxFileName.Text = openFileDialog.FileName;
        }

        /// <summary>
        /// Set the focus when then form is opened.
        /// </summary>
        private void TestForm_Shown(object sender, EventArgs e)
        {
            textBoxFileName.Focus();
        }

        /// <summary>
        /// Event handler for when the Convert URL button is clicked
        /// </summary>
        private void buttonConvertURL_Click(object sender, EventArgs e)
        {
            ConvertHTML(false);
        }

        /// <summary>
        /// Event handler for when the Convert HTML Code is clicked
        /// </summary>
        private void buttonConvertHTML_Click(object sender, EventArgs e)
        {
            ConvertHTML(true);
        }

        /// <summary>
        /// Simple sample to convert either a URL or HTML code fragment to PDF
        /// </summary>
        /// <param name="htmlOnly">A flag indicating if an HTML Code fragment (true)
        /// or URL (false) should be converted.</param>
        private void ConvertHTML(bool htmlOnly)
        {
            DocumentConverterServiceClient client = null;

            try
            {
                string sourceFileName = null;
                byte[] sourceFile = null;

                client = OpenService(textBoxServiceURL.Text, 50);
                Debug("Client opened");

                OpenOptions openOptions = new OpenOptions();

                //** Specify optional authentication settings
                openOptions.UserName = textBoxHTMLUserName.Text;
                openOptions.Password = textBoxHTMLPassword.Text;

                if (htmlOnly == true)
                {
                    //** Specify the HTML to convert
                    sourceFile = GetUnicodeBytesWithBom(textBoxHTMLCode.Text);
                }
                else
                {
                    // ** Specify the URL to convert
                    openOptions.OriginalFileName = textBoxHTMLurl.Text;
                }
                openOptions.FileExtension = "html";
                sourceFileName = Path.GetTempFileName();
                File.Delete(sourceFileName);

                // ** Enable JavaScript on the page to convert. 
                // ** At the moment this is a requirement for converting SharePoint pages.
                openOptions.AllowMacros = MacroSecurityOption.All;

                // ** Set the various conversion settings
                ConversionSettings conversionSettings = new ConversionSettings();
                conversionSettings.Fidelity = ConversionFidelities.Full;
                conversionSettings.PDFProfile = PDFProfile.PDF_1_5;
                conversionSettings.PageOrientation = PageOrientation.Default;
                conversionSettings.Quality = ConversionQuality.OptimizeForPrint;
                ConverterSpecificSettings_HTML converterSpecificSettings = new ConverterSpecificSettings_HTML();
                converterSpecificSettings.HtmlRenderingEngine = (HTMLRenderingEngine)Enum.Parse(typeof(HTMLRenderingEngine), comboBoxHtmlRenderingEngine.Text);
                converterSpecificSettings.AuthenticationMode = (AuthenticationMode)Enum.Parse(typeof(AuthenticationMode), comboBoxAuthenticationMode.Text);
                converterSpecificSettings.MediaType = (MediaType)Enum.Parse(typeof(MediaType), comboBoxMediaType.Text);
                converterSpecificSettings.ConversionDelay = (int)numericUpDownConversionDelay.Value;

                conversionSettings.ConverterSpecificSettings = converterSpecificSettings;

                // ** Carry out the actual conversion
                byte[] convertedFile = client.Convert(sourceFile, openOptions, conversionSettings);
                Debug("File Converted. File size: " + convertedFile.Length);

                string destinationFileName = Path.GetDirectoryName(sourceFileName) + @"\" + Path.GetFileNameWithoutExtension(sourceFileName) + "." + conversionSettings.Format;
                Debug("Writing file: " + destinationFileName);

                // ** Write the PDF file to the local file system.
                using (FileStream fs = File.Create(destinationFileName))
                {
                    fs.Write(convertedFile, 0, convertedFile.Length);
                    fs.Close();
                }

                // ** Display the converted file if this option has been enabled.
                NavigateBrowser(destinationFileName);
            }
            catch (FaultException<WebServiceFaultException> ex)
            {
                Debug("FaultException occurred: ExceptionType: " + ex.Detail.ExceptionType.ToString() + "\r\n" + ex.ToString(), true);
            }
            catch (Exception ex)
            {
                Debug(ex.ToString(), true);
            }
            finally
            {
                CloseService(client);
            }
        }


        /// <summary>
        /// This method creates sample watermarks for odd and even pages.
        /// </summary>
        /// <returns>Array of sample watermarks</returns>
        private Watermark[] CreateWatermarks()
        {
            #region Sample watermark on odd pages

            //*create watermark object
            Watermark oddPageWatermark = new Watermark();
            //* set positioning to the middle
            oddPageWatermark.HPosition = HPosition.Center;
            oddPageWatermark.VPosition = VPosition.Middle;
            //* set size
            oddPageWatermark.Width = "550";
            oddPageWatermark.Height = "800";
            //* set the pages is should appear on
            oddPageWatermark.StartPage = 1;
            oddPageWatermark.EndPage = 0;
            oddPageWatermark.PageInterval = 2;

            //* create text object
            Text oddPageText = new Text();
            //* position it to the bottom right corner
            oddPageText.HPosition = HPosition.Right;
            oddPageText.VPosition = VPosition.Bottom;
            //* set size
            oddPageText.Width = "200";
            oddPageText.Height = "20";
            //* set content with field codes
            oddPageText.Content = "Page {PAGE} of {NUMPAGES}";
            //* set font properties
            oddPageText.FillColor = "#ffff0000";
            oddPageText.FontFamilyName = "Verdana";
            oddPageText.FontSize = "10";
            oddPageText.FontStyle = FontStyle.Regular;
            //* set text alignment to bottom right as well
            oddPageText.HAlign = HAlign.Right;
            oddPageText.VAlign = VAlign.Bottom;

            //* create pdf watermark element
            Pdf oddPagePdf = new Pdf();
            oddPagePdf.PdfData = File.ReadAllBytes(Application.StartupPath + "/SampleWatermarkFiles/Sample.pdf");
            oddPagePdf.HPosition = HPosition.Center;
            oddPagePdf.VPosition = VPosition.Middle;
            oddPagePdf.Transparency = "1";              // ** The actual PDF file is already transparent
            //* set background fill to transparent
            oddPagePdf.FillColor = "#00000000";
            //* get rid of lines
            oddPagePdf.LineWidth = "-1";

            //* Create QRCode object
            QRCode oddPageQRCode = new QRCode();
            //* Position it to the bottol left corner
            oddPageQRCode.HPosition = HPosition.Left;
            oddPageQRCode.VPosition = VPosition.Bottom;
            //* Set size
            oddPageQRCode.Width = "50";
            //* Set input mode and content
            oddPageQRCode.InputMode = BarcodeInputMode.Binary;
            oddPageQRCode.Text = "http://www.muhimbi.com/";
            
            //* create array of watermark elements
            Element[] oddPageWatermarkElements = new Element[] { oddPageText, oddPagePdf, oddPageQRCode };

            //* set elements of watermark
            oddPageWatermark.Elements = oddPageWatermarkElements;

            #endregion

            #region Simple watermark on even pages

            //* create watermark
            Watermark evenPageWatermark = new Watermark();
            //* setup watermark
            evenPageWatermark.HPosition = HPosition.Center;
            evenPageWatermark.VPosition = VPosition.Middle;
            evenPageWatermark.Width = "550";
            evenPageWatermark.Height = "800";
            evenPageWatermark.StartPage = 2;
            evenPageWatermark.EndPage = 0;
            evenPageWatermark.PageInterval = 2;
            evenPageWatermark.ZOrder = 100;

            //* create text watermark element
            Text evenPageText = new Text();
            evenPageText.HPosition = HPosition.Left;
            evenPageText.VPosition = VPosition.Bottom;
            evenPageText.Width = "200";
            evenPageText.Height = "20";
            evenPageText.HAlign = HAlign.Left;
            evenPageText.VAlign = VAlign.Bottom;
            evenPageText.Content = "Page {PAGE} of {NUMPAGES}";
            evenPageText.FillColor = "#ff0000ff";
            evenPageText.FontFamilyName = "Verdana";
            evenPageText.FontSize = "10";
            evenPageText.FontStyle = FontStyle.Regular;

            //* create image watermark element
            Image evenpageImage = new Image();
            evenpageImage.ImageData = File.ReadAllBytes(Application.StartupPath + "/SampleWatermarkFiles/Sample.png");
            evenpageImage.ScaleMode = ScaleMode.MaintainAspectRatio;
            evenpageImage.HPosition = HPosition.Center;
            evenpageImage.VPosition = VPosition.Middle;
            evenpageImage.Transparency = "0.1";
            evenpageImage.ZOrder = -1;
            evenpageImage.Rotation = "-60";
            evenpageImage.LineWidth = "0";
            evenpageImage.LineColor = "#ff000000";
            //* make background transparent
            evenpageImage.FillColor = "#00000000";

            //* put elements into watermark
            evenPageWatermark.Elements = new Element[] { evenPageText, evenpageImage };
                        
            #endregion

            //* return array of watermarks
            return new Watermark[] { oddPageWatermark, evenPageWatermark };
        }


        /// <summary>
        /// Open the troubleshooting guide.
        /// </summary>
        private void linkLabel_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            System.Diagnostics.Process.Start(@"http://support.muhimbi.com/entries/21275143-Validating-converters-and-troubleshooting-errors");
        }


        /// <summary>
        /// Open Knowledge Base article that explains how to use the diagnostics tool.
        /// </summary>
        private void linkLabelHowToUse_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            System.Diagnostics.Process.Start(@"http://support.muhimbi.com/entries/23246143-Using-the-Diagnostics-tool-to-troubleshoot-conversions");
        }


        /// <summary>
        /// Enable or disable the Group box that holds all settings related to post processing.
        /// </summary>
        /// <param name="sender">See MSDN Documentation.</param>
        /// <param name="e">See MSDN Documentation.</param>
        private void checkBoxPostProcessFile_CheckedChanged(object sender, EventArgs e)
        {
            groupBoxPostProcess.Enabled = checkBoxPostProcessFile.Checked;
        }


        /// <summary>
        /// Disable/enable other security option checkboxes
        /// </summary>
        /// <param name="sender">See MSDN Documentation.</param>
        /// <param name="e">See MSDN Documentation.</param>
        private void checkBoxDisableDocumentSecurity_CheckedChanged(object sender, EventArgs e)
        {
            bool securityEnabled = !checkBoxDisableDocumentSecurity.Checked;
            checkBoxDisableAnnotations.Enabled = securityEnabled;
            checkBoxDisableAccessibility.Enabled = securityEnabled;
            checkBoxDisableCopyContent.Enabled = securityEnabled;
            checkBoxDisableDocumentAssembly.Enabled = securityEnabled;
            checkBoxDisableFormFields.Enabled = securityEnabled;
            checkBoxDisableHighResolutionPrint.Enabled = securityEnabled;
            checkBoxDisablePrint.Enabled = securityEnabled;
            textBoxPDFOpenPassword.Enabled = securityEnabled;
            textBoxPDFOwnerPassword.Enabled = securityEnabled;
        }


        /// <summary>
        /// Enable or disable the Group box that holds all OCR settings.
        /// </summary>
        /// <param name="sender">See MSDN Documentation.</param>
        /// <param name="e">See MSDN Documentation.</param>
        private void performOCRCheckBox_CheckedChanged(object sender, EventArgs e)
        {
            groupBoxOCR.Enabled = checkBoxPerformOCR.Checked;
        }


        /// <summary>
        /// Parse the content of the specified regions.
        /// </summary>
        /// <remarks>
        /// Accepts the following input string:
        ///    x|y|w|h|pageRegion|startPage|endPage|pageInterval
        /// Where x,y,w,h are required and the rest is optional
        /// </remarks>
        /// <param name="p">String to parse.</param>
        /// <returns>Array of specified OCR Regions.</returns>
        private static OCRRegion[] GetRegions(string p)
        {
            string[] lines = p.Split(new string[] { "\r\n" }, StringSplitOptions.RemoveEmptyEntries);
            if (lines.Length == 0)
            {
                return null;
            }

            List<OCRRegion> regions = new List<OCRRegion>();
            foreach (string line in lines)
            {
                string[] elements = line.Split(new string[] { "|" }, StringSplitOptions.None);

                OCRRegion region = new OCRRegion()
                {
                    Id = elements[0],
                    X = elements[1],
                    Y = elements[2],
                    Width = elements[3],
                    Height = elements[4],
                };
                if (elements.Length > 5) region.PageRange = elements[5];
                if (elements.Length > 6) region.StartPage = int.Parse(elements[6]);
                if (elements.Length > 7) region.EndPage = int.Parse(elements[7]);
                if (elements.Length > 8) region.PageInterval = int.Parse(elements[8]);

                regions.Add(region);
            }

            return regions.ToArray();
        }

        /// <summary>
        /// Enable/Disable Table of Content page generation
        /// </summary>
        /// <param name="sender">See MSDN Documentation.</param>
        /// <param name="e">See MSDN Documentation.</param>
        private void checkBoxEnableToC_CheckedChanged(object sender, EventArgs e)
        {
            tocGroupBox.Enabled = checkBoxEnableToC.Checked;
        }

        /// <summary>
        /// Load Table of Content template from file
        /// </summary>
        /// <param name="sender">See MSDN Documentation.</param>
        /// <param name="e">See MSDN Documentation.</param>
        private void buttonLoadTocTemplate_Click(object sender, EventArgs e)
        {
            openFileDialog.FileName = string.Empty;
            if (openFileDialog.ShowDialog() == DialogResult.OK)
            {
                try
                {
                    textBoxToCTemplate.Text = File.ReadAllText(openFileDialog.FileName);
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.ToString());
                }
            }
        }

        /// <summary>
        /// Gets a byte array of a string like it was written into a 
        /// file with unicode encoding. It includes the BOM bytes at
        /// the beginning
        /// </summary>
        /// <param name="text">The string</param>
        /// <returns>Unicode encoded byte array with BOM</returns>
        protected byte[] GetUnicodeBytesWithBom(string text)
        {
            // Use BOM when encoding
            Encoding encodingWithBom = new UnicodeEncoding(false, true);

            // Concatenate BOM bytes with content bytes
            byte[] bom = encodingWithBom.GetPreamble();
            byte[] content = encodingWithBom.GetBytes(text);
            byte[] bytes = new byte[bom.Length + content.Length];
            Buffer.BlockCopy(bom, 0, bytes, 0, bom.Length);
            Buffer.BlockCopy(content, 0, bytes, bom.Length, content.Length);

            return bytes;
        }

        
    }
}
