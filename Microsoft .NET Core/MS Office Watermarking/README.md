# Apply rich watermarks to an MS Office document using C# .NET Core
:exclamation:
This repository is a barebones sample implementation of Nutrient Document Converter Services (formerly Muhimbi PDF Converter Services), built purely with demo purposes in mind. This example has not been designed to run unmodified in production.

The C# .NET Core sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to apply a watermark (a.k.a Stamping) to an MS Office document (.docx, .xlsx or .pptx files).

Specifically, a 'Confidential' watermark across the first page of the document, and page numbering on the remaining pages, using a differently aligned page number on odd and even pages.
 
For background details about applying watermarks to MS Office Files using C# (Full .NET Framework, but very similar to .NET Core), see [this Blog post](http://blog.muhimbi.com/2010/06/using-awesome-new-watermarking-features.html).

Additional sample code to convert, merge, watermark, secure and OCR files [can be found here](../).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.


<br/>


## Prerequisites
For an overview of the prerequisites, including software to install as well as how to download this sample code, see the [overview page for all .NET Core sample code](../).

<br/>


### Compiling and Running the Sample Code

If the *Muhimbi PDF Converter Services* is installed on the same machine that is running this sample code, it can be executed straight away by running the `run.sh` (for Linux) or the `run.bat` script file.

:exclamation:Don't forget to make the various .sh files executable using `chmod +x *.sh`:exclamation:

<br/>

If the Conversion Service is installed on a remote machine then 

1. Modify the `Program.cs` source file so the `SERVICE_URL` constant points to the *Muhimbi PDF Converter Services*
2. Execute the `run.sh` (for Linux) or the `run.bat` (for Windows) script

<br/>

If you ever wish to regenerate the web service proxy classes, e.g. to change the namespace then:

1. Edit the `GenerateWSProxies.sh` (for Linux) or the `GenerateWSProxies.bat` (for Windows) script and change `localhost` to the name or ip-address of the server running the Muhimbi Conversion Service.
2. Execute the `GenerateWSProxies.sh` (for Linux) or the `GenerateWSProxies.bat` (for Windows) script to generate proxy classes for the web service.

<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.
