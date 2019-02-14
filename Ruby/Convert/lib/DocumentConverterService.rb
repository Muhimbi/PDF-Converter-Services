require 'xsd/qname'

# {http://types.muhimbi.com/2009/10/06}OpenOptions
#   userName - SOAP::SOAPString
#   password - SOAP::SOAPString
#   fileExtension - SOAP::SOAPString
#   originalFileName - SOAP::SOAPString
#   refreshContent - SOAP::SOAPBoolean
#   allowExternalConnections - SOAP::SOAPBoolean
#   allowMacros - MacroSecurityOption
class OpenOptions
  attr_accessor :userName
  attr_accessor :password
  attr_accessor :fileExtension
  attr_accessor :originalFileName
  attr_accessor :refreshContent
  attr_accessor :allowExternalConnections
  attr_accessor :allowMacros

  def initialize(userName = nil, password = nil, fileExtension = nil, originalFileName = nil, refreshContent = nil, allowExternalConnections = nil, allowMacros = nil)
    @userName = userName
    @password = password
    @fileExtension = fileExtension
    @originalFileName = originalFileName
    @refreshContent = refreshContent
    @allowExternalConnections = allowExternalConnections
    @allowMacros = allowMacros
  end
end

# {http://types.muhimbi.com/2009/10/06}ConversionSettings
#   format - OutputFormat
#   startPage - SOAP::SOAPInt
#   endPage - SOAP::SOAPInt
#   range - ConversionRange
#   quality - ConversionQuality
#   pDFProfile - PDFProfile
#   openPassword - SOAP::SOAPString
#   ownerPassword - SOAP::SOAPString
#   securityOptions - (any)
#   fidelity - (any)
#   generateBookmarks - BookmarkGenerationOption
#   watermarks - ArrayOfWatermark
#   pageOrientation - PageOrientation
#   converterSpecificSettings - ConverterSpecificSettings
#   outputFormatSpecificSettings - OutputFormatSpecificSettings
class ConversionSettings
  attr_accessor :format
  attr_accessor :startPage
  attr_accessor :endPage
  attr_accessor :range
  attr_accessor :quality
  attr_accessor :pDFProfile
  attr_accessor :openPassword
  attr_accessor :ownerPassword
  attr_accessor :securityOptions
  attr_accessor :fidelity
  attr_accessor :generateBookmarks
  attr_accessor :watermarks
  attr_accessor :pageOrientation
  attr_accessor :converterSpecificSettings
  attr_accessor :outputFormatSpecificSettings

  def initialize(format = nil, startPage = nil, endPage = nil, range = nil, quality = nil, pDFProfile = nil, openPassword = nil, ownerPassword = nil, securityOptions = nil, fidelity = nil, generateBookmarks = nil, watermarks = nil, pageOrientation = nil, converterSpecificSettings = nil, outputFormatSpecificSettings = nil)
    @format = format
    @startPage = startPage
    @endPage = endPage
    @range = range
    @quality = quality
    @pDFProfile = pDFProfile
    @openPassword = openPassword
    @ownerPassword = ownerPassword
    @securityOptions = securityOptions
    @fidelity = fidelity
    @generateBookmarks = generateBookmarks
    @watermarks = watermarks
    @pageOrientation = pageOrientation
    @converterSpecificSettings = converterSpecificSettings
    @outputFormatSpecificSettings = outputFormatSpecificSettings
  end
end

# {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#   exceptionType - WebServiceExceptionType
#   exceptionDetails - ArrayOfstring
class WebServiceFaultException
  attr_accessor :exceptionType
  attr_accessor :exceptionDetails

  def initialize(exceptionType = nil, exceptionDetails = nil)
    @exceptionType = exceptionType
    @exceptionDetails = exceptionDetails
  end
end

# {http://types.muhimbi.com/2009/10/06}ProcessingOptions
#   sourceFiles - ArrayOfSourceFile
#   mergeSettings - MergeSettings
#   splitOptions - FileSplitOptions
class ProcessingOptions
  attr_accessor :sourceFiles
  attr_accessor :mergeSettings
  attr_accessor :splitOptions

  def initialize(sourceFiles = nil, mergeSettings = nil, splitOptions = nil)
    @sourceFiles = sourceFiles
    @mergeSettings = mergeSettings
    @splitOptions = splitOptions
  end
end

# {http://types.muhimbi.com/2009/10/06}ArrayOfSourceFile
class ArrayOfSourceFile < ::Array
end

# {http://types.muhimbi.com/2009/10/06}SourceFile
#   file - SOAP::SOAPBase64
#   openOptions - OpenOptions
#   conversionSettings - ConversionSettings
#   mergeSettings - FileMergeSettings
class SourceFile
  attr_accessor :file
  attr_accessor :openOptions
  attr_accessor :conversionSettings
  attr_accessor :mergeSettings

  def initialize(file = nil, openOptions = nil, conversionSettings = nil, mergeSettings = nil)
    @file = file
    @openOptions = openOptions
    @conversionSettings = conversionSettings
    @mergeSettings = mergeSettings
  end
end

# {http://types.muhimbi.com/2009/10/06}FileMergeSettings
#   topLevelBookmark - SOAP::SOAPString
class FileMergeSettings
  attr_accessor :topLevelBookmark

  def initialize(topLevelBookmark = nil)
    @topLevelBookmark = topLevelBookmark
  end
end

