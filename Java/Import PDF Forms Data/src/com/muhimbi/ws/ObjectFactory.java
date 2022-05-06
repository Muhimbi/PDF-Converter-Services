
package com.muhimbi.ws;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.muhimbi.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Watermark_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Watermark");
    private final static QName _RegionText_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "RegionText");
    private final static QName _ArrayOfElement_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "ArrayOfElement");
    private final static QName _ArrayOfWatermark_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "ArrayOfWatermark");
    private final static QName _DiagnosticResultItem_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "DiagnosticResultItem");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _MSGBestBodyMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MSGBestBodyMode");
    private final static QName _LinearBarcode_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "LinearBarcode");
    private final static QName _FileMergeSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "FileMergeSettings");
    private final static QName _PropertyCategories_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PropertyCategories");
    private final static QName _PDFViewerPreferences_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "PDFViewerPreferences");
    private final static QName _ArrayOfanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _RevisionsAndCommentsDisplayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "RevisionsAndCommentsDisplayMode");
    private final static QName _PresentationsPrintOutputType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PresentationsPrintOutputType");
    private final static QName _OutputFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "OutputFormat");
    private final static QName _BarcodeTextLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "BarcodeTextLocation");
    private final static QName _BookmarkOptionsWordProcessing_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "BookmarkOptions_WordProcessing");
    private final static QName _OCRSettings_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "OCRSettings");
    private final static QName _PDFPageScalingMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PDFPageScalingMode");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _GetDocumentPropertiesResult_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "GetDocumentPropertiesResult");
    private final static QName _ScaleMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "ScaleMode");
    private final static QName _NameValuePair_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "NameValuePair");
    private final static QName _ContentScale_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "ContentScale");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ConverterConfiguration_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ConverterConfiguration");
    private final static QName _ArrayOfDiagnosticRequestItem_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfDiagnosticRequestItem");
    private final static QName _Status_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "Status");
    private final static QName _ConverterSpecificSettingsTIFF_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_TIFF");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Pdf_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Pdf");
    private final static QName _PrimeOCRAutoZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_AutoZone");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _HTMLRenderingEngine_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "HTMLRenderingEngine");
    private final static QName _GetDocumentPropertiesRequest_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "GetDocumentPropertiesRequest");
    private final static QName _DocumentProperty_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "DocumentProperty");
    private final static QName _Element_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Element");
    private final static QName _ArrayOfDiagnosticResultItem_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfDiagnosticResultItem");
    private final static QName _MSGEmailAddressDisplayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MSGEmailAddressDisplayMode");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _NamedDestinationProcessingMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "NamedDestinationProcessingMode");
    private final static QName _Ellipse_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Ellipse");
    private final static QName _ConversionQuality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "ConversionQuality");
    private final static QName _SubscriptionSettings_QNAME = new QName("http://types.muhimbi.com/2015/04/13", "SubscriptionSettings");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ArrayOfInfoPathView_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ArrayOfInfoPathView");
    private final static QName _PrimeOCRZoneContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_ZoneContent");
    private final static QName _SecurityOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "SecurityOptions");
    private final static QName _StatusResultItem_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "StatusResultItem");
    private final static QName _OpenOptions_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OpenOptions");
    private final static QName _ProcessingOptions_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ProcessingOptions");
    private final static QName _MergeMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MergeMode");
    private final static QName _ConverterSpecificSettingsPdfFormsDataImporter_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "ConverterSpecificSettings_PdfFormsDataImporter");
    private final static QName _ConversionRange_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "ConversionRange");
    private final static QName _TOCSettings_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "TOCSettings");
    private final static QName _WordWrap_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "WordWrap");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfConverterConfiguration_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfConverterConfiguration");
    private final static QName _WebServiceFaultException_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "WebServiceFaultException");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ArrayOfCadConversionElement_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ArrayOfCadConversionElement");
    private final static QName _MSGEmbeddedObjectDisplayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MSGEmbeddedObjectDisplayMode");
    private final static QName _WebServiceExceptionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "WebServiceExceptionType");
    private final static QName _OCRPerformance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "OCRPerformance");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ConverterSpecificSettingsHTML_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_HTML");
    private final static QName _ConversionSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ConversionSettings");
    private final static QName _ConverterSpecificSettingsPDF_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "ConverterSpecificSettings_PDF");
    private final static QName _BatchResult_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "BatchResult");
    private final static QName _HTMLScaleMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "HTMLScaleMode");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _DocumentArrayProperty_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "DocumentArrayProperty");
    private final static QName _Diagnostics_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Diagnostics");
    private final static QName _DocumentStartPage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "DocumentStartPage");
    private final static QName _Container_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Container");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _SystemSettings_QNAME = new QName("http://types.muhimbi.com/2014/02/06", "SystemSettings");
    private final static QName _HPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "HPosition");
    private final static QName _BarcodeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "BarcodeType");
    private final static QName _SourceFile_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SourceFile");
    private final static QName _CadLayoutSortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "CadLayoutSortOrder");
    private final static QName _CadEmptyLayoutDetectionMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "CadEmptyLayoutDetectionMode");
    private final static QName _TaskMonitorSettings_QNAME = new QName("http://types.muhimbi.com/2014/02/06", "TaskMonitorSettings");
    private final static QName _HAlign_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "HAlign");
    private final static QName _PrimeOCRLexicalChecking_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_LexicalChecking");
    private final static QName _ConverterSpecificSettingsPresentations_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_Presentations");
    private final static QName _FileSplitType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "FileSplitType");
    private final static QName _ArrayOfStatusRequestItem_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "ArrayOfStatusRequestItem");
    private final static QName _ArrayOfDocumentPropertySetting_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfDocumentPropertySetting");
    private final static QName _RevisionsAndCommentsMarkupMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "RevisionsAndCommentsMarkupMode");
    private final static QName _ArrayOfBookmarkMapping_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ArrayOfBookmarkMapping");
    private final static QName _ConverterSpecificSettingsMSG_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_MSG");
    private final static QName _OperationTypeConfiguration_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "OperationTypeConfiguration");
    private final static QName _ArrayOfOCRRegion_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "ArrayOfOCRRegion");
    private final static QName _VAlign_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "VAlign");
    private final static QName _BatchResults_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "BatchResults");
    private final static QName _ConverterSpecificSettingsSpreadsheets_QNAME = new QName("http://types.muhimbi.com/2014/02/06", "ConverterSpecificSettings_Spreadsheets");
    private final static QName _OCRResult_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "OCRResult");
    private final static QName _CadConversionElement_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "CadConversionElement");
    private final static QName _QRCode_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "QRCode");
    private final static QName _OCREngineSpecificSettingsPrimeOCR_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "OCREngineSpecificSettings_PrimeOCR");
    private final static QName _ConverterSpecificSettingsInfoPath_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_InfoPath");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _BookmarkOptions_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "BookmarkOptions");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _OCROutputType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "OCROutputType");
    private final static QName _Text_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Text");
    private final static QName _ConverterSpecificSettingsCommandLineConverter_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_CommandLineConverter");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ConversionFidelities_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "ConversionFidelities");
    private final static QName _MSGPlainTextLineBreaks_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MSGPlainTextLineBreaks");
    private final static QName _ArrayOfBatchResult_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfBatchResult");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ConverterSpecificSettingsWordProcessing_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_WordProcessing");
    private final static QName _DiagnosticRequestItem_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "DiagnosticRequestItem");
    private final static QName _OCRRegion_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "OCRRegion");
    private final static QName _OCREngineSpecificSettings_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "OCREngineSpecificSettings");
    private final static QName _PrimeOCRPageQuality_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_PageQuality");
    private final static QName _OperationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "OperationStatus");
    private final static QName _PrimeOCRAccuracyLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_AccuracyLevel");
    private final static QName _ArrayOfSourceFile_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfSourceFile");
    private final static QName _ConverterSpecificSettings_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings");
    private final static QName _EnumsProxy_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "EnumsProxy");
    private final static QName _Configuration_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Configuration");
    private final static QName _MSGEmbeddedObjectIconDisplayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MSGEmbeddedObjectIconDisplayMode");
    private final static QName _MacroSecurityOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MacroSecurityOption");
    private final static QName _MergeSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "MergeSettings");
    private final static QName _OutputFormatSpecificSettings_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "OutputFormatSpecificSettings");
    private final static QName _ForceMessageHeaderEncoding_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "ForceMessageHeaderEncoding");
    private final static QName _VPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "VPosition");
    private final static QName _Rtf_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Rtf");
    private final static QName _StatusRequestItem_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "StatusRequestItem");
    private final static QName _PDFNavigationPane_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PDFNavigationPane");
    private final static QName _PrimeOCRDeskew_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_Deskew");
    private final static QName _WordBuiltInProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "WordBuiltInProperties");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _BookmarkGenerationOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "BookmarkGenerationOption");
    private final static QName _OperationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "OperationType");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _TOCLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "TOCLocation");
    private final static QName _StatusRequest_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "StatusRequest");
    private final static QName _QRCodeVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "QRCodeVersion");
    private final static QName _UnsupportedFileBehaviour_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "UnsupportedFileBehaviour");
    private final static QName _ConverterSpecificSettingsCad_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_Cad");
    private final static QName _Line_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Line");
    private final static QName _AuthenticationMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "AuthenticationMode");
    private final static QName _PDFPageLayout_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PDFPageLayout");
    private final static QName _FontStyle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "FontStyle");
    private final static QName _Defaults_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Defaults");
    private final static QName _InfoPathView_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "InfoPathView");
    private final static QName _PageType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "PageType");
    private final static QName _PrimeOCRPrintType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_PrintType");
    private final static QName _OutputFormatSpecificSettingsPDF_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "OutputFormatSpecificSettings_PDF");
    private final static QName _FileSplitOptions_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "FileSplitOptions");
    private final static QName _BooleanEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "BooleanEnum");
    private final static QName _DocumentSingleProperty_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "DocumentSingleProperty");
    private final static QName _PrimeOCRImageProcessingOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", "PrimeOCR_ImageProcessingOptions");
    private final static QName _DocumentPropertySetting_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "DocumentPropertySetting");
    private final static QName _BookmarkMapping_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "BookmarkMapping");
    private final static QName _ArrayOfNameValuePair_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "ArrayOfNameValuePair");
    private final static QName _MediaType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "MediaType");
    private final static QName _ArrayOfStatusResultItem_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "ArrayOfStatusResultItem");
    private final static QName _PageOrientation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "PageOrientation");
    private final static QName _PdfBuiltInProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PdfBuiltInProperties");
    private final static QName _OCRLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "OCRLanguage");
    private final static QName _ConverterSpecificSettingsImage_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConverterSpecificSettings_Image");
    private final static QName _ErrorCorrectionLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "ErrorCorrectionLevel");
    private final static QName _Image_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Image");
    private final static QName _CadConversionElementType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "CadConversionElementType");
    private final static QName _BarcodeInputMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", "BarcodeInputMode");
    private final static QName _PDFProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PDFProfile");
    private final static QName _Rectangle_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Rectangle");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfDocumentProperty_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ArrayOfDocumentProperty");
    private final static QName _PDFConvertAttachmentMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", "PDFConvertAttachmentMode");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfRegionText_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "ArrayOfRegionText");
    private final static QName _ArrayOfOperationTypeConfiguration_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "ArrayOfOperationTypeConfiguration");
    private final static QName _ProcessBatchOptions_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "options");
    private final static QName _GetDiagnosticsConvertersToDiagnose_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "convertersToDiagnose");
    private final static QName _OutputFormatSpecificSettingsPDFViewerPreferences_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "ViewerPreferences");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter3_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter3");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter4_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter4");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter10_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter10");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter1_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter1");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter2_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter2");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter7_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter7");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter8_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter8");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter5_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter5");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter6_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter6");
    private final static QName _ConverterSpecificSettingsCommandLineConverterParameter9_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Parameter9");
    private final static QName _SubscriptionSettingsSubscriptionID_QNAME = new QName("http://types.muhimbi.com/2015/04/13", "SubscriptionID");
    private final static QName _FileMergeSettingsTopLevelBookmark_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "TopLevelBookmark");
    private final static QName _NameValuePairValue_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "Value");
    private final static QName _NameValuePairName_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "Name");
    private final static QName _ConverterSpecificSettingsCadPageMargins_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "PageMargins");
    private final static QName _ConverterSpecificSettingsCadExternalReferences_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ExternalReferences");
    private final static QName _ConverterSpecificSettingsCadPaperSize_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "PaperSize");
    private final static QName _ConverterSpecificSettingsCadBackgroundColor_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "BackgroundColor");
    private final static QName _ConverterSpecificSettingsCadCadConversionElements_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "CadConversionElements");
    private final static QName _ConverterSpecificSettingsCadForegroundColor_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ForegroundColor");
    private final static QName _StatusRequestStatusRequestItems_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "StatusRequestItems");
    private final static QName _WatermarkPageRange_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "PageRange");
    private final static QName _WatermarkSectionRange_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "SectionRange");
    private final static QName _ConverterSpecificSettingsMSGExcludeAttachmentTypes_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ExcludeAttachmentTypes");
    private final static QName _ConverterSpecificSettingsMSGWebKitViewPortSize_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "WebKitViewPortSize");
    private final static QName _ConverterSpecificSettingsMSGIncludeAttachmentTypes_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "IncludeAttachmentTypes");
    private final static QName _ConverterSpecificSettingsMSGSentDateMissingDisplayMode_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "SentDateMissingDisplayMode");
    private final static QName _GetDiagnosticsResponseGetDiagnosticsResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "GetDiagnosticsResult");
    private final static QName _GetDocumentPropertiesResultProperties_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Properties");
    private final static QName _GetDocumentPropertiesResultIgnoredErrors_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "IgnoredErrors");
    private final static QName _ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateURL_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "PdfTemplateURL");
    private final static QName _ConverterSpecificSettingsPdfFormsDataImporterPdfTemplatePassword_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "PdfTemplatePassword");
    private final static QName _ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateUserName_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "PdfTemplateUserName");
    private final static QName _ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateDomain_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "PdfTemplateDomain");
    private final static QName _ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateData_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "PdfTemplateData");
    private final static QName _ConverterSpecificSettingsWordProcessingBookmarkOptions_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "BookmarkOptions");
    private final static QName _SystemSettingsCultureName_QNAME = new QName("http://types.muhimbi.com/2014/02/06", "CultureName");
    private final static QName _LinearBarcodeBarcodeToTextGapHeight_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "BarcodeToTextGapHeight");
    private final static QName _LinearBarcodeMargin_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Margin");
    private final static QName _LinearBarcodeFontFamilyName_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "FontFamilyName");
    private final static QName _LinearBarcodeFontSize_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "FontSize");
    private final static QName _ConverterSpecificSettingsInfoPathForcePaperSize_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ForcePaperSize");
    private final static QName _ConverterSpecificSettingsInfoPathXSNDomain_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "XSNDomain");
    private final static QName _ConverterSpecificSettingsInfoPathDefaultPaperSize_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "DefaultPaperSize");
    private final static QName _ConverterSpecificSettingsInfoPathXSNUserName_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "XSNUserName");
    private final static QName _ConverterSpecificSettingsInfoPathXSNPassword_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "XSNPassword");
    private final static QName _ConverterSpecificSettingsInfoPathXSNData_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "XSNData");
    private final static QName _ConverterSpecificSettingsInfoPathConversionViews_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "ConversionViews");
    private final static QName _ProcessChangesConversionSettings_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "conversionSettings");
    private final static QName _ProcessChangesSourceFile_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "sourceFile");
    private final static QName _ProcessChangesOpenOptions_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "openOptions");
    private final static QName _DiagnosticResultItemConverterName_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ConverterName");
    private final static QName _ConverterConfigurationSupportedOutputFormats_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SupportedOutputFormats");
    private final static QName _ConverterConfigurationSupportedFileExtensions_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SupportedFileExtensions");
    private final static QName _ConverterConfigurationDescription_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Description");
    private final static QName _GetDocumentPropertiesRequestPropertySettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "PropertySettings");
    private final static QName _ConversionSettingsWatermarks_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Watermarks");
    private final static QName _ConversionSettingsConverterSpecificSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ConverterSpecificSettings");
    private final static QName _ConversionSettingsOpenPassword_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OpenPassword");
    private final static QName _ConversionSettingsOwnerPassword_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OwnerPassword");
    private final static QName _ConversionSettingsOutputFormatSpecificSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OutputFormatSpecificSettings");
    private final static QName _ConversionSettingsTOCSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "TOCSettings");
    private final static QName _ConversionSettingsOCRSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OCRSettings");
    private final static QName _ConverterSpecificSettingsTIFFSourceFileResolution_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "SourceFileResolution");
    private final static QName _GetDocumentPropertiesGetDocumentPropertiesRequest_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "getDocumentPropertiesRequest");
    private final static QName _RegionTextRegionId_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "RegionId");
    private final static QName _RegionTextText_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Text");
    private final static QName _RtfRtfData_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "RtfData");
    private final static QName _PdfPdfData_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "PdfData");
    private final static QName _OCRRegionPageRange_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "PageRange");
    private final static QName _OCRRegionWidth_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Width");
    private final static QName _OCRRegionId_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Id");
    private final static QName _OCRRegionHeight_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Height");
    private final static QName _OCRRegionY_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Y");
    private final static QName _OCRRegionX_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "X");
    private final static QName _LineEndX_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "EndX");
    private final static QName _LineEndY_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "EndY");
    private final static QName _DocumentPropertySettingCategory_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Category");
    private final static QName _DocumentPropertySettingNames_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Names");
    private final static QName _CadConversionElementName_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Name");
    private final static QName _TOCSettingsPageMargins_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "PageMargins");
    private final static QName _TOCSettingsBookmark_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "Bookmark");
    private final static QName _TOCSettingsPaperSize_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "PaperSize");
    private final static QName _TOCSettingsProperties_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "Properties");
    private final static QName _TOCSettingsTemplate_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "Template");
    private final static QName _TOCSettingsWebKitViewPortSize_QNAME = new QName("http://types.muhimbi.com/2013/01/14", "WebKitViewPortSize");
    private final static QName _BatchResultFile_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "File");
    private final static QName _BatchResultFileName_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "FileName");
    private final static QName _BatchResultOCRResult_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OCRResult");
    private final static QName _ProcessBatchResponseProcessBatchResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "ProcessBatchResult");
    private final static QName _OpenOptionsPassword_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Password");
    private final static QName _OpenOptionsSystemSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SystemSettings");
    private final static QName _OpenOptionsUserName_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "UserName");
    private final static QName _OpenOptionsSubscriptionSettings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SubscriptionSettings");
    private final static QName _OpenOptionsFileExtension_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "FileExtension");
    private final static QName _OpenOptionsOriginalFileName_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OriginalFileName");
    private final static QName _DocumentPropertyName_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Name");
    private final static QName _DocumentArrayPropertyValue_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Value");
    private final static QName _DiagnosticsItems_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Items");
    private final static QName _GetStatusResponseGetStatusResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "GetStatusResult");
    private final static QName _WebServiceFaultExceptionExceptionDetails_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ExceptionDetails");
    private final static QName _ConverterSpecificSettingsHTMLZoom_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Zoom");
    private final static QName _ProcessingOptionsSplitOptions_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SplitOptions");
    private final static QName _ProcessingOptionsSourceFiles_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "SourceFiles");
    private final static QName _GetDocumentPropertiesResponseGetDocumentPropertiesResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "GetDocumentPropertiesResult");
    private final static QName _FileSplitOptionsFileNameTemplate_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "FileNameTemplate");
    private final static QName _ApplySecurityResponseApplySecurityResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "ApplySecurityResult");
    private final static QName _OperationTypeConfigurationDescription_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "Description");
    private final static QName _ImageImageData_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "ImageData");
    private final static QName _BatchResultsResults_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Results");
    private final static QName _ProcessChangesResponseProcessChangesResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "ProcessChangesResult");
    private final static QName _ElementScaleY_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "ScaleY");
    private final static QName _ElementLineWidth_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "LineWidth");
    private final static QName _ElementWidth_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Width");
    private final static QName _ElementScaleX_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "ScaleX");
    private final static QName _ElementRotation_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Rotation");
    private final static QName _ElementX_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "X");
    private final static QName _ElementLineColor_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "LineColor");
    private final static QName _ElementY_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Y");
    private final static QName _ElementHeight_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Height");
    private final static QName _ElementTransparency_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Transparency");
    private final static QName _ElementFillColor_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "FillColor");
    private final static QName _GetConfigurationResponseGetConfigurationResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "GetConfigurationResult");
    private final static QName _ConfigurationConverters_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "Converters");
    private final static QName _ConfigurationConversionServerAddress_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "ConversionServerAddress");
    private final static QName _ConfigurationOperationTypes_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "OperationTypes");
    private final static QName _ApplyWatermarkResponseApplyWatermarkResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "ApplyWatermarkResult");
    private final static QName _ConvertResponseConvertResult_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "ConvertResult");
    private final static QName _StatusResultItemRequestID_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "RequestID");
    private final static QName _TextContent_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Content");
    private final static QName _BookmarkMappingSource_QNAME = new QName("http://types.muhimbi.com/2010/11/22", "Source");
    private final static QName _StatusRequestItemData_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "Data");
    private final static QName _OCRSettingsBlackList_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "BlackList");
    private final static QName _OCRSettingsRegions_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Regions");
    private final static QName _OCRSettingsWhiteList_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "WhiteList");
    private final static QName _OCRSettingsOCREngine_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "OCREngine");
    private final static QName _OCRSettingsOCREngineSpecificSettings_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "OCREngineSpecificSettings");
    private final static QName _OCRSettingsLanguage_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "Language");
    private final static QName _ContainerElements_QNAME = new QName("http://types.muhimbi.com/2010/05/17", "Elements");
    private final static QName _GetStatusStatusRequest_QNAME = new QName("http://services.muhimbi.com/2009/10/06", "statusRequest");
    private final static QName _OCRResultRegionTexts_QNAME = new QName("http://types.muhimbi.com/2013/08/01", "RegionTexts");
    private final static QName _BookmarkOptionsWordProcessingBookmarkMappings_QNAME = new QName("http://types.muhimbi.com/2009/10/06", "BookmarkMappings");
    private final static QName _StatusItems_QNAME = new QName("http://types.muhimbi.com/2018/01/11", "Items");
    private final static QName _ConverterSpecificSettingsPDFExcludeAttachmentTypes_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "ExcludeAttachmentTypes");
    private final static QName _ConverterSpecificSettingsPDFIncludeAttachmentTypes_QNAME = new QName("http://types.muhimbi.com/2014/04/16", "IncludeAttachmentTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.muhimbi.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplySecurity }
     * 
     */
    public ApplySecurity createApplySecurity() {
        return new ApplySecurity();
    }

    /**
     * Create an instance of {@link OpenOptions }
     * 
     */
    public OpenOptions createOpenOptions() {
        return new OpenOptions();
    }

    /**
     * Create an instance of {@link ConversionSettings }
     * 
     */
    public ConversionSettings createConversionSettings() {
        return new ConversionSettings();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link GetDocumentProperties }
     * 
     */
    public GetDocumentProperties createGetDocumentProperties() {
        return new GetDocumentProperties();
    }

    /**
     * Create an instance of {@link GetDocumentPropertiesRequest }
     * 
     */
    public GetDocumentPropertiesRequest createGetDocumentPropertiesRequest() {
        return new GetDocumentPropertiesRequest();
    }

    /**
     * Create an instance of {@link ApplyWatermarkResponse }
     * 
     */
    public ApplyWatermarkResponse createApplyWatermarkResponse() {
        return new ApplyWatermarkResponse();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link ProcessBatchResponse }
     * 
     */
    public ProcessBatchResponse createProcessBatchResponse() {
        return new ProcessBatchResponse();
    }

    /**
     * Create an instance of {@link BatchResults }
     * 
     */
    public BatchResults createBatchResults() {
        return new BatchResults();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link GetDiagnostics }
     * 
     */
    public GetDiagnostics createGetDiagnostics() {
        return new GetDiagnostics();
    }

    /**
     * Create an instance of {@link ArrayOfDiagnosticRequestItem }
     * 
     */
    public ArrayOfDiagnosticRequestItem createArrayOfDiagnosticRequestItem() {
        return new ArrayOfDiagnosticRequestItem();
    }

    /**
     * Create an instance of {@link GetDiagnosticsResponse }
     * 
     */
    public GetDiagnosticsResponse createGetDiagnosticsResponse() {
        return new GetDiagnosticsResponse();
    }

    /**
     * Create an instance of {@link Diagnostics }
     * 
     */
    public Diagnostics createDiagnostics() {
        return new Diagnostics();
    }

    /**
     * Create an instance of {@link ApplySecurityResponse }
     * 
     */
    public ApplySecurityResponse createApplySecurityResponse() {
        return new ApplySecurityResponse();
    }

    /**
     * Create an instance of {@link ApplyWatermark }
     * 
     */
    public ApplyWatermark createApplyWatermark() {
        return new ApplyWatermark();
    }

    /**
     * Create an instance of {@link ProcessBatch }
     * 
     */
    public ProcessBatch createProcessBatch() {
        return new ProcessBatch();
    }

    /**
     * Create an instance of {@link ProcessingOptions }
     * 
     */
    public ProcessingOptions createProcessingOptions() {
        return new ProcessingOptions();
    }

    /**
     * Create an instance of {@link ProcessChanges }
     * 
     */
    public ProcessChanges createProcessChanges() {
        return new ProcessChanges();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetDocumentPropertiesResponse }
     * 
     */
    public GetDocumentPropertiesResponse createGetDocumentPropertiesResponse() {
        return new GetDocumentPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetDocumentPropertiesResult }
     * 
     */
    public GetDocumentPropertiesResult createGetDocumentPropertiesResult() {
        return new GetDocumentPropertiesResult();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link ProcessChangesResponse }
     * 
     */
    public ProcessChangesResponse createProcessChangesResponse() {
        return new ProcessChangesResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link StatusRequest }
     * 
     */
    public StatusRequest createStatusRequest() {
        return new StatusRequest();
    }

    /**
     * Create an instance of {@link DocumentArrayProperty }
     * 
     */
    public DocumentArrayProperty createDocumentArrayProperty() {
        return new DocumentArrayProperty();
    }

    /**
     * Create an instance of {@link ArrayOfSourceFile }
     * 
     */
    public ArrayOfSourceFile createArrayOfSourceFile() {
        return new ArrayOfSourceFile();
    }

    /**
     * Create an instance of {@link DiagnosticRequestItem }
     * 
     */
    public DiagnosticRequestItem createDiagnosticRequestItem() {
        return new DiagnosticRequestItem();
    }

    /**
     * Create an instance of {@link ArrayOfBatchResult }
     * 
     */
    public ArrayOfBatchResult createArrayOfBatchResult() {
        return new ArrayOfBatchResult();
    }

    /**
     * Create an instance of {@link DocumentPropertySetting }
     * 
     */
    public DocumentPropertySetting createDocumentPropertySetting() {
        return new DocumentPropertySetting();
    }

    /**
     * Create an instance of {@link BatchResult }
     * 
     */
    public BatchResult createBatchResult() {
        return new BatchResult();
    }

    /**
     * Create an instance of {@link ConverterConfiguration }
     * 
     */
    public ConverterConfiguration createConverterConfiguration() {
        return new ConverterConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentProperty }
     * 
     */
    public ArrayOfDocumentProperty createArrayOfDocumentProperty() {
        return new ArrayOfDocumentProperty();
    }

    /**
     * Create an instance of {@link DocumentProperty }
     * 
     */
    public DocumentProperty createDocumentProperty() {
        return new DocumentProperty();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentPropertySetting }
     * 
     */
    public ArrayOfDocumentPropertySetting createArrayOfDocumentPropertySetting() {
        return new ArrayOfDocumentPropertySetting();
    }

    /**
     * Create an instance of {@link ArrayOfDiagnosticResultItem }
     * 
     */
    public ArrayOfDiagnosticResultItem createArrayOfDiagnosticResultItem() {
        return new ArrayOfDiagnosticResultItem();
    }

    /**
     * Create an instance of {@link SourceFile }
     * 
     */
    public SourceFile createSourceFile() {
        return new SourceFile();
    }

    /**
     * Create an instance of {@link MergeSettings }
     * 
     */
    public MergeSettings createMergeSettings() {
        return new MergeSettings();
    }

    /**
     * Create an instance of {@link DiagnosticResultItem }
     * 
     */
    public DiagnosticResultItem createDiagnosticResultItem() {
        return new DiagnosticResultItem();
    }

    /**
     * Create an instance of {@link FileMergeSettings }
     * 
     */
    public FileMergeSettings createFileMergeSettings() {
        return new FileMergeSettings();
    }

    /**
     * Create an instance of {@link BookmarkOptionsWordProcessing }
     * 
     */
    public BookmarkOptionsWordProcessing createBookmarkOptionsWordProcessing() {
        return new BookmarkOptionsWordProcessing();
    }

    /**
     * Create an instance of {@link WebServiceFaultException }
     * 
     */
    public WebServiceFaultException createWebServiceFaultException() {
        return new WebServiceFaultException();
    }

    /**
     * Create an instance of {@link DocumentSingleProperty }
     * 
     */
    public DocumentSingleProperty createDocumentSingleProperty() {
        return new DocumentSingleProperty();
    }

    /**
     * Create an instance of {@link ArrayOfConverterConfiguration }
     * 
     */
    public ArrayOfConverterConfiguration createArrayOfConverterConfiguration() {
        return new ArrayOfConverterConfiguration();
    }

    /**
     * Create an instance of {@link BookmarkOptions }
     * 
     */
    public BookmarkOptions createBookmarkOptions() {
        return new BookmarkOptions();
    }

    /**
     * Create an instance of {@link FileSplitOptions }
     * 
     */
    public FileSplitOptions createFileSplitOptions() {
        return new FileSplitOptions();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsSpreadsheets }
     * 
     */
    public ConverterSpecificSettingsSpreadsheets createConverterSpecificSettingsSpreadsheets() {
        return new ConverterSpecificSettingsSpreadsheets();
    }

    /**
     * Create an instance of {@link SystemSettings }
     * 
     */
    public SystemSettings createSystemSettings() {
        return new SystemSettings();
    }

    /**
     * Create an instance of {@link TaskMonitorSettings }
     * 
     */
    public TaskMonitorSettings createTaskMonitorSettings() {
        return new TaskMonitorSettings();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsHTML }
     * 
     */
    public ConverterSpecificSettingsHTML createConverterSpecificSettingsHTML() {
        return new ConverterSpecificSettingsHTML();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsWordProcessing }
     * 
     */
    public ConverterSpecificSettingsWordProcessing createConverterSpecificSettingsWordProcessing() {
        return new ConverterSpecificSettingsWordProcessing();
    }

    /**
     * Create an instance of {@link ArrayOfInfoPathView }
     * 
     */
    public ArrayOfInfoPathView createArrayOfInfoPathView() {
        return new ArrayOfInfoPathView();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsMSG }
     * 
     */
    public ConverterSpecificSettingsMSG createConverterSpecificSettingsMSG() {
        return new ConverterSpecificSettingsMSG();
    }

    /**
     * Create an instance of {@link ArrayOfBookmarkMapping }
     * 
     */
    public ArrayOfBookmarkMapping createArrayOfBookmarkMapping() {
        return new ArrayOfBookmarkMapping();
    }

    /**
     * Create an instance of {@link BookmarkMapping }
     * 
     */
    public BookmarkMapping createBookmarkMapping() {
        return new BookmarkMapping();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsTIFF }
     * 
     */
    public ConverterSpecificSettingsTIFF createConverterSpecificSettingsTIFF() {
        return new ConverterSpecificSettingsTIFF();
    }

    /**
     * Create an instance of {@link OCREngineSpecificSettings }
     * 
     */
    public OCREngineSpecificSettings createOCREngineSpecificSettings() {
        return new OCREngineSpecificSettings();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsCad }
     * 
     */
    public ConverterSpecificSettingsCad createConverterSpecificSettingsCad() {
        return new ConverterSpecificSettingsCad();
    }

    /**
     * Create an instance of {@link OCREngineSpecificSettingsPrimeOCR }
     * 
     */
    public OCREngineSpecificSettingsPrimeOCR createOCREngineSpecificSettingsPrimeOCR() {
        return new OCREngineSpecificSettingsPrimeOCR();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettings }
     * 
     */
    public ConverterSpecificSettings createConverterSpecificSettings() {
        return new ConverterSpecificSettings();
    }

    /**
     * Create an instance of {@link CadConversionElement }
     * 
     */
    public CadConversionElement createCadConversionElement() {
        return new CadConversionElement();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsInfoPath }
     * 
     */
    public ConverterSpecificSettingsInfoPath createConverterSpecificSettingsInfoPath() {
        return new ConverterSpecificSettingsInfoPath();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsImage }
     * 
     */
    public ConverterSpecificSettingsImage createConverterSpecificSettingsImage() {
        return new ConverterSpecificSettingsImage();
    }

    /**
     * Create an instance of {@link InfoPathView }
     * 
     */
    public InfoPathView createInfoPathView() {
        return new InfoPathView();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsCommandLineConverter }
     * 
     */
    public ConverterSpecificSettingsCommandLineConverter createConverterSpecificSettingsCommandLineConverter() {
        return new ConverterSpecificSettingsCommandLineConverter();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsPresentations }
     * 
     */
    public ConverterSpecificSettingsPresentations createConverterSpecificSettingsPresentations() {
        return new ConverterSpecificSettingsPresentations();
    }

    /**
     * Create an instance of {@link ArrayOfCadConversionElement }
     * 
     */
    public ArrayOfCadConversionElement createArrayOfCadConversionElement() {
        return new ArrayOfCadConversionElement();
    }

    /**
     * Create an instance of {@link SubscriptionSettings }
     * 
     */
    public SubscriptionSettings createSubscriptionSettings() {
        return new SubscriptionSettings();
    }

    /**
     * Create an instance of {@link Ellipse }
     * 
     */
    public Ellipse createEllipse() {
        return new Ellipse();
    }

    /**
     * Create an instance of {@link Rtf }
     * 
     */
    public Rtf createRtf() {
        return new Rtf();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link LinearBarcode }
     * 
     */
    public LinearBarcode createLinearBarcode() {
        return new LinearBarcode();
    }

    /**
     * Create an instance of {@link Container }
     * 
     */
    public Container createContainer() {
        return new Container();
    }

    /**
     * Create an instance of {@link QRCode }
     * 
     */
    public QRCode createQRCode() {
        return new QRCode();
    }

    /**
     * Create an instance of {@link Defaults }
     * 
     */
    public Defaults createDefaults() {
        return new Defaults();
    }

    /**
     * Create an instance of {@link Pdf }
     * 
     */
    public Pdf createPdf() {
        return new Pdf();
    }

    /**
     * Create an instance of {@link ArrayOfElement }
     * 
     */
    public ArrayOfElement createArrayOfElement() {
        return new ArrayOfElement();
    }

    /**
     * Create an instance of {@link ArrayOfWatermark }
     * 
     */
    public ArrayOfWatermark createArrayOfWatermark() {
        return new ArrayOfWatermark();
    }

    /**
     * Create an instance of {@link Watermark }
     * 
     */
    public Watermark createWatermark() {
        return new Watermark();
    }

    /**
     * Create an instance of {@link OutputFormatSpecificSettings }
     * 
     */
    public OutputFormatSpecificSettings createOutputFormatSpecificSettings() {
        return new OutputFormatSpecificSettings();
    }

    /**
     * Create an instance of {@link TOCSettings }
     * 
     */
    public TOCSettings createTOCSettings() {
        return new TOCSettings();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link ArrayOfNameValuePair }
     * 
     */
    public ArrayOfNameValuePair createArrayOfNameValuePair() {
        return new ArrayOfNameValuePair();
    }

    /**
     * Create an instance of {@link OutputFormatSpecificSettingsPDF }
     * 
     */
    public OutputFormatSpecificSettingsPDF createOutputFormatSpecificSettingsPDF() {
        return new OutputFormatSpecificSettingsPDF();
    }

    /**
     * Create an instance of {@link PDFViewerPreferences }
     * 
     */
    public PDFViewerPreferences createPDFViewerPreferences() {
        return new PDFViewerPreferences();
    }

    /**
     * Create an instance of {@link ArrayOfRegionText }
     * 
     */
    public ArrayOfRegionText createArrayOfRegionText() {
        return new ArrayOfRegionText();
    }

    /**
     * Create an instance of {@link EnumsProxy }
     * 
     */
    public EnumsProxy createEnumsProxy() {
        return new EnumsProxy();
    }

    /**
     * Create an instance of {@link OCRSettings }
     * 
     */
    public OCRSettings createOCRSettings() {
        return new OCRSettings();
    }

    /**
     * Create an instance of {@link OCRResult }
     * 
     */
    public OCRResult createOCRResult() {
        return new OCRResult();
    }

    /**
     * Create an instance of {@link OCRRegion }
     * 
     */
    public OCRRegion createOCRRegion() {
        return new OCRRegion();
    }

    /**
     * Create an instance of {@link ArrayOfOCRRegion }
     * 
     */
    public ArrayOfOCRRegion createArrayOfOCRRegion() {
        return new ArrayOfOCRRegion();
    }

    /**
     * Create an instance of {@link RegionText }
     * 
     */
    public RegionText createRegionText() {
        return new RegionText();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     * 
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link ArrayOfStatusResultItem }
     * 
     */
    public ArrayOfStatusResultItem createArrayOfStatusResultItem() {
        return new ArrayOfStatusResultItem();
    }

    /**
     * Create an instance of {@link StatusResultItem }
     * 
     */
    public StatusResultItem createStatusResultItem() {
        return new StatusResultItem();
    }

    /**
     * Create an instance of {@link OperationTypeConfiguration }
     * 
     */
    public OperationTypeConfiguration createOperationTypeConfiguration() {
        return new OperationTypeConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfOperationTypeConfiguration }
     * 
     */
    public ArrayOfOperationTypeConfiguration createArrayOfOperationTypeConfiguration() {
        return new ArrayOfOperationTypeConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfStatusRequestItem }
     * 
     */
    public ArrayOfStatusRequestItem createArrayOfStatusRequestItem() {
        return new ArrayOfStatusRequestItem();
    }

    /**
     * Create an instance of {@link StatusRequestItem }
     * 
     */
    public StatusRequestItem createStatusRequestItem() {
        return new StatusRequestItem();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsPdfFormsDataImporter }
     * 
     */
    public ConverterSpecificSettingsPdfFormsDataImporter createConverterSpecificSettingsPdfFormsDataImporter() {
        return new ConverterSpecificSettingsPdfFormsDataImporter();
    }

    /**
     * Create an instance of {@link ConverterSpecificSettingsPDF }
     * 
     */
    public ConverterSpecificSettingsPDF createConverterSpecificSettingsPDF() {
        return new ConverterSpecificSettingsPDF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Watermark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Watermark")
    public JAXBElement<Watermark> createWatermark(Watermark value) {
        return new JAXBElement<Watermark>(_Watermark_QNAME, Watermark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "RegionText")
    public JAXBElement<RegionText> createRegionText(RegionText value) {
        return new JAXBElement<RegionText>(_RegionText_QNAME, RegionText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ArrayOfElement")
    public JAXBElement<ArrayOfElement> createArrayOfElement(ArrayOfElement value) {
        return new JAXBElement<ArrayOfElement>(_ArrayOfElement_QNAME, ArrayOfElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWatermark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ArrayOfWatermark")
    public JAXBElement<ArrayOfWatermark> createArrayOfWatermark(ArrayOfWatermark value) {
        return new JAXBElement<ArrayOfWatermark>(_ArrayOfWatermark_QNAME, ArrayOfWatermark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "DiagnosticResultItem")
    public JAXBElement<DiagnosticResultItem> createDiagnosticResultItem(DiagnosticResultItem value) {
        return new JAXBElement<DiagnosticResultItem>(_DiagnosticResultItem_QNAME, DiagnosticResultItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGBestBodyMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MSGBestBodyMode")
    public JAXBElement<MSGBestBodyMode> createMSGBestBodyMode(MSGBestBodyMode value) {
        return new JAXBElement<MSGBestBodyMode>(_MSGBestBodyMode_QNAME, MSGBestBodyMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearBarcode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "LinearBarcode")
    public JAXBElement<LinearBarcode> createLinearBarcode(LinearBarcode value) {
        return new JAXBElement<LinearBarcode>(_LinearBarcode_QNAME, LinearBarcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileMergeSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "FileMergeSettings")
    public JAXBElement<FileMergeSettings> createFileMergeSettings(FileMergeSettings value) {
        return new JAXBElement<FileMergeSettings>(_FileMergeSettings_QNAME, FileMergeSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PropertyCategories")
    public JAXBElement<PropertyCategories> createPropertyCategories(PropertyCategories value) {
        return new JAXBElement<PropertyCategories>(_PropertyCategories_QNAME, PropertyCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFViewerPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "PDFViewerPreferences")
    public JAXBElement<PDFViewerPreferences> createPDFViewerPreferences(PDFViewerPreferences value) {
        return new JAXBElement<PDFViewerPreferences>(_PDFViewerPreferences_QNAME, PDFViewerPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionsAndCommentsDisplayMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "RevisionsAndCommentsDisplayMode")
    public JAXBElement<RevisionsAndCommentsDisplayMode> createRevisionsAndCommentsDisplayMode(RevisionsAndCommentsDisplayMode value) {
        return new JAXBElement<RevisionsAndCommentsDisplayMode>(_RevisionsAndCommentsDisplayMode_QNAME, RevisionsAndCommentsDisplayMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentationsPrintOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PresentationsPrintOutputType")
    public JAXBElement<PresentationsPrintOutputType> createPresentationsPrintOutputType(PresentationsPrintOutputType value) {
        return new JAXBElement<PresentationsPrintOutputType>(_PresentationsPrintOutputType_QNAME, PresentationsPrintOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "OutputFormat")
    public JAXBElement<OutputFormat> createOutputFormat(OutputFormat value) {
        return new JAXBElement<OutputFormat>(_OutputFormat_QNAME, OutputFormat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarcodeTextLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "BarcodeTextLocation")
    public JAXBElement<BarcodeTextLocation> createBarcodeTextLocation(BarcodeTextLocation value) {
        return new JAXBElement<BarcodeTextLocation>(_BarcodeTextLocation_QNAME, BarcodeTextLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookmarkOptionsWordProcessing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "BookmarkOptions_WordProcessing")
    public JAXBElement<BookmarkOptionsWordProcessing> createBookmarkOptionsWordProcessing(BookmarkOptionsWordProcessing value) {
        return new JAXBElement<BookmarkOptionsWordProcessing>(_BookmarkOptionsWordProcessing_QNAME, BookmarkOptionsWordProcessing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "OCRSettings")
    public JAXBElement<OCRSettings> createOCRSettings(OCRSettings value) {
        return new JAXBElement<OCRSettings>(_OCRSettings_QNAME, OCRSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFPageScalingMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PDFPageScalingMode")
    public JAXBElement<PDFPageScalingMode> createPDFPageScalingMode(PDFPageScalingMode value) {
        return new JAXBElement<PDFPageScalingMode>(_PDFPageScalingMode_QNAME, PDFPageScalingMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentPropertiesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "GetDocumentPropertiesResult")
    public JAXBElement<GetDocumentPropertiesResult> createGetDocumentPropertiesResult(GetDocumentPropertiesResult value) {
        return new JAXBElement<GetDocumentPropertiesResult>(_GetDocumentPropertiesResult_QNAME, GetDocumentPropertiesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "ScaleMode")
    public JAXBElement<ScaleMode> createScaleMode(ScaleMode value) {
        return new JAXBElement<ScaleMode>(_ScaleMode_QNAME, ScaleMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "NameValuePair")
    public JAXBElement<NameValuePair> createNameValuePair(NameValuePair value) {
        return new JAXBElement<NameValuePair>(_NameValuePair_QNAME, NameValuePair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentScale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "ContentScale")
    public JAXBElement<ContentScale> createContentScale(ContentScale value) {
        return new JAXBElement<ContentScale>(_ContentScale_QNAME, ContentScale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConverterConfiguration")
    public JAXBElement<ConverterConfiguration> createConverterConfiguration(ConverterConfiguration value) {
        return new JAXBElement<ConverterConfiguration>(_ConverterConfiguration_QNAME, ConverterConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticRequestItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfDiagnosticRequestItem")
    public JAXBElement<ArrayOfDiagnosticRequestItem> createArrayOfDiagnosticRequestItem(ArrayOfDiagnosticRequestItem value) {
        return new JAXBElement<ArrayOfDiagnosticRequestItem>(_ArrayOfDiagnosticRequestItem_QNAME, ArrayOfDiagnosticRequestItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "Status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsTIFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_TIFF")
    public JAXBElement<ConverterSpecificSettingsTIFF> createConverterSpecificSettingsTIFF(ConverterSpecificSettingsTIFF value) {
        return new JAXBElement<ConverterSpecificSettingsTIFF>(_ConverterSpecificSettingsTIFF_QNAME, ConverterSpecificSettingsTIFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pdf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Pdf")
    public JAXBElement<Pdf> createPdf(Pdf value) {
        return new JAXBElement<Pdf>(_Pdf_QNAME, Pdf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRAutoZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_AutoZone")
    public JAXBElement<PrimeOCRAutoZone> createPrimeOCRAutoZone(PrimeOCRAutoZone value) {
        return new JAXBElement<PrimeOCRAutoZone>(_PrimeOCRAutoZone_QNAME, PrimeOCRAutoZone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTMLRenderingEngine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "HTMLRenderingEngine")
    public JAXBElement<HTMLRenderingEngine> createHTMLRenderingEngine(HTMLRenderingEngine value) {
        return new JAXBElement<HTMLRenderingEngine>(_HTMLRenderingEngine_QNAME, HTMLRenderingEngine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentPropertiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "GetDocumentPropertiesRequest")
    public JAXBElement<GetDocumentPropertiesRequest> createGetDocumentPropertiesRequest(GetDocumentPropertiesRequest value) {
        return new JAXBElement<GetDocumentPropertiesRequest>(_GetDocumentPropertiesRequest_QNAME, GetDocumentPropertiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "DocumentProperty")
    public JAXBElement<DocumentProperty> createDocumentProperty(DocumentProperty value) {
        return new JAXBElement<DocumentProperty>(_DocumentProperty_QNAME, DocumentProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Element }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Element")
    public JAXBElement<Element> createElement(Element value) {
        return new JAXBElement<Element>(_Element_QNAME, Element.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfDiagnosticResultItem")
    public JAXBElement<ArrayOfDiagnosticResultItem> createArrayOfDiagnosticResultItem(ArrayOfDiagnosticResultItem value) {
        return new JAXBElement<ArrayOfDiagnosticResultItem>(_ArrayOfDiagnosticResultItem_QNAME, ArrayOfDiagnosticResultItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGEmailAddressDisplayMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MSGEmailAddressDisplayMode")
    public JAXBElement<MSGEmailAddressDisplayMode> createMSGEmailAddressDisplayMode(MSGEmailAddressDisplayMode value) {
        return new JAXBElement<MSGEmailAddressDisplayMode>(_MSGEmailAddressDisplayMode_QNAME, MSGEmailAddressDisplayMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedDestinationProcessingMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "NamedDestinationProcessingMode")
    public JAXBElement<NamedDestinationProcessingMode> createNamedDestinationProcessingMode(NamedDestinationProcessingMode value) {
        return new JAXBElement<NamedDestinationProcessingMode>(_NamedDestinationProcessingMode_QNAME, NamedDestinationProcessingMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ellipse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Ellipse")
    public JAXBElement<Ellipse> createEllipse(Ellipse value) {
        return new JAXBElement<Ellipse>(_Ellipse_QNAME, Ellipse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionQuality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "ConversionQuality")
    public JAXBElement<ConversionQuality> createConversionQuality(ConversionQuality value) {
        return new JAXBElement<ConversionQuality>(_ConversionQuality_QNAME, ConversionQuality.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2015/04/13", name = "SubscriptionSettings")
    public JAXBElement<SubscriptionSettings> createSubscriptionSettings(SubscriptionSettings value) {
        return new JAXBElement<SubscriptionSettings>(_SubscriptionSettings_QNAME, SubscriptionSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInfoPathView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ArrayOfInfoPathView")
    public JAXBElement<ArrayOfInfoPathView> createArrayOfInfoPathView(ArrayOfInfoPathView value) {
        return new JAXBElement<ArrayOfInfoPathView>(_ArrayOfInfoPathView_QNAME, ArrayOfInfoPathView.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRZoneContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_ZoneContent")
    public JAXBElement<PrimeOCRZoneContent> createPrimeOCRZoneContent(PrimeOCRZoneContent value) {
        return new JAXBElement<PrimeOCRZoneContent>(_PrimeOCRZoneContent_QNAME, PrimeOCRZoneContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "SecurityOptions")
    public JAXBElement<List<String>> createSecurityOptions(List<String> value) {
        return new JAXBElement<List<String>>(_SecurityOptions_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "StatusResultItem")
    public JAXBElement<StatusResultItem> createStatusResultItem(StatusResultItem value) {
        return new JAXBElement<StatusResultItem>(_StatusResultItem_QNAME, StatusResultItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OpenOptions")
    public JAXBElement<OpenOptions> createOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_OpenOptions_QNAME, OpenOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ProcessingOptions")
    public JAXBElement<ProcessingOptions> createProcessingOptions(ProcessingOptions value) {
        return new JAXBElement<ProcessingOptions>(_ProcessingOptions_QNAME, ProcessingOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MergeMode")
    public JAXBElement<MergeMode> createMergeMode(MergeMode value) {
        return new JAXBElement<MergeMode>(_MergeMode_QNAME, MergeMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsPdfFormsDataImporter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "ConverterSpecificSettings_PdfFormsDataImporter")
    public JAXBElement<ConverterSpecificSettingsPdfFormsDataImporter> createConverterSpecificSettingsPdfFormsDataImporter(ConverterSpecificSettingsPdfFormsDataImporter value) {
        return new JAXBElement<ConverterSpecificSettingsPdfFormsDataImporter>(_ConverterSpecificSettingsPdfFormsDataImporter_QNAME, ConverterSpecificSettingsPdfFormsDataImporter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "ConversionRange")
    public JAXBElement<ConversionRange> createConversionRange(ConversionRange value) {
        return new JAXBElement<ConversionRange>(_ConversionRange_QNAME, ConversionRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOCSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "TOCSettings")
    public JAXBElement<TOCSettings> createTOCSettings(TOCSettings value) {
        return new JAXBElement<TOCSettings>(_TOCSettings_QNAME, TOCSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordWrap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "WordWrap")
    public JAXBElement<WordWrap> createWordWrap(WordWrap value) {
        return new JAXBElement<WordWrap>(_WordWrap_QNAME, WordWrap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConverterConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfConverterConfiguration")
    public JAXBElement<ArrayOfConverterConfiguration> createArrayOfConverterConfiguration(ArrayOfConverterConfiguration value) {
        return new JAXBElement<ArrayOfConverterConfiguration>(_ArrayOfConverterConfiguration_QNAME, ArrayOfConverterConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceFaultException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "WebServiceFaultException")
    public JAXBElement<WebServiceFaultException> createWebServiceFaultException(WebServiceFaultException value) {
        return new JAXBElement<WebServiceFaultException>(_WebServiceFaultException_QNAME, WebServiceFaultException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCadConversionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ArrayOfCadConversionElement")
    public JAXBElement<ArrayOfCadConversionElement> createArrayOfCadConversionElement(ArrayOfCadConversionElement value) {
        return new JAXBElement<ArrayOfCadConversionElement>(_ArrayOfCadConversionElement_QNAME, ArrayOfCadConversionElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGEmbeddedObjectDisplayMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MSGEmbeddedObjectDisplayMode")
    public JAXBElement<MSGEmbeddedObjectDisplayMode> createMSGEmbeddedObjectDisplayMode(MSGEmbeddedObjectDisplayMode value) {
        return new JAXBElement<MSGEmbeddedObjectDisplayMode>(_MSGEmbeddedObjectDisplayMode_QNAME, MSGEmbeddedObjectDisplayMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "WebServiceExceptionType")
    public JAXBElement<WebServiceExceptionType> createWebServiceExceptionType(WebServiceExceptionType value) {
        return new JAXBElement<WebServiceExceptionType>(_WebServiceExceptionType_QNAME, WebServiceExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRPerformance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "OCRPerformance")
    public JAXBElement<OCRPerformance> createOCRPerformance(OCRPerformance value) {
        return new JAXBElement<OCRPerformance>(_OCRPerformance_QNAME, OCRPerformance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsHTML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_HTML")
    public JAXBElement<ConverterSpecificSettingsHTML> createConverterSpecificSettingsHTML(ConverterSpecificSettingsHTML value) {
        return new JAXBElement<ConverterSpecificSettingsHTML>(_ConverterSpecificSettingsHTML_QNAME, ConverterSpecificSettingsHTML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConversionSettings")
    public JAXBElement<ConversionSettings> createConversionSettings(ConversionSettings value) {
        return new JAXBElement<ConversionSettings>(_ConversionSettings_QNAME, ConversionSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsPDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "ConverterSpecificSettings_PDF")
    public JAXBElement<ConverterSpecificSettingsPDF> createConverterSpecificSettingsPDF(ConverterSpecificSettingsPDF value) {
        return new JAXBElement<ConverterSpecificSettingsPDF>(_ConverterSpecificSettingsPDF_QNAME, ConverterSpecificSettingsPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "BatchResult")
    public JAXBElement<BatchResult> createBatchResult(BatchResult value) {
        return new JAXBElement<BatchResult>(_BatchResult_QNAME, BatchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTMLScaleMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "HTMLScaleMode")
    public JAXBElement<HTMLScaleMode> createHTMLScaleMode(HTMLScaleMode value) {
        return new JAXBElement<HTMLScaleMode>(_HTMLScaleMode_QNAME, HTMLScaleMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentArrayProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "DocumentArrayProperty")
    public JAXBElement<DocumentArrayProperty> createDocumentArrayProperty(DocumentArrayProperty value) {
        return new JAXBElement<DocumentArrayProperty>(_DocumentArrayProperty_QNAME, DocumentArrayProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagnostics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Diagnostics")
    public JAXBElement<Diagnostics> createDiagnostics(Diagnostics value) {
        return new JAXBElement<Diagnostics>(_Diagnostics_QNAME, Diagnostics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStartPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "DocumentStartPage")
    public JAXBElement<DocumentStartPage> createDocumentStartPage(DocumentStartPage value) {
        return new JAXBElement<DocumentStartPage>(_DocumentStartPage_QNAME, DocumentStartPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Container }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Container")
    public JAXBElement<Container> createContainer(Container value) {
        return new JAXBElement<Container>(_Container_QNAME, Container.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/02/06", name = "SystemSettings")
    public JAXBElement<SystemSettings> createSystemSettings(SystemSettings value) {
        return new JAXBElement<SystemSettings>(_SystemSettings_QNAME, SystemSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "HPosition")
    public JAXBElement<HPosition> createHPosition(HPosition value) {
        return new JAXBElement<HPosition>(_HPosition_QNAME, HPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarcodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "BarcodeType")
    public JAXBElement<BarcodeType> createBarcodeType(BarcodeType value) {
        return new JAXBElement<BarcodeType>(_BarcodeType_QNAME, BarcodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SourceFile")
    public JAXBElement<SourceFile> createSourceFile(SourceFile value) {
        return new JAXBElement<SourceFile>(_SourceFile_QNAME, SourceFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadLayoutSortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "CadLayoutSortOrder")
    public JAXBElement<CadLayoutSortOrder> createCadLayoutSortOrder(CadLayoutSortOrder value) {
        return new JAXBElement<CadLayoutSortOrder>(_CadLayoutSortOrder_QNAME, CadLayoutSortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadEmptyLayoutDetectionMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "CadEmptyLayoutDetectionMode")
    public JAXBElement<CadEmptyLayoutDetectionMode> createCadEmptyLayoutDetectionMode(CadEmptyLayoutDetectionMode value) {
        return new JAXBElement<CadEmptyLayoutDetectionMode>(_CadEmptyLayoutDetectionMode_QNAME, CadEmptyLayoutDetectionMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskMonitorSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/02/06", name = "TaskMonitorSettings")
    public JAXBElement<TaskMonitorSettings> createTaskMonitorSettings(TaskMonitorSettings value) {
        return new JAXBElement<TaskMonitorSettings>(_TaskMonitorSettings_QNAME, TaskMonitorSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HAlign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "HAlign")
    public JAXBElement<HAlign> createHAlign(HAlign value) {
        return new JAXBElement<HAlign>(_HAlign_QNAME, HAlign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRLexicalChecking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_LexicalChecking")
    public JAXBElement<PrimeOCRLexicalChecking> createPrimeOCRLexicalChecking(PrimeOCRLexicalChecking value) {
        return new JAXBElement<PrimeOCRLexicalChecking>(_PrimeOCRLexicalChecking_QNAME, PrimeOCRLexicalChecking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsPresentations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_Presentations")
    public JAXBElement<ConverterSpecificSettingsPresentations> createConverterSpecificSettingsPresentations(ConverterSpecificSettingsPresentations value) {
        return new JAXBElement<ConverterSpecificSettingsPresentations>(_ConverterSpecificSettingsPresentations_QNAME, ConverterSpecificSettingsPresentations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSplitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "FileSplitType")
    public JAXBElement<FileSplitType> createFileSplitType(FileSplitType value) {
        return new JAXBElement<FileSplitType>(_FileSplitType_QNAME, FileSplitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusRequestItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "ArrayOfStatusRequestItem")
    public JAXBElement<ArrayOfStatusRequestItem> createArrayOfStatusRequestItem(ArrayOfStatusRequestItem value) {
        return new JAXBElement<ArrayOfStatusRequestItem>(_ArrayOfStatusRequestItem_QNAME, ArrayOfStatusRequestItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentPropertySetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfDocumentPropertySetting")
    public JAXBElement<ArrayOfDocumentPropertySetting> createArrayOfDocumentPropertySetting(ArrayOfDocumentPropertySetting value) {
        return new JAXBElement<ArrayOfDocumentPropertySetting>(_ArrayOfDocumentPropertySetting_QNAME, ArrayOfDocumentPropertySetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionsAndCommentsMarkupMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "RevisionsAndCommentsMarkupMode")
    public JAXBElement<RevisionsAndCommentsMarkupMode> createRevisionsAndCommentsMarkupMode(RevisionsAndCommentsMarkupMode value) {
        return new JAXBElement<RevisionsAndCommentsMarkupMode>(_RevisionsAndCommentsMarkupMode_QNAME, RevisionsAndCommentsMarkupMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBookmarkMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ArrayOfBookmarkMapping")
    public JAXBElement<ArrayOfBookmarkMapping> createArrayOfBookmarkMapping(ArrayOfBookmarkMapping value) {
        return new JAXBElement<ArrayOfBookmarkMapping>(_ArrayOfBookmarkMapping_QNAME, ArrayOfBookmarkMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsMSG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_MSG")
    public JAXBElement<ConverterSpecificSettingsMSG> createConverterSpecificSettingsMSG(ConverterSpecificSettingsMSG value) {
        return new JAXBElement<ConverterSpecificSettingsMSG>(_ConverterSpecificSettingsMSG_QNAME, ConverterSpecificSettingsMSG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationTypeConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "OperationTypeConfiguration")
    public JAXBElement<OperationTypeConfiguration> createOperationTypeConfiguration(OperationTypeConfiguration value) {
        return new JAXBElement<OperationTypeConfiguration>(_OperationTypeConfiguration_QNAME, OperationTypeConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "ArrayOfOCRRegion")
    public JAXBElement<ArrayOfOCRRegion> createArrayOfOCRRegion(ArrayOfOCRRegion value) {
        return new JAXBElement<ArrayOfOCRRegion>(_ArrayOfOCRRegion_QNAME, ArrayOfOCRRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VAlign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "VAlign")
    public JAXBElement<VAlign> createVAlign(VAlign value) {
        return new JAXBElement<VAlign>(_VAlign_QNAME, VAlign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "BatchResults")
    public JAXBElement<BatchResults> createBatchResults(BatchResults value) {
        return new JAXBElement<BatchResults>(_BatchResults_QNAME, BatchResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsSpreadsheets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/02/06", name = "ConverterSpecificSettings_Spreadsheets")
    public JAXBElement<ConverterSpecificSettingsSpreadsheets> createConverterSpecificSettingsSpreadsheets(ConverterSpecificSettingsSpreadsheets value) {
        return new JAXBElement<ConverterSpecificSettingsSpreadsheets>(_ConverterSpecificSettingsSpreadsheets_QNAME, ConverterSpecificSettingsSpreadsheets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "OCRResult")
    public JAXBElement<OCRResult> createOCRResult(OCRResult value) {
        return new JAXBElement<OCRResult>(_OCRResult_QNAME, OCRResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadConversionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "CadConversionElement")
    public JAXBElement<CadConversionElement> createCadConversionElement(CadConversionElement value) {
        return new JAXBElement<CadConversionElement>(_CadConversionElement_QNAME, CadConversionElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QRCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "QRCode")
    public JAXBElement<QRCode> createQRCode(QRCode value) {
        return new JAXBElement<QRCode>(_QRCode_QNAME, QRCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCREngineSpecificSettingsPrimeOCR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "OCREngineSpecificSettings_PrimeOCR")
    public JAXBElement<OCREngineSpecificSettingsPrimeOCR> createOCREngineSpecificSettingsPrimeOCR(OCREngineSpecificSettingsPrimeOCR value) {
        return new JAXBElement<OCREngineSpecificSettingsPrimeOCR>(_OCREngineSpecificSettingsPrimeOCR_QNAME, OCREngineSpecificSettingsPrimeOCR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsInfoPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_InfoPath")
    public JAXBElement<ConverterSpecificSettingsInfoPath> createConverterSpecificSettingsInfoPath(ConverterSpecificSettingsInfoPath value) {
        return new JAXBElement<ConverterSpecificSettingsInfoPath>(_ConverterSpecificSettingsInfoPath_QNAME, ConverterSpecificSettingsInfoPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookmarkOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "BookmarkOptions")
    public JAXBElement<BookmarkOptions> createBookmarkOptions(BookmarkOptions value) {
        return new JAXBElement<BookmarkOptions>(_BookmarkOptions_QNAME, BookmarkOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "OCROutputType")
    public JAXBElement<List<String>> createOCROutputType(List<String> value) {
        return new JAXBElement<List<String>>(_OCROutputType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Text")
    public JAXBElement<Text> createText(Text value) {
        return new JAXBElement<Text>(_Text_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsCommandLineConverter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_CommandLineConverter")
    public JAXBElement<ConverterSpecificSettingsCommandLineConverter> createConverterSpecificSettingsCommandLineConverter(ConverterSpecificSettingsCommandLineConverter value) {
        return new JAXBElement<ConverterSpecificSettingsCommandLineConverter>(_ConverterSpecificSettingsCommandLineConverter_QNAME, ConverterSpecificSettingsCommandLineConverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "ConversionFidelities")
    public JAXBElement<List<String>> createConversionFidelities(List<String> value) {
        return new JAXBElement<List<String>>(_ConversionFidelities_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGPlainTextLineBreaks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MSGPlainTextLineBreaks")
    public JAXBElement<MSGPlainTextLineBreaks> createMSGPlainTextLineBreaks(MSGPlainTextLineBreaks value) {
        return new JAXBElement<MSGPlainTextLineBreaks>(_MSGPlainTextLineBreaks_QNAME, MSGPlainTextLineBreaks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfBatchResult")
    public JAXBElement<ArrayOfBatchResult> createArrayOfBatchResult(ArrayOfBatchResult value) {
        return new JAXBElement<ArrayOfBatchResult>(_ArrayOfBatchResult_QNAME, ArrayOfBatchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsWordProcessing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_WordProcessing")
    public JAXBElement<ConverterSpecificSettingsWordProcessing> createConverterSpecificSettingsWordProcessing(ConverterSpecificSettingsWordProcessing value) {
        return new JAXBElement<ConverterSpecificSettingsWordProcessing>(_ConverterSpecificSettingsWordProcessing_QNAME, ConverterSpecificSettingsWordProcessing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticRequestItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "DiagnosticRequestItem")
    public JAXBElement<DiagnosticRequestItem> createDiagnosticRequestItem(DiagnosticRequestItem value) {
        return new JAXBElement<DiagnosticRequestItem>(_DiagnosticRequestItem_QNAME, DiagnosticRequestItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "OCRRegion")
    public JAXBElement<OCRRegion> createOCRRegion(OCRRegion value) {
        return new JAXBElement<OCRRegion>(_OCRRegion_QNAME, OCRRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCREngineSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "OCREngineSpecificSettings")
    public JAXBElement<OCREngineSpecificSettings> createOCREngineSpecificSettings(OCREngineSpecificSettings value) {
        return new JAXBElement<OCREngineSpecificSettings>(_OCREngineSpecificSettings_QNAME, OCREngineSpecificSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRPageQuality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_PageQuality")
    public JAXBElement<PrimeOCRPageQuality> createPrimeOCRPageQuality(PrimeOCRPageQuality value) {
        return new JAXBElement<PrimeOCRPageQuality>(_PrimeOCRPageQuality_QNAME, PrimeOCRPageQuality.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "OperationStatus")
    public JAXBElement<OperationStatus> createOperationStatus(OperationStatus value) {
        return new JAXBElement<OperationStatus>(_OperationStatus_QNAME, OperationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRAccuracyLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_AccuracyLevel")
    public JAXBElement<PrimeOCRAccuracyLevel> createPrimeOCRAccuracyLevel(PrimeOCRAccuracyLevel value) {
        return new JAXBElement<PrimeOCRAccuracyLevel>(_PrimeOCRAccuracyLevel_QNAME, PrimeOCRAccuracyLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSourceFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfSourceFile")
    public JAXBElement<ArrayOfSourceFile> createArrayOfSourceFile(ArrayOfSourceFile value) {
        return new JAXBElement<ArrayOfSourceFile>(_ArrayOfSourceFile_QNAME, ArrayOfSourceFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings")
    public JAXBElement<ConverterSpecificSettings> createConverterSpecificSettings(ConverterSpecificSettings value) {
        return new JAXBElement<ConverterSpecificSettings>(_ConverterSpecificSettings_QNAME, ConverterSpecificSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumsProxy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "EnumsProxy")
    public JAXBElement<EnumsProxy> createEnumsProxy(EnumsProxy value) {
        return new JAXBElement<EnumsProxy>(_EnumsProxy_QNAME, EnumsProxy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGEmbeddedObjectIconDisplayMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MSGEmbeddedObjectIconDisplayMode")
    public JAXBElement<MSGEmbeddedObjectIconDisplayMode> createMSGEmbeddedObjectIconDisplayMode(MSGEmbeddedObjectIconDisplayMode value) {
        return new JAXBElement<MSGEmbeddedObjectIconDisplayMode>(_MSGEmbeddedObjectIconDisplayMode_QNAME, MSGEmbeddedObjectIconDisplayMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MacroSecurityOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MacroSecurityOption")
    public JAXBElement<MacroSecurityOption> createMacroSecurityOption(MacroSecurityOption value) {
        return new JAXBElement<MacroSecurityOption>(_MacroSecurityOption_QNAME, MacroSecurityOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "MergeSettings")
    public JAXBElement<MergeSettings> createMergeSettings(MergeSettings value) {
        return new JAXBElement<MergeSettings>(_MergeSettings_QNAME, MergeSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputFormatSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "OutputFormatSpecificSettings")
    public JAXBElement<OutputFormatSpecificSettings> createOutputFormatSpecificSettings(OutputFormatSpecificSettings value) {
        return new JAXBElement<OutputFormatSpecificSettings>(_OutputFormatSpecificSettings_QNAME, OutputFormatSpecificSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceMessageHeaderEncoding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "ForceMessageHeaderEncoding")
    public JAXBElement<ForceMessageHeaderEncoding> createForceMessageHeaderEncoding(ForceMessageHeaderEncoding value) {
        return new JAXBElement<ForceMessageHeaderEncoding>(_ForceMessageHeaderEncoding_QNAME, ForceMessageHeaderEncoding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "VPosition")
    public JAXBElement<VPosition> createVPosition(VPosition value) {
        return new JAXBElement<VPosition>(_VPosition_QNAME, VPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rtf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Rtf")
    public JAXBElement<Rtf> createRtf(Rtf value) {
        return new JAXBElement<Rtf>(_Rtf_QNAME, Rtf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusRequestItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "StatusRequestItem")
    public JAXBElement<StatusRequestItem> createStatusRequestItem(StatusRequestItem value) {
        return new JAXBElement<StatusRequestItem>(_StatusRequestItem_QNAME, StatusRequestItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFNavigationPane }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PDFNavigationPane")
    public JAXBElement<PDFNavigationPane> createPDFNavigationPane(PDFNavigationPane value) {
        return new JAXBElement<PDFNavigationPane>(_PDFNavigationPane_QNAME, PDFNavigationPane.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRDeskew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_Deskew")
    public JAXBElement<PrimeOCRDeskew> createPrimeOCRDeskew(PrimeOCRDeskew value) {
        return new JAXBElement<PrimeOCRDeskew>(_PrimeOCRDeskew_QNAME, PrimeOCRDeskew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordBuiltInProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "WordBuiltInProperties")
    public JAXBElement<WordBuiltInProperties> createWordBuiltInProperties(WordBuiltInProperties value) {
        return new JAXBElement<WordBuiltInProperties>(_WordBuiltInProperties_QNAME, WordBuiltInProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookmarkGenerationOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "BookmarkGenerationOption")
    public JAXBElement<BookmarkGenerationOption> createBookmarkGenerationOption(BookmarkGenerationOption value) {
        return new JAXBElement<BookmarkGenerationOption>(_BookmarkGenerationOption_QNAME, BookmarkGenerationOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "OperationType")
    public JAXBElement<OperationType> createOperationType(OperationType value) {
        return new JAXBElement<OperationType>(_OperationType_QNAME, OperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOCLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "TOCLocation")
    public JAXBElement<TOCLocation> createTOCLocation(TOCLocation value) {
        return new JAXBElement<TOCLocation>(_TOCLocation_QNAME, TOCLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "StatusRequest")
    public JAXBElement<StatusRequest> createStatusRequest(StatusRequest value) {
        return new JAXBElement<StatusRequest>(_StatusRequest_QNAME, StatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QRCodeVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "QRCodeVersion")
    public JAXBElement<QRCodeVersion> createQRCodeVersion(QRCodeVersion value) {
        return new JAXBElement<QRCodeVersion>(_QRCodeVersion_QNAME, QRCodeVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedFileBehaviour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "UnsupportedFileBehaviour")
    public JAXBElement<UnsupportedFileBehaviour> createUnsupportedFileBehaviour(UnsupportedFileBehaviour value) {
        return new JAXBElement<UnsupportedFileBehaviour>(_UnsupportedFileBehaviour_QNAME, UnsupportedFileBehaviour.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsCad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_Cad")
    public JAXBElement<ConverterSpecificSettingsCad> createConverterSpecificSettingsCad(ConverterSpecificSettingsCad value) {
        return new JAXBElement<ConverterSpecificSettingsCad>(_ConverterSpecificSettingsCad_QNAME, ConverterSpecificSettingsCad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Line")
    public JAXBElement<Line> createLine(Line value) {
        return new JAXBElement<Line>(_Line_QNAME, Line.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "AuthenticationMode")
    public JAXBElement<AuthenticationMode> createAuthenticationMode(AuthenticationMode value) {
        return new JAXBElement<AuthenticationMode>(_AuthenticationMode_QNAME, AuthenticationMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFPageLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PDFPageLayout")
    public JAXBElement<PDFPageLayout> createPDFPageLayout(PDFPageLayout value) {
        return new JAXBElement<PDFPageLayout>(_PDFPageLayout_QNAME, PDFPageLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "FontStyle")
    public JAXBElement<List<String>> createFontStyle(List<String> value) {
        return new JAXBElement<List<String>>(_FontStyle_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defaults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Defaults")
    public JAXBElement<Defaults> createDefaults(Defaults value) {
        return new JAXBElement<Defaults>(_Defaults_QNAME, Defaults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoPathView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "InfoPathView")
    public JAXBElement<InfoPathView> createInfoPathView(InfoPathView value) {
        return new JAXBElement<InfoPathView>(_InfoPathView_QNAME, InfoPathView.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "PageType")
    public JAXBElement<List<String>> createPageType(List<String> value) {
        return new JAXBElement<List<String>>(_PageType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeOCRPrintType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_PrintType")
    public JAXBElement<PrimeOCRPrintType> createPrimeOCRPrintType(PrimeOCRPrintType value) {
        return new JAXBElement<PrimeOCRPrintType>(_PrimeOCRPrintType_QNAME, PrimeOCRPrintType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputFormatSpecificSettingsPDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "OutputFormatSpecificSettings_PDF")
    public JAXBElement<OutputFormatSpecificSettingsPDF> createOutputFormatSpecificSettingsPDF(OutputFormatSpecificSettingsPDF value) {
        return new JAXBElement<OutputFormatSpecificSettingsPDF>(_OutputFormatSpecificSettingsPDF_QNAME, OutputFormatSpecificSettingsPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSplitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "FileSplitOptions")
    public JAXBElement<FileSplitOptions> createFileSplitOptions(FileSplitOptions value) {
        return new JAXBElement<FileSplitOptions>(_FileSplitOptions_QNAME, FileSplitOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "BooleanEnum")
    public JAXBElement<BooleanEnum> createBooleanEnum(BooleanEnum value) {
        return new JAXBElement<BooleanEnum>(_BooleanEnum_QNAME, BooleanEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentSingleProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "DocumentSingleProperty")
    public JAXBElement<DocumentSingleProperty> createDocumentSingleProperty(DocumentSingleProperty value) {
        return new JAXBElement<DocumentSingleProperty>(_DocumentSingleProperty_QNAME, DocumentSingleProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR", name = "PrimeOCR_ImageProcessingOptions")
    public JAXBElement<List<String>> createPrimeOCRImageProcessingOptions(List<String> value) {
        return new JAXBElement<List<String>>(_PrimeOCRImageProcessingOptions_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentPropertySetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "DocumentPropertySetting")
    public JAXBElement<DocumentPropertySetting> createDocumentPropertySetting(DocumentPropertySetting value) {
        return new JAXBElement<DocumentPropertySetting>(_DocumentPropertySetting_QNAME, DocumentPropertySetting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookmarkMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "BookmarkMapping")
    public JAXBElement<BookmarkMapping> createBookmarkMapping(BookmarkMapping value) {
        return new JAXBElement<BookmarkMapping>(_BookmarkMapping_QNAME, BookmarkMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNameValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "ArrayOfNameValuePair")
    public JAXBElement<ArrayOfNameValuePair> createArrayOfNameValuePair(ArrayOfNameValuePair value) {
        return new JAXBElement<ArrayOfNameValuePair>(_ArrayOfNameValuePair_QNAME, ArrayOfNameValuePair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "MediaType")
    public JAXBElement<MediaType> createMediaType(MediaType value) {
        return new JAXBElement<MediaType>(_MediaType_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "ArrayOfStatusResultItem")
    public JAXBElement<ArrayOfStatusResultItem> createArrayOfStatusResultItem(ArrayOfStatusResultItem value) {
        return new JAXBElement<ArrayOfStatusResultItem>(_ArrayOfStatusResultItem_QNAME, ArrayOfStatusResultItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageOrientation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "PageOrientation")
    public JAXBElement<PageOrientation> createPageOrientation(PageOrientation value) {
        return new JAXBElement<PageOrientation>(_PageOrientation_QNAME, PageOrientation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdfBuiltInProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PdfBuiltInProperties")
    public JAXBElement<PdfBuiltInProperties> createPdfBuiltInProperties(PdfBuiltInProperties value) {
        return new JAXBElement<PdfBuiltInProperties>(_PdfBuiltInProperties_QNAME, PdfBuiltInProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRLanguage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "OCRLanguage")
    public JAXBElement<OCRLanguage> createOCRLanguage(OCRLanguage value) {
        return new JAXBElement<OCRLanguage>(_OCRLanguage_QNAME, OCRLanguage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettingsImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConverterSpecificSettings_Image")
    public JAXBElement<ConverterSpecificSettingsImage> createConverterSpecificSettingsImage(ConverterSpecificSettingsImage value) {
        return new JAXBElement<ConverterSpecificSettingsImage>(_ConverterSpecificSettingsImage_QNAME, ConverterSpecificSettingsImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCorrectionLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "ErrorCorrectionLevel")
    public JAXBElement<ErrorCorrectionLevel> createErrorCorrectionLevel(ErrorCorrectionLevel value) {
        return new JAXBElement<ErrorCorrectionLevel>(_ErrorCorrectionLevel_QNAME, ErrorCorrectionLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Image")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<Image>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadConversionElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "CadConversionElementType")
    public JAXBElement<CadConversionElementType> createCadConversionElementType(CadConversionElementType value) {
        return new JAXBElement<CadConversionElementType>(_CadConversionElementType_QNAME, CadConversionElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarcodeInputMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics", name = "BarcodeInputMode")
    public JAXBElement<BarcodeInputMode> createBarcodeInputMode(BarcodeInputMode value) {
        return new JAXBElement<BarcodeInputMode>(_BarcodeInputMode_QNAME, BarcodeInputMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PDFProfile")
    public JAXBElement<PDFProfile> createPDFProfile(PDFProfile value) {
        return new JAXBElement<PDFProfile>(_PDFProfile_QNAME, PDFProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Rectangle")
    public JAXBElement<Rectangle> createRectangle(Rectangle value) {
        return new JAXBElement<Rectangle>(_Rectangle_QNAME, Rectangle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ArrayOfDocumentProperty")
    public JAXBElement<ArrayOfDocumentProperty> createArrayOfDocumentProperty(ArrayOfDocumentProperty value) {
        return new JAXBElement<ArrayOfDocumentProperty>(_ArrayOfDocumentProperty_QNAME, ArrayOfDocumentProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFConvertAttachmentMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data", name = "PDFConvertAttachmentMode")
    public JAXBElement<PDFConvertAttachmentMode> createPDFConvertAttachmentMode(PDFConvertAttachmentMode value) {
        return new JAXBElement<PDFConvertAttachmentMode>(_PDFConvertAttachmentMode_QNAME, PDFConvertAttachmentMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegionText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "ArrayOfRegionText")
    public JAXBElement<ArrayOfRegionText> createArrayOfRegionText(ArrayOfRegionText value) {
        return new JAXBElement<ArrayOfRegionText>(_ArrayOfRegionText_QNAME, ArrayOfRegionText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationTypeConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "ArrayOfOperationTypeConfiguration")
    public JAXBElement<ArrayOfOperationTypeConfiguration> createArrayOfOperationTypeConfiguration(ArrayOfOperationTypeConfiguration value) {
        return new JAXBElement<ArrayOfOperationTypeConfiguration>(_ArrayOfOperationTypeConfiguration_QNAME, ArrayOfOperationTypeConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "options", scope = ProcessBatch.class)
    public JAXBElement<ProcessingOptions> createProcessBatchOptions(ProcessingOptions value) {
        return new JAXBElement<ProcessingOptions>(_ProcessBatchOptions_QNAME, ProcessingOptions.class, ProcessBatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticRequestItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "convertersToDiagnose", scope = GetDiagnostics.class)
    public JAXBElement<ArrayOfDiagnosticRequestItem> createGetDiagnosticsConvertersToDiagnose(ArrayOfDiagnosticRequestItem value) {
        return new JAXBElement<ArrayOfDiagnosticRequestItem>(_GetDiagnosticsConvertersToDiagnose_QNAME, ArrayOfDiagnosticRequestItem.class, GetDiagnostics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFViewerPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "ViewerPreferences", scope = OutputFormatSpecificSettingsPDF.class)
    public JAXBElement<PDFViewerPreferences> createOutputFormatSpecificSettingsPDFViewerPreferences(PDFViewerPreferences value) {
        return new JAXBElement<PDFViewerPreferences>(_OutputFormatSpecificSettingsPDFViewerPreferences_QNAME, PDFViewerPreferences.class, OutputFormatSpecificSettingsPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter3", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter3(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter3_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter4", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter4(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter4_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter10", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter10(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter10_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter1", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter1(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter1_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter2", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter2(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter2_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter7", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter7(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter7_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter8", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter8(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter8_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter5", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter5(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter5_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter6", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter6(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter6_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Parameter9", scope = ConverterSpecificSettingsCommandLineConverter.class)
    public JAXBElement<String> createConverterSpecificSettingsCommandLineConverterParameter9(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCommandLineConverterParameter9_QNAME, String.class, ConverterSpecificSettingsCommandLineConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2015/04/13", name = "SubscriptionID", scope = SubscriptionSettings.class)
    public JAXBElement<String> createSubscriptionSettingsSubscriptionID(String value) {
        return new JAXBElement<String>(_SubscriptionSettingsSubscriptionID_QNAME, String.class, SubscriptionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "TopLevelBookmark", scope = FileMergeSettings.class)
    public JAXBElement<String> createFileMergeSettingsTopLevelBookmark(String value) {
        return new JAXBElement<String>(_FileMergeSettingsTopLevelBookmark_QNAME, String.class, FileMergeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "Value", scope = NameValuePair.class)
    public JAXBElement<String> createNameValuePairValue(String value) {
        return new JAXBElement<String>(_NameValuePairValue_QNAME, String.class, NameValuePair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "Name", scope = NameValuePair.class)
    public JAXBElement<String> createNameValuePairName(String value) {
        return new JAXBElement<String>(_NameValuePairName_QNAME, String.class, NameValuePair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PageMargins", scope = ConverterSpecificSettingsCad.class)
    public JAXBElement<String> createConverterSpecificSettingsCadPageMargins(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPageMargins_QNAME, String.class, ConverterSpecificSettingsCad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ExternalReferences", scope = ConverterSpecificSettingsCad.class)
    public JAXBElement<String> createConverterSpecificSettingsCadExternalReferences(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadExternalReferences_QNAME, String.class, ConverterSpecificSettingsCad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PaperSize", scope = ConverterSpecificSettingsCad.class)
    public JAXBElement<String> createConverterSpecificSettingsCadPaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPaperSize_QNAME, String.class, ConverterSpecificSettingsCad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "BackgroundColor", scope = ConverterSpecificSettingsCad.class)
    public JAXBElement<String> createConverterSpecificSettingsCadBackgroundColor(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadBackgroundColor_QNAME, String.class, ConverterSpecificSettingsCad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCadConversionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "CadConversionElements", scope = ConverterSpecificSettingsCad.class)
    public JAXBElement<ArrayOfCadConversionElement> createConverterSpecificSettingsCadCadConversionElements(ArrayOfCadConversionElement value) {
        return new JAXBElement<ArrayOfCadConversionElement>(_ConverterSpecificSettingsCadCadConversionElements_QNAME, ArrayOfCadConversionElement.class, ConverterSpecificSettingsCad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ForegroundColor", scope = ConverterSpecificSettingsCad.class)
    public JAXBElement<String> createConverterSpecificSettingsCadForegroundColor(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadForegroundColor_QNAME, String.class, ConverterSpecificSettingsCad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusRequestItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "StatusRequestItems", scope = StatusRequest.class)
    public JAXBElement<ArrayOfStatusRequestItem> createStatusRequestStatusRequestItems(ArrayOfStatusRequestItem value) {
        return new JAXBElement<ArrayOfStatusRequestItem>(_StatusRequestStatusRequestItems_QNAME, ArrayOfStatusRequestItem.class, StatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "PageRange", scope = Watermark.class)
    public JAXBElement<String> createWatermarkPageRange(String value) {
        return new JAXBElement<String>(_WatermarkPageRange_QNAME, String.class, Watermark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "SectionRange", scope = Watermark.class)
    public JAXBElement<String> createWatermarkSectionRange(String value) {
        return new JAXBElement<String>(_WatermarkSectionRange_QNAME, String.class, Watermark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PageMargins", scope = ConverterSpecificSettingsMSG.class)
    public JAXBElement<String> createConverterSpecificSettingsMSGPageMargins(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPageMargins_QNAME, String.class, ConverterSpecificSettingsMSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ExcludeAttachmentTypes", scope = ConverterSpecificSettingsMSG.class)
    public JAXBElement<String> createConverterSpecificSettingsMSGExcludeAttachmentTypes(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGExcludeAttachmentTypes_QNAME, String.class, ConverterSpecificSettingsMSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PaperSize", scope = ConverterSpecificSettingsMSG.class)
    public JAXBElement<String> createConverterSpecificSettingsMSGPaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPaperSize_QNAME, String.class, ConverterSpecificSettingsMSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "WebKitViewPortSize", scope = ConverterSpecificSettingsMSG.class)
    public JAXBElement<String> createConverterSpecificSettingsMSGWebKitViewPortSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGWebKitViewPortSize_QNAME, String.class, ConverterSpecificSettingsMSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "IncludeAttachmentTypes", scope = ConverterSpecificSettingsMSG.class)
    public JAXBElement<String> createConverterSpecificSettingsMSGIncludeAttachmentTypes(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGIncludeAttachmentTypes_QNAME, String.class, ConverterSpecificSettingsMSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "SentDateMissingDisplayMode", scope = ConverterSpecificSettingsMSG.class)
    public JAXBElement<String> createConverterSpecificSettingsMSGSentDateMissingDisplayMode(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGSentDateMissingDisplayMode_QNAME, String.class, ConverterSpecificSettingsMSG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diagnostics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "GetDiagnosticsResult", scope = GetDiagnosticsResponse.class)
    public JAXBElement<Diagnostics> createGetDiagnosticsResponseGetDiagnosticsResult(Diagnostics value) {
        return new JAXBElement<Diagnostics>(_GetDiagnosticsResponseGetDiagnosticsResult_QNAME, Diagnostics.class, GetDiagnosticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Properties", scope = GetDocumentPropertiesResult.class)
    public JAXBElement<ArrayOfDocumentProperty> createGetDocumentPropertiesResultProperties(ArrayOfDocumentProperty value) {
        return new JAXBElement<ArrayOfDocumentProperty>(_GetDocumentPropertiesResultProperties_QNAME, ArrayOfDocumentProperty.class, GetDocumentPropertiesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "IgnoredErrors", scope = GetDocumentPropertiesResult.class)
    public JAXBElement<ArrayOfstring> createGetDocumentPropertiesResultIgnoredErrors(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetDocumentPropertiesResultIgnoredErrors_QNAME, ArrayOfstring.class, GetDocumentPropertiesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "PdfTemplateURL", scope = ConverterSpecificSettingsPdfFormsDataImporter.class)
    public JAXBElement<String> createConverterSpecificSettingsPdfFormsDataImporterPdfTemplateURL(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateURL_QNAME, String.class, ConverterSpecificSettingsPdfFormsDataImporter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "PdfTemplatePassword", scope = ConverterSpecificSettingsPdfFormsDataImporter.class)
    public JAXBElement<String> createConverterSpecificSettingsPdfFormsDataImporterPdfTemplatePassword(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsPdfFormsDataImporterPdfTemplatePassword_QNAME, String.class, ConverterSpecificSettingsPdfFormsDataImporter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "PdfTemplateUserName", scope = ConverterSpecificSettingsPdfFormsDataImporter.class)
    public JAXBElement<String> createConverterSpecificSettingsPdfFormsDataImporterPdfTemplateUserName(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateUserName_QNAME, String.class, ConverterSpecificSettingsPdfFormsDataImporter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "PdfTemplateDomain", scope = ConverterSpecificSettingsPdfFormsDataImporter.class)
    public JAXBElement<String> createConverterSpecificSettingsPdfFormsDataImporterPdfTemplateDomain(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateDomain_QNAME, String.class, ConverterSpecificSettingsPdfFormsDataImporter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "PdfTemplateData", scope = ConverterSpecificSettingsPdfFormsDataImporter.class)
    public JAXBElement<byte[]> createConverterSpecificSettingsPdfFormsDataImporterPdfTemplateData(byte[] value) {
        return new JAXBElement<byte[]>(_ConverterSpecificSettingsPdfFormsDataImporterPdfTemplateData_QNAME, byte[].class, ConverterSpecificSettingsPdfFormsDataImporter.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookmarkOptionsWordProcessing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "BookmarkOptions", scope = ConverterSpecificSettingsWordProcessing.class)
    public JAXBElement<BookmarkOptionsWordProcessing> createConverterSpecificSettingsWordProcessingBookmarkOptions(BookmarkOptionsWordProcessing value) {
        return new JAXBElement<BookmarkOptionsWordProcessing>(_ConverterSpecificSettingsWordProcessingBookmarkOptions_QNAME, BookmarkOptionsWordProcessing.class, ConverterSpecificSettingsWordProcessing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskMonitorSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/02/06", name = "TaskMonitorSettings", scope = SystemSettings.class)
    public JAXBElement<TaskMonitorSettings> createSystemSettingsTaskMonitorSettings(TaskMonitorSettings value) {
        return new JAXBElement<TaskMonitorSettings>(_TaskMonitorSettings_QNAME, TaskMonitorSettings.class, SystemSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/02/06", name = "CultureName", scope = SystemSettings.class)
    public JAXBElement<String> createSystemSettingsCultureName(String value) {
        return new JAXBElement<String>(_SystemSettingsCultureName_QNAME, String.class, SystemSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "BarcodeToTextGapHeight", scope = LinearBarcode.class)
    public JAXBElement<String> createLinearBarcodeBarcodeToTextGapHeight(String value) {
        return new JAXBElement<String>(_LinearBarcodeBarcodeToTextGapHeight_QNAME, String.class, LinearBarcode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Margin", scope = LinearBarcode.class)
    public JAXBElement<String> createLinearBarcodeMargin(String value) {
        return new JAXBElement<String>(_LinearBarcodeMargin_QNAME, String.class, LinearBarcode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Text", scope = LinearBarcode.class)
    public JAXBElement<String> createLinearBarcodeText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, LinearBarcode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FontFamilyName", scope = LinearBarcode.class)
    public JAXBElement<String> createLinearBarcodeFontFamilyName(String value) {
        return new JAXBElement<String>(_LinearBarcodeFontFamilyName_QNAME, String.class, LinearBarcode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FontSize", scope = LinearBarcode.class)
    public JAXBElement<String> createLinearBarcodeFontSize(String value) {
        return new JAXBElement<String>(_LinearBarcodeFontSize_QNAME, String.class, LinearBarcode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ForcePaperSize", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathForcePaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsInfoPathForcePaperSize_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "XSNDomain", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathXSNDomain(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsInfoPathXSNDomain_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "DefaultPaperSize", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathDefaultPaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsInfoPathDefaultPaperSize_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "XSNUserName", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathXSNUserName(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsInfoPathXSNUserName_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "XSNPassword", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathXSNPassword(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsInfoPathXSNPassword_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ExcludeAttachmentTypes", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathExcludeAttachmentTypes(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGExcludeAttachmentTypes_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "XSNData", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<byte[]> createConverterSpecificSettingsInfoPathXSNData(byte[] value) {
        return new JAXBElement<byte[]>(_ConverterSpecificSettingsInfoPathXSNData_QNAME, byte[].class, ConverterSpecificSettingsInfoPath.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "IncludeAttachmentTypes", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<String> createConverterSpecificSettingsInfoPathIncludeAttachmentTypes(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGIncludeAttachmentTypes_QNAME, String.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInfoPathView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "ConversionViews", scope = ConverterSpecificSettingsInfoPath.class)
    public JAXBElement<ArrayOfInfoPathView> createConverterSpecificSettingsInfoPathConversionViews(ArrayOfInfoPathView value) {
        return new JAXBElement<ArrayOfInfoPathView>(_ConverterSpecificSettingsInfoPathConversionViews_QNAME, ArrayOfInfoPathView.class, ConverterSpecificSettingsInfoPath.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "conversionSettings", scope = ProcessChanges.class)
    public JAXBElement<ConversionSettings> createProcessChangesConversionSettings(ConversionSettings value) {
        return new JAXBElement<ConversionSettings>(_ProcessChangesConversionSettings_QNAME, ConversionSettings.class, ProcessChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "sourceFile", scope = ProcessChanges.class)
    public JAXBElement<byte[]> createProcessChangesSourceFile(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessChangesSourceFile_QNAME, byte[].class, ProcessChanges.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "openOptions", scope = ProcessChanges.class)
    public JAXBElement<OpenOptions> createProcessChangesOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_ProcessChangesOpenOptions_QNAME, OpenOptions.class, ProcessChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConverterName", scope = DiagnosticResultItem.class)
    public JAXBElement<String> createDiagnosticResultItemConverterName(String value) {
        return new JAXBElement<String>(_DiagnosticResultItemConverterName_QNAME, String.class, DiagnosticResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SupportedOutputFormats", scope = ConverterConfiguration.class)
    public JAXBElement<ArrayOfstring> createConverterConfigurationSupportedOutputFormats(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConverterConfigurationSupportedOutputFormats_QNAME, ArrayOfstring.class, ConverterConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SupportedFileExtensions", scope = ConverterConfiguration.class)
    public JAXBElement<ArrayOfstring> createConverterConfigurationSupportedFileExtensions(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ConverterConfigurationSupportedFileExtensions_QNAME, ArrayOfstring.class, ConverterConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Description", scope = ConverterConfiguration.class)
    public JAXBElement<String> createConverterConfigurationDescription(String value) {
        return new JAXBElement<String>(_ConverterConfigurationDescription_QNAME, String.class, ConverterConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConverterName", scope = ConverterConfiguration.class)
    public JAXBElement<String> createConverterConfigurationConverterName(String value) {
        return new JAXBElement<String>(_DiagnosticResultItemConverterName_QNAME, String.class, ConverterConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentPropertySetting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "PropertySettings", scope = GetDocumentPropertiesRequest.class)
    public JAXBElement<ArrayOfDocumentPropertySetting> createGetDocumentPropertiesRequestPropertySettings(ArrayOfDocumentPropertySetting value) {
        return new JAXBElement<ArrayOfDocumentPropertySetting>(_GetDocumentPropertiesRequestPropertySettings_QNAME, ArrayOfDocumentPropertySetting.class, GetDocumentPropertiesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SourceFile", scope = GetDocumentPropertiesRequest.class)
    public JAXBElement<byte[]> createGetDocumentPropertiesRequestSourceFile(byte[] value) {
        return new JAXBElement<byte[]>(_SourceFile_QNAME, byte[].class, GetDocumentPropertiesRequest.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OpenOptions", scope = GetDocumentPropertiesRequest.class)
    public JAXBElement<OpenOptions> createGetDocumentPropertiesRequestOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_OpenOptions_QNAME, OpenOptions.class, GetDocumentPropertiesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWatermark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Watermarks", scope = ConversionSettings.class)
    public JAXBElement<ArrayOfWatermark> createConversionSettingsWatermarks(ArrayOfWatermark value) {
        return new JAXBElement<ArrayOfWatermark>(_ConversionSettingsWatermarks_QNAME, ArrayOfWatermark.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverterSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConverterSpecificSettings", scope = ConversionSettings.class)
    public JAXBElement<ConverterSpecificSettings> createConversionSettingsConverterSpecificSettings(ConverterSpecificSettings value) {
        return new JAXBElement<ConverterSpecificSettings>(_ConversionSettingsConverterSpecificSettings_QNAME, ConverterSpecificSettings.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OpenPassword", scope = ConversionSettings.class)
    public JAXBElement<String> createConversionSettingsOpenPassword(String value) {
        return new JAXBElement<String>(_ConversionSettingsOpenPassword_QNAME, String.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OwnerPassword", scope = ConversionSettings.class)
    public JAXBElement<String> createConversionSettingsOwnerPassword(String value) {
        return new JAXBElement<String>(_ConversionSettingsOwnerPassword_QNAME, String.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputFormatSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OutputFormatSpecificSettings", scope = ConversionSettings.class)
    public JAXBElement<OutputFormatSpecificSettings> createConversionSettingsOutputFormatSpecificSettings(OutputFormatSpecificSettings value) {
        return new JAXBElement<OutputFormatSpecificSettings>(_ConversionSettingsOutputFormatSpecificSettings_QNAME, OutputFormatSpecificSettings.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOCSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "TOCSettings", scope = ConversionSettings.class)
    public JAXBElement<TOCSettings> createConversionSettingsTOCSettings(TOCSettings value) {
        return new JAXBElement<TOCSettings>(_ConversionSettingsTOCSettings_QNAME, TOCSettings.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OCRSettings", scope = ConversionSettings.class)
    public JAXBElement<OCRSettings> createConversionSettingsOCRSettings(OCRSettings value) {
        return new JAXBElement<OCRSettings>(_ConversionSettingsOCRSettings_QNAME, OCRSettings.class, ConversionSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "conversionSettings", scope = ApplyWatermark.class)
    public JAXBElement<ConversionSettings> createApplyWatermarkConversionSettings(ConversionSettings value) {
        return new JAXBElement<ConversionSettings>(_ProcessChangesConversionSettings_QNAME, ConversionSettings.class, ApplyWatermark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "sourceFile", scope = ApplyWatermark.class)
    public JAXBElement<byte[]> createApplyWatermarkSourceFile(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessChangesSourceFile_QNAME, byte[].class, ApplyWatermark.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "openOptions", scope = ApplyWatermark.class)
    public JAXBElement<OpenOptions> createApplyWatermarkOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_ProcessChangesOpenOptions_QNAME, OpenOptions.class, ApplyWatermark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PageMargins", scope = ConverterSpecificSettingsTIFF.class)
    public JAXBElement<String> createConverterSpecificSettingsTIFFPageMargins(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPageMargins_QNAME, String.class, ConverterSpecificSettingsTIFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "SourceFileResolution", scope = ConverterSpecificSettingsTIFF.class)
    public JAXBElement<String> createConverterSpecificSettingsTIFFSourceFileResolution(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsTIFFSourceFileResolution_QNAME, String.class, ConverterSpecificSettingsTIFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PaperSize", scope = ConverterSpecificSettingsTIFF.class)
    public JAXBElement<String> createConverterSpecificSettingsTIFFPaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPaperSize_QNAME, String.class, ConverterSpecificSettingsTIFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentPropertiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "getDocumentPropertiesRequest", scope = GetDocumentProperties.class)
    public JAXBElement<GetDocumentPropertiesRequest> createGetDocumentPropertiesGetDocumentPropertiesRequest(GetDocumentPropertiesRequest value) {
        return new JAXBElement<GetDocumentPropertiesRequest>(_GetDocumentPropertiesGetDocumentPropertiesRequest_QNAME, GetDocumentPropertiesRequest.class, GetDocumentProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "RegionId", scope = RegionText.class)
    public JAXBElement<String> createRegionTextRegionId(String value) {
        return new JAXBElement<String>(_RegionTextRegionId_QNAME, String.class, RegionText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Text", scope = RegionText.class)
    public JAXBElement<String> createRegionTextText(String value) {
        return new JAXBElement<String>(_RegionTextText_QNAME, String.class, RegionText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "RtfData", scope = Rtf.class)
    public JAXBElement<String> createRtfRtfData(String value) {
        return new JAXBElement<String>(_RtfRtfData_QNAME, String.class, Rtf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "PdfData", scope = Pdf.class)
    public JAXBElement<byte[]> createPdfPdfData(byte[] value) {
        return new JAXBElement<byte[]>(_PdfPdfData_QNAME, byte[].class, Pdf.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "PageRange", scope = OCRRegion.class)
    public JAXBElement<String> createOCRRegionPageRange(String value) {
        return new JAXBElement<String>(_OCRRegionPageRange_QNAME, String.class, OCRRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Width", scope = OCRRegion.class)
    public JAXBElement<String> createOCRRegionWidth(String value) {
        return new JAXBElement<String>(_OCRRegionWidth_QNAME, String.class, OCRRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Id", scope = OCRRegion.class)
    public JAXBElement<String> createOCRRegionId(String value) {
        return new JAXBElement<String>(_OCRRegionId_QNAME, String.class, OCRRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Height", scope = OCRRegion.class)
    public JAXBElement<String> createOCRRegionHeight(String value) {
        return new JAXBElement<String>(_OCRRegionHeight_QNAME, String.class, OCRRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Y", scope = OCRRegion.class)
    public JAXBElement<String> createOCRRegionY(String value) {
        return new JAXBElement<String>(_OCRRegionY_QNAME, String.class, OCRRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "X", scope = OCRRegion.class)
    public JAXBElement<String> createOCRRegionX(String value) {
        return new JAXBElement<String>(_OCRRegionX_QNAME, String.class, OCRRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "EndX", scope = Line.class)
    public JAXBElement<String> createLineEndX(String value) {
        return new JAXBElement<String>(_LineEndX_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "EndY", scope = Line.class)
    public JAXBElement<String> createLineEndY(String value) {
        return new JAXBElement<String>(_LineEndY_QNAME, String.class, Line.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Category", scope = DocumentPropertySetting.class)
    public JAXBElement<String> createDocumentPropertySettingCategory(String value) {
        return new JAXBElement<String>(_DocumentPropertySettingCategory_QNAME, String.class, DocumentPropertySetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Names", scope = DocumentPropertySetting.class)
    public JAXBElement<ArrayOfstring> createDocumentPropertySettingNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DocumentPropertySettingNames_QNAME, ArrayOfstring.class, DocumentPropertySetting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Name", scope = CadConversionElement.class)
    public JAXBElement<String> createCadConversionElementName(String value) {
        return new JAXBElement<String>(_CadConversionElementName_QNAME, String.class, CadConversionElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "PageMargins", scope = TOCSettings.class)
    public JAXBElement<String> createTOCSettingsPageMargins(String value) {
        return new JAXBElement<String>(_TOCSettingsPageMargins_QNAME, String.class, TOCSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "Bookmark", scope = TOCSettings.class)
    public JAXBElement<String> createTOCSettingsBookmark(String value) {
        return new JAXBElement<String>(_TOCSettingsBookmark_QNAME, String.class, TOCSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "PaperSize", scope = TOCSettings.class)
    public JAXBElement<String> createTOCSettingsPaperSize(String value) {
        return new JAXBElement<String>(_TOCSettingsPaperSize_QNAME, String.class, TOCSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNameValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "Properties", scope = TOCSettings.class)
    public JAXBElement<ArrayOfNameValuePair> createTOCSettingsProperties(ArrayOfNameValuePair value) {
        return new JAXBElement<ArrayOfNameValuePair>(_TOCSettingsProperties_QNAME, ArrayOfNameValuePair.class, TOCSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "Template", scope = TOCSettings.class)
    public JAXBElement<String> createTOCSettingsTemplate(String value) {
        return new JAXBElement<String>(_TOCSettingsTemplate_QNAME, String.class, TOCSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/01/14", name = "WebKitViewPortSize", scope = TOCSettings.class)
    public JAXBElement<String> createTOCSettingsWebKitViewPortSize(String value) {
        return new JAXBElement<String>(_TOCSettingsWebKitViewPortSize_QNAME, String.class, TOCSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Name", scope = InfoPathView.class)
    public JAXBElement<String> createInfoPathViewName(String value) {
        return new JAXBElement<String>(_CadConversionElementName_QNAME, String.class, InfoPathView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "File", scope = BatchResult.class)
    public JAXBElement<byte[]> createBatchResultFile(byte[] value) {
        return new JAXBElement<byte[]>(_BatchResultFile_QNAME, byte[].class, BatchResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "FileName", scope = BatchResult.class)
    public JAXBElement<String> createBatchResultFileName(String value) {
        return new JAXBElement<String>(_BatchResultFileName_QNAME, String.class, BatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OCRResult", scope = BatchResult.class)
    public JAXBElement<OCRResult> createBatchResultOCRResult(OCRResult value) {
        return new JAXBElement<OCRResult>(_BatchResultOCRResult_QNAME, OCRResult.class, BatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "ProcessBatchResult", scope = ProcessBatchResponse.class)
    public JAXBElement<BatchResults> createProcessBatchResponseProcessBatchResult(BatchResults value) {
        return new JAXBElement<BatchResults>(_ProcessBatchResponseProcessBatchResult_QNAME, BatchResults.class, ProcessBatchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Password", scope = OpenOptions.class)
    public JAXBElement<String> createOpenOptionsPassword(String value) {
        return new JAXBElement<String>(_OpenOptionsPassword_QNAME, String.class, OpenOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SystemSettings", scope = OpenOptions.class)
    public JAXBElement<SystemSettings> createOpenOptionsSystemSettings(SystemSettings value) {
        return new JAXBElement<SystemSettings>(_OpenOptionsSystemSettings_QNAME, SystemSettings.class, OpenOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "UserName", scope = OpenOptions.class)
    public JAXBElement<String> createOpenOptionsUserName(String value) {
        return new JAXBElement<String>(_OpenOptionsUserName_QNAME, String.class, OpenOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SubscriptionSettings", scope = OpenOptions.class)
    public JAXBElement<SubscriptionSettings> createOpenOptionsSubscriptionSettings(SubscriptionSettings value) {
        return new JAXBElement<SubscriptionSettings>(_OpenOptionsSubscriptionSettings_QNAME, SubscriptionSettings.class, OpenOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "FileExtension", scope = OpenOptions.class)
    public JAXBElement<String> createOpenOptionsFileExtension(String value) {
        return new JAXBElement<String>(_OpenOptionsFileExtension_QNAME, String.class, OpenOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OriginalFileName", scope = OpenOptions.class)
    public JAXBElement<String> createOpenOptionsOriginalFileName(String value) {
        return new JAXBElement<String>(_OpenOptionsOriginalFileName_QNAME, String.class, OpenOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Text", scope = QRCode.class)
    public JAXBElement<String> createQRCodeText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, QRCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Name", scope = DocumentProperty.class)
    public JAXBElement<String> createDocumentPropertyName(String value) {
        return new JAXBElement<String>(_DocumentPropertyName_QNAME, String.class, DocumentProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Category", scope = DocumentProperty.class)
    public JAXBElement<String> createDocumentPropertyCategory(String value) {
        return new JAXBElement<String>(_DocumentPropertySettingCategory_QNAME, String.class, DocumentProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Value", scope = DocumentArrayProperty.class)
    public JAXBElement<ArrayOfanyType> createDocumentArrayPropertyValue(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_DocumentArrayPropertyValue_QNAME, ArrayOfanyType.class, DocumentArrayProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Items", scope = Diagnostics.class)
    public JAXBElement<ArrayOfDiagnosticResultItem> createDiagnosticsItems(ArrayOfDiagnosticResultItem value) {
        return new JAXBElement<ArrayOfDiagnosticResultItem>(_DiagnosticsItems_QNAME, ArrayOfDiagnosticResultItem.class, Diagnostics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "GetStatusResult", scope = GetStatusResponse.class)
    public JAXBElement<Status> createGetStatusResponseGetStatusResult(Status value) {
        return new JAXBElement<Status>(_GetStatusResponseGetStatusResult_QNAME, Status.class, GetStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ExceptionDetails", scope = WebServiceFaultException.class)
    public JAXBElement<ArrayOfstring> createWebServiceFaultExceptionExceptionDetails(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_WebServiceFaultExceptionExceptionDetails_QNAME, ArrayOfstring.class, WebServiceFaultException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PageMargins", scope = ConverterSpecificSettingsHTML.class)
    public JAXBElement<String> createConverterSpecificSettingsHTMLPageMargins(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPageMargins_QNAME, String.class, ConverterSpecificSettingsHTML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Zoom", scope = ConverterSpecificSettingsHTML.class)
    public JAXBElement<String> createConverterSpecificSettingsHTMLZoom(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsHTMLZoom_QNAME, String.class, ConverterSpecificSettingsHTML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PaperSize", scope = ConverterSpecificSettingsHTML.class)
    public JAXBElement<String> createConverterSpecificSettingsHTMLPaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPaperSize_QNAME, String.class, ConverterSpecificSettingsHTML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "WebKitViewPortSize", scope = ConverterSpecificSettingsHTML.class)
    public JAXBElement<String> createConverterSpecificSettingsHTMLWebKitViewPortSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsMSGWebKitViewPortSize_QNAME, String.class, ConverterSpecificSettingsHTML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "MergeSettings", scope = ProcessingOptions.class)
    public JAXBElement<MergeSettings> createProcessingOptionsMergeSettings(MergeSettings value) {
        return new JAXBElement<MergeSettings>(_MergeSettings_QNAME, MergeSettings.class, ProcessingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSplitOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SplitOptions", scope = ProcessingOptions.class)
    public JAXBElement<FileSplitOptions> createProcessingOptionsSplitOptions(FileSplitOptions value) {
        return new JAXBElement<FileSplitOptions>(_ProcessingOptionsSplitOptions_QNAME, FileSplitOptions.class, ProcessingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SubscriptionSettings", scope = ProcessingOptions.class)
    public JAXBElement<SubscriptionSettings> createProcessingOptionsSubscriptionSettings(SubscriptionSettings value) {
        return new JAXBElement<SubscriptionSettings>(_OpenOptionsSubscriptionSettings_QNAME, SubscriptionSettings.class, ProcessingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSourceFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "SourceFiles", scope = ProcessingOptions.class)
    public JAXBElement<ArrayOfSourceFile> createProcessingOptionsSourceFiles(ArrayOfSourceFile value) {
        return new JAXBElement<ArrayOfSourceFile>(_ProcessingOptionsSourceFiles_QNAME, ArrayOfSourceFile.class, ProcessingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OCRSettings", scope = ProcessingOptions.class)
    public JAXBElement<OCRSettings> createProcessingOptionsOCRSettings(OCRSettings value) {
        return new JAXBElement<OCRSettings>(_ConversionSettingsOCRSettings_QNAME, OCRSettings.class, ProcessingOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentPropertiesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "GetDocumentPropertiesResult", scope = GetDocumentPropertiesResponse.class)
    public JAXBElement<GetDocumentPropertiesResult> createGetDocumentPropertiesResponseGetDocumentPropertiesResult(GetDocumentPropertiesResult value) {
        return new JAXBElement<GetDocumentPropertiesResult>(_GetDocumentPropertiesResponseGetDocumentPropertiesResult_QNAME, GetDocumentPropertiesResult.class, GetDocumentPropertiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "FileNameTemplate", scope = FileSplitOptions.class)
    public JAXBElement<String> createFileSplitOptionsFileNameTemplate(String value) {
        return new JAXBElement<String>(_FileSplitOptionsFileNameTemplate_QNAME, String.class, FileSplitOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "ApplySecurityResult", scope = ApplySecurityResponse.class)
    public JAXBElement<byte[]> createApplySecurityResponseApplySecurityResult(byte[] value) {
        return new JAXBElement<byte[]>(_ApplySecurityResponseApplySecurityResult_QNAME, byte[].class, ApplySecurityResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "Description", scope = OperationTypeConfiguration.class)
    public JAXBElement<String> createOperationTypeConfigurationDescription(String value) {
        return new JAXBElement<String>(_OperationTypeConfigurationDescription_QNAME, String.class, OperationTypeConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "conversionSettings", scope = ApplySecurity.class)
    public JAXBElement<ConversionSettings> createApplySecurityConversionSettings(ConversionSettings value) {
        return new JAXBElement<ConversionSettings>(_ProcessChangesConversionSettings_QNAME, ConversionSettings.class, ApplySecurity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "sourceFile", scope = ApplySecurity.class)
    public JAXBElement<byte[]> createApplySecuritySourceFile(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessChangesSourceFile_QNAME, byte[].class, ApplySecurity.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "openOptions", scope = ApplySecurity.class)
    public JAXBElement<OpenOptions> createApplySecurityOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_ProcessChangesOpenOptions_QNAME, OpenOptions.class, ApplySecurity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ImageData", scope = Image.class)
    public JAXBElement<byte[]> createImageImageData(byte[] value) {
        return new JAXBElement<byte[]>(_ImageImageData_QNAME, byte[].class, Image.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Results", scope = BatchResults.class)
    public JAXBElement<ArrayOfBatchResult> createBatchResultsResults(ArrayOfBatchResult value) {
        return new JAXBElement<ArrayOfBatchResult>(_BatchResultsResults_QNAME, ArrayOfBatchResult.class, BatchResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "ProcessChangesResult", scope = ProcessChangesResponse.class)
    public JAXBElement<byte[]> createProcessChangesResponseProcessChangesResult(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessChangesResponseProcessChangesResult_QNAME, byte[].class, ProcessChangesResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ScaleY", scope = Element.class)
    public JAXBElement<String> createElementScaleY(String value) {
        return new JAXBElement<String>(_ElementScaleY_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "LineWidth", scope = Element.class)
    public JAXBElement<String> createElementLineWidth(String value) {
        return new JAXBElement<String>(_ElementLineWidth_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Width", scope = Element.class)
    public JAXBElement<String> createElementWidth(String value) {
        return new JAXBElement<String>(_ElementWidth_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ScaleX", scope = Element.class)
    public JAXBElement<String> createElementScaleX(String value) {
        return new JAXBElement<String>(_ElementScaleX_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Rotation", scope = Element.class)
    public JAXBElement<String> createElementRotation(String value) {
        return new JAXBElement<String>(_ElementRotation_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "X", scope = Element.class)
    public JAXBElement<String> createElementX(String value) {
        return new JAXBElement<String>(_ElementX_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "LineColor", scope = Element.class)
    public JAXBElement<String> createElementLineColor(String value) {
        return new JAXBElement<String>(_ElementLineColor_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Y", scope = Element.class)
    public JAXBElement<String> createElementY(String value) {
        return new JAXBElement<String>(_ElementY_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Height", scope = Element.class)
    public JAXBElement<String> createElementHeight(String value) {
        return new JAXBElement<String>(_ElementHeight_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Transparency", scope = Element.class)
    public JAXBElement<String> createElementTransparency(String value) {
        return new JAXBElement<String>(_ElementTransparency_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FillColor", scope = Element.class)
    public JAXBElement<String> createElementFillColor(String value) {
        return new JAXBElement<String>(_ElementFillColor_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "GetConfigurationResult", scope = GetConfigurationResponse.class)
    public JAXBElement<Configuration> createGetConfigurationResponseGetConfigurationResult(Configuration value) {
        return new JAXBElement<Configuration>(_GetConfigurationResponseGetConfigurationResult_QNAME, Configuration.class, GetConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "LineWidth", scope = Defaults.class)
    public JAXBElement<String> createDefaultsLineWidth(String value) {
        return new JAXBElement<String>(_ElementLineWidth_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ScaleY", scope = Defaults.class)
    public JAXBElement<String> createDefaultsScaleY(String value) {
        return new JAXBElement<String>(_ElementScaleY_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Rotation", scope = Defaults.class)
    public JAXBElement<String> createDefaultsRotation(String value) {
        return new JAXBElement<String>(_ElementRotation_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "ScaleX", scope = Defaults.class)
    public JAXBElement<String> createDefaultsScaleX(String value) {
        return new JAXBElement<String>(_ElementScaleX_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "X", scope = Defaults.class)
    public JAXBElement<String> createDefaultsX(String value) {
        return new JAXBElement<String>(_ElementX_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "LineColor", scope = Defaults.class)
    public JAXBElement<String> createDefaultsLineColor(String value) {
        return new JAXBElement<String>(_ElementLineColor_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Y", scope = Defaults.class)
    public JAXBElement<String> createDefaultsY(String value) {
        return new JAXBElement<String>(_ElementY_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FontFamilyName", scope = Defaults.class)
    public JAXBElement<String> createDefaultsFontFamilyName(String value) {
        return new JAXBElement<String>(_LinearBarcodeFontFamilyName_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FontSize", scope = Defaults.class)
    public JAXBElement<String> createDefaultsFontSize(String value) {
        return new JAXBElement<String>(_LinearBarcodeFontSize_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Transparency", scope = Defaults.class)
    public JAXBElement<String> createDefaultsTransparency(String value) {
        return new JAXBElement<String>(_ElementTransparency_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FillColor", scope = Defaults.class)
    public JAXBElement<String> createDefaultsFillColor(String value) {
        return new JAXBElement<String>(_ElementFillColor_QNAME, String.class, Defaults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConverterConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Converters", scope = Configuration.class)
    public JAXBElement<ArrayOfConverterConfiguration> createConfigurationConverters(ArrayOfConverterConfiguration value) {
        return new JAXBElement<ArrayOfConverterConfiguration>(_ConfigurationConverters_QNAME, ArrayOfConverterConfiguration.class, Configuration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConversionServerAddress", scope = Configuration.class)
    public JAXBElement<String> createConfigurationConversionServerAddress(String value) {
        return new JAXBElement<String>(_ConfigurationConversionServerAddress_QNAME, String.class, Configuration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperationTypeConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OperationTypes", scope = Configuration.class)
    public JAXBElement<ArrayOfOperationTypeConfiguration> createConfigurationOperationTypes(ArrayOfOperationTypeConfiguration value) {
        return new JAXBElement<ArrayOfOperationTypeConfiguration>(_ConfigurationOperationTypes_QNAME, ArrayOfOperationTypeConfiguration.class, Configuration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "ApplyWatermarkResult", scope = ApplyWatermarkResponse.class)
    public JAXBElement<byte[]> createApplyWatermarkResponseApplyWatermarkResult(byte[] value) {
        return new JAXBElement<byte[]>(_ApplyWatermarkResponseApplyWatermarkResult_QNAME, byte[].class, ApplyWatermarkResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "ConvertResult", scope = ConvertResponse.class)
    public JAXBElement<byte[]> createConvertResponseConvertResult(byte[] value) {
        return new JAXBElement<byte[]>(_ConvertResponseConvertResult_QNAME, byte[].class, ConvertResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "RequestID", scope = StatusResultItem.class)
    public JAXBElement<String> createStatusResultItemRequestID(String value) {
        return new JAXBElement<String>(_StatusResultItemRequestID_QNAME, String.class, StatusResultItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileMergeSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "MergeSettings", scope = SourceFile.class)
    public JAXBElement<FileMergeSettings> createSourceFileMergeSettings(FileMergeSettings value) {
        return new JAXBElement<FileMergeSettings>(_MergeSettings_QNAME, FileMergeSettings.class, SourceFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConversionSettings", scope = SourceFile.class)
    public JAXBElement<ConversionSettings> createSourceFileConversionSettings(ConversionSettings value) {
        return new JAXBElement<ConversionSettings>(_ConversionSettings_QNAME, ConversionSettings.class, SourceFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "File", scope = SourceFile.class)
    public JAXBElement<byte[]> createSourceFileFile(byte[] value) {
        return new JAXBElement<byte[]>(_BatchResultFile_QNAME, byte[].class, SourceFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OpenOptions", scope = SourceFile.class)
    public JAXBElement<OpenOptions> createSourceFileOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_OpenOptions_QNAME, OpenOptions.class, SourceFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PageMargins", scope = ConverterSpecificSettingsImage.class)
    public JAXBElement<String> createConverterSpecificSettingsImagePageMargins(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPageMargins_QNAME, String.class, ConverterSpecificSettingsImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "SourceFileResolution", scope = ConverterSpecificSettingsImage.class)
    public JAXBElement<String> createConverterSpecificSettingsImageSourceFileResolution(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsTIFFSourceFileResolution_QNAME, String.class, ConverterSpecificSettingsImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "PaperSize", scope = ConverterSpecificSettingsImage.class)
    public JAXBElement<String> createConverterSpecificSettingsImagePaperSize(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsCadPaperSize_QNAME, String.class, ConverterSpecificSettingsImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "conversionSettings", scope = Convert.class)
    public JAXBElement<ConversionSettings> createConvertConversionSettings(ConversionSettings value) {
        return new JAXBElement<ConversionSettings>(_ProcessChangesConversionSettings_QNAME, ConversionSettings.class, Convert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "sourceFile", scope = Convert.class)
    public JAXBElement<byte[]> createConvertSourceFile(byte[] value) {
        return new JAXBElement<byte[]>(_ProcessChangesSourceFile_QNAME, byte[].class, Convert.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "openOptions", scope = Convert.class)
    public JAXBElement<OpenOptions> createConvertOpenOptions(OpenOptions value) {
        return new JAXBElement<OpenOptions>(_ProcessChangesOpenOptions_QNAME, OpenOptions.class, Convert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FontFamilyName", scope = Text.class)
    public JAXBElement<String> createTextFontFamilyName(String value) {
        return new JAXBElement<String>(_LinearBarcodeFontFamilyName_QNAME, String.class, Text.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "FontSize", scope = Text.class)
    public JAXBElement<String> createTextFontSize(String value) {
        return new JAXBElement<String>(_LinearBarcodeFontSize_QNAME, String.class, Text.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Content", scope = Text.class)
    public JAXBElement<String> createTextContent(String value) {
        return new JAXBElement<String>(_TextContent_QNAME, String.class, Text.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/11/22", name = "Source", scope = BookmarkMapping.class)
    public JAXBElement<String> createBookmarkMappingSource(String value) {
        return new JAXBElement<String>(_BookmarkMappingSource_QNAME, String.class, BookmarkMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWatermark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Watermarks", scope = MergeSettings.class)
    public JAXBElement<ArrayOfWatermark> createMergeSettingsWatermarks(ArrayOfWatermark value) {
        return new JAXBElement<ArrayOfWatermark>(_ConversionSettingsWatermarks_QNAME, ArrayOfWatermark.class, MergeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OpenPassword", scope = MergeSettings.class)
    public JAXBElement<String> createMergeSettingsOpenPassword(String value) {
        return new JAXBElement<String>(_ConversionSettingsOpenPassword_QNAME, String.class, MergeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OwnerPassword", scope = MergeSettings.class)
    public JAXBElement<String> createMergeSettingsOwnerPassword(String value) {
        return new JAXBElement<String>(_ConversionSettingsOwnerPassword_QNAME, String.class, MergeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputFormatSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "OutputFormatSpecificSettings", scope = MergeSettings.class)
    public JAXBElement<OutputFormatSpecificSettings> createMergeSettingsOutputFormatSpecificSettings(OutputFormatSpecificSettings value) {
        return new JAXBElement<OutputFormatSpecificSettings>(_ConversionSettingsOutputFormatSpecificSettings_QNAME, OutputFormatSpecificSettings.class, MergeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOCSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "TOCSettings", scope = MergeSettings.class)
    public JAXBElement<TOCSettings> createMergeSettingsTOCSettings(TOCSettings value) {
        return new JAXBElement<TOCSettings>(_ConversionSettingsTOCSettings_QNAME, TOCSettings.class, MergeSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "RequestID", scope = StatusRequestItem.class)
    public JAXBElement<String> createStatusRequestItemRequestID(String value) {
        return new JAXBElement<String>(_StatusResultItemRequestID_QNAME, String.class, StatusRequestItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "Data", scope = StatusRequestItem.class)
    public JAXBElement<String> createStatusRequestItemData(String value) {
        return new JAXBElement<String>(_StatusRequestItemData_QNAME, String.class, StatusRequestItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "BlackList", scope = OCRSettings.class)
    public JAXBElement<String> createOCRSettingsBlackList(String value) {
        return new JAXBElement<String>(_OCRSettingsBlackList_QNAME, String.class, OCRSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Regions", scope = OCRSettings.class)
    public JAXBElement<ArrayOfOCRRegion> createOCRSettingsRegions(ArrayOfOCRRegion value) {
        return new JAXBElement<ArrayOfOCRRegion>(_OCRSettingsRegions_QNAME, ArrayOfOCRRegion.class, OCRSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "WhiteList", scope = OCRSettings.class)
    public JAXBElement<String> createOCRSettingsWhiteList(String value) {
        return new JAXBElement<String>(_OCRSettingsWhiteList_QNAME, String.class, OCRSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "OCREngine", scope = OCRSettings.class)
    public JAXBElement<String> createOCRSettingsOCREngine(String value) {
        return new JAXBElement<String>(_OCRSettingsOCREngine_QNAME, String.class, OCRSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCREngineSpecificSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "OCREngineSpecificSettings", scope = OCRSettings.class)
    public JAXBElement<OCREngineSpecificSettings> createOCRSettingsOCREngineSpecificSettings(OCREngineSpecificSettings value) {
        return new JAXBElement<OCREngineSpecificSettings>(_OCRSettingsOCREngineSpecificSettings_QNAME, OCREngineSpecificSettings.class, OCRSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Language", scope = OCRSettings.class)
    public JAXBElement<String> createOCRSettingsLanguage(String value) {
        return new JAXBElement<String>(_OCRSettingsLanguage_QNAME, String.class, OCRSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "Value", scope = DocumentSingleProperty.class)
    public JAXBElement<Object> createDocumentSinglePropertyValue(Object value) {
        return new JAXBElement<Object>(_DocumentArrayPropertyValue_QNAME, Object.class, DocumentSingleProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "ConverterName", scope = DiagnosticRequestItem.class)
    public JAXBElement<String> createDiagnosticRequestItemConverterName(String value) {
        return new JAXBElement<String>(_DiagnosticResultItemConverterName_QNAME, String.class, DiagnosticRequestItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Elements", scope = Container.class)
    public JAXBElement<ArrayOfElement> createContainerElements(ArrayOfElement value) {
        return new JAXBElement<ArrayOfElement>(_ContainerElements_QNAME, ArrayOfElement.class, Container.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Defaults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2010/05/17", name = "Defaults", scope = Container.class)
    public JAXBElement<Defaults> createContainerDefaults(Defaults value) {
        return new JAXBElement<Defaults>(_Defaults_QNAME, Defaults.class, Container.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.muhimbi.com/2009/10/06", name = "statusRequest", scope = GetStatus.class)
    public JAXBElement<StatusRequest> createGetStatusStatusRequest(StatusRequest value) {
        return new JAXBElement<StatusRequest>(_GetStatusStatusRequest_QNAME, StatusRequest.class, GetStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "Text", scope = OCRResult.class)
    public JAXBElement<String> createOCRResultText(String value) {
        return new JAXBElement<String>(_RegionTextText_QNAME, String.class, OCRResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegionText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2013/08/01", name = "RegionTexts", scope = OCRResult.class)
    public JAXBElement<ArrayOfRegionText> createOCRResultRegionTexts(ArrayOfRegionText value) {
        return new JAXBElement<ArrayOfRegionText>(_OCRResultRegionTexts_QNAME, ArrayOfRegionText.class, OCRResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBookmarkMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2009/10/06", name = "BookmarkMappings", scope = BookmarkOptionsWordProcessing.class)
    public JAXBElement<ArrayOfBookmarkMapping> createBookmarkOptionsWordProcessingBookmarkMappings(ArrayOfBookmarkMapping value) {
        return new JAXBElement<ArrayOfBookmarkMapping>(_BookmarkOptionsWordProcessingBookmarkMappings_QNAME, ArrayOfBookmarkMapping.class, BookmarkOptionsWordProcessing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusResultItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2018/01/11", name = "Items", scope = Status.class)
    public JAXBElement<ArrayOfStatusResultItem> createStatusItems(ArrayOfStatusResultItem value) {
        return new JAXBElement<ArrayOfStatusResultItem>(_StatusItems_QNAME, ArrayOfStatusResultItem.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "ExcludeAttachmentTypes", scope = ConverterSpecificSettingsPDF.class)
    public JAXBElement<String> createConverterSpecificSettingsPDFExcludeAttachmentTypes(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsPDFExcludeAttachmentTypes_QNAME, String.class, ConverterSpecificSettingsPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.muhimbi.com/2014/04/16", name = "IncludeAttachmentTypes", scope = ConverterSpecificSettingsPDF.class)
    public JAXBElement<String> createConverterSpecificSettingsPDFIncludeAttachmentTypes(String value) {
        return new JAXBElement<String>(_ConverterSpecificSettingsPDFIncludeAttachmentTypes_QNAME, String.class, ConverterSpecificSettingsPDF.class, value);
    }

}
