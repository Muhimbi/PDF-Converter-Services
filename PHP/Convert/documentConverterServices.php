<?php
//  ********************************************************
//              Muhimbi Document Converter Service
//
//                 Copyright 2018, Muhimbi Ltd
//                       www.muhimbi.com
//
//                     All rights reserved
//
//       Filename: documentConverterServices.php
//          To do: -
//   Known issues: -
//        History:  7 Feb 2013 - BM - Initial version
//                  9 Mar 2018 - JR - Refreshed proxies
//                 11 Jan 2019 - BM - Refreshed proxies
//                 18 Jul 2019 - BM - Refreshed proxies
//                 11 Dec 2020 - BM - Refreshed proxies
//                 01 Mar 2021 - BM - Refreshed proxies
//                 15 Jul 2021 - BM - Refreshed proxies
//
//   This file was generated automatically using wsdl2php
//   For details see https://goo.gl/B5skSn
//   Once generated, all instances of '\\' were removed
//
//  ********************************************************


/**
 * 
 */
class DocumentConverterService extends \SoapClient
{

  /**
   * 
   * @var array $classmap The defined classes
   * @access private
   */
  private static $classmap = array(
    'ConverterSpecificSettings' => 'ConverterSpecificSettings',
    'ConverterSpecificSettings_WordProcessing' => 'ConverterSpecificSettings_WordProcessing',
    'ConverterSpecificSettings_Presentations' => 'ConverterSpecificSettings_Presentations',
    'ConverterSpecificSettings_Image' => 'ConverterSpecificSettings_Image',
    'ConverterSpecificSettings_InfoPath' => 'ConverterSpecificSettings_InfoPath',
    'InfoPathView' => 'InfoPathView',
    'ConverterSpecificSettings_Cad' => 'ConverterSpecificSettings_Cad',
    'CadConversionElement' => 'CadConversionElement',
    'ConverterSpecificSettings_HTML' => 'ConverterSpecificSettings_HTML',
    'ConverterSpecificSettings_MSG' => 'ConverterSpecificSettings_MSG',
    'ConverterSpecificSettings_CommandLineConverter' => 'ConverterSpecificSettings_CommandLineConverter',
    'ConverterSpecificSettings_TIFF' => 'ConverterSpecificSettings_TIFF',
    'BookmarkMapping' => 'BookmarkMapping',
    'OCREngineSpecificSettings' => 'OCREngineSpecificSettings',
    'OCREngineSpecificSettings_PrimeOCR' => 'OCREngineSpecificSettings_PrimeOCR',
    'SystemSettings' => 'SystemSettings',
    'TaskMonitorSettings' => 'TaskMonitorSettings',
    'ConverterSpecificSettings_Spreadsheets' => 'ConverterSpecificSettings_Spreadsheets',
    'SubscriptionSettings' => 'SubscriptionSettings',
    'Watermark' => 'Watermark',
    'Container' => 'Container',
    'Element' => 'Element',
    'Defaults' => 'Defaults',
    'Text' => 'Text',
    'Pdf' => 'Pdf',
    'Rtf' => 'Rtf',
    'Image' => 'Image',
    'Rectangle' => 'Rectangle',
    'Ellipse' => 'Ellipse',
    'Line' => 'Line',
    'QRCode' => 'QRCode',
    'LinearBarcode' => 'LinearBarcode',
    'OutputFormatSpecificSettings' => 'OutputFormatSpecificSettings',
    'OutputFormatSpecificSettings_PDF' => 'OutputFormatSpecificSettings_PDF',
    'PDFViewerPreferences' => 'PDFViewerPreferences',
    'TOCSettings' => 'TOCSettings',
    'NameValuePair' => 'NameValuePair',
    'EnumsProxy' => 'EnumsProxy',
    'OCRSettings' => 'OCRSettings',
    'OCRRegion' => 'OCRRegion',
    'OCRResult' => 'OCRResult',
    'RegionText' => 'RegionText',
    'OperationTypeConfiguration' => 'OperationTypeConfiguration',
    'StatusRequest' => 'StatusRequest',
    'StatusRequestItem' => 'StatusRequestItem',
    'Status' => 'Status',
    'StatusResultItem' => 'StatusResultItem',
    'OpenOptions' => 'OpenOptions',
    'ConversionSettings' => 'ConversionSettings',
    'BookmarkOptions_WordProcessing' => 'BookmarkOptions_WordProcessing',
    'BookmarkOptions' => 'BookmarkOptions',
    'WebServiceFaultException' => 'WebServiceFaultException',
    'ProcessingOptions' => 'ProcessingOptions',
    'SourceFile' => 'SourceFile',
    'FileMergeSettings' => 'FileMergeSettings',
    'MergeSettings' => 'MergeSettings',
    'FileSplitOptions' => 'FileSplitOptions',
    'BatchResults' => 'BatchResults',
    'BatchResult' => 'BatchResult',
    'Configuration' => 'Configuration',
    'ConverterConfiguration' => 'ConverterConfiguration',
    'DiagnosticRequestItem' => 'DiagnosticRequestItem',
    'Diagnostics' => 'Diagnostics',
    'DiagnosticResultItem' => 'DiagnosticResultItem',
    'Convert' => 'Convert',
    'ConvertResponse' => 'ConvertResponse',
    'ApplyWatermark' => 'ApplyWatermark',
    'ApplyWatermarkResponse' => 'ApplyWatermarkResponse',
    'ApplySecurity' => 'ApplySecurity',
    'ApplySecurityResponse' => 'ApplySecurityResponse',
    'ProcessChanges' => 'ProcessChanges',
    'ProcessChangesResponse' => 'ProcessChangesResponse',
    'ProcessBatch' => 'ProcessBatch',
    'ProcessBatchResponse' => 'ProcessBatchResponse',
    'GetConfiguration' => 'GetConfiguration',
    'GetConfigurationResponse' => 'GetConfigurationResponse',
    'GetDiagnostics' => 'GetDiagnostics',
    'GetDiagnosticsResponse' => 'GetDiagnosticsResponse',
    'GetStatus' => 'GetStatus',
    'GetStatusResponse' => 'GetStatusResponse',
    'ConverterSpecificSettings_PDF' => 'ConverterSpecificSettings_PDF');

  /**
   * 
   * @param array $options A array of config values
   * @param string $wsdl The wsdl file to use
   * @access public
   */
  public function __construct(array $options = array(), $wsdl = 'http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl')
  {
    foreach (self::$classmap as $key => $value) {
    if (!isset($options['classmap'][$key])) {
      $options['classmap'][$key] = $value;
    }
  }
  
  parent::__construct($wsdl, $options);
  }

  /**
   * 
   * @param Convert $parameters
   * @access public
   * @return ConvertResponse
   */
  public function Convert(Convert $parameters)
  {
    return $this->__soapCall('Convert', array($parameters));
  }

  /**
   * 
   * @param ApplyWatermark $parameters
   * @access public
   * @return ApplyWatermarkResponse
   */
  public function ApplyWatermark(ApplyWatermark $parameters)
  {
    return $this->__soapCall('ApplyWatermark', array($parameters));
  }

  /**
   * 
   * @param ApplySecurity $parameters
   * @access public
   * @return ApplySecurityResponse
   */
  public function ApplySecurity(ApplySecurity $parameters)
  {
    return $this->__soapCall('ApplySecurity', array($parameters));
  }

  /**
   * 
   * @param ProcessChanges $parameters
   * @access public
   * @return ProcessChangesResponse
   */
  public function ProcessChanges(ProcessChanges $parameters)
  {
    return $this->__soapCall('ProcessChanges', array($parameters));
  }

  /**
   * 
   * @param ProcessBatch $parameters
   * @access public
   * @return ProcessBatchResponse
   */
  public function ProcessBatch(ProcessBatch $parameters)
  {
    return $this->__soapCall('ProcessBatch', array($parameters));
  }

  /**
   * 
   * @param GetConfiguration $parameters
   * @access public
   * @return GetConfigurationResponse
   */
  public function GetConfiguration(GetConfiguration $parameters)
  {
    return $this->__soapCall('GetConfiguration', array($parameters));
  }

  /**
   * 
   * @param GetDiagnostics $parameters
   * @access public
   * @return GetDiagnosticsResponse
   */
  public function GetDiagnostics(GetDiagnostics $parameters)
  {
    return $this->__soapCall('GetDiagnostics', array($parameters));
  }

