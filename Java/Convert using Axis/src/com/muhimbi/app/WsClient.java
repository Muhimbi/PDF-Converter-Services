package com.muhimbi.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import com.muhimbi.ws.DocumentConverterServiceStub;
import com.muhimbi.ws.DocumentConverterServiceStub.Configuration;
import com.muhimbi.ws.DocumentConverterServiceStub.ConversionFidelities;
import com.muhimbi.ws.DocumentConverterServiceStub.ConversionFidelities_type0;
import com.muhimbi.ws.DocumentConverterServiceStub.ConversionQuality;
import com.muhimbi.ws.DocumentConverterServiceStub.ConversionRange;
import com.muhimbi.ws.DocumentConverterServiceStub.ConversionSettings;
import com.muhimbi.ws.DocumentConverterServiceStub.Convert;
import com.muhimbi.ws.DocumentConverterServiceStub.ConvertResponse;
import com.muhimbi.ws.DocumentConverterServiceStub.ConverterConfiguration;
import com.muhimbi.ws.DocumentConverterServiceStub.ConverterSpecificSettings_WordProcessing;
import com.muhimbi.ws.DocumentConverterServiceStub.GetConfiguration;
import com.muhimbi.ws.DocumentConverterServiceStub.OpenOptions;
import com.muhimbi.ws.DocumentConverterServiceStub.OutputFormat;
import com.muhimbi.ws.DocumentConverterServiceStub.RevisionsAndCommentsDisplayMode;
import com.muhimbi.ws.DocumentConverterServiceStub.RevisionsAndCommentsMarkupMode;
import com.muhimbi.ws.DocumentConverterService_Convert_WebServiceFaultExceptionFault_FaultMessage;
import com.muhimbi.ws.DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage;


public class WsClient {

	private final static String DOCUMENTCONVERTERSERVICE_WSDL_LOCATION = 
				"http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl";


		public static void main (String[] args) throws DocumentConverterService_Convert_WebServiceFaultExceptionFault_FaultMessage, IOException, DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage {
		if (args.length != 1) { 
			System.out.println("Please specify a single file name on the command line.");
		} else {
			String fileNameFull = args[0];
			String fileExt = fileNameFull.lastIndexOf(".") == -1 ? "" : fileNameFull.substring(fileNameFull.lastIndexOf(".") + 1);
			String fileName = fileNameFull.replace("." + fileExt, "");
			
			DocumentConverterServiceStub stub = new DocumentConverterServiceStub(DOCUMENTCONVERTERSERVICE_WSDL_LOCATION);
			
			// ** Is the file extension supported by the Converter?
			if (!"".equals(fileExt) && fileExtensionSupported(fileExt, stub)) {
        // ** Specify the minimum conversion settings
				ConversionSettings settings = new ConversionSettings();
				settings.setFormat(OutputFormat.PDF);
				settings.setQuality(ConversionQuality.OptimizeForPrint);
				settings.setRange(ConversionRange.VisibleDocuments);
		
        // ** Only send WordProcessing specific settings if the file is in MS-Word format. 
        // ** This is just an example to demonstrate the use of derived classes in Axis2.
				if ("doc".equalsIgnoreCase(fileExt) || "docx".equalsIgnoreCase(fileExt)) {
					ConverterSpecificSettings_WordProcessing csc = new ConverterSpecificSettings_WordProcessing(); 
					csc.setRevisionsAndCommentsDisplayMode(RevisionsAndCommentsDisplayMode.OriginalShowingMarkup);
					csc.setRevisionsAndCommentsMarkupMode(RevisionsAndCommentsMarkupMode.Balloon);
					csc.setProcessDocumentTemplate(false);
					settings.setConverterSpecificSettings(csc);
				}
		
				ConversionFidelities fi = new ConversionFidelities();
				fi.setConversionFidelities_type0(new ConversionFidelities_type0[] {ConversionFidelities_type0.Full});
				settings.setFidelity(fi);
		
        // ** Set the minimum open options
				OpenOptions oo = new OpenOptions();
				oo.setFileExtension(fileExt);
				
				Convert con = new Convert();
				// ** Read the contents of the file to convert into a byte array.
				con.setSourceFile(new DataHandler(new FileDataSource(fileNameFull)));
				con.setConversionSettings(settings);
				con.setOpenOptions(oo);
		
        // ** Carry out the conversion and save the results.
				ConvertResponse res = stub.convert(con);
				saveResult(res.getConvertResult().getInputStream(), fileName + ".pdf");
			} else {
				System.out.println("File extension not supported or not specified.");
			}
		}
	}

	private static void saveResult(InputStream in, String file) throws IOException {
		FileOutputStream out = new FileOutputStream(file);
		
		int i = 0;		
		while ((i=in.read()) != -1) {
			out.write(i);
		}
		out.flush();
		out.close();
		in.close();
	}

	private static boolean fileExtensionSupported(String fileExt, DocumentConverterServiceStub stub) throws RemoteException, DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage {
		Configuration configuration = stub.getConfiguration(new GetConfiguration()).getGetConfigurationResult(); 
	  ConverterConfiguration[] converters = configuration.getConverters().getConverterConfiguration(); 
	  
	    for (ConverterConfiguration cc : converters) { 
	    	List<String> supportedExtension = Arrays.asList(cc.getSupportedFileExtensions().getString()); 
	        if (supportedExtension.contains(fileExt)) { 
	          return true; 
	        }
	    }
	    return false;
	}
}