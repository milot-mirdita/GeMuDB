
/**
 * LinkSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.elink;
            

            /**
            *  LinkSetType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LinkSetType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LinkSetType
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/elink
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for DbFrom
                        */

                        
                                    protected java.lang.String localDbFrom ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDbFrom(){
                               return localDbFrom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DbFrom
                               */
                               public void setDbFrom(java.lang.String param){
                            
                                            this.localDbFrom=param;
                                    

                               }
                            

                        /**
                        * field for IdList
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType localIdList ;
                                
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
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType getIdList(){
                               return localIdList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdList
                               */
                               public void setIdList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType param){
                            localIdListTracker = param != null;
                                   
                                            this.localIdList=param;
                                    

                               }
                            

                        /**
                        * field for LinkSetDb
                        * This was an Array!
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] localLinkSetDb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLinkSetDbTracker = false ;

                           public boolean isLinkSetDbSpecified(){
                               return localLinkSetDbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[]
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] getLinkSetDb(){
                               return localLinkSetDb;
                           }

                           
                        


                               
                              /**
                               * validate the array for LinkSetDb
                               */
                              protected void validateLinkSetDb(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LinkSetDb
                              */
                              public void setLinkSetDb(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[] param){
                              
                                   validateLinkSetDb(param);

                               localLinkSetDbTracker = param != null;
                                      
                                      this.localLinkSetDb=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType
                             */
                             public void addLinkSetDb(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType param){
                                   if (localLinkSetDb == null){
                                   localLinkSetDb = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[]{};
                                   }

                            
                                 //update the setting tracker
                                localLinkSetDbTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLinkSetDb);
                               list.add(param);
                               this.localLinkSetDb =
                             (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[])list.toArray(
                            new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[list.size()]);

                             }
                             

                        /**
                        * field for LinkSetDbHistory
                        * This was an Array!
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] localLinkSetDbHistory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLinkSetDbHistoryTracker = false ;

                           public boolean isLinkSetDbHistorySpecified(){
                               return localLinkSetDbHistoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[]
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] getLinkSetDbHistory(){
                               return localLinkSetDbHistory;
                           }

                           
                        


                               
                              /**
                               * validate the array for LinkSetDbHistory
                               */
                              protected void validateLinkSetDbHistory(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LinkSetDbHistory
                              */
                              public void setLinkSetDbHistory(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[] param){
                              
                                   validateLinkSetDbHistory(param);

                               localLinkSetDbHistoryTracker = param != null;
                                      
                                      this.localLinkSetDbHistory=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType
                             */
                             public void addLinkSetDbHistory(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType param){
                                   if (localLinkSetDbHistory == null){
                                   localLinkSetDbHistory = new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[]{};
                                   }

                            
                                 //update the setting tracker
                                localLinkSetDbHistoryTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLinkSetDbHistory);
                               list.add(param);
                               this.localLinkSetDbHistory =
                             (gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[])list.toArray(
                            new gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[list.size()]);

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
                        * field for IdUrlList
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType localIdUrlList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdUrlListTracker = false ;

                           public boolean isIdUrlListSpecified(){
                               return localIdUrlListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType getIdUrlList(){
                               return localIdUrlList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdUrlList
                               */
                               public void setIdUrlList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType param){
                            localIdUrlListTracker = param != null;
                                   
                                            this.localIdUrlList=param;
                                    

                               }
                            

                        /**
                        * field for IdCheckList
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType localIdCheckList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdCheckListTracker = false ;

                           public boolean isIdCheckListSpecified(){
                               return localIdCheckListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType getIdCheckList(){
                               return localIdCheckList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IdCheckList
                               */
                               public void setIdCheckList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType param){
                            localIdCheckListTracker = param != null;
                                   
                                            this.localIdCheckList=param;
                                    

                               }
                            

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/elink");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":LinkSetType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LinkSetType",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/elink";
                                    writeStartElement(null, namespace, "DbFrom", xmlWriter);
                             

                                          if (localDbFrom==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DbFrom cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDbFrom);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localIdListTracker){
                                            if (localIdList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IdList cannot be null!!");
                                            }
                                           localIdList.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdList"),
                                               xmlWriter);
                                        } if (localLinkSetDbTracker){
                                       if (localLinkSetDb!=null){
                                            for (int i = 0;i < localLinkSetDb.length;i++){
                                                if (localLinkSetDb[i] != null){
                                                 localLinkSetDb[i].serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","LinkSetDb"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("LinkSetDb cannot be null!!");
                                        
                                    }
                                 } if (localLinkSetDbHistoryTracker){
                                       if (localLinkSetDbHistory!=null){
                                            for (int i = 0;i < localLinkSetDbHistory.length;i++){
                                                if (localLinkSetDbHistory[i] != null){
                                                 localLinkSetDbHistory[i].serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","LinkSetDbHistory"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("LinkSetDbHistory cannot be null!!");
                                        
                                    }
                                 } if (localWebEnvTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/elink";
                                    writeStartElement(null, namespace, "WebEnv", xmlWriter);
                             

                                          if (localWebEnv==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WebEnv cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWebEnv);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdUrlListTracker){
                                            if (localIdUrlList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IdUrlList cannot be null!!");
                                            }
                                           localIdUrlList.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdUrlList"),
                                               xmlWriter);
                                        } if (localIdCheckListTracker){
                                            if (localIdCheckList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IdCheckList cannot be null!!");
                                            }
                                           localIdCheckList.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdCheckList"),
                                               xmlWriter);
                                        } if (localERRORTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/elink";
                                    writeStartElement(null, namespace, "ERROR", xmlWriter);
                             

                                          if (localERROR==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ERROR cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localERROR);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/elink")){
                return "ns5";
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                      "DbFrom"));
                                 
                                        if (localDbFrom != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDbFrom));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DbFrom cannot be null!!");
                                        }
                                     if (localIdListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                      "IdList"));
                            
                            
                                    if (localIdList==null){
                                         throw new org.apache.axis2.databinding.ADBException("IdList cannot be null!!");
                                    }
                                    elementList.add(localIdList);
                                } if (localLinkSetDbTracker){
                             if (localLinkSetDb!=null) {
                                 for (int i = 0;i < localLinkSetDb.length;i++){

                                    if (localLinkSetDb[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                          "LinkSetDb"));
                                         elementList.add(localLinkSetDb[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("LinkSetDb cannot be null!!");
                                    
                             }

                        } if (localLinkSetDbHistoryTracker){
                             if (localLinkSetDbHistory!=null) {
                                 for (int i = 0;i < localLinkSetDbHistory.length;i++){

                                    if (localLinkSetDbHistory[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                          "LinkSetDbHistory"));
                                         elementList.add(localLinkSetDbHistory[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("LinkSetDbHistory cannot be null!!");
                                    
                             }

                        } if (localWebEnvTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                      "WebEnv"));
                                 
                                        if (localWebEnv != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWebEnv));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WebEnv cannot be null!!");
                                        }
                                    } if (localIdUrlListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                      "IdUrlList"));
                            
                            
                                    if (localIdUrlList==null){
                                         throw new org.apache.axis2.databinding.ADBException("IdUrlList cannot be null!!");
                                    }
                                    elementList.add(localIdUrlList);
                                } if (localIdCheckListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                      "IdCheckList"));
                            
                            
                                    if (localIdCheckList==null){
                                         throw new org.apache.axis2.databinding.ADBException("IdCheckList cannot be null!!");
                                    }
                                    elementList.add(localIdCheckList);
                                } if (localERRORTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                      "ERROR"));
                                 
                                        if (localERROR != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localERROR));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ERROR cannot be null!!");
                                        }
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
        public static LinkSetType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LinkSetType object =
                new LinkSetType();

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
                    
                            if (!"LinkSetType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LinkSetType)gov.nih.nlm.ncbi.www.soap.eutils.egquery.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","DbFrom").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DbFrom" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDbFrom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdList").equals(reader.getName())){
                                
                                                object.setIdList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdListType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","LinkSetDb").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","LinkSetDb").equals(reader.getName())){
                                                                    list3.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLinkSetDb((gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","LinkSetDbHistory").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","LinkSetDbHistory").equals(reader.getName())){
                                                                    list4.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLinkSetDbHistory((gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbHistoryType.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","WebEnv").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdUrlList").equals(reader.getName())){
                                
                                                object.setIdUrlList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlListType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdCheckList").equals(reader.getName())){
                                
                                                object.setIdCheckList(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdCheckListType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","ERROR").equals(reader.getName())){
                                
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
           
    