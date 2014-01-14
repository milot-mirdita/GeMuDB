
/**
 * CitGen_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  CitGen_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CitGen_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Cit-gen_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CitGen_cit
                        */

                        
                                    protected java.lang.String localCitGen_cit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_citTracker = false ;

                           public boolean isCitGen_citSpecified(){
                               return localCitGen_citTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitGen_cit(){
                               return localCitGen_cit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_cit
                               */
                               public void setCitGen_cit(java.lang.String param){
                            localCitGen_citTracker = param != null;
                                   
                                            this.localCitGen_cit=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_authors
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_authors_type0 localCitGen_authors ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_authorsTracker = false ;

                           public boolean isCitGen_authorsSpecified(){
                               return localCitGen_authorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_authors_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_authors_type0 getCitGen_authors(){
                               return localCitGen_authors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_authors
                               */
                               public void setCitGen_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_authors_type0 param){
                            localCitGen_authorsTracker = param != null;
                                   
                                            this.localCitGen_authors=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_muid
                        */

                        
                                    protected java.math.BigInteger localCitGen_muid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_muidTracker = false ;

                           public boolean isCitGen_muidSpecified(){
                               return localCitGen_muidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getCitGen_muid(){
                               return localCitGen_muid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_muid
                               */
                               public void setCitGen_muid(java.math.BigInteger param){
                            localCitGen_muidTracker = param != null;
                                   
                                            this.localCitGen_muid=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_journal
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_journal_type0 localCitGen_journal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_journalTracker = false ;

                           public boolean isCitGen_journalSpecified(){
                               return localCitGen_journalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_journal_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_journal_type0 getCitGen_journal(){
                               return localCitGen_journal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_journal
                               */
                               public void setCitGen_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_journal_type0 param){
                            localCitGen_journalTracker = param != null;
                                   
                                            this.localCitGen_journal=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_volume
                        */

                        
                                    protected java.lang.String localCitGen_volume ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_volumeTracker = false ;

                           public boolean isCitGen_volumeSpecified(){
                               return localCitGen_volumeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitGen_volume(){
                               return localCitGen_volume;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_volume
                               */
                               public void setCitGen_volume(java.lang.String param){
                            localCitGen_volumeTracker = param != null;
                                   
                                            this.localCitGen_volume=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_issue
                        */

                        
                                    protected java.lang.String localCitGen_issue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_issueTracker = false ;

                           public boolean isCitGen_issueSpecified(){
                               return localCitGen_issueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitGen_issue(){
                               return localCitGen_issue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_issue
                               */
                               public void setCitGen_issue(java.lang.String param){
                            localCitGen_issueTracker = param != null;
                                   
                                            this.localCitGen_issue=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_pages
                        */

                        
                                    protected java.lang.String localCitGen_pages ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_pagesTracker = false ;

                           public boolean isCitGen_pagesSpecified(){
                               return localCitGen_pagesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitGen_pages(){
                               return localCitGen_pages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_pages
                               */
                               public void setCitGen_pages(java.lang.String param){
                            localCitGen_pagesTracker = param != null;
                                   
                                            this.localCitGen_pages=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_date
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_date_type0 localCitGen_date ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_dateTracker = false ;

                           public boolean isCitGen_dateSpecified(){
                               return localCitGen_dateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_date_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_date_type0 getCitGen_date(){
                               return localCitGen_date;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_date
                               */
                               public void setCitGen_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_date_type0 param){
                            localCitGen_dateTracker = param != null;
                                   
                                            this.localCitGen_date=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_serialNumber
                        */

                        
                                    protected java.math.BigInteger localCitGen_serialNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_serialNumberTracker = false ;

                           public boolean isCitGen_serialNumberSpecified(){
                               return localCitGen_serialNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getCitGen_serialNumber(){
                               return localCitGen_serialNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_serialNumber
                               */
                               public void setCitGen_serialNumber(java.math.BigInteger param){
                            localCitGen_serialNumberTracker = param != null;
                                   
                                            this.localCitGen_serialNumber=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_title
                        */

                        
                                    protected java.lang.String localCitGen_title ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_titleTracker = false ;

                           public boolean isCitGen_titleSpecified(){
                               return localCitGen_titleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitGen_title(){
                               return localCitGen_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_title
                               */
                               public void setCitGen_title(java.lang.String param){
                            localCitGen_titleTracker = param != null;
                                   
                                            this.localCitGen_title=param;
                                    

                               }
                            

                        /**
                        * field for CitGen_pmid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_pmid_type0 localCitGen_pmid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitGen_pmidTracker = false ;

                           public boolean isCitGen_pmidSpecified(){
                               return localCitGen_pmidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_pmid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_pmid_type0 getCitGen_pmid(){
                               return localCitGen_pmid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitGen_pmid
                               */
                               public void setCitGen_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_pmid_type0 param){
                            localCitGen_pmidTracker = param != null;
                                   
                                            this.localCitGen_pmid=param;
                                    

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
                           namespacePrefix+":Cit-gen_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Cit-gen_type0",
                           xmlWriter);
                   }

               
                   }
                if (localCitGen_citTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_cit", xmlWriter);
                             

                                          if (localCitGen_cit==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_cit cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitGen_cit);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_authorsTracker){
                                            if (localCitGen_authors==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-gen_authors cannot be null!!");
                                            }
                                           localCitGen_authors.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_authors"),
                                               xmlWriter);
                                        } if (localCitGen_muidTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_muid", xmlWriter);
                             

                                          if (localCitGen_muid==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_muid cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_muid));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_journalTracker){
                                            if (localCitGen_journal==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-gen_journal cannot be null!!");
                                            }
                                           localCitGen_journal.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_journal"),
                                               xmlWriter);
                                        } if (localCitGen_volumeTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_volume", xmlWriter);
                             

                                          if (localCitGen_volume==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_volume cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitGen_volume);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_issueTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_issue", xmlWriter);
                             

                                          if (localCitGen_issue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_issue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitGen_issue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_pagesTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_pages", xmlWriter);
                             

                                          if (localCitGen_pages==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_pages cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitGen_pages);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_dateTracker){
                                            if (localCitGen_date==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-gen_date cannot be null!!");
                                            }
                                           localCitGen_date.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_date"),
                                               xmlWriter);
                                        } if (localCitGen_serialNumberTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_serial-number", xmlWriter);
                             

                                          if (localCitGen_serialNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_serial-number cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_serialNumber));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_titleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-gen_title", xmlWriter);
                             

                                          if (localCitGen_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-gen_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitGen_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitGen_pmidTracker){
                                            if (localCitGen_pmid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-gen_pmid cannot be null!!");
                                            }
                                           localCitGen_pmid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_pmid"),
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

                 if (localCitGen_citTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_cit"));
                                 
                                        if (localCitGen_cit != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_cit));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_cit cannot be null!!");
                                        }
                                    } if (localCitGen_authorsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_authors"));
                            
                            
                                    if (localCitGen_authors==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-gen_authors cannot be null!!");
                                    }
                                    elementList.add(localCitGen_authors);
                                } if (localCitGen_muidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_muid"));
                                 
                                        if (localCitGen_muid != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_muid));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_muid cannot be null!!");
                                        }
                                    } if (localCitGen_journalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_journal"));
                            
                            
                                    if (localCitGen_journal==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-gen_journal cannot be null!!");
                                    }
                                    elementList.add(localCitGen_journal);
                                } if (localCitGen_volumeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_volume"));
                                 
                                        if (localCitGen_volume != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_volume));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_volume cannot be null!!");
                                        }
                                    } if (localCitGen_issueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_issue"));
                                 
                                        if (localCitGen_issue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_issue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_issue cannot be null!!");
                                        }
                                    } if (localCitGen_pagesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_pages"));
                                 
                                        if (localCitGen_pages != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_pages));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_pages cannot be null!!");
                                        }
                                    } if (localCitGen_dateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_date"));
                            
                            
                                    if (localCitGen_date==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-gen_date cannot be null!!");
                                    }
                                    elementList.add(localCitGen_date);
                                } if (localCitGen_serialNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_serial-number"));
                                 
                                        if (localCitGen_serialNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_serialNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_serial-number cannot be null!!");
                                        }
                                    } if (localCitGen_titleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_title"));
                                 
                                        if (localCitGen_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitGen_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-gen_title cannot be null!!");
                                        }
                                    } if (localCitGen_pmidTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-gen_pmid"));
                            
                            
                                    if (localCitGen_pmid==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-gen_pmid cannot be null!!");
                                    }
                                    elementList.add(localCitGen_pmid);
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
        public static CitGen_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CitGen_type0 object =
                new CitGen_type0();

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
                    
                            if (!"Cit-gen_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CitGen_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_cit").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_cit" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_cit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_authors").equals(reader.getName())){
                                
                                                object.setCitGen_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_authors_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_muid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_muid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_muid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_journal").equals(reader.getName())){
                                
                                                object.setCitGen_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_journal_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_volume").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_volume" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_volume(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_issue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_issue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_issue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_pages").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_pages" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_pages(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_date").equals(reader.getName())){
                                
                                                object.setCitGen_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_date_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_serial-number").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_serial-number" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_serialNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-gen_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitGen_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-gen_pmid").equals(reader.getName())){
                                
                                                object.setCitGen_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitGen_pmid_type0.Factory.parse(reader));
                                              
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
           
    