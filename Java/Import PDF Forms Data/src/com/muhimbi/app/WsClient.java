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

	public static void main(String[] args){
		try {
			if (args.length != 2) {
				System.out
						.println("Please specify a data file name and a template file name on the command line.");

			} else {
				// ** Process command line parameters
				String dataFilePath = args[0];
				String templateFilePath = args[1];

				File dataFile = new File(dataFilePath);
				File templateFile = new File(templateFilePath);

				System.out.println("Importing data file '" + dataFilePath + "' into template file '" + templateFilePath + "'");

				OutputFormat outputFormat = OutputFormat.PDF;
				String dataFileName = getFileName(dataFile);
				String dataFileExt = getFileExtension(dataFile);

				// ** Initialise Web Service
				DocumentConverterService_Service dcss = new DocumentConverterService_Service(
						new URL(DOCUMENTCONVERTERSERVICE_WSDL_LOCATION), 
						new QName("http://tempuri.org/", "DocumentConverterService"));
				DocumentConverterService dcs = dcss.getBasicHttpBindingDocumentConverterService();

				// ** Read content of the files from disk
				byte[] dataFileContent = readFile(dataFilePath);
				byte[] templateFileContent = readFile(templateFilePath);

				// ** Converting the file
				OpenOptions openOptions = getOpenOptions(dataFileName, dataFileExt);
				ConverterSpecificSettings converterSpecificSetting = getConverterSpecificSettings(templateFileContent);
				ConversionSettings conversionSettings = getConversionSettings(outputFormat, converterSpecificSetting);
				byte[] convertedFile = dcs.convert(dataFileContent, openOptions, conversionSettings);

				// ** Writing converted file to file system
				String destinationDocumentPath = getResultDocumentPath(dataFile, outputFormat);
				writeFile(convertedFile, destinationDocumentPath);
				System.out.println("File converted sucessfully to " + destinationDocumentPath);

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (DocumentConverterServiceConvertWebServiceFaultExceptionFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	public static ConversionSettings getConversionSettings(OutputFormat format, ConverterSpecificSettings converterSpecificSettings) {
		ObjectFactory objectFactory = new ObjectFactory();
		ConversionSettings conversionSettings = new ConversionSettings();
		// ** Set the minimum required conversion settings. Additional settings are available
		conversionSettings.getFidelity().add("Full");
		conversionSettings.setFormat(format);
		// ** Use converter specific settings to supply template document content
		conversionSettings.setConverterSpecificSettings(objectFactory.createConversionSettingsConverterSpecificSettings(converterSpecificSettings));

		return conversionSettings;
	}

	public static ConverterSpecificSettings getConverterSpecificSettings(byte[] templateFileContent) {
		ObjectFactory objectFactory = new ObjectFactory();
		ConverterSpecificSettingsPdfFormsDataImporter converterSpecificSettings = new ConverterSpecificSettingsPdfFormsDataImporter();
		converterSpecificSettings.setPdfTemplateData(objectFactory.createConverterSpecificSettingsPdfFormsDataImporterPdfTemplateData(templateFileContent));

		return converterSpecificSettings;
	}

	public static String getFileName(File file) {
		String fileName = file.getName();
		return fileName.substring(0, fileName.lastIndexOf('.'));
	}

	public static String getFileExtension(File file) {
		String fileName = file.getName();
		return fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length());
	}

	public static String getResultDocumentPath(File file, OutputFormat format) {
		String fileName = getFileName(file);
		String folder = file.getParent();
		if (folder == null) {
			folder = new File(file.getAbsolutePath()).getParent();
		}
		return folder + File.separatorChar + fileName + '.'
				+ format.value();
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

	public static void printException(WebServiceFaultException serviceFaultException) {
		System.out.println(serviceFaultException.getExceptionType());
		JAXBElement<ArrayOfstring> element = serviceFaultException.getExceptionDetails();
		ArrayOfstring value = element.getValue();
		for (String msg : value.getString()) {
			System.out.println(msg);
		}
	}

}
