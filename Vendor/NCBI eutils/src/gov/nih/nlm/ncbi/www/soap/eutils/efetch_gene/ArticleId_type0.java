
/**
 * ArticleId_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  ArticleId_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ArticleId_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ArticleId_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localArticleId_pubmedTracker = false;
                
                   localArticleId_medlineTracker = false;
                
                   localArticleId_doiTracker = false;
                
                   localArticleId_piiTracker = false;
                
                   localArticleId_pmcidTracker = false;
                
                   localArticleId_pmcpidTracker = false;
                
                   localArticleId_pmpidTracker = false;
                
                   localArticleId_otherTracker = false;
                
            }
        

                        /**
                        * field for ArticleId_pubmed
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pubmed_type0 localArticleId_pubmed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_pubmedTracker = false ;

                           public boolean isArticleId_pubmedSpecified(){
                               return localArticleId_pubmedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pubmed_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pubmed_type0 getArticleId_pubmed(){
                               return localArticleId_pubmed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_pubmed
                               */
                               public void setArticleId_pubmed(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pubmed_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_pubmedTracker = param != null;
                                   
                                            this.localArticleId_pubmed=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_medline
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_medline_type0 localArticleId_medline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_medlineTracker = false ;

                           public boolean isArticleId_medlineSpecified(){
                               return localArticleId_medlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_medline_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_medline_type0 getArticleId_medline(){
                               return localArticleId_medline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_medline
                               */
                               public void setArticleId_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_medline_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_medlineTracker = param != null;
                                   
                                            this.localArticleId_medline=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_doi
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_doi_type0 localArticleId_doi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_doiTracker = false ;

                           public boolean isArticleId_doiSpecified(){
                               return localArticleId_doiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_doi_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_doi_type0 getArticleId_doi(){
                               return localArticleId_doi;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_doi
                               */
                               public void setArticleId_doi(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_doi_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_doiTracker = param != null;
                                   
                                            this.localArticleId_doi=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_pii
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pii_type0 localArticleId_pii ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_piiTracker = false ;

                           public boolean isArticleId_piiSpecified(){
                               return localArticleId_piiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pii_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pii_type0 getArticleId_pii(){
                               return localArticleId_pii;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_pii
                               */
                               public void setArticleId_pii(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pii_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_piiTracker = param != null;
                                   
                                            this.localArticleId_pii=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_pmcid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcid_type0 localArticleId_pmcid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_pmcidTracker = false ;

                           public boolean isArticleId_pmcidSpecified(){
                               return localArticleId_pmcidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcid_type0 getArticleId_pmcid(){
                               return localArticleId_pmcid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_pmcid
                               */
                               public void setArticleId_pmcid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcid_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_pmcidTracker = param != null;
                                   
                                            this.localArticleId_pmcid=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_pmcpid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcpid_type0 localArticleId_pmcpid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_pmcpidTracker = false ;

                           public boolean isArticleId_pmcpidSpecified(){
                               return localArticleId_pmcpidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcpid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcpid_type0 getArticleId_pmcpid(){
                               return localArticleId_pmcpid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_pmcpid
                               */
                               public void setArticleId_pmcpid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcpid_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_pmcpidTracker = param != null;
                                   
                                            this.localArticleId_pmcpid=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_pmpid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmpid_type0 localArticleId_pmpid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_pmpidTracker = false ;

                           public boolean isArticleId_pmpidSpecified(){
                               return localArticleId_pmpidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmpid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmpid_type0 getArticleId_pmpid(){
                               return localArticleId_pmpid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_pmpid
                               */
                               public void setArticleId_pmpid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmpid_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_pmpidTracker = param != null;
                                   
                                            this.localArticleId_pmpid=param;
                                    

                               }
                            

                        /**
                        * field for ArticleId_other
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_other_type0 localArticleId_other ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArticleId_otherTracker = false ;

                           public boolean isArticleId_otherSpecified(){
                               return localArticleId_otherTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_other_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_other_type0 getArticleId_other(){
                               return localArticleId_other;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArticleId_other
                               */
                               public void setArticleId_other(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_other_type0 param){
                            
                                clearAllSettingTrackers();
                            localArticleId_otherTracker = param != null;
                                   
                                            this.localArticleId_other=param;
                                    

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
                           namespacePrefix+":ArticleId_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ArticleId_type0",
                           xmlWriter);
                   }

               
                   }
                if (localArticleId_pubmedTracker){
                                            if (localArticleId_pubmed==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_pubmed cannot be null!!");
                                            }
                                           localArticleId_pubmed.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pubmed"),
                                               xmlWriter);
                                        } if (localArticleId_medlineTracker){
                                            if (localArticleId_medline==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_medline cannot be null!!");
                                            }
                                           localArticleId_medline.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_medline"),
                                               xmlWriter);
                                        } if (localArticleId_doiTracker){
                                            if (localArticleId_doi==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_doi cannot be null!!");
                                            }
                                           localArticleId_doi.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_doi"),
                                               xmlWriter);
                                        } if (localArticleId_piiTracker){
                                            if (localArticleId_pii==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_pii cannot be null!!");
                                            }
                                           localArticleId_pii.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pii"),
                                               xmlWriter);
                                        } if (localArticleId_pmcidTracker){
                                            if (localArticleId_pmcid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_pmcid cannot be null!!");
                                            }
                                           localArticleId_pmcid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pmcid"),
                                               xmlWriter);
                                        } if (localArticleId_pmcpidTracker){
                                            if (localArticleId_pmcpid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_pmcpid cannot be null!!");
                                            }
                                           localArticleId_pmcpid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pmcpid"),
                                               xmlWriter);
                                        } if (localArticleId_pmpidTracker){
                                            if (localArticleId_pmpid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_pmpid cannot be null!!");
                                            }
                                           localArticleId_pmpid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pmpid"),
                                               xmlWriter);
                                        } if (localArticleId_otherTracker){
                                            if (localArticleId_other==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArticleId_other cannot be null!!");
                                            }
                                           localArticleId_other.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_other"),
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

                 if (localArticleId_pubmedTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_pubmed"));
                            
                            
                                    if (localArticleId_pubmed==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_pubmed cannot be null!!");
                                    }
                                    elementList.add(localArticleId_pubmed);
                                } if (localArticleId_medlineTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_medline"));
                            
                            
                                    if (localArticleId_medline==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_medline cannot be null!!");
                                    }
                                    elementList.add(localArticleId_medline);
                                } if (localArticleId_doiTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_doi"));
                            
                            
                                    if (localArticleId_doi==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_doi cannot be null!!");
                                    }
                                    elementList.add(localArticleId_doi);
                                } if (localArticleId_piiTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_pii"));
                            
                            
                                    if (localArticleId_pii==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_pii cannot be null!!");
                                    }
                                    elementList.add(localArticleId_pii);
                                } if (localArticleId_pmcidTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_pmcid"));
                            
                            
                                    if (localArticleId_pmcid==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_pmcid cannot be null!!");
                                    }
                                    elementList.add(localArticleId_pmcid);
                                } if (localArticleId_pmcpidTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_pmcpid"));
                            
                            
                                    if (localArticleId_pmcpid==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_pmcpid cannot be null!!");
                                    }
                                    elementList.add(localArticleId_pmcpid);
                                } if (localArticleId_pmpidTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_pmpid"));
                            
                            
                                    if (localArticleId_pmpid==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_pmpid cannot be null!!");
                                    }
                                    elementList.add(localArticleId_pmpid);
                                } if (localArticleId_otherTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "ArticleId_other"));
                            
                            
                                    if (localArticleId_other==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArticleId_other cannot be null!!");
                                    }
                                    elementList.add(localArticleId_other);
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
        public static ArticleId_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ArticleId_type0 object =
                new ArticleId_type0();

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
                    
                            if (!"ArticleId_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ArticleId_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pubmed").equals(reader.getName())){
                                
                                                object.setArticleId_pubmed(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pubmed_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_medline").equals(reader.getName())){
                                
                                                object.setArticleId_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_medline_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_doi").equals(reader.getName())){
                                
                                                object.setArticleId_doi(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_doi_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pii").equals(reader.getName())){
                                
                                                object.setArticleId_pii(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pii_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pmcid").equals(reader.getName())){
                                
                                                object.setArticleId_pmcid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcid_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pmcpid").equals(reader.getName())){
                                
                                                object.setArticleId_pmcpid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmcpid_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_pmpid").equals(reader.getName())){
                                
                                                object.setArticleId_pmpid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_pmpid_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","ArticleId_other").equals(reader.getName())){
                                
                                                object.setArticleId_other(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ArticleId_other_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    