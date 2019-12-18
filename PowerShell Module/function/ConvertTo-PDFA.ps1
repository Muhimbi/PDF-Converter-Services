Function ConvertTo-PDFA
{
    <#
    .SYNOPSIS
        The PowerShell sample provided in this section uses the Muhimbi PDF Converter Services to convert a PDF file to a PDF/A2b compliant file.

    .DESCRIPTION
        PDF/A is an ISO-standardized version of the Portable Document Format (PDF) specialized for use in the archiving and long-term preservation of electronic documents. 
        For background details about converting a file to PDF/A see http://blog.muhimbi.com/2011/09/converting-pdf-document-to-pdfa1b-using.html

    .EXAMPLE
        ConvertTo-PDFA -FilePath C:\samplefile.doc -PDFProfile PDF_A2B
    #>

    [CmdletBinding()]
    Param (
        [parameter(Mandatory = $true, helpmessage = 'Give me a path in format C:\Users\clavin.fernandes\Documents\somefile.pdf')]
        [String]
        $FilePath,

        [parameter(Mandatory = $true, helpmessage = 'Conformance levels and versions')]
        [ValidateSet("PDF_1_1", "PDF_1_2", "PDF_1_3", "PDF_1_4", "PDF_1_5", "PDF_1_6", "PDF_1_7", "PDF_A1B", "PDF_A2B", "PDF_A3B")]
        [String]
        $PdfProfile,

        [parameter(Mandatory = $false, helpmessage = 'Pass the generated PDF through the Post Processor to strip / embed fonts' + 
        'apply Fast Web View or convert to a different PDF Version. Setting this value is not needed to apply options specified in Viewer' +
        'Preferences. Setting this value to true requires a license for the PDF Converter Professional')]
        [Bool]
        $PostProcessFile = $true,

        [parameter(Mandatory = $false, helpmessage = 'Enable Fast Web View / Linearization to optimize the PDF for output on the web.' +
        '(Requires a Muhimbi PDF Converter Professional license)')]
        [Bool]
        $FastWebView = $false,

        [parameter(Mandatory = $false, helpmessage = 'Strip or Embed all fonts into the PDF. Certain licensed fonts may not allow embedding and will therefore not be embedded.' +
        '(Requires a Muhimbi PDF Converter Professional license)')]
        [Bool]
        $EmbedAllFonts = $true,

        [parameter(Mandatory = $false, helpmessage = 'Specify if font-subsetting is enabled or not. Font subsetting embeds only those characters that are used in a document, instead of the entire font.' +
        'This reduces the size of a PDF file that contains embedded fonts, but may make future content changes problematic')]
        [Bool]
        $SubsetFonts = $false
    )

    try
    {
        Add-Type -Path ".\Muhimbi.DocumentConverter.WebService.Client.dll"
        Add-Type -Path ".\Muhimbi.DocumentConverter.WebService.Data.dll"

        #** The URL where the Web Service is located. Amend host name if needed.
        [URI]$serviceUrl = "http://localhost:41734/Muhimbi.DocumentConverter.WebService/"

        #** Read the input file into a byte array.
        $sourceFile = [IO.File]::ReadAllBytes($FilePath)

        #** Set the absolute minimum open options
        $openOptions = New-Object "Muhimbi.DocumentConverter.WebService.Data.OpenOptions"
        $openOptions.OriginalFileName = [IO.Path]::GetFileName($FilePath)
        $openOptions.FileExtension    = [IO.Path]::GetExtension($FilePath)

        #** Set the absolute minimum conversion settings
        $conversionSettings = New-Object "Muhimbi.DocumentConverter.WebService.Data.ConversionSettings"
        $conversionSettings.Fidelity = [Muhimbi.DocumentConverter.WebService.Data.ConversionFidelities]::Full
        $conversionSettings.Quality  = [Muhimbi.DocumentConverter.WebService.Data.ConversionQuality]::OptimizeForPrint

        #** Set output to PDF/A
        $conversionSettings.PDFProfile = [Muhimbi.DocumentConverter.WebService.Data.PDFProfile]::$PdfProfile

        #** Specify output settings as we want to force post processing of files.
        $outputFormatSpecificSettings_PDF = New-Object "Muhimbi.DocumentConverter.WebService.Data.OutputFormatSpecificSettings_PDF"
        $outputFormatSpecificSettings_PDF.PostProcessFile = $PostProcessFile
        $outputFormatSpecificSettings_PDF.FastWebView     = $FastWebView
        $outputFormatSpecificSettings_PDF.EmbedAllFonts   = $EmbedAllFonts
        $outputFormatSpecificSettings_PDF.SubsetFonts     = $SubsetFonts

        #** Set output format specific settings
        $conversionSettings.OutputFormatSpecificSettings = $outputFormatSpecificSettings_PDF

        #** Use standard Windows Security.
        $binding = New-Object System.ServiceModel.BasicHttpBinding
        $binding.Security.Mode = [System.ServiceModel.BasicHttpSecurityMode]::TransportCredentialOnly
        $binding.Security.Transport.ClientCredentialType = [System.ServiceModel.HttpClientCredentialType]::Windows

        #** Increase the Timeout to deal with (very) long running requests.
        $binding.SendTimeout    = [System.TimeSpan]::FromMinutes(30)
        $binding.ReceiveTimeout = [System.TimeSpan]::FromMinutes(30)

        #** Set the maximum document size to 40MB. Include 1/3 Base 64 overhead
        $binding.MaxReceivedMessageSize              = 40 * 1024 * 1024 * 4 / 3
        $binding.ReaderQuotas.MaxArrayLength         = 40 * 1024 * 1024 * 4 / 3
        $binding.ReaderQuotas.MaxStringContentLength = 40 * 1024 * 1024 * 4 / 3

        #** Specify an identity (any identity) in order to get it past .net3.5 sp1
        $EPI = [System.ServiceModel.EndpointIdentity]::CreateUpnIdentity("unknown")
        $EPA = New-object -TypeName System.ServiceModel.EndpointAddress -ArgumentList $serviceUrl, $EPI

        #** Open the service and configure the bindings
        $client = New-Object -TypeName Muhimbi.DocumentConverter.WebService.Client.DocumentConverterService.DocumentConverterServiceClient -ArgumentList $binding, $EPA
        $client.Open()

        #** Carry out the conversion
        $converted = $client.Convert($sourceFile, $openOptions, $conversionSettings)

        #** Write the converted file back to the file system with a PDF extension.
        $directoryName = [System.IO.Path]::GetDirectoryName($FilePath)
        $fileNameWithoutExtension = [System.IO.Path]::GetFileNameWithoutExtension($FilePath)
        $outputExtension = $conversionSettings.Format
        $destinationPath = "$directoryName`\$fileNameWithoutExtension`.$outputExtension"
        [System.IO.File]::WriteAllBytes($destinationPath, $converted)
    }
    catch
    {
        $errorMessage = $_.Exception.message
        Write-Host $errorMessage -ForegroundColor Red -BackgroundColor White
    }
    finally
    {
        #** Close the client if exist
        if($client)
        {
            $client.Close()
        }
    }
}