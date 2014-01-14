
/**
 * GBBlock_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  GBBlock_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GBBlock_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GB-block_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GBBlock_extraAccessions
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_extraAccessions_type0 localGBBlock_extraAccessions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_extraAccessionsTracker = false ;

                           public boolean isGBBlock_extraAccessionsSpecified(){
                               return localGBBlock_extraAccessionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_extraAccessions_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_extraAccessions_type0 getGBBlock_extraAccessions(){
                               return localGBBlock_extraAccessions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_extraAccessions
                               */
                               public void setGBBlock_extraAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_extraAccessions_type0 param){
                            localGBBlock_extraAccessionsTracker = param != null;
                                   
                                            this.localGBBlock_extraAccessions=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_source
                        */

                        
                                    protected java.lang.String localGBBlock_source ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_sourceTracker = false ;

                           public boolean isGBBlock_sourceSpecified(){
                               return localGBBlock_sourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBBlock_source(){
                               return localGBBlock_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_source
                               */
                               public void setGBBlock_source(java.lang.String param){
                            localGBBlock_sourceTracker = param != null;
                                   
                                            this.localGBBlock_source=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_keywords
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_keywords_type0 localGBBlock_keywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_keywordsTracker = false ;

                           public boolean isGBBlock_keywordsSpecified(){
                               return localGBBlock_keywordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_keywords_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_keywords_type0 getGBBlock_keywords(){
                               return localGBBlock_keywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_keywords
                               */
                               public void setGBBlock_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_keywords_type0 param){
                            localGBBlock_keywordsTracker = param != null;
                                   
                                            this.localGBBlock_keywords=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_origin
                        */

                        
                                    protected java.lang.String localGBBlock_origin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_originTracker = false ;

                           public boolean isGBBlock_originSpecified(){
                               return localGBBlock_originTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBBlock_origin(){
                               return localGBBlock_origin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_origin
                               */
                               public void setGBBlock_origin(java.lang.String param){
                            localGBBlock_originTracker = param != null;
                                   
                                            this.localGBBlock_origin=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_date
                        */

                        
                                    protected java.lang.String localGBBlock_date ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_dateTracker = false ;

                           public boolean isGBBlock_dateSpecified(){
                               return localGBBlock_dateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBBlock_date(){
                               return localGBBlock_date;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_date
                               */
                               public void setGBBlock_date(java.lang.String param){
                            localGBBlock_dateTracker = param != null;
                                   
                                            this.localGBBlock_date=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_entryDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_entryDate_type0 localGBBlock_entryDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_entryDateTracker = false ;

                           public boolean isGBBlock_entryDateSpecified(){
                               return localGBBlock_entryDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_entryDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_entryDate_type0 getGBBlock_entryDate(){
                               return localGBBlock_entryDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_entryDate
                               */
                               public void setGBBlock_entryDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_entryDate_type0 param){
                            localGBBlock_entryDateTracker = param != null;
                                   
                                            this.localGBBlock_entryDate=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_div
                        */

                        
                                    protected java.lang.String localGBBlock_div ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_divTracker = false ;

                           public boolean isGBBlock_divSpecified(){
                               return localGBBlock_divTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBBlock_div(){
                               return localGBBlock_div;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_div
                               */
                               public void setGBBlock_div(java.lang.String param){
                            localGBBlock_divTracker = param != null;
                                   
                                            this.localGBBlock_div=param;
                                    

                               }
                            

                        /**
                        * field for GBBlock_taxonomy
                        */

                        
                                    protected java.lang.String localGBBlock_taxonomy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBBlock_taxonomyTracker = false ;

                           public boolean isGBBlock_taxonomySpecified(){
                               return localGBBlock_taxonomyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBBlock_taxonomy(){
                               return localGBBlock_taxonomy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBBlock_taxonomy
                               */
                               public void setGBBlock_taxonomy(java.lang.String param){
                            localGBBlock_taxonomyTracker = param != null;
                                   
                                            this.localGBBlock_taxonomy=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":GB-block_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GB-block_type0",
                           xmlWriter);
                   }

               
                   }
                if (localGBBlock_extraAccessionsTracker){
                                            if (localGBBlock_extraAccessions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GB-block_extra-accessions cannot be null!!");
                                            }
                                           localGBBlock_extraAccessions.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_extra-accessions"),
                                               xmlWriter);
                                        } if (localGBBlock_sourceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "GB-block_source", xmlWriter);
                             

                                          if (localGBBlock_source==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GB-block_source cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBBlock_source);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBBlock_keywordsTracker){
                                            if (localGBBlock_keywords==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GB-block_keywords cannot be null!!");
                                            }
                                           localGBBlock_keywords.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_keywords"),
                                               xmlWriter);
                                        } if (localGBBlock_originTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "GB-block_origin", xmlWriter);
                             

                                          if (localGBBlock_origin==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GB-block_origin cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBBlock_origin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBBlock_dateTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "GB-block_date", xmlWriter);
                             

                                          if (localGBBlock_date==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GB-block_date cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBBlock_date);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBBlock_entryDateTracker){
                                            if (localGBBlock_entryDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GB-block_entry-date cannot be null!!");
                                            }
                                           localGBBlock_entryDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_entry-date"),
                                               xmlWriter);
                                        } if (localGBBlock_divTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "GB-block_div", xmlWriter);
                             

                                          if (localGBBlock_div==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GB-block_div cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBBlock_div);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBBlock_taxonomyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "GB-block_taxonomy", xmlWriter);
                             

                                          if (localGBBlock_taxonomy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GB-block_taxonomy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBBlock_taxonomy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene")){
                return "ns1";
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

                 if (localGBBlock_extraAccessionsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_extra-accessions"));
                            
                            
                                    if (localGBBlock_extraAccessions==null){
                                         throw new org.apache.axis2.databinding.ADBException("GB-block_extra-accessions cannot be null!!");
                                    }
                                    elementList.add(localGBBlock_extraAccessions);
                                } if (localGBBlock_sourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_source"));
                                 
                                        if (localGBBlock_source != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBBlock_source));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GB-block_source cannot be null!!");
                                        }
                                    } if (localGBBlock_keywordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_keywords"));
                            
                            
                                    if (localGBBlock_keywords==null){
                                         throw new org.apache.axis2.databinding.ADBException("GB-block_keywords cannot be null!!");
                                    }
                                    elementList.add(localGBBlock_keywords);
                                } if (localGBBlock_originTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_origin"));
                                 
                                        if (localGBBlock_origin != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBBlock_origin));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GB-block_origin cannot be null!!");
                                        }
                                    } if (localGBBlock_dateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_date"));
                                 
                                        if (localGBBlock_date != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBBlock_date));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GB-block_date cannot be null!!");
                                        }
                                    } if (localGBBlock_entryDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_entry-date"));
                            
                            
                                    if (localGBBlock_entryDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("GB-block_entry-date cannot be null!!");
                                    }
                                    elementList.add(localGBBlock_entryDate);
                                } if (localGBBlock_divTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_div"));
                                 
                                        if (localGBBlock_div != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBBlock_div));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GB-block_div cannot be null!!");
                                        }
                                    } if (localGBBlock_taxonomyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "GB-block_taxonomy"));
                                 
                                        if (localGBBlock_taxonomy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBBlock_taxonomy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GB-block_taxonomy cannot be null!!");
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
        public static GBBlock_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GBBlock_type0 object =
                new GBBlock_type0();

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
                    
                            if (!"GB-block_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GBBlock_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_extra-accessions").equals(reader.getName())){
                                
                                                object.setGBBlock_extraAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_extraAccessions_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_source").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GB-block_source" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBBlock_source(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_keywords").equals(reader.getName())){
                                
                                                object.setGBBlock_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_keywords_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_origin").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GB-block_origin" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBBlock_origin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_date").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GB-block_date" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBBlock_date(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_entry-date").equals(reader.getName())){
                                
                                                object.setGBBlock_entryDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GBBlock_entryDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_div").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GB-block_div" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBBlock_div(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","GB-block_taxonomy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GB-block_taxonomy" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBBlock_taxonomy(
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
           
    