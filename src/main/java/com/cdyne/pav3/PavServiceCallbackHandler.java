
/**
 * PavServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cdyne.pav3;

    /**
     *  PavServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PavServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PavServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PavServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getZipCodesForFips method
            * override this method for handling normal response from getZipCodesForFips operation
            */
           public void receiveResultgetZipCodesForFips(
                    com.cdyne.pav3.GetZipCodesForFipsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getZipCodesForFips operation
           */
            public void receiveErrorgetZipCodesForFips(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCityNamesForZipCode method
            * override this method for handling normal response from getCityNamesForZipCode operation
            */
           public void receiveResultgetCityNamesForZipCode(
                    com.cdyne.pav3.GetCityNamesForZipCodeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCityNamesForZipCode operation
           */
            public void receiveErrorgetCityNamesForZipCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getIntelligentMailBarcode method
            * override this method for handling normal response from getIntelligentMailBarcode operation
            */
           public void receiveResultgetIntelligentMailBarcode(
                    com.cdyne.pav3.GetIntelligentMailBarcodeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIntelligentMailBarcode operation
           */
            public void receiveErrorgetIntelligentMailBarcode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCongressionalDistrictByZip method
            * override this method for handling normal response from getCongressionalDistrictByZip operation
            */
           public void receiveResultgetCongressionalDistrictByZip(
                    com.cdyne.pav3.GetCongressionalDistrictByZipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCongressionalDistrictByZip operation
           */
            public void receiveErrorgetCongressionalDistrictByZip(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUrbanizationListForZipCode method
            * override this method for handling normal response from getUrbanizationListForZipCode operation
            */
           public void receiveResultgetUrbanizationListForZipCode(
                    com.cdyne.pav3.GetUrbanizationListForZipCodeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUrbanizationListForZipCode operation
           */
            public void receiveErrorgetUrbanizationListForZipCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyAddress method
            * override this method for handling normal response from verifyAddress operation
            */
           public void receiveResultverifyAddress(
                    com.cdyne.pav3.VerifyAddressResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyAddress operation
           */
            public void receiveErrorverifyAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getZipCodesWithinDistance method
            * override this method for handling normal response from getZipCodesWithinDistance operation
            */
           public void receiveResultgetZipCodesWithinDistance(
                    com.cdyne.pav3.GetZipCodesWithinDistanceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getZipCodesWithinDistance operation
           */
            public void receiveErrorgetZipCodesWithinDistance(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verifyAddressAdvanced method
            * override this method for handling normal response from verifyAddressAdvanced operation
            */
           public void receiveResultverifyAddressAdvanced(
                    com.cdyne.pav3.VerifyAddressAdvancedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verifyAddressAdvanced operation
           */
            public void receiveErrorverifyAddressAdvanced(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getZipCodesForCityAndState method
            * override this method for handling normal response from getZipCodesForCityAndState operation
            */
           public void receiveResultgetZipCodesForCityAndState(
                    com.cdyne.pav3.GetZipCodesForCityAndStateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getZipCodesForCityAndState operation
           */
            public void receiveErrorgetZipCodesForCityAndState(java.lang.Exception e) {
            }
                


    }
    