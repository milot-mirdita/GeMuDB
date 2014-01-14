
/**
 * GBAltSeqItem_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  GBAltSeqItem_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GBAltSeqItem_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GBAltSeqItem_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GBAltSeqItem_interval
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_interval_type0 localGBAltSeqItem_interval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_intervalTracker = false ;

                           public boolean isGBAltSeqItem_intervalSpecified(){
                               return localGBAltSeqItem_intervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_interval_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_interval_type0 getGBAltSeqItem_interval(){
                               return localGBAltSeqItem_interval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_interval
                               */
                               public void setGBAltSeqItem_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_interval_type0 param){
                            localGBAltSeqItem_intervalTracker = param != null;
                                   
                                            this.localGBAltSeqItem_interval=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_isgap
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_isgap_type0 localGBAltSeqItem_isgap ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_isgapTracker = false ;

                           public boolean isGBAltSeqItem_isgapSpecified(){
                               return localGBAltSeqItem_isgapTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_isgap_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_isgap_type0 getGBAltSeqItem_isgap(){
                               return localGBAltSeqItem_isgap;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_isgap
                               */
                               public void setGBAltSeqItem_isgap(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_isgap_type0 param){
                            localGBAltSeqItem_isgapTracker = param != null;
                                   
                                            this.localGBAltSeqItem_isgap=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_gapLength
                        */

                        
                                    protected java.math.BigInteger localGBAltSeqItem_gapLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_gapLengthTracker = false ;

                           public boolean isGBAltSeqItem_gapLengthSpecified(){
                               return localGBAltSeqItem_gapLengthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGBAltSeqItem_gapLength(){
                               return localGBAltSeqItem_gapLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_gapLength
                               */
                               public void setGBAltSeqItem_gapLength(java.math.BigInteger param){
                            localGBAltSeqItem_gapLengthTracker = param != null;
                                   
                                            this.localGBAltSeqItem_gapLength=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_gapType
                        */

                        
                                    protected java.lang.String localGBAltSeqItem_gapType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_gapTypeTracker = false ;

                           public boolean isGBAltSeqItem_gapTypeSpecified(){
                               return localGBAltSeqItem_gapTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBAltSeqItem_gapType(){
                               return localGBAltSeqItem_gapType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_gapType
                               */
                               public void setGBAltSeqItem_gapType(java.lang.String param){
                            localGBAltSeqItem_gapTypeTracker = param != null;
                                   
                                            this.localGBAltSeqItem_gapType=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_gapLinkage
                        */

                        
                                    protected java.lang.String localGBAltSeqItem_gapLinkage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_gapLinkageTracker = false ;

                           public boolean isGBAltSeqItem_gapLinkageSpecified(){
                               return localGBAltSeqItem_gapLinkageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBAltSeqItem_gapLinkage(){
                               return localGBAltSeqItem_gapLinkage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_gapLinkage
                               */
                               public void setGBAltSeqItem_gapLinkage(java.lang.String param){
                            localGBAltSeqItem_gapLinkageTracker = param != null;
                                   
                                            this.localGBAltSeqItem_gapLinkage=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_gapComment
                        */

                        
                                    protected java.lang.String localGBAltSeqItem_gapComment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_gapCommentTracker = false ;

                           public boolean isGBAltSeqItem_gapCommentSpecified(){
                               return localGBAltSeqItem_gapCommentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBAltSeqItem_gapComment(){
                               return localGBAltSeqItem_gapComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_gapComment
                               */
                               public void setGBAltSeqItem_gapComment(java.lang.String param){
                            localGBAltSeqItem_gapCommentTracker = param != null;
                                   
                                            this.localGBAltSeqItem_gapComment=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_firstAccn
                        */

                        
                                    protected java.lang.String localGBAltSeqItem_firstAccn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_firstAccnTracker = false ;

                           public boolean isGBAltSeqItem_firstAccnSpecified(){
                               return localGBAltSeqItem_firstAccnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBAltSeqItem_firstAccn(){
                               return localGBAltSeqItem_firstAccn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_firstAccn
                               */
                               public void setGBAltSeqItem_firstAccn(java.lang.String param){
                            localGBAltSeqItem_firstAccnTracker = param != null;
                                   
                                            this.localGBAltSeqItem_firstAccn=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_lastAccn
                        */

                        
                                    protected java.lang.String localGBAltSeqItem_lastAccn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_lastAccnTracker = false ;

                           public boolean isGBAltSeqItem_lastAccnSpecified(){
                               return localGBAltSeqItem_lastAccnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBAltSeqItem_lastAccn(){
                               return localGBAltSeqItem_lastAccn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_lastAccn
                               */
                               public void setGBAltSeqItem_lastAccn(java.lang.String param){
                            localGBAltSeqItem_lastAccnTracker = param != null;
                                   
                                            this.localGBAltSeqItem_lastAccn=param;
                                    

                               }
                            

                        /**
                        * field for GBAltSeqItem_value
                        */

                        
                                    protected java.lang.String localGBAltSeqItem_value ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBAltSeqItem_valueTracker = false ;

                           public boolean isGBAltSeqItem_valueSpecified(){
                               return localGBAltSeqItem_valueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBAltSeqItem_value(){
                               return localGBAltSeqItem_value;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBAltSeqItem_value
                               */
                               public void setGBAltSeqItem_value(java.lang.String param){
                            localGBAltSeqItem_valueTracker = param != null;
                                   
                                            this.localGBAltSeqItem_value=param;
                                    

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
                           namespacePrefix+":GBAltSeqItem_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GBAltSeqItem_type0",
                           xmlWriter);
                   }

               
                   }
                if (localGBAltSeqItem_intervalTracker){
                                            if (localGBAltSeqItem_interval==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_interval cannot be null!!");
                                            }
                                           localGBAltSeqItem_interval.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_interval"),
                                               xmlWriter);
                                        } if (localGBAltSeqItem_isgapTracker){
                                            if (localGBAltSeqItem_isgap==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_isgap cannot be null!!");
                                            }
                                           localGBAltSeqItem_isgap.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_isgap"),
                                               xmlWriter);
                                        } if (localGBAltSeqItem_gapLengthTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_gap-length", xmlWriter);
                             

                                          if (localGBAltSeqItem_gapLength==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-length cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_gapLength));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBAltSeqItem_gapTypeTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_gap-type", xmlWriter);
                             

                                          if (localGBAltSeqItem_gapType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-type cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBAltSeqItem_gapType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBAltSeqItem_gapLinkageTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_gap-linkage", xmlWriter);
                             

                                          if (localGBAltSeqItem_gapLinkage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-linkage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBAltSeqItem_gapLinkage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBAltSeqItem_gapCommentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_gap-comment", xmlWriter);
                             

                                          if (localGBAltSeqItem_gapComment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBAltSeqItem_gapComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBAltSeqItem_firstAccnTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_first-accn", xmlWriter);
                             

                                          if (localGBAltSeqItem_firstAccn==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_first-accn cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBAltSeqItem_firstAccn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBAltSeqItem_lastAccnTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_last-accn", xmlWriter);
                             

                                          if (localGBAltSeqItem_lastAccn==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_last-accn cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBAltSeqItem_lastAccn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBAltSeqItem_valueTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBAltSeqItem_value", xmlWriter);
                             

                                          if (localGBAltSeqItem_value==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_value cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBAltSeqItem_value);
                                            
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

                 if (localGBAltSeqItem_intervalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_interval"));
                            
                            
                                    if (localGBAltSeqItem_interval==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_interval cannot be null!!");
                                    }
                                    elementList.add(localGBAltSeqItem_interval);
                                } if (localGBAltSeqItem_isgapTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_isgap"));
                            
                            
                                    if (localGBAltSeqItem_isgap==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_isgap cannot be null!!");
                                    }
                                    elementList.add(localGBAltSeqItem_isgap);
                                } if (localGBAltSeqItem_gapLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_gap-length"));
                                 
                                        if (localGBAltSeqItem_gapLength != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_gapLength));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-length cannot be null!!");
                                        }
                                    } if (localGBAltSeqItem_gapTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_gap-type"));
                                 
                                        if (localGBAltSeqItem_gapType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_gapType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-type cannot be null!!");
                                        }
                                    } if (localGBAltSeqItem_gapLinkageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_gap-linkage"));
                                 
                                        if (localGBAltSeqItem_gapLinkage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_gapLinkage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-linkage cannot be null!!");
                                        }
                                    } if (localGBAltSeqItem_gapCommentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_gap-comment"));
                                 
                                        if (localGBAltSeqItem_gapComment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_gapComment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_gap-comment cannot be null!!");
                                        }
                                    } if (localGBAltSeqItem_firstAccnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_first-accn"));
                                 
                                        if (localGBAltSeqItem_firstAccn != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_firstAccn));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_first-accn cannot be null!!");
                                        }
                                    } if (localGBAltSeqItem_lastAccnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_last-accn"));
                                 
                                        if (localGBAltSeqItem_lastAccn != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_lastAccn));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_last-accn cannot be null!!");
                                        }
                                    } if (localGBAltSeqItem_valueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBAltSeqItem_value"));
                                 
                                        if (localGBAltSeqItem_value != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBAltSeqItem_value));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBAltSeqItem_value cannot be null!!");
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
        public static GBAltSeqItem_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GBAltSeqItem_type0 object =
                new GBAltSeqItem_type0();

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
                    
                            if (!"GBAltSeqItem_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GBAltSeqItem_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_interval").equals(reader.getName())){
                                
                                                object.setGBAltSeqItem_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_interval_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_isgap").equals(reader.getName())){
                                
                                                object.setGBAltSeqItem_isgap(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBAltSeqItem_isgap_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_gap-length").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_gap-length" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_gapLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_gap-type").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_gap-type" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_gapType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_gap-linkage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_gap-linkage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_gapLinkage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_gap-comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_gap-comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_gapComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_first-accn").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_first-accn" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_firstAccn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_last-accn").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_last-accn" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_lastAccn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBAltSeqItem_value").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBAltSeqItem_value" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBAltSeqItem_value(
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
           
    