# {http://types.muhimbi.com/2009/10/06}MergeSettings
#   breakOnError - SOAP::SOAPBoolean
#   pDFProfile - PDFProfile
#   openPassword - SOAP::SOAPString
#   ownerPassword - SOAP::SOAPString
#   securityOptions - (any)
#   watermarks - ArrayOfWatermark
#   omitErrorPages - SOAP::SOAPBoolean
#   outputFormatSpecificSettings - OutputFormatSpecificSettings
class MergeSettings
  attr_accessor :breakOnError
  attr_accessor :pDFProfile
  attr_accessor :openPassword
  attr_accessor :ownerPassword
  attr_accessor :securityOptions
  attr_accessor :watermarks
  attr_accessor :omitErrorPages
  attr_accessor :outputFormatSpecificSettings

  def initialize(breakOnError = nil, pDFProfile = nil, openPassword = nil, ownerPassword = nil, securityOptions = nil, watermarks = nil, omitErrorPages = nil, outputFormatSpecificSettings = nil)
    @breakOnError = breakOnError
    @pDFProfile = pDFProfile
    @openPassword = openPassword
    @ownerPassword = ownerPassword
    @securityOptions = securityOptions
    @watermarks = watermarks
    @omitErrorPages = omitErrorPages
    @outputFormatSpecificSettings = outputFormatSpecificSettings
  end
end

# {http://types.muhimbi.com/2009/10/06}FileSplitOptions
#   fileSplitType - FileSplitType
#   batchSize - SOAP::SOAPInt
#   bookmarkLevel - SOAP::SOAPInt
#   fileNameTemplate - SOAP::SOAPString
class FileSplitOptions
  attr_accessor :fileSplitType
  attr_accessor :batchSize
  attr_accessor :bookmarkLevel
  attr_accessor :fileNameTemplate

  def initialize(fileSplitType = nil, batchSize = nil, bookmarkLevel = nil, fileNameTemplate = nil)
    @fileSplitType = fileSplitType
    @batchSize = batchSize
    @bookmarkLevel = bookmarkLevel
    @fileNameTemplate = fileNameTemplate
  end
end

# {http://types.muhimbi.com/2009/10/06}BatchResults
#   results - ArrayOfBatchResult
class BatchResults
  attr_accessor :results

  def initialize(results = nil)
    @results = results
  end
end

# {http://types.muhimbi.com/2009/10/06}ArrayOfBatchResult
class ArrayOfBatchResult < ::Array
end

# {http://types.muhimbi.com/2009/10/06}BatchResult
#   file - SOAP::SOAPBase64
#   fileName - SOAP::SOAPString
class BatchResult
  attr_accessor :file
  attr_accessor :fileName

  def initialize(file = nil, fileName = nil)
    @file = file
    @fileName = fileName
  end
end

# {http://types.muhimbi.com/2009/10/06}Configuration
#   conversionServerAddress - SOAP::SOAPString
#   converters - ArrayOfConverterConfiguration
class Configuration
  attr_accessor :conversionServerAddress
  attr_accessor :converters

  def initialize(conversionServerAddress = nil, converters = nil)
    @conversionServerAddress = conversionServerAddress
    @converters = converters
  end
end

# {http://types.muhimbi.com/2009/10/06}ArrayOfConverterConfiguration
class ArrayOfConverterConfiguration < ::Array
end

# {http://types.muhimbi.com/2009/10/06}ConverterConfiguration
#   converterName - SOAP::SOAPString
#   supportedFidelity - (any)
#   supportedFileExtensions - ArrayOfstring
#   description - SOAP::SOAPString
#   supportedOutputFormats - ArrayOfstring
class ConverterConfiguration
  attr_accessor :converterName
  attr_accessor :supportedFidelity
  attr_accessor :supportedFileExtensions
  attr_accessor :description
  attr_accessor :supportedOutputFormats

  def initialize(converterName = nil, supportedFidelity = nil, supportedFileExtensions = nil, description = nil, supportedOutputFormats = nil)
    @converterName = converterName
    @supportedFidelity = supportedFidelity
    @supportedFileExtensions = supportedFileExtensions
    @description = description
    @supportedOutputFormats = supportedOutputFormats
  end
end

# {http://types.muhimbi.com/2009/10/06}ArrayOfDiagnosticRequestItem
class ArrayOfDiagnosticRequestItem < ::Array
end

# {http://types.muhimbi.com/2009/10/06}DiagnosticRequestItem
#   converterName - SOAP::SOAPString
class DiagnosticRequestItem
  attr_accessor :converterName

  def initialize(converterName = nil)
    @converterName = converterName
  end
end

# {http://types.muhimbi.com/2009/10/06}Diagnostics
#   items - ArrayOfDiagnosticResultItem
class Diagnostics
  attr_accessor :items

  def initialize(items = nil)
    @items = items
  end
end

# {http://types.muhimbi.com/2009/10/06}ArrayOfDiagnosticResultItem
class ArrayOfDiagnosticResultItem < ::Array
end

# {http://types.muhimbi.com/2009/10/06}DiagnosticResultItem
#   valid - SOAP::SOAPBoolean
#   exceptionType - WebServiceExceptionType
#   converterName - SOAP::SOAPString
class DiagnosticResultItem
  attr_accessor :valid
  attr_accessor :exceptionType
  attr_accessor :converterName

  def initialize(valid = nil, exceptionType = nil, converterName = nil)
    @valid = valid
    @exceptionType = exceptionType
    @converterName = converterName
  end
end

