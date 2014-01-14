
/**
 * TSeq_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  TSeq_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TSeq_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TSeq_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for TSeq_seqtype
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.TSeq_seqtype_type0 localTSeq_seqtype ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.TSeq_seqtype_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.TSeq_seqtype_type0 getTSeq_seqtype(){
                               return localTSeq_seqtype;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_seqtype
                               */
                               public void setTSeq_seqtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.TSeq_seqtype_type0 param){
                            
                                            this.localTSeq_seqtype=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_gi
                        */

                        
                                    protected java.math.BigInteger localTSeq_gi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTSeq_giTracker = false ;

                           public boolean isTSeq_giSpecified(){
                               return localTSeq_giTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getTSeq_gi(){
                               return localTSeq_gi;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_gi
                               */
                               public void setTSeq_gi(java.math.BigInteger param){
                            localTSeq_giTracker = param != null;
                                   
                                            this.localTSeq_gi=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_accver
                        */

                        
                                    protected java.lang.String localTSeq_accver ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTSeq_accverTracker = false ;

                           public boolean isTSeq_accverSpecified(){
                               return localTSeq_accverTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTSeq_accver(){
                               return localTSeq_accver;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_accver
                               */
                               public void setTSeq_accver(java.lang.String param){
                            localTSeq_accverTracker = param != null;
                                   
                                            this.localTSeq_accver=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_sid
                        */

                        
                                    protected java.lang.String localTSeq_sid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTSeq_sidTracker = false ;

                           public boolean isTSeq_sidSpecified(){
                               return localTSeq_sidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTSeq_sid(){
                               return localTSeq_sid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_sid
                               */
                               public void setTSeq_sid(java.lang.String param){
                            localTSeq_sidTracker = param != null;
                                   
                                            this.localTSeq_sid=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_local
                        */

                        
                                    protected java.lang.String localTSeq_local ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTSeq_localTracker = false ;

                           public boolean isTSeq_localSpecified(){
                               return localTSeq_localTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTSeq_local(){
                               return localTSeq_local;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_local
                               */
                               public void setTSeq_local(java.lang.String param){
                            localTSeq_localTracker = param != null;
                                   
                                            this.localTSeq_local=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_taxid
                        */

                        
                                    protected java.math.BigInteger localTSeq_taxid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTSeq_taxidTracker = false ;

                           public boolean isTSeq_taxidSpecified(){
                               return localTSeq_taxidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getTSeq_taxid(){
                               return localTSeq_taxid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_taxid
                               */
                               public void setTSeq_taxid(java.math.BigInteger param){
                            localTSeq_taxidTracker = param != null;
                                   
                                            this.localTSeq_taxid=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_orgname
                        */

                        
                                    protected java.lang.String localTSeq_orgname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTSeq_orgnameTracker = false ;

                           public boolean isTSeq_orgnameSpecified(){
                               return localTSeq_orgnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTSeq_orgname(){
                               return localTSeq_orgname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_orgname
                               */
                               public void setTSeq_orgname(java.lang.String param){
                            localTSeq_orgnameTracker = param != null;
                                   
                                            this.localTSeq_orgname=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_defline
                        */

                        
                                    protected java.lang.String localTSeq_defline ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTSeq_defline(){
                               return localTSeq_defline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_defline
                               */
                               public void setTSeq_defline(java.lang.String param){
                            
                                            this.localTSeq_defline=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_length
                        */

                        
                                    protected java.math.BigInteger localTSeq_length ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getTSeq_length(){
                               return localTSeq_length;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_length
                               */
                               public void setTSeq_length(java.math.BigInteger param){
                            
                                            this.localTSeq_length=param;
                                    

                               }
                            

                        /**
                        * field for TSeq_sequence
                        */

                        
                                    protected java.lang.String localTSeq_sequence ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTSeq_sequence(){
                               return localTSeq_sequence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TSeq_sequence
                               */
                               public void setTSeq_sequence(java.lang.String param){
                            
                                            this.localTSeq_sequence=param;
                                    

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
                           namespacePrefix+":TSeq_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TSeq_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localTSeq_seqtype==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TSeq_seqtype cannot be null!!");
                                            }
                                           localTSeq_seqtype.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_seqtype"),
                                               xmlWriter);
                                         if (localTSeq_giTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_gi", xmlWriter);
                             

                                          if (localTSeq_gi==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_gi cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_gi));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTSeq_accverTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_accver", xmlWriter);
                             

                                          if (localTSeq_accver==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_accver cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTSeq_accver);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTSeq_sidTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_sid", xmlWriter);
                             

                                          if (localTSeq_sid==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_sid cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTSeq_sid);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTSeq_localTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_local", xmlWriter);
                             

                                          if (localTSeq_local==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_local cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTSeq_local);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTSeq_taxidTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_taxid", xmlWriter);
                             

                                          if (localTSeq_taxid==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_taxid cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_taxid));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTSeq_orgnameTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_orgname", xmlWriter);
                             

                                          if (localTSeq_orgname==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_orgname cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTSeq_orgname);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_defline", xmlWriter);
                             

                                          if (localTSeq_defline==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_defline cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTSeq_defline);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_length", xmlWriter);
                             

                                          if (localTSeq_length==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_length cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_length));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "TSeq_sequence", xmlWriter);
                             

                                          if (localTSeq_sequence==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TSeq_sequence cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTSeq_sequence);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                                                      "TSeq_seqtype"));
                            
                            
                                    if (localTSeq_seqtype==null){
                                         throw new org.apache.axis2.databinding.ADBException("TSeq_seqtype cannot be null!!");
                                    }
                                    elementList.add(localTSeq_seqtype);
                                 if (localTSeq_giTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_gi"));
                                 
                                        if (localTSeq_gi != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_gi));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_gi cannot be null!!");
                                        }
                                    } if (localTSeq_accverTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_accver"));
                                 
                                        if (localTSeq_accver != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_accver));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_accver cannot be null!!");
                                        }
                                    } if (localTSeq_sidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_sid"));
                                 
                                        if (localTSeq_sid != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_sid));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_sid cannot be null!!");
                                        }
                                    } if (localTSeq_localTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_local"));
                                 
                                        if (localTSeq_local != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_local));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_local cannot be null!!");
                                        }
                                    } if (localTSeq_taxidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_taxid"));
                                 
                                        if (localTSeq_taxid != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_taxid));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_taxid cannot be null!!");
                                        }
                                    } if (localTSeq_orgnameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_orgname"));
                                 
                                        if (localTSeq_orgname != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_orgname));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_orgname cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_defline"));
                                 
                                        if (localTSeq_defline != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_defline));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_defline cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_length"));
                                 
                                        if (localTSeq_length != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_length));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_length cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "TSeq_sequence"));
                                 
                                        if (localTSeq_sequence != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTSeq_sequence));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TSeq_sequence cannot be null!!");
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
        public static TSeq_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TSeq_type0 object =
                new TSeq_type0();

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
                    
                            if (!"TSeq_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TSeq_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_seqtype").equals(reader.getName())){
                                
                                                object.setTSeq_seqtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.TSeq_seqtype_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_gi").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_gi" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_gi(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_accver").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_accver" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_accver(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_sid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_sid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_sid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_local").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_local" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_local(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_taxid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_taxid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_taxid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_orgname").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_orgname" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_orgname(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_defline").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_defline" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_defline(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_length").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_length" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_length(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","TSeq_sequence").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TSeq_sequence" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTSeq_sequence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    