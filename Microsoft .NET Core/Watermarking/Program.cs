using ConversionService;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;

namespace Watermarking
{
    class Program
    {
        // ** The URL where the Web Service is located. Amend host name if needed.
        static string SERVICE_URL = "http://localhost:41734/Muhimbi.DocumentConverter.WebService/";

        static void Main(string[] args)
        {
            DocumentConverterServiceClient client = null;

            try
            {
                // ** Determine the source file and read it into a byte array.
                string sourceFileName = null;
                if (args.Length == 0)
                {
                    string[] sourceFiles = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.doc*");
                    if (sourceFiles.Length > 0)
                        sourceFileName = sourceFiles[0];
                    else
                    {
                        Console.WriteLine("Please specify a document to convert and watermark.");
                        Console.ReadKey();
                        return;
                    }
                }
                else
                    sourceFileName = args[0];

                byte[] sourceFile = File.ReadAllBytes(sourceFileName);

                // ** Open the service and configure the bindings
                client = OpenService(SERVICE_URL);

                //** Set the absolute minimum open options
                OpenOptions openOptions = new OpenOptions();
                openOptions.OriginalFileName = Path.GetFileName(sourceFileName);
                openOptions.FileExtension = Path.GetExtension(sourceFileName);

                // ** Set the absolute minimum conversion settings.
                ConversionSettings conversionSettings = new ConversionSettings();
                conversionSettings.Fidelity = ConversionFidelities.Full;
                conversionSettings.Quality = ConversionQuality.OptimizeForPrint;

                // ** Get the list of watermarks to apply.
                conversionSettings.Watermarks = CreateWatermarks();

                // ** Carry out the conversion.
                Console.WriteLine("Converting file " + sourceFileName);
                byte[] convFile = client.ConvertAsync(sourceFile, openOptions, conversionSettings).GetAwaiter().GetResult();

                // ** Write the converted file back to the file system with a PDF extension.
                string destinationFileName = Path.Combine(Path.GetDirectoryName(sourceFileName),
                                             Path.GetFileNameWithoutExtension(sourceFileName) + "." + conversionSettings.Format);
                using (FileStream fs = File.Create(destinationFileName))
                {
                    fs.Write(convFile, 0, convFile.Length);
                    fs.Close();
                }

                Console.WriteLine("File converted to " + destinationFileName);
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
        }


        /// <summary>
        /// Create the watermarks.
        /// </summary>
        /// <returns>An array of watermarks to apply</returns>
        public static Watermark[] CreateWatermarks()
        {
            List<Watermark> watermarks = new List<Watermark>();

            // ** Specify the default settings for properties
            Defaults wmDefaults = new Defaults();
            wmDefaults.FillColor = "#000000";
            wmDefaults.LineColor = "#000000";
            wmDefaults.FontFamilyName = "Arial";
            wmDefaults.FontSize = "10";

            // **************** 'Confidential' Text ***************

            // ** 'Confidential' watermark for front page
            Watermark confidential = new Watermark();
            confidential.Defaults = wmDefaults;
            confidential.StartPage = 1;
            confidential.EndPage = 1;
            confidential.Rotation = "-45";
            confidential.Width = "500";
            confidential.Height = "500";
            confidential.HPosition = HPosition.Center;
            confidential.VPosition = VPosition.Middle;
            confidential.ZOrder = -1;

            // ** Create a new Text element that goes inside the watermark
            Text cfText = new Text();
            cfText.Content = "Confidential";
            cfText.FontSize = "40";
            cfText.FontStyle = FontStyle.Bold | FontStyle.Italic;
            cfText.Width = "500";
            cfText.Height = "500";
            cfText.Transparency = "0.10";

            // ** And add it to the list of watermark elements.
            confidential.Elements = new Element[] { cfText };

            // ** And add the watermark to the list of watermarks
            watermarks.Add(confidential);


            // **************** Watermark for Odd pages ***************

            Watermark oddPages = new Watermark();
            oddPages.Defaults = wmDefaults;
            oddPages.StartPage = 3;
            oddPages.PageInterval = 2;
            oddPages.Width = "600";
            oddPages.Height = "50";
            oddPages.HPosition = HPosition.Right;
            oddPages.VPosition = VPosition.Bottom;

            // ** Add a horizontal line
            Line line = new Line();
            line.X = "1";
            line.Y = "1";
            line.EndX = "600";
            line.EndY = "1";
            line.Width = "5";

            // ** Add a page counter
            Text oddText = new Text();
            oddText.Content = "Page: {PAGE} of {NUMPAGES}";
            oddText.Width = "100";
            oddText.Height = "20";
            oddText.X = "475";
            oddText.Y = "15";
            oddText.LineWidth = "-1";
            oddText.FontStyle = FontStyle.Regular;
            oddText.HAlign = HAlign.Right;

            // ** And add it to the list of watermark elements
            oddPages.Elements = new Element[] { line, oddText };

            // ** And add the watermark to the list of watermarks
            watermarks.Add(oddPages);

            // **************** Watermark for Even pages ***************

            Watermark evenPages = new Watermark();
            evenPages.Defaults = wmDefaults;
            evenPages.StartPage = 2;
            evenPages.PageInterval = 2;
            evenPages.Width = "600";
            evenPages.Height = "50";
            evenPages.HPosition = HPosition.Left;
            evenPages.VPosition = VPosition.Bottom;

            // ** No need to create an additional line,re-use the previous one

            // ** Add a page counter
            Text evenText = new Text();
            evenText.Content = "Page: {PAGE} of {NUMPAGES}";
            evenText.Width = "100";
            evenText.Height = "20";
            evenText.X = "25";
            evenText.Y = "15";
            evenText.LineWidth = "-1";
            evenText.FontStyle = FontStyle.Regular;
            evenText.HAlign = HAlign.Left;

            // ** And add it to the list of watermark elements
            evenPages.Elements = new Element[] { line, evenText };

            // ** And add the watermark to the list of watermarks
            watermarks.Add(evenPages);

            // **************** Watermark for all pages except first ***************

            Watermark contentPages = new Watermark();
            contentPages.Defaults = wmDefaults;
            contentPages.StartPage = 2;
            contentPages.Width = "200";
            contentPages.Height = "85";
            contentPages.HPosition = HPosition.Center;
            contentPages.VPosition = VPosition.Bottom;

            // ** Add a barcode
            LinearBarcode barcode = new LinearBarcode();
            barcode.Text = "012345678";
            barcode.BarcodeType = BarcodeType.Code39;
            // ** Change fill color to white because wmDefaults defines it as black
            barcode.FillColor = "#ffffff";
            barcode.LineColor = "#000000";
            barcode.Width = "200";
            barcode.Height = "50";
            barcode.HPosition = HPosition.Center;
            barcode.VPosition = VPosition.Top;

            // ** And add it to the list of watermark elements
            contentPages.Elements = new Element[] { barcode };

            // ** And add the watermark to the list of watermarks
            watermarks.Add(contentPages);

            return watermarks.ToArray();
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
                EndpointIdentity epi = new UpnEndpointIdentity("unknown");
                EndpointAddress epa = new EndpointAddress(new Uri(address), epi);

                client = new DocumentConverterServiceClient(binding, epa);

                client.OpenAsync().GetAwaiter().GetResult();

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
                client.CloseAsync().GetAwaiter().GetResult();
        }

    }
}
