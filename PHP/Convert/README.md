# PHP Sample Code
Details about using the *Muhimbi PDF Converter Services* from PHP can be found below.

<br/>

## Table of Content
- [Prerequisites](#Prerequisites)
  - [Linux](#Linux)
  - [Windows](#Windows)
- [Sample Code](#Sample-Code)
  - [Running the Sample Code](#Running-the-Sample-Code)

<br/>

## Prerequisites
The prerequisites to access the PDF Converter from PHP are as follows:

* PHP 5.4.0 and later
* PHP Curl libraries (See platform specific steps below)

Exact deployment and configuration steps for the various platforms vary slightly. The ones for Linux, tested with Ubuntu, and Windows are provided below.

<br/>

### Linux
Deployment of the prerequisites is straight-forward. Feel free to adjust the steps if you need to deploy a different PHP version, providing it is version 5.4.0 or later.

On Ubuntu 14.04

```
sudo apt-get install php5
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

Make sure that executing `phpinfo.php` shows the PHP informational page and in the SOAP section SOAP is enabled.

<br/>

### Windows

Please [download and install](http://windows.php.net/download) the appropriate PHP version. We recommend installing it in `c:\php`.

Make sure that executing `phpinfo.php` shows the PHP informational page and in the SOAP section SOAP is enabled.

<br/>

## Sample Code

Sample code, and related files, for the various facilities provided by the service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the example under the `PHP` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the PHP client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/PHP`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `PHP` folder.

<br/>

### Running the Sample

Make sure that the [prerequisites](#Prerequisites) in place. There are many ways to execute PHP code, one can use PHP's internal web server, but naturally it will work equally well using Apache, IIS or any other PHP capable platform.

Modify the `convert.php` file so it points to the installed instance of the *Muhimbi PDF Converter Services*.

In this example we use PHP's built in built-in web server so launch PHP with the following command:
```
php -S localhost:8080 -t some_path_to/PHP/Convert
```
You may want to change the port number and naturally you must specify the full path to the folder containing this sample.

 Point your browser of choice to the `http://localhost:8080/index.html` page. Choose a file, select an output format that the input file can be converted to (start with the `PDF` option) and click the `Convert` button.

<br/>