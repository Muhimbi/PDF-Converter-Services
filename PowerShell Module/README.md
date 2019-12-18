## Muhimbi Converter Service PowerShell Module

Details about using and installing the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* PowerShell Module can be found below. 

The PowerShell samples do not use PowerShell's built in web services facilities (New-WebServiceProxy), as that makes things very difficult when dealing with complex web services such as the one exposed by the Muhimbi PDF Converter.

Instead the sample uses the pre-generated proxy DLLs that ship alongside our software. They can be found in the folder where the Conversion Service has been deployed to (See the Muhimbi Document Converter/Open Installation Folder shortcut in the Windows start menu). 

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.

## Table of contents

* [Prerequisites](#prerequisites)
* [Install](#Install)
* [Get Started](#GetStarted)
    * [List commands of the module](#ListCmds)
    * [Available cmdlets](#AvailableCmds)
* [How to use it](#HowToUseIt)
     * [Example](#Examples)
* [Resources](#Resources)

## Prerequisites

:exclamation:
Please make sure that a copy of the Muhimbi PDF Converter Services ([Download](http://www.muhimbi.com/Products/PDF-Converter-Services/Free-Trial.aspx)) is installed on at least one Windows Server in your environment.
:exclamation:

## Install

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the examples under the `Microsoft .Net` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository is to use `svn`. Download only the C# client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `PowerShell` folder.

<br/>

<a id="Install"></a> 
Open PowerShell as Administrator Navigate to Folder that contains the Download location for the file and Import the module.

```powershell
Install-Module .\MuhimbiPS_module
```

## Get Started
<a id="GetStarted"></a> 

### List commands of the module
<a id="ListCmds"></a> 

```powershell
Get-Command -Module MuhimbiPS_module
```
### Available cmdlets
<a id="AvailableCmds"></a> 

|Functions | Descriptions |
------------------------------------|---------------------------------------------------------
| ConvertTo-PDF | Converts Office files to PDF Format using a Muhimbi Web Services based interface |
| Add-TextWatermark |Add Text watermark to PDF using a Muhimbi Web Services based interface|
| OCR-Document |Converting scans and images to searchable PDFs using PowerShell and server side OCR|
| ConvertTo-PDFA |Convert a PDF File to a PDF/A compliant file|


## How to use it
<a id="HowToUseIt"></a> 

### ConvertTo-PDF 

Converts Office files to PDF Format using a Muhimbi Web Services based interface

The following command line allows the conversion of a document to PDF:
```powershell
ConvertTo-PDF -FilePath C:\Users\clavin.fernandes\Desktop\somefile.docx
```

### Add-TextWatermark 

```powershell
Add-TextWatermark -FilePath C:\Users\clavin.fernandes\Desktop\somefile.PDF -Watermarkcontent "confidential" -FontFamilyName "Arial"  -HPosition Random -FontColor "#0000ff" -VPosition Random -FontStyle Bold -WatermarkWidth "500" -WatermarkHeight "500" -Rotation "-45" -Transparency "1.0" -FontSize "40"
```

### OCR-Document

```powershell
OCR-Document -FilePath C:\Users\clavin.fernandes\Downloads\somefile.jpg -OCRLanguage English
```

### ConvertTo-PDFA

```powershell
ConvertTo-PDFA -FilePath C:\Users\clavin.fernandes\Downloads\somefile.doc -PDFProfile PDF_A2B
```

## Resources
<a id="Resources"></a>

 Further information, including the object model, can be found [in the Developer Guide](http://www.muhimbi.com/support/documentation/PDF-Converter-Services/User---Developer-Guide.aspx) and in the [Muhimbi Knowledge Base](https://support.muhimbi.com/hc/en-us/sections/206267927-PDF-Converter-Web-Service-Interface).