  /**
   * 
   * @param GetStatus $parameters
   * @access public
   * @return GetStatusResponse
   */
  public function GetStatus(GetStatus $parameters)
  {
    return $this->__soapCall('GetStatus', array($parameters));
  }

}
class MacroSecurityOption
{
  const __default = 'None';
  const None = 'None';
  const SignedOnly = 'SignedOnly';
  const All = 'All';


}
class OutputFormat
{
  const __default = 'PDF';
  const PDF = 'PDF';
  const XPS = 'XPS';
  const DOCX = 'DOCX';
  const DOC = 'DOC';
  const ODT = 'ODT';
  const RTF = 'RTF';
  const TXT = 'TXT';
  const MHT = 'MHT';
  const HTML = 'HTML';
  const XML = 'XML';
  const XLS = 'XLS';
  const XLSX = 'XLSX';
  const CSV = 'CSV';
  const ODS = 'ODS';
  const PPT = 'PPT';
  const PPTX = 'PPTX';
  const ODP = 'ODP';
  const PPS = 'PPS';
  const PPSX = 'PPSX';
  const TIFF = 'TIFF';
  const PNG = 'PNG';
  const GIF = 'GIF';
  const JPG = 'JPG';
  const BMP = 'BMP';
  const PS = 'PS';
  const PCL = 'PCL';
  const EPS = 'EPS';
  const FDF = 'FDF';
  const XFDF = 'XFDF';


}
class ConversionRange
{
  const __default = 'VisibleDocuments';
  const VisibleDocuments = 'VisibleDocuments';
  const AllDocuments = 'AllDocuments';
  const ActiveDocuments = 'ActiveDocuments';


}
class ConversionQuality
{
  const __default = 'OptimizeForPrint';
  const OptimizeForPrint = 'OptimizeForPrint';
  const OptimizeForOnScreen = 'OptimizeForOnScreen';
  const Original = 'Original';


}
class PDFProfile
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const PDF_1_5 = 'PDF_1_5';
  const PDF_A1B = 'PDF_A1B';
  const PDF_A2B = 'PDF_A2B';
  const PDF_A2U = 'PDF_A2U';
  const PDF_A3B = 'PDF_A3B';
  const PDF_A3U = 'PDF_A3U';
  const PDF_1_1 = 'PDF_1_1';
  const PDF_1_2 = 'PDF_1_2';
  const PDF_1_3 = 'PDF_1_3';
  const PDF_1_4 = 'PDF_1_4';
  const PDF_1_6 = 'PDF_1_6';
  const PDF_1_7 = 'PDF_1_7';


}
class SecurityOptions
{
  const __default = 'DisablePrint';
  const DisablePrint = 'DisablePrint';
  const DisableHighResolutionPrint = 'DisableHighResolutionPrint';
  const DisableContentCopy = 'DisableContentCopy';
  const DisableAnotations = 'DisableAnotations';
  const DisableFormFields = 'DisableFormFields';
  const DisableContentAccessibility = 'DisableContentAccessibility';
  const DisableDocumentAssembly = 'DisableDocumentAssembly';
  const DisableSecurity = 'DisableSecurity';


}
class ConversionFidelities
{
  const __default = 'High';
  const High = 'High';
  const Full = 'Full';


}
class BookmarkGenerationOption
{
  const __default = 'Disabled';
  const Disabled = 'Disabled';
  const Automatic = 'Automatic';
  const Custom = 'Custom';


}
class RevisionsAndCommentsMarkupMode
{
  const __default = 'InLine';
  const InLine = 'InLine';
  const Balloon = 'Balloon';
  const Mixed = 'Mixed';


}
class RevisionsAndCommentsDisplayMode
{
  const __default = 'FinalShowingMarkup';
  const FinalShowingMarkup = 'FinalShowingMarkup';
  const _Final = 'Final';
  const OriginalShowingMarkup = 'OriginalShowingMarkup';
  const Original = 'Original';
  const SimpleMarkup = 'SimpleMarkup';


}
class OCRLanguage
{
  const __default = 'All';
  const All = 'All';
  const Arabic = 'Arabic';
  const SimplifiedChinese = 'SimplifiedChinese';
  const TraditionalChinese = 'TraditionalChinese';
  const Danish = 'Danish';
  const German = 'German';
  const English = 'English';
  const English_UK = 'English_UK';
  const English_US = 'English_US';
  const Dutch = 'Dutch';
  const Finnish = 'Finnish';
  const French = 'French';
  const Hebrew = 'Hebrew';
  const Hungarian = 'Hungarian';
  const Italian = 'Italian';
  const Japanese = 'Japanese';
  const Korean = 'Korean';
  const Norwegian = 'Norwegian';
  const Portuguese = 'Portuguese';
  const Russian = 'Russian';
  const Spanish = 'Spanish';
  const Swedish = 'Swedish';


}
class PresentationsPrintOutputType
{
  const __default = 'Slides';
  const Slides = 'Slides';
  const OneSlideHandouts = 'OneSlideHandouts';
  const TwoSlideHandouts = 'TwoSlideHandouts';
  const ThreeSlideHandouts = 'ThreeSlideHandouts';
  const FourSlideHandouts = 'FourSlideHandouts';
  const SixSlideHandouts = 'SixSlideHandouts';
  const NineSlideHandouts = 'NineSlideHandouts';
  const NotesPages = 'NotesPages';
  const Outline = 'Outline';


}
class BooleanEnum
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const True = 'True';
  const False = 'False';


}
class ContentScale
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const NoScale = 'NoScale';
  const FitWidth = 'FitWidth';
  const FitHeight = 'FitHeight';
  const FitPage = 'FitPage';


}
class MergeMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Merge = 'Merge';
  const AttachAsPDF = 'AttachAsPDF';
  const AttachOriginal = 'AttachOriginal';


}
class UnsupportedFileBehaviour
{
  const __default = 'Error';
  const Error = 'Error';
  const Remove = 'Remove';
  const AttachOriginal = 'AttachOriginal';


}
class CadConversionElementType
{
  const __default = 'AllLayouts';
  const AllLayouts = 'AllLayouts';
  const NamedLayout = 'NamedLayout';
  const TopView = 'TopView';
  const BottomView = 'BottomView';
  const LeftView = 'LeftView';
  const RightView = 'RightView';
  const FrontView = 'FrontView';
  const BackView = 'BackView';
  const SW_IsometricView = 'SW_IsometricView';
  const SE_IsometricView = 'SE_IsometricView';
  const NE_IsometricView = 'NE_IsometricView';
  const NW_IsometricView = 'NW_IsometricView';
  const NamedView = 'NamedView';


}
class CadEmptyLayoutDetectionMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const SkipNone = 'SkipNone';
  const SkipEmptyLayouts = 'SkipEmptyLayouts';
  const SkipLayoutsWithoutViewports = 'SkipLayoutsWithoutViewports';


}
class CadLayoutSortOrder
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Ascending = 'Ascending';
  const Descending = 'Descending';
  const TabOrder = 'TabOrder';


}
class HTMLScaleMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const FitWidth = 'FitWidth';
  const NoScale = 'NoScale';
  const FitWidthScaleImagesOnly = 'FitWidthScaleImagesOnly';
  const FitWidthScaleWideImagesOnly = 'FitWidthScaleWideImagesOnly';


}
class HTMLRenderingEngine
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const IE = 'IE';
  const WebKit = 'WebKit';
  const Chromium = 'Chromium';


}
class AuthenticationMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const WebAuthentication = 'WebAuthentication';
  const MSOAuthentication = 'MSOAuthentication';


}
class MediaType
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Screen = 'Screen';
  const PrintCustom = 'Print';


}
class MSGPlainTextLineBreaks
{
  const __default = 'RetainAll';
  const RetainAll = 'RetainAll';
  const RemoveExtra = 'RemoveExtra';
  const Legacy = 'Legacy';


}
class MSGBestBodyMode
{
  const __default = 'Strict';
  const Strict = 'Strict';
  const DefaultCustom = 'Default';


}
class MSGEmailAddressDisplayMode
{
  const __default = 'Name';
  const Name = 'Name';
  const NameAndAddress = 'NameAndAddress';
  const Address = 'Address';
  const NameAndSMTPAddress = 'NameAndSMTPAddress';


}
class MSGEmbeddedObjectDisplayMode
{
  const __default = 'InlineNoScale';
  const InlineNoScale = 'InlineNoScale';
  const InlineFitWidth = 'InlineFitWidth';
  const Disabled = 'Disabled';


}
class MSGEmbeddedObjectIconDisplayMode
{
  const __default = 'IconOnly';
  const IconOnly = 'IconOnly';
  const Disabled = 'Disabled';


}
class ForceMessageHeaderEncoding
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const None = 'None';
  const UTF8 = 'UTF8';


}
class PDFConvertAttachmentMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const RemoveAll = 'RemoveAll';
  const RemoveSupported = 'RemoveSupported';


}
class PDFPageLayout
{
  const __default = 'SinglePage';
  const SinglePage = 'SinglePage';
  const OneColumn = 'OneColumn';
  const TwoColumnLeft = 'TwoColumnLeft';
  const TwoColumnRight = 'TwoColumnRight';
  const TwoPageLeft = 'TwoPageLeft';
  const TwoPageRight = 'TwoPageRight';


}
class PDFNavigationPane
{
  const __default = 'None';
  const None = 'None';
  const Bookmarks = 'Bookmarks';
  const Thumbnails = 'Thumbnails';
  const OptionalContent = 'OptionalContent';
  const Attachments = 'Attachments';


}
class PDFPageScalingMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const None = 'None';


}
class NamedDestinationProcessingMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const None = 'None';
  const ClearAll = 'ClearAll';
  const Merge = 'Merge';
  const Replace = 'Replace';


}
class OCRPerformance
{
  const __default = 'Slow';
  const Slow = 'Slow';
  const Fast = 'Fast';
  const Rapid = 'Rapid';


}
class OCROutputType
{
  const __default = 'Text';
  const Text = 'Text';
  const PDF = 'PDF';


}
class TOCLocation
{
  const __default = 'Front';
  const Front = 'Front';
  const Back = 'Back';


}
class DocumentStartPage
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Next = 'Next';
  const Odd = 'Odd';
  const Even = 'Even';


}
class WebServiceExceptionType
{
  const __default = 'Unknown';
  const Unknown = 'Unknown';
  const FileFormatNotSupported = 'FileFormatNotSupported';
  const CorruptDocument = 'CorruptDocument';
  const ErrorOpeningFile = 'ErrorOpeningFile';
  const ConversionTimeOut = 'ConversionTimeOut';
  const ConverterNotResponding = 'ConverterNotResponding';
  const ConverterNotInstalled = 'ConverterNotInstalled';
  const InternalError = 'InternalError';
  const OutputFormatNotSupported = 'OutputFormatNotSupported';
  const ConfigurationError = 'ConfigurationError';
  const TrialExpired = 'TrialExpired';
  const ExternalDependencyError = 'ExternalDependencyError';
  const AttachmentNotSupported = 'AttachmentNotSupported';
  const DocumentLocked = 'DocumentLocked';


}
class FileSplitType
{
  const __default = 'ByNumberOfPages';
  const ByNumberOfPages = 'ByNumberOfPages';
  const ByBookmarkLevel = 'ByBookmarkLevel';


}
class OperationType
{
  const __default = 'Convert';
  const Convert = 'Convert';
  const Merge = 'Merge';
  const OCR = 'OCR';
  const Watermark = 'Watermark';
  const Secure = 'Secure';
  const Split = 'Split';


}
class OperationStatus
{
  const __default = 'Allowed';
  const Allowed = 'Allowed';
  const Denied_ExceededMaxConcurrentCalls = 'Denied_ExceededMaxConcurrentCalls';
  const Denied_ExceededConverterMaxConcurrentCalls = 'Denied_ExceededConverterMaxConcurrentCalls';
  const Denied_ExceededOperationMaxConcurrentCalls = 'Denied_ExceededOperationMaxConcurrentCalls';
  const Denied_UnsupportedOperationType = 'Denied_UnsupportedOperationType';
  const Denied_UnsupportedFileType = 'Denied_UnsupportedFileType';
  const Denied_UnsupportedConverter = 'Denied_UnsupportedConverter';
  const Denied_OperationDisabled = 'Denied_OperationDisabled';


}
class HPosition
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Absolute = 'Absolute';
  const Random = 'Random';
  const Left = 'Left';
  const Center = 'Center';
  const Right = 'Right';


}
class VPosition
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Absolute = 'Absolute';
  const Random = 'Random';
  const Top = 'Top';
  const Middle = 'Middle';
  const Bottom = 'Bottom';


}
class ScaleMode
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Absolute = 'Absolute';
  const MaintainAspectRatio = 'MaintainAspectRatio';
  const ExactFit = 'ExactFit';


}
class FontStyle
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Regular = 'Regular';
  const Bold = 'Bold';
  const Italic = 'Italic';
  const Underline = 'Underline';
  const Strikeout = 'Strikeout';


}
class HAlign
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Center = 'Center';
  const Justify = 'Justify';
  const Left = 'Left';
  const Right = 'Right';


}
class VAlign
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Middle = 'Middle';
  const Bottom = 'Bottom';
  const Top = 'Top';


}
class WordWrap
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const WordOnly = 'WordOnly';
  const Character = 'Character';
  const None = 'None';
  const Word = 'Word';


}
class ErrorCorrectionLevel
{
  const __default = 'Low';
  const Low = 'Low';
  const Medium = 'Medium';
  const Quartile = 'Quartile';
  const High = 'High';


}
class BarcodeInputMode
{
  const __default = 'Binary';
  const Binary = 'Binary';
  const AlphaNumeric = 'AlphaNumeric';
  const Numeric = 'Numeric';


}
class QRCodeVersion
{
  const __default = 'Auto';
  const Auto = 'Auto';
  const Version01 = 'Version01';
  const Version02 = 'Version02';
  const Version03 = 'Version03';
  const Version04 = 'Version04';
  const Version05 = 'Version05';
  const Version06 = 'Version06';
  const Version07 = 'Version07';
  const Version08 = 'Version08';
  const Version09 = 'Version09';
  const Version10 = 'Version10';
  const Version11 = 'Version11';
  const Version12 = 'Version12';
  const Version13 = 'Version13';
  const Version14 = 'Version14';
  const Version15 = 'Version15';
  const Version16 = 'Version16';
  const Version17 = 'Version17';
  const Version18 = 'Version18';
  const Version19 = 'Version19';
  const Version20 = 'Version20';
  const Version21 = 'Version21';
  const Version22 = 'Version22';
  const Version23 = 'Version23';
  const Version24 = 'Version24';
  const Version25 = 'Version25';
  const Version26 = 'Version26';
  const Version27 = 'Version27';
  const Version28 = 'Version28';
  const Version29 = 'Version29';
  const Version30 = 'Version30';
  const Version31 = 'Version31';
  const Version32 = 'Version32';
  const Version33 = 'Version33';
  const Version34 = 'Version34';
  const Version35 = 'Version35';
  const Version36 = 'Version36';
  const Version37 = 'Version37';
  const Version38 = 'Version38';
  const Version39 = 'Version39';
  const Version40 = 'Version40';


}
class BarcodeType
{
  const __default = 'Codabar';
  const Codabar = 'Codabar';
  const Code11 = 'Code11';
  const Code32 = 'Code32';
  const Code39 = 'Code39';
  const Code39Extended = 'Code39Extended';
  const Code93 = 'Code93';
  const Code93Extended = 'Code93Extended';
  const Code128 = 'Code128';
  const Code128A = 'Code128A';
  const Code128B = 'Code128B';
  const Code128C = 'Code128C';
  const GS1Code128 = 'GS1Code128';
  const UPC_A = 'UPC_A';


}
class BarcodeTextLocation
{
  const __default = 'Bottom';
  const Bottom = 'Bottom';
  const None = 'None';
  const Top = 'Top';


}
class PageOrientation
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Portrait = 'Portrait';
  const Landscape = 'Landscape';
  const Both = 'Both';


}
class PageType
{
  const __default = 'NotSet';
  const NotSet = 'NotSet';
  const DefaultCustom = 'Default';
  const First = 'First';
  const Even = 'Even';


}
class PrimeOCR_AccuracyLevel
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Level1 = 'Level1';
  const Level2 = 'Level2';
  const Level3 = 'Level3';
  const Level4 = 'Level4';
  const Level5 = 'Level5';
  const Level6 = 'Level6';
  const Level7 = 'Level7';


}
class PrimeOCR_Deskew
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Off = 'Off';
  const On = 'On';
  const OnNoZoneAdjust = 'OnNoZoneAdjust';
  const OnNoOutputAdjust = 'OnNoOutputAdjust';
  const OnNoZoneNoOutputAdjust = 'OnNoZoneNoOutputAdjust';


}
class PrimeOCR_ImageProcessingOptions
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const None = 'None';
  const HorizontalRegister = 'HorizontalRegister';
  const VerticalRegister = 'VerticalRegister';
  const HorizontalLineRemoval = 'HorizontalLineRemoval';
  const VerticalLineRemoval = 'VerticalLineRemoval';
  const InverseText = 'InverseText';
  const Deshade = 'Deshade';
  const Despeck = 'Despeck';
  const SubImage = 'SubImage';
  const Rotate = 'Rotate';
  const PeriodRemoval = 'PeriodRemoval';
  const Smooth = 'Smooth';
  const Autorotate = 'Autorotate';
  const Crop = 'Crop';
  const DilatationErosion = 'DilatationErosion';


}
class PrimeOCR_LexicalChecking
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const NoLexical = 'NoLexical';
  const Lexical = 'Lexical';


}
class PrimeOCR_PageQuality
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const NormalQuality = 'NormalQuality';
  const LowQuality = 'LowQuality';


}
class PrimeOCR_PrintType
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const Machine = 'Machine';
  const DotMatrix = 'DotMatrix';
  const MachineFixed = 'MachineFixed';


}
class PrimeOCR_AutoZone
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const NoAutoZone = 'NoAutoZone';
  const Segment = 'Segment';
  const Zone = 'Zone';
  const CGS = 'CGS';
  const SegmentImageText = 'SegmentImageText';
  const ZoneImageText = 'ZoneImageText';
  const NClips = 'NClips';
  const Objects = 'Objects';
  const ObjectsEngineering = 'ObjectsEngineering';


}
class PrimeOCR_ZoneContent
{
  const __default = 'DefaultCustom';
  const DefaultCustom = 'Default';
  const NoRestrictions = 'NoRestrictions';
  const Alpha = 'Alpha';
  const Numeric = 'Numeric';
  const Uppercase = 'Uppercase';
  const Lowercase = 'Lowercase';
  const AlphaUppercase = 'AlphaUppercase';
  const AlphaLowercase = 'AlphaLowercase';
  const OMR = 'OMR';
  const Image = 'Image';
  const Anchor = 'Anchor';
  const AnchorRegion = 'AnchorRegion';
  const Barcode = 'Barcode';


}
class ConverterSpecificSettings
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class ConverterSpecificSettings_WordProcessing
{

  /**
   * 
   * @var RevisionsAndCommentsMarkupMode $RevisionsAndCommentsMarkupMode
   * @access public
   */
  public $RevisionsAndCommentsMarkupMode = null;

  /**
   * 
   * @var RevisionsAndCommentsDisplayMode $RevisionsAndCommentsDisplayMode
   * @access public
   */
  public $RevisionsAndCommentsDisplayMode = null;

  /**
   * 
   * @var boolean $ProcessDocumentTemplate
   * @access public
   */
  public $ProcessDocumentTemplate = null;

  /**
   * 
   * @var BookmarkOptions_WordProcessing $BookmarkOptions
   * @access public
   */
  public $BookmarkOptions = null;

  /**
   * 
   * @var BooleanEnum $IncludeDocumentStructureTags
   * @access public
   */
  public $IncludeDocumentStructureTags = null;

  /**
   * 
   * @param RevisionsAndCommentsMarkupMode $RevisionsAndCommentsMarkupMode
   * @param RevisionsAndCommentsDisplayMode $RevisionsAndCommentsDisplayMode
   * @param boolean $ProcessDocumentTemplate
   * @param BooleanEnum $IncludeDocumentStructureTags
   * @access public
   */
  public function __construct($RevisionsAndCommentsMarkupMode, $RevisionsAndCommentsDisplayMode, $ProcessDocumentTemplate, $IncludeDocumentStructureTags)
  {
    $this->RevisionsAndCommentsMarkupMode = $RevisionsAndCommentsMarkupMode;
    $this->RevisionsAndCommentsDisplayMode = $RevisionsAndCommentsDisplayMode;
    $this->ProcessDocumentTemplate = $ProcessDocumentTemplate;
    $this->IncludeDocumentStructureTags = $IncludeDocumentStructureTags;
  }

}
class ConverterSpecificSettings_Presentations
{

