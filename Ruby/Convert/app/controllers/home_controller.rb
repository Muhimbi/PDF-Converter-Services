require Rails.root.to_s + '/lib/DocumentConverterServiceDriver'
require "base64"
# ********************************************************
#              Muhimbi Document Converter Service
#
#                 Copyright 2013, Muhimbi Ltd
#                       www.muhimbi.com
#
#                     All rights reserved
#
#       Filename: home_controller.rb
#          To do: -
#   Known issues: -
#        History: 4 Mar 2013 - JR - Initial version
#
#  ******************************************************** /
class HomeController < ApplicationController
  def upload_file
  	#** Get a reference to the uploaded file and check it was specified
  	file = params['file']
    if file
      #** Specify the URL of the server that holds the Conversion Service
      url = "http://192.168.1.202:41734/Muhimbi.DocumentConverter.Webservice/?wsdl"
      conversionClient = DocumentConverterService.new(url)

      #** Create OpenOptions and specify the absolute minimum information
      openOptions = OpenOptions.new()
      openOptions.fileExtension = file.original_filename.split(".").last
      openOptions.originalFileName = file.original_filename

      #** Create ConversionSettings and set the mimimum fields. See Developer guide for details
      conversionSettings = ConversionSettings.new()
      conversionSettings.format = params['outputFormat']
      conversionSettings.fidelity = "Full"
      conversionSettings.openPassword = ""
      conversionSettings.ownerPassword = ""

      #** Encode the source file into a Base64 encoded byte array
      sourceFile = Base64.encode64(file.read)

      #** Carry out the conversion
      convert = Convert.new(sourceFile, openOptions, conversionSettings)
      result =  conversionClient.convert(convert)

      #** Send the converted file back to the browser
      send_data(Base64.decode64(Base64.decode64(result.convertResult)),
		     :filename => "convert." + conversionSettings.format,
		     :content_type => 'application/octet-stream',
		     :disposition => 'attachment')
    end
  end
end
