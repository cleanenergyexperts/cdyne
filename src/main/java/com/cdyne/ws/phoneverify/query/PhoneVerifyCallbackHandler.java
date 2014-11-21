
/**
 * PhoneVerifyCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cdyne.ws.phoneverify.query;

    /**
     *  PhoneVerifyCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PhoneVerifyCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PhoneVerifyCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PhoneVerifyCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for checkPhoneNumber method
            * override this method for handling normal response from checkPhoneNumber operation
            */
           public void receiveResultcheckPhoneNumber(
                    com.cdyne.ws.phoneverify.query.CheckPhoneNumberResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkPhoneNumber operation
           */
            public void receiveErrorcheckPhoneNumber(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkPhoneNumbers method
            * override this method for handling normal response from checkPhoneNumbers operation
            */
           public void receiveResultcheckPhoneNumbers(
                    com.cdyne.ws.phoneverify.query.CheckPhoneNumbersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkPhoneNumbers operation
           */
            public void receiveErrorcheckPhoneNumbers(java.lang.Exception e) {
            }
                


    }
    