# {http://types.muhimbi.com/2010/05/17}ArrayOfWatermark
class ArrayOfWatermark < ::Array
end

# {http://types.muhimbi.com/2010/05/17}Element
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
class Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
  end
end

# {http://types.muhimbi.com/2010/05/17}Container
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   elements - ArrayOfElement
#   defaults - Defaults
class Container < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :elements
  attr_accessor :defaults

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, elements = nil, defaults = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @elements = elements
    @defaults = defaults
  end
end

# {http://types.muhimbi.com/2010/05/17}Watermark
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   elements - ArrayOfElement
#   defaults - Defaults
#   pageOrientation - PageOrientation
#   startPage - SOAP::SOAPInt
#   endPage - SOAP::SOAPInt
#   pageInterval - SOAP::SOAPInt
#   pageRange - SOAP::SOAPString
class Watermark < Container
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :elements
  attr_accessor :defaults
  attr_accessor :pageOrientation
  attr_accessor :startPage
  attr_accessor :endPage
  attr_accessor :pageInterval
  attr_accessor :pageRange

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, elements = nil, defaults = nil, pageOrientation = nil, startPage = nil, endPage = nil, pageInterval = nil, pageRange = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @elements = elements
    @defaults = defaults
    @pageOrientation = pageOrientation
    @startPage = startPage
    @endPage = endPage
    @pageInterval = pageInterval
    @pageRange = pageRange
  end
end

# {http://types.muhimbi.com/2010/05/17}Text
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   content - SOAP::SOAPString
#   fontFamilyName - SOAP::SOAPString
#   fontSize - SOAP::SOAPString
#   fontStyle - (any)
#   wordWrap - WordWrap
#   hAlign - HAlign
#   vAlign - VAlign
class Text < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :content
  attr_accessor :fontFamilyName
  attr_accessor :fontSize
  attr_accessor :fontStyle
  attr_accessor :wordWrap
  attr_accessor :hAlign
  attr_accessor :vAlign

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, content = nil, fontFamilyName = nil, fontSize = nil, fontStyle = nil, wordWrap = nil, hAlign = nil, vAlign = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @content = content
    @fontFamilyName = fontFamilyName
    @fontSize = fontSize
    @fontStyle = fontStyle
    @wordWrap = wordWrap
    @hAlign = hAlign
    @vAlign = vAlign
  end
end

# {http://types.muhimbi.com/2010/05/17}Pdf
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   pdfData - SOAP::SOAPBase64
class Pdf < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :pdfData

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, pdfData = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @pdfData = pdfData
  end
end

# {http://types.muhimbi.com/2010/05/17}Rtf
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   rtfData - SOAP::SOAPString
class Rtf < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :rtfData

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, rtfData = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @rtfData = rtfData
  end
end

# {http://types.muhimbi.com/2010/05/17}Image
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   imageData - SOAP::SOAPBase64
class Image < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :imageData

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, imageData = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @imageData = imageData
  end
end

# {http://types.muhimbi.com/2010/05/17}Rectangle
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
class Rectangle < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
  end
end

# {http://types.muhimbi.com/2010/05/17}Ellipse
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
class Ellipse < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
  end
end

# {http://types.muhimbi.com/2010/05/17}Line
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   width - SOAP::SOAPString
#   height - SOAP::SOAPString
#   zOrder - SOAP::SOAPInt
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   endX - SOAP::SOAPString
#   endY - SOAP::SOAPString
class Line < Element
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :width
  attr_accessor :height
  attr_accessor :zOrder
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :endX
  attr_accessor :endY

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, width = nil, height = nil, zOrder = nil, scaleMode = nil, scaleX = nil, scaleY = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, endX = nil, endY = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @width = width
    @height = height
    @zOrder = zOrder
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @endX = endX
    @endY = endY
  end
end

# {http://types.muhimbi.com/2010/05/17}ArrayOfElement
class ArrayOfElement < ::Array
end

