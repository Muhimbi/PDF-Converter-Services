package com.muhimbi.app;

import com.muhimbi.ws.*;
import java.io.*;
import java.net.URL;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WsClient {

	private final static String DOCUMENTCONVERTERSERVICE_WSDL_LOCATION = 
				"http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl";

	private static ObjectFactory _objectFactory = new ObjectFactory();
	
	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out
						.println("Please specify one or more file names to convert and merge.");
			} else {
				System.out.println("Merging files");

				// ** Initialise Web Service
				DocumentConverterService_Service dcss = new DocumentConverterService_Service(
						new URL(DOCUMENTCONVERTERSERVICE_WSDL_LOCATION), 
						new QName("http://tempuri.org/", "DocumentConverterService"));
				DocumentConverterService dcs = dcss.getBasicHttpBindingDocumentConverterService();

				// ** Get the options for all files that need to be merged
				ProcessingOptions processingOptions = getProcessingOptions(args);

				// ** Carry out the merging (and converting if needed)
				BatchResults results = dcs.processBatch(processingOptions);

				// ** Get the content of the first file, which holds the merged file in the byte array
				byte[] convertedFile = results.getResults().getValue().getBatchResult().get(0).getFile().getValue();

				// ** Write converted file to file system
				writeFile(convertedFile, "merged.pdf");
				System.out.println("Files merged into 'merged.pdf'");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (DocumentConverterServiceProcessBatchWebServiceFaultExceptionFaultFaultMessage e) {
			printException(e.getFaultInfo());
		}
	}

	
	public static ProcessingOptions getProcessingOptions(String[] sourceFileNames) throws IOException
	{
		// ** Options and all settings for batch conversion
		ProcessingOptions processingOptions = new ProcessingOptions();

		// ** Specify the minimum level of merge settings, you can optionally add watermarks and security settings
		MergeSettings mergeSettings = new MergeSettings();
		mergeSettings.setBreakOnError(false);
		processingOptions.setMergeSettings(_objectFactory.createProcessingOptionsMergeSettings( mergeSettings ));

		// ** Create an array of files to merge
		ArrayOfSourceFile sourceFiles = new ArrayOfSourceFile();
		for(int i =0; i<sourceFileNames.length; i++)
		{
			SourceFile sourceFile = getSourceFile(sourceFileNames[i]);
			sourceFiles.getSourceFile().add(sourceFile);
		}
		
		processingOptions.setSourceFiles( _objectFactory.createProcessingOptionsSourceFiles(sourceFiles));
		return processingOptions;
	}
	
	
	public static SourceFile getSourceFile(String fileName) throws IOException
	{
		File file = new File(fileName);
		
		// ** Read the contents of the file
		System.out.println("- Reading: " + fileName);
		byte[] sourceFileContent = readFile(fileName);
		
		// ** Set the absolute minimum open options
		OpenOptions openOptions = getOpenOptions(getFileName(file), getFileExtension(file) );
		
		// ** Set the absolute minimum conversion settings.
		ConversionSettings conversionSettings = getConversionSettings();
		
		// ** Create merge settings for each file and set the name for the PDF bookmark
        FileMergeSettings fileMergeSettings = new FileMergeSettings();
        fileMergeSettings.setTopLevelBookmark( _objectFactory.createFileMergeSettingsTopLevelBookmark( file.getName() ));
		        
        // ** Create a source file object and return it
        SourceFile sourceFile = new SourceFile();
        sourceFile.setOpenOptions(_objectFactory.createSourceFileOpenOptions(openOptions));
        sourceFile.setConversionSettings(_objectFactory.createSourceFileConversionSettings(conversionSettings));
        sourceFile.setMergeSettings(_objectFactory.createSourceFileMergeSettings(fileMergeSettings));
        sourceFile.setFile(_objectFactory.createSourceFileFile(sourceFileContent));
		return sourceFile;
	}
	
	public static OpenOptions getOpenOptions(String fileName, String fileExtension) {
		OpenOptions openOptions = new OpenOptions();
		// ** Set the minimum required open options. Additional options are available
		openOptions.setOriginalFileName(_objectFactory.createOpenOptionsOriginalFileName(fileName));
		openOptions.setFileExtension(_objectFactory.createOpenOptionsFileExtension(fileExtension));
		return openOptions;
	}

	public static ConversionSettings getConversionSettings() {
		ConversionSettings conversionSettings = new ConversionSettings();
		// ** Set the minimum required conversion settings. Additional settings are available
		conversionSettings.setQuality(ConversionQuality.OPTIMIZE_FOR_PRINT);
		conversionSettings.setRange(ConversionRange.ALL_DOCUMENTS);
		conversionSettings.getFidelity().add("Full");
		conversionSettings.setFormat(OutputFormat.PDF);
		
		ConverterSpecificSettingsWordProcessing css = new ConverterSpecificSettingsWordProcessing();
		css.setRevisionsAndCommentsDisplayMode(RevisionsAndCommentsDisplayMode.FINAL_SHOWING_MARKUP);
		css.setRevisionsAndCommentsMarkupMode(RevisionsAndCommentsMarkupMode.BALLOON);
		//css.setProcessDocumentTemplate(true);
		conversionSettings.setConverterSpecificSettings(
				_objectFactory.createConverterSpecificSettings(css)
				);
		//conversionSettings.setConverterSpecificSettings(css);
		
		return conversionSettings;
	}
	
	public static String getFileName(File file) {
		String fileName = file.getName();
		return fileName;
	}

	public static String getFileExtension(File file) {
		String fileName = file.getName();
		return fileName.substring(fileName.lastIndexOf('.') + 1, fileName.length());
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
