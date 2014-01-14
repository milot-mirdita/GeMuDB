
/**
 * SPBlock_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SPBlock_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SPBlock_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SP-block_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SPBlock_class
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_class_type0 localSPBlock_class ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_class_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_class_type0 getSPBlock_class(){
                               return localSPBlock_class;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_class
                               */
                               public void setSPBlock_class(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_class_type0 param){
                            
                                            this.localSPBlock_class=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_extraAcc
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_extraAcc_type0 localSPBlock_extraAcc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_extraAccTracker = false ;

                           public boolean isSPBlock_extraAccSpecified(){
                               return localSPBlock_extraAccTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_extraAcc_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_extraAcc_type0 getSPBlock_extraAcc(){
                               return localSPBlock_extraAcc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_extraAcc
                               */
                               public void setSPBlock_extraAcc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_extraAcc_type0 param){
                            localSPBlock_extraAccTracker = param != null;
                                   
                                            this.localSPBlock_extraAcc=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_imeth
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_imeth_type0 localSPBlock_imeth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_imethTracker = false ;

                           public boolean isSPBlock_imethSpecified(){
                               return localSPBlock_imethTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_imeth_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_imeth_type0 getSPBlock_imeth(){
                               return localSPBlock_imeth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_imeth
                               */
                               public void setSPBlock_imeth(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_imeth_type0 param){
                            localSPBlock_imethTracker = param != null;
                                   
                                            this.localSPBlock_imeth=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_plasnm
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_plasnm_type0 localSPBlock_plasnm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_plasnmTracker = false ;

                           public boolean isSPBlock_plasnmSpecified(){
                               return localSPBlock_plasnmTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_plasnm_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_plasnm_type0 getSPBlock_plasnm(){
                               return localSPBlock_plasnm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_plasnm
                               */
                               public void setSPBlock_plasnm(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_plasnm_type0 param){
                            localSPBlock_plasnmTracker = param != null;
                                   
                                            this.localSPBlock_plasnm=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_seqref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_seqref_type0 localSPBlock_seqref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_seqrefTracker = false ;

                           public boolean isSPBlock_seqrefSpecified(){
                               return localSPBlock_seqrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_seqref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_seqref_type0 getSPBlock_seqref(){
                               return localSPBlock_seqref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_seqref
                               */
                               public void setSPBlock_seqref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_seqref_type0 param){
                            localSPBlock_seqrefTracker = param != null;
                                   
                                            this.localSPBlock_seqref=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_dbref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_dbref_type0 localSPBlock_dbref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_dbrefTracker = false ;

                           public boolean isSPBlock_dbrefSpecified(){
                               return localSPBlock_dbrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_dbref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_dbref_type0 getSPBlock_dbref(){
                               return localSPBlock_dbref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_dbref
                               */
                               public void setSPBlock_dbref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_dbref_type0 param){
                            localSPBlock_dbrefTracker = param != null;
                                   
                                            this.localSPBlock_dbref=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_keywords
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_keywords_type0 localSPBlock_keywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_keywordsTracker = false ;

                           public boolean isSPBlock_keywordsSpecified(){
                               return localSPBlock_keywordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_keywords_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_keywords_type0 getSPBlock_keywords(){
                               return localSPBlock_keywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_keywords
                               */
                               public void setSPBlock_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_keywords_type0 param){
                            localSPBlock_keywordsTracker = param != null;
                                   
                                            this.localSPBlock_keywords=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_created
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_created_type0 localSPBlock_created ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_createdTracker = false ;

                           public boolean isSPBlock_createdSpecified(){
                               return localSPBlock_createdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_created_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_created_type0 getSPBlock_created(){
                               return localSPBlock_created;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_created
                               */
                               public void setSPBlock_created(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_created_type0 param){
                            localSPBlock_createdTracker = param != null;
                                   
                                            this.localSPBlock_created=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_sequpd
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_sequpd_type0 localSPBlock_sequpd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_sequpdTracker = false ;

                           public boolean isSPBlock_sequpdSpecified(){
                               return localSPBlock_sequpdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_sequpd_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_sequpd_type0 getSPBlock_sequpd(){
                               return localSPBlock_sequpd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_sequpd
                               */
                               public void setSPBlock_sequpd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_sequpd_type0 param){
                            localSPBlock_sequpdTracker = param != null;
                                   
                                            this.localSPBlock_sequpd=param;
                                    

                               }
                            

                        /**
                        * field for SPBlock_annotupd
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_annotupd_type0 localSPBlock_annotupd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSPBlock_annotupdTracker = false ;

                           public boolean isSPBlock_annotupdSpecified(){
                               return localSPBlock_annotupdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_annotupd_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_annotupd_type0 getSPBlock_annotupd(){
                               return localSPBlock_annotupd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SPBlock_annotupd
                               */
                               public void setSPBlock_annotupd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_annotupd_type0 param){
                            localSPBlock_annotupdTracker = param != null;
                                   
                                            this.localSPBlock_annotupd=param;
                                    

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
                           namespacePrefix+":SP-block_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SP-block_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localSPBlock_class==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_class cannot be null!!");
                                            }
                                           localSPBlock_class.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_class"),
                                               xmlWriter);
                                         if (localSPBlock_extraAccTracker){
                                            if (localSPBlock_extraAcc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_extra-acc cannot be null!!");
                                            }
                                           localSPBlock_extraAcc.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_extra-acc"),
                                               xmlWriter);
                                        } if (localSPBlock_imethTracker){
                                            if (localSPBlock_imeth==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_imeth cannot be null!!");
                                            }
                                           localSPBlock_imeth.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_imeth"),
                                               xmlWriter);
                                        } if (localSPBlock_plasnmTracker){
                                            if (localSPBlock_plasnm==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_plasnm cannot be null!!");
                                            }
                                           localSPBlock_plasnm.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_plasnm"),
                                               xmlWriter);
                                        } if (localSPBlock_seqrefTracker){
                                            if (localSPBlock_seqref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_seqref cannot be null!!");
                                            }
                                           localSPBlock_seqref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_seqref"),
                                               xmlWriter);
                                        } if (localSPBlock_dbrefTracker){
                                            if (localSPBlock_dbref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_dbref cannot be null!!");
                                            }
                                           localSPBlock_dbref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_dbref"),
                                               xmlWriter);
                                        } if (localSPBlock_keywordsTracker){
                                            if (localSPBlock_keywords==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_keywords cannot be null!!");
                                            }
                                           localSPBlock_keywords.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_keywords"),
                                               xmlWriter);
                                        } if (localSPBlock_createdTracker){
                                            if (localSPBlock_created==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_created cannot be null!!");
                                            }
                                           localSPBlock_created.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_created"),
                                               xmlWriter);
                                        } if (localSPBlock_sequpdTracker){
                                            if (localSPBlock_sequpd==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_sequpd cannot be null!!");
                                            }
                                           localSPBlock_sequpd.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_sequpd"),
                                               xmlWriter);
                                        } if (localSPBlock_annotupdTracker){
                                            if (localSPBlock_annotupd==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SP-block_annotupd cannot be null!!");
                                            }
                                           localSPBlock_annotupd.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_annotupd"),
                                               xmlWriter);
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

                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_class"));
                            
                            
                                    if (localSPBlock_class==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_class cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_class);
                                 if (localSPBlock_extraAccTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_extra-acc"));
                            
                            
                                    if (localSPBlock_extraAcc==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_extra-acc cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_extraAcc);
                                } if (localSPBlock_imethTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_imeth"));
                            
                            
                                    if (localSPBlock_imeth==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_imeth cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_imeth);
                                } if (localSPBlock_plasnmTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_plasnm"));
                            
                            
                                    if (localSPBlock_plasnm==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_plasnm cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_plasnm);
                                } if (localSPBlock_seqrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_seqref"));
                            
                            
                                    if (localSPBlock_seqref==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_seqref cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_seqref);
                                } if (localSPBlock_dbrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_dbref"));
                            
                            
                                    if (localSPBlock_dbref==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_dbref cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_dbref);
                                } if (localSPBlock_keywordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_keywords"));
                            
                            
                                    if (localSPBlock_keywords==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_keywords cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_keywords);
                                } if (localSPBlock_createdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_created"));
                            
                            
                                    if (localSPBlock_created==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_created cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_created);
                                } if (localSPBlock_sequpdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_sequpd"));
                            
                            
                                    if (localSPBlock_sequpd==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_sequpd cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_sequpd);
                                } if (localSPBlock_annotupdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SP-block_annotupd"));
                            
                            
                                    if (localSPBlock_annotupd==null){
                                         throw new org.apache.axis2.databinding.ADBException("SP-block_annotupd cannot be null!!");
                                    }
                                    elementList.add(localSPBlock_annotupd);
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
        public static SPBlock_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SPBlock_type0 object =
                new SPBlock_type0();

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
                    
                            if (!"SP-block_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SPBlock_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_class").equals(reader.getName())){
                                
                                                object.setSPBlock_class(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_class_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_extra-acc").equals(reader.getName())){
                                
                                                object.setSPBlock_extraAcc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_extraAcc_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_imeth").equals(reader.getName())){
                                
                                                object.setSPBlock_imeth(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_imeth_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_plasnm").equals(reader.getName())){
                                
                                                object.setSPBlock_plasnm(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_plasnm_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_seqref").equals(reader.getName())){
                                
                                                object.setSPBlock_seqref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_seqref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_dbref").equals(reader.getName())){
                                
                                                object.setSPBlock_dbref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_dbref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_keywords").equals(reader.getName())){
                                
                                                object.setSPBlock_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_keywords_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_created").equals(reader.getName())){
                                
                                                object.setSPBlock_created(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_created_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_sequpd").equals(reader.getName())){
                                
                                                object.setSPBlock_sequpd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_sequpd_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SP-block_annotupd").equals(reader.getName())){
                                
                                                object.setSPBlock_annotupd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SPBlock_annotupd_type0.Factory.parse(reader));
                                              
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
           
    