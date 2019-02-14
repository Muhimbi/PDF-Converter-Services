#!/usr/bin/env ruby
require 'DocumentConverterServiceDriver.rb'

endpoint_url = ARGV.shift
obj = DocumentConverterService.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   Convert(parameters)
#
# ARGS
#   parameters      Convert - {http://services.muhimbi.com/2009/10/06}Convert
#
# RETURNS
#   parameters      ConvertResponse - {http://services.muhimbi.com/2009/10/06}ConvertResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.convert(parameters)

# SYNOPSIS
#   ApplyWatermark(parameters)
#
# ARGS
#   parameters      ApplyWatermark - {http://services.muhimbi.com/2009/10/06}ApplyWatermark
#
# RETURNS
#   parameters      ApplyWatermarkResponse - {http://services.muhimbi.com/2009/10/06}ApplyWatermarkResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.applyWatermark(parameters)

# SYNOPSIS
#   ApplySecurity(parameters)
#
# ARGS
#   parameters      ApplySecurity - {http://services.muhimbi.com/2009/10/06}ApplySecurity
#
# RETURNS
#   parameters      ApplySecurityResponse - {http://services.muhimbi.com/2009/10/06}ApplySecurityResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.applySecurity(parameters)

# SYNOPSIS
#   ProcessChanges(parameters)
#
# ARGS
#   parameters      ProcessChanges - {http://services.muhimbi.com/2009/10/06}ProcessChanges
#
# RETURNS
#   parameters      ProcessChangesResponse - {http://services.muhimbi.com/2009/10/06}ProcessChangesResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.processChanges(parameters)

# SYNOPSIS
#   ProcessBatch(parameters)
#
# ARGS
#   parameters      ProcessBatch - {http://services.muhimbi.com/2009/10/06}ProcessBatch
#
# RETURNS
#   parameters      ProcessBatchResponse - {http://services.muhimbi.com/2009/10/06}ProcessBatchResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.processBatch(parameters)

# SYNOPSIS
#   GetConfiguration(parameters)
#
# ARGS
#   parameters      GetConfiguration - {http://services.muhimbi.com/2009/10/06}GetConfiguration
#
# RETURNS
#   parameters      GetConfigurationResponse - {http://services.muhimbi.com/2009/10/06}GetConfigurationResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.getConfiguration(parameters)

# SYNOPSIS
#   GetDiagnostics(parameters)
#
# ARGS
#   parameters      GetDiagnostics - {http://services.muhimbi.com/2009/10/06}GetDiagnostics
#
# RETURNS
#   parameters      GetDiagnosticsResponse - {http://services.muhimbi.com/2009/10/06}GetDiagnosticsResponse
#
# RAISES
#   detail          WebServiceFaultException - {http://types.muhimbi.com/2009/10/06}WebServiceFaultException
#
parameters = nil
puts obj.getDiagnostics(parameters)


