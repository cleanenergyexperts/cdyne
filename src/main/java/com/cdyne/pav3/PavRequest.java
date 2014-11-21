
/**
 * PavRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cdyne.pav3;
            

            /**
            *  PavRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PavRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PavRequest
                Namespace URI = pav3.cdyne.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for CityName
                        */

                        
                                    protected java.lang.String localCityName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCityNameTracker = false ;

                           public boolean isCityNameSpecified(){
                               return localCityNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCityName(){
                               return localCityName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CityName
                               */
                               public void setCityName(java.lang.String param){
                            localCityNameTracker = true;
                                   
                                            this.localCityName=param;
                                    

                               }
                            

                        /**
                        * field for FirmOrRecipient
                        */

                        
                                    protected java.lang.String localFirmOrRecipient ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirmOrRecipientTracker = false ;

                           public boolean isFirmOrRecipientSpecified(){
                               return localFirmOrRecipientTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFirmOrRecipient(){
                               return localFirmOrRecipient;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirmOrRecipient
                               */
                               public void setFirmOrRecipient(java.lang.String param){
                            localFirmOrRecipientTracker = true;
                                   
                                            this.localFirmOrRecipient=param;
                                    

                               }
                            

                        /**
                        * field for LicenseKey
                        */

                        
                                    protected java.lang.String localLicenseKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLicenseKeyTracker = false ;

                           public boolean isLicenseKeySpecified(){
                               return localLicenseKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLicenseKey(){
                               return localLicenseKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LicenseKey
                               */
                               public void setLicenseKey(java.lang.String param){
                            localLicenseKeyTracker = true;
                                   
                                            this.localLicenseKey=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryAddressLine
                        */

                        
                                    protected java.lang.String localPrimaryAddressLine ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryAddressLineTracker = false ;

                           public boolean isPrimaryAddressLineSpecified(){
                               return localPrimaryAddressLineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimaryAddressLine(){
                               return localPrimaryAddressLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryAddressLine
                               */
                               public void setPrimaryAddressLine(java.lang.String param){
                            localPrimaryAddressLineTracker = true;
                                   
                                            this.localPrimaryAddressLine=param;
                                    

                               }
                            

                        /**
                        * field for ReturnCaseSensitive
                        */

                        
                                    protected boolean localReturnCaseSensitive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnCaseSensitiveTracker = false ;

                           public boolean isReturnCaseSensitiveSpecified(){
                               return localReturnCaseSensitiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnCaseSensitive(){
                               return localReturnCaseSensitive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnCaseSensitive
                               */
                               public void setReturnCaseSensitive(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnCaseSensitiveTracker =
                                       true;
                                   
                                            this.localReturnCaseSensitive=param;
                                    

                               }
                            

                        /**
                        * field for ReturnCensusInfo
                        */

                        
                                    protected boolean localReturnCensusInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnCensusInfoTracker = false ;

                           public boolean isReturnCensusInfoSpecified(){
                               return localReturnCensusInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnCensusInfo(){
                               return localReturnCensusInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnCensusInfo
                               */
                               public void setReturnCensusInfo(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnCensusInfoTracker =
                                       true;
                                   
                                            this.localReturnCensusInfo=param;
                                    

                               }
                            

                        /**
                        * field for ReturnCityAbbreviation
                        */

                        
                                    protected boolean localReturnCityAbbreviation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnCityAbbreviationTracker = false ;

                           public boolean isReturnCityAbbreviationSpecified(){
                               return localReturnCityAbbreviationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnCityAbbreviation(){
                               return localReturnCityAbbreviation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnCityAbbreviation
                               */
                               public void setReturnCityAbbreviation(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnCityAbbreviationTracker =
                                       true;
                                   
                                            this.localReturnCityAbbreviation=param;
                                    

                               }
                            

                        /**
                        * field for ReturnGeoLocation
                        */

                        
                                    protected boolean localReturnGeoLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnGeoLocationTracker = false ;

                           public boolean isReturnGeoLocationSpecified(){
                               return localReturnGeoLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnGeoLocation(){
                               return localReturnGeoLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnGeoLocation
                               */
                               public void setReturnGeoLocation(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnGeoLocationTracker =
                                       true;
                                   
                                            this.localReturnGeoLocation=param;
                                    

                               }
                            

                        /**
                        * field for ReturnLegislativeInfo
                        */

                        
                                    protected boolean localReturnLegislativeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnLegislativeInfoTracker = false ;

                           public boolean isReturnLegislativeInfoSpecified(){
                               return localReturnLegislativeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnLegislativeInfo(){
                               return localReturnLegislativeInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnLegislativeInfo
                               */
                               public void setReturnLegislativeInfo(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnLegislativeInfoTracker =
                                       true;
                                   
                                            this.localReturnLegislativeInfo=param;
                                    

                               }
                            

                        /**
                        * field for ReturnMailingIndustryInfo
                        */

                        
                                    protected boolean localReturnMailingIndustryInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnMailingIndustryInfoTracker = false ;

                           public boolean isReturnMailingIndustryInfoSpecified(){
                               return localReturnMailingIndustryInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnMailingIndustryInfo(){
                               return localReturnMailingIndustryInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnMailingIndustryInfo
                               */
                               public void setReturnMailingIndustryInfo(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnMailingIndustryInfoTracker =
                                       true;
                                   
                                            this.localReturnMailingIndustryInfo=param;
                                    

                               }
                            

                        /**
                        * field for ReturnResidentialIndicator
                        */

                        
                                    protected boolean localReturnResidentialIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnResidentialIndicatorTracker = false ;

                           public boolean isReturnResidentialIndicatorSpecified(){
                               return localReturnResidentialIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnResidentialIndicator(){
                               return localReturnResidentialIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnResidentialIndicator
                               */
                               public void setReturnResidentialIndicator(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnResidentialIndicatorTracker =
                                       true;
                                   
                                            this.localReturnResidentialIndicator=param;
                                    

                               }
                            

                        /**
                        * field for ReturnStreetAbbreviated
                        */

                        
                                    protected boolean localReturnStreetAbbreviated ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnStreetAbbreviatedTracker = false ;

                           public boolean isReturnStreetAbbreviatedSpecified(){
                               return localReturnStreetAbbreviatedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnStreetAbbreviated(){
                               return localReturnStreetAbbreviated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnStreetAbbreviated
                               */
                               public void setReturnStreetAbbreviated(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnStreetAbbreviatedTracker =
                                       true;
                                   
                                            this.localReturnStreetAbbreviated=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryAddressLine
                        */

                        
                                    protected java.lang.String localSecondaryAddressLine ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryAddressLineTracker = false ;

                           public boolean isSecondaryAddressLineSpecified(){
                               return localSecondaryAddressLineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryAddressLine(){
                               return localSecondaryAddressLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryAddressLine
                               */
                               public void setSecondaryAddressLine(java.lang.String param){
                            localSecondaryAddressLineTracker = true;
                                   
                                            this.localSecondaryAddressLine=param;
                                    

                               }
                            

                        /**
                        * field for State
                        */

                        
                                    protected java.lang.String localState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateTracker = false ;

                           public boolean isStateSpecified(){
                               return localStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getState(){
                               return localState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param State
                               */
                               public void setState(java.lang.String param){
                            localStateTracker = true;
                                   
                                            this.localState=param;
                                    

                               }
                            

                        /**
                        * field for Urbanization
                        */

                        
                                    protected java.lang.String localUrbanization ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUrbanizationTracker = false ;

                           public boolean isUrbanizationSpecified(){
                               return localUrbanizationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUrbanization(){
                               return localUrbanization;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Urbanization
                               */
                               public void setUrbanization(java.lang.String param){
                            localUrbanizationTracker = true;
                                   
                                            this.localUrbanization=param;
                                    

                               }
                            

                        /**
                        * field for ZipCode
                        */

                        
                                    protected java.lang.String localZipCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localZipCodeTracker = false ;

                           public boolean isZipCodeSpecified(){
                               return localZipCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getZipCode(){
                               return localZipCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ZipCode
                               */
                               public void setZipCode(java.lang.String param){
                            localZipCodeTracker = true;
                                   
                                            this.localZipCode=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"pav3.cdyne.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":PavRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PavRequest",
                           xmlWriter);
                   }

               
                   }
                if (localCityNameTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "CityName", xmlWriter);
                             

                                          if (localCityName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCityName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFirmOrRecipientTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "FirmOrRecipient", xmlWriter);
                             

                                          if (localFirmOrRecipient==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFirmOrRecipient);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLicenseKeyTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "LicenseKey", xmlWriter);
                             

                                          if (localLicenseKey==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLicenseKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryAddressLineTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PrimaryAddressLine", xmlWriter);
                             

                                          if (localPrimaryAddressLine==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimaryAddressLine);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnCaseSensitiveTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnCaseSensitive", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnCaseSensitive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCaseSensitive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnCensusInfoTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnCensusInfo", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnCensusInfo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCensusInfo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnCityAbbreviationTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnCityAbbreviation", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnCityAbbreviation cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCityAbbreviation));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnGeoLocationTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnGeoLocation", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnGeoLocation cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnGeoLocation));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnLegislativeInfoTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnLegislativeInfo", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnLegislativeInfo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnLegislativeInfo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnMailingIndustryInfoTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnMailingIndustryInfo", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnMailingIndustryInfo cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnMailingIndustryInfo));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnResidentialIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnResidentialIndicator", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnResidentialIndicator cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnResidentialIndicator));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnStreetAbbreviatedTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnStreetAbbreviated", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnStreetAbbreviated cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnStreetAbbreviated));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryAddressLineTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SecondaryAddressLine", xmlWriter);
                             

                                          if (localSecondaryAddressLine==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryAddressLine);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "State", xmlWriter);
                             

                                          if (localState==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localState);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUrbanizationTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "Urbanization", xmlWriter);
                             

                                          if (localUrbanization==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUrbanization);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localZipCodeTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ZipCode", xmlWriter);
                             

                                          if (localZipCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localZipCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("pav3.cdyne.com")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCityNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CityName"));
                                 
                                         elementList.add(localCityName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCityName));
                                    } if (localFirmOrRecipientTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "FirmOrRecipient"));
                                 
                                         elementList.add(localFirmOrRecipient==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirmOrRecipient));
                                    } if (localLicenseKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "LicenseKey"));
                                 
                                         elementList.add(localLicenseKey==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLicenseKey));
                                    } if (localPrimaryAddressLineTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PrimaryAddressLine"));
                                 
                                         elementList.add(localPrimaryAddressLine==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryAddressLine));
                                    } if (localReturnCaseSensitiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnCaseSensitive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCaseSensitive));
                            } if (localReturnCensusInfoTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnCensusInfo"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCensusInfo));
                            } if (localReturnCityAbbreviationTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnCityAbbreviation"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCityAbbreviation));
                            } if (localReturnGeoLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnGeoLocation"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnGeoLocation));
                            } if (localReturnLegislativeInfoTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnLegislativeInfo"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnLegislativeInfo));
                            } if (localReturnMailingIndustryInfoTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnMailingIndustryInfo"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnMailingIndustryInfo));
                            } if (localReturnResidentialIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnResidentialIndicator"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnResidentialIndicator));
                            } if (localReturnStreetAbbreviatedTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnStreetAbbreviated"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnStreetAbbreviated));
                            } if (localSecondaryAddressLineTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SecondaryAddressLine"));
                                 
                                         elementList.add(localSecondaryAddressLine==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryAddressLine));
                                    } if (localStateTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "State"));
                                 
                                         elementList.add(localState==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
                                    } if (localUrbanizationTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "Urbanization"));
                                 
                                         elementList.add(localUrbanization==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUrbanization));
                                    } if (localZipCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ZipCode"));
                                 
                                         elementList.add(localZipCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localZipCode));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static PavRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PavRequest object =
                new PavRequest();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"PavRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PavRequest)com.cdyne.pav3.imports.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","CityName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCityName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","FirmOrRecipient").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFirmOrRecipient(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","LicenseKey").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLicenseKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PrimaryAddressLine").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryAddressLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnCaseSensitive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnCaseSensitive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnCaseSensitive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnCensusInfo").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnCensusInfo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnCensusInfo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnCityAbbreviation").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnCityAbbreviation" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnCityAbbreviation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnGeoLocation").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnGeoLocation" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnGeoLocation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnLegislativeInfo").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnLegislativeInfo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnLegislativeInfo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnMailingIndustryInfo").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnMailingIndustryInfo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnMailingIndustryInfo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnResidentialIndicator").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnResidentialIndicator" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnResidentialIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnStreetAbbreviated").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnStreetAbbreviated" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnStreetAbbreviated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SecondaryAddressLine").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryAddressLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","State").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","Urbanization").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUrbanization(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ZipCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setZipCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    