# {http://types.muhimbi.com/2010/05/17}Defaults
#   hPosition - HPosition
#   vPosition - VPosition
#   x - SOAP::SOAPString
#   y - SOAP::SOAPString
#   rotation - SOAP::SOAPString
#   transparency - SOAP::SOAPString
#   lineColor - SOAP::SOAPString
#   lineWidth - SOAP::SOAPString
#   fillColor - SOAP::SOAPString
#   fontFamilyName - SOAP::SOAPString
#   fontSize - SOAP::SOAPString
#   fontStyle - (any)
#   hAlign - HAlign
#   vAlign - VAlign
#   wordWrap - WordWrap
#   scaleMode - ScaleMode
#   scaleX - SOAP::SOAPString
#   scaleY - SOAP::SOAPString
class Defaults
  attr_accessor :hPosition
  attr_accessor :vPosition
  attr_accessor :x
  attr_accessor :y
  attr_accessor :rotation
  attr_accessor :transparency
  attr_accessor :lineColor
  attr_accessor :lineWidth
  attr_accessor :fillColor
  attr_accessor :fontFamilyName
  attr_accessor :fontSize
  attr_accessor :fontStyle
  attr_accessor :hAlign
  attr_accessor :vAlign
  attr_accessor :wordWrap
  attr_accessor :scaleMode
  attr_accessor :scaleX
  attr_accessor :scaleY

  def initialize(hPosition = nil, vPosition = nil, x = nil, y = nil, rotation = nil, transparency = nil, lineColor = nil, lineWidth = nil, fillColor = nil, fontFamilyName = nil, fontSize = nil, fontStyle = nil, hAlign = nil, vAlign = nil, wordWrap = nil, scaleMode = nil, scaleX = nil, scaleY = nil)
    @hPosition = hPosition
    @vPosition = vPosition
    @x = x
    @y = y
    @rotation = rotation
    @transparency = transparency
    @lineColor = lineColor
    @lineWidth = lineWidth
    @fillColor = fillColor
    @fontFamilyName = fontFamilyName
    @fontSize = fontSize
    @fontStyle = fontStyle
    @hAlign = hAlign
    @vAlign = vAlign
    @wordWrap = wordWrap
    @scaleMode = scaleMode
    @scaleX = scaleX
    @scaleY = scaleY
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings
class ConverterSpecificSettings
  def initialize
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_MSG
#   convertAttachments - SOAP::SOAPBoolean
#   paperSize - SOAP::SOAPString
#   hTMLScaleMode - HTMLScaleMode
class ConverterSpecificSettings_MSG < ConverterSpecificSettings
  attr_accessor :convertAttachments
  attr_accessor :paperSize
  attr_accessor :hTMLScaleMode

  def initialize(convertAttachments = nil, paperSize = nil, hTMLScaleMode = nil)
    @convertAttachments = convertAttachments
    @paperSize = paperSize
    @hTMLScaleMode = hTMLScaleMode
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_CommandLineConverter
#   parameter1 - SOAP::SOAPString
#   parameter2 - SOAP::SOAPString
#   parameter3 - SOAP::SOAPString
#   parameter4 - SOAP::SOAPString
#   parameter5 - SOAP::SOAPString
#   parameter6 - SOAP::SOAPString
#   parameter7 - SOAP::SOAPString
#   parameter8 - SOAP::SOAPString
#   parameter9 - SOAP::SOAPString
#   parameter10 - SOAP::SOAPString
class ConverterSpecificSettings_CommandLineConverter < ConverterSpecificSettings
  attr_accessor :parameter1
  attr_accessor :parameter2
  attr_accessor :parameter3
  attr_accessor :parameter4
  attr_accessor :parameter5
  attr_accessor :parameter6
  attr_accessor :parameter7
  attr_accessor :parameter8
  attr_accessor :parameter9
  attr_accessor :parameter10

  def initialize(parameter1 = nil, parameter2 = nil, parameter3 = nil, parameter4 = nil, parameter5 = nil, parameter6 = nil, parameter7 = nil, parameter8 = nil, parameter9 = nil, parameter10 = nil)
    @parameter1 = parameter1
    @parameter2 = parameter2
    @parameter3 = parameter3
    @parameter4 = parameter4
    @parameter5 = parameter5
    @parameter6 = parameter6
    @parameter7 = parameter7
    @parameter8 = parameter8
    @parameter9 = parameter9
    @parameter10 = parameter10
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_Cad
#   paperSize - SOAP::SOAPString
#   backgroundColor - SOAP::SOAPString
#   foregroundColor - SOAP::SOAPString
#   cadConversionElements - ArrayOfCadConversionElement
#   pageMargins - SOAP::SOAPString
#   emptyLayoutDetectionMode - CadEmptyLayoutDetectionMode
#   layoutSortOrder - CadLayoutSortOrder
class ConverterSpecificSettings_Cad < ConverterSpecificSettings
  attr_accessor :paperSize
  attr_accessor :backgroundColor
  attr_accessor :foregroundColor
  attr_accessor :cadConversionElements
  attr_accessor :pageMargins
  attr_accessor :emptyLayoutDetectionMode
  attr_accessor :layoutSortOrder

  def initialize(paperSize = nil, backgroundColor = nil, foregroundColor = nil, cadConversionElements = nil, pageMargins = nil, emptyLayoutDetectionMode = nil, layoutSortOrder = nil)
    @paperSize = paperSize
    @backgroundColor = backgroundColor
    @foregroundColor = foregroundColor
    @cadConversionElements = cadConversionElements
    @pageMargins = pageMargins
    @emptyLayoutDetectionMode = emptyLayoutDetectionMode
    @layoutSortOrder = layoutSortOrder
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_HTML
#   paperSize - SOAP::SOAPString
#   scaleMode - HTMLScaleMode
#   pageMargins - SOAP::SOAPString
class ConverterSpecificSettings_HTML < ConverterSpecificSettings
  attr_accessor :paperSize
  attr_accessor :scaleMode
  attr_accessor :pageMargins

  def initialize(paperSize = nil, scaleMode = nil, pageMargins = nil)
    @paperSize = paperSize
    @scaleMode = scaleMode
    @pageMargins = pageMargins
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_InfoPath
#   stripDotNETCode - SOAP::SOAPBoolean
#   stripDataObjects - SOAP::SOAPBoolean
#   convertAttachments - SOAP::SOAPBoolean
#   conversionViews - ArrayOfInfoPathView
#   autoTrustForms - SOAP::SOAPBoolean
#   processFullTrustForms - SOAP::SOAPBoolean
class ConverterSpecificSettings_InfoPath < ConverterSpecificSettings
  attr_accessor :stripDotNETCode
  attr_accessor :stripDataObjects
  attr_accessor :convertAttachments
  attr_accessor :conversionViews
  attr_accessor :autoTrustForms
  attr_accessor :processFullTrustForms

  def initialize(stripDotNETCode = nil, stripDataObjects = nil, convertAttachments = nil, conversionViews = nil, autoTrustForms = nil, processFullTrustForms = nil)
    @stripDotNETCode = stripDotNETCode
    @stripDataObjects = stripDataObjects
    @convertAttachments = convertAttachments
    @conversionViews = conversionViews
    @autoTrustForms = autoTrustForms
    @processFullTrustForms = processFullTrustForms
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_WordProcessing
#   revisionsAndCommentsMarkupMode - RevisionsAndCommentsMarkupMode
#   revisionsAndCommentsDisplayMode - RevisionsAndCommentsDisplayMode
#   processDocumentTemplate - SOAP::SOAPBoolean
class ConverterSpecificSettings_WordProcessing < ConverterSpecificSettings
  attr_accessor :revisionsAndCommentsMarkupMode
  attr_accessor :revisionsAndCommentsDisplayMode
  attr_accessor :processDocumentTemplate

  def initialize(revisionsAndCommentsMarkupMode = nil, revisionsAndCommentsDisplayMode = nil, processDocumentTemplate = nil)
    @revisionsAndCommentsMarkupMode = revisionsAndCommentsMarkupMode
    @revisionsAndCommentsDisplayMode = revisionsAndCommentsDisplayMode
    @processDocumentTemplate = processDocumentTemplate
  end
