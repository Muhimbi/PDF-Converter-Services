using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.ServiceModel;
using Import_PDF_Forms_Data.ConversionService;

namespace Import_PDF_Forms_Data
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
                string dataFileName = null;
                if (args.Length == 0)
                {
                    string[] dataFiles = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.xfdf");
                    if (dataFiles.Length > 0)
                        dataFileName = dataFiles[0];
                    else
                    {
                        Console.WriteLine("Please specify a data document to import.");
                        Console.ReadKey();
                        return;
                    }
                }
                else
                    dataFileName = args[0];

                byte[] dataFile = File.ReadAllBytes(dataFileName);

                // ** Determine the template file and read it into a byte array.
                string templateFileName = null;
                if (args.Length < 2)
                {
                    string[] templateFiles = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.pdf");
                    if (templateFiles.Length > 0)
                        templateFileName = templateFiles[0];
                    else
                    {
                        Console.WriteLine("Please specify a template document to use.");
                        Console.ReadKey();
                        return;
                    }
                }
                else
                    templateFileName = args[1];

                byte[] templateFile = File.ReadAllBytes(templateFileName);

                // ** Open the service and configure the bindings
                client = OpenService(SERVICE_URL);

                //** Set the absolute minimum open options
                OpenOptions openOptions = new OpenOptions();
                openOptions.OriginalFileName = Path.GetFileName(dataFileName);
                openOptions.FileExtension = Path.GetExtension(dataFileName);

                // ** Create converter specific settings object and specify template data
                ConverterSpecificSettings_PdfFormsDataImporter pdfFormsDataImporterSettings = new ConverterSpecificSettings_PdfFormsDataImporter();
                pdfFormsDataImporterSettings.PdfTemplateData = templateFile;

                // ** Set the absolute minimum conversion settings. Also, use the converter specific settings defined above
                ConversionSettings conversionSettings = new ConversionSettings();
                conversionSettings.Format = OutputFormat.PDF;
                conversionSettings.Fidelity = ConversionFidelities.Full;
                conversionSettings.Quality = ConversionQuality.OptimizeForPrint;
                conversionSettings.ConverterSpecificSettings = pdfFormsDataImporterSettings;

                // ** Carry out the import.
                Console.WriteLine("Importing data file '" + Path.GetFileName(dataFileName) + 
                                  "' into template file '" + Path.GetFileName(templateFileName) + "'");
                byte[] convFile = client.Convert(dataFile, openOptions, conversionSettings);

                // ** Write the result back to the file system with a PDF extension.
                string destinationFileName = Path.GetDirectoryName(dataFileName) + @"\" +
                                             Path.GetFileNameWithoutExtension(dataFileName) +
                                             "." + conversionSettings.Format;
                using (FileStream fs = File.Create(destinationFileName))
                {
                    fs.Write(convFile, 0, convFile.Length);
                    fs.Close();
                }

                Console.WriteLine("Result saved to " + destinationFileName);

                // ** Open the generated PDF file in a PDF Reader
                Console.WriteLine("Launching file in PDF Reader");
                Process.Start(destinationFileName);
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
