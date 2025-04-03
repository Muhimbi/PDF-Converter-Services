# Convert to PDF, and Watermark, using PHP
:exclamation:
This repository is a barebones sample implementation of Nutrient Document Converter Services (formerly Muhimbi PDF Converter Services), built purely with demo purposes in mind. This example has not been designed to run unmodified in production.

The PHP sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to convert (if needed) a file and apply PDF watermarks (a.k.a stamps). Additional sample code to convert, merge, watermark, secure and OCR files [can be found here](../).

For a backgrounder about how this works, how to generate your own PHP web service proxies, and other information related to invoking the PDF Converter from PHP, see [this blog post](http://blog.muhimbi.com/2013/02/converting-files-to-pdf-and-other.html).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.


<br/>


## Prerequisites
For an overview of the prerequisites for the various platforms, including software to install as well as how to download this sample code, see the [overview page for all PHP sample code](../).

<br/>


### Running the Sample

Make sure that the [prerequisites](#Prerequisites) are in place. 

There are many ways to execute PHP code, one can use PHP's internal web server, but naturally it will work equally well using Apache, IIS or any other PHP capable platform.

If the *Muhimbi PDF Converter Services* is installed on the same machine that is running this sample code, then the sample code can be used without change.

If the conversion service is installed on a remote machine, then please edit `convert.php` and change `$url` (currently on line 123) to use the remote machine name, or ip address, in stead of `localhost`.


In this example we use PHP's built-in web server.

1. Navigate (`cd`) to the folder holding the sample code.
2. Start PHP in stand alone mode, using the current folder and config file located in the same folder:

```
  php -S localhost:8080 -t . -c .
```


3. Point your browser of choice to the `http://localhost:8080/index.html` page. Choose a [supported file type](https://support.muhimbi.com/hc/en-us/articles/228089047-What-file-formats-types-are-supported-for-conversion-), select an output format that the input file can be converted to (start with the `PDF` option), and click the `Convert` button.

<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.

