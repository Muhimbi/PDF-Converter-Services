# Convert using Axis
Sample code for using the *Muhimbi PDF Converter Services* with *Axis 2* can be found below.

<br/>

## Table of Content
- [Prerequisites](#Prerequisites)
  - [Prerequisites for Linux](#Prerequisites-for-Linux)
  - [Prerequisites for Windows](#Prerequisites-for-Windows)
- [Sample Code](#Sample-Code)
  - [Compiling and Running the Sample Code](#Compiling-and-Running-the-Sample-Code)

<br/>

## Prerequisites
Using the PDF Converter in combination with Java and Axis requires JDK 7 or later and the Axis2 engine for Web services. Exact deployment and configuration steps for the various platforms vary slightly.

<br/>

### Prerequisites for Linux
There are multiple options for compiling and executing Java code on Linux, the examples provided in this section have been tested with Ubuntu 18.0.4, OpenJDK 1.8.0.191 and Axis2 1.6.2.

```
sudo apt install openjdk-8-jdk-headless
```
Axis2 can be downloaded from the [Apache website](http://axis.apache.org/axis2/java/core/index.html). The below samples have been tested with version 1.6.2.

### Prerequisites for Windows
For Windows developers we recommend using [Oracle's official JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). The examples provided in this section have been tested on Windows with this JDK.
 Axis2 can be downloaded from the [Apache website](http://axis.apache.org/axis2/java/core/index.html). The below samples have been tested with version 1.6.2.

## Sample Code
Sample code, and related files, for the various facilities provided by the service can be found below. It is recommended to copy all samples to your local system using one of the following options:

- **Git:** Use the following command to clone the entire repository to your system. This will download all files associated with this repository, and is most likely overkill, but it is the only easy way to download files using Git. Once downloaded, you can find the examples under the `Java` folder.<br>
   
     `git clone https://github.com/Muhimbi/PDF-Converter-Services/`

- **SVN:** A common trick to download only part of a Git repository  is to use `svn`. Download only the Java client and sample code using the following command.<br>

     `svn export https://github.com/Muhimbi/PDF-Converter-Services/trunk/Java`

- **ZIP:** [Download](https://github.com/Muhimbi/PDF-Converter-Services/zipball/master/) a ZIP archive of the entire repository. Once downloaded, you can find the examples under the `Java` folder.
<br/>

### Compiling and Running the Sample Code
Although compiled binaries are supplied with the sample code it is recommended that they are modified and recompiled to suit your environment. Point 1. and 2. are optional and only needed if you wish to generate proxy classes yourself.

If the *Muhimbi PDF Converter Services* is installed on the local machine the sample code can be executed straight away by running the `run.sh` (for Linux) or the `run.bat` script file.
<BR/>
1. Edit the `GenerateJavaWSProxies.sh` (for Linux) or the `GenerateJavaWSProxies.bat` (for Windows) the `-uri` parameter points to the WSDL of the *Muhimbi PDF Converter Services*
2. Execute the `GenerateJavaWSProxies.sh` (for Linux) or the `GenerateJavaWSProxies.bat` (for Windows) script to generate proxy classes for the web service.
3. Modify the `src/com/muhimbi/app/WsClient.java` source file so the `DOCUMENTCONVERTERSERVICE_WSDL_LOCATION` constant points to the WSDL of the *Muhimbi PDF Converter Services*
4. Execute the `compile.sh` (for Linux) or the `compile.bat` (for Windows) script
5. Execute the `run.sh` (for Linux) or the `run.bat` (for Windows) script

<br/>