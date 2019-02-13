# Split a PDF into smaller files using C# .NET Core
The C# .NET Core sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to split up a single PDF file into multiple smaller PDF files (In this example containing 5 pages each).

Additional sample code to convert, merge, watermark, secure and OCR files [can be found here](../).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.


<br/>


## Prerequisites
For an overview of the prerequisites, including software to install as well as how to download this sample code, see the [overview page for all .NET Core sample code](../).

<br/>


### Compiling and Running the Sample Code

If the *Muhimbi PDF Converter Services* is installed on the same machine that is running this sample code, it can be executed straight away by running the `run.sh` (for Linux) or the `run.bat` script file.

:exclamation:Don't forget to make the various .sh files executable using `chmod +x *.sh`:exclamation:

1. Edit the `GenerateWSProxies.sh` (for Linux) or the `GenerateWSProxies.bat` (for Windows) script and change `localhost` to the name or ip-address of the server running the Muhimbi Conversion Service.
2. Execute the `GenerateWSProxies.sh` (for Linux) or the `GenerateWSProxies.bat` (for Windows) script to generate proxy classes for the web service.
3. Modify the `Program.cs` source file so the `SERVICE_URL` constant points to the *Muhimbi PDF Converter Services*
4. Execute the `run.sh` (for Linux) or the `run.bat` (for Windows) script

If you wish to build the application without executing it start the `build.sh` (for Linux) or the `build.bat` (for Windows) script

<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.
