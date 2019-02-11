using ConversionService;
using System;
using System.IO;
using System.ServiceModel;

namespace Split_PDF
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
                    //** Delete any split files from a previous test run.
                    foreach (string file in Directory.GetFiles(Directory.GetCurrentDirectory(), "spf-*.pdf"))
                    {
                        File.Delete(file);
                    }

                    // ** If nothing is specified then read the first PDF file from the current folder.
                    string[] sourceFiles = Directory.GetFiles(Directory.GetCurrentDirectory(), "*.pdf");
                    if (sourceFiles.Length > 0)
                        sourceFileName = sourceFiles[0];
                    else
                    {
                        Console.WriteLine("Please specify a document to split.");
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
                openOptions.FileExtension = "pdf";

                // ** Set the absolute minimum conversion settings.
                ConversionSettings conversionSettings = new ConversionSettings();

                // ** Create the ProcessingOptions for the splitting task.
                ProcessingOptions processingOptions = new ProcessingOptions()
                {
                    MergeSettings = null,
                    SplitOptions = new FileSplitOptions()
                    {
                        FileNameTemplate = "spf-{0:D3}",
                        FileSplitType = FileSplitType.ByNumberOfPages,
                        BatchSize = 5,
                        BookmarkLevel = 0
                    },
                    SourceFiles = new SourceFile[1]
                    {
                        new SourceFile()
                        {
                            MergeSettings = null,
                            OpenOptions = openOptions,
                            ConversionSettings = conversionSettings,
                            File = sourceFile
                        }
                    }
                };
                
                // ** Carry out the splittng.
                Console.WriteLine("Splitting file " + sourceFileName);
                BatchResults batchResults = client.ProcessBatchAsync(processingOptions).GetAwaiter().GetResult();

                // ** Process the returned files
                foreach (BatchResult result in batchResults.Results)
                {
                    Console.WriteLine("Writing split file " + result.FileName);
                    File.WriteAllBytes(result.FileName, result.File);
                }

                Console.WriteLine("Finished.");
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
