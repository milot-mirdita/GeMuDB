
/**
 * GBReference_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  GBReference_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GBReference_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GBReference_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GBReference_reference
                        */

                        
                                    protected java.lang.String localGBReference_reference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBReference_reference(){
                               return localGBReference_reference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_reference
                               */
                               public void setGBReference_reference(java.lang.String param){
                            
                                            this.localGBReference_reference=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_position
                        */

                        
                                    protected java.lang.String localGBReference_position ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_positionTracker = false ;

                           public boolean isGBReference_positionSpecified(){
                               return localGBReference_positionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBReference_position(){
                               return localGBReference_position;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_position
                               */
                               public void setGBReference_position(java.lang.String param){
                            localGBReference_positionTracker = param != null;
                                   
                                            this.localGBReference_position=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_authors
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_authors_type0 localGBReference_authors ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_authorsTracker = false ;

                           public boolean isGBReference_authorsSpecified(){
                               return localGBReference_authorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_authors_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_authors_type0 getGBReference_authors(){
                               return localGBReference_authors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_authors
                               */
                               public void setGBReference_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_authors_type0 param){
                            localGBReference_authorsTracker = param != null;
                                   
                                            this.localGBReference_authors=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_consortium
                        */

                        
                                    protected java.lang.String localGBReference_consortium ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_consortiumTracker = false ;

                           public boolean isGBReference_consortiumSpecified(){
                               return localGBReference_consortiumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBReference_consortium(){
                               return localGBReference_consortium;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_consortium
                               */
                               public void setGBReference_consortium(java.lang.String param){
                            localGBReference_consortiumTracker = param != null;
                                   
                                            this.localGBReference_consortium=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_title
                        */

                        
                                    protected java.lang.String localGBReference_title ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_titleTracker = false ;

                           public boolean isGBReference_titleSpecified(){
                               return localGBReference_titleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBReference_title(){
                               return localGBReference_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_title
                               */
                               public void setGBReference_title(java.lang.String param){
                            localGBReference_titleTracker = param != null;
                                   
                                            this.localGBReference_title=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_journal
                        */

                        
                                    protected java.lang.String localGBReference_journal ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBReference_journal(){
                               return localGBReference_journal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_journal
                               */
                               public void setGBReference_journal(java.lang.String param){
                            
                                            this.localGBReference_journal=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_xref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_xref_type0 localGBReference_xref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_xrefTracker = false ;

                           public boolean isGBReference_xrefSpecified(){
                               return localGBReference_xrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_xref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_xref_type0 getGBReference_xref(){
                               return localGBReference_xref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_xref
                               */
                               public void setGBReference_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_xref_type0 param){
                            localGBReference_xrefTracker = param != null;
                                   
                                            this.localGBReference_xref=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_pubmed
                        */

                        
                                    protected java.math.BigInteger localGBReference_pubmed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_pubmedTracker = false ;

                           public boolean isGBReference_pubmedSpecified(){
                               return localGBReference_pubmedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGBReference_pubmed(){
                               return localGBReference_pubmed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_pubmed
                               */
                               public void setGBReference_pubmed(java.math.BigInteger param){
                            localGBReference_pubmedTracker = param != null;
                                   
                                            this.localGBReference_pubmed=param;
                                    

                               }
                            

                        /**
                        * field for GBReference_remark
                        */

                        
                                    protected java.lang.String localGBReference_remark ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBReference_remarkTracker = false ;

                           public boolean isGBReference_remarkSpecified(){
                               return localGBReference_remarkTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBReference_remark(){
                               return localGBReference_remark;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBReference_remark
                               */
                               public void setGBReference_remark(java.lang.String param){
                            localGBReference_remarkTracker = param != null;
                                   
                                            this.localGBReference_remark=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":GBReference_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GBReference_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_reference", xmlWriter);
                             

                                          if (localGBReference_reference==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_reference cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBReference_reference);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBReference_positionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_position", xmlWriter);
                             

                                          if (localGBReference_position==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_position cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBReference_position);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBReference_authorsTracker){
                                            if (localGBReference_authors==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBReference_authors cannot be null!!");
                                            }
                                           localGBReference_authors.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_authors"),
                                               xmlWriter);
                                        } if (localGBReference_consortiumTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_consortium", xmlWriter);
                             

                                          if (localGBReference_consortium==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_consortium cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBReference_consortium);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBReference_titleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_title", xmlWriter);
                             

                                          if (localGBReference_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBReference_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_journal", xmlWriter);
                             

                                          if (localGBReference_journal==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_journal cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBReference_journal);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBReference_xrefTracker){
                                            if (localGBReference_xref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBReference_xref cannot be null!!");
                                            }
                                           localGBReference_xref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_xref"),
                                               xmlWriter);
                                        } if (localGBReference_pubmedTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_pubmed", xmlWriter);
                             

                                          if (localGBReference_pubmed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_pubmed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_pubmed));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBReference_remarkTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBReference_remark", xmlWriter);
                             

                                          if (localGBReference_remark==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBReference_remark cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBReference_remark);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq")){
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_reference"));
                                 
                                        if (localGBReference_reference != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_reference));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_reference cannot be null!!");
                                        }
                                     if (localGBReference_positionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_position"));
                                 
                                        if (localGBReference_position != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_position));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_position cannot be null!!");
                                        }
                                    } if (localGBReference_authorsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_authors"));
                            
                            
                                    if (localGBReference_authors==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBReference_authors cannot be null!!");
                                    }
                                    elementList.add(localGBReference_authors);
                                } if (localGBReference_consortiumTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_consortium"));
                                 
                                        if (localGBReference_consortium != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_consortium));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_consortium cannot be null!!");
                                        }
                                    } if (localGBReference_titleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_title"));
                                 
                                        if (localGBReference_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_title cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_journal"));
                                 
                                        if (localGBReference_journal != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_journal));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_journal cannot be null!!");
                                        }
                                     if (localGBReference_xrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_xref"));
                            
                            
                                    if (localGBReference_xref==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBReference_xref cannot be null!!");
                                    }
                                    elementList.add(localGBReference_xref);
                                } if (localGBReference_pubmedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_pubmed"));
                                 
                                        if (localGBReference_pubmed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_pubmed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_pubmed cannot be null!!");
                                        }
                                    } if (localGBReference_remarkTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBReference_remark"));
                                 
                                        if (localGBReference_remark != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBReference_remark));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBReference_remark cannot be null!!");
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
        public static GBReference_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GBReference_type0 object =
                new GBReference_type0();

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
                    
                            if (!"GBReference_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GBReference_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_reference").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_reference" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_reference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_position").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_position" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_position(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_authors").equals(reader.getName())){
                                
                                                object.setGBReference_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_authors_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_consortium").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_consortium" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_consortium(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_journal").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_journal" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_journal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_xref").equals(reader.getName())){
                                
                                                object.setGBReference_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBReference_xref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_pubmed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_pubmed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_pubmed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBReference_remark").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBReference_remark" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBReference_remark(
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
           
    