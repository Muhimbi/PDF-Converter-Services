Function Add-TextWatermark
{
    <#
    .SYNOPSIS
        Add Text watermark to PDF using the Muhimbi Web Services based interface

    .DESCRIPTION
        The text stored in WatermarkContent may contain embedded field codes such as the date or current page number. 
        For details on merging dynamic data into watermarks see http://blog.muhimbi.com/2011/04/merging-dynamic-data-into-watermarks.html 
        For details on how to apply watermarks from your own code using the web services interface see http://blog.muhimbi.com/2010/06/using-awesome-new-watermarking-features.html

    .EXAMPLE
        Add-TextWatermark -FilePath C:\samplefile.PDF -Watermarkcontent "Page: {PAGE} Clavin {NUMPAGES}" -FontFamilyName "Arial"  -HPosition Random -FontColor "#0000ff" -VPosition Random -FontStyle Bold -WatermarkWidth "500" -WatermarkHeight "500" -Rotation "0" -Transparency "1.0" -FontSize "40"
    #>

    [CmdletBinding()]
    Param (
        [Parameter(Mandatory = $true, helpmessage = 'Give me a path in format C:\Users\clavin.fernandes\Documents\somefile.pdf')]
        [String]
        $FilePath,

        [Parameter(Mandatory = $false, helpmessage = 'Number of the First Page that Watermark applies to')]
        [Int]
        $WatermarkStartPage,

        [Parameter(Mandatory = $false, helpmessage = 'Number of the Last Page that Watermark applies to')]
        [Int]
        $WatermarkEndPage,
            
        [Parameter(Mandatory = $true, helpmessage = 'Watermark Text')]
        [String]
        $WatermarkContent,

        [Parameter(Mandatory = $true, helpmessage = 'Name of the Font Family e.g. Arial, Time New Roman, Calibri')]
        [String]
        $FontFamilyName,

        [Parameter(Mandatory = $false, helpmessage = 'Size of Font in Points')]
        [String]
        $FontSize = '12',

        [Parameter(Mandatory = $false, helpmessage = 'Fill Color in RRGGBB notation')]
        [String]
        $FontColor = '#000000',

        [Parameter(Mandatory = $true, helpmessage = 'Horizontal Watermarking position on the Page')]
        [ValidateSet("Absolute", "Center", "Left", "Default", "Random", "Right")]
        [String]
        $HPosition,

        [Parameter(Mandatory = $true, helpmessage = 'Vertical Watermarking position on the Page')]
        [ValidateSet("Absolute", "Bottom", "Middle", "Default", "Random", "Top")]
        [String]
        $VPosition,

        [Parameter(Mandatory = $true, helpmessage = 'One or more styles Bold|Italic|Underline')]
        [ValidateSet("Bold", "Italic", "Underline", "Default", "Strickeout", "Regular")]
        [String]
        $FontStyle,

        [Parameter(Mandatory = $true, helpmessage = 'Width of the Watermark (in Pts, 1/72 of an inch')]
        [String]
        $WatermarkWidth,

        [Parameter(Mandatory = $true, helpmessage = 'Height of the Watermark (in Pts, 1/72 of an inch')]
        [String]
        $WatermarkHeight,

        [Parameter(Mandatory = $true, helpmessage = 'Angle of rotation')]
        [String]
        $Rotation,

        [Parameter(Mandatory = $true, helpmessage = 'Transparency in 0 to 1 (1 fully visible and 0.1 barely visible)')]
        [String]
        $Transparency
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

        #** Create watermarks to apply
        $conversionSettings.Watermarks = CreateWatermarks

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

        #** Carry out the watermarking
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

Function CreateWatermarks()
{
        #** Create the watermark
        $watermark = New-Object "Muhimbi.DocumentConverter.WebService.Data.Graphics.Watermark"
        $watermark.StartPage = $WatermarkStartPage
        $watermark.EndPage   = $WatermarkEndPage
        $watermark.Width     = $WatermarkWidth
        $watermark.Height    = $WatermarkHeight
        $watermark.Rotation  = $Rotation
        $watermark.HPosition = [Muhimbi.DocumentConverter.WebService.Data.Graphics.HPosition]::$HPosition
        $watermark.VPosition = [Muhimbi.DocumentConverter.WebService.Data.Graphics.VPosition]::$VPosition

        #** Create a new Text element that goes inside the watermark
        $textWatermark = New-Object "Muhimbi.DocumentConverter.WebService.Data.Graphics.Text"
        $textWatermark.FontFamilyName = $FontFamilyName
        $textWatermark.FillColor      = $FontColor
        $textWatermark.Content        = $WatermarkContent
        $textWatermark.FontSize       = $FontSize
        $textWatermark.FontStyle      = [Muhimbi.DocumentConverter.WebService.Data.Graphics.FontStyle]::$FontStyle
        $textWatermark.Width          = $WatermarkWidth
        $textWatermark.Height         = $WatermarkHeight
        $textWatermark.Transparency   = $Transparency

        #** And add it to the list of watermark's elements
        $watermark.Elements = @($textWatermark)

        #** And add the watermark to the list of watermarks
        $watermarkConfig = @($watermark)

        return $watermarkConfig 
}