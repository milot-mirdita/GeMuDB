
/**
 * ESearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.esearch;
            

            /**
            *  ESearchResult bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ESearchResult
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                "eSearchResult",
                "ns3");

            

                        /**
                        * field for ERROR
                        */

                        
                                    protected java.lang.String localERROR ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localERRORTracker = false ;

                           public boolean isERRORSpecified(){
                               return localERRORTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getERROR(){
                               return localERROR;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ERROR
                               */
                               public void setERROR(java.lang.String param){
                            localERRORTracker = param != null;
                                   
                                            this.localERROR=param;
                                    

                               }
                            

                        /**
                        * field for Count
                        */

                        
                                    protected java.lang.String localCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountTracker = false ;

                           public boolean isCountSpecified(){
                               return localCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCount(){
                               return localCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Count
                               */
                               public void setCount(java.lang.String param){
                            localCountTracker = param != null;
                                   
                                            this.localCount=param;
                                    

                               }
                            

                        /**
                        * field for RetMax
                        */

                        
                                    protected java.lang.String localRetMax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRetMaxTracker = false ;

                           public boolean isRetMaxSpecified(){
                               return localRetMaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRetMax(){
                               return localRetMax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetMax
                               */
                               public void setRetMax(java.lang.String param){
                            localRetMaxTracker = param != null;
                                   
                                            this.localRetMax=param;
                                    

                               }
                            

                        /**
                        * field for RetStart
                        */

                        
                                    protected java.lang.String localRetStart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRetStartTracker = false ;

                           public boolean isRetStartSpecified(){
                               return localRetStartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRetStart(){
                               return localRetStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetStart
                               */
                               public void setRetStart(java.lang.String param){
                            localRetStartTracker = param != null;
                                   
                                            this.localRetStart=param;
                                    

                               }
                            

                        /**
                        * field for QueryKey
                        */

                        
                                    protected java.lang.String localQueryKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryKeyTracker = false ;

                           public boolean isQueryKeySpecified(){
                               return localQueryKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQueryKey(){
                               return localQueryKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryKey
                               */
                               public void setQueryKey(java.lang.String param){
                            localQueryKeyTracker = param != null;
                                   
                                            this.localQueryKey=param;
                                    

                               }
                            

                        /**
                        * field for WebEnv
                        */

                        
                                    protected java.lang.String localWebEnv ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWebEnvTracker = false ;

                           public boolean isWebEnvSpecified(){
                               return localWebEnvTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWebEnv(){
                               return localWebEnv;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WebEnv
                               */
                               public void setWebEnv(java.lang.String param){
                            localWebEnvTracker = param != null;
                                   
                                            this.localWebEnv=param;
                                    

                               }
                            

                        /**
                        * field for IdList
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType localIdList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdListTracker = false ;

                           public boolean isIdListSpecified(){
                               return localIdListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType getIdList(){
                               return localIdList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdList
                               */
                               public void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType param){
                            localIdListTracker = param != null;
                                   
                                            this.localIdList=param;
                                    

                               }
                            

                        /**
                        * field for TranslationSet
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType localTranslationSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTranslationSetTracker = false ;

                           public boolean isTranslationSetSpecified(){
                               return localTranslationSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType getTranslationSet(){
                               return localTranslationSet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TranslationSet
                               */
                               public void setTranslationSet(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType param){
                            localTranslationSetTracker = param != null;
                                   
                                            this.localTranslationSet=param;
                                    

                               }
                            

                        /**
                        * field for TranslationStack
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType localTranslationStack ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTranslationStackTracker = false ;

                           public boolean isTranslationStackSpecified(){
                               return localTranslationStackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType getTranslationStack(){
                               return localTranslationStack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TranslationStack
                               */
                               public void setTranslationStack(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType param){
                            localTranslationStackTracker = param != null;
                                   
                                            this.localTranslationStack=param;
                                    

                               }
                            

                        /**
                        * field for QueryTranslation
                        */

                        
                                    protected java.lang.String localQueryTranslation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryTranslationTracker = false ;

                           public boolean isQueryTranslationSpecified(){
                               return localQueryTranslationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQueryTranslation(){
                               return localQueryTranslation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryTranslation
                               */
                               public void setQueryTranslation(java.lang.String param){
                            localQueryTranslationTracker = param != null;
                                   
                                            this.localQueryTranslation=param;
                                    

                               }
                            

                        /**
                        * field for ErrorList
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType localErrorList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorListTracker = false ;

                           public boolean isErrorListSpecified(){
                               return localErrorListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType getErrorList(){
                               return localErrorList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorList
                               */
                               public void setErrorList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType param){
                            localErrorListTracker = param != null;
                                   
                                            this.localErrorList=param;
                                    

                               }
                            

                        /**
                        * field for WarningList
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType localWarningList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWarningListTracker = false ;

                           public boolean isWarningListSpecified(){
                               return localWarningListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType getWarningList(){
                               return localWarningList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WarningList
                               */
                               public void setWarningList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType param){
                            localWarningListTracker = param != null;
                                   
                                            this.localWarningList=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/esearch");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":eSearchResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "eSearchResult",
                           xmlWriter);
                   }

               
                   }
                if (localERRORTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "ERROR", xmlWriter);
                             

                                          if (localERROR==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ERROR cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localERROR);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "Count", xmlWriter);
                             

                                          if (localCount==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCount);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRetMaxTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "RetMax", xmlWriter);
                             

                                          if (localRetMax==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RetMax cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRetMax);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRetStartTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "RetStart", xmlWriter);
                             

                                          if (localRetStart==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RetStart cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRetStart);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryKeyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "QueryKey", xmlWriter);
                             

                                          if (localQueryKey==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("QueryKey cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQueryKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWebEnvTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "WebEnv", xmlWriter);
                             

                                          if (localWebEnv==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WebEnv cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWebEnv);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdListTracker){
                                            if (localIdList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IdList cannot be null!!");
                                            }
                                           localIdList.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","IdList"),
                                               xmlWriter);
                                        } if (localTranslationSetTracker){
                                            if (localTranslationSet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TranslationSet cannot be null!!");
                                            }
                                           localTranslationSet.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","TranslationSet"),
                                               xmlWriter);
                                        } if (localTranslationStackTracker){
                                            if (localTranslationStack==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TranslationStack cannot be null!!");
                                            }
                                           localTranslationStack.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","TranslationStack"),
                                               xmlWriter);
                                        } if (localQueryTranslationTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "QueryTranslation", xmlWriter);
                             

                                          if (localQueryTranslation==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("QueryTranslation cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQueryTranslation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorListTracker){
                                            if (localErrorList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ErrorList cannot be null!!");
                                            }
                                           localErrorList.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","ErrorList"),
                                               xmlWriter);
                                        } if (localWarningListTracker){
                                            if (localWarningList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("WarningList cannot be null!!");
                                            }
                                           localWarningList.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","WarningList"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch")){
                return "ns3";
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

                 if (localERRORTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "ERROR"));
                                 
                                        if (localERROR != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localERROR));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ERROR cannot be null!!");
                                        }
                                    } if (localCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "Count"));
                                 
                                        if (localCount != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");
                                        }
                                    } if (localRetMaxTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "RetMax"));
                                 
                                        if (localRetMax != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetMax));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RetMax cannot be null!!");
                                        }
                                    } if (localRetStartTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "RetStart"));
                                 
                                        if (localRetStart != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetStart));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RetStart cannot be null!!");
                                        }
                                    } if (localQueryKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "QueryKey"));
                                 
                                        if (localQueryKey != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryKey));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("QueryKey cannot be null!!");
                                        }
                                    } if (localWebEnvTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "WebEnv"));
                                 
                                        if (localWebEnv != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWebEnv));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WebEnv cannot be null!!");
                                        }
                                    } if (localIdListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "IdList"));
                            
                            
                                    if (localIdList==null){
                                         throw new org.apache.axis2.databinding.ADBException("IdList cannot be null!!");
                                    }
                                    elementList.add(localIdList);
                                } if (localTranslationSetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "TranslationSet"));
                            
                            
                                    if (localTranslationSet==null){
                                         throw new org.apache.axis2.databinding.ADBException("TranslationSet cannot be null!!");
                                    }
                                    elementList.add(localTranslationSet);
                                } if (localTranslationStackTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "TranslationStack"));
                            
                            
                                    if (localTranslationStack==null){
                                         throw new org.apache.axis2.databinding.ADBException("TranslationStack cannot be null!!");
                                    }
                                    elementList.add(localTranslationStack);
                                } if (localQueryTranslationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "QueryTranslation"));
                                 
                                        if (localQueryTranslation != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryTranslation));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("QueryTranslation cannot be null!!");
                                        }
                                    } if (localErrorListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "ErrorList"));
                            
                            
                                    if (localErrorList==null){
                                         throw new org.apache.axis2.databinding.ADBException("ErrorList cannot be null!!");
                                    }
                                    elementList.add(localErrorList);
                                } if (localWarningListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "WarningList"));
                            
                            
                                    if (localWarningList==null){
                                         throw new org.apache.axis2.databinding.ADBException("WarningList cannot be null!!");
                                    }
                                    elementList.add(localWarningList);
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
        public static ESearchResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ESearchResult object =
                new ESearchResult();

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
                    
                            if (!"eSearchResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ESearchResult)gov.nih.nlm.ncbi.www.soap.eutils.egquery.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","ERROR").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ERROR" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setERROR(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","Count").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Count" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","RetMax").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RetMax" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetMax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","RetStart").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RetStart" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetStart(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","QueryKey").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"QueryKey" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQueryKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","WebEnv").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WebEnv" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWebEnv(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","IdList").equals(reader.getName())){
                                
                                                object.setIdList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","TranslationSet").equals(reader.getName())){
                                
                                                object.setTranslationSet(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationSetType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","TranslationStack").equals(reader.getName())){
                                
                                                object.setTranslationStack(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationStackType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","QueryTranslation").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"QueryTranslation" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQueryTranslation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","ErrorList").equals(reader.getName())){
                                
                                                object.setErrorList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ErrorListType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","WarningList").equals(reader.getName())){
                                
                                                object.setWarningList(gov.nih.nlm.ncbi.www.soap.eutils.esearch.WarningListType.Factory.parse(reader));
                                              
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
           
    