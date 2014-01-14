
/**
 * Cdregion_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Cdregion_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Cdregion_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Cdregion_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Cdregion_orf
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_orf_type0 localCdregion_orf ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_orfTracker = false ;

                           public boolean isCdregion_orfSpecified(){
                               return localCdregion_orfTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_orf_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_orf_type0 getCdregion_orf(){
                               return localCdregion_orf;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_orf
                               */
                               public void setCdregion_orf(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_orf_type0 param){
                            localCdregion_orfTracker = param != null;
                                   
                                            this.localCdregion_orf=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_frame
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_frame_type0 localCdregion_frame ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_frameTracker = false ;

                           public boolean isCdregion_frameSpecified(){
                               return localCdregion_frameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_frame_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_frame_type0 getCdregion_frame(){
                               return localCdregion_frame;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_frame
                               */
                               public void setCdregion_frame(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_frame_type0 param){
                            localCdregion_frameTracker = param != null;
                                   
                                            this.localCdregion_frame=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_conflict
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_conflict_type0 localCdregion_conflict ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_conflictTracker = false ;

                           public boolean isCdregion_conflictSpecified(){
                               return localCdregion_conflictTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_conflict_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_conflict_type0 getCdregion_conflict(){
                               return localCdregion_conflict;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_conflict
                               */
                               public void setCdregion_conflict(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_conflict_type0 param){
                            localCdregion_conflictTracker = param != null;
                                   
                                            this.localCdregion_conflict=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_gaps
                        */

                        
                                    protected java.math.BigInteger localCdregion_gaps ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_gapsTracker = false ;

                           public boolean isCdregion_gapsSpecified(){
                               return localCdregion_gapsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getCdregion_gaps(){
                               return localCdregion_gaps;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_gaps
                               */
                               public void setCdregion_gaps(java.math.BigInteger param){
                            localCdregion_gapsTracker = param != null;
                                   
                                            this.localCdregion_gaps=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_mismatch
                        */

                        
                                    protected java.math.BigInteger localCdregion_mismatch ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_mismatchTracker = false ;

                           public boolean isCdregion_mismatchSpecified(){
                               return localCdregion_mismatchTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getCdregion_mismatch(){
                               return localCdregion_mismatch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_mismatch
                               */
                               public void setCdregion_mismatch(java.math.BigInteger param){
                            localCdregion_mismatchTracker = param != null;
                                   
                                            this.localCdregion_mismatch=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_code
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_code_type0 localCdregion_code ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_codeTracker = false ;

                           public boolean isCdregion_codeSpecified(){
                               return localCdregion_codeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_code_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_code_type0 getCdregion_code(){
                               return localCdregion_code;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_code
                               */
                               public void setCdregion_code(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_code_type0 param){
                            localCdregion_codeTracker = param != null;
                                   
                                            this.localCdregion_code=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_codeBreak
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_codeBreak_type0 localCdregion_codeBreak ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_codeBreakTracker = false ;

                           public boolean isCdregion_codeBreakSpecified(){
                               return localCdregion_codeBreakTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_codeBreak_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_codeBreak_type0 getCdregion_codeBreak(){
                               return localCdregion_codeBreak;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_codeBreak
                               */
                               public void setCdregion_codeBreak(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_codeBreak_type0 param){
                            localCdregion_codeBreakTracker = param != null;
                                   
                                            this.localCdregion_codeBreak=param;
                                    

                               }
                            

                        /**
                        * field for Cdregion_stops
                        */

                        
                                    protected java.math.BigInteger localCdregion_stops ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdregion_stopsTracker = false ;

                           public boolean isCdregion_stopsSpecified(){
                               return localCdregion_stopsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getCdregion_stops(){
                               return localCdregion_stops;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cdregion_stops
                               */
                               public void setCdregion_stops(java.math.BigInteger param){
                            localCdregion_stopsTracker = param != null;
                                   
                                            this.localCdregion_stops=param;
                                    

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
                           namespacePrefix+":Cdregion_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Cdregion_type0",
                           xmlWriter);
                   }

               
                   }
                if (localCdregion_orfTracker){
                                            if (localCdregion_orf==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cdregion_orf cannot be null!!");
                                            }
                                           localCdregion_orf.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_orf"),
                                               xmlWriter);
                                        } if (localCdregion_frameTracker){
                                            if (localCdregion_frame==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cdregion_frame cannot be null!!");
                                            }
                                           localCdregion_frame.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_frame"),
                                               xmlWriter);
                                        } if (localCdregion_conflictTracker){
                                            if (localCdregion_conflict==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cdregion_conflict cannot be null!!");
                                            }
                                           localCdregion_conflict.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_conflict"),
                                               xmlWriter);
                                        } if (localCdregion_gapsTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cdregion_gaps", xmlWriter);
                             

                                          if (localCdregion_gaps==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cdregion_gaps cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCdregion_gaps));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCdregion_mismatchTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cdregion_mismatch", xmlWriter);
                             

                                          if (localCdregion_mismatch==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cdregion_mismatch cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCdregion_mismatch));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCdregion_codeTracker){
                                            if (localCdregion_code==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cdregion_code cannot be null!!");
                                            }
                                           localCdregion_code.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_code"),
                                               xmlWriter);
                                        } if (localCdregion_codeBreakTracker){
                                            if (localCdregion_codeBreak==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cdregion_code-break cannot be null!!");
                                            }
                                           localCdregion_codeBreak.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_code-break"),
                                               xmlWriter);
                                        } if (localCdregion_stopsTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cdregion_stops", xmlWriter);
                             

                                          if (localCdregion_stops==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cdregion_stops cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCdregion_stops));
                                            
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

                 if (localCdregion_orfTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_orf"));
                            
                            
                                    if (localCdregion_orf==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cdregion_orf cannot be null!!");
                                    }
                                    elementList.add(localCdregion_orf);
                                } if (localCdregion_frameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_frame"));
                            
                            
                                    if (localCdregion_frame==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cdregion_frame cannot be null!!");
                                    }
                                    elementList.add(localCdregion_frame);
                                } if (localCdregion_conflictTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_conflict"));
                            
                            
                                    if (localCdregion_conflict==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cdregion_conflict cannot be null!!");
                                    }
                                    elementList.add(localCdregion_conflict);
                                } if (localCdregion_gapsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_gaps"));
                                 
                                        if (localCdregion_gaps != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCdregion_gaps));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cdregion_gaps cannot be null!!");
                                        }
                                    } if (localCdregion_mismatchTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_mismatch"));
                                 
                                        if (localCdregion_mismatch != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCdregion_mismatch));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cdregion_mismatch cannot be null!!");
                                        }
                                    } if (localCdregion_codeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_code"));
                            
                            
                                    if (localCdregion_code==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cdregion_code cannot be null!!");
                                    }
                                    elementList.add(localCdregion_code);
                                } if (localCdregion_codeBreakTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_code-break"));
                            
                            
                                    if (localCdregion_codeBreak==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cdregion_code-break cannot be null!!");
                                    }
                                    elementList.add(localCdregion_codeBreak);
                                } if (localCdregion_stopsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cdregion_stops"));
                                 
                                        if (localCdregion_stops != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCdregion_stops));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cdregion_stops cannot be null!!");
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
        public static Cdregion_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Cdregion_type0 object =
                new Cdregion_type0();

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
                    
                            if (!"Cdregion_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Cdregion_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_orf").equals(reader.getName())){
                                
                                                object.setCdregion_orf(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_orf_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_frame").equals(reader.getName())){
                                
                                                object.setCdregion_frame(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_frame_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_conflict").equals(reader.getName())){
                                
                                                object.setCdregion_conflict(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_conflict_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_gaps").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cdregion_gaps" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCdregion_gaps(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_mismatch").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cdregion_mismatch" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCdregion_mismatch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_code").equals(reader.getName())){
                                
                                                object.setCdregion_code(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_code_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_code-break").equals(reader.getName())){
                                
                                                object.setCdregion_codeBreak(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Cdregion_codeBreak_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cdregion_stops").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cdregion_stops" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCdregion_stops(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
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
           
    