  /**
   * 
   * @var PresentationsPrintOutputType $PrintOutputType
   * @access public
   */
  public $PrintOutputType = null;

  /**
   * 
   * @var boolean $FrameSlides
   * @access public
   */
  public $FrameSlides = null;

  /**
   * 
   * @var BooleanEnum $IncludeDocumentStructureTags
   * @access public
   */
  public $IncludeDocumentStructureTags = null;

  /**
   * 
   * @param PresentationsPrintOutputType $PrintOutputType
   * @param boolean $FrameSlides
   * @param BooleanEnum $IncludeDocumentStructureTags
   * @access public
   */
  public function __construct($PrintOutputType, $FrameSlides, $IncludeDocumentStructureTags)
  {
    $this->PrintOutputType = $PrintOutputType;
    $this->FrameSlides = $FrameSlides;
    $this->IncludeDocumentStructureTags = $IncludeDocumentStructureTags;
  }

}
class ConverterSpecificSettings_Image
{

  /**
   * 
   * @var string $PaperSize
   * @access public
   */
  public $PaperSize = null;

  /**
   * 
   * @var string $PageMargins
   * @access public
   */
  public $PageMargins = null;

  /**
   * 
   * @var boolean $AutoRotatePage
   * @access public
   */
  public $AutoRotatePage = null;

  /**
   * 
   * @var ContentScale $ScaleMode
   * @access public
   */
  public $ScaleMode = null;

  /**
   * 
   * @var string $SourceFileResolution
   * @access public
   */
  public $SourceFileResolution = null;

  /**
   * 
   * @param boolean $AutoRotatePage
   * @param ContentScale $ScaleMode
   * @access public
   */
  public function __construct($AutoRotatePage, $ScaleMode)
  {
    $this->AutoRotatePage = $AutoRotatePage;
    $this->ScaleMode = $ScaleMode;
  }

}
class ConverterSpecificSettings_InfoPath
{

  /**
   * 
   * @var boolean $StripDotNETCode
   * @access public
   */
  public $StripDotNETCode = null;

  /**
   * 
   * @var boolean $StripDataObjects
   * @access public
   */
  public $StripDataObjects = null;

  /**
   * 
   * @var boolean $ConvertAttachments
   * @access public
   */
  public $ConvertAttachments = null;

  /**
   * 
   * @var InfoPathView[] $ConversionViews
   * @access public
   */
  public $ConversionViews = null;

  /**
   * 
   * @var boolean $AutoTrustForms
   * @access public
   */
  public $AutoTrustForms = null;

  /**
   * 
   * @var boolean $ProcessFullTrustForms
   * @access public
   */
  public $ProcessFullTrustForms = null;

  /**
   * 
   * @var boolean $UseNativePrintEngine
   * @access public
   */
  public $UseNativePrintEngine = null;

  /**
   * 
   * @var string $DefaultPaperSize
   * @access public
   */
  public $DefaultPaperSize = null;

  /**
   * 
   * @var string $ForcePaperSize
   * @access public
   */
  public $ForcePaperSize = null;

  /**
   * 
   * @var PageOrientation $DefaultPageOrientation
   * @access public
   */
  public $DefaultPageOrientation = null;

  /**
   * 
   * @var PageOrientation $ForcePageOrientation
   * @access public
   */
  public $ForcePageOrientation = null;

  /**
   * 
   * @var base64Binary $XSNData
   * @access public
   */
  public $XSNData = null;

  /**
   * 
   * @var MergeMode $AttachmentMergeMode
   * @access public
   */
  public $AttachmentMergeMode = null;

  /**
   * 
   * @var UnsupportedFileBehaviour $UnsupportedAttachmentBehaviour
   * @access public
   */
  public $UnsupportedAttachmentBehaviour = null;

  /**
   * 
   * @var boolean $BreakMergeOnError
   * @access public
   */
  public $BreakMergeOnError = null;

  /**
   * 
   * @var string $IncludeAttachmentTypes
   * @access public
   */
  public $IncludeAttachmentTypes = null;

  /**
   * 
   * @var string $ExcludeAttachmentTypes
   * @access public
   */
  public $ExcludeAttachmentTypes = null;

  /**
   * 
   * @var BooleanEnum $ProcessRuleSets
   * @access public
   */
  public $ProcessRuleSets = null;

  /**
   * 
   * @var string $XSNUserName
   * @access public
   */
  public $XSNUserName = null;

  /**
   * 
   * @var string $XSNPassword
   * @access public
   */
  public $XSNPassword = null;

  /**
   * 
   * @var string $XSNDomain
   * @access public
   */
  public $XSNDomain = null;

  /**
   * 
   * @param boolean $StripDotNETCode
   * @param boolean $StripDataObjects
   * @param boolean $ConvertAttachments
   * @param boolean $AutoTrustForms
   * @param boolean $ProcessFullTrustForms
   * @param boolean $UseNativePrintEngine
   * @param PageOrientation $DefaultPageOrientation
   * @param PageOrientation $ForcePageOrientation
   * @param MergeMode $AttachmentMergeMode
   * @param UnsupportedFileBehaviour $UnsupportedAttachmentBehaviour
   * @param boolean $BreakMergeOnError
   * @param BooleanEnum $ProcessRuleSets
   * @access public
   */
  public function __construct($StripDotNETCode, $StripDataObjects, $ConvertAttachments, $AutoTrustForms, $ProcessFullTrustForms, $UseNativePrintEngine, $DefaultPageOrientation, $ForcePageOrientation, $AttachmentMergeMode, $UnsupportedAttachmentBehaviour, $BreakMergeOnError, $ProcessRuleSets)
  {
    $this->StripDotNETCode = $StripDotNETCode;
    $this->StripDataObjects = $StripDataObjects;
    $this->ConvertAttachments = $ConvertAttachments;
    $this->AutoTrustForms = $AutoTrustForms;
    $this->ProcessFullTrustForms = $ProcessFullTrustForms;
    $this->UseNativePrintEngine = $UseNativePrintEngine;
    $this->DefaultPageOrientation = $DefaultPageOrientation;
    $this->ForcePageOrientation = $ForcePageOrientation;
    $this->AttachmentMergeMode = $AttachmentMergeMode;
    $this->UnsupportedAttachmentBehaviour = $UnsupportedAttachmentBehaviour;
    $this->BreakMergeOnError = $BreakMergeOnError;
    $this->ProcessRuleSets = $ProcessRuleSets;
  }

}
class InfoPathView
{

  /**
   * 
   * @var string $Name
   * @access public
   */
  public $Name = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class ConverterSpecificSettings_Cad
{

  /**
   * 
   * @var string $PaperSize
   * @access public
   */
  public $PaperSize = null;

  /**
   * 
   * @var string $BackgroundColor
   * @access public
   */
  public $BackgroundColor = null;

  /**
   * 
   * @var string $ForegroundColor
   * @access public
   */
  public $ForegroundColor = null;

  /**
   * 
   * @var CadConversionElement[] $CadConversionElements
   * @access public
   */
  public $CadConversionElements = null;

  /**
   * 
   * @var string $PageMargins
   * @access public
   */
  public $PageMargins = null;

  /**
   * 
   * @var CadEmptyLayoutDetectionMode $EmptyLayoutDetectionMode
   * @access public
   */
  public $EmptyLayoutDetectionMode = null;

  /**
   * 
   * @var CadLayoutSortOrder $LayoutSortOrder
   * @access public
   */
  public $LayoutSortOrder = null;

  /**
   * 
   * @var string $ExternalReferences
   * @access public
   */
  public $ExternalReferences = null;

  /**
   * 
   * @param CadEmptyLayoutDetectionMode $EmptyLayoutDetectionMode
   * @param CadLayoutSortOrder $LayoutSortOrder
   * @access public
   */
  public function __construct($EmptyLayoutDetectionMode, $LayoutSortOrder)
  {
    $this->EmptyLayoutDetectionMode = $EmptyLayoutDetectionMode;
    $this->LayoutSortOrder = $LayoutSortOrder;
  }

}
class CadConversionElement
{

  /**
   * 
   * @var CadConversionElementType $Type
   * @access public
   */
  public $Type = null;

  /**
   * 
   * @var string $Name
   * @access public
   */
  public $Name = null;

  /**
   * 
   * @param CadConversionElementType $Type
   * @access public
   */
  public function __construct($Type)
  {
    $this->Type = $Type;
  }

}
class ConverterSpecificSettings_HTML
{

  /**
   * 
   * @var string $PaperSize
   * @access public
   */
  public $PaperSize = null;

  /**
   * 
   * @var HTMLScaleMode $ScaleMode
   * @access public
   */
  public $ScaleMode = null;

  /**
   * 
   * @var string $PageMargins
   * @access public
   */
  public $PageMargins = null;

  /**
   * 
   * @var int $ConversionDelay
   * @access public
   */
  public $ConversionDelay = null;

  /**
   * 
   * @var boolean $ClearBrowserCache
   * @access public
   */
  public $ClearBrowserCache = null;

  /**
   * 
   * @var boolean $SplitImages
   * @access public
   */
  public $SplitImages = null;

  /**
   * 
   * @var HTMLRenderingEngine $HtmlRenderingEngine
   * @access public
   */
  public $HtmlRenderingEngine = null;

  /**
   * 
   * @var string $WebKitViewPortSize
   * @access public
   */
  public $WebKitViewPortSize = null;

  /**
   * 
   * @var AuthenticationMode $AuthenticationMode
   * @access public
   */
  public $AuthenticationMode = null;

  /**
   * 
   * @var MediaType $MediaType
   * @access public
   */
  public $MediaType = null;

