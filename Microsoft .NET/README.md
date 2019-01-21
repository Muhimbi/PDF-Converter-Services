# C# Sample Code
Details about using the *Muhimbi PDF Converter Services Online* from .NET, specifically C#, can be found below.

<br/>

## Table of contents

- [Prerequisites](#prerequisites)
- [Sample code](#sample-code)

<br/>

## Prerequisites

Prerequisites for using the PDF Converter in combination with C# are as follows:

- .NET framework v4.0 and later

If you are a Windows developer, the appropriate .NET framework version is most likely already installed on your system. In case it is not, install it [as described here](https://msdn.microsoft.com/en-us/library/5a4x27ek(v=vs.110).aspx).

## Sample code

Sample code, and related files, for the various facilities provided by this service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the examples under the `Microsoft .Net` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the C# client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/Microsoft+.Net`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `Microsoft .Net` folder.

<br/>

A full overview of the examples can be found below.

Sample								| Description
------------------------------------|---------------------------------------------------------
[Conversion](Conversion/)						| WinForms application to demonstrate and test various aspects of the PDF Converter.
[Convert PDF to PDF-A](Convert+PDF+to+PDF-A)	| Convert a PDF document into PDF-A standard.
[OCR PDF](OCR+PDF/)								| Use OCR to extract text from a scan, fax or other image.
[OCR PDF (PrimeOCR)](OCR+PDF+%28PrimeOCR%29/)	| Use PrimeOCR to extract text from a scan, fax or other image.
[Split PDF](Split+PDF/)							| Split a large PDF into smaller PDFs.
[Watermarking](Watermarking/)					| Add watermarks to a PDF file.

<br/>