end

# {http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings_Presentations
#   printOutputType - PresentationsPrintOutputType
#   frameSlides - SOAP::SOAPBoolean
class ConverterSpecificSettings_Presentations < ConverterSpecificSettings
  attr_accessor :printOutputType
  attr_accessor :frameSlides

  def initialize(printOutputType = nil, frameSlides = nil)
    @printOutputType = printOutputType
    @frameSlides = frameSlides
  end
end

# {http://types.muhimbi.com/2010/11/22}ArrayOfCadConversionElement
class ArrayOfCadConversionElement < ::Array
end

# {http://types.muhimbi.com/2010/11/22}CadConversionElement
#   type - CadConversionElementType
#   name - SOAP::SOAPString
class CadConversionElement
  attr_accessor :type
  attr_accessor :name

  def initialize(type = nil, name = nil)
    @type = type
    @name = name
  end
end

# {http://types.muhimbi.com/2010/11/22}ArrayOfInfoPathView
class ArrayOfInfoPathView < ::Array
end

# {http://types.muhimbi.com/2010/11/22}InfoPathView
#   name - SOAP::SOAPString
class InfoPathView
  attr_accessor :name

  def initialize(name = nil)
    @name = name
  end
end

# {http://types.muhimbi.com/2013/01/14}OutputFormatSpecificSettings
class OutputFormatSpecificSettings
  def initialize
  end
end

# {http://types.muhimbi.com/2013/01/14}OutputFormatSpecificSettings_PDF
#   fastWebView - SOAP::SOAPBoolean
#   embedAllFonts - SOAP::SOAPBoolean
#   subsetFonts - SOAP::SOAPBoolean
#   viewerPreferences - PDFViewerPreferences
#   postProcessFile - SOAP::SOAPBoolean
class OutputFormatSpecificSettings_PDF < OutputFormatSpecificSettings
  attr_accessor :fastWebView
  attr_accessor :embedAllFonts
  attr_accessor :subsetFonts
  attr_accessor :viewerPreferences
  attr_accessor :postProcessFile

  def initialize(fastWebView = nil, embedAllFonts = nil, subsetFonts = nil, viewerPreferences = nil, postProcessFile = nil)
    @fastWebView = fastWebView
    @embedAllFonts = embedAllFonts
    @subsetFonts = subsetFonts
    @viewerPreferences = viewerPreferences
    @postProcessFile = postProcessFile
  end
end

# {http://types.muhimbi.com/2013/01/14}PDFViewerPreferences
#   centerWindow - SOAP::SOAPBoolean
#   displayTitle - SOAP::SOAPBoolean
#   fitWindow - SOAP::SOAPBoolean
#   hideMenubar - SOAP::SOAPBoolean
#   hideToolbar - SOAP::SOAPBoolean
#   hideWindowUI - SOAP::SOAPBoolean
#   pageLayout - PDFPageLayout
#   navigationPane - PDFNavigationPane
#   hideEmptyNavigationPane - SOAP::SOAPBoolean
#   pageScalingMode - PDFPageScalingMode
#   fullScreen - SOAP::SOAPBoolean
class PDFViewerPreferences
  attr_accessor :centerWindow
  attr_accessor :displayTitle
  attr_accessor :fitWindow
  attr_accessor :hideMenubar
  attr_accessor :hideToolbar
  attr_accessor :hideWindowUI
  attr_accessor :pageLayout
  attr_accessor :navigationPane
  attr_accessor :hideEmptyNavigationPane
  attr_accessor :pageScalingMode
  attr_accessor :fullScreen

  def initialize(centerWindow = nil, displayTitle = nil, fitWindow = nil, hideMenubar = nil, hideToolbar = nil, hideWindowUI = nil, pageLayout = nil, navigationPane = nil, hideEmptyNavigationPane = nil, pageScalingMode = nil, fullScreen = nil)
    @centerWindow = centerWindow
    @displayTitle = displayTitle
    @fitWindow = fitWindow
    @hideMenubar = hideMenubar
    @hideToolbar = hideToolbar
    @hideWindowUI = hideWindowUI
    @pageLayout = pageLayout
    @navigationPane = navigationPane
    @hideEmptyNavigationPane = hideEmptyNavigationPane
    @pageScalingMode = pageScalingMode
    @fullScreen = fullScreen
  end
