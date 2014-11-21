
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.cdyne.pav3.imports;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "IntelligentBarcodeResponse".equals(typeName)){
                   
                            return  com.cdyne.pav3.IntelligentBarcodeResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "LegislativeInfo".equals(typeName)){
                   
                            return  com.cdyne.pav3.LegislativeInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "char".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "ArrayOfAddressInfo".equals(typeName)){
                   
                            return  com.cdyne.pav3.ArrayOfAddressInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "City".equals(typeName)){
                   
                            return  com.cdyne.pav3.City.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) &&
                  "ArrayOfstring".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "CongressionalDistrictResponse".equals(typeName)){
                   
                            return  com.cdyne.pav3.CongressionalDistrictResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "UrbanizationResponse".equals(typeName)){
                   
                            return  com.cdyne.pav3.UrbanizationResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "CityNamesResponse".equals(typeName)){
                   
                            return  com.cdyne.pav3.CityNamesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "CensusInfo".equals(typeName)){
                   
                            return  com.cdyne.pav3.CensusInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "guid".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "GeoLocationInfo".equals(typeName)){
                   
                            return  com.cdyne.pav3.GeoLocationInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "MailingIndustryInfo".equals(typeName)){
                   
                            return  com.cdyne.pav3.MailingIndustryInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "duration".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "Address".equals(typeName)){
                   
                            return  com.cdyne.pav3.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "ZipCodesResponse".equals(typeName)){
                   
                            return  com.cdyne.pav3.ZipCodesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "PavResponse".equals(typeName)){
                   
                            return  com.cdyne.pav3.PavResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "PavRequest".equals(typeName)){
                   
                            return  com.cdyne.pav3.PavRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "AddressInfo".equals(typeName)){
                   
                            return  com.cdyne.pav3.AddressInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "pav3.cdyne.com".equals(namespaceURI) &&
                  "ArrayOfCity".equals(typeName)){
                   
                            return  com.cdyne.pav3.ArrayOfCity.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    