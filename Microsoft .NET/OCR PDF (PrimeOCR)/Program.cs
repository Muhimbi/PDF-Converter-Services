using System;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using OCR_PDF.ConversionService;

namespace OCR_PDF
{
    class Program
    {
        //** !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! **
        //** This code sample converts a file to an OCRed PDF and write the extracted   **
        //** text to a separate file.                                                   **
        //** This example sets the OCR Engine to the optional PrimeOCR product, but can **
        //** Easily be adapted to use the standard Muhimbi OCR engine. More at:         **
        //** http://blog.muhimbi.com/2013/09/ocr-facilities-provide-by-muhimbis.html    **
        //** !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! **

        // ** The URL where the Web Service is located. Amend host name if needed.
        static string SERVICE_URL = "http://localhost:41734/Muhimbi.DocumentConverter.WebService/";

        static void Main(string[] args)
        {
            DocumentConverterServiceClient client = null;

            try
            {
                // ** Delete any processed files from a previous run
                foreach (FileInfo f in new DirectoryInfo(".").GetFiles("*_ocr.pdf"))
                    f.Delete();

                // ** Determine the source file and read it into a byte array.
                string sourceFileName = null;
                if (args.Length == 0)
                {
                    // ** If nothing is specified then read the first PDF file from the current folder.
                    string[] sourceFiles = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.pdf");
                    if (sourceFiles.Length > 0)
                        sourceFileName = sourceFiles[0];
                    else
                    {
                        Console.WriteLine("Please specify a document to OCR.");
                        Console.ReadKey();
                        return;
                    }
                }
                else
                    sourceFileName = args[0];

                // ** Open the service and configure the bindings
                client = OpenService(SERVICE_URL);

                // ** Specify the various OCR related settings. 
                ProcessingOptions processingOptions = new ProcessingOptions()
                {
                    // ** Set up array of source files. For OCR we can pass in only a single file at a time.
                    SourceFiles = new SourceFile[]
                    {
                        new SourceFile()
                        {
                            // ** Set the binary content
                            File = File.ReadAllBytes(sourceFileName),
                            // ** Create absolute minimum OpenOptions
                            OpenOptions = new OpenOptions()
                            {
                                OriginalFileName = Path.GetFileName(sourceFileName),
                                FileExtension = Path.GetExtension(sourceFileName),
                            }
                        }
                    },
                    // ** Define OCR settings
                    OCRSettings = new OCRSettings()
                    {
                        // ** Select OCR engine, change this to 'Muhimbi' to use the default Muhimbi OCR engine.
                        OCREngine = "PrimeOCR",
                        // ** Set language, keep in mind that different OCR engines support different languages (e.g. in the Muhimbi OCR engine, use 'English', not 'English_UK' / 'English_US'
                        Language = OCRLanguage.English_UK.ToString(),
                        // ** Set the desired output, in this case we want the OCRed PDF and OCRed text to be returned separately.
                        OutputType = OCROutputType.Text | OCROutputType.PDF,
                        // ** Include PrimeOCR specific properties. These settings cannot be passed into the Muhimbi default OCR engine.
                        OCREngineSpecificSettings = new OCREngineSpecificSettings_PrimeOCR()
                        {
                            // ** Predefined accuracy levels can be used as well as manually defined integer values.
                            AccuracyLevel = (int)PrimeOCR_AccuracyLevel.Level6,
                            // ** Set various other parameters
                            AutoZone = PrimeOCR_AutoZone.NoAutoZone,
                            Deskew = PrimeOCR_Deskew.On,
                            ImageProcessingOptions = PrimeOCR_ImageProcessingOptions.Autorotate |
                                                     PrimeOCR_ImageProcessingOptions.Deshade |
                                                     PrimeOCR_ImageProcessingOptions.Despeck |
                                                     PrimeOCR_ImageProcessingOptions.Smooth,
                            LexicalChecking = PrimeOCR_LexicalChecking.Lexical,
                            PageQuality = PrimeOCR_PageQuality.NormalQuality,
                            PrintType = PrimeOCR_PrintType.Machine,
                            ZoneContent = PrimeOCR_ZoneContent.NoRestrictions
                        },
                    }
                };

                // ** Carry out the operation.
                Console.WriteLine("Processing file " + sourceFileName + ".");
                BatchResults results = client.ProcessBatch(processingOptions);

                // ** Get results. Both textual and PDF
                OCRResult ocredText = results.Results[0].OCRResult;
                byte[] ocredPdfFile = results.Results[0].File;

                // ** Process textual output
                if (ocredText != null)
                {
                    // ** Write the text into a txt file
                    string destFileName = Path.GetFileNameWithoutExtension(sourceFileName) + "_ocr.txt";
                    File.WriteAllText(destFileName, ocredText.Text);
                    Console.WriteLine("Text file written to " + destFileName);

                    // ** Show the file
                    Console.WriteLine("Launching text file in reader");
                    Process.Start(destFileName);
                }
                else
                {
                    Console.WriteLine("No text file was produced.");
                }

                // ** Process the resulting PDF
                if (ocredPdfFile != null)
                {
                    // ** Write the processed file back to the file system with a PDF extension.
                    string destFileName = Path.GetFileNameWithoutExtension(sourceFileName) + "_ocr.pdf";
                    File.WriteAllBytes(destFileName, ocredPdfFile);
                    Console.WriteLine("PDF file written to " + destFileName);

                    // ** Open the generated PDF file in a PDF Reader
                    Console.WriteLine("Launching file in PDF Reader");
                    Process.Start(destFileName);
                }
                else
                {
                    Console.WriteLine("No PDF file was generated.");
                }
            }
            catch (FaultException<WebServiceFaultException> ex)
            {
                Console.WriteLine("FaultException occurred: ExceptionType: " +
                                 ex.Detail.ExceptionType.ToString());
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            finally
            {
                CloseService(client);
            }
            Console.ReadKey();
        }


        /// <summary>
        /// Configure the Bindings, endpoints and open the service using the specified address.
        /// </summary>
        /// <returns>An instance of the Web Service.</returns>
        public static DocumentConverterServiceClient OpenService(string address)
        {
            DocumentConverterServiceClient client = null;

            try
            {
                BasicHttpBinding binding = new BasicHttpBinding();
                // ** Use standard Windows Security.
                binding.Security.Mode = BasicHttpSecurityMode.TransportCredentialOnly;
                binding.Security.Transport.ClientCredentialType =
                                                                HttpClientCredentialType.Windows;
                // ** Increase the client Timeout to deal with (very) long running requests.
                binding.SendTimeout = TimeSpan.FromMinutes(120);
                binding.ReceiveTimeout = TimeSpan.FromMinutes(120);
                // ** Set the maximum document size to 50MB
                binding.MaxReceivedMessageSize = 50 * 1024 * 1024;
                binding.ReaderQuotas.MaxArrayLength = 50 * 1024 * 1024;
                binding.ReaderQuotas.MaxStringContentLength = 50 * 1024 * 1024;

                // ** Specify an identity (any identity) in order to get it past .net3.5 sp1
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

    }
}