  /**
   * 
   * @var boolean $EnableWebKitOfflineMode
   * @access public
   */
  public $EnableWebKitOfflineMode = null;

  /**
   * 
   * @param HTMLScaleMode $ScaleMode
   * @param int $ConversionDelay
   * @param boolean $ClearBrowserCache
   * @param boolean $SplitImages
   * @param HTMLRenderingEngine $HtmlRenderingEngine
   * @param AuthenticationMode $AuthenticationMode
   * @param MediaType $MediaType
   * @param boolean $EnableWebKitOfflineMode
   * @access public
   */
  public function __construct($ScaleMode, $ConversionDelay, $ClearBrowserCache, $SplitImages, $HtmlRenderingEngine, $AuthenticationMode, $MediaType, $EnableWebKitOfflineMode)
  {
    $this->ScaleMode = $ScaleMode;
    $this->ConversionDelay = $ConversionDelay;
    $this->ClearBrowserCache = $ClearBrowserCache;
    $this->SplitImages = $SplitImages;
    $this->HtmlRenderingEngine = $HtmlRenderingEngine;
    $this->AuthenticationMode = $AuthenticationMode;
    $this->MediaType = $MediaType;
    $this->EnableWebKitOfflineMode = $EnableWebKitOfflineMode;
  }

}
class ConverterSpecificSettings_MSG
{

  /**
   * 
   * @var boolean $ConvertAttachments
   * @access public
   */
  public $ConvertAttachments = null;

  /**
   * 
   * @var string $PaperSize
   * @access public
   */
  public $PaperSize = null;

  /**
   * 
   * @var HTMLScaleMode $HTMLScaleMode
   * @access public
   */
  public $HTMLScaleMode = null;

  /**
   * 
   * @var MSGPlainTextLineBreaks $PlainTextLineBreaks
   * @access public
   */
  public $PlainTextLineBreaks = null;

  /**
   * 
   * @var MSGBestBodyMode $BestBodyMode
   * @access public
   */
  public $BestBodyMode = null;

  /**
   * 
   * @var MSGEmailAddressDisplayMode $EmailAddressDisplayMode
   * @access public
   */
  public $EmailAddressDisplayMode = null;

  /**
   * 
   * @var MSGEmailAddressDisplayMode $FromEmailAddressDisplayMode
   * @access public
   */
  public $FromEmailAddressDisplayMode = null;

  /**
   * 
   * @var boolean $DisplayAttachmentSummary
   * @access public
   */
  public $DisplayAttachmentSummary = null;

  /**
   * 
   * @var boolean $BreakOnUnsupportedAttachment
   * @access public
   */
  public $BreakOnUnsupportedAttachment = null;

  /**
   * 
   * @var boolean $BreakOnUnsupportedEmbeddedObject
   * @access public
   */
  public $BreakOnUnsupportedEmbeddedObject = null;

  /**
   * 
   * @var MSGEmbeddedObjectDisplayMode $EmbeddedObjectDisplayMode
   * @access public
   */
  public $EmbeddedObjectDisplayMode = null;

  /**
   * 
   * @var MSGEmbeddedObjectIconDisplayMode $EmbeddedObjectIconDisplayMode
   * @access public
   */
  public $EmbeddedObjectIconDisplayMode = null;

  /**
   * 
   * @var float $EmbeddedObjectScalePercentage
   * @access public
   */
  public $EmbeddedObjectScalePercentage = null;

  /**
   * 
   * @var string $SentDateMissingDisplayMode
   * @access public
   */
  public $SentDateMissingDisplayMode = null;

  /**
   * 
   * @var HTMLRenderingEngine $HtmlRenderingEngine
   * @access public
   */
  public $HtmlRenderingEngine = null;

  /**
   * 
   * @var string $WebKitViewPortSize
   * @access public
   */
  public $WebKitViewPortSize = null;

  /**
   * 
   * @var boolean $EnableWebKitOfflineMode
   * @access public
   */
  public $EnableWebKitOfflineMode = null;

  /**
   * 
   * @var string $PageMargins
   * @access public
   */
  public $PageMargins = null;

  /**
   * 
   * @var MergeMode $AttachmentMergeMode
   * @access public
   */
  public $AttachmentMergeMode = null;

  /**
   * 
   * @var UnsupportedFileBehaviour $UnsupportedAttachmentBehaviour
   * @access public
   */
  public $UnsupportedAttachmentBehaviour = null;

  /**
   * 
   * @var boolean $BreakMergeOnError
   * @access public
   */
  public $BreakMergeOnError = null;

  /**
   * 
   * @var ForceMessageHeaderEncoding $ForceMessageHeaderEncoding
   * @access public
   */
  public $ForceMessageHeaderEncoding = null;

  /**
   * 
   * @var int $MinimumImageAttachmentDimension
   * @access public
   */
  public $MinimumImageAttachmentDimension = null;

  /**
   * 
   * @var string $IncludeAttachmentTypes
   * @access public
   */
  public $IncludeAttachmentTypes = null;

  /**
   * 
   * @var string $ExcludeAttachmentTypes
   * @access public
   */
  public $ExcludeAttachmentTypes = null;

  /**
   * 
   * @param boolean $ConvertAttachments
   * @param HTMLScaleMode $HTMLScaleMode
   * @param MSGPlainTextLineBreaks $PlainTextLineBreaks
   * @param MSGBestBodyMode $BestBodyMode
   * @param MSGEmailAddressDisplayMode $EmailAddressDisplayMode
   * @param MSGEmailAddressDisplayMode $FromEmailAddressDisplayMode
   * @param boolean $DisplayAttachmentSummary
   * @param boolean $BreakOnUnsupportedAttachment
   * @param boolean $BreakOnUnsupportedEmbeddedObject
   * @param MSGEmbeddedObjectDisplayMode $EmbeddedObjectDisplayMode
   * @param MSGEmbeddedObjectIconDisplayMode $EmbeddedObjectIconDisplayMode
   * @param float $EmbeddedObjectScalePercentage
   * @param HTMLRenderingEngine $HtmlRenderingEngine
   * @param boolean $EnableWebKitOfflineMode
   * @param MergeMode $AttachmentMergeMode
   * @param UnsupportedFileBehaviour $UnsupportedAttachmentBehaviour
   * @param boolean $BreakMergeOnError
   * @param ForceMessageHeaderEncoding $ForceMessageHeaderEncoding
   * @param int $MinimumImageAttachmentDimension
   * @access public
   */
  public function __construct($ConvertAttachments, $HTMLScaleMode, $PlainTextLineBreaks, $BestBodyMode, $EmailAddressDisplayMode, $FromEmailAddressDisplayMode, $DisplayAttachmentSummary, $BreakOnUnsupportedAttachment, $BreakOnUnsupportedEmbeddedObject, $EmbeddedObjectDisplayMode, $EmbeddedObjectIconDisplayMode, $EmbeddedObjectScalePercentage, $HtmlRenderingEngine, $EnableWebKitOfflineMode, $AttachmentMergeMode, $UnsupportedAttachmentBehaviour, $BreakMergeOnError, $ForceMessageHeaderEncoding, $MinimumImageAttachmentDimension)
  {
    $this->ConvertAttachments = $ConvertAttachments;
    $this->HTMLScaleMode = $HTMLScaleMode;
    $this->PlainTextLineBreaks = $PlainTextLineBreaks;
    $this->BestBodyMode = $BestBodyMode;
    $this->EmailAddressDisplayMode = $EmailAddressDisplayMode;
    $this->FromEmailAddressDisplayMode = $FromEmailAddressDisplayMode;
    $this->DisplayAttachmentSummary = $DisplayAttachmentSummary;
    $this->BreakOnUnsupportedAttachment = $BreakOnUnsupportedAttachment;
    $this->BreakOnUnsupportedEmbeddedObject = $BreakOnUnsupportedEmbeddedObject;
    $this->EmbeddedObjectDisplayMode = $EmbeddedObjectDisplayMode;
    $this->EmbeddedObjectIconDisplayMode = $EmbeddedObjectIconDisplayMode;
    $this->EmbeddedObjectScalePercentage = $EmbeddedObjectScalePercentage;
    $this->HtmlRenderingEngine = $HtmlRenderingEngine;
    $this->EnableWebKitOfflineMode = $EnableWebKitOfflineMode;
    $this->AttachmentMergeMode = $AttachmentMergeMode;
    $this->UnsupportedAttachmentBehaviour = $UnsupportedAttachmentBehaviour;
    $this->BreakMergeOnError = $BreakMergeOnError;
    $this->ForceMessageHeaderEncoding = $ForceMessageHeaderEncoding;
    $this->MinimumImageAttachmentDimension = $MinimumImageAttachmentDimension;
  }

}
class ConverterSpecificSettings_CommandLineConverter
{

  /**
   * 
   * @var string $Parameter1
   * @access public
   */
  public $Parameter1 = null;

  /**
   * 
   * @var string $Parameter2
   * @access public
   */
  public $Parameter2 = null;

  /**
   * 
   * @var string $Parameter3
   * @access public
   */
  public $Parameter3 = null;

  /**
   * 
   * @var string $Parameter4
   * @access public
   */
  public $Parameter4 = null;

  /**
   * 
   * @var string $Parameter5
   * @access public
   */
  public $Parameter5 = null;

  /**
   * 
   * @var string $Parameter6
   * @access public
   */
  public $Parameter6 = null;

  /**
   * 
   * @var string $Parameter7
   * @access public
   */
  public $Parameter7 = null;

  /**
   * 
   * @var string $Parameter8
   * @access public
   */
  public $Parameter8 = null;

  /**
   * 
   * @var string $Parameter9
   * @access public
   */
  public $Parameter9 = null;

  /**
   * 
   * @var string $Parameter10
   * @access public
   */
  public $Parameter10 = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class ConverterSpecificSettings_TIFF
{

  /**
   * 
   * @var string $PaperSize
   * @access public
   */
  public $PaperSize = null;

  /**
   * 
   * @var string $PageMargins
   * @access public
   */
  public $PageMargins = null;

  /**
   * 
   * @var boolean $AutoRotatePage
   * @access public
   */
  public $AutoRotatePage = null;

  /**
   * 
   * @var ContentScale $ScaleMode
   * @access public
   */
  public $ScaleMode = null;

  /**
   * 
   * @var string $SourceFileResolution
   * @access public
   */
  public $SourceFileResolution = null;

  /**
   * 
   * @param boolean $AutoRotatePage
   * @param ContentScale $ScaleMode
   * @access public
   */
  public function __construct($AutoRotatePage, $ScaleMode)
  {
    $this->AutoRotatePage = $AutoRotatePage;
    $this->ScaleMode = $ScaleMode;
  }

}
class BookmarkMapping
{

  /**
   * 
   * @var string $Source
   * @access public
   */
  public $Source = null;

  /**
   * 
   * @var int $Level
   * @access public
   */
  public $Level = null;

  /**
   * 
   * @param int $Level
   * @access public
   */
  public function __construct($Level)
  {
    $this->Level = $Level;
  }

}
class OCREngineSpecificSettings
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class OCREngineSpecificSettings_PrimeOCR
{

  /**
   * 
   * @var int $AccuracyLevel
   * @access public
   */
  public $AccuracyLevel = null;

  /**
   * 
   * @var PrimeOCR_Deskew $Deskew
   * @access public
   */
  public $Deskew = null;

  /**
   * 
   * @var PrimeOCR_ImageProcessingOptions $ImageProcessingOptions
   * @access public
   */
  public $ImageProcessingOptions = null;

  /**
   * 
   * @var PrimeOCR_LexicalChecking $LexicalChecking
   * @access public
   */
  public $LexicalChecking = null;

  /**
   * 
   * @var PrimeOCR_PageQuality $PageQuality
   * @access public
   */
  public $PageQuality = null;

  /**
   * 
   * @var PrimeOCR_PrintType $PrintType
   * @access public
   */
  public $PrintType = null;

  /**
   * 
   * @var PrimeOCR_AutoZone $AutoZone
   * @access public
   */
  public $AutoZone = null;

  /**
   * 
   * @var PrimeOCR_ZoneContent $ZoneContent
   * @access public
   */
  public $ZoneContent = null;

  /**
   * 
   * @param int $AccuracyLevel
   * @param PrimeOCR_Deskew $Deskew
   * @param PrimeOCR_ImageProcessingOptions $ImageProcessingOptions
   * @param PrimeOCR_LexicalChecking $LexicalChecking
   * @param PrimeOCR_PageQuality $PageQuality
   * @param PrimeOCR_PrintType $PrintType
   * @param PrimeOCR_AutoZone $AutoZone
   * @param PrimeOCR_ZoneContent $ZoneContent
   * @access public
   */
  public function __construct($AccuracyLevel, $Deskew, $ImageProcessingOptions, $LexicalChecking, $PageQuality, $PrintType, $AutoZone, $ZoneContent)
  {
    $this->AccuracyLevel = $AccuracyLevel;
    $this->Deskew = $Deskew;
    $this->ImageProcessingOptions = $ImageProcessingOptions;
    $this->LexicalChecking = $LexicalChecking;
    $this->PageQuality = $PageQuality;
    $this->PrintType = $PrintType;
    $this->AutoZone = $AutoZone;
    $this->ZoneContent = $ZoneContent;
  }

}
class SystemSettings
{

