
/**
 * DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.muhimbi.ws;

public class DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1626271655217L;
    
    private com.muhimbi.ws.DocumentConverterServiceStub.WebServiceFaultExceptionE faultMessage;

    
        public DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage() {
            super("DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage");
        }

        public DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage(java.lang.String s) {
           super(s);
        }

        public DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DocumentConverterService_GetConfiguration_WebServiceFaultExceptionFault_FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.muhimbi.ws.DocumentConverterServiceStub.WebServiceFaultExceptionE msg){
       faultMessage = msg;
    }
    
    public com.muhimbi.ws.DocumentConverterServiceStub.WebServiceFaultExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    