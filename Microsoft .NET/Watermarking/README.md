# Apply rich watermarks to a PDF using C#
The C# sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to apply a watermark (a.k.a Stamping) to a PDF file. (It converts the input file to PDF first if needed.)

Specifically, a 'Confidential' watermark across the first page of the document, and page numbering on the remaining pages, using a differently aligned page number on odd and even pages. 

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


With the change made, press `CTRL+F5` to build and run the application. After a few seconds the watermarked PDF will be opened in your system's default PDF viewer. 

<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.