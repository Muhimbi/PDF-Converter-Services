# Carry out OCR using C# .NET Core and Muhimbi's built in OCR engine
The C# .NET Core sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to carry out Optical Character Recognition (OCR) on an image based source file (scan, fax, or other image).

The generated PDF contains all recognised text, which can be selected, copied or searched. 
 
For background details about applying Optical Character Recognition using C# (Full .NET Framework, but very similar to .NET Core), see [this Blog post](http://blog.muhimbi.com/2013/10/converting-scans-and-images-to.html).

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