end

# {http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring
class ArrayOfstring < ::Array
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MacroSecurityOption
class MacroSecurityOption < ::String
  All = MacroSecurityOption.new("All")
  None = MacroSecurityOption.new("None")
  SignedOnly = MacroSecurityOption.new("SignedOnly")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OutputFormat
class OutputFormat < ::String
  CSV = OutputFormat.new("CSV")
  DOC = OutputFormat.new("DOC")
  DOCX = OutputFormat.new("DOCX")
  HTML = OutputFormat.new("HTML")
  MHT = OutputFormat.new("MHT")
  ODP = OutputFormat.new("ODP")
  ODS = OutputFormat.new("ODS")
  ODT = OutputFormat.new("ODT")
  PDF = OutputFormat.new("PDF")
  PPS = OutputFormat.new("PPS")
  PPSX = OutputFormat.new("PPSX")
  PPT = OutputFormat.new("PPT")
  PPTX = OutputFormat.new("PPTX")
  RTF = OutputFormat.new("RTF")
  TXT = OutputFormat.new("TXT")
  XLS = OutputFormat.new("XLS")
  XLSX = OutputFormat.new("XLSX")
  XML = OutputFormat.new("XML")
  XPS = OutputFormat.new("XPS")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ConversionRange
class ConversionRange < ::String
  ActiveDocuments = ConversionRange.new("ActiveDocuments")
  AllDocuments = ConversionRange.new("AllDocuments")
  VisibleDocuments = ConversionRange.new("VisibleDocuments")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ConversionQuality
class ConversionQuality < ::String
  OptimizeForOnScreen = ConversionQuality.new("OptimizeForOnScreen")
  OptimizeForPrint = ConversionQuality.new("OptimizeForPrint")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFProfile
class PDFProfile < ::String
  Default = PDFProfile.new("Default")
  PDF_1_1 = PDFProfile.new("PDF_1_1")
  PDF_1_2 = PDFProfile.new("PDF_1_2")
  PDF_1_3 = PDFProfile.new("PDF_1_3")
  PDF_1_4 = PDFProfile.new("PDF_1_4")
  PDF_1_5 = PDFProfile.new("PDF_1_5")
  PDF_1_6 = PDFProfile.new("PDF_1_6")
  PDF_1_7 = PDFProfile.new("PDF_1_7")
  PDF_A1B = PDFProfile.new("PDF_A1B")
  PDF_A2B = PDFProfile.new("PDF_A2B")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}SecurityOptions
#   contains list of SecurityOptions::*
class SecurityOptions < ::Array
  DisableAnotations = "DisableAnotations"
  DisableContentAccessibility = "DisableContentAccessibility"
  DisableContentCopy = "DisableContentCopy"
  DisableDocumentAssembly = "DisableDocumentAssembly"
  DisableFormFields = "DisableFormFields"
  DisableHighResolutionPrint = "DisableHighResolutionPrint"
  DisablePrint = "DisablePrint"
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ConversionFidelities
#   contains list of ConversionFidelities::*
class ConversionFidelities < ::Array
  Full = "Full"
  High = "High"
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BookmarkGenerationOption
class BookmarkGenerationOption < ::String
  Automatic = BookmarkGenerationOption.new("Automatic")
  Custom = BookmarkGenerationOption.new("Custom")
  Disabled = BookmarkGenerationOption.new("Disabled")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}HTMLScaleMode
class HTMLScaleMode < ::String
  Default = HTMLScaleMode.new("Default")
  FitWidth = HTMLScaleMode.new("FitWidth")
  FitWidthScaleImagesOnly = HTMLScaleMode.new("FitWidthScaleImagesOnly")
  NoScale = HTMLScaleMode.new("NoScale")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}CadConversionElementType
class CadConversionElementType < ::String
  AllLayouts = CadConversionElementType.new("AllLayouts")
  BackView = CadConversionElementType.new("BackView")
  BottomView = CadConversionElementType.new("BottomView")
  FrontView = CadConversionElementType.new("FrontView")
  LeftView = CadConversionElementType.new("LeftView")
  NE_IsometricView = CadConversionElementType.new("NE_IsometricView")
  NW_IsometricView = CadConversionElementType.new("NW_IsometricView")
  NamedLayout = CadConversionElementType.new("NamedLayout")
  NamedView = CadConversionElementType.new("NamedView")
  RightView = CadConversionElementType.new("RightView")
  SE_IsometricView = CadConversionElementType.new("SE_IsometricView")
  SW_IsometricView = CadConversionElementType.new("SW_IsometricView")
  TopView = CadConversionElementType.new("TopView")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}CadEmptyLayoutDetectionMode
class CadEmptyLayoutDetectionMode < ::String
  Default = CadEmptyLayoutDetectionMode.new("Default")
  SkipEmptyLayouts = CadEmptyLayoutDetectionMode.new("SkipEmptyLayouts")
  SkipLayoutsWithoutViewports = CadEmptyLayoutDetectionMode.new("SkipLayoutsWithoutViewports")
  SkipNone = CadEmptyLayoutDetectionMode.new("SkipNone")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}CadLayoutSortOrder
class CadLayoutSortOrder < ::String
  Ascending = CadLayoutSortOrder.new("Ascending")
  Default = CadLayoutSortOrder.new("Default")
  Descending = CadLayoutSortOrder.new("Descending")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}RevisionsAndCommentsMarkupMode
