
/**
 * DocumentConverterServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.muhimbi.ws;

    /**
     *  DocumentConverterServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DocumentConverterServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DocumentConverterServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DocumentConverterServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for convert method
            * override this method for handling normal response from convert operation
            */
           public void receiveResultconvert(
                    com.muhimbi.ws.DocumentConverterServiceStub.ConvertResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from convert operation
           */
            public void receiveErrorconvert(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDocumentProperties method
            * override this method for handling normal response from getDocumentProperties operation
            */
           public void receiveResultgetDocumentProperties(
                    com.muhimbi.ws.DocumentConverterServiceStub.GetDocumentPropertiesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDocumentProperties operation
           */
            public void receiveErrorgetDocumentProperties(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for applySecurity method
            * override this method for handling normal response from applySecurity operation
            */
           public void receiveResultapplySecurity(
                    com.muhimbi.ws.DocumentConverterServiceStub.ApplySecurityResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from applySecurity operation
           */
            public void receiveErrorapplySecurity(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for processBatch method
            * override this method for handling normal response from processBatch operation
            */
           public void receiveResultprocessBatch(
                    com.muhimbi.ws.DocumentConverterServiceStub.ProcessBatchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from processBatch operation
           */
            public void receiveErrorprocessBatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for applyWatermark method
            * override this method for handling normal response from applyWatermark operation
            */
           public void receiveResultapplyWatermark(
                    com.muhimbi.ws.DocumentConverterServiceStub.ApplyWatermarkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from applyWatermark operation
           */
            public void receiveErrorapplyWatermark(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getConfiguration method
            * override this method for handling normal response from getConfiguration operation
            */
           public void receiveResultgetConfiguration(
                    com.muhimbi.ws.DocumentConverterServiceStub.GetConfigurationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getConfiguration operation
           */
            public void receiveErrorgetConfiguration(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for processChanges method
            * override this method for handling normal response from processChanges operation
            */
           public void receiveResultprocessChanges(
                    com.muhimbi.ws.DocumentConverterServiceStub.ProcessChangesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from processChanges operation
           */
            public void receiveErrorprocessChanges(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStatus method
            * override this method for handling normal response from getStatus operation
            */
           public void receiveResultgetStatus(
                    com.muhimbi.ws.DocumentConverterServiceStub.GetStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStatus operation
           */
            public void receiveErrorgetStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDiagnostics method
            * override this method for handling normal response from getDiagnostics operation
            */
           public void receiveResultgetDiagnostics(
                    com.muhimbi.ws.DocumentConverterServiceStub.GetDiagnosticsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDiagnostics operation
           */
            public void receiveErrorgetDiagnostics(java.lang.Exception e) {
            }
                


    }
    