
/**
 * INSDAltSeqItem_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  INSDAltSeqItem_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class INSDAltSeqItem_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = INSDAltSeqItem_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for INSDAltSeqItem_interval
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_interval_type0 localINSDAltSeqItem_interval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_intervalTracker = false ;

                           public boolean isINSDAltSeqItem_intervalSpecified(){
                               return localINSDAltSeqItem_intervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_interval_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_interval_type0 getINSDAltSeqItem_interval(){
                               return localINSDAltSeqItem_interval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_interval
                               */
                               public void setINSDAltSeqItem_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_interval_type0 param){
                            localINSDAltSeqItem_intervalTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_interval=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_isgap
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_isgap_type0 localINSDAltSeqItem_isgap ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_isgapTracker = false ;

                           public boolean isINSDAltSeqItem_isgapSpecified(){
                               return localINSDAltSeqItem_isgapTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_isgap_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_isgap_type0 getINSDAltSeqItem_isgap(){
                               return localINSDAltSeqItem_isgap;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_isgap
                               */
                               public void setINSDAltSeqItem_isgap(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_isgap_type0 param){
                            localINSDAltSeqItem_isgapTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_isgap=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_gapLength
                        */

                        
                                    protected java.math.BigInteger localINSDAltSeqItem_gapLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_gapLengthTracker = false ;

                           public boolean isINSDAltSeqItem_gapLengthSpecified(){
                               return localINSDAltSeqItem_gapLengthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getINSDAltSeqItem_gapLength(){
                               return localINSDAltSeqItem_gapLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_gapLength
                               */
                               public void setINSDAltSeqItem_gapLength(java.math.BigInteger param){
                            localINSDAltSeqItem_gapLengthTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_gapLength=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_gapType
                        */

                        
                                    protected java.lang.String localINSDAltSeqItem_gapType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_gapTypeTracker = false ;

                           public boolean isINSDAltSeqItem_gapTypeSpecified(){
                               return localINSDAltSeqItem_gapTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDAltSeqItem_gapType(){
                               return localINSDAltSeqItem_gapType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_gapType
                               */
                               public void setINSDAltSeqItem_gapType(java.lang.String param){
                            localINSDAltSeqItem_gapTypeTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_gapType=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_gapLinkage
                        */

                        
                                    protected java.lang.String localINSDAltSeqItem_gapLinkage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_gapLinkageTracker = false ;

                           public boolean isINSDAltSeqItem_gapLinkageSpecified(){
                               return localINSDAltSeqItem_gapLinkageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDAltSeqItem_gapLinkage(){
                               return localINSDAltSeqItem_gapLinkage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_gapLinkage
                               */
                               public void setINSDAltSeqItem_gapLinkage(java.lang.String param){
                            localINSDAltSeqItem_gapLinkageTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_gapLinkage=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_gapComment
                        */

                        
                                    protected java.lang.String localINSDAltSeqItem_gapComment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_gapCommentTracker = false ;

                           public boolean isINSDAltSeqItem_gapCommentSpecified(){
                               return localINSDAltSeqItem_gapCommentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDAltSeqItem_gapComment(){
                               return localINSDAltSeqItem_gapComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_gapComment
                               */
                               public void setINSDAltSeqItem_gapComment(java.lang.String param){
                            localINSDAltSeqItem_gapCommentTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_gapComment=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_firstAccn
                        */

                        
                                    protected java.lang.String localINSDAltSeqItem_firstAccn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_firstAccnTracker = false ;

                           public boolean isINSDAltSeqItem_firstAccnSpecified(){
                               return localINSDAltSeqItem_firstAccnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDAltSeqItem_firstAccn(){
                               return localINSDAltSeqItem_firstAccn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_firstAccn
                               */
                               public void setINSDAltSeqItem_firstAccn(java.lang.String param){
                            localINSDAltSeqItem_firstAccnTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_firstAccn=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_lastAccn
                        */

                        
                                    protected java.lang.String localINSDAltSeqItem_lastAccn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_lastAccnTracker = false ;

                           public boolean isINSDAltSeqItem_lastAccnSpecified(){
                               return localINSDAltSeqItem_lastAccnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDAltSeqItem_lastAccn(){
                               return localINSDAltSeqItem_lastAccn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_lastAccn
                               */
                               public void setINSDAltSeqItem_lastAccn(java.lang.String param){
                            localINSDAltSeqItem_lastAccnTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_lastAccn=param;
                                    

                               }
                            

                        /**
                        * field for INSDAltSeqItem_value
                        */

                        
                                    protected java.lang.String localINSDAltSeqItem_value ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDAltSeqItem_valueTracker = false ;

                           public boolean isINSDAltSeqItem_valueSpecified(){
                               return localINSDAltSeqItem_valueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDAltSeqItem_value(){
                               return localINSDAltSeqItem_value;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDAltSeqItem_value
                               */
                               public void setINSDAltSeqItem_value(java.lang.String param){
                            localINSDAltSeqItem_valueTracker = param != null;
                                   
                                            this.localINSDAltSeqItem_value=param;
                                    

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
                           namespacePrefix+":INSDAltSeqItem_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "INSDAltSeqItem_type0",
                           xmlWriter);
                   }

               
                   }
                if (localINSDAltSeqItem_intervalTracker){
                                            if (localINSDAltSeqItem_interval==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_interval cannot be null!!");
                                            }
                                           localINSDAltSeqItem_interval.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_interval"),
                                               xmlWriter);
                                        } if (localINSDAltSeqItem_isgapTracker){
                                            if (localINSDAltSeqItem_isgap==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_isgap cannot be null!!");
                                            }
                                           localINSDAltSeqItem_isgap.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_isgap"),
                                               xmlWriter);
                                        } if (localINSDAltSeqItem_gapLengthTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_gap-length", xmlWriter);
                             

                                          if (localINSDAltSeqItem_gapLength==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-length cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_gapLength));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDAltSeqItem_gapTypeTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_gap-type", xmlWriter);
                             

                                          if (localINSDAltSeqItem_gapType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-type cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDAltSeqItem_gapType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDAltSeqItem_gapLinkageTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_gap-linkage", xmlWriter);
                             

                                          if (localINSDAltSeqItem_gapLinkage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-linkage cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDAltSeqItem_gapLinkage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDAltSeqItem_gapCommentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_gap-comment", xmlWriter);
                             

                                          if (localINSDAltSeqItem_gapComment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDAltSeqItem_gapComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDAltSeqItem_firstAccnTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_first-accn", xmlWriter);
                             

                                          if (localINSDAltSeqItem_firstAccn==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_first-accn cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDAltSeqItem_firstAccn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDAltSeqItem_lastAccnTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_last-accn", xmlWriter);
                             

                                          if (localINSDAltSeqItem_lastAccn==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_last-accn cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDAltSeqItem_lastAccn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDAltSeqItem_valueTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDAltSeqItem_value", xmlWriter);
                             

                                          if (localINSDAltSeqItem_value==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_value cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDAltSeqItem_value);
                                            
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

                 if (localINSDAltSeqItem_intervalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_interval"));
                            
                            
                                    if (localINSDAltSeqItem_interval==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_interval cannot be null!!");
                                    }
                                    elementList.add(localINSDAltSeqItem_interval);
                                } if (localINSDAltSeqItem_isgapTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_isgap"));
                            
                            
                                    if (localINSDAltSeqItem_isgap==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_isgap cannot be null!!");
                                    }
                                    elementList.add(localINSDAltSeqItem_isgap);
                                } if (localINSDAltSeqItem_gapLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_gap-length"));
                                 
                                        if (localINSDAltSeqItem_gapLength != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_gapLength));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-length cannot be null!!");
                                        }
                                    } if (localINSDAltSeqItem_gapTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_gap-type"));
                                 
                                        if (localINSDAltSeqItem_gapType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_gapType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-type cannot be null!!");
                                        }
                                    } if (localINSDAltSeqItem_gapLinkageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_gap-linkage"));
                                 
                                        if (localINSDAltSeqItem_gapLinkage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_gapLinkage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-linkage cannot be null!!");
                                        }
                                    } if (localINSDAltSeqItem_gapCommentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_gap-comment"));
                                 
                                        if (localINSDAltSeqItem_gapComment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_gapComment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_gap-comment cannot be null!!");
                                        }
                                    } if (localINSDAltSeqItem_firstAccnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_first-accn"));
                                 
                                        if (localINSDAltSeqItem_firstAccn != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_firstAccn));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_first-accn cannot be null!!");
                                        }
                                    } if (localINSDAltSeqItem_lastAccnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_last-accn"));
                                 
                                        if (localINSDAltSeqItem_lastAccn != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_lastAccn));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_last-accn cannot be null!!");
                                        }
                                    } if (localINSDAltSeqItem_valueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDAltSeqItem_value"));
                                 
                                        if (localINSDAltSeqItem_value != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDAltSeqItem_value));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDAltSeqItem_value cannot be null!!");
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
        public static INSDAltSeqItem_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            INSDAltSeqItem_type0 object =
                new INSDAltSeqItem_type0();

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
                    
                            if (!"INSDAltSeqItem_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (INSDAltSeqItem_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_interval").equals(reader.getName())){
                                
                                                object.setINSDAltSeqItem_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_interval_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_isgap").equals(reader.getName())){
                                
                                                object.setINSDAltSeqItem_isgap(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDAltSeqItem_isgap_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_gap-length").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_gap-length" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_gapLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_gap-type").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_gap-type" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_gapType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_gap-linkage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_gap-linkage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_gapLinkage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_gap-comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_gap-comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_gapComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_first-accn").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_first-accn" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_firstAccn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_last-accn").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_last-accn" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_lastAccn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDAltSeqItem_value").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDAltSeqItem_value" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDAltSeqItem_value(
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
           
    