class RevisionsAndCommentsMarkupMode < ::String
  Balloon = RevisionsAndCommentsMarkupMode.new("Balloon")
  InLine = RevisionsAndCommentsMarkupMode.new("InLine")
  Mixed = RevisionsAndCommentsMarkupMode.new("Mixed")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}RevisionsAndCommentsDisplayMode
class RevisionsAndCommentsDisplayMode < ::String
  Final = RevisionsAndCommentsDisplayMode.new("Final")
  FinalShowingMarkup = RevisionsAndCommentsDisplayMode.new("FinalShowingMarkup")
  Original = RevisionsAndCommentsDisplayMode.new("Original")
  OriginalShowingMarkup = RevisionsAndCommentsDisplayMode.new("OriginalShowingMarkup")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PresentationsPrintOutputType
class PresentationsPrintOutputType < ::String
  FourSlideHandouts = PresentationsPrintOutputType.new("FourSlideHandouts")
  NineSlideHandouts = PresentationsPrintOutputType.new("NineSlideHandouts")
  NotesPages = PresentationsPrintOutputType.new("NotesPages")
  OneSlideHandouts = PresentationsPrintOutputType.new("OneSlideHandouts")
  Outline = PresentationsPrintOutputType.new("Outline")
  SixSlideHandouts = PresentationsPrintOutputType.new("SixSlideHandouts")
  Slides = PresentationsPrintOutputType.new("Slides")
  ThreeSlideHandouts = PresentationsPrintOutputType.new("ThreeSlideHandouts")
  TwoSlideHandouts = PresentationsPrintOutputType.new("TwoSlideHandouts")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFPageLayout
class PDFPageLayout < ::String
  OneColumn = PDFPageLayout.new("OneColumn")
  SinglePage = PDFPageLayout.new("SinglePage")
  TwoColumnLeft = PDFPageLayout.new("TwoColumnLeft")
  TwoColumnRight = PDFPageLayout.new("TwoColumnRight")
  TwoPageLeft = PDFPageLayout.new("TwoPageLeft")
  TwoPageRight = PDFPageLayout.new("TwoPageRight")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFNavigationPane
class PDFNavigationPane < ::String
  Attachments = PDFNavigationPane.new("Attachments")
  Bookmarks = PDFNavigationPane.new("Bookmarks")
  None = PDFNavigationPane.new("None")
  OptionalContent = PDFNavigationPane.new("OptionalContent")
  Thumbnails = PDFNavigationPane.new("Thumbnails")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFPageScalingMode
class PDFPageScalingMode < ::String
  Default = PDFPageScalingMode.new("Default")
  None = PDFPageScalingMode.new("None")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}WebServiceExceptionType
class WebServiceExceptionType < ::String
  ConfigurationError = WebServiceExceptionType.new("ConfigurationError")
  ConversionTimeOut = WebServiceExceptionType.new("ConversionTimeOut")
  ConverterNotInstalled = WebServiceExceptionType.new("ConverterNotInstalled")
  ConverterNotResponding = WebServiceExceptionType.new("ConverterNotResponding")
  CorruptDocument = WebServiceExceptionType.new("CorruptDocument")
  ErrorOpeningFile = WebServiceExceptionType.new("ErrorOpeningFile")
  ExternalDependencyError = WebServiceExceptionType.new("ExternalDependencyError")
  FileFormatNotSupported = WebServiceExceptionType.new("FileFormatNotSupported")
  InternalError = WebServiceExceptionType.new("InternalError")
  OutputFormatNotSupported = WebServiceExceptionType.new("OutputFormatNotSupported")
  TrialExpired = WebServiceExceptionType.new("TrialExpired")
  Unknown = WebServiceExceptionType.new("Unknown")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}FileSplitType
class FileSplitType < ::String
  ByBookmarkLevel = FileSplitType.new("ByBookmarkLevel")
  ByNumberOfPages = FileSplitType.new("ByNumberOfPages")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HPosition
class HPosition < ::String
  Absolute = HPosition.new("Absolute")
  Center = HPosition.new("Center")
  Default = HPosition.new("Default")
  Left = HPosition.new("Left")
  Random = HPosition.new("Random")
  Right = HPosition.new("Right")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}VPosition
class VPosition < ::String
  Absolute = VPosition.new("Absolute")
  Bottom = VPosition.new("Bottom")
  Default = VPosition.new("Default")
  Middle = VPosition.new("Middle")
  Random = VPosition.new("Random")
  Top = VPosition.new("Top")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}ScaleMode
class ScaleMode < ::String
  Absolute = ScaleMode.new("Absolute")
  Default = ScaleMode.new("Default")
  ExactFit = ScaleMode.new("ExactFit")
  MaintainAspectRatio = ScaleMode.new("MaintainAspectRatio")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}FontStyle
#   contains list of FontStyle::*
class FontStyle < ::Array
  Bold = "Bold"
  Default = "Default"
  Italic = "Italic"
  Regular = "Regular"
  Strikeout = "Strikeout"
  Underline = "Underline"
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HAlign
class HAlign < ::String
  Center = HAlign.new("Center")
  Default = HAlign.new("Default")
  Justify = HAlign.new("Justify")
  Left = HAlign.new("Left")
  Right = HAlign.new("Right")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}VAlign
class VAlign < ::String
  Bottom = VAlign.new("Bottom")
  Default = VAlign.new("Default")
  Middle = VAlign.new("Middle")
  Top = VAlign.new("Top")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}WordWrap
