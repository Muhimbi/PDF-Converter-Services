# C# Sample Code
:exclamation:
This repository is a barebones sample implementation of Nutrient Document Converter Services (formerly Muhimbi PDF Converter Services), built purely with demo purposes in mind. This example has not been designed to run unmodified in production.

Details about using the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* from C# can be found below. Further information, including the object model, can be found [in the Developer Guide](http://www.muhimbi.com/support/documentation/PDF-Converter-Services/User---Developer-Guide.aspx) and in the [Muhimbi Knowledge Base](https://support.muhimbi.com/hc/en-us/sections/206267927-PDF-Converter-Web-Service-Interface).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>

## Table of contents

- [Prerequisites](#prerequisites)
- [Sample code](#sample-code)

<br/>

## Prerequisites

This sample code has been developed using Microsoft Visual Studio. Although it may work  when using different IDEs, we recommend using Visual Studio.

All samples work with .net 3.0 and newer. If you are a Windows developer, the appropriate .NET framework version is most likely already installed on your system. In case it is not, install it [as described here](https://msdn.microsoft.com/en-us/library/5a4x27ek(v=vs.110).aspx).

:exclamation:
Please make sure that a copy of the Muhimbi PDF Converter Services ([Download](http://www.muhimbi.com/Products/PDF-Converter-Services/Free-Trial.aspx)) is installed on at least one Windows Server in your environment. (Don't worry, it can be invoked from non-Windows platforms including Linux).
:exclamation:

<br/>

## Sample code

Sample code, and related files, for the various facilities provided by this service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the examples under the `Microsoft .Net` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the C# client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/Microsoft%20.NET`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `Microsoft .Net` folder.

<br/>

A full overview of the examples can be found below.

Sample								| Description
------------------------------------|---------------------------------------------------------
[Conversion](Conversion/)						| WinForms application to demonstrate and test various aspects of the PDF Converter.
[Convert PDF to PDF-A](Convert%20PDF%20to%20PDF-A)	| Convert a PDF document to PDF/A.
[Import PDF Forms Data](Import%20PDF%20Forms%20Data)	| Import PDF Forms Data.
[MS Office Watermarking](MS%20Office%20Watermarking)	| Add watermarks to MS Office documents (.docx, .xlsx or .pptx files).
[OCR PDF](OCR%20PDF/)								| Use Optical Character Recognition to convert a fax, scan or other image into a text PDF.
[OCR PDF (PrimeOCR)](OCR%20PDF%20(PrimeOCR)/)	| Use Optical Character Recognition using the 3rd part PrimeOCR engine.
[Split PDF](Split%20PDF/)							| Split a large PDF into smaller PDFs.
[Watermarking](Watermarking/)					| Add watermarks to a PDF file.

<br/>

Any questions? [Drop our friendly support desk a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>