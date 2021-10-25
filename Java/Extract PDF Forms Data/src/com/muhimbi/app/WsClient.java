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
						.println("Please specify a single file name and output format on the command line.");

			} else {
				// ** Process command line parameters
				String sourceDocumentPath = args[0];
				// **  Specify FDF, XFDF or XML
				OutputFormat outputFormat = OutputFormat.valueOf(args[1].toUpperCase());
				File file = new File(sourceDocumentPath);
				String fileName = getFileName(file);
				String fileExt = getFileExtension(file);

				System.out.println("Extracting data from " + sourceDocumentPath);

				// ** Initialise Web Service
				DocumentConverterService_Service dcss = new DocumentConverterService_Service(
						new URL(DOCUMENTCONVERTERSERVICE_WSDL_LOCATION), 
						new QName("http://tempuri.org/", "DocumentConverterService"));
				DocumentConverterService dcs = dcss.getBasicHttpBindingDocumentConverterService();

				// ** Only call conversion if file extension is supported
				if (fileExt.toUpperCase().equals("PDF")) {
					// ** Read source file from disk
					byte[] fileContent = readFile(sourceDocumentPath);

					// ** Converting the file
					OpenOptions openOptions = getOpenOptions(fileName, fileExt);
					ConversionSettings conversionSettings = getConversionSettings(outputFormat);
					byte[] convertedFile = dcs.convert(fileContent, openOptions, conversionSettings);

					// ** Writing converted file to file system
					String destinationDocumentPath = getResultDocumentPath(file, outputFormat);
					writeFile(convertedFile, destinationDocumentPath);
					System.out.println("File converted sucessfully to " + destinationDocumentPath);

				} else {
					System.out.println("The file extension is not supported.");
				}
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

	public static ConversionSettings getConversionSettings(OutputFormat format) {

		ConversionSettings conversionSettings = new ConversionSettings();
		// ** Set the minimum required conversion settings. Additional settings are available
		conversionSettings.getFidelity().add("Full");
		conversionSettings.setFormat(format);
		
		return conversionSettings;
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