class WordWrap < ::String
  Character = WordWrap.new("Character")
  Default = WordWrap.new("Default")
  None = WordWrap.new("None")
  Word = WordWrap.new("Word")
  WordOnly = WordWrap.new("WordOnly")
end

# {http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageOrientation
class PageOrientation < ::String
  Both = PageOrientation.new("Both")
  Default = PageOrientation.new("Default")
  Landscape = PageOrientation.new("Landscape")
  Portrait = PageOrientation.new("Portrait")
end

# {http://services.muhimbi.com/2009/10/06}Convert
#   sourceFile - SOAP::SOAPBase64
#   openOptions - OpenOptions
#   conversionSettings - ConversionSettings
class Convert
  attr_accessor :sourceFile
  attr_accessor :openOptions
  attr_accessor :conversionSettings

  def initialize(sourceFile = nil, openOptions = nil, conversionSettings = nil)
    @sourceFile = sourceFile
    @openOptions = openOptions
    @conversionSettings = conversionSettings
  end
end

# {http://services.muhimbi.com/2009/10/06}ConvertResponse
#   convertResult - SOAP::SOAPBase64
class ConvertResponse
  attr_accessor :convertResult

  def initialize(convertResult = nil)
    @convertResult = convertResult
  end
end

# {http://services.muhimbi.com/2009/10/06}ApplyWatermark
#   sourceFile - SOAP::SOAPBase64
#   openOptions - OpenOptions
#   conversionSettings - ConversionSettings
class ApplyWatermark
  attr_accessor :sourceFile
  attr_accessor :openOptions
  attr_accessor :conversionSettings

  def initialize(sourceFile = nil, openOptions = nil, conversionSettings = nil)
    @sourceFile = sourceFile
    @openOptions = openOptions
    @conversionSettings = conversionSettings
  end
end

# {http://services.muhimbi.com/2009/10/06}ApplyWatermarkResponse
#   applyWatermarkResult - SOAP::SOAPBase64
class ApplyWatermarkResponse
  attr_accessor :applyWatermarkResult

  def initialize(applyWatermarkResult = nil)
    @applyWatermarkResult = applyWatermarkResult
  end
end

# {http://services.muhimbi.com/2009/10/06}ApplySecurity
#   sourceFile - SOAP::SOAPBase64
#   openOptions - OpenOptions
#   conversionSettings - ConversionSettings
class ApplySecurity
  attr_accessor :sourceFile
  attr_accessor :openOptions
  attr_accessor :conversionSettings

  def initialize(sourceFile = nil, openOptions = nil, conversionSettings = nil)
    @sourceFile = sourceFile
    @openOptions = openOptions
    @conversionSettings = conversionSettings
  end
end

# {http://services.muhimbi.com/2009/10/06}ApplySecurityResponse
#   applySecurityResult - SOAP::SOAPBase64
class ApplySecurityResponse
  attr_accessor :applySecurityResult

  def initialize(applySecurityResult = nil)
    @applySecurityResult = applySecurityResult
  end
end

# {http://services.muhimbi.com/2009/10/06}ProcessChanges
#   sourceFile - SOAP::SOAPBase64
#   openOptions - OpenOptions
#   conversionSettings - ConversionSettings
class ProcessChanges
  attr_accessor :sourceFile
  attr_accessor :openOptions
  attr_accessor :conversionSettings

  def initialize(sourceFile = nil, openOptions = nil, conversionSettings = nil)
    @sourceFile = sourceFile
    @openOptions = openOptions
    @conversionSettings = conversionSettings
  end
end

# {http://services.muhimbi.com/2009/10/06}ProcessChangesResponse
#   processChangesResult - SOAP::SOAPBase64
class ProcessChangesResponse
  attr_accessor :processChangesResult

  def initialize(processChangesResult = nil)
    @processChangesResult = processChangesResult
  end
end

# {http://services.muhimbi.com/2009/10/06}ProcessBatch
#   options - ProcessingOptions
class ProcessBatch
  attr_accessor :options

  def initialize(options = nil)
    @options = options
  end
end

# {http://services.muhimbi.com/2009/10/06}ProcessBatchResponse
#   processBatchResult - BatchResults
class ProcessBatchResponse
  attr_accessor :processBatchResult

  def initialize(processBatchResult = nil)
    @processBatchResult = processBatchResult
  end
end

# {http://services.muhimbi.com/2009/10/06}GetConfiguration
class GetConfiguration
  def initialize
  end
end

# {http://services.muhimbi.com/2009/10/06}GetConfigurationResponse
#   getConfigurationResult - Configuration
class GetConfigurationResponse
  attr_accessor :getConfigurationResult

  def initialize(getConfigurationResult = nil)
    @getConfigurationResult = getConfigurationResult
  end
end

# {http://services.muhimbi.com/2009/10/06}GetDiagnostics
#   convertersToDiagnose - ArrayOfDiagnosticRequestItem
class GetDiagnostics
  attr_accessor :convertersToDiagnose

  def initialize(convertersToDiagnose = nil)
    @convertersToDiagnose = convertersToDiagnose
  end
end

# {http://services.muhimbi.com/2009/10/06}GetDiagnosticsResponse
#   getDiagnosticsResult - Diagnostics
class GetDiagnosticsResponse
  attr_accessor :getDiagnosticsResult

  def initialize(getDiagnosticsResult = nil)
    @getDiagnosticsResult = getDiagnosticsResult
  end
end