  /**
   * 
   * @var TaskMonitorSettings $TaskMonitorSettings
   * @access public
   */
  public $TaskMonitorSettings = null;

  /**
   * 
   * @var string $CultureName
   * @access public
   */
  public $CultureName = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class TaskMonitorSettings
{

  /**
   * 
   * @var int $MaxHungCount
   * @access public
   */
  public $MaxHungCount = null;

  /**
   * 
   * @var int $MaxPendingCount
   * @access public
   */
  public $MaxPendingCount = null;

  /**
   * 
   * @var int $MaxRunDuration
   * @access public
   */
  public $MaxRunDuration = null;

  /**
   * 
   * @param int $MaxHungCount
   * @param int $MaxPendingCount
   * @param int $MaxRunDuration
   * @access public
   */
  public function __construct($MaxHungCount, $MaxPendingCount, $MaxRunDuration)
  {
    $this->MaxHungCount = $MaxHungCount;
    $this->MaxPendingCount = $MaxPendingCount;
    $this->MaxRunDuration = $MaxRunDuration;
  }

}
class ConverterSpecificSettings_Spreadsheets
{

  /**
   * 
   * @var int $FitToPagesWide
   * @access public
   */
  public $FitToPagesWide = null;

  /**
   * 
   * @var int $FitToPagesTall
   * @access public
   */
  public $FitToPagesTall = null;

  /**
   * 
   * @var boolean $UnhideAllRows
   * @access public
   */
  public $UnhideAllRows = null;

  /**
   * 
   * @var boolean $UnhideAllColumns
   * @access public
   */
  public $UnhideAllColumns = null;

  /**
   * 
   * @param int $FitToPagesWide
   * @param int $FitToPagesTall
   * @param boolean $UnhideAllRows
   * @param boolean $UnhideAllColumns
   * @access public
   */
  public function __construct($FitToPagesWide, $FitToPagesTall, $UnhideAllRows, $UnhideAllColumns)
  {
    $this->FitToPagesWide = $FitToPagesWide;
    $this->FitToPagesTall = $FitToPagesTall;
    $this->UnhideAllRows = $UnhideAllRows;
    $this->UnhideAllColumns = $UnhideAllColumns;
  }

}
class SubscriptionSettings
{

  /**
   * 
   * @var string $SubscriptionID
   * @access public
   */
  public $SubscriptionID = null;

  /**
   * 
   * @var boolean $ForceTrialWatermark
   * @access public
   */
  public $ForceTrialWatermark = null;

  /**
   * 
   * @param boolean $ForceTrialWatermark
   * @access public
   */
  public function __construct($ForceTrialWatermark)
  {
    $this->ForceTrialWatermark = $ForceTrialWatermark;
  }

}
class Watermark
{

  /**
   * 
   * @var PageOrientation $PageOrientation
   * @access public
   */
  public $PageOrientation = null;

  /**
   * 
   * @var int $StartPage
   * @access public
   */
  public $StartPage = null;

  /**
   * 
   * @var int $EndPage
   * @access public
   */
  public $EndPage = null;

  /**
   * 
   * @var int $PageInterval
   * @access public
   */
  public $PageInterval = null;

  /**
   * 
   * @var string $PageRange
   * @access public
   */
  public $PageRange = null;

  /**
   * 
   * @var boolean $PrintOnly
   * @access public
   */
  public $PrintOnly = null;

  /**
   * 
   * @var int $StartSection
   * @access public
   */
  public $StartSection = null;

  /**
   * 
   * @var int $EndSection
   * @access public
   */
  public $EndSection = null;

  /**
   * 
   * @var string $SectionRange
   * @access public
   */
  public $SectionRange = null;

  /**
   * 
   * @var PageType $PageType
   * @access public
   */
  public $PageType = null;

  /**
   * 
   * @param PageOrientation $PageOrientation
   * @param int $StartPage
   * @param int $EndPage
   * @param int $PageInterval
   * @param boolean $PrintOnly
   * @param int $StartSection
   * @param int $EndSection
   * @param PageType $PageType
   * @access public
   */
  public function __construct($PageOrientation, $StartPage, $EndPage, $PageInterval, $PrintOnly, $StartSection, $EndSection, $PageType)
  {
    $this->PageOrientation = $PageOrientation;
    $this->StartPage = $StartPage;
    $this->EndPage = $EndPage;
    $this->PageInterval = $PageInterval;
    $this->PrintOnly = $PrintOnly;
    $this->StartSection = $StartSection;
    $this->EndSection = $EndSection;
    $this->PageType = $PageType;
  }

}
class Container
{

  /**
   * 
   * @var Element[] $Elements
   * @access public
   */
  public $Elements = null;

  /**
   * 
   * @var Defaults $Defaults
   * @access public
   */
  public $Defaults = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Element
{

  /**
   * 
   * @var HPosition $HPosition
   * @access public
   */
  public $HPosition = null;

  /**
   * 
   * @var VPosition $VPosition
   * @access public
   */
  public $VPosition = null;

  /**
   * 
   * @var string $X
   * @access public
   */
  public $X = null;

  /**
   * 
   * @var string $Y
   * @access public
   */
  public $Y = null;

  /**
   * 
   * @var string $Width
   * @access public
   */
  public $Width = null;

  /**
   * 
   * @var string $Height
   * @access public
   */
  public $Height = null;

  /**
   * 
   * @var int $ZOrder
   * @access public
   */
  public $ZOrder = null;

  /**
   * 
   * @var ScaleMode $ScaleMode
   * @access public
   */
  public $ScaleMode = null;

  /**
   * 
   * @var string $ScaleX
   * @access public
   */
  public $ScaleX = null;

  /**
   * 
   * @var string $ScaleY
   * @access public
   */
  public $ScaleY = null;

  /**
   * 
   * @var string $Rotation
   * @access public
   */
  public $Rotation = null;

  /**
   * 
   * @var string $Transparency
   * @access public
   */
  public $Transparency = null;

  /**
   * 
   * @var string $LineColor
   * @access public
   */
  public $LineColor = null;

  /**
   * 
   * @var string $LineWidth
   * @access public
   */
  public $LineWidth = null;

  /**
   * 
   * @var string $FillColor
   * @access public
   */
  public $FillColor = null;

  /**
   * 
   * @param HPosition $HPosition
   * @param VPosition $VPosition
   * @param int $ZOrder
   * @param ScaleMode $ScaleMode
   * @access public
   */
  public function __construct($HPosition, $VPosition, $ZOrder, $ScaleMode)
  {
    $this->HPosition = $HPosition;
    $this->VPosition = $VPosition;
    $this->ZOrder = $ZOrder;
    $this->ScaleMode = $ScaleMode;
  }

}
class Defaults
{

  /**
   * 
   * @var HPosition $HPosition
   * @access public
   */
  public $HPosition = null;

  /**
   * 
   * @var VPosition $VPosition
   * @access public
   */
  public $VPosition = null;

  /**
   * 
   * @var string $X
   * @access public
   */
  public $X = null;

  /**
   * 
   * @var string $Y
   * @access public
   */
  public $Y = null;

  /**
   * 
   * @var string $Rotation
   * @access public
   */
  public $Rotation = null;

  /**
   * 
   * @var string $Transparency
   * @access public
   */
  public $Transparency = null;

  /**
   * 
   * @var string $LineColor
   * @access public
   */
  public $LineColor = null;

  /**
   * 
   * @var string $LineWidth
   * @access public
   */
  public $LineWidth = null;

  /**
   * 
   * @var string $FillColor
   * @access public
   */
  public $FillColor = null;

  /**
   * 
   * @var string $FontFamilyName
   * @access public
   */
  public $FontFamilyName = null;

  /**
   * 
   * @var string $FontSize
   * @access public
   */
  public $FontSize = null;

  /**
   * 
   * @var FontStyle $FontStyle
   * @access public
   */
  public $FontStyle = null;

  /**
   * 
   * @var HAlign $HAlign
   * @access public
   */
  public $HAlign = null;

  /**
   * 
   * @var VAlign $VAlign
   * @access public
   */
  public $VAlign = null;

  /**
   * 
   * @var WordWrap $WordWrap
   * @access public
   */
  public $WordWrap = null;

  /**
   * 
   * @var ScaleMode $ScaleMode
   * @access public
   */
  public $ScaleMode = null;

  /**
   * 
   * @var string $ScaleX
   * @access public
   */
  public $ScaleX = null;

  /**
   * 
   * @var string $ScaleY
   * @access public
   */
  public $ScaleY = null;

  /**
   * 
   * @param HPosition $HPosition
   * @param VPosition $VPosition
   * @param FontStyle $FontStyle
   * @param HAlign $HAlign
   * @param VAlign $VAlign
   * @param WordWrap $WordWrap
   * @param ScaleMode $ScaleMode
   * @access public
   */
  public function __construct($HPosition, $VPosition, $FontStyle, $HAlign, $VAlign, $WordWrap, $ScaleMode)
  {
    $this->HPosition = $HPosition;
    $this->VPosition = $VPosition;
    $this->FontStyle = $FontStyle;
    $this->HAlign = $HAlign;
    $this->VAlign = $VAlign;
    $this->WordWrap = $WordWrap;
    $this->ScaleMode = $ScaleMode;
  }

}
class Text
{

  /**
   * 
   * @var string $Content
   * @access public
   */
  public $Content = null;

  /**
   * 
   * @var string $FontFamilyName
   * @access public
   */
  public $FontFamilyName = null;

  /**
   * 
   * @var string $FontSize
   * @access public
   */
  public $FontSize = null;

  /**
   * 
   * @var FontStyle $FontStyle
   * @access public
   */
  public $FontStyle = null;

  /**
   * 
   * @var WordWrap $WordWrap
   * @access public
   */
  public $WordWrap = null;

  /**
   * 
   * @var HAlign $HAlign
   * @access public
   */
  public $HAlign = null;

  /**
   * 
   * @var VAlign $VAlign
   * @access public
   */
  public $VAlign = null;

  /**
   * 
   * @param FontStyle $FontStyle
   * @param WordWrap $WordWrap
   * @param HAlign $HAlign
   * @param VAlign $VAlign
   * @access public
   */
  public function __construct($FontStyle, $WordWrap, $HAlign, $VAlign)
  {
    $this->FontStyle = $FontStyle;
    $this->WordWrap = $WordWrap;
    $this->HAlign = $HAlign;
    $this->VAlign = $VAlign;
  }

}
class Pdf
{

