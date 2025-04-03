# Carry out OCR using C# and Muhimbi's built in OCR engine
:exclamation:
This repository is a barebones sample implementation of Nutrient Document Converter Services (formerly Muhimbi PDF Converter Services), built purely with demo purposes in mind. This example has not been designed to run unmodified in production.

The C# sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to carry out Optical Character Recognition (OCR) on an image based source file (scan, fax, or other image).

The generated PDF contains all recognised text, which can be selected, copied or searched. 
 
For background details about applying Optical Character Recognition using C#, see [this Blog post](http://blog.muhimbi.com/2013/10/converting-scans-and-images-to.html).

Additional sample code to convert, merge, watermark, secure and OCR files [can be found here](../).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.


<br/>


## Prerequisites
For an overview of the prerequisites, including software to install as well as how to download this sample code, see the [overview page for all .NET sample code](../).

<br/>


### Building and Running the Sample Code

Open the solution file in Visual Studio.

If the sample code is executed on the same server that runs the Muhimbi Conversion Service, then no changes are required.

If the conversion service is located on a different machine, then change the `SERVICE_URL` as defined in `program.cs`, and change `localhost` to the name or address of the server running the conversion service.


With the change made, press `CTRL+F5` to build and run the application. After a few seconds the processed file will be opened in your system's PDF reader, try to select some text.


<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.