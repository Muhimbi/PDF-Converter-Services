require 'DocumentConverterService.rb'
require 'DocumentConverterServiceMappingRegistry.rb'
require 'soap/rpc/driver'

class DocumentConverterService < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http://127.0.0.1:41734/Muhimbi.DocumentConverter.WebService/"

  Methods = [
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/Convert",
      "convert",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "Convert"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ConvertResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ],
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/ApplyWatermark",
      "applyWatermark",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ApplyWatermark"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ApplyWatermarkResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ],
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/ApplySecurity",
      "applySecurity",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ApplySecurity"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ApplySecurityResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ],
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/ProcessChanges",
      "processChanges",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ProcessChanges"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ProcessChangesResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ],
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/ProcessBatch",
      "processBatch",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ProcessBatch"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "ProcessBatchResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ],
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/GetConfiguration",
      "getConfiguration",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "GetConfiguration"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "GetConfigurationResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ],
    [ "http://services.muhimbi.com/2009/10/06/DocumentConverterService/GetDiagnostics",
      "getDiagnostics",
      [ ["in", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "GetDiagnostics"]],
        ["out", "parameters", ["::SOAP::SOAPElement", "http://services.muhimbi.com/2009/10/06", "GetDiagnosticsResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {"WebServiceFaultExceptionFault"=>{:ns=>"http://tempuri.org/", :encodingstyle=>"document", :namespace=>nil, :use=>"literal", :name=>"WebServiceFaultExceptionFault"}} }
    ]
  ]

  def initialize(endpoint_url = nil)
    endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = DocumentConverterServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = DocumentConverterServiceMappingRegistry::LiteralRegistry
    init_methods
  end

private

  def init_methods
    Methods.each do |definitions|
      opt = definitions.last
      if opt[:request_style] == :document
        add_document_operation(*definitions)
      else
        add_rpc_operation(*definitions)
        qname = definitions[0]
        name = definitions[2]
        if qname.name != name and qname.name.capitalize == name.capitalize
          ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
            __send__(name, *arg)
          end
        end
      end
    end
  end
end

