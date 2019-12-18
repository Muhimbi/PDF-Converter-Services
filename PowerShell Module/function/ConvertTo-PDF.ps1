Function ConvertTo-PDF
{
    <#
    .SYNOPSIS
        Converting Office files to PDF Format using the Muhimbi Web Services based interface

    .DESCRIPTION
        Convert popular document types to PDF or XPS format with near perfect fidelity. Support is available for MS-Word, PowerPoint, Excel, InfoPath, Visio and MS-Publisher etc.
        For details about supported file formats see http://support.muhimbi.com/entries/21260133-what-file-formats-are-supported-for-conversion
        For details on Converting Office files to PDF Format using the Web Services based interface see http://blog.muhimbi.com/2009/12/converting-office-files-to-pdf-format.html
        You can find more details about the capabilities of the PDF Converter at http://support.muhimbi.com/entries/21251792-where-can-i-find-an-overview-of-the-capabilities-of-the-pdf-converter

    .EXAMPLE
        ConvertTo-PDF -FilePath C:\somefile.docx
    #>

    [CmdletBinding()]
    Param (
        [parameter(Mandatory = $true, helpmessage = 'Give me a path in format C:\Users\clavin.fernandes\Documents\somefile.docx')]
        [String]
        $FilePath
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