  /**
   * 
   * @var base64Binary $PdfData
   * @access public
   */
  public $PdfData = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Rtf
{

  /**
   * 
   * @var string $RtfData
   * @access public
   */
  public $RtfData = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Image
{

  /**
   * 
   * @var base64Binary $ImageData
   * @access public
   */
  public $ImageData = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Rectangle
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Ellipse
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Line
{

  /**
   * 
   * @var string $EndX
   * @access public
   */
  public $EndX = null;

  /**
   * 
   * @var string $EndY
   * @access public
   */
  public $EndY = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class QRCode
{

  /**
   * 
   * @var string $Text
   * @access public
   */
  public $Text = null;

  /**
   * 
   * @var ErrorCorrectionLevel $ErrorCorrectionLevel
   * @access public
   */
  public $ErrorCorrectionLevel = null;

  /**
   * 
   * @var BarcodeInputMode $InputMode
   * @access public
   */
  public $InputMode = null;

  /**
   * 
   * @var QRCodeVersion $Version
   * @access public
   */
  public $Version = null;

  /**
   * 
   * @param ErrorCorrectionLevel $ErrorCorrectionLevel
   * @param BarcodeInputMode $InputMode
   * @param QRCodeVersion $Version
   * @access public
   */
  public function __construct($ErrorCorrectionLevel, $InputMode, $Version)
  {
    $this->ErrorCorrectionLevel = $ErrorCorrectionLevel;
    $this->InputMode = $InputMode;
    $this->Version = $Version;
  }

}
class LinearBarcode
{

  /**
   * 
   * @var string $Text
   * @access public
   */
  public $Text = null;

  /**
   * 
   * @var BarcodeType $BarcodeType
   * @access public
   */
  public $BarcodeType = null;

  /**
   * 
   * @var boolean $OmitStartStopSymbols
   * @access public
   */
  public $OmitStartStopSymbols = null;

  /**
   * 
   * @var boolean $DisableCheckDigit
   * @access public
   */
  public $DisableCheckDigit = null;

  /**
   * 
   * @var boolean $ShowCheckDigit
   * @access public
   */
  public $ShowCheckDigit = null;

  /**
   * 
   * @var BarcodeTextLocation $TextLocation
   * @access public
   */
  public $TextLocation = null;

  /**
   * 
   * @var string $BarcodeToTextGapHeight
   * @access public
   */
  public $BarcodeToTextGapHeight = null;

  /**
   * 
   * @var string $FontFamilyName
   * @access public
   */
  public $FontFamilyName = null;

  /**
   * 
   * @var string $FontSize
   * @access public
   */
  public $FontSize = null;

  /**
   * 
   * @var FontStyle $FontStyle
   * @access public
   */
  public $FontStyle = null;

  /**
   * 
   * @var HAlign $TextAlignment
   * @access public
   */
  public $TextAlignment = null;

  /**
   * 
   * @var string $Margin
   * @access public
   */
  public $Margin = null;

  /**
   * 
   * @param BarcodeType $BarcodeType
   * @param boolean $OmitStartStopSymbols
   * @param boolean $DisableCheckDigit
   * @param boolean $ShowCheckDigit
   * @param BarcodeTextLocation $TextLocation
   * @param FontStyle $FontStyle
   * @param HAlign $TextAlignment
   * @access public
   */
  public function __construct($BarcodeType, $OmitStartStopSymbols, $DisableCheckDigit, $ShowCheckDigit, $TextLocation, $FontStyle, $TextAlignment)
  {
    $this->BarcodeType = $BarcodeType;
    $this->OmitStartStopSymbols = $OmitStartStopSymbols;
    $this->DisableCheckDigit = $DisableCheckDigit;
    $this->ShowCheckDigit = $ShowCheckDigit;
    $this->TextLocation = $TextLocation;
    $this->FontStyle = $FontStyle;
    $this->TextAlignment = $TextAlignment;
  }

}
class OutputFormatSpecificSettings
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class OutputFormatSpecificSettings_PDF
{

  /**
   * 
   * @var boolean $FastWebView
   * @access public
   */
  public $FastWebView = null;

  /**
   * 
   * @var boolean $EmbedAllFonts
   * @access public
   */
  public $EmbedAllFonts = null;

  /**
   * 
   * @var boolean $SubsetFonts
   * @access public
   */
  public $SubsetFonts = null;

  /**
   * 
   * @var PDFViewerPreferences $ViewerPreferences
   * @access public
   */
  public $ViewerPreferences = null;

  /**
   * 
   * @var boolean $PostProcessFile
   * @access public
   */
  public $PostProcessFile = null;

  /**
   * 
   * @var NamedDestinationProcessingMode $NamedDestinationProcessingMode
   * @access public
   */
  public $NamedDestinationProcessingMode = null;

  /**
   * 
   * @param boolean $FastWebView
   * @param boolean $EmbedAllFonts
   * @param boolean $SubsetFonts
   * @param boolean $PostProcessFile
   * @param NamedDestinationProcessingMode $NamedDestinationProcessingMode
   * @access public
   */
  public function __construct($FastWebView, $EmbedAllFonts, $SubsetFonts, $PostProcessFile, $NamedDestinationProcessingMode)
  {
    $this->FastWebView = $FastWebView;
    $this->EmbedAllFonts = $EmbedAllFonts;
    $this->SubsetFonts = $SubsetFonts;
    $this->PostProcessFile = $PostProcessFile;
    $this->NamedDestinationProcessingMode = $NamedDestinationProcessingMode;
  }

}
class PDFViewerPreferences
{

  /**
   * 
   * @var boolean $CenterWindow
   * @access public
   */
  public $CenterWindow = null;

  /**
   * 
   * @var boolean $DisplayTitle
   * @access public
   */
  public $DisplayTitle = null;

  /**
   * 
   * @var boolean $FitWindow
   * @access public
   */
  public $FitWindow = null;

  /**
   * 
   * @var boolean $HideMenubar
   * @access public
   */
  public $HideMenubar = null;

  /**
   * 
   * @var boolean $HideToolbar
   * @access public
   */
  public $HideToolbar = null;

  /**
   * 
   * @var boolean $HideWindowUI
   * @access public
   */
  public $HideWindowUI = null;

  /**
   * 
   * @var PDFPageLayout $PageLayout
   * @access public
   */
  public $PageLayout = null;

  /**
   * 
   * @var PDFNavigationPane $NavigationPane
   * @access public
   */
  public $NavigationPane = null;

  /**
   * 
   * @var boolean $HideEmptyNavigationPane
   * @access public
   */
  public $HideEmptyNavigationPane = null;

  /**
   * 
   * @var PDFPageScalingMode $PageScalingMode
   * @access public
   */
  public $PageScalingMode = null;

  /**
   * 
   * @var boolean $FullScreen
   * @access public
   */
  public $FullScreen = null;

  /**
   * 
   * @param boolean $CenterWindow
   * @param boolean $DisplayTitle
   * @param boolean $FitWindow
   * @param boolean $HideMenubar
   * @param boolean $HideToolbar
   * @param boolean $HideWindowUI
   * @param PDFPageLayout $PageLayout
   * @param PDFNavigationPane $NavigationPane
   * @param boolean $HideEmptyNavigationPane
   * @param PDFPageScalingMode $PageScalingMode
   * @param boolean $FullScreen
   * @access public
   */
  public function __construct($CenterWindow, $DisplayTitle, $FitWindow, $HideMenubar, $HideToolbar, $HideWindowUI, $PageLayout, $NavigationPane, $HideEmptyNavigationPane, $PageScalingMode, $FullScreen)
  {
    $this->CenterWindow = $CenterWindow;
    $this->DisplayTitle = $DisplayTitle;
    $this->FitWindow = $FitWindow;
    $this->HideMenubar = $HideMenubar;
    $this->HideToolbar = $HideToolbar;
    $this->HideWindowUI = $HideWindowUI;
    $this->PageLayout = $PageLayout;
    $this->NavigationPane = $NavigationPane;
    $this->HideEmptyNavigationPane = $HideEmptyNavigationPane;
    $this->PageScalingMode = $PageScalingMode;
    $this->FullScreen = $FullScreen;
  }

}
class TOCSettings
{

  /**
   * 
   * @var string $Template
   * @access public
   */
  public $Template = null;

  /**
   * 
   * @var NameValuePair[] $Properties
   * @access public
   */
  public $Properties = null;

  /**
   * 
   * @var string $Bookmark
   * @access public
   */
  public $Bookmark = null;

  /**
   * 
   * @var TOCLocation $Location
   * @access public
   */
  public $Location = null;

  /**
   * 
   * @var string $PaperSize
   * @access public
   */
  public $PaperSize = null;

  /**
   * 
   * @var PageOrientation $PageOrientation
   * @access public
   */
  public $PageOrientation = null;

  /**
   * 
   * @var string $PageMargins
   * @access public
   */
  public $PageMargins = null;

  /**
   * 
   * @var int $MinimumEntries
   * @access public
   */
  public $MinimumEntries = null;

  /**
   * 
   * @var DocumentStartPage $DocumentStartPage
   * @access public
   */
  public $DocumentStartPage = null;

  /**
   * 
   * @var HTMLRenderingEngine $HtmlRenderingEngine
   * @access public
   */
  public $HtmlRenderingEngine = null;

  /**
   * 
   * @var string $WebKitViewPortSize
   * @access public
   */
  public $WebKitViewPortSize = null;

  /**
   * 
   * @param TOCLocation $Location
   * @param PageOrientation $PageOrientation
   * @param int $MinimumEntries
   * @param DocumentStartPage $DocumentStartPage
   * @param HTMLRenderingEngine $HtmlRenderingEngine
   * @access public
   */
  public function __construct($Location, $PageOrientation, $MinimumEntries, $DocumentStartPage, $HtmlRenderingEngine)
  {
    $this->Location = $Location;
    $this->PageOrientation = $PageOrientation;
    $this->MinimumEntries = $MinimumEntries;
    $this->DocumentStartPage = $DocumentStartPage;
    $this->HtmlRenderingEngine = $HtmlRenderingEngine;
  }

}
class NameValuePair
{

  /**
   * 
   * @var string $Name
   * @access public
   */
  public $Name = null;

  /**
   * 
   * @var string $Value
   * @access public
   */
  public $Value = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class EnumsProxy
{

  /**
   * 
   * @var OCRLanguage $OCRLanguageProxy
   * @access public
   */
  public $OCRLanguageProxy = null;

  /**
   * 
   * @var PrimeOCR_AccuracyLevel $PrimeOCR_AccuracyLevelProxy
   * @access public
   */
  public $PrimeOCR_AccuracyLevelProxy = null;

  /**
   * 
   * @param OCRLanguage $OCRLanguageProxy
   * @param PrimeOCR_AccuracyLevel $PrimeOCR_AccuracyLevelProxy
   * @access public
   */
  public function __construct($OCRLanguageProxy, $PrimeOCR_AccuracyLevelProxy)
  {
    $this->OCRLanguageProxy = $OCRLanguageProxy;
    $this->PrimeOCR_AccuracyLevelProxy = $PrimeOCR_AccuracyLevelProxy;
  }

}
class OCRSettings
{

  /**
   * 
   * @var string $Language
   * @access public
   */
  public $Language = null;

  /**
   * 
   * @var OCRPerformance $Performance
   * @access public
   */
  public $Performance = null;

  /**
   * 
   * @var string $WhiteList
   * @access public
   */
  public $WhiteList = null;

  /**
   * 
   * @var string $BlackList
   * @access public
   */
  public $BlackList = null;

  /**
   * 
   * @var boolean $Paginate
   * @access public
   */
  public $Paginate = null;

  /**
   * 
   * @var OCRRegion[] $Regions
   * @access public
   */
  public $Regions = null;

  /**
   * 
   * @var OCROutputType $OutputType
   * @access public
   */
  public $OutputType = null;

  /**
   * 
   * @var string $OCREngine
   * @access public
   */
  public $OCREngine = null;

  /**
   * 
   * @var OCREngineSpecificSettings $OCREngineSpecificSettings
   * @access public
   */
  public $OCREngineSpecificSettings = null;

  /**
   * 
   * @param OCRPerformance $Performance
   * @param boolean $Paginate
   * @param OCROutputType $OutputType
   * @access public
   */
  public function __construct($Performance, $Paginate, $OutputType)
  {
    $this->Performance = $Performance;
    $this->Paginate = $Paginate;
    $this->OutputType = $OutputType;
  }

}
class OCRRegion
{

  /**
   * 
   * @var string $X
   * @access public
   */
  public $X = null;

  /**
   * 
   * @var string $Y
   * @access public
   */
  public $Y = null;

  /**
   * 
   * @var string $Width
   * @access public
   */
  public $Width = null;

  /**
   * 
   * @var string $Height
   * @access public
   */
  public $Height = null;

  /**
   * 
   * @var int $StartPage
   * @access public
   */
  public $StartPage = null;

  /**
   * 
   * @var int $EndPage
   * @access public
   */
  public $EndPage = null;

  /**
   * 
   * @var int $PageInterval
   * @access public
   */
  public $PageInterval = null;

  /**
   * 
   * @var string $PageRange
   * @access public
   */
  public $PageRange = null;

  /**
   * 
   * @var string $Id
   * @access public
   */
  public $Id = null;

  /**
   * 
   * @param int $StartPage
   * @param int $EndPage
   * @param int $PageInterval
   * @access public
   */
  public function __construct($StartPage, $EndPage, $PageInterval)
  {
    $this->StartPage = $StartPage;
    $this->EndPage = $EndPage;
    $this->PageInterval = $PageInterval;
  }

}
class OCRResult
{

  /**
   * 
   * @var string $Text
   * @access public
   */
  public $Text = null;

  /**
   * 
   * @var RegionText[] $RegionTexts
   * @access public
   */
  public $RegionTexts = null;

  /**
   * 
   * @var int $PageCount
   * @access public
   */
  public $PageCount = null;

  /**
   * 
   * @param int $PageCount
   * @access public
   */
  public function __construct($PageCount)
  {
    $this->PageCount = $PageCount;
  }

}
class RegionText
{

  /**
   * 
   * @var string $RegionId
   * @access public
   */
  public $RegionId = null;

  /**
   * 
   * @var int $PageNumber
   * @access public
   */
  public $PageNumber = null;

  /**
   * 
   * @var string $Text
   * @access public
   */
  public $Text = null;

  /**
   * 
   * @param int $PageNumber
   * @access public
   */
  public function __construct($PageNumber)
  {
    $this->PageNumber = $PageNumber;
  }

}
class OperationTypeConfiguration
{

  /**
   * 
   * @var OperationType $OperationType
   * @access public
   */
  public $OperationType = null;

  /**
   * 
   * @var string $Description
   * @access public
   */
  public $Description = null;

  /**
   * 
   * @var boolean $Enabled
   * @access public
   */
  public $Enabled = null;

  /**
   * 
   * @var int $MaximumInstances
   * @access public
   */
  public $MaximumInstances = null;

  /**
   * 
   * @var int $MaximumRunDuration
   * @access public
   */
  public $MaximumRunDuration = null;

  /**
   * 
   * @param OperationType $OperationType
   * @param boolean $Enabled
   * @param int $MaximumInstances
   * @param int $MaximumRunDuration
   * @access public
   */
  public function __construct($OperationType, $Enabled, $MaximumInstances, $MaximumRunDuration)
  {
    $this->OperationType = $OperationType;
    $this->Enabled = $Enabled;
    $this->MaximumInstances = $MaximumInstances;
    $this->MaximumRunDuration = $MaximumRunDuration;
  }

}
class StatusRequest
{

  /**
   * 
   * @var StatusRequestItem[] $StatusRequestItems
   * @access public
   */
  public $StatusRequestItems = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class StatusRequestItem
{

  /**
   * 
   * @var string $RequestID
   * @access public
   */
  public $RequestID = null;

  /**
   * 
   * @var OperationType $OperationType
   * @access public
   */
  public $OperationType = null;

  /**
   * 
   * @var string $Data
   * @access public
   */
  public $Data = null;

  /**
   * 
   * @param OperationType $OperationType
   * @access public
   */
  public function __construct($OperationType)
  {
    $this->OperationType = $OperationType;
  }

}
class Status
{

  /**
   * 
   * @var StatusResultItem[] $Items
   * @access public
   */
  public $Items = null;

  /**
   * 
   * @var int $MaximumInstances
   * @access public
   */
  public $MaximumInstances = null;

  /**
   * 
   * @var int $CurrentInstances
   * @access public
   */
  public $CurrentInstances = null;

  /**
   * 
   * @param int $MaximumInstances
   * @param int $CurrentInstances
   * @access public
   */
  public function __construct($MaximumInstances, $CurrentInstances)
  {
    $this->MaximumInstances = $MaximumInstances;
    $this->CurrentInstances = $CurrentInstances;
  }

}
class StatusResultItem
{

  /**
   * 
   * @var string $RequestID
   * @access public
   */
  public $RequestID = null;

  /**
   * 
   * @var int $MaximumInstances
   * @access public
   */
  public $MaximumInstances = null;

  /**
   * 
   * @var int $CurrentInstances
   * @access public
   */
  public $CurrentInstances = null;

  /**
   * 
   * @var OperationStatus $OperationStatus
   * @access public
   */
  public $OperationStatus = null;

  /**
   * 
   * @param int $MaximumInstances
   * @param int $CurrentInstances
   * @param OperationStatus $OperationStatus
   * @access public
   */
  public function __construct($MaximumInstances, $CurrentInstances, $OperationStatus)
  {
    $this->MaximumInstances = $MaximumInstances;
    $this->CurrentInstances = $CurrentInstances;
    $this->OperationStatus = $OperationStatus;
  }

}
class OpenOptions
{

  /**
   * 
   * @var string $UserName
   * @access public
   */
  public $UserName = null;

  /**
   * 
   * @var string $Password
   * @access public
   */
  public $Password = null;

  /**
   * 
   * @var string $FileExtension
   * @access public
   */
  public $FileExtension = null;

  /**
   * 
   * @var string $OriginalFileName
   * @access public
   */
  public $OriginalFileName = null;

  /**
   * 
   * @var boolean $RefreshContent
   * @access public
   */
  public $RefreshContent = null;

  /**
   * 
   * @var boolean $AllowExternalConnections
   * @access public
   */
  public $AllowExternalConnections = null;

  /**
   * 
   * @var MacroSecurityOption $AllowMacros
   * @access public
   */
  public $AllowMacros = null;

  /**
   * 
   * @var SystemSettings $SystemSettings
   * @access public
   */
  public $SystemSettings = null;

  /**
   * 
   * @var SubscriptionSettings $SubscriptionSettings
   * @access public
   */
  public $SubscriptionSettings = null;

  /**
   * 
   * @param boolean $RefreshContent
   * @param boolean $AllowExternalConnections
   * @param MacroSecurityOption $AllowMacros
   * @access public
   */
  public function __construct($RefreshContent, $AllowExternalConnections, $AllowMacros)
  {
    $this->RefreshContent = $RefreshContent;
    $this->AllowExternalConnections = $AllowExternalConnections;
    $this->AllowMacros = $AllowMacros;
  }

}
class ConversionSettings
{

  /**
   * 
   * @var OutputFormat $Format
   * @access public
   */
  public $Format = null;

  /**
   * 
   * @var int $StartPage
   * @access public
   */
  public $StartPage = null;

  /**
   * 
   * @var int $EndPage
   * @access public
   */
  public $EndPage = null;

  /**
   * 
   * @var ConversionRange $Range
   * @access public
   */
  public $Range = null;

  /**
   * 
   * @var ConversionQuality $Quality
   * @access public
   */
  public $Quality = null;

  /**
   * 
   * @var PDFProfile $PDFProfile
   * @access public
   */
  public $PDFProfile = null;

  /**
   * 
   * @var string $OpenPassword
   * @access public
   */
  public $OpenPassword = null;

  /**
   * 
   * @var string $OwnerPassword
   * @access public
   */
  public $OwnerPassword = null;

  /**
   * 
   * @var SecurityOptions $SecurityOptions
   * @access public
   */
  public $SecurityOptions = null;

  /**
   * 
   * @var ConversionFidelities $Fidelity
   * @access public
   */
  public $Fidelity = null;

  /**
   * 
   * @var BookmarkGenerationOption $GenerateBookmarks
   * @access public
   */
  public $GenerateBookmarks = null;

  /**
   * 
   * @var Watermark[] $Watermarks
   * @access public
   */
  public $Watermarks = null;

  /**
   * 
   * @var PageOrientation $PageOrientation
   * @access public
   */
  public $PageOrientation = null;

  /**
   * 
   * @var ConverterSpecificSettings $ConverterSpecificSettings
   * @access public
   */
  public $ConverterSpecificSettings = null;

  /**
   * 
   * @var OutputFormatSpecificSettings $OutputFormatSpecificSettings
   * @access public
   */
  public $OutputFormatSpecificSettings = null;

  /**
   * 
   * @var OCRSettings $OCRSettings
   * @access public
   */
  public $OCRSettings = null;

  /**
   * 
   * @var TOCSettings $TOCSettings
   * @access public
   */
  public $TOCSettings = null;

  /**
   * 
   * @param OutputFormat $Format
   * @param int $StartPage
   * @param int $EndPage
   * @param ConversionRange $Range
   * @param ConversionQuality $Quality
   * @param PDFProfile $PDFProfile
   * @param SecurityOptions $SecurityOptions
   * @param ConversionFidelities $Fidelity
   * @param BookmarkGenerationOption $GenerateBookmarks
   * @param PageOrientation $PageOrientation
   * @access public
   */
  public function __construct($Format, $StartPage, $EndPage, $Range, $Quality, $PDFProfile, $SecurityOptions, $Fidelity, $GenerateBookmarks, $PageOrientation)
  {
    $this->Format = $Format;
    $this->StartPage = $StartPage;
    $this->EndPage = $EndPage;
    $this->Range = $Range;
    $this->Quality = $Quality;
    $this->PDFProfile = $PDFProfile;
    $this->SecurityOptions = $SecurityOptions;
    $this->Fidelity = $Fidelity;
    $this->GenerateBookmarks = $GenerateBookmarks;
    $this->PageOrientation = $PageOrientation;
  }

}
class BookmarkOptions_WordProcessing
{

  /**
   * 
   * @var BooleanEnum $UseHeadingStyles
   * @access public
   */
  public $UseHeadingStyles = null;

  /**
   * 
   * @var BooleanEnum $UseOutlineLevels
   * @access public
   */
  public $UseOutlineLevels = null;

  /**
   * 
   * @var int $UpperBookmarkLevel
   * @access public
   */
  public $UpperBookmarkLevel = null;

  /**
   * 
   * @var int $LowerBookmarkLevel
   * @access public
   */
  public $LowerBookmarkLevel = null;

  /**
   * 
   * @var BookmarkMapping[] $BookmarkMappings
   * @access public
   */
  public $BookmarkMappings = null;

  /**
   * 
   * @param BooleanEnum $UseHeadingStyles
   * @param BooleanEnum $UseOutlineLevels
   * @param int $UpperBookmarkLevel
   * @param int $LowerBookmarkLevel
   * @access public
   */
  public function __construct($UseHeadingStyles, $UseOutlineLevels, $UpperBookmarkLevel, $LowerBookmarkLevel)
  {
    $this->UseHeadingStyles = $UseHeadingStyles;
    $this->UseOutlineLevels = $UseOutlineLevels;
    $this->UpperBookmarkLevel = $UpperBookmarkLevel;
    $this->LowerBookmarkLevel = $LowerBookmarkLevel;
  }

}
class BookmarkOptions
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class WebServiceFaultException
{

  /**
   * 
   * @var WebServiceExceptionType $ExceptionType
   * @access public
   */
  public $ExceptionType = null;

  /**
   * 
   * @var string[] $ExceptionDetails
   * @access public
   */
  public $ExceptionDetails = null;

  /**
   * 
   * @param WebServiceExceptionType $ExceptionType
   * @access public
   */
  public function __construct($ExceptionType)
  {
    $this->ExceptionType = $ExceptionType;
  }

}
class ProcessingOptions
{

  /**
   * 
   * @var SourceFile[] $SourceFiles
   * @access public
   */
  public $SourceFiles = null;

  /**
   * 
   * @var MergeSettings $MergeSettings
   * @access public
   */
  public $MergeSettings = null;

  /**
   * 
   * @var FileSplitOptions $SplitOptions
   * @access public
   */
  public $SplitOptions = null;

  /**
   * 
   * @var OCRSettings $OCRSettings
   * @access public
   */
  public $OCRSettings = null;

  /**
   * 
   * @var SubscriptionSettings $SubscriptionSettings
   * @access public
   */
  public $SubscriptionSettings = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class SourceFile
{

  /**
   * 
   * @var base64Binary $File
   * @access public
   */
  public $File = null;

  /**
   * 
   * @var OpenOptions $OpenOptions
   * @access public
   */
  public $OpenOptions = null;

  /**
   * 
   * @var ConversionSettings $ConversionSettings
   * @access public
   */
  public $ConversionSettings = null;

  /**
   * 
   * @var FileMergeSettings $MergeSettings
   * @access public
   */
  public $MergeSettings = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class FileMergeSettings
{

  /**
   * 
   * @var string $TopLevelBookmark
   * @access public
   */
  public $TopLevelBookmark = null;

  /**
   * 
   * @var MergeMode $MergeMode
   * @access public
   */
  public $MergeMode = null;

  /**
   * 
   * @var UnsupportedFileBehaviour $UnsupportedFileBehaviour
   * @access public
   */
  public $UnsupportedFileBehaviour = null;

  /**
   * 
   * @param MergeMode $MergeMode
   * @param UnsupportedFileBehaviour $UnsupportedFileBehaviour
   * @access public
   */
  public function __construct($MergeMode, $UnsupportedFileBehaviour)
  {
    $this->MergeMode = $MergeMode;
    $this->UnsupportedFileBehaviour = $UnsupportedFileBehaviour;
  }

}
class MergeSettings
{

  /**
   * 
   * @var boolean $BreakOnError
   * @access public
   */
  public $BreakOnError = null;

  /**
   * 
   * @var PDFProfile $PDFProfile
   * @access public
   */
  public $PDFProfile = null;

  /**
   * 
   * @var string $OpenPassword
   * @access public
   */
  public $OpenPassword = null;

  /**
   * 
   * @var string $OwnerPassword
   * @access public
   */
  public $OwnerPassword = null;

  /**
   * 
   * @var SecurityOptions $SecurityOptions
   * @access public
   */
  public $SecurityOptions = null;

  /**
   * 
   * @var Watermark[] $Watermarks
   * @access public
   */
  public $Watermarks = null;

  /**
   * 
   * @var boolean $OmitErrorPages
   * @access public
   */
  public $OmitErrorPages = null;

  /**
   * 
   * @var OutputFormatSpecificSettings $OutputFormatSpecificSettings
   * @access public
   */
  public $OutputFormatSpecificSettings = null;

  /**
   * 
   * @var TOCSettings $TOCSettings
   * @access public
   */
  public $TOCSettings = null;

  /**
   * 
   * @var DocumentStartPage $DocumentStartPage
   * @access public
   */
  public $DocumentStartPage = null;

  /**
   * 
   * @param boolean $BreakOnError
   * @param PDFProfile $PDFProfile
   * @param SecurityOptions $SecurityOptions
   * @param boolean $OmitErrorPages
   * @param DocumentStartPage $DocumentStartPage
   * @access public
   */
  public function __construct($BreakOnError, $PDFProfile, $SecurityOptions, $OmitErrorPages, $DocumentStartPage)
  {
    $this->BreakOnError = $BreakOnError;
    $this->PDFProfile = $PDFProfile;
    $this->SecurityOptions = $SecurityOptions;
    $this->OmitErrorPages = $OmitErrorPages;
    $this->DocumentStartPage = $DocumentStartPage;
  }

}
class FileSplitOptions
{

  /**
   * 
   * @var FileSplitType $FileSplitType
   * @access public
   */
  public $FileSplitType = null;

  /**
   * 
   * @var int $BatchSize
   * @access public
   */
  public $BatchSize = null;

  /**
   * 
   * @var int $BookmarkLevel
   * @access public
   */
  public $BookmarkLevel = null;

  /**
   * 
   * @var string $FileNameTemplate
   * @access public
   */
  public $FileNameTemplate = null;

  /**
   * 
   * @param FileSplitType $FileSplitType
   * @param int $BatchSize
   * @param int $BookmarkLevel
   * @access public
   */
  public function __construct($FileSplitType, $BatchSize, $BookmarkLevel)
  {
    $this->FileSplitType = $FileSplitType;
    $this->BatchSize = $BatchSize;
    $this->BookmarkLevel = $BookmarkLevel;
  }

}
class BatchResults
{

  /**
   * 
   * @var BatchResult[] $Results
   * @access public
   */
  public $Results = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class BatchResult
{

  /**
   * 
   * @var base64Binary $File
   * @access public
   */
  public $File = null;

  /**
   * 
   * @var string $FileName
   * @access public
   */
  public $FileName = null;

  /**
   * 
   * @var OCRResult $OCRResult
   * @access public
   */
  public $OCRResult = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Configuration
{

  /**
   * 
   * @var string $ConversionServerAddress
   * @access public
   */
  public $ConversionServerAddress = null;

  /**
   * 
   * @var ConverterConfiguration[] $Converters
   * @access public
   */
  public $Converters = null;

  /**
   * 
   * @var OperationTypeConfiguration[] $OperationTypes
   * @access public
   */
  public $OperationTypes = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class ConverterConfiguration
{

  /**
   * 
   * @var string $ConverterName
   * @access public
   */
  public $ConverterName = null;

  /**
   * 
   * @var ConversionFidelities $SupportedFidelity
   * @access public
   */
  public $SupportedFidelity = null;

  /**
   * 
   * @var string[] $SupportedFileExtensions
   * @access public
   */
  public $SupportedFileExtensions = null;

  /**
   * 
   * @var string $Description
   * @access public
   */
  public $Description = null;

  /**
   * 
   * @var string[] $SupportedOutputFormats
   * @access public
   */
  public $SupportedOutputFormats = null;

  /**
   * 
   * @param ConversionFidelities $SupportedFidelity
   * @access public
   */
  public function __construct($SupportedFidelity)
  {
    $this->SupportedFidelity = $SupportedFidelity;
  }

}
class DiagnosticRequestItem
{

  /**
   * 
   * @var string $ConverterName
   * @access public
   */
  public $ConverterName = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class Diagnostics
{

  /**
   * 
   * @var DiagnosticResultItem[] $Items
   * @access public
   */
  public $Items = null;

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class DiagnosticResultItem
{

  /**
   * 
   * @var boolean $Valid
   * @access public
   */
  public $Valid = null;

  /**
   * 
   * @var WebServiceExceptionType $ExceptionType
   * @access public
   */
  public $ExceptionType = null;

  /**
   * 
   * @var string $ConverterName
   * @access public
   */
  public $ConverterName = null;

  /**
   * 
   * @param boolean $Valid
   * @param WebServiceExceptionType $ExceptionType
   * @access public
   */
  public function __construct($Valid, $ExceptionType)
  {
    $this->Valid = $Valid;
    $this->ExceptionType = $ExceptionType;
  }

}
class Convert
{

  /**
   * 
   * @var base64Binary $sourceFile
   * @access public
   */
  public $sourceFile = null;

  /**
   * 
   * @var OpenOptions $openOptions
   * @access public
   */
  public $openOptions = null;

  /**
   * 
   * @var ConversionSettings $conversionSettings
   * @access public
   */
  public $conversionSettings = null;

  /**
   * 
   * @param base64Binary $sourceFile
   * @param OpenOptions $openOptions
   * @param ConversionSettings $conversionSettings
   * @access public
   */
  public function __construct($sourceFile, $openOptions, $conversionSettings)
  {
    $this->sourceFile = $sourceFile;
    $this->openOptions = $openOptions;
    $this->conversionSettings = $conversionSettings;
  }

}
class ConvertResponse
{

  /**
   * 
   * @var base64Binary $ConvertResult
   * @access public
   */
  public $ConvertResult = null;

  /**
   * 
   * @param base64Binary $ConvertResult
   * @access public
   */
  public function __construct($ConvertResult)
  {
    $this->ConvertResult = $ConvertResult;
  }

}
class ApplyWatermark
{

  /**
   * 
   * @var base64Binary $sourceFile
   * @access public
   */
  public $sourceFile = null;

  /**
   * 
   * @var OpenOptions $openOptions
   * @access public
   */
  public $openOptions = null;

  /**
   * 
   * @var ConversionSettings $conversionSettings
   * @access public
   */
  public $conversionSettings = null;

  /**
   * 
   * @param base64Binary $sourceFile
   * @param OpenOptions $openOptions
   * @param ConversionSettings $conversionSettings
   * @access public
   */
  public function __construct($sourceFile, $openOptions, $conversionSettings)
  {
    $this->sourceFile = $sourceFile;
    $this->openOptions = $openOptions;
    $this->conversionSettings = $conversionSettings;
  }

}
class ApplyWatermarkResponse
{

  /**
   * 
   * @var base64Binary $ApplyWatermarkResult
   * @access public
   */
  public $ApplyWatermarkResult = null;

  /**
   * 
   * @param base64Binary $ApplyWatermarkResult
   * @access public
   */
  public function __construct($ApplyWatermarkResult)
  {
    $this->ApplyWatermarkResult = $ApplyWatermarkResult;
  }

}
class ApplySecurity
{

  /**
   * 
   * @var base64Binary $sourceFile
   * @access public
   */
  public $sourceFile = null;

  /**
   * 
   * @var OpenOptions $openOptions
   * @access public
   */
  public $openOptions = null;

  /**
   * 
   * @var ConversionSettings $conversionSettings
   * @access public
   */
  public $conversionSettings = null;

  /**
   * 
   * @param base64Binary $sourceFile
   * @param OpenOptions $openOptions
   * @param ConversionSettings $conversionSettings
   * @access public
   */
  public function __construct($sourceFile, $openOptions, $conversionSettings)
  {
    $this->sourceFile = $sourceFile;
    $this->openOptions = $openOptions;
    $this->conversionSettings = $conversionSettings;
  }

}
class ApplySecurityResponse
{

  /**
   * 
   * @var base64Binary $ApplySecurityResult
   * @access public
   */
  public $ApplySecurityResult = null;

  /**
   * 
   * @param base64Binary $ApplySecurityResult
   * @access public
   */
  public function __construct($ApplySecurityResult)
  {
    $this->ApplySecurityResult = $ApplySecurityResult;
  }

}
class ProcessChanges
{

  /**
   * 
   * @var base64Binary $sourceFile
   * @access public
   */
  public $sourceFile = null;

  /**
   * 
   * @var OpenOptions $openOptions
   * @access public
   */
  public $openOptions = null;

  /**
   * 
   * @var ConversionSettings $conversionSettings
   * @access public
   */
  public $conversionSettings = null;

  /**
   * 
   * @param base64Binary $sourceFile
   * @param OpenOptions $openOptions
   * @param ConversionSettings $conversionSettings
   * @access public
   */
  public function __construct($sourceFile, $openOptions, $conversionSettings)
  {
    $this->sourceFile = $sourceFile;
    $this->openOptions = $openOptions;
    $this->conversionSettings = $conversionSettings;
  }

}
class ProcessChangesResponse
{

  /**
   * 
   * @var base64Binary $ProcessChangesResult
   * @access public
   */
  public $ProcessChangesResult = null;

  /**
   * 
   * @param base64Binary $ProcessChangesResult
   * @access public
   */
  public function __construct($ProcessChangesResult)
  {
    $this->ProcessChangesResult = $ProcessChangesResult;
  }

}
class ProcessBatch
{

  /**
   * 
   * @var ProcessingOptions $options
   * @access public
   */
  public $options = null;

  /**
   * 
   * @param ProcessingOptions $options
   * @access public
   */
  public function __construct($options)
  {
    $this->options = $options;
  }

}
class ProcessBatchResponse
{

  /**
   * 
   * @var BatchResults $ProcessBatchResult
   * @access public
   */
  public $ProcessBatchResult = null;

  /**
   * 
   * @param BatchResults $ProcessBatchResult
   * @access public
   */
  public function __construct($ProcessBatchResult)
  {
    $this->ProcessBatchResult = $ProcessBatchResult;
  }

}
class GetConfiguration
{

  /**
   * 
   * @access public
   */
  public function __construct()
  {
  
  }

}
class GetConfigurationResponse
{

  /**
   * 
   * @var Configuration $GetConfigurationResult
   * @access public
   */
  public $GetConfigurationResult = null;

  /**
   * 
   * @param Configuration $GetConfigurationResult
   * @access public
   */
  public function __construct($GetConfigurationResult)
  {
    $this->GetConfigurationResult = $GetConfigurationResult;
  }

}
class GetDiagnostics
{

  /**
   * 
   * @var DiagnosticRequestItem[] $convertersToDiagnose
   * @access public
   */
  public $convertersToDiagnose = null;

  /**
   * 
   * @param DiagnosticRequestItem[] $convertersToDiagnose
   * @access public
   */
  public function __construct($convertersToDiagnose)
  {
    $this->convertersToDiagnose = $convertersToDiagnose;
  }

}
class GetDiagnosticsResponse
{

  /**
   * 
   * @var Diagnostics $GetDiagnosticsResult
   * @access public
   */
  public $GetDiagnosticsResult = null;

  /**
   * 
   * @param Diagnostics $GetDiagnosticsResult
   * @access public
   */
  public function __construct($GetDiagnosticsResult)
  {
    $this->GetDiagnosticsResult = $GetDiagnosticsResult;
  }

}
class GetStatus
{

  /**
   * 
   * @var StatusRequest $statusRequest
   * @access public
   */
  public $statusRequest = null;

  /**
   * 
   * @param StatusRequest $statusRequest
   * @access public
   */
  public function __construct($statusRequest)
  {
    $this->statusRequest = $statusRequest;
  }

}
class GetStatusResponse
{

  /**
   * 
   * @var Status $GetStatusResult
   * @access public
   */
  public $GetStatusResult = null;

  /**
   * 
   * @param Status $GetStatusResult
   * @access public
   */
  public function __construct($GetStatusResult)
  {
    $this->GetStatusResult = $GetStatusResult;
  }

}
class ConverterSpecificSettings_PDF
{

  /**
   * 
   * @var boolean $ConvertAttachments
   * @access public
   */
  public $ConvertAttachments = null;

  /**
   * 
   * @var PDFConvertAttachmentMode $ConvertAttachmentMode
   * @access public
   */
  public $ConvertAttachmentMode = null;

  /**
   * 
   * @var boolean $IgnorePortfolioCoverSheet
   * @access public
   */
  public $IgnorePortfolioCoverSheet = null;

  /**
   * 
   * @var MergeMode $AttachmentMergeMode
   * @access public
   */
  public $AttachmentMergeMode = null;

  /**
   * 
   * @var UnsupportedFileBehaviour $UnsupportedAttachmentBehaviour
   * @access public
   */
  public $UnsupportedAttachmentBehaviour = null;

  /**
   * 
   * @var boolean $BreakMergeOnError
   * @access public
   */
  public $BreakMergeOnError = null;

  /**
   * 
   * @var string $IncludeAttachmentTypes
   * @access public
   */
  public $IncludeAttachmentTypes = null;

  /**
   * 
   * @var string $ExcludeAttachmentTypes
   * @access public
   */
  public $ExcludeAttachmentTypes = null;

  /**
   * 
   * @param boolean $ConvertAttachments
   * @param PDFConvertAttachmentMode $ConvertAttachmentMode
   * @param boolean $IgnorePortfolioCoverSheet
   * @param MergeMode $AttachmentMergeMode
   * @param UnsupportedFileBehaviour $UnsupportedAttachmentBehaviour
   * @param boolean $BreakMergeOnError
   * @access public
   */
  public function __construct($ConvertAttachments, $ConvertAttachmentMode, $IgnorePortfolioCoverSheet, $AttachmentMergeMode, $UnsupportedAttachmentBehaviour, $BreakMergeOnError)
  {
    $this->ConvertAttachments = $ConvertAttachments;
    $this->ConvertAttachmentMode = $ConvertAttachmentMode;
    $this->IgnorePortfolioCoverSheet = $IgnorePortfolioCoverSheet;
    $this->AttachmentMergeMode = $AttachmentMergeMode;
    $this->UnsupportedAttachmentBehaviour = $UnsupportedAttachmentBehaviour;
    $this->BreakMergeOnError = $BreakMergeOnError;
  }

}
