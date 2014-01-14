
/**
 * PubSet_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  PubSet_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PubSet_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Pub-set_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localPubSet_pubTracker = false;
                
                   localPubSet_medlineTracker = false;
                
                   localPubSet_articleTracker = false;
                
                   localPubSet_journalTracker = false;
                
                   localPubSet_bookTracker = false;
                
                   localPubSet_procTracker = false;
                
                   localPubSet_patentTracker = false;
                
            }
        

                        /**
                        * field for PubSet_pub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_pub_type0 localPubSet_pub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_pubTracker = false ;

                           public boolean isPubSet_pubSpecified(){
                               return localPubSet_pubTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_pub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_pub_type0 getPubSet_pub(){
                               return localPubSet_pub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_pub
                               */
                               public void setPubSet_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_pub_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_pubTracker = param != null;
                                   
                                            this.localPubSet_pub=param;
                                    

                               }
                            

                        /**
                        * field for PubSet_medline
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_medline_type0 localPubSet_medline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_medlineTracker = false ;

                           public boolean isPubSet_medlineSpecified(){
                               return localPubSet_medlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_medline_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_medline_type0 getPubSet_medline(){
                               return localPubSet_medline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_medline
                               */
                               public void setPubSet_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_medline_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_medlineTracker = param != null;
                                   
                                            this.localPubSet_medline=param;
                                    

                               }
                            

                        /**
                        * field for PubSet_article
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_article_type0 localPubSet_article ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_articleTracker = false ;

                           public boolean isPubSet_articleSpecified(){
                               return localPubSet_articleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_article_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_article_type0 getPubSet_article(){
                               return localPubSet_article;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_article
                               */
                               public void setPubSet_article(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_article_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_articleTracker = param != null;
                                   
                                            this.localPubSet_article=param;
                                    

                               }
                            

                        /**
                        * field for PubSet_journal
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_journal_type0 localPubSet_journal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_journalTracker = false ;

                           public boolean isPubSet_journalSpecified(){
                               return localPubSet_journalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_journal_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_journal_type0 getPubSet_journal(){
                               return localPubSet_journal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_journal
                               */
                               public void setPubSet_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_journal_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_journalTracker = param != null;
                                   
                                            this.localPubSet_journal=param;
                                    

                               }
                            

                        /**
                        * field for PubSet_book
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_book_type0 localPubSet_book ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_bookTracker = false ;

                           public boolean isPubSet_bookSpecified(){
                               return localPubSet_bookTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_book_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_book_type0 getPubSet_book(){
                               return localPubSet_book;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_book
                               */
                               public void setPubSet_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_book_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_bookTracker = param != null;
                                   
                                            this.localPubSet_book=param;
                                    

                               }
                            

                        /**
                        * field for PubSet_proc
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_proc_type0 localPubSet_proc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_procTracker = false ;

                           public boolean isPubSet_procSpecified(){
                               return localPubSet_procTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_proc_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_proc_type0 getPubSet_proc(){
                               return localPubSet_proc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_proc
                               */
                               public void setPubSet_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_proc_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_procTracker = param != null;
                                   
                                            this.localPubSet_proc=param;
                                    

                               }
                            

                        /**
                        * field for PubSet_patent
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_patent_type0 localPubSet_patent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPubSet_patentTracker = false ;

                           public boolean isPubSet_patentSpecified(){
                               return localPubSet_patentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_patent_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_patent_type0 getPubSet_patent(){
                               return localPubSet_patent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PubSet_patent
                               */
                               public void setPubSet_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_patent_type0 param){
                            
                                clearAllSettingTrackers();
                            localPubSet_patentTracker = param != null;
                                   
                                            this.localPubSet_patent=param;
                                    

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
                           namespacePrefix+":Pub-set_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Pub-set_type0",
                           xmlWriter);
                   }

               
                   }
                if (localPubSet_pubTracker){
                                            if (localPubSet_pub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_pub cannot be null!!");
                                            }
                                           localPubSet_pub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_pub"),
                                               xmlWriter);
                                        } if (localPubSet_medlineTracker){
                                            if (localPubSet_medline==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_medline cannot be null!!");
                                            }
                                           localPubSet_medline.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_medline"),
                                               xmlWriter);
                                        } if (localPubSet_articleTracker){
                                            if (localPubSet_article==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_article cannot be null!!");
                                            }
                                           localPubSet_article.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_article"),
                                               xmlWriter);
                                        } if (localPubSet_journalTracker){
                                            if (localPubSet_journal==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_journal cannot be null!!");
                                            }
                                           localPubSet_journal.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_journal"),
                                               xmlWriter);
                                        } if (localPubSet_bookTracker){
                                            if (localPubSet_book==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_book cannot be null!!");
                                            }
                                           localPubSet_book.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_book"),
                                               xmlWriter);
                                        } if (localPubSet_procTracker){
                                            if (localPubSet_proc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_proc cannot be null!!");
                                            }
                                           localPubSet_proc.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_proc"),
                                               xmlWriter);
                                        } if (localPubSet_patentTracker){
                                            if (localPubSet_patent==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub-set_patent cannot be null!!");
                                            }
                                           localPubSet_patent.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_patent"),
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

                 if (localPubSet_pubTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_pub"));
                            
                            
                                    if (localPubSet_pub==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_pub cannot be null!!");
                                    }
                                    elementList.add(localPubSet_pub);
                                } if (localPubSet_medlineTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_medline"));
                            
                            
                                    if (localPubSet_medline==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_medline cannot be null!!");
                                    }
                                    elementList.add(localPubSet_medline);
                                } if (localPubSet_articleTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_article"));
                            
                            
                                    if (localPubSet_article==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_article cannot be null!!");
                                    }
                                    elementList.add(localPubSet_article);
                                } if (localPubSet_journalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_journal"));
                            
                            
                                    if (localPubSet_journal==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_journal cannot be null!!");
                                    }
                                    elementList.add(localPubSet_journal);
                                } if (localPubSet_bookTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_book"));
                            
                            
                                    if (localPubSet_book==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_book cannot be null!!");
                                    }
                                    elementList.add(localPubSet_book);
                                } if (localPubSet_procTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_proc"));
                            
                            
                                    if (localPubSet_proc==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_proc cannot be null!!");
                                    }
                                    elementList.add(localPubSet_proc);
                                } if (localPubSet_patentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub-set_patent"));
                            
                            
                                    if (localPubSet_patent==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub-set_patent cannot be null!!");
                                    }
                                    elementList.add(localPubSet_patent);
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
        public static PubSet_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PubSet_type0 object =
                new PubSet_type0();

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
                    
                            if (!"Pub-set_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PubSet_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_pub").equals(reader.getName())){
                                
                                                object.setPubSet_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_pub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_medline").equals(reader.getName())){
                                
                                                object.setPubSet_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_medline_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_article").equals(reader.getName())){
                                
                                                object.setPubSet_article(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_article_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_journal").equals(reader.getName())){
                                
                                                object.setPubSet_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_journal_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_book").equals(reader.getName())){
                                
                                                object.setPubSet_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_book_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_proc").equals(reader.getName())){
                                
                                                object.setPubSet_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_proc_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub-set_patent").equals(reader.getName())){
                                
                                                object.setPubSet_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PubSet_patent_type0.Factory.parse(reader));
                                              
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
           
    