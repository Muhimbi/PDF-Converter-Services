require 'DocumentConverterService.rb'
require 'soap/mapping'

module DocumentConverterServiceMappingRegistry
  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsArrays = "http://schemas.microsoft.com/2003/10/Serialization/Arrays"
  NsC_06 = "http://types.muhimbi.com/2009/10/06"
  NsC_06_0 = "http://services.muhimbi.com/2009/10/06"
  NsC_14 = "http://types.muhimbi.com/2013/01/14"
  NsC_17 = "http://types.muhimbi.com/2010/05/17"
  NsC_22 = "http://types.muhimbi.com/2010/11/22"
  NsMuhimbiDocumentConverterWebServiceData = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data"
  NsMuhimbiDocumentConverterWebServiceDataGraphics = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics"

  EncodedRegistry.register(
    :class => OpenOptions,
    :schema_type => XSD::QName.new(NsC_06, "OpenOptions"),
    :schema_element => [
      ["userName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "UserName")], [0, 1]],
      ["password", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "Password")], [0, 1]],
      ["fileExtension", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileExtension")], [0, 1]],
      ["originalFileName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OriginalFileName")], [0, 1]],
      ["refreshContent", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "RefreshContent")], [0, 1]],
      ["allowExternalConnections", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "AllowExternalConnections")], [0, 1]],
      ["allowMacros", ["MacroSecurityOption", XSD::QName.new(NsC_06, "AllowMacros")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConversionSettings,
    :schema_type => XSD::QName.new(NsC_06, "ConversionSettings"),
    :schema_element => [
      ["format", ["OutputFormat", XSD::QName.new(NsC_06, "Format")], [0, 1]],
      ["startPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "StartPage")], [0, 1]],
      ["endPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "EndPage")], [0, 1]],
      ["range", ["ConversionRange", XSD::QName.new(NsC_06, "Range")], [0, 1]],
      ["quality", ["ConversionQuality", XSD::QName.new(NsC_06, "Quality")], [0, 1]],
      ["pDFProfile", ["PDFProfile", XSD::QName.new(NsC_06, "PDFProfile")], [0, 1]],
      ["openPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OpenPassword")], [0, 1]],
      ["ownerPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OwnerPassword")], [0, 1]],
      ["securityOptions", [nil, XSD::QName.new(NsC_06, "SecurityOptions")], [0, 1]],
      ["fidelity", [nil, XSD::QName.new(NsC_06, "Fidelity")], [0, 1]],
      ["generateBookmarks", ["BookmarkGenerationOption", XSD::QName.new(NsC_06, "GenerateBookmarks")], [0, 1]],
      ["watermarks", ["ArrayOfWatermark", XSD::QName.new(NsC_06, "Watermarks")], [0, 1]],
      ["pageOrientation", ["PageOrientation", XSD::QName.new(NsC_06, "PageOrientation")], [0, 1]],
      ["converterSpecificSettings", ["ConverterSpecificSettings", XSD::QName.new(NsC_06, "ConverterSpecificSettings")], [0, 1]],
      ["outputFormatSpecificSettings", ["OutputFormatSpecificSettings", XSD::QName.new(NsC_06, "OutputFormatSpecificSettings")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => WebServiceFaultException,
    :schema_type => XSD::QName.new(NsC_06, "WebServiceFaultException"),
    :schema_element => [
      ["exceptionType", ["WebServiceExceptionType", XSD::QName.new(NsC_06, "ExceptionType")], [0, 1]],
      ["exceptionDetails", ["ArrayOfstring", XSD::QName.new(NsC_06, "ExceptionDetails")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ProcessingOptions,
    :schema_type => XSD::QName.new(NsC_06, "ProcessingOptions"),
    :schema_element => [
      ["sourceFiles", ["ArrayOfSourceFile", XSD::QName.new(NsC_06, "SourceFiles")], [0, 1]],
      ["mergeSettings", ["MergeSettings", XSD::QName.new(NsC_06, "MergeSettings")], [0, 1]],
      ["splitOptions", ["FileSplitOptions", XSD::QName.new(NsC_06, "SplitOptions")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfSourceFile,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfSourceFile"),
    :schema_element => [
      ["sourceFile", ["SourceFile[]", XSD::QName.new(NsC_06, "SourceFile")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => SourceFile,
    :schema_type => XSD::QName.new(NsC_06, "SourceFile"),
    :schema_element => [
      ["file", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06, "File")], [0, 1]],
      ["openOptions", ["OpenOptions", XSD::QName.new(NsC_06, "OpenOptions")], [0, 1]],
      ["conversionSettings", ["ConversionSettings", XSD::QName.new(NsC_06, "ConversionSettings")], [0, 1]],
      ["mergeSettings", ["FileMergeSettings", XSD::QName.new(NsC_06, "MergeSettings")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => FileMergeSettings,
    :schema_type => XSD::QName.new(NsC_06, "FileMergeSettings"),
    :schema_element => [
      ["topLevelBookmark", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "TopLevelBookmark")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => MergeSettings,
    :schema_type => XSD::QName.new(NsC_06, "MergeSettings"),
    :schema_element => [
      ["breakOnError", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "BreakOnError")], [0, 1]],
      ["pDFProfile", ["PDFProfile", XSD::QName.new(NsC_06, "PDFProfile")], [0, 1]],
      ["openPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OpenPassword")], [0, 1]],
      ["ownerPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OwnerPassword")], [0, 1]],
      ["securityOptions", [nil, XSD::QName.new(NsC_06, "SecurityOptions")], [0, 1]],
      ["watermarks", ["ArrayOfWatermark", XSD::QName.new(NsC_06, "Watermarks")], [0, 1]],
      ["omitErrorPages", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "OmitErrorPages")], [0, 1]],
      ["outputFormatSpecificSettings", ["OutputFormatSpecificSettings", XSD::QName.new(NsC_06, "OutputFormatSpecificSettings")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => FileSplitOptions,
    :schema_type => XSD::QName.new(NsC_06, "FileSplitOptions"),
    :schema_element => [
      ["fileSplitType", ["FileSplitType", XSD::QName.new(NsC_06, "FileSplitType")], [0, 1]],
      ["batchSize", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "BatchSize")], [0, 1]],
      ["bookmarkLevel", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "BookmarkLevel")], [0, 1]],
      ["fileNameTemplate", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileNameTemplate")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => BatchResults,
    :schema_type => XSD::QName.new(NsC_06, "BatchResults"),
    :schema_element => [
      ["results", ["ArrayOfBatchResult", XSD::QName.new(NsC_06, "Results")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfBatchResult,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfBatchResult"),
    :schema_element => [
      ["batchResult", ["BatchResult[]", XSD::QName.new(NsC_06, "BatchResult")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => BatchResult,
    :schema_type => XSD::QName.new(NsC_06, "BatchResult"),
    :schema_element => [
      ["file", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06, "File")], [0, 1]],
      ["fileName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileName")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Configuration,
    :schema_type => XSD::QName.new(NsC_06, "Configuration"),
    :schema_element => [
      ["conversionServerAddress", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConversionServerAddress")], [0, 1]],
      ["converters", ["ArrayOfConverterConfiguration", XSD::QName.new(NsC_06, "Converters")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfConverterConfiguration,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfConverterConfiguration"),
    :schema_element => [
      ["converterConfiguration", ["ConverterConfiguration[]", XSD::QName.new(NsC_06, "ConverterConfiguration")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterConfiguration,
    :schema_type => XSD::QName.new(NsC_06, "ConverterConfiguration"),
    :schema_element => [
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]],
      ["supportedFidelity", [nil, XSD::QName.new(NsC_06, "SupportedFidelity")], [0, 1]],
      ["supportedFileExtensions", ["ArrayOfstring", XSD::QName.new(NsC_06, "SupportedFileExtensions")], [0, 1]],
      ["description", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "Description")], [0, 1]],
      ["supportedOutputFormats", ["ArrayOfstring", XSD::QName.new(NsC_06, "SupportedOutputFormats")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfDiagnosticRequestItem,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfDiagnosticRequestItem"),
    :schema_element => [
      ["diagnosticRequestItem", ["DiagnosticRequestItem[]", XSD::QName.new(NsC_06, "DiagnosticRequestItem")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => DiagnosticRequestItem,
    :schema_type => XSD::QName.new(NsC_06, "DiagnosticRequestItem"),
    :schema_element => [
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Diagnostics,
    :schema_type => XSD::QName.new(NsC_06, "Diagnostics"),
    :schema_element => [
      ["items", ["ArrayOfDiagnosticResultItem", XSD::QName.new(NsC_06, "Items")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfDiagnosticResultItem,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfDiagnosticResultItem"),
    :schema_element => [
      ["diagnosticResultItem", ["DiagnosticResultItem[]", XSD::QName.new(NsC_06, "DiagnosticResultItem")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => DiagnosticResultItem,
    :schema_type => XSD::QName.new(NsC_06, "DiagnosticResultItem"),
    :schema_element => [
      ["valid", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "Valid")], [0, 1]],
      ["exceptionType", ["WebServiceExceptionType", XSD::QName.new(NsC_06, "ExceptionType")], [0, 1]],
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfWatermark,
    :schema_type => XSD::QName.new(NsC_17, "ArrayOfWatermark"),
    :schema_element => [
      ["watermark", ["Watermark[]", XSD::QName.new(NsC_17, "Watermark")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => Watermark,
    :schema_type => XSD::QName.new(NsC_17, "Watermark"),
    :schema_basetype => XSD::QName.new(NsC_17, "Container"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["elements", ["ArrayOfElement", XSD::QName.new(NsC_17, "Elements")], [0, 1]],
      ["defaults", ["Defaults", XSD::QName.new(NsC_17, "Defaults")], [0, 1]],
      ["pageOrientation", ["PageOrientation", XSD::QName.new(NsC_17, "PageOrientation")], [0, 1]],
      ["startPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "StartPage")], [0, 1]],
      ["endPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "EndPage")], [0, 1]],
      ["pageInterval", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "PageInterval")], [0, 1]],
      ["pageRange", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "PageRange")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Container,
    :schema_type => XSD::QName.new(NsC_17, "Container"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["elements", ["ArrayOfElement", XSD::QName.new(NsC_17, "Elements")], [0, 1]],
      ["defaults", ["Defaults", XSD::QName.new(NsC_17, "Defaults")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Element,
    :schema_type => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfElement,
    :schema_type => XSD::QName.new(NsC_17, "ArrayOfElement"),
    :schema_element => [
      ["element", ["Element[]", XSD::QName.new(NsC_17, "Element")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => Defaults,
    :schema_type => XSD::QName.new(NsC_17, "Defaults"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["fontFamilyName", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontFamilyName")], [0, 1]],
      ["fontSize", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontSize")], [0, 1]],
      ["fontStyle", [nil, XSD::QName.new(NsC_17, "FontStyle")], [0, 1]],
      ["hAlign", ["HAlign", XSD::QName.new(NsC_17, "HAlign")], [0, 1]],
      ["vAlign", ["VAlign", XSD::QName.new(NsC_17, "VAlign")], [0, 1]],
      ["wordWrap", ["WordWrap", XSD::QName.new(NsC_17, "WordWrap")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Text,
    :schema_type => XSD::QName.new(NsC_17, "Text"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["content", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Content")], [0, 1]],
      ["fontFamilyName", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontFamilyName")], [0, 1]],
      ["fontSize", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontSize")], [0, 1]],
      ["fontStyle", [nil, XSD::QName.new(NsC_17, "FontStyle")], [0, 1]],
      ["wordWrap", ["WordWrap", XSD::QName.new(NsC_17, "WordWrap")], [0, 1]],
      ["hAlign", ["HAlign", XSD::QName.new(NsC_17, "HAlign")], [0, 1]],
      ["vAlign", ["VAlign", XSD::QName.new(NsC_17, "VAlign")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Pdf,
    :schema_type => XSD::QName.new(NsC_17, "Pdf"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["pdfData", ["SOAP::SOAPBase64", XSD::QName.new(NsC_17, "PdfData")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Rtf,
    :schema_type => XSD::QName.new(NsC_17, "Rtf"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["rtfData", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "RtfData")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Image,
    :schema_type => XSD::QName.new(NsC_17, "Image"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["imageData", ["SOAP::SOAPBase64", XSD::QName.new(NsC_17, "ImageData")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Rectangle,
    :schema_type => XSD::QName.new(NsC_17, "Rectangle"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Ellipse,
    :schema_type => XSD::QName.new(NsC_17, "Ellipse"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Line,
    :schema_type => XSD::QName.new(NsC_17, "Line"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["endX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "EndX")], [0, 1]],
      ["endY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "EndY")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_MSG,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_MSG"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["convertAttachments", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ConvertAttachments")], [0, 1]],
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["hTMLScaleMode", ["HTMLScaleMode", XSD::QName.new(NsC_22, "HTMLScaleMode")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_CommandLineConverter,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_CommandLineConverter"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["parameter1", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter1")], [0, 1]],
      ["parameter2", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter2")], [0, 1]],
      ["parameter3", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter3")], [0, 1]],
      ["parameter4", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter4")], [0, 1]],
      ["parameter5", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter5")], [0, 1]],
      ["parameter6", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter6")], [0, 1]],
      ["parameter7", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter7")], [0, 1]],
      ["parameter8", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter8")], [0, 1]],
      ["parameter9", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter9")], [0, 1]],
      ["parameter10", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter10")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_Cad,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_Cad"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["backgroundColor", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "BackgroundColor")], [0, 1]],
      ["foregroundColor", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "ForegroundColor")], [0, 1]],
      ["cadConversionElements", ["ArrayOfCadConversionElement", XSD::QName.new(NsC_22, "CadConversionElements")], [0, 1]],
      ["pageMargins", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PageMargins")], [0, 1]],
      ["emptyLayoutDetectionMode", ["CadEmptyLayoutDetectionMode", XSD::QName.new(NsC_22, "EmptyLayoutDetectionMode")], [0, 1]],
      ["layoutSortOrder", ["CadLayoutSortOrder", XSD::QName.new(NsC_22, "LayoutSortOrder")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfCadConversionElement,
    :schema_type => XSD::QName.new(NsC_22, "ArrayOfCadConversionElement"),
    :schema_element => [
      ["cadConversionElement", ["CadConversionElement[]", XSD::QName.new(NsC_22, "CadConversionElement")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => CadConversionElement,
    :schema_type => XSD::QName.new(NsC_22, "CadConversionElement"),
    :schema_element => [
      ["type", ["CadConversionElementType", XSD::QName.new(NsC_22, "Type")], [0, 1]],
      ["name", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Name")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_HTML,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_HTML"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["scaleMode", ["HTMLScaleMode", XSD::QName.new(NsC_22, "ScaleMode")], [0, 1]],
      ["pageMargins", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PageMargins")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_InfoPath,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_InfoPath"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["stripDotNETCode", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "StripDotNETCode")], [0, 1]],
      ["stripDataObjects", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "StripDataObjects")], [0, 1]],
      ["convertAttachments", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ConvertAttachments")], [0, 1]],
      ["conversionViews", ["ArrayOfInfoPathView", XSD::QName.new(NsC_22, "ConversionViews")], [0, 1]],
      ["autoTrustForms", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "AutoTrustForms")], [0, 1]],
      ["processFullTrustForms", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ProcessFullTrustForms")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfInfoPathView,
    :schema_type => XSD::QName.new(NsC_22, "ArrayOfInfoPathView"),
    :schema_element => [
      ["infoPathView", ["InfoPathView[]", XSD::QName.new(NsC_22, "InfoPathView")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => InfoPathView,
    :schema_type => XSD::QName.new(NsC_22, "InfoPathView"),
    :schema_element => [
      ["name", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Name")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_WordProcessing,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_WordProcessing"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["revisionsAndCommentsMarkupMode", ["RevisionsAndCommentsMarkupMode", XSD::QName.new(NsC_22, "RevisionsAndCommentsMarkupMode")], [0, 1]],
      ["revisionsAndCommentsDisplayMode", ["RevisionsAndCommentsDisplayMode", XSD::QName.new(NsC_22, "RevisionsAndCommentsDisplayMode")], [0, 1]],
      ["processDocumentTemplate", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ProcessDocumentTemplate")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ConverterSpecificSettings_Presentations,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_Presentations"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["printOutputType", ["PresentationsPrintOutputType", XSD::QName.new(NsC_22, "PrintOutputType")], [0, 1]],
      ["frameSlides", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "FrameSlides")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => OutputFormatSpecificSettings,
    :schema_type => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => OutputFormatSpecificSettings_PDF,
    :schema_type => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings_PDF"),
    :schema_basetype => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings"),
    :schema_element => [
      ["fastWebView", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FastWebView")], [0, 1]],
      ["embedAllFonts", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "EmbedAllFonts")], [0, 1]],
      ["subsetFonts", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "SubsetFonts")], [0, 1]],
      ["viewerPreferences", ["PDFViewerPreferences", XSD::QName.new(NsC_14, "ViewerPreferences")], [0, 1]],
      ["postProcessFile", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "PostProcessFile")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => PDFViewerPreferences,
    :schema_type => XSD::QName.new(NsC_14, "PDFViewerPreferences"),
    :schema_element => [
      ["centerWindow", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "CenterWindow")], [0, 1]],
      ["displayTitle", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "DisplayTitle")], [0, 1]],
      ["fitWindow", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FitWindow")], [0, 1]],
      ["hideMenubar", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideMenubar")], [0, 1]],
      ["hideToolbar", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideToolbar")], [0, 1]],
      ["hideWindowUI", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideWindowUI")], [0, 1]],
      ["pageLayout", ["PDFPageLayout", XSD::QName.new(NsC_14, "PageLayout")], [0, 1]],
      ["navigationPane", ["PDFNavigationPane", XSD::QName.new(NsC_14, "NavigationPane")], [0, 1]],
      ["hideEmptyNavigationPane", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideEmptyNavigationPane")], [0, 1]],
      ["pageScalingMode", ["PDFPageScalingMode", XSD::QName.new(NsC_14, "PageScalingMode")], [0, 1]],
      ["fullScreen", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FullScreen")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => ArrayOfstring,
    :schema_type => XSD::QName.new(NsArrays, "ArrayOfstring"),
    :schema_element => [
      ["string", "SOAP::SOAPString[]", [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => MacroSecurityOption,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "MacroSecurityOption")
  )

  EncodedRegistry.register(
    :class => OutputFormat,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "OutputFormat")
  )

  EncodedRegistry.register(
    :class => ConversionRange,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "ConversionRange")
  )

  EncodedRegistry.register(
    :class => ConversionQuality,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "ConversionQuality")
  )

  EncodedRegistry.register(
    :class => PDFProfile,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFProfile")
  )

  EncodedRegistry.register(
    :class => BookmarkGenerationOption,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "BookmarkGenerationOption")
  )

  EncodedRegistry.register(
    :class => HTMLScaleMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "HTMLScaleMode")
  )

  EncodedRegistry.register(
    :class => CadConversionElementType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadConversionElementType")
  )

  EncodedRegistry.register(
    :class => CadEmptyLayoutDetectionMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadEmptyLayoutDetectionMode")
  )

  EncodedRegistry.register(
    :class => CadLayoutSortOrder,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadLayoutSortOrder")
  )

  EncodedRegistry.register(
    :class => RevisionsAndCommentsMarkupMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "RevisionsAndCommentsMarkupMode")
  )

  EncodedRegistry.register(
    :class => RevisionsAndCommentsDisplayMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "RevisionsAndCommentsDisplayMode")
  )

  EncodedRegistry.register(
    :class => PresentationsPrintOutputType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PresentationsPrintOutputType")
  )

  EncodedRegistry.register(
    :class => PDFPageLayout,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFPageLayout")
  )

  EncodedRegistry.register(
    :class => PDFNavigationPane,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFNavigationPane")
  )

  EncodedRegistry.register(
    :class => PDFPageScalingMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFPageScalingMode")
  )

  EncodedRegistry.register(
    :class => WebServiceExceptionType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "WebServiceExceptionType")
  )

  EncodedRegistry.register(
    :class => FileSplitType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "FileSplitType")
  )

  EncodedRegistry.register(
    :class => HPosition,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "HPosition")
  )

  EncodedRegistry.register(
    :class => VPosition,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "VPosition")
  )

  EncodedRegistry.register(
    :class => ScaleMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "ScaleMode")
  )

  EncodedRegistry.register(
    :class => HAlign,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "HAlign")
  )

  EncodedRegistry.register(
    :class => VAlign,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "VAlign")
  )

  EncodedRegistry.register(
    :class => WordWrap,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "WordWrap")
  )

  EncodedRegistry.register(
    :class => PageOrientation,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "PageOrientation")
  )

  LiteralRegistry.register(
    :class => OpenOptions,
    :schema_type => XSD::QName.new(NsC_06, "OpenOptions"),
    :schema_element => [
      ["userName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "UserName")], [0, 1]],
      ["password", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "Password")], [0, 1]],
      ["fileExtension", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileExtension")], [0, 1]],
      ["originalFileName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OriginalFileName")], [0, 1]],
      ["refreshContent", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "RefreshContent")], [0, 1]],
      ["allowExternalConnections", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "AllowExternalConnections")], [0, 1]],
      ["allowMacros", ["MacroSecurityOption", XSD::QName.new(NsC_06, "AllowMacros")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConversionSettings,
    :schema_type => XSD::QName.new(NsC_06, "ConversionSettings"),
    :schema_element => [
      ["format", ["OutputFormat", XSD::QName.new(NsC_06, "Format")], [0, 1]],
      ["startPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "StartPage")], [0, 1]],
      ["endPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "EndPage")], [0, 1]],
      ["range", ["ConversionRange", XSD::QName.new(NsC_06, "Range")], [0, 1]],
      ["quality", ["ConversionQuality", XSD::QName.new(NsC_06, "Quality")], [0, 1]],
      ["pDFProfile", ["PDFProfile", XSD::QName.new(NsC_06, "PDFProfile")], [0, 1]],
      ["openPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OpenPassword")], [0, 1]],
      ["ownerPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OwnerPassword")], [0, 1]],
      ["securityOptions", [nil, XSD::QName.new(NsC_06, "SecurityOptions")], [0, 1]],
      ["fidelity", [nil, XSD::QName.new(NsC_06, "Fidelity")], [0, 1]],
      ["generateBookmarks", ["BookmarkGenerationOption", XSD::QName.new(NsC_06, "GenerateBookmarks")], [0, 1]],
      ["watermarks", ["ArrayOfWatermark", XSD::QName.new(NsC_06, "Watermarks")], [0, 1]],
      ["pageOrientation", ["PageOrientation", XSD::QName.new(NsC_06, "PageOrientation")], [0, 1]],
      ["converterSpecificSettings", ["ConverterSpecificSettings", XSD::QName.new(NsC_06, "ConverterSpecificSettings")], [0, 1]],
      ["outputFormatSpecificSettings", ["OutputFormatSpecificSettings", XSD::QName.new(NsC_06, "OutputFormatSpecificSettings")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => WebServiceFaultException,
    :schema_type => XSD::QName.new(NsC_06, "WebServiceFaultException"),
    :schema_element => [
      ["exceptionType", ["WebServiceExceptionType", XSD::QName.new(NsC_06, "ExceptionType")], [0, 1]],
      ["exceptionDetails", ["ArrayOfstring", XSD::QName.new(NsC_06, "ExceptionDetails")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ProcessingOptions,
    :schema_type => XSD::QName.new(NsC_06, "ProcessingOptions"),
    :schema_element => [
      ["sourceFiles", ["ArrayOfSourceFile", XSD::QName.new(NsC_06, "SourceFiles")], [0, 1]],
      ["mergeSettings", ["MergeSettings", XSD::QName.new(NsC_06, "MergeSettings")], [0, 1]],
      ["splitOptions", ["FileSplitOptions", XSD::QName.new(NsC_06, "SplitOptions")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfSourceFile,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfSourceFile"),
    :schema_element => [
      ["sourceFile", ["SourceFile[]", XSD::QName.new(NsC_06, "SourceFile")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => SourceFile,
    :schema_type => XSD::QName.new(NsC_06, "SourceFile"),
    :schema_element => [
      ["file", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06, "File")], [0, 1]],
      ["openOptions", ["OpenOptions", XSD::QName.new(NsC_06, "OpenOptions")], [0, 1]],
      ["conversionSettings", ["ConversionSettings", XSD::QName.new(NsC_06, "ConversionSettings")], [0, 1]],
      ["mergeSettings", ["FileMergeSettings", XSD::QName.new(NsC_06, "MergeSettings")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => FileMergeSettings,
    :schema_type => XSD::QName.new(NsC_06, "FileMergeSettings"),
    :schema_element => [
      ["topLevelBookmark", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "TopLevelBookmark")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => MergeSettings,
    :schema_type => XSD::QName.new(NsC_06, "MergeSettings"),
    :schema_element => [
      ["breakOnError", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "BreakOnError")], [0, 1]],
      ["pDFProfile", ["PDFProfile", XSD::QName.new(NsC_06, "PDFProfile")], [0, 1]],
      ["openPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OpenPassword")], [0, 1]],
      ["ownerPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OwnerPassword")], [0, 1]],
      ["securityOptions", [nil, XSD::QName.new(NsC_06, "SecurityOptions")], [0, 1]],
      ["watermarks", ["ArrayOfWatermark", XSD::QName.new(NsC_06, "Watermarks")], [0, 1]],
      ["omitErrorPages", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "OmitErrorPages")], [0, 1]],
      ["outputFormatSpecificSettings", ["OutputFormatSpecificSettings", XSD::QName.new(NsC_06, "OutputFormatSpecificSettings")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => FileSplitOptions,
    :schema_type => XSD::QName.new(NsC_06, "FileSplitOptions"),
    :schema_element => [
      ["fileSplitType", ["FileSplitType", XSD::QName.new(NsC_06, "FileSplitType")], [0, 1]],
      ["batchSize", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "BatchSize")], [0, 1]],
      ["bookmarkLevel", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "BookmarkLevel")], [0, 1]],
      ["fileNameTemplate", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileNameTemplate")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => BatchResults,
    :schema_type => XSD::QName.new(NsC_06, "BatchResults"),
    :schema_element => [
      ["results", ["ArrayOfBatchResult", XSD::QName.new(NsC_06, "Results")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfBatchResult,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfBatchResult"),
    :schema_element => [
      ["batchResult", ["BatchResult[]", XSD::QName.new(NsC_06, "BatchResult")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => BatchResult,
    :schema_type => XSD::QName.new(NsC_06, "BatchResult"),
    :schema_element => [
      ["file", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06, "File")], [0, 1]],
      ["fileName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileName")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Configuration,
    :schema_type => XSD::QName.new(NsC_06, "Configuration"),
    :schema_element => [
      ["conversionServerAddress", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConversionServerAddress")], [0, 1]],
      ["converters", ["ArrayOfConverterConfiguration", XSD::QName.new(NsC_06, "Converters")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfConverterConfiguration,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfConverterConfiguration"),
    :schema_element => [
      ["converterConfiguration", ["ConverterConfiguration[]", XSD::QName.new(NsC_06, "ConverterConfiguration")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterConfiguration,
    :schema_type => XSD::QName.new(NsC_06, "ConverterConfiguration"),
    :schema_element => [
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]],
      ["supportedFidelity", [nil, XSD::QName.new(NsC_06, "SupportedFidelity")], [0, 1]],
      ["supportedFileExtensions", ["ArrayOfstring", XSD::QName.new(NsC_06, "SupportedFileExtensions")], [0, 1]],
      ["description", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "Description")], [0, 1]],
      ["supportedOutputFormats", ["ArrayOfstring", XSD::QName.new(NsC_06, "SupportedOutputFormats")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfDiagnosticRequestItem,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfDiagnosticRequestItem"),
    :schema_element => [
      ["diagnosticRequestItem", ["DiagnosticRequestItem[]", XSD::QName.new(NsC_06, "DiagnosticRequestItem")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => DiagnosticRequestItem,
    :schema_type => XSD::QName.new(NsC_06, "DiagnosticRequestItem"),
    :schema_element => [
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Diagnostics,
    :schema_type => XSD::QName.new(NsC_06, "Diagnostics"),
    :schema_element => [
      ["items", ["ArrayOfDiagnosticResultItem", XSD::QName.new(NsC_06, "Items")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfDiagnosticResultItem,
    :schema_type => XSD::QName.new(NsC_06, "ArrayOfDiagnosticResultItem"),
    :schema_element => [
      ["diagnosticResultItem", ["DiagnosticResultItem[]", XSD::QName.new(NsC_06, "DiagnosticResultItem")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => DiagnosticResultItem,
    :schema_type => XSD::QName.new(NsC_06, "DiagnosticResultItem"),
    :schema_element => [
      ["valid", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "Valid")], [0, 1]],
      ["exceptionType", ["WebServiceExceptionType", XSD::QName.new(NsC_06, "ExceptionType")], [0, 1]],
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfWatermark,
    :schema_type => XSD::QName.new(NsC_17, "ArrayOfWatermark"),
    :schema_element => [
      ["watermark", ["Watermark[]", XSD::QName.new(NsC_17, "Watermark")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Watermark,
    :schema_type => XSD::QName.new(NsC_17, "Watermark"),
    :schema_basetype => XSD::QName.new(NsC_17, "Container"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["elements", ["ArrayOfElement", XSD::QName.new(NsC_17, "Elements")], [0, 1]],
      ["defaults", ["Defaults", XSD::QName.new(NsC_17, "Defaults")], [0, 1]],
      ["pageOrientation", ["PageOrientation", XSD::QName.new(NsC_17, "PageOrientation")], [0, 1]],
      ["startPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "StartPage")], [0, 1]],
      ["endPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "EndPage")], [0, 1]],
      ["pageInterval", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "PageInterval")], [0, 1]],
      ["pageRange", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "PageRange")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Container,
    :schema_type => XSD::QName.new(NsC_17, "Container"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["elements", ["ArrayOfElement", XSD::QName.new(NsC_17, "Elements")], [0, 1]],
      ["defaults", ["Defaults", XSD::QName.new(NsC_17, "Defaults")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Element,
    :schema_type => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfElement,
    :schema_type => XSD::QName.new(NsC_17, "ArrayOfElement"),
    :schema_element => [
      ["element", ["Element[]", XSD::QName.new(NsC_17, "Element")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Defaults,
    :schema_type => XSD::QName.new(NsC_17, "Defaults"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["fontFamilyName", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontFamilyName")], [0, 1]],
      ["fontSize", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontSize")], [0, 1]],
      ["fontStyle", [nil, XSD::QName.new(NsC_17, "FontStyle")], [0, 1]],
      ["hAlign", ["HAlign", XSD::QName.new(NsC_17, "HAlign")], [0, 1]],
      ["vAlign", ["VAlign", XSD::QName.new(NsC_17, "VAlign")], [0, 1]],
      ["wordWrap", ["WordWrap", XSD::QName.new(NsC_17, "WordWrap")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Text,
    :schema_type => XSD::QName.new(NsC_17, "Text"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["content", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Content")], [0, 1]],
      ["fontFamilyName", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontFamilyName")], [0, 1]],
      ["fontSize", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontSize")], [0, 1]],
      ["fontStyle", [nil, XSD::QName.new(NsC_17, "FontStyle")], [0, 1]],
      ["wordWrap", ["WordWrap", XSD::QName.new(NsC_17, "WordWrap")], [0, 1]],
      ["hAlign", ["HAlign", XSD::QName.new(NsC_17, "HAlign")], [0, 1]],
      ["vAlign", ["VAlign", XSD::QName.new(NsC_17, "VAlign")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Pdf,
    :schema_type => XSD::QName.new(NsC_17, "Pdf"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["pdfData", ["SOAP::SOAPBase64", XSD::QName.new(NsC_17, "PdfData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Rtf,
    :schema_type => XSD::QName.new(NsC_17, "Rtf"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["rtfData", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "RtfData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Image,
    :schema_type => XSD::QName.new(NsC_17, "Image"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["imageData", ["SOAP::SOAPBase64", XSD::QName.new(NsC_17, "ImageData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Rectangle,
    :schema_type => XSD::QName.new(NsC_17, "Rectangle"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Ellipse,
    :schema_type => XSD::QName.new(NsC_17, "Ellipse"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Line,
    :schema_type => XSD::QName.new(NsC_17, "Line"),
    :schema_basetype => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["endX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "EndX")], [0, 1]],
      ["endY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "EndY")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_MSG,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_MSG"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["convertAttachments", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ConvertAttachments")], [0, 1]],
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["hTMLScaleMode", ["HTMLScaleMode", XSD::QName.new(NsC_22, "HTMLScaleMode")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_CommandLineConverter,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_CommandLineConverter"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["parameter1", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter1")], [0, 1]],
      ["parameter2", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter2")], [0, 1]],
      ["parameter3", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter3")], [0, 1]],
      ["parameter4", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter4")], [0, 1]],
      ["parameter5", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter5")], [0, 1]],
      ["parameter6", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter6")], [0, 1]],
      ["parameter7", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter7")], [0, 1]],
      ["parameter8", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter8")], [0, 1]],
      ["parameter9", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter9")], [0, 1]],
      ["parameter10", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter10")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_Cad,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_Cad"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["backgroundColor", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "BackgroundColor")], [0, 1]],
      ["foregroundColor", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "ForegroundColor")], [0, 1]],
      ["cadConversionElements", ["ArrayOfCadConversionElement", XSD::QName.new(NsC_22, "CadConversionElements")], [0, 1]],
      ["pageMargins", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PageMargins")], [0, 1]],
      ["emptyLayoutDetectionMode", ["CadEmptyLayoutDetectionMode", XSD::QName.new(NsC_22, "EmptyLayoutDetectionMode")], [0, 1]],
      ["layoutSortOrder", ["CadLayoutSortOrder", XSD::QName.new(NsC_22, "LayoutSortOrder")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfCadConversionElement,
    :schema_type => XSD::QName.new(NsC_22, "ArrayOfCadConversionElement"),
    :schema_element => [
      ["cadConversionElement", ["CadConversionElement[]", XSD::QName.new(NsC_22, "CadConversionElement")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => CadConversionElement,
    :schema_type => XSD::QName.new(NsC_22, "CadConversionElement"),
    :schema_element => [
      ["type", ["CadConversionElementType", XSD::QName.new(NsC_22, "Type")], [0, 1]],
      ["name", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Name")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_HTML,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_HTML"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["scaleMode", ["HTMLScaleMode", XSD::QName.new(NsC_22, "ScaleMode")], [0, 1]],
      ["pageMargins", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PageMargins")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_InfoPath,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_InfoPath"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["stripDotNETCode", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "StripDotNETCode")], [0, 1]],
      ["stripDataObjects", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "StripDataObjects")], [0, 1]],
      ["convertAttachments", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ConvertAttachments")], [0, 1]],
      ["conversionViews", ["ArrayOfInfoPathView", XSD::QName.new(NsC_22, "ConversionViews")], [0, 1]],
      ["autoTrustForms", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "AutoTrustForms")], [0, 1]],
      ["processFullTrustForms", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ProcessFullTrustForms")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfInfoPathView,
    :schema_type => XSD::QName.new(NsC_22, "ArrayOfInfoPathView"),
    :schema_element => [
      ["infoPathView", ["InfoPathView[]", XSD::QName.new(NsC_22, "InfoPathView")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => InfoPathView,
    :schema_type => XSD::QName.new(NsC_22, "InfoPathView"),
    :schema_element => [
      ["name", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Name")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_WordProcessing,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_WordProcessing"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["revisionsAndCommentsMarkupMode", ["RevisionsAndCommentsMarkupMode", XSD::QName.new(NsC_22, "RevisionsAndCommentsMarkupMode")], [0, 1]],
      ["revisionsAndCommentsDisplayMode", ["RevisionsAndCommentsDisplayMode", XSD::QName.new(NsC_22, "RevisionsAndCommentsDisplayMode")], [0, 1]],
      ["processDocumentTemplate", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ProcessDocumentTemplate")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_Presentations,
    :schema_type => XSD::QName.new(NsC_22, "ConverterSpecificSettings_Presentations"),
    :schema_basetype => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => [
      ["printOutputType", ["PresentationsPrintOutputType", XSD::QName.new(NsC_22, "PrintOutputType")], [0, 1]],
      ["frameSlides", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "FrameSlides")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => OutputFormatSpecificSettings,
    :schema_type => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => OutputFormatSpecificSettings_PDF,
    :schema_type => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings_PDF"),
    :schema_basetype => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings"),
    :schema_element => [
      ["fastWebView", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FastWebView")], [0, 1]],
      ["embedAllFonts", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "EmbedAllFonts")], [0, 1]],
      ["subsetFonts", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "SubsetFonts")], [0, 1]],
      ["viewerPreferences", ["PDFViewerPreferences", XSD::QName.new(NsC_14, "ViewerPreferences")], [0, 1]],
      ["postProcessFile", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "PostProcessFile")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => PDFViewerPreferences,
    :schema_type => XSD::QName.new(NsC_14, "PDFViewerPreferences"),
    :schema_element => [
      ["centerWindow", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "CenterWindow")], [0, 1]],
      ["displayTitle", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "DisplayTitle")], [0, 1]],
      ["fitWindow", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FitWindow")], [0, 1]],
      ["hideMenubar", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideMenubar")], [0, 1]],
      ["hideToolbar", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideToolbar")], [0, 1]],
      ["hideWindowUI", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideWindowUI")], [0, 1]],
      ["pageLayout", ["PDFPageLayout", XSD::QName.new(NsC_14, "PageLayout")], [0, 1]],
      ["navigationPane", ["PDFNavigationPane", XSD::QName.new(NsC_14, "NavigationPane")], [0, 1]],
      ["hideEmptyNavigationPane", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideEmptyNavigationPane")], [0, 1]],
      ["pageScalingMode", ["PDFPageScalingMode", XSD::QName.new(NsC_14, "PageScalingMode")], [0, 1]],
      ["fullScreen", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FullScreen")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfstring,
    :schema_type => XSD::QName.new(NsArrays, "ArrayOfstring"),
    :schema_element => [
      ["string", "SOAP::SOAPString[]", [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => MacroSecurityOption,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "MacroSecurityOption")
  )

  LiteralRegistry.register(
    :class => OutputFormat,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "OutputFormat")
  )

  LiteralRegistry.register(
    :class => ConversionRange,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "ConversionRange")
  )

  LiteralRegistry.register(
    :class => ConversionQuality,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "ConversionQuality")
  )

  LiteralRegistry.register(
    :class => PDFProfile,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFProfile")
  )

  LiteralRegistry.register(
    :class => BookmarkGenerationOption,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "BookmarkGenerationOption")
  )

  LiteralRegistry.register(
    :class => HTMLScaleMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "HTMLScaleMode")
  )

  LiteralRegistry.register(
    :class => CadConversionElementType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadConversionElementType")
  )

  LiteralRegistry.register(
    :class => CadEmptyLayoutDetectionMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadEmptyLayoutDetectionMode")
  )

  LiteralRegistry.register(
    :class => CadLayoutSortOrder,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadLayoutSortOrder")
  )

  LiteralRegistry.register(
    :class => RevisionsAndCommentsMarkupMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "RevisionsAndCommentsMarkupMode")
  )

  LiteralRegistry.register(
    :class => RevisionsAndCommentsDisplayMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "RevisionsAndCommentsDisplayMode")
  )

  LiteralRegistry.register(
    :class => PresentationsPrintOutputType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PresentationsPrintOutputType")
  )

  LiteralRegistry.register(
    :class => PDFPageLayout,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFPageLayout")
  )

  LiteralRegistry.register(
    :class => PDFNavigationPane,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFNavigationPane")
  )

  LiteralRegistry.register(
    :class => PDFPageScalingMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFPageScalingMode")
  )

  LiteralRegistry.register(
    :class => WebServiceExceptionType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "WebServiceExceptionType")
  )

  LiteralRegistry.register(
    :class => FileSplitType,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "FileSplitType")
  )

  LiteralRegistry.register(
    :class => HPosition,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "HPosition")
  )

  LiteralRegistry.register(
    :class => VPosition,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "VPosition")
  )

  LiteralRegistry.register(
    :class => ScaleMode,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "ScaleMode")
  )

  LiteralRegistry.register(
    :class => HAlign,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "HAlign")
  )

  LiteralRegistry.register(
    :class => VAlign,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "VAlign")
  )

  LiteralRegistry.register(
    :class => WordWrap,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "WordWrap")
  )

  LiteralRegistry.register(
    :class => PageOrientation,
    :schema_type => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "PageOrientation")
  )

  LiteralRegistry.register(
    :class => Convert,
    :schema_name => XSD::QName.new(NsC_06_0, "Convert"),
    :schema_element => [
      ["sourceFile", "SOAP::SOAPBase64", [0, 1]],
      ["openOptions", "OpenOptions", [0, 1]],
      ["conversionSettings", "ConversionSettings", [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConvertResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "ConvertResponse"),
    :schema_element => [
      ["convertResult", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06_0, "ConvertResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ApplyWatermark,
    :schema_name => XSD::QName.new(NsC_06_0, "ApplyWatermark"),
    :schema_element => [
      ["sourceFile", "SOAP::SOAPBase64", [0, 1]],
      ["openOptions", "OpenOptions", [0, 1]],
      ["conversionSettings", "ConversionSettings", [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ApplyWatermarkResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "ApplyWatermarkResponse"),
    :schema_element => [
      ["applyWatermarkResult", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06_0, "ApplyWatermarkResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ApplySecurity,
    :schema_name => XSD::QName.new(NsC_06_0, "ApplySecurity"),
    :schema_element => [
      ["sourceFile", "SOAP::SOAPBase64", [0, 1]],
      ["openOptions", "OpenOptions", [0, 1]],
      ["conversionSettings", "ConversionSettings", [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ApplySecurityResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "ApplySecurityResponse"),
    :schema_element => [
      ["applySecurityResult", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06_0, "ApplySecurityResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ProcessChanges,
    :schema_name => XSD::QName.new(NsC_06_0, "ProcessChanges"),
    :schema_element => [
      ["sourceFile", "SOAP::SOAPBase64", [0, 1]],
      ["openOptions", "OpenOptions", [0, 1]],
      ["conversionSettings", "ConversionSettings", [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ProcessChangesResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "ProcessChangesResponse"),
    :schema_element => [
      ["processChangesResult", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06_0, "ProcessChangesResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ProcessBatch,
    :schema_name => XSD::QName.new(NsC_06_0, "ProcessBatch"),
    :schema_element => [
      ["options", "ProcessingOptions", [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ProcessBatchResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "ProcessBatchResponse"),
    :schema_element => [
      ["processBatchResult", ["BatchResults", XSD::QName.new(NsC_06_0, "ProcessBatchResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => GetConfiguration,
    :schema_name => XSD::QName.new(NsC_06_0, "GetConfiguration"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => GetConfigurationResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "GetConfigurationResponse"),
    :schema_element => [
      ["getConfigurationResult", ["Configuration", XSD::QName.new(NsC_06_0, "GetConfigurationResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => GetDiagnostics,
    :schema_name => XSD::QName.new(NsC_06_0, "GetDiagnostics"),
    :schema_element => [
      ["convertersToDiagnose", "ArrayOfDiagnosticRequestItem", [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => GetDiagnosticsResponse,
    :schema_name => XSD::QName.new(NsC_06_0, "GetDiagnosticsResponse"),
    :schema_element => [
      ["getDiagnosticsResult", ["Diagnostics", XSD::QName.new(NsC_06_0, "GetDiagnosticsResult")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => OpenOptions,
    :schema_name => XSD::QName.new(NsC_06, "OpenOptions"),
    :schema_element => [
      ["userName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "UserName")], [0, 1]],
      ["password", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "Password")], [0, 1]],
      ["fileExtension", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileExtension")], [0, 1]],
      ["originalFileName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OriginalFileName")], [0, 1]],
      ["refreshContent", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "RefreshContent")], [0, 1]],
      ["allowExternalConnections", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "AllowExternalConnections")], [0, 1]],
      ["allowMacros", ["MacroSecurityOption", XSD::QName.new(NsC_06, "AllowMacros")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConversionSettings,
    :schema_name => XSD::QName.new(NsC_06, "ConversionSettings"),
    :schema_element => [
      ["format", ["OutputFormat", XSD::QName.new(NsC_06, "Format")], [0, 1]],
      ["startPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "StartPage")], [0, 1]],
      ["endPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "EndPage")], [0, 1]],
      ["range", ["ConversionRange", XSD::QName.new(NsC_06, "Range")], [0, 1]],
      ["quality", ["ConversionQuality", XSD::QName.new(NsC_06, "Quality")], [0, 1]],
      ["pDFProfile", ["PDFProfile", XSD::QName.new(NsC_06, "PDFProfile")], [0, 1]],
      ["openPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OpenPassword")], [0, 1]],
      ["ownerPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OwnerPassword")], [0, 1]],
      ["securityOptions", [nil, XSD::QName.new(NsC_06, "SecurityOptions")], [0, 1]],
      ["fidelity", [nil, XSD::QName.new(NsC_06, "Fidelity")], [0, 1]],
      ["generateBookmarks", ["BookmarkGenerationOption", XSD::QName.new(NsC_06, "GenerateBookmarks")], [0, 1]],
      ["watermarks", ["ArrayOfWatermark", XSD::QName.new(NsC_06, "Watermarks")], [0, 1]],
      ["pageOrientation", ["PageOrientation", XSD::QName.new(NsC_06, "PageOrientation")], [0, 1]],
      ["converterSpecificSettings", ["ConverterSpecificSettings", XSD::QName.new(NsC_06, "ConverterSpecificSettings")], [0, 1]],
      ["outputFormatSpecificSettings", ["OutputFormatSpecificSettings", XSD::QName.new(NsC_06, "OutputFormatSpecificSettings")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => WebServiceFaultException,
    :schema_name => XSD::QName.new(NsC_06, "WebServiceFaultException"),
    :schema_element => [
      ["exceptionType", ["WebServiceExceptionType", XSD::QName.new(NsC_06, "ExceptionType")], [0, 1]],
      ["exceptionDetails", ["ArrayOfstring", XSD::QName.new(NsC_06, "ExceptionDetails")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ProcessingOptions,
    :schema_name => XSD::QName.new(NsC_06, "ProcessingOptions"),
    :schema_element => [
      ["sourceFiles", ["ArrayOfSourceFile", XSD::QName.new(NsC_06, "SourceFiles")], [0, 1]],
      ["mergeSettings", ["MergeSettings", XSD::QName.new(NsC_06, "MergeSettings")], [0, 1]],
      ["splitOptions", ["FileSplitOptions", XSD::QName.new(NsC_06, "SplitOptions")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfSourceFile,
    :schema_name => XSD::QName.new(NsC_06, "ArrayOfSourceFile"),
    :schema_element => [
      ["sourceFile", ["SourceFile[]", XSD::QName.new(NsC_06, "SourceFile")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => SourceFile,
    :schema_name => XSD::QName.new(NsC_06, "SourceFile"),
    :schema_element => [
      ["file", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06, "File")], [0, 1]],
      ["openOptions", ["OpenOptions", XSD::QName.new(NsC_06, "OpenOptions")], [0, 1]],
      ["conversionSettings", ["ConversionSettings", XSD::QName.new(NsC_06, "ConversionSettings")], [0, 1]],
      ["mergeSettings", ["FileMergeSettings", XSD::QName.new(NsC_06, "MergeSettings")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => FileMergeSettings,
    :schema_name => XSD::QName.new(NsC_06, "FileMergeSettings"),
    :schema_element => [
      ["topLevelBookmark", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "TopLevelBookmark")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => MergeSettings,
    :schema_name => XSD::QName.new(NsC_06, "MergeSettings"),
    :schema_element => [
      ["breakOnError", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "BreakOnError")], [0, 1]],
      ["pDFProfile", ["PDFProfile", XSD::QName.new(NsC_06, "PDFProfile")], [0, 1]],
      ["openPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OpenPassword")], [0, 1]],
      ["ownerPassword", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "OwnerPassword")], [0, 1]],
      ["securityOptions", [nil, XSD::QName.new(NsC_06, "SecurityOptions")], [0, 1]],
      ["watermarks", ["ArrayOfWatermark", XSD::QName.new(NsC_06, "Watermarks")], [0, 1]],
      ["omitErrorPages", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "OmitErrorPages")], [0, 1]],
      ["outputFormatSpecificSettings", ["OutputFormatSpecificSettings", XSD::QName.new(NsC_06, "OutputFormatSpecificSettings")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => FileSplitOptions,
    :schema_name => XSD::QName.new(NsC_06, "FileSplitOptions"),
    :schema_element => [
      ["fileSplitType", ["FileSplitType", XSD::QName.new(NsC_06, "FileSplitType")], [0, 1]],
      ["batchSize", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "BatchSize")], [0, 1]],
      ["bookmarkLevel", ["SOAP::SOAPInt", XSD::QName.new(NsC_06, "BookmarkLevel")], [0, 1]],
      ["fileNameTemplate", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileNameTemplate")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => BatchResults,
    :schema_name => XSD::QName.new(NsC_06, "BatchResults"),
    :schema_element => [
      ["results", ["ArrayOfBatchResult", XSD::QName.new(NsC_06, "Results")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfBatchResult,
    :schema_name => XSD::QName.new(NsC_06, "ArrayOfBatchResult"),
    :schema_element => [
      ["batchResult", ["BatchResult[]", XSD::QName.new(NsC_06, "BatchResult")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => BatchResult,
    :schema_name => XSD::QName.new(NsC_06, "BatchResult"),
    :schema_element => [
      ["file", ["SOAP::SOAPBase64", XSD::QName.new(NsC_06, "File")], [0, 1]],
      ["fileName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "FileName")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Configuration,
    :schema_name => XSD::QName.new(NsC_06, "Configuration"),
    :schema_element => [
      ["conversionServerAddress", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConversionServerAddress")], [0, 1]],
      ["converters", ["ArrayOfConverterConfiguration", XSD::QName.new(NsC_06, "Converters")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfConverterConfiguration,
    :schema_name => XSD::QName.new(NsC_06, "ArrayOfConverterConfiguration"),
    :schema_element => [
      ["converterConfiguration", ["ConverterConfiguration[]", XSD::QName.new(NsC_06, "ConverterConfiguration")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterConfiguration,
    :schema_name => XSD::QName.new(NsC_06, "ConverterConfiguration"),
    :schema_element => [
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]],
      ["supportedFidelity", [nil, XSD::QName.new(NsC_06, "SupportedFidelity")], [0, 1]],
      ["supportedFileExtensions", ["ArrayOfstring", XSD::QName.new(NsC_06, "SupportedFileExtensions")], [0, 1]],
      ["description", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "Description")], [0, 1]],
      ["supportedOutputFormats", ["ArrayOfstring", XSD::QName.new(NsC_06, "SupportedOutputFormats")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfDiagnosticRequestItem,
    :schema_name => XSD::QName.new(NsC_06, "ArrayOfDiagnosticRequestItem"),
    :schema_element => [
      ["diagnosticRequestItem", ["DiagnosticRequestItem[]", XSD::QName.new(NsC_06, "DiagnosticRequestItem")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => DiagnosticRequestItem,
    :schema_name => XSD::QName.new(NsC_06, "DiagnosticRequestItem"),
    :schema_element => [
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Diagnostics,
    :schema_name => XSD::QName.new(NsC_06, "Diagnostics"),
    :schema_element => [
      ["items", ["ArrayOfDiagnosticResultItem", XSD::QName.new(NsC_06, "Items")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfDiagnosticResultItem,
    :schema_name => XSD::QName.new(NsC_06, "ArrayOfDiagnosticResultItem"),
    :schema_element => [
      ["diagnosticResultItem", ["DiagnosticResultItem[]", XSD::QName.new(NsC_06, "DiagnosticResultItem")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => DiagnosticResultItem,
    :schema_name => XSD::QName.new(NsC_06, "DiagnosticResultItem"),
    :schema_element => [
      ["valid", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_06, "Valid")], [0, 1]],
      ["exceptionType", ["WebServiceExceptionType", XSD::QName.new(NsC_06, "ExceptionType")], [0, 1]],
      ["converterName", ["SOAP::SOAPString", XSD::QName.new(NsC_06, "ConverterName")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => MacroSecurityOption,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "MacroSecurityOption")
  )

  LiteralRegistry.register(
    :class => OutputFormat,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "OutputFormat")
  )

  LiteralRegistry.register(
    :class => ConversionRange,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "ConversionRange")
  )

  LiteralRegistry.register(
    :class => ConversionQuality,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "ConversionQuality")
  )

  LiteralRegistry.register(
    :class => PDFProfile,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFProfile")
  )

  LiteralRegistry.register(
    :class => BookmarkGenerationOption,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "BookmarkGenerationOption")
  )

  LiteralRegistry.register(
    :class => HTMLScaleMode,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "HTMLScaleMode")
  )

  LiteralRegistry.register(
    :class => CadConversionElementType,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadConversionElementType")
  )

  LiteralRegistry.register(
    :class => CadEmptyLayoutDetectionMode,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadEmptyLayoutDetectionMode")
  )

  LiteralRegistry.register(
    :class => CadLayoutSortOrder,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "CadLayoutSortOrder")
  )

  LiteralRegistry.register(
    :class => RevisionsAndCommentsMarkupMode,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "RevisionsAndCommentsMarkupMode")
  )

  LiteralRegistry.register(
    :class => RevisionsAndCommentsDisplayMode,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "RevisionsAndCommentsDisplayMode")
  )

  LiteralRegistry.register(
    :class => PresentationsPrintOutputType,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PresentationsPrintOutputType")
  )

  LiteralRegistry.register(
    :class => PDFPageLayout,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFPageLayout")
  )

  LiteralRegistry.register(
    :class => PDFNavigationPane,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFNavigationPane")
  )

  LiteralRegistry.register(
    :class => PDFPageScalingMode,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "PDFPageScalingMode")
  )

  LiteralRegistry.register(
    :class => WebServiceExceptionType,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "WebServiceExceptionType")
  )

  LiteralRegistry.register(
    :class => FileSplitType,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceData, "FileSplitType")
  )

  LiteralRegistry.register(
    :class => ArrayOfWatermark,
    :schema_name => XSD::QName.new(NsC_17, "ArrayOfWatermark"),
    :schema_element => [
      ["watermark", ["Watermark[]", XSD::QName.new(NsC_17, "Watermark")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Watermark,
    :schema_name => XSD::QName.new(NsC_17, "Watermark"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["elements", ["ArrayOfElement", XSD::QName.new(NsC_17, "Elements")], [0, 1]],
      ["defaults", ["Defaults", XSD::QName.new(NsC_17, "Defaults")], [0, 1]],
      ["pageOrientation", ["PageOrientation", XSD::QName.new(NsC_17, "PageOrientation")], [0, 1]],
      ["startPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "StartPage")], [0, 1]],
      ["endPage", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "EndPage")], [0, 1]],
      ["pageInterval", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "PageInterval")], [0, 1]],
      ["pageRange", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "PageRange")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Container,
    :schema_name => XSD::QName.new(NsC_17, "Container"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["elements", ["ArrayOfElement", XSD::QName.new(NsC_17, "Elements")], [0, 1]],
      ["defaults", ["Defaults", XSD::QName.new(NsC_17, "Defaults")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Element,
    :schema_name => XSD::QName.new(NsC_17, "Element"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfElement,
    :schema_name => XSD::QName.new(NsC_17, "ArrayOfElement"),
    :schema_element => [
      ["element", ["Element[]", XSD::QName.new(NsC_17, "Element")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Defaults,
    :schema_name => XSD::QName.new(NsC_17, "Defaults"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["fontFamilyName", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontFamilyName")], [0, 1]],
      ["fontSize", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontSize")], [0, 1]],
      ["fontStyle", [nil, XSD::QName.new(NsC_17, "FontStyle")], [0, 1]],
      ["hAlign", ["HAlign", XSD::QName.new(NsC_17, "HAlign")], [0, 1]],
      ["vAlign", ["VAlign", XSD::QName.new(NsC_17, "VAlign")], [0, 1]],
      ["wordWrap", ["WordWrap", XSD::QName.new(NsC_17, "WordWrap")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Text,
    :schema_name => XSD::QName.new(NsC_17, "Text"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["content", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Content")], [0, 1]],
      ["fontFamilyName", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontFamilyName")], [0, 1]],
      ["fontSize", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FontSize")], [0, 1]],
      ["fontStyle", [nil, XSD::QName.new(NsC_17, "FontStyle")], [0, 1]],
      ["wordWrap", ["WordWrap", XSD::QName.new(NsC_17, "WordWrap")], [0, 1]],
      ["hAlign", ["HAlign", XSD::QName.new(NsC_17, "HAlign")], [0, 1]],
      ["vAlign", ["VAlign", XSD::QName.new(NsC_17, "VAlign")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Pdf,
    :schema_name => XSD::QName.new(NsC_17, "Pdf"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["pdfData", ["SOAP::SOAPBase64", XSD::QName.new(NsC_17, "PdfData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Rtf,
    :schema_name => XSD::QName.new(NsC_17, "Rtf"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["rtfData", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "RtfData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Image,
    :schema_name => XSD::QName.new(NsC_17, "Image"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["imageData", ["SOAP::SOAPBase64", XSD::QName.new(NsC_17, "ImageData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Rectangle,
    :schema_name => XSD::QName.new(NsC_17, "Rectangle"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Ellipse,
    :schema_name => XSD::QName.new(NsC_17, "Ellipse"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Line,
    :schema_name => XSD::QName.new(NsC_17, "Line"),
    :schema_element => [
      ["hPosition", ["HPosition", XSD::QName.new(NsC_17, "HPosition")], [0, 1]],
      ["vPosition", ["VPosition", XSD::QName.new(NsC_17, "VPosition")], [0, 1]],
      ["x", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "X")], [0, 1]],
      ["y", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Y")], [0, 1]],
      ["width", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Width")], [0, 1]],
      ["height", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Height")], [0, 1]],
      ["zOrder", ["SOAP::SOAPInt", XSD::QName.new(NsC_17, "ZOrder")], [0, 1]],
      ["scaleMode", ["ScaleMode", XSD::QName.new(NsC_17, "ScaleMode")], [0, 1]],
      ["scaleX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleX")], [0, 1]],
      ["scaleY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "ScaleY")], [0, 1]],
      ["rotation", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Rotation")], [0, 1]],
      ["transparency", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "Transparency")], [0, 1]],
      ["lineColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineColor")], [0, 1]],
      ["lineWidth", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "LineWidth")], [0, 1]],
      ["fillColor", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "FillColor")], [0, 1]],
      ["endX", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "EndX")], [0, 1]],
      ["endY", ["SOAP::SOAPString", XSD::QName.new(NsC_17, "EndY")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => HPosition,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "HPosition")
  )

  LiteralRegistry.register(
    :class => VPosition,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "VPosition")
  )

  LiteralRegistry.register(
    :class => ScaleMode,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "ScaleMode")
  )

  LiteralRegistry.register(
    :class => HAlign,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "HAlign")
  )

  LiteralRegistry.register(
    :class => VAlign,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "VAlign")
  )

  LiteralRegistry.register(
    :class => WordWrap,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "WordWrap")
  )

  LiteralRegistry.register(
    :class => PageOrientation,
    :schema_name => XSD::QName.new(NsMuhimbiDocumentConverterWebServiceDataGraphics, "PageOrientation")
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_MSG,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_MSG"),
    :schema_element => [
      ["convertAttachments", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ConvertAttachments")], [0, 1]],
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["hTMLScaleMode", ["HTMLScaleMode", XSD::QName.new(NsC_22, "HTMLScaleMode")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_CommandLineConverter,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_CommandLineConverter"),
    :schema_element => [
      ["parameter1", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter1")], [0, 1]],
      ["parameter2", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter2")], [0, 1]],
      ["parameter3", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter3")], [0, 1]],
      ["parameter4", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter4")], [0, 1]],
      ["parameter5", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter5")], [0, 1]],
      ["parameter6", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter6")], [0, 1]],
      ["parameter7", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter7")], [0, 1]],
      ["parameter8", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter8")], [0, 1]],
      ["parameter9", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter9")], [0, 1]],
      ["parameter10", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Parameter10")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_Cad,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_Cad"),
    :schema_element => [
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["backgroundColor", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "BackgroundColor")], [0, 1]],
      ["foregroundColor", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "ForegroundColor")], [0, 1]],
      ["cadConversionElements", ["ArrayOfCadConversionElement", XSD::QName.new(NsC_22, "CadConversionElements")], [0, 1]],
      ["pageMargins", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PageMargins")], [0, 1]],
      ["emptyLayoutDetectionMode", ["CadEmptyLayoutDetectionMode", XSD::QName.new(NsC_22, "EmptyLayoutDetectionMode")], [0, 1]],
      ["layoutSortOrder", ["CadLayoutSortOrder", XSD::QName.new(NsC_22, "LayoutSortOrder")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfCadConversionElement,
    :schema_name => XSD::QName.new(NsC_22, "ArrayOfCadConversionElement"),
    :schema_element => [
      ["cadConversionElement", ["CadConversionElement[]", XSD::QName.new(NsC_22, "CadConversionElement")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => CadConversionElement,
    :schema_name => XSD::QName.new(NsC_22, "CadConversionElement"),
    :schema_element => [
      ["type", ["CadConversionElementType", XSD::QName.new(NsC_22, "Type")], [0, 1]],
      ["name", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Name")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_HTML,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_HTML"),
    :schema_element => [
      ["paperSize", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PaperSize")], [0, 1]],
      ["scaleMode", ["HTMLScaleMode", XSD::QName.new(NsC_22, "ScaleMode")], [0, 1]],
      ["pageMargins", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "PageMargins")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_InfoPath,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_InfoPath"),
    :schema_element => [
      ["stripDotNETCode", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "StripDotNETCode")], [0, 1]],
      ["stripDataObjects", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "StripDataObjects")], [0, 1]],
      ["convertAttachments", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ConvertAttachments")], [0, 1]],
      ["conversionViews", ["ArrayOfInfoPathView", XSD::QName.new(NsC_22, "ConversionViews")], [0, 1]],
      ["autoTrustForms", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "AutoTrustForms")], [0, 1]],
      ["processFullTrustForms", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ProcessFullTrustForms")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfInfoPathView,
    :schema_name => XSD::QName.new(NsC_22, "ArrayOfInfoPathView"),
    :schema_element => [
      ["infoPathView", ["InfoPathView[]", XSD::QName.new(NsC_22, "InfoPathView")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => InfoPathView,
    :schema_name => XSD::QName.new(NsC_22, "InfoPathView"),
    :schema_element => [
      ["name", ["SOAP::SOAPString", XSD::QName.new(NsC_22, "Name")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_WordProcessing,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_WordProcessing"),
    :schema_element => [
      ["revisionsAndCommentsMarkupMode", ["RevisionsAndCommentsMarkupMode", XSD::QName.new(NsC_22, "RevisionsAndCommentsMarkupMode")], [0, 1]],
      ["revisionsAndCommentsDisplayMode", ["RevisionsAndCommentsDisplayMode", XSD::QName.new(NsC_22, "RevisionsAndCommentsDisplayMode")], [0, 1]],
      ["processDocumentTemplate", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "ProcessDocumentTemplate")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ConverterSpecificSettings_Presentations,
    :schema_name => XSD::QName.new(NsC_22, "ConverterSpecificSettings_Presentations"),
    :schema_element => [
      ["printOutputType", ["PresentationsPrintOutputType", XSD::QName.new(NsC_22, "PrintOutputType")], [0, 1]],
      ["frameSlides", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_22, "FrameSlides")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => OutputFormatSpecificSettings,
    :schema_name => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => OutputFormatSpecificSettings_PDF,
    :schema_name => XSD::QName.new(NsC_14, "OutputFormatSpecificSettings_PDF"),
    :schema_element => [
      ["fastWebView", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FastWebView")], [0, 1]],
      ["embedAllFonts", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "EmbedAllFonts")], [0, 1]],
      ["subsetFonts", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "SubsetFonts")], [0, 1]],
      ["viewerPreferences", ["PDFViewerPreferences", XSD::QName.new(NsC_14, "ViewerPreferences")], [0, 1]],
      ["postProcessFile", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "PostProcessFile")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => PDFViewerPreferences,
    :schema_name => XSD::QName.new(NsC_14, "PDFViewerPreferences"),
    :schema_element => [
      ["centerWindow", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "CenterWindow")], [0, 1]],
      ["displayTitle", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "DisplayTitle")], [0, 1]],
      ["fitWindow", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FitWindow")], [0, 1]],
      ["hideMenubar", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideMenubar")], [0, 1]],
      ["hideToolbar", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideToolbar")], [0, 1]],
      ["hideWindowUI", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideWindowUI")], [0, 1]],
      ["pageLayout", ["PDFPageLayout", XSD::QName.new(NsC_14, "PageLayout")], [0, 1]],
      ["navigationPane", ["PDFNavigationPane", XSD::QName.new(NsC_14, "NavigationPane")], [0, 1]],
      ["hideEmptyNavigationPane", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "HideEmptyNavigationPane")], [0, 1]],
      ["pageScalingMode", ["PDFPageScalingMode", XSD::QName.new(NsC_14, "PageScalingMode")], [0, 1]],
      ["fullScreen", ["SOAP::SOAPBoolean", XSD::QName.new(NsC_14, "FullScreen")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => ArrayOfstring,
    :schema_name => XSD::QName.new(NsArrays, "ArrayOfstring"),
    :schema_element => [
      ["string", "SOAP::SOAPString[]", [0, nil]]
    ]
  )
end
