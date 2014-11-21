
/**
 * PavResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cdyne.pav3;
            

            /**
            *  PavResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PavResponse
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PavResponse
                Namespace URI = pav3.cdyne.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for CensusInfo
                        */

                        
                                    protected com.cdyne.pav3.CensusInfo localCensusInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCensusInfoTracker = false ;

                           public boolean isCensusInfoSpecified(){
                               return localCensusInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cdyne.pav3.CensusInfo
                           */
                           public  com.cdyne.pav3.CensusInfo getCensusInfo(){
                               return localCensusInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CensusInfo
                               */
                               public void setCensusInfo(com.cdyne.pav3.CensusInfo param){
                            localCensusInfoTracker = true;
                                   
                                            this.localCensusInfo=param;
                                    

                               }
                            

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
                        * field for Country
                        */

                        
                                    protected java.lang.String localCountry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryTracker = false ;

                           public boolean isCountrySpecified(){
                               return localCountryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCountry(){
                               return localCountry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Country
                               */
                               public void setCountry(java.lang.String param){
                            localCountryTracker = true;
                                   
                                            this.localCountry=param;
                                    

                               }
                            

                        /**
                        * field for County
                        */

                        
                                    protected java.lang.String localCounty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountyTracker = false ;

                           public boolean isCountySpecified(){
                               return localCountyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCounty(){
                               return localCounty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param County
                               */
                               public void setCounty(java.lang.String param){
                            localCountyTracker = true;
                                   
                                            this.localCounty=param;
                                    

                               }
                            

                        /**
                        * field for CountyNum
                        */

                        
                                    protected java.lang.String localCountyNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountyNumTracker = false ;

                           public boolean isCountyNumSpecified(){
                               return localCountyNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCountyNum(){
                               return localCountyNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountyNum
                               */
                               public void setCountyNum(java.lang.String param){
                            localCountyNumTracker = true;
                                   
                                            this.localCountyNum=param;
                                    

                               }
                            

                        /**
                        * field for FinanceNumber
                        */

                        
                                    protected java.lang.String localFinanceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFinanceNumberTracker = false ;

                           public boolean isFinanceNumberSpecified(){
                               return localFinanceNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFinanceNumber(){
                               return localFinanceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FinanceNumber
                               */
                               public void setFinanceNumber(java.lang.String param){
                            localFinanceNumberTracker = true;
                                   
                                            this.localFinanceNumber=param;
                                    

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
                        * field for GeoLocationInfo
                        */

                        
                                    protected com.cdyne.pav3.GeoLocationInfo localGeoLocationInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeoLocationInfoTracker = false ;

                           public boolean isGeoLocationInfoSpecified(){
                               return localGeoLocationInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cdyne.pav3.GeoLocationInfo
                           */
                           public  com.cdyne.pav3.GeoLocationInfo getGeoLocationInfo(){
                               return localGeoLocationInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoLocationInfo
                               */
                               public void setGeoLocationInfo(com.cdyne.pav3.GeoLocationInfo param){
                            localGeoLocationInfoTracker = true;
                                   
                                            this.localGeoLocationInfo=param;
                                    

                               }
                            

                        /**
                        * field for IntelligentMailBarcodeKey
                        */

                        
                                    protected java.lang.String localIntelligentMailBarcodeKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntelligentMailBarcodeKeyTracker = false ;

                           public boolean isIntelligentMailBarcodeKeySpecified(){
                               return localIntelligentMailBarcodeKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIntelligentMailBarcodeKey(){
                               return localIntelligentMailBarcodeKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntelligentMailBarcodeKey
                               */
                               public void setIntelligentMailBarcodeKey(java.lang.String param){
                            localIntelligentMailBarcodeKeyTracker = true;
                                   
                                            this.localIntelligentMailBarcodeKey=param;
                                    

                               }
                            

                        /**
                        * field for LegislativeInfo
                        */

                        
                                    protected com.cdyne.pav3.LegislativeInfo localLegislativeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLegislativeInfoTracker = false ;

                           public boolean isLegislativeInfoSpecified(){
                               return localLegislativeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cdyne.pav3.LegislativeInfo
                           */
                           public  com.cdyne.pav3.LegislativeInfo getLegislativeInfo(){
                               return localLegislativeInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LegislativeInfo
                               */
                               public void setLegislativeInfo(com.cdyne.pav3.LegislativeInfo param){
                            localLegislativeInfoTracker = true;
                                   
                                            this.localLegislativeInfo=param;
                                    

                               }
                            

                        /**
                        * field for MailingIndustryInfo
                        */

                        
                                    protected com.cdyne.pav3.MailingIndustryInfo localMailingIndustryInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMailingIndustryInfoTracker = false ;

                           public boolean isMailingIndustryInfoSpecified(){
                               return localMailingIndustryInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cdyne.pav3.MailingIndustryInfo
                           */
                           public  com.cdyne.pav3.MailingIndustryInfo getMailingIndustryInfo(){
                               return localMailingIndustryInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MailingIndustryInfo
                               */
                               public void setMailingIndustryInfo(com.cdyne.pav3.MailingIndustryInfo param){
                            localMailingIndustryInfoTracker = true;
                                   
                                            this.localMailingIndustryInfo=param;
                                    

                               }
                            

                        /**
                        * field for MultipleMatches
                        */

                        
                                    protected com.cdyne.pav3.ArrayOfAddressInfo localMultipleMatches ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMultipleMatchesTracker = false ;

                           public boolean isMultipleMatchesSpecified(){
                               return localMultipleMatchesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cdyne.pav3.ArrayOfAddressInfo
                           */
                           public  com.cdyne.pav3.ArrayOfAddressInfo getMultipleMatches(){
                               return localMultipleMatches;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MultipleMatches
                               */
                               public void setMultipleMatches(com.cdyne.pav3.ArrayOfAddressInfo param){
                            localMultipleMatchesTracker = true;
                                   
                                            this.localMultipleMatches=param;
                                    

                               }
                            

                        /**
                        * field for PMBDesignator
                        */

                        
                                    protected java.lang.String localPMBDesignator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPMBDesignatorTracker = false ;

                           public boolean isPMBDesignatorSpecified(){
                               return localPMBDesignatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPMBDesignator(){
                               return localPMBDesignator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PMBDesignator
                               */
                               public void setPMBDesignator(java.lang.String param){
                            localPMBDesignatorTracker = true;
                                   
                                            this.localPMBDesignator=param;
                                    

                               }
                            

                        /**
                        * field for PMBNumber
                        */

                        
                                    protected java.lang.String localPMBNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPMBNumberTracker = false ;

                           public boolean isPMBNumberSpecified(){
                               return localPMBNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPMBNumber(){
                               return localPMBNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PMBNumber
                               */
                               public void setPMBNumber(java.lang.String param){
                            localPMBNumberTracker = true;
                                   
                                            this.localPMBNumber=param;
                                    

                               }
                            

                        /**
                        * field for PostDirectional
                        */

                        
                                    protected java.lang.String localPostDirectional ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostDirectionalTracker = false ;

                           public boolean isPostDirectionalSpecified(){
                               return localPostDirectionalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPostDirectional(){
                               return localPostDirectional;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostDirectional
                               */
                               public void setPostDirectional(java.lang.String param){
                            localPostDirectionalTracker = true;
                                   
                                            this.localPostDirectional=param;
                                    

                               }
                            

                        /**
                        * field for PostnetBarcode
                        */

                        
                                    protected java.lang.String localPostnetBarcode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostnetBarcodeTracker = false ;

                           public boolean isPostnetBarcodeSpecified(){
                               return localPostnetBarcodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPostnetBarcode(){
                               return localPostnetBarcode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostnetBarcode
                               */
                               public void setPostnetBarcode(java.lang.String param){
                            localPostnetBarcodeTracker = true;
                                   
                                            this.localPostnetBarcode=param;
                                    

                               }
                            

                        /**
                        * field for PreDirectional
                        */

                        
                                    protected java.lang.String localPreDirectional ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreDirectionalTracker = false ;

                           public boolean isPreDirectionalSpecified(){
                               return localPreDirectionalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPreDirectional(){
                               return localPreDirectional;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreDirectional
                               */
                               public void setPreDirectional(java.lang.String param){
                            localPreDirectionalTracker = true;
                                   
                                            this.localPreDirectional=param;
                                    

                               }
                            

                        /**
                        * field for PreferredCityName
                        */

                        
                                    protected java.lang.String localPreferredCityName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreferredCityNameTracker = false ;

                           public boolean isPreferredCityNameSpecified(){
                               return localPreferredCityNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPreferredCityName(){
                               return localPreferredCityName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreferredCityName
                               */
                               public void setPreferredCityName(java.lang.String param){
                            localPreferredCityNameTracker = true;
                                   
                                            this.localPreferredCityName=param;
                                    

                               }
                            

                        /**
                        * field for Primary
                        */

                        
                                    protected java.lang.String localPrimary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryTracker = false ;

                           public boolean isPrimarySpecified(){
                               return localPrimaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimary(){
                               return localPrimary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Primary
                               */
                               public void setPrimary(java.lang.String param){
                            localPrimaryTracker = true;
                                   
                                            this.localPrimary=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryDeliveryLine
                        */

                        
                                    protected java.lang.String localPrimaryDeliveryLine ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryDeliveryLineTracker = false ;

                           public boolean isPrimaryDeliveryLineSpecified(){
                               return localPrimaryDeliveryLineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimaryDeliveryLine(){
                               return localPrimaryDeliveryLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryDeliveryLine
                               */
                               public void setPrimaryDeliveryLine(java.lang.String param){
                            localPrimaryDeliveryLineTracker = true;
                                   
                                            this.localPrimaryDeliveryLine=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryEO
                        */

                        
                                    protected java.lang.String localPrimaryEO ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryEOTracker = false ;

                           public boolean isPrimaryEOSpecified(){
                               return localPrimaryEOTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimaryEO(){
                               return localPrimaryEO;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryEO
                               */
                               public void setPrimaryEO(java.lang.String param){
                            localPrimaryEOTracker = true;
                                   
                                            this.localPrimaryEO=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryHigh
                        */

                        
                                    protected java.lang.String localPrimaryHigh ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryHighTracker = false ;

                           public boolean isPrimaryHighSpecified(){
                               return localPrimaryHighTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimaryHigh(){
                               return localPrimaryHigh;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryHigh
                               */
                               public void setPrimaryHigh(java.lang.String param){
                            localPrimaryHighTracker = true;
                                   
                                            this.localPrimaryHigh=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryLow
                        */

                        
                                    protected java.lang.String localPrimaryLow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryLowTracker = false ;

                           public boolean isPrimaryLowSpecified(){
                               return localPrimaryLowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimaryLow(){
                               return localPrimaryLow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryLow
                               */
                               public void setPrimaryLow(java.lang.String param){
                            localPrimaryLowTracker = true;
                                   
                                            this.localPrimaryLow=param;
                                    

                               }
                            

                        /**
                        * field for ResidentialDeliveryIndicator
                        */

                        
                                    protected java.lang.String localResidentialDeliveryIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResidentialDeliveryIndicatorTracker = false ;

                           public boolean isResidentialDeliveryIndicatorSpecified(){
                               return localResidentialDeliveryIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResidentialDeliveryIndicator(){
                               return localResidentialDeliveryIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResidentialDeliveryIndicator
                               */
                               public void setResidentialDeliveryIndicator(java.lang.String param){
                            localResidentialDeliveryIndicatorTracker = true;
                                   
                                            this.localResidentialDeliveryIndicator=param;
                                    

                               }
                            

                        /**
                        * field for ReturnCode
                        */

                        
                                    protected int localReturnCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnCodeTracker = false ;

                           public boolean isReturnCodeSpecified(){
                               return localReturnCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getReturnCode(){
                               return localReturnCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnCode
                               */
                               public void setReturnCode(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localReturnCodeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localReturnCode=param;
                                    

                               }
                            

                        /**
                        * field for Secondary
                        */

                        
                                    protected java.lang.String localSecondary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryTracker = false ;

                           public boolean isSecondarySpecified(){
                               return localSecondaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondary(){
                               return localSecondary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Secondary
                               */
                               public void setSecondary(java.lang.String param){
                            localSecondaryTracker = true;
                                   
                                            this.localSecondary=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryAbbreviation
                        */

                        
                                    protected java.lang.String localSecondaryAbbreviation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryAbbreviationTracker = false ;

                           public boolean isSecondaryAbbreviationSpecified(){
                               return localSecondaryAbbreviationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryAbbreviation(){
                               return localSecondaryAbbreviation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryAbbreviation
                               */
                               public void setSecondaryAbbreviation(java.lang.String param){
                            localSecondaryAbbreviationTracker = true;
                                   
                                            this.localSecondaryAbbreviation=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryDeliveryLine
                        */

                        
                                    protected java.lang.String localSecondaryDeliveryLine ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryDeliveryLineTracker = false ;

                           public boolean isSecondaryDeliveryLineSpecified(){
                               return localSecondaryDeliveryLineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryDeliveryLine(){
                               return localSecondaryDeliveryLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryDeliveryLine
                               */
                               public void setSecondaryDeliveryLine(java.lang.String param){
                            localSecondaryDeliveryLineTracker = true;
                                   
                                            this.localSecondaryDeliveryLine=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryEO
                        */

                        
                                    protected java.lang.String localSecondaryEO ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryEOTracker = false ;

                           public boolean isSecondaryEOSpecified(){
                               return localSecondaryEOTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryEO(){
                               return localSecondaryEO;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryEO
                               */
                               public void setSecondaryEO(java.lang.String param){
                            localSecondaryEOTracker = true;
                                   
                                            this.localSecondaryEO=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryHigh
                        */

                        
                                    protected java.lang.String localSecondaryHigh ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryHighTracker = false ;

                           public boolean isSecondaryHighSpecified(){
                               return localSecondaryHighTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryHigh(){
                               return localSecondaryHigh;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryHigh
                               */
                               public void setSecondaryHigh(java.lang.String param){
                            localSecondaryHighTracker = true;
                                   
                                            this.localSecondaryHigh=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryLow
                        */

                        
                                    protected java.lang.String localSecondaryLow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryLowTracker = false ;

                           public boolean isSecondaryLowSpecified(){
                               return localSecondaryLowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryLow(){
                               return localSecondaryLow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryLow
                               */
                               public void setSecondaryLow(java.lang.String param){
                            localSecondaryLowTracker = true;
                                   
                                            this.localSecondaryLow=param;
                                    

                               }
                            

                        /**
                        * field for StateAbbreviation
                        */

                        
                                    protected java.lang.String localStateAbbreviation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateAbbreviationTracker = false ;

                           public boolean isStateAbbreviationSpecified(){
                               return localStateAbbreviationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStateAbbreviation(){
                               return localStateAbbreviation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateAbbreviation
                               */
                               public void setStateAbbreviation(java.lang.String param){
                            localStateAbbreviationTracker = true;
                                   
                                            this.localStateAbbreviation=param;
                                    

                               }
                            

                        /**
                        * field for StreetName
                        */

                        
                                    protected java.lang.String localStreetName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreetNameTracker = false ;

                           public boolean isStreetNameSpecified(){
                               return localStreetNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreetName(){
                               return localStreetName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreetName
                               */
                               public void setStreetName(java.lang.String param){
                            localStreetNameTracker = true;
                                   
                                            this.localStreetName=param;
                                    

                               }
                            

                        /**
                        * field for Suffix
                        */

                        
                                    protected java.lang.String localSuffix ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuffixTracker = false ;

                           public boolean isSuffixSpecified(){
                               return localSuffixTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSuffix(){
                               return localSuffix;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Suffix
                               */
                               public void setSuffix(java.lang.String param){
                            localSuffixTracker = true;
                                   
                                            this.localSuffix=param;
                                    

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
                           namespacePrefix+":PavResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PavResponse",
                           xmlWriter);
                   }

               
                   }
                if (localCensusInfoTracker){
                                    if (localCensusInfo==null){

                                        writeStartElement(null, "pav3.cdyne.com", "CensusInfo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCensusInfo.serialize(new javax.xml.namespace.QName("pav3.cdyne.com","CensusInfo"),
                                        xmlWriter);
                                    }
                                } if (localCityNameTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "CityName", xmlWriter);
                             

                                          if (localCityName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCityName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountryTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "Country", xmlWriter);
                             

                                          if (localCountry==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountry);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountyTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "County", xmlWriter);
                             

                                          if (localCounty==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCounty);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountyNumTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "CountyNum", xmlWriter);
                             

                                          if (localCountyNum==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountyNum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFinanceNumberTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "FinanceNumber", xmlWriter);
                             

                                          if (localFinanceNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFinanceNumber);
                                            
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
                             } if (localGeoLocationInfoTracker){
                                    if (localGeoLocationInfo==null){

                                        writeStartElement(null, "pav3.cdyne.com", "GeoLocationInfo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGeoLocationInfo.serialize(new javax.xml.namespace.QName("pav3.cdyne.com","GeoLocationInfo"),
                                        xmlWriter);
                                    }
                                } if (localIntelligentMailBarcodeKeyTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "IntelligentMailBarcodeKey", xmlWriter);
                             

                                          if (localIntelligentMailBarcodeKey==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIntelligentMailBarcodeKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLegislativeInfoTracker){
                                    if (localLegislativeInfo==null){

                                        writeStartElement(null, "pav3.cdyne.com", "LegislativeInfo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLegislativeInfo.serialize(new javax.xml.namespace.QName("pav3.cdyne.com","LegislativeInfo"),
                                        xmlWriter);
                                    }
                                } if (localMailingIndustryInfoTracker){
                                    if (localMailingIndustryInfo==null){

                                        writeStartElement(null, "pav3.cdyne.com", "MailingIndustryInfo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMailingIndustryInfo.serialize(new javax.xml.namespace.QName("pav3.cdyne.com","MailingIndustryInfo"),
                                        xmlWriter);
                                    }
                                } if (localMultipleMatchesTracker){
                                    if (localMultipleMatches==null){

                                        writeStartElement(null, "pav3.cdyne.com", "MultipleMatches", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMultipleMatches.serialize(new javax.xml.namespace.QName("pav3.cdyne.com","MultipleMatches"),
                                        xmlWriter);
                                    }
                                } if (localPMBDesignatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PMBDesignator", xmlWriter);
                             

                                          if (localPMBDesignator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPMBDesignator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPMBNumberTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PMBNumber", xmlWriter);
                             

                                          if (localPMBNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPMBNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostDirectionalTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PostDirectional", xmlWriter);
                             

                                          if (localPostDirectional==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPostDirectional);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostnetBarcodeTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PostnetBarcode", xmlWriter);
                             

                                          if (localPostnetBarcode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPostnetBarcode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPreDirectionalTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PreDirectional", xmlWriter);
                             

                                          if (localPreDirectional==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPreDirectional);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPreferredCityNameTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PreferredCityName", xmlWriter);
                             

                                          if (localPreferredCityName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPreferredCityName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "Primary", xmlWriter);
                             

                                          if (localPrimary==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryDeliveryLineTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PrimaryDeliveryLine", xmlWriter);
                             

                                          if (localPrimaryDeliveryLine==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimaryDeliveryLine);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryEOTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PrimaryEO", xmlWriter);
                             

                                          if (localPrimaryEO==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimaryEO);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryHighTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PrimaryHigh", xmlWriter);
                             

                                          if (localPrimaryHigh==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimaryHigh);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryLowTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "PrimaryLow", xmlWriter);
                             

                                          if (localPrimaryLow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimaryLow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResidentialDeliveryIndicatorTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ResidentialDeliveryIndicator", xmlWriter);
                             

                                          if (localResidentialDeliveryIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResidentialDeliveryIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnCodeTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "ReturnCode", xmlWriter);
                             
                                               if (localReturnCode==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ReturnCode cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "Secondary", xmlWriter);
                             

                                          if (localSecondary==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryAbbreviationTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SecondaryAbbreviation", xmlWriter);
                             

                                          if (localSecondaryAbbreviation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryAbbreviation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryDeliveryLineTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SecondaryDeliveryLine", xmlWriter);
                             

                                          if (localSecondaryDeliveryLine==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryDeliveryLine);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryEOTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SecondaryEO", xmlWriter);
                             

                                          if (localSecondaryEO==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryEO);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryHighTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SecondaryHigh", xmlWriter);
                             

                                          if (localSecondaryHigh==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryHigh);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryLowTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "SecondaryLow", xmlWriter);
                             

                                          if (localSecondaryLow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryLow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateAbbreviationTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "StateAbbreviation", xmlWriter);
                             

                                          if (localStateAbbreviation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStateAbbreviation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStreetNameTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "StreetName", xmlWriter);
                             

                                          if (localStreetName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreetName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSuffixTracker){
                                    namespace = "pav3.cdyne.com";
                                    writeStartElement(null, namespace, "Suffix", xmlWriter);
                             

                                          if (localSuffix==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSuffix);
                                            
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

                 if (localCensusInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CensusInfo"));
                            
                            
                                    elementList.add(localCensusInfo==null?null:
                                    localCensusInfo);
                                } if (localCityNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CityName"));
                                 
                                         elementList.add(localCityName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCityName));
                                    } if (localCountryTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "Country"));
                                 
                                         elementList.add(localCountry==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountry));
                                    } if (localCountyTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "County"));
                                 
                                         elementList.add(localCounty==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCounty));
                                    } if (localCountyNumTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "CountyNum"));
                                 
                                         elementList.add(localCountyNum==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountyNum));
                                    } if (localFinanceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "FinanceNumber"));
                                 
                                         elementList.add(localFinanceNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinanceNumber));
                                    } if (localFirmOrRecipientTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "FirmOrRecipient"));
                                 
                                         elementList.add(localFirmOrRecipient==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirmOrRecipient));
                                    } if (localGeoLocationInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "GeoLocationInfo"));
                            
                            
                                    elementList.add(localGeoLocationInfo==null?null:
                                    localGeoLocationInfo);
                                } if (localIntelligentMailBarcodeKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "IntelligentMailBarcodeKey"));
                                 
                                         elementList.add(localIntelligentMailBarcodeKey==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntelligentMailBarcodeKey));
                                    } if (localLegislativeInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "LegislativeInfo"));
                            
                            
                                    elementList.add(localLegislativeInfo==null?null:
                                    localLegislativeInfo);
                                } if (localMailingIndustryInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "MailingIndustryInfo"));
                            
                            
                                    elementList.add(localMailingIndustryInfo==null?null:
                                    localMailingIndustryInfo);
                                } if (localMultipleMatchesTracker){
                            elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "MultipleMatches"));
                            
                            
                                    elementList.add(localMultipleMatches==null?null:
                                    localMultipleMatches);
                                } if (localPMBDesignatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PMBDesignator"));
                                 
                                         elementList.add(localPMBDesignator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPMBDesignator));
                                    } if (localPMBNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PMBNumber"));
                                 
                                         elementList.add(localPMBNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPMBNumber));
                                    } if (localPostDirectionalTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PostDirectional"));
                                 
                                         elementList.add(localPostDirectional==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostDirectional));
                                    } if (localPostnetBarcodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PostnetBarcode"));
                                 
                                         elementList.add(localPostnetBarcode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostnetBarcode));
                                    } if (localPreDirectionalTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PreDirectional"));
                                 
                                         elementList.add(localPreDirectional==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreDirectional));
                                    } if (localPreferredCityNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PreferredCityName"));
                                 
                                         elementList.add(localPreferredCityName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreferredCityName));
                                    } if (localPrimaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "Primary"));
                                 
                                         elementList.add(localPrimary==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary));
                                    } if (localPrimaryDeliveryLineTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PrimaryDeliveryLine"));
                                 
                                         elementList.add(localPrimaryDeliveryLine==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryDeliveryLine));
                                    } if (localPrimaryEOTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PrimaryEO"));
                                 
                                         elementList.add(localPrimaryEO==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryEO));
                                    } if (localPrimaryHighTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PrimaryHigh"));
                                 
                                         elementList.add(localPrimaryHigh==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryHigh));
                                    } if (localPrimaryLowTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "PrimaryLow"));
                                 
                                         elementList.add(localPrimaryLow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryLow));
                                    } if (localResidentialDeliveryIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ResidentialDeliveryIndicator"));
                                 
                                         elementList.add(localResidentialDeliveryIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResidentialDeliveryIndicator));
                                    } if (localReturnCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "ReturnCode"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
                            } if (localSecondaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "Secondary"));
                                 
                                         elementList.add(localSecondary==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondary));
                                    } if (localSecondaryAbbreviationTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SecondaryAbbreviation"));
                                 
                                         elementList.add(localSecondaryAbbreviation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryAbbreviation));
                                    } if (localSecondaryDeliveryLineTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SecondaryDeliveryLine"));
                                 
                                         elementList.add(localSecondaryDeliveryLine==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryDeliveryLine));
                                    } if (localSecondaryEOTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SecondaryEO"));
                                 
                                         elementList.add(localSecondaryEO==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryEO));
                                    } if (localSecondaryHighTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SecondaryHigh"));
                                 
                                         elementList.add(localSecondaryHigh==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryHigh));
                                    } if (localSecondaryLowTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "SecondaryLow"));
                                 
                                         elementList.add(localSecondaryLow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryLow));
                                    } if (localStateAbbreviationTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "StateAbbreviation"));
                                 
                                         elementList.add(localStateAbbreviation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateAbbreviation));
                                    } if (localStreetNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "StreetName"));
                                 
                                         elementList.add(localStreetName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreetName));
                                    } if (localSuffixTracker){
                                      elementList.add(new javax.xml.namespace.QName("pav3.cdyne.com",
                                                                      "Suffix"));
                                 
                                         elementList.add(localSuffix==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuffix));
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
        public static PavResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PavResponse object =
                new PavResponse();

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
                    
                            if (!"PavResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PavResponse)com.cdyne.pav3.imports.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","CensusInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCensusInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCensusInfo(com.cdyne.pav3.CensusInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","Country").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCountry(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","County").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCounty(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","CountyNum").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCountyNum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","FinanceNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFinanceNumber(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","GeoLocationInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGeoLocationInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGeoLocationInfo(com.cdyne.pav3.GeoLocationInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","IntelligentMailBarcodeKey").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntelligentMailBarcodeKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","LegislativeInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLegislativeInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLegislativeInfo(com.cdyne.pav3.LegislativeInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","MailingIndustryInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMailingIndustryInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMailingIndustryInfo(com.cdyne.pav3.MailingIndustryInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","MultipleMatches").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMultipleMatches(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMultipleMatches(com.cdyne.pav3.ArrayOfAddressInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PMBDesignator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPMBDesignator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PMBNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPMBNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PostDirectional").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPostDirectional(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PostnetBarcode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPostnetBarcode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PreDirectional").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPreDirectional(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PreferredCityName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPreferredCityName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","Primary").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PrimaryDeliveryLine").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryDeliveryLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PrimaryEO").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryEO(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PrimaryHigh").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryHigh(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","PrimaryLow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryLow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ResidentialDeliveryIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResidentialDeliveryIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","ReturnCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setReturnCode(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","Secondary").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SecondaryAbbreviation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryAbbreviation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SecondaryDeliveryLine").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryDeliveryLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SecondaryEO").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryEO(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SecondaryHigh").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryHigh(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","SecondaryLow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryLow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","StateAbbreviation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStateAbbreviation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","StreetName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreetName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("pav3.cdyne.com","Suffix").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSuffix(
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
           
    