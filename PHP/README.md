# PHP Sample Code
Details about using the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* from PHP can be found below. Further information, including the object model, can be found [in the Developer Guide](http://www.muhimbi.com/support/documentation/PDF-Converter-Services/User---Developer-Guide.aspx) and in the [Muhimbi Knowledge Base](https://support.muhimbi.com/hc/en-us/sections/206267927-PDF-Converter-Web-Service-Interface).

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>

## Table of Content
- [Prerequisites](#Prerequisites)
  - [Linux](#Linux)
  - [Windows](#Windows)
- [Sample Code](#Sample-Code)

<br/>

## Prerequisites
The prerequisites to access the PDF Converter from PHP are as follows:

* PHP 
* PHP SOAP libraries (See platform specific steps below)

Exact deployment and configuration steps for the various platforms vary slightly. The ones for Linux, tested with Ubuntu, and Windows are provided below.

<br/>

### Linux
Deployment of the prerequisites is straight-forward. Feel free to adjust the steps if you need to deploy a different PHP version.

On Ubuntu 14.04

```
sudo apt-get install php5
sudo apt-get install php-soap
```

On Ubuntu 16.04

```
sudo apt-get install php7.0-cli
sudo apt-get install php7.0-soap
```

On Ubuntu 18.04
```
sudo apt-get install php7.2-cli
sudo apt-get install php7.2-soap
```

Using the instructions listed above will setup everything. On systems with an existing PHP deployment, check out [this article](https://stackoverflow.com/questions/11391442/fatal-error-class-soapclient-not-found) if you run into any problems related to the SOAP libraries.

<br/>

### Windows

Please [download and install](http://windows.php.net/download) the appropriate PHP version. We recommend installing it in `c:\php`.

The PHP Soap libraries are enabled in the Windows PHP distribution and don't need to be installed separately. To troubleshoot SOAP related issues see [this article](https://stackoverflow.com/questions/29934167/set-up-php-soap-extension-in-windows).

<br/>

### Configure PHP (same for all platforms)

When dealing with document conversions and merge operations, the default values for `upload_max_filesize` and `post_max_size` may be too conservative and should be increased to a value that matches your requirements.

This can be achieved by updating, or adding, the following values in your `php.ini` (these values are already set to 50MB in the php.ini files that ship with our sample code):

```
upload_max_filesize = 50M
post_max_size = 50M
```

<br/>



## Sample Code

Sample code, and related files, for the various facilities provided by the service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the example under the `PHP` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the PHP client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/PHP`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `PHP` folder.

<br/>

A full overview of the examples can be found below.

Sample								| Description
------------------------------------|---------------------------------------------------------
[Convert](Convert/)						| Convert a single file to PDF or other [supported output format](https://support.muhimbi.com/hc/en-us/articles/228089047-What-file-formats-types-are-supported-for-conversion-). As part of this sample a watermark is applied to the PDF as well.

<br/>


Any questions? [Drop our friendly support desk a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>

