# Ruby Sample Code
Details about using the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* from Ruby (on Rails) can be found here. Further information, including the object model, can be found [in the Developer Guide](http://www.muhimbi.com/support/documentation/PDF-Converter-Services/User---Developer-Guide.aspx) and in the [Muhimbi Knowledge Base](https://support.muhimbi.com/hc/en-us/sections/206267927-PDF-Converter-Web-Service-Interface).

A detailed blog post, including details about how to setup Ruby, including all prerequisites, can be found on our [Blog](http://blog.muhimbi.com/2013/03/use-ruby-on-rails-to-convert-merge-and.html).


<br/>

## Table of Contents
- [Prerequisites](#Prerequisites)
- [Sample Code](#Sample-Code)

<br/>


## Prerequisites

:exclamation:
Please make sure that a copy of the Muhimbi PDF Converter Services ([Download](http://www.muhimbi.com/Products/PDF-Converter-Services/Free-Trial.aspx)) is installed on at least one Windows Server in your environment. (Don't worry, it can be invoked from non-Windows platforms including Linux).
:exclamation:

Please make sure Ruby / Rails is installed on your system. Installation instructions for various Linux distributions, as well as Windows, [can be found here](https://gorails.com/setup).
 
<br/>



## Sample Code

Sample code, and related files, for the various facilities provided by the service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the examples under the `Ruby` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the Java client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/Ruby`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `Ruby` folder.

<br/>

A full overview can be found below.

Sample											| Description
------------------------------------------------|---------------------------------------------------------
[Convert](Convert/)			| Convert any of the [supported file types](https://support.muhimbi.com/hc/en-us/articles/228089047-What-file-formats-types-are-supported-for-conversion-) to PDF.

<br/>

Any questions? [Drop our friendly support desk a line](http://www.muhimbi.com/contact.aspx), we love to help.

<br/>