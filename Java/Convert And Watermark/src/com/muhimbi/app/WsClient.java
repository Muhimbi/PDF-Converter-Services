package com.muhimbi.app;

import com.muhimbi.ws.*;

import java.io.*;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WsClient {

	private final static String DOCUMENTCONVERTERSERVICE_WSDL_LOCATION = 
				"http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl";

	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out
						.println("Please specify a single file name on the command line.");

			} else {
				// ** Process command line parameters
				String sourceDocumentPath = args[0];
				File file = new File(sourceDocumentPath);
				String fileName = getFileName(file);
				String fileExt = getFileExtension(file);

				System.out.println("Converting file " + sourceDocumentPath);

				// ** Initialise Web Service
				DocumentConverterService_Service dcss = new DocumentConverterService_Service(
						new URL(DOCUMENTCONVERTERSERVICE_WSDL_LOCATION), 
						new QName("http://tempuri.org/", "DocumentConverterService"));
				DocumentConverterService dcs = dcss.getBasicHttpBindingDocumentConverterService();

				// ** Only call conversion if file extension is supported
				if (isFileExtensionSupported(fileExt, dcs)) {
					// ** Read source file from disk
					byte[] fileContent = readFile(sourceDocumentPath);

					// ** Converting the file
					OpenOptions openOptions = getOpenOptions(fileName, fileExt);
					ConversionSettings conversionSettings = getConversionSettings();
					byte[] convertedFile = dcs.convert(fileContent, openOptions, conversionSettings);

					// ** Writing converted file to file system
					String destinationDocumentPath = getPDFDocumentPath(file);
					writeFile(convertedFile, destinationDocumentPath);
					System.out.println("File converted sucessfully to " + destinationDocumentPath);

				} else {
					System.out.println("The file extension is not supported.");
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (DocumentConverterServiceGetConfigurationWebServiceFaultExceptionFaultFaultMessage e) {
			printException(e.getFaultInfo());
		} catch (DocumentConverterServiceConvertWebServiceFaultExceptionFaultFaultMessage e) {
			printException(e.getFaultInfo());
		}
	}

	public static OpenOptions getOpenOptions(String fileName, String fileExtension) {
		ObjectFactory objectFactory = new ObjectFactory();
		OpenOptions openOptions = new OpenOptions();
		// ** Set the minimum required open options. Additional options are available
		openOptions.setOriginalFileName(objectFactory.createOpenOptionsOriginalFileName(fileName));
		openOptions.setFileExtension(objectFactory.createOpenOptionsFileExtension(fileExtension));
		return openOptions;
	}

	public static ConversionSettings getConversionSettings() {
		ConversionSettings conversionSettings = new ConversionSettings();
		// ** Set the minimum required conversion settings. Additional settings are available
		conversionSettings.setQuality(ConversionQuality.OPTIMIZE_FOR_PRINT);
		conversionSettings.setRange(ConversionRange.ALL_DOCUMENTS);
		conversionSettings.getFidelity().add("Full");
		conversionSettings.setFormat(OutputFormat.PDF);
		conversionSettings.setWatermarks(getWatermarks());
		return conversionSettings;
	}

	public static JAXBElement<ArrayOfWatermark> getWatermarks()
	{
		ObjectFactory objectFactory = new ObjectFactory();
		ArrayOfWatermark watermarks = new ArrayOfWatermark();

    // ** Specify some of the default settings for properties
    Defaults wmDefaults = new Defaults();
    wmDefaults.setFillColor(objectFactory.createDefaultsFillColor("#FF0000"));
    wmDefaults.setFontFamilyName(objectFactory.createDefaultsFontFamilyName("Arial"));

    // ** 'Confidential' watermark for front page
    Watermark confidential = new Watermark();
    confidential.setDefaults(objectFactory.createContainerDefaults(wmDefaults));
    confidential.setStartPage(1);
    confidential.setEndPage(1);
    confidential.setRotation(objectFactory.createElementRotation("-15"));
    confidential.setWidth(objectFactory.createElementWidth("500"));
    confidential.setHeight(objectFactory.createElementHeight("250"));
    confidential.setHPosition(HPosition.CENTER);
    confidential.setVPosition(VPosition.ABSOLUTE);
    confidential.setY(objectFactory.createElementY("275"));
    confidential.setZOrder(-1);

    // ** Create a new Text element that goes inside the watermark
    Text cfText = new Text();
    cfText.setContent(objectFactory.createTextContent("Confidential - {DATE}"));
    cfText.setFontSize(objectFactory.createTextFontSize("40"));
    cfText.getFontStyle().add("Bold");
    cfText.getFontStyle().add("Italic");
    cfText.setWidth(objectFactory.createElementWidth("500"));
    cfText.setHeight(objectFactory.createElementHeight("250"));
    cfText.setTransparency(objectFactory.createElementTransparency("0.10"));

    // ** And add it to the list of watermark elements.
    ArrayOfElement cfElements = new ArrayOfElement();
    cfElements.getElement().add(cfText);
    confidential.setElements(objectFactory.createContainerElements(cfElements));

    // ** And add the watermark to the list of watermarks
    watermarks.getWatermark().add(confidential);

	  return objectFactory.createConversionSettingsWatermarks(watermarks);
	}
	
	public static String getFileName(File file) {
		String fileName = file.getName();
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}

	public static String getFileExtension(File file) {
		String fileName = file.getName();
		return fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length());
	}

	public static String getPDFDocumentPath(File file) {
		String fileName = getFileName(file);
		String folder = file.getParent();
		if (folder == null) {
			folder = new File(file.getAbsolutePath()).getParent();
		}
		return folder + File.separatorChar + fileName + '.'
				+ OutputFormat.PDF.value();
	}

	public static byte[] readFile(String filepath) throws IOException {
		File file = new File(filepath);
		InputStream is = new FileInputStream(file);
		long length = file.length();
		byte[] bytes = new byte[(int) length];

		int offset = 0;
		int numRead;
		while (offset < bytes.length
				&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}

		if (offset < bytes.length) {
			throw new IOException("Could not completely read file " + file.getName());
		}
		is.close();
		return bytes;
	}

	public static void writeFile(byte[] fileContent, String filepath)
			throws IOException {
		OutputStream os = new FileOutputStream(filepath);
		os.write(fileContent);
		os.close();
	}

	public static boolean isFileExtensionSupported(String extension, DocumentConverterService dcs)
		throws DocumentConverterServiceGetConfigurationWebServiceFaultExceptionFaultFaultMessage 
		{
			Configuration configuration = dcs.getConfiguration();
			final JAXBElement<ArrayOfConverterConfiguration> converters = configuration.getConverters();
			final ArrayOfConverterConfiguration ofConverterConfiguration = converters.getValue();
			final List<ConverterConfiguration> cList = ofConverterConfiguration.getConverterConfiguration();
	
			for (ConverterConfiguration cc : cList) {
				final List<String> supportedExtension = cc.getSupportedFileExtensions()
						.getValue().getString();
				if (supportedExtension.contains(extension)) {
					return true;
				}
		}

		return false;
	}

	public static void printException(WebServiceFaultException serviceFaultException) {
		System.out.println(serviceFaultException.getExceptionType());
		JAXBElement<ArrayOfstring> element = serviceFaultException.getExceptionDetails();
		ArrayOfstring value = element.getValue();
		for (String msg : value.getString()) {
			System.out.println(msg);
		}
	}

}
