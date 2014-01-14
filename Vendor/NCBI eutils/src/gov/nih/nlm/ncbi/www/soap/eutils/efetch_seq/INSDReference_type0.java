
/**
 * INSDReference_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  INSDReference_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class INSDReference_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = INSDReference_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for INSDReference_reference
                        */

                        
                                    protected java.lang.String localINSDReference_reference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDReference_reference(){
                               return localINSDReference_reference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_reference
                               */
                               public void setINSDReference_reference(java.lang.String param){
                            
                                            this.localINSDReference_reference=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_position
                        */

                        
                                    protected java.lang.String localINSDReference_position ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_positionTracker = false ;

                           public boolean isINSDReference_positionSpecified(){
                               return localINSDReference_positionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDReference_position(){
                               return localINSDReference_position;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_position
                               */
                               public void setINSDReference_position(java.lang.String param){
                            localINSDReference_positionTracker = param != null;
                                   
                                            this.localINSDReference_position=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_authors
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_authors_type0 localINSDReference_authors ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_authorsTracker = false ;

                           public boolean isINSDReference_authorsSpecified(){
                               return localINSDReference_authorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_authors_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_authors_type0 getINSDReference_authors(){
                               return localINSDReference_authors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_authors
                               */
                               public void setINSDReference_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_authors_type0 param){
                            localINSDReference_authorsTracker = param != null;
                                   
                                            this.localINSDReference_authors=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_consortium
                        */

                        
                                    protected java.lang.String localINSDReference_consortium ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_consortiumTracker = false ;

                           public boolean isINSDReference_consortiumSpecified(){
                               return localINSDReference_consortiumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDReference_consortium(){
                               return localINSDReference_consortium;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_consortium
                               */
                               public void setINSDReference_consortium(java.lang.String param){
                            localINSDReference_consortiumTracker = param != null;
                                   
                                            this.localINSDReference_consortium=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_title
                        */

                        
                                    protected java.lang.String localINSDReference_title ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_titleTracker = false ;

                           public boolean isINSDReference_titleSpecified(){
                               return localINSDReference_titleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDReference_title(){
                               return localINSDReference_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_title
                               */
                               public void setINSDReference_title(java.lang.String param){
                            localINSDReference_titleTracker = param != null;
                                   
                                            this.localINSDReference_title=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_journal
                        */

                        
                                    protected java.lang.String localINSDReference_journal ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDReference_journal(){
                               return localINSDReference_journal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_journal
                               */
                               public void setINSDReference_journal(java.lang.String param){
                            
                                            this.localINSDReference_journal=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_xref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_xref_type0 localINSDReference_xref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_xrefTracker = false ;

                           public boolean isINSDReference_xrefSpecified(){
                               return localINSDReference_xrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_xref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_xref_type0 getINSDReference_xref(){
                               return localINSDReference_xref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_xref
                               */
                               public void setINSDReference_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_xref_type0 param){
                            localINSDReference_xrefTracker = param != null;
                                   
                                            this.localINSDReference_xref=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_pubmed
                        */

                        
                                    protected java.math.BigInteger localINSDReference_pubmed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_pubmedTracker = false ;

                           public boolean isINSDReference_pubmedSpecified(){
                               return localINSDReference_pubmedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getINSDReference_pubmed(){
                               return localINSDReference_pubmed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_pubmed
                               */
                               public void setINSDReference_pubmed(java.math.BigInteger param){
                            localINSDReference_pubmedTracker = param != null;
                                   
                                            this.localINSDReference_pubmed=param;
                                    

                               }
                            

                        /**
                        * field for INSDReference_remark
                        */

                        
                                    protected java.lang.String localINSDReference_remark ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDReference_remarkTracker = false ;

                           public boolean isINSDReference_remarkSpecified(){
                               return localINSDReference_remarkTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDReference_remark(){
                               return localINSDReference_remark;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDReference_remark
                               */
                               public void setINSDReference_remark(java.lang.String param){
                            localINSDReference_remarkTracker = param != null;
                                   
                                            this.localINSDReference_remark=param;
                                    

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
                           namespacePrefix+":INSDReference_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "INSDReference_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_reference", xmlWriter);
                             

                                          if (localINSDReference_reference==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_reference cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDReference_reference);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localINSDReference_positionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_position", xmlWriter);
                             

                                          if (localINSDReference_position==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_position cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDReference_position);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDReference_authorsTracker){
                                            if (localINSDReference_authors==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDReference_authors cannot be null!!");
                                            }
                                           localINSDReference_authors.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_authors"),
                                               xmlWriter);
                                        } if (localINSDReference_consortiumTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_consortium", xmlWriter);
                             

                                          if (localINSDReference_consortium==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_consortium cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDReference_consortium);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDReference_titleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_title", xmlWriter);
                             

                                          if (localINSDReference_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDReference_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_journal", xmlWriter);
                             

                                          if (localINSDReference_journal==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_journal cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDReference_journal);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localINSDReference_xrefTracker){
                                            if (localINSDReference_xref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDReference_xref cannot be null!!");
                                            }
                                           localINSDReference_xref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_xref"),
                                               xmlWriter);
                                        } if (localINSDReference_pubmedTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_pubmed", xmlWriter);
                             

                                          if (localINSDReference_pubmed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_pubmed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_pubmed));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDReference_remarkTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDReference_remark", xmlWriter);
                             

                                          if (localINSDReference_remark==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDReference_remark cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDReference_remark);
                                            
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
                                                                      "INSDReference_reference"));
                                 
                                        if (localINSDReference_reference != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_reference));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_reference cannot be null!!");
                                        }
                                     if (localINSDReference_positionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_position"));
                                 
                                        if (localINSDReference_position != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_position));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_position cannot be null!!");
                                        }
                                    } if (localINSDReference_authorsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_authors"));
                            
                            
                                    if (localINSDReference_authors==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDReference_authors cannot be null!!");
                                    }
                                    elementList.add(localINSDReference_authors);
                                } if (localINSDReference_consortiumTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_consortium"));
                                 
                                        if (localINSDReference_consortium != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_consortium));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_consortium cannot be null!!");
                                        }
                                    } if (localINSDReference_titleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_title"));
                                 
                                        if (localINSDReference_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_title cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_journal"));
                                 
                                        if (localINSDReference_journal != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_journal));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_journal cannot be null!!");
                                        }
                                     if (localINSDReference_xrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_xref"));
                            
                            
                                    if (localINSDReference_xref==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDReference_xref cannot be null!!");
                                    }
                                    elementList.add(localINSDReference_xref);
                                } if (localINSDReference_pubmedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_pubmed"));
                                 
                                        if (localINSDReference_pubmed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_pubmed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_pubmed cannot be null!!");
                                        }
                                    } if (localINSDReference_remarkTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDReference_remark"));
                                 
                                        if (localINSDReference_remark != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDReference_remark));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDReference_remark cannot be null!!");
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
        public static INSDReference_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            INSDReference_type0 object =
                new INSDReference_type0();

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
                    
                            if (!"INSDReference_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (INSDReference_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_reference").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_reference" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_reference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_position").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_position" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_position(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_authors").equals(reader.getName())){
                                
                                                object.setINSDReference_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_authors_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_consortium").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_consortium" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_consortium(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_journal").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_journal" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_journal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_xref").equals(reader.getName())){
                                
                                                object.setINSDReference_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDReference_xref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_pubmed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_pubmed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_pubmed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDReference_remark").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDReference_remark" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDReference_remark(
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
           
    