<?php
//  ********************************************************
//              Muhimbi Document Converter Service
//
//                 Copyright 2018, Muhimbi Ltd
//                       www.muhimbi.com
//
//                     All rights reserved
//
//       Filename: convert.php
//          To do: -
//   Known issues: -
//        History: 7 Feb 2013 - BM - Initial version
//                 9 Mar 2018 - JR - Refreshed proxies
//
//         Visit https://goo.gl/B5skSn for more details 
//
//  ********************************************************

// Include the generated proxy classes
require_once "documentConverterServices.php";

// ** Optional function to add test watermarks to the converted document
function createWatermarks(){
	try {
		$watermark = new Watermark(null, null, null, null, null);

		// ** Define the parent container for the watermark		
		$watermark->StartPage = 1; 
		$watermark->EndPage = 1; 
		$watermark->Rotation = "0"; 
		$watermark->Width = "500"; 
		$watermark->Height = "500"; 
		$watermark->HPosition = HPosition::Center; 
		$watermark->VPosition = VPosition::Middle; 
		// ** Display the watermark in the foreground so it is even displayed 
		// ** for scans with a white, non-transparent, background.
		$watermark->ZOrder = 1;
		
		// ** Create a simple text based watermark, this will be placed inside the parent container
		$cfText = new Text(null, null, null, null);
		$cfText->Content = "Confidential"; 
		$cfText->FontSize = "20"; 
		$cfText->Rotation = "-45"; 
		$cfText->HPosition = HPosition::Left; 
		$cfText->VPosition = VPosition::Middle; 
		$cfText->Width = "200"; 
		$cfText->Height = "200"; 
		$cfText->Transparency = "0.10";
		$cfText->ZOrder = 0.1;

		// ** Create a simple QR Code based watermark, this will also be placed in the parent container
		$cfQR = new QRCode(null, null, null);
		$cfQR->Text = "http://www.muhimbi.com/";
		$cfQR->ErrorCorrectionLevel = ErrorCorrectionLevel::Low;
		$cfQR->InputMode = BarcodeInputMode::Binary;
		$cfQR->Version = QRCodeVersion::Auto;
		$cfQR->HPosition = HPosition::Right; 
		$cfQR->VPosition = VPosition::Middle; 
		$cfQR->Width = "200"; 
		$cfQR->Height = "200"; 
		
		// ** Create a simple Linear Barcode watermark
		$cfLB = new LinearBarcode(null, null, null, null, null, null, null);
		$cfLB->Text = "012345678";
		$cfLB->BarcodeType = BarcodeType::Code39;
		$cfLB->HPosition = HPosition::Center; 
		$cfLB->VPosition = VPosition::Bottom; 
		$cfLB->Width = "200"; 
		$cfLB->Height = "50";
		
		// ** Add the individual watermarks to the container
		$elements = array($cfText, $cfQR, $cfLB);	
		$watermark->Elements = $elements;
		
		return array($watermark);
	} catch (Exception $e) 	{
		throw new Exception($e->getMessage());
	}	
	
}

// Check the uploaded file
if ($_FILES["file"]["error"] > 0)
{
	echo "Error uploading file: " . $_FILES["file"]["error"];
}
else 
{
	// Get the uploaded file content
	$sourceFile = file_get_contents($_FILES["file"]["tmp_name"]);
	
	// Create OpenOptions
	$openOptions = new OpenOptions(null, null, null);
	// set file name and extension
	$openOptions->FileExtension = pathinfo($_FILES["file"]["name"], PATHINFO_EXTENSION);
	$openOptions->OriginalFileName = $_FILES["file"]["name"];

	// Create conversionSettings
	$conversionSettings = new ConversionSettings(null, null, null, null, null, null, null, null, null, null);
	// Set the output format
	if(isset($_POST["outputFormat"]))
	{
		$conversionSettings->Format = $_POST["outputFormat"];
	} else {
		$conversionSettings->Format = "PDF";
	}
	// Always set fidelity
	$conversionSettings->Fidelity = ConversionFidelities::Full;
	// Optionally apply PDF Securty settings
    if($_POST["outputFormat"] === 'PDF') 
    {
	    $conversionSettings->OpenPassword="";
	    $conversionSettings->OwnerPassword="KJHbd!223$322";
        $conversionSettings->SecurityOptions = SecurityOptions::DisablePrint;
    }
	// Set some of the other conversion settings. Completely optional and just an example
	$conversionSettings->StartPage = 0;
	$conversionSettings->EndPage = 0;
	$conversionSettings->Range = ConversionRange::VisibleDocuments;
	$conversionSettings->Quality = ConversionQuality::OptimizeForPrint;
	$conversionSettings->PDFProfile = PDFProfile::PDF_1_5;
	$conversionSettings->GenerateBookmarks = BookmarkGenerationOption::Automatic;
	$conversionSettings->PageOrientation=PageOrientation::Both;
    // Add a test watermark, this is completely optional
    $conversionSettings->Watermarks = createWatermarks();

	// Create the Convert parameter that is send to the server
	$convert = new Convert($sourceFile, $openOptions, $conversionSettings);

	// create service client and point it to the correct Conversion Service
	$url = "http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl";
	$serviceClient = new DocumentConverterService(array(), $url);

	// If you are expecting long running operations then consider longer timeouts
	ini_set('default_socket_timeout', 60);
	
	try 
	{
		// Execute the web service call
		$result = $serviceClient->Convert($convert)->ConvertResult;
		// Send the resulting file to the client.
		header("Cache-Control: must-revalidate, post-check=0, pre-check=0");
		header("Content-type: application/octet-stream");
		header("Content-Disposition: attachment; filename=\"convert." . $conversionSettings->Format . "\"");
		echo $result;
	}
	catch (Exception $e) 
	{
		print "Error converting document: ".$e->getMessage();
	}	
}
?>