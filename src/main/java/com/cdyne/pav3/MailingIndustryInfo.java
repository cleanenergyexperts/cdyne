
/**
 * MailingIndustryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cdyne.pav3;
            

            /**
            *  MailingIndustryInfo bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MailingIndustryInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MailingIndustryInfo
                Namespace URI = pav3.cdyne.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for CSKey
                        */

                        
                                    protected java.lang.String localCSKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCSKeyTracker = false ;

                           public boolean isCSKeySpecified(){
                               return localCSKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCSKey(){
                               return localCSKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CSKey
                               */
                               public void setCSKey(java.lang.String param){
                            localCSKeyTracker = true;
                                   
                                            this.localCSKey=param;
                                    

                               }
                            

                        /**
                        * field for CarrierRoute
                        */

                        
                                    protected java.lang.String localCarrierRoute ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCarrierRouteTracker = false ;

                           public boolean isCarrierRouteSpecified(){
                               return localCarrierRouteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCarrierRoute(){
                               return localCarrierRoute;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CarrierRoute
                               */
                               public void setCarrierRoute(java.lang.String param){
                            localCarrierRouteTracker = true;
                                   
                                            this.localCarrierRoute=param;
                                    

                               }
                            

                        /**
                        * field for CheckDigit
                        */

                        
                                    protected java.lang.String localCheckDigit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCheckDigitTracker = false ;

                           public boolean isCheckDigitSpecified(){
                               return localCheckDigitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCheckDigit(){
                               return localCheckDigit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckDigit
                               */
                               public void setCheckDigit(java.lang.String param){
                            localCheckDigitTracker = true;
                                   
                                            this.localCheckDigit=param;
                                    

                               }
                            

                        /**
                        * field for DefaultFlag
                        */

                        
                                    protected boolean localDefaultFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultFlagTracker = false ;

                           public boolean isDefaultFlagSpecified(){
                               return localDefaultFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDefaultFlag(){
                               return localDefaultFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultFlag
                               */
                               public void setDefaultFlag(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDefaultFlagTracker =
                                       true;
                                   
                                            this.localDefaultFlag=param;
                                    

                               }
                            

                        /**
                        * field for DeliveryPoint
                        */

                        
                                    protected java.lang.String localDeliveryPoint ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeliveryPointTracker = false ;

                           public boolean isDeliveryPointSpecified(){
                               return localDeliveryPointTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDeliveryPoint(){
                               return localDeliveryPoint;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeliveryPoint
                               */
                               public void setDeliveryPoint(java.lang.String param){
                            localDeliveryPointTracker = true;
                                   
                                            this.localDeliveryPoint=param;
                                    

                               }
                            

                        /**
                        * field for DpvConfirmationIndicator
                        */

                        
                                    protected java.lang.String localDpvConfirmationIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvConfirmationIndicatorTracker = false ;

                           public boolean isDpvConfirmationIndicatorSpecified(){
                               return localDpvConfirmationIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvConfirmationIndicator(){
                               return localDpvConfirmationIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvConfirmationIndicator
                               */
                               public void setDpvConfirmationIndicator(java.lang.String param){
                            localDpvConfirmationIndicatorTracker = true;
                                   
                                            this.localDpvConfirmationIndicator=param;
                                    

                               }
                            

                        /**
                        * field for DpvCrmaIndicator
                        */

                        
                                    protected java.lang.String localDpvCrmaIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvCrmaIndicatorTracker = false ;

                           public boolean isDpvCrmaIndicatorSpecified(){
                               return localDpvCrmaIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvCrmaIndicator(){
                               return localDpvCrmaIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvCrmaIndicator
                               */
                               public void setDpvCrmaIndicator(java.lang.String param){
                            localDpvCrmaIndicatorTracker = true;
                                   
                                            this.localDpvCrmaIndicator=param;
                                    

                               }
                            

                        /**
                        * field for DpvFootnote1
                        */

                        
                                    protected java.lang.String localDpvFootnote1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvFootnote1Tracker = false ;

                           public boolean isDpvFootnote1Specified(){
                               return localDpvFootnote1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvFootnote1(){
                               return localDpvFootnote1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvFootnote1
                               */
                               public void setDpvFootnote1(java.lang.String param){
                            localDpvFootnote1Tracker = true;
                                   
                                            this.localDpvFootnote1=param;
                                    

                               }
                            

                        /**
                        * field for DpvFootnote2
                        */

                        
                                    protected java.lang.String localDpvFootnote2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvFootnote2Tracker = false ;

                           public boolean isDpvFootnote2Specified(){
                               return localDpvFootnote2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvFootnote2(){
                               return localDpvFootnote2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvFootnote2
                               */
                               public void setDpvFootnote2(java.lang.String param){
                            localDpvFootnote2Tracker = true;
                                   
                                            this.localDpvFootnote2=param;
                                    

                               }
                            

                        /**
                        * field for DpvFootnote3
                        */

                        
                                    protected java.lang.String localDpvFootnote3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvFootnote3Tracker = false ;

                           public boolean isDpvFootnote3Specified(){
                               return localDpvFootnote3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvFootnote3(){
                               return localDpvFootnote3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvFootnote3
                               */
                               public void setDpvFootnote3(java.lang.String param){
                            localDpvFootnote3Tracker = true;
                                   
                                            this.localDpvFootnote3=param;
                                    

                               }
                            

                        /**
                        * field for DpvNoStatIndicator
                        */

                        
                                    protected java.lang.String localDpvNoStatIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvNoStatIndicatorTracker = false ;

                           public boolean isDpvNoStatIndicatorSpecified(){
                               return localDpvNoStatIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvNoStatIndicator(){
                               return localDpvNoStatIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvNoStatIndicator
                               */
                               public void setDpvNoStatIndicator(java.lang.String param){
                            localDpvNoStatIndicatorTracker = true;
                                   
                                            this.localDpvNoStatIndicator=param;
                                    

                               }
                            

                        /**
                        * field for DpvVacantIndicator
                        */

                        
                                    protected java.lang.String localDpvVacantIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDpvVacantIndicatorTracker = false ;

                           public boolean isDpvVacantIndicatorSpecified(){
                               return localDpvVacantIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDpvVacantIndicator(){
                               return localDpvVacantIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DpvVacantIndicator
                               */
                               public void setDpvVacantIndicator(java.lang.String param){
                            localDpvVacantIndicatorTracker = true;
                                   
                                            this.localDpvVacantIndicator=param;
                                    

                               }
                            

                        /**
                        * field for ELOTAscDesc
                        */

                        
                                    protected java.lang.String localELOTAscDesc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localELOTAscDescTracker = false ;

                           public boolean isELOTAscDescSpecified(){
                               return localELOTAscDescTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getELOTAscDesc(){
                               return localELOTAscDesc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ELOTAscDesc
                               */
                               public void setELOTAscDesc(java.lang.String param){
                            localELOTAscDescTracker = true;
                                   
                                            this.localELOTAscDesc=param;
                                    

                               }
                            

                        /**
                        * field for ELOTSequenceNumber
                        */

                        
                                    protected java.lang.String localELOTSequenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localELOTSequenceNumberTracker = false ;

                           public boolean isELOTSequenceNumberSpecified(){
                               return localELOTSequenceNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getELOTSequenceNumber(){
                               return localELOTSequenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ELOTSequenceNumber
                               */
                               public void setELOTSequenceNumber(java.lang.String param){
                            localELOTSequenceNumberTracker = true;
                                   
                                            this.localELOTSequenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for EwsFlag
                        */

                        
                                    protected boolean localEwsFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEwsFlagTracker = false ;

                           public boolean isEwsFlagSpecified(){
                               return localEwsFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEwsFlag(){
                               return localEwsFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EwsFlag
                               */
                               public void setEwsFlag(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localEwsFlagTracker =
                                       true;
                                   
                                            this.localEwsFlag=param;
                                    

                               }
                            

                        /**
                        * field for LACSFlag
                        */

                        
                                    protected java.lang.String localLACSFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLACSFlagTracker = false ;

                           public boolean isLACSFlagSpecified(){
                               return localLACSFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLACSFlag(){
                               return localLACSFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LACSFlag
                               */
                               public void setLACSFlag(java.lang.String param){
                            localLACSFlagTracker = true;
                                   
                                            this.localLACSFlag=param;
                                    

                               }
                            

                        /**
                        * field for LACSIndicator
                        */

                        
                                    protected java.lang.String localLACSIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLACSIndicatorTracker = false ;

                           public boolean isLACSIndicatorSpecified(){
                               return localLACSIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLACSIndicator(){
                               return localLACSIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LACSIndicator
                               */
                               public void setLACSIndicator(java.lang.String param){
                            localLACSIndicatorTracker = true;
                                   
                                            this.localLACSIndicator=param;
                                    

                               }
                            

                        /**
                        * field for LACSReturnCode
                        */

                        
                                    protected java.lang.String localLACSReturnCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLACSReturnCodeTracker = false ;

                           public boolean isLACSReturnCodeSpecified(){
                               return localLACSReturnCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLACSReturnCode(){
                               return localLACSReturnCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LACSReturnCode
                               */
                               public void setLACSReturnCode(java.lang.String param){
                            localLACSReturnCodeTracker = true;
                                   
                                            this.localLACSReturnCode=param;
                                    

                               }
                            

                        /**
                        * field for RecordTypeCode
                        */

                        
                                    protected java.lang.String localRecordTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecordTypeCodeTracker = false ;

                           public boolean isRecordTypeCodeSpecified(){
                               return localRecordTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRecordTypeCode(){
                               return localRecordTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecordTypeCode
                               */
                               public void setRecordTypeCode(java.lang.String param){
                            localRecordTypeCodeTracker = true;
                                   
                                            this.localRecordTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for SuiteLinkReturnCode
                        */

                        
                                    protected java.lang.String localSuiteLinkReturnCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuiteLinkReturnCodeTracker = false ;

                           public boolean isSuiteLinkReturnCodeSpecified(){
                               return localSuiteLinkReturnCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSuiteLinkReturnCode(){
                               return localSuiteLinkReturnCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SuiteLinkReturnCode
                               */
                               public void setSuiteLinkReturnCode(java.lang.String param){
                            localSuiteLinkReturnCodeTracker = true;
                                   
                                            this.localSuiteLinkReturnCode=param;
                                    

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
                           namespacePrefix+":MailingIndustryInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MailingIndustryInfo",
                           xmlWriter);
                   }

               
                   }
                if (localCSKeyTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "CSKey", xmlWriter);
                             

                                          if (localCSKey==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCSKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCarrierRouteTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "CarrierRoute", xmlWriter);
                             

                                          if (localCarrierRoute==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCarrierRoute);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCheckDigitTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "CheckDigit", xmlWriter);
                             

                                          if (localCheckDigit==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCheckDigit);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDefaultFlagTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DefaultFlag", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("DefaultFlag cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultFlag));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeliveryPointTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DeliveryPoint", xmlWriter);
                             

                                          if (localDeliveryPoint==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDeliveryPoint);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvConfirmationIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvConfirmationIndicator", xmlWriter);
                             

                                          if (localDpvConfirmationIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvConfirmationIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvCrmaIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvCrmaIndicator", xmlWriter);
                             

                                          if (localDpvCrmaIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvCrmaIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvFootnote1Tracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvFootnote1", xmlWriter);
                             

                                          if (localDpvFootnote1==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvFootnote1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvFootnote2Tracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvFootnote2", xmlWriter);
                             

                                          if (localDpvFootnote2==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvFootnote2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvFootnote3Tracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvFootnote3", xmlWriter);
                             

                                          if (localDpvFootnote3==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvFootnote3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvNoStatIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvNoStatIndicator", xmlWriter);
                             

                                          if (localDpvNoStatIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvNoStatIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDpvVacantIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "DpvVacantIndicator", xmlWriter);
                             

                                          if (localDpvVacantIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDpvVacantIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localELOTAscDescTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ELOTAscDesc", xmlWriter);
                             

                                          if (localELOTAscDesc==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localELOTAscDesc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localELOTSequenceNumberTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ELOTSequenceNumber", xmlWriter);
                             

                                          if (localELOTSequenceNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localELOTSequenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEwsFlagTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "EwsFlag", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("EwsFlag cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEwsFlag));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLACSFlagTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "LACSFlag", xmlWriter);
                             

                                          if (localLACSFlag==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLACSFlag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLACSIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "LACSIndicator", xmlWriter);
                             

                                          if (localLACSIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLACSIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLACSReturnCodeTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "LACSReturnCode", xmlWriter);
                             

                                          if (localLACSReturnCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLACSReturnCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRecordTypeCodeTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "RecordTypeCode", xmlWriter);
                             

                                          if (localRecordTypeCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRecordTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSuiteLinkReturnCodeTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SuiteLinkReturnCode", xmlWriter);
                             

                                          if (localSuiteLinkReturnCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSuiteLinkReturnCode);
                                            
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

                 if (localCSKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CSKey"));
                                 
                                         elementList.add(localCSKey==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCSKey));
                                    } if (localCarrierRouteTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CarrierRoute"));
                                 
                                         elementList.add(localCarrierRoute==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCarrierRoute));
                                    } if (localCheckDigitTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CheckDigit"));
                                 
                                         elementList.add(localCheckDigit==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckDigit));
                                    } if (localDefaultFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DefaultFlag"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultFlag));
                            } if (localDeliveryPointTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DeliveryPoint"));
                                 
                                         elementList.add(localDeliveryPoint==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeliveryPoint));
                                    } if (localDpvConfirmationIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvConfirmationIndicator"));
                                 
                                         elementList.add(localDpvConfirmationIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvConfirmationIndicator));
                                    } if (localDpvCrmaIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvCrmaIndicator"));
                                 
                                         elementList.add(localDpvCrmaIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvCrmaIndicator));
                                    } if (localDpvFootnote1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvFootnote1"));
                                 
                                         elementList.add(localDpvFootnote1==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvFootnote1));
                                    } if (localDpvFootnote2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvFootnote2"));
                                 
                                         elementList.add(localDpvFootnote2==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvFootnote2));
                                    } if (localDpvFootnote3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvFootnote3"));
                                 
                                         elementList.add(localDpvFootnote3==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvFootnote3));
                                    } if (localDpvNoStatIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvNoStatIndicator"));
                                 
                                         elementList.add(localDpvNoStatIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvNoStatIndicator));
                                    } if (localDpvVacantIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "DpvVacantIndicator"));
                                 
                                         elementList.add(localDpvVacantIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDpvVacantIndicator));
                                    } if (localELOTAscDescTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ELOTAscDesc"));
                                 
                                         elementList.add(localELOTAscDesc==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localELOTAscDesc));
                                    } if (localELOTSequenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ELOTSequenceNumber"));
                                 
                                         elementList.add(localELOTSequenceNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localELOTSequenceNumber));
                                    } if (localEwsFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "EwsFlag"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEwsFlag));
                            } if (localLACSFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "LACSFlag"));
                                 
                                         elementList.add(localLACSFlag==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLACSFlag));
                                    } if (localLACSIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "LACSIndicator"));
                                 
                                         elementList.add(localLACSIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLACSIndicator));
                                    } if (localLACSReturnCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "LACSReturnCode"));
                                 
                                         elementList.add(localLACSReturnCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLACSReturnCode));
                                    } if (localRecordTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "RecordTypeCode"));
                                 
                                         elementList.add(localRecordTypeCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordTypeCode));
                                    } if (localSuiteLinkReturnCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SuiteLinkReturnCode"));
                                 
                                         elementList.add(localSuiteLinkReturnCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuiteLinkReturnCode));
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
        public static MailingIndustryInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MailingIndustryInfo object =
                new MailingIndustryInfo();

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
                    
                            if (!"MailingIndustryInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MailingIndustryInfo)com.cdyne.pav3.imports.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","CSKey").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCSKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","CarrierRoute").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCarrierRoute(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","CheckDigit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCheckDigit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DefaultFlag").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DefaultFlag" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DeliveryPoint").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeliveryPoint(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvConfirmationIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvConfirmationIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvCrmaIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvCrmaIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvFootnote1").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvFootnote1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvFootnote2").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvFootnote2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvFootnote3").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvFootnote3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvNoStatIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvNoStatIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","DpvVacantIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDpvVacantIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ELOTAscDesc").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setELOTAscDesc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ELOTSequenceNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setELOTSequenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","EwsFlag").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EwsFlag" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEwsFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","LACSFlag").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLACSFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","LACSIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLACSIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","LACSReturnCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLACSReturnCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","RecordTypeCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecordTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SuiteLinkReturnCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSuiteLinkReturnCode(
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
           
    