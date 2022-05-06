# .NET Core Sample Code
Details about using the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* from .NET CORE can be found below. Further information, including the object model, can be found [in the Developer Guide](http://www.muhimbi.com/support/documentation/PDF-Converter-Services/User---Developer-Guide.aspx) and in the [Muhimbi Knowledge Base](https://support.muhimbi.com/hc/en-us/sections/206267927-PDF-Converter-Web-Service-Interface).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>

## Table of Contents
- [Prerequisites](#Prerequisites)
  - [Linux](#Linux)
  - [Windows](#Windows)
- [Sample Code](#Sample-Code)

<br/>

## Prerequisites

These samples have been tested with .NET Core 2.2, and are expected to work on other .NET Core versions as well. Exact deployment and configuration steps for the various platforms vary slightly.

:exclamation:
Please make sure that a copy of the Muhimbi PDF Converter Services ([Download](http://www.muhimbi.com/Products/PDF-Converter-Services/Free-Trial.aspx)) is installed on at least one Windows Server in your environment. (Don't worry, it can be invoked from non-Windows platforms including Linux).
:exclamation:

<br/>

### Linux

Please visit Microsoft's site for [.NET Core](https://dotnet.microsoft.com/download/linux-package-manager/ubuntu18-04/sdk-current) for the latest SDK. Pick your distribution from the dropdown and follow the instructions.

<br/>

### Windows

For Windows developers visit Microsoft's site for [.NET Core](https://dotnet.microsoft.com/download) and download the installation package for the latest .NET Core SDK.

<br/>

## Sample Code

Sample code, and related files, for the various facilities provided by this service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the examples under the `Microsoft .Net` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the C# sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/Microsoft%20.NET%20Core`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `Microsoft .Net Core` folder.

<br/>

A full overview of the examples can be found below.

Sample								| Description
------------------------------------|---------------------------------------------------------
[Convert PDF to PDF-A](Convert%20PDF%20to%20PDF-A)		| Convert a PDF document to PDF/A.
[MS Office Watermarking](MS%20Office%20Watermarking)	| Add watermarks to an MS Office document (.docx, .xlsx or .pptx)
[OCR PDF](OCR%20PDF/)									| Use Optical Character Recognition to convert a fax, scan or other image into a text PDF.
[Split PDF](Split%20PDF/)								| Split a large PDF into smaller PDFs.
[Watermarking](Watermarking/)							| Add watermarks to a PDF file.
[Extract PDF Forms Data](Extract%20PDF%20Forms%20Data/)	| Extract AcroForms data from PDF document.
[Import PDF Forms Data](Import%20PDF%20Forms%20Data/)	| Import PDF Forms Data into PDF document.

<br/>

Any questions? [Drop our friendly support desk a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>