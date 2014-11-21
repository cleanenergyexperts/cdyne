

/**
 * PhoneVerify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cdyne.ws.phoneverify.query;

    /*
     *  PhoneVerify java interface
     */

    public interface PhoneVerify {
          

        /**
          * Auto generated method signature
          * Insert a phone number and your license key in the fields below to verify the phone number. This method also provides additional information about the phone number which includes the RateCenter, Telecom Address, Wireless, Switch Information, CLLI, LATA, Company, TimeZone, and more.&lt;br /&gt;&lt;br /&gt;For more information, please visit our &lt;a href='http://wiki.cdyne.com/wiki/index.php?title=Phone_Verification'&gt;wiki&lt;/a&gt;.
                    * @param checkPhoneNumber0
                
         */

         
                     public com.cdyne.ws.phoneverify.query.CheckPhoneNumberResponse checkPhoneNumber(

                        com.cdyne.ws.phoneverify.query.CheckPhoneNumber checkPhoneNumber0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Insert a phone number and your license key in the fields below to verify the phone number. This method also provides additional information about the phone number which includes the RateCenter, Telecom Address, Wireless, Switch Information, CLLI, LATA, Company, TimeZone, and more.&lt;br /&gt;&lt;br /&gt;For more information, please visit our &lt;a href='http://wiki.cdyne.com/wiki/index.php?title=Phone_Verification'&gt;wiki&lt;/a&gt;.
                * @param checkPhoneNumber0
            
          */
        public void startcheckPhoneNumber(

            com.cdyne.ws.phoneverify.query.CheckPhoneNumber checkPhoneNumber0,

            final com.cdyne.ws.phoneverify.query.PhoneVerifyCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * This method is the same as &lt;a href='http://ws.cdyne.com/phoneverify/phoneverify.asmx?op=CheckPhoneNumber'&gt;CheckPhoneNumber&lt;/a&gt;, although you are allowed to insert an array of phone numbers to be validated.&lt;br /&gt;&lt;br /&gt;For more information, please visit our &lt;a href='http://wiki.cdyne.com/wiki/index.php?title=Phone_Verification'&gt;wiki&lt;/a&gt;.
                    * @param checkPhoneNumbers2
                
         */

         
                     public com.cdyne.ws.phoneverify.query.CheckPhoneNumbersResponse checkPhoneNumbers(

                        com.cdyne.ws.phoneverify.query.CheckPhoneNumbers checkPhoneNumbers2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * This method is the same as &lt;a href='http://ws.cdyne.com/phoneverify/phoneverify.asmx?op=CheckPhoneNumber'&gt;CheckPhoneNumber&lt;/a&gt;, although you are allowed to insert an array of phone numbers to be validated.&lt;br /&gt;&lt;br /&gt;For more information, please visit our &lt;a href='http://wiki.cdyne.com/wiki/index.php?title=Phone_Verification'&gt;wiki&lt;/a&gt;.
                * @param checkPhoneNumbers2
            
          */
        public void startcheckPhoneNumbers(

            com.cdyne.ws.phoneverify.query.CheckPhoneNumbers checkPhoneNumbers2,

            final com.cdyne.ws.phoneverify.query.PhoneVerifyCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    