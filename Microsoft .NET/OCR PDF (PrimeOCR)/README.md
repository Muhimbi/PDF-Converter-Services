# Carry out OCR using C# and the prime OCR engine

:exclamation: **This sample code will only work if you are licensed for the 3rd party Prime OCR product. For an example that uses Muhimbi's built in OCR engine, see [this post](../OCR%20PDF).**  :exclamation:


The C# sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to carry out Optical Character Recognition (OCR) on an image based source file (scan, fax, or other image).

The generated PDF contains all recognised text, which can be selected, copied or searched. A separate text file is created containing all the recognised text.

For background details about using 3rd party OCR engines in combination with the Muhimbi PDF Converter, see [this Blog post](http://blog.muhimbi.com/2017/07/utilise-3rd-party-ocr-engines-in.html).
 
Additional sample code to convert, merge, watermark, secure and OCR files [can be found here](../).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.


<br/>


## Prerequisites
For an overview of the prerequisites, including software to install as well as how to download this sample code, see the [overview page for all .NET sample code](../).

This particular example requires a 3rd party product, PrimeOCR, to be installed on the server running the Muhimbi Conversion Service.

<br/>


### Building and Running the Sample Code

Open the solution file in Visual Studio.

If the sample code is executed on the same server that runs the Muhimbi Conversion Service, then no changes are required.

If the conversion service is located on a different machine, then change the `SERVICE_URL` as defined in `program.cs`, and change `localhost` to the name or address of the server running the conversion service.


With the change made, press `CTRL+F5` to build and run the application. After a few seconds the processed file will be opened in your system's PDF reader, try to select some text.

 The file containing the recognised text will be opened as well in your system's text editor, most likely notepad. 

<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.