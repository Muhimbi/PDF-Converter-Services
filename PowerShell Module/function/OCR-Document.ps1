Function OCR-Document
{
    <#
    .SYNOPSIS
        Converting scans and images to searchable PDFs using PowerShell and server side OCR

    .DESCRIPTION
        The Muhimbi PDF Converter comes with support for a number of OCR (Optical Character Recognition) related facilities including the ability to make image based PDFs (Scans, faxes) fully searchable and indexable. In addition it support a way to extract this text to allow information such as Invoice numbers, Purchase Order numbers or other identifiable information to be extracted and used as part of a larger software / workflow process.
        For details about the PDF Converter's OCR facilities, and how to use it from SharePoint Workflows as well as your own code, see http://support.muhimbi.com/entries/57393898-OCR-Facilities-provided-by-the-PDF-Converter

    .EXAMPLE
        OCR-Document -FilePath C:\Users\clavin.fernandes\Downloads\samplefile.jpg -OCRLanguage English
    #>

    [CmdletBinding()]
    Param (
        [parameter(Mandatory = $true, helpmessage = 'Give me a path in format C:\Users\clavin.fernandes\Documents\somefile.pdf')]
        [String]
        $FilePath,

        [parameter(Mandatory = $true, helpmessage = 'The language the source document is written in. It defaults to English, Arabic, Danish, German, English, Dutch, Finnish, French, Hebrew, Hungarian, Italian, Norwegian, Portuguese, Spanish, Swedish etc')]
        [ValidateSet("Arabic", "SimplifiedChinese", "TraditionalChinese", "Danish", "German", "English", "English_UK", "English_US", "Dutch", "Finnish", "French", "Hebrew", "Hungarian", "Italian", "Japanese", "Korean", "Norwegian", "Portuguese", "Russian", "Spanish", "Swedish")]
        [String]
        $OcrLanguage
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

        #** Set OCR settings
        $ocrSettings = New-Object "Muhimbi.DocumentConverter.WebService.Data.OCRSettings"
        $ocrSettings.Language    = $OcrLanguage
        $ocrSettings.Performance = [Muhimbi.DocumentConverter.WebService.Data.OCRPerformance]::Slow
        #$ocrSettings.WhiteList   = string.Empty
        #$ocrSettings.BlackList   = string.Empty

        $conversionSettings.OCRSettings = $OCRSettings

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