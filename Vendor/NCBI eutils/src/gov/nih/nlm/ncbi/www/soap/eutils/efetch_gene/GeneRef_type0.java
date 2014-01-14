
/**
 * GeneRef_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  GeneRef_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GeneRef_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Gene-ref_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GeneRef_locus
                        */

                        
                                    protected java.lang.String localGeneRef_locus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_locusTracker = false ;

                           public boolean isGeneRef_locusSpecified(){
                               return localGeneRef_locusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneRef_locus(){
                               return localGeneRef_locus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_locus
                               */
                               public void setGeneRef_locus(java.lang.String param){
                            localGeneRef_locusTracker = param != null;
                                   
                                            this.localGeneRef_locus=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_allele
                        */

                        
                                    protected java.lang.String localGeneRef_allele ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_alleleTracker = false ;

                           public boolean isGeneRef_alleleSpecified(){
                               return localGeneRef_alleleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneRef_allele(){
                               return localGeneRef_allele;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_allele
                               */
                               public void setGeneRef_allele(java.lang.String param){
                            localGeneRef_alleleTracker = param != null;
                                   
                                            this.localGeneRef_allele=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_desc
                        */

                        
                                    protected java.lang.String localGeneRef_desc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_descTracker = false ;

                           public boolean isGeneRef_descSpecified(){
                               return localGeneRef_descTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneRef_desc(){
                               return localGeneRef_desc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_desc
                               */
                               public void setGeneRef_desc(java.lang.String param){
                            localGeneRef_descTracker = param != null;
                                   
                                            this.localGeneRef_desc=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_maploc
                        */

                        
                                    protected java.lang.String localGeneRef_maploc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_maplocTracker = false ;

                           public boolean isGeneRef_maplocSpecified(){
                               return localGeneRef_maplocTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneRef_maploc(){
                               return localGeneRef_maploc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_maploc
                               */
                               public void setGeneRef_maploc(java.lang.String param){
                            localGeneRef_maplocTracker = param != null;
                                   
                                            this.localGeneRef_maploc=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_pseudo
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_pseudo_type0 localGeneRef_pseudo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_pseudoTracker = false ;

                           public boolean isGeneRef_pseudoSpecified(){
                               return localGeneRef_pseudoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_pseudo_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_pseudo_type0 getGeneRef_pseudo(){
                               return localGeneRef_pseudo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_pseudo
                               */
                               public void setGeneRef_pseudo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_pseudo_type0 param){
                            localGeneRef_pseudoTracker = param != null;
                                   
                                            this.localGeneRef_pseudo=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_db
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_db_type0 localGeneRef_db ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_dbTracker = false ;

                           public boolean isGeneRef_dbSpecified(){
                               return localGeneRef_dbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_db_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_db_type0 getGeneRef_db(){
                               return localGeneRef_db;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_db
                               */
                               public void setGeneRef_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_db_type0 param){
                            localGeneRef_dbTracker = param != null;
                                   
                                            this.localGeneRef_db=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_syn
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_syn_type0 localGeneRef_syn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_synTracker = false ;

                           public boolean isGeneRef_synSpecified(){
                               return localGeneRef_synTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_syn_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_syn_type0 getGeneRef_syn(){
                               return localGeneRef_syn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_syn
                               */
                               public void setGeneRef_syn(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_syn_type0 param){
                            localGeneRef_synTracker = param != null;
                                   
                                            this.localGeneRef_syn=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_locusTag
                        */

                        
                                    protected java.lang.String localGeneRef_locusTag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_locusTagTracker = false ;

                           public boolean isGeneRef_locusTagSpecified(){
                               return localGeneRef_locusTagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneRef_locusTag(){
                               return localGeneRef_locusTag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_locusTag
                               */
                               public void setGeneRef_locusTag(java.lang.String param){
                            localGeneRef_locusTagTracker = param != null;
                                   
                                            this.localGeneRef_locusTag=param;
                                    

                               }
                            

                        /**
                        * field for GeneRef_formalName
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_formalName_type0 localGeneRef_formalName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneRef_formalNameTracker = false ;

                           public boolean isGeneRef_formalNameSpecified(){
                               return localGeneRef_formalNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_formalName_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_formalName_type0 getGeneRef_formalName(){
                               return localGeneRef_formalName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneRef_formalName
                               */
                               public void setGeneRef_formalName(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_formalName_type0 param){
                            localGeneRef_formalNameTracker = param != null;
                                   
                                            this.localGeneRef_formalName=param;
                                    

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
                           namespacePrefix+":Gene-ref_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Gene-ref_type0",
                           xmlWriter);
                   }

               
                   }
                if (localGeneRef_locusTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-ref_locus", xmlWriter);
                             

                                          if (localGeneRef_locus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-ref_locus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneRef_locus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneRef_alleleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-ref_allele", xmlWriter);
                             

                                          if (localGeneRef_allele==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-ref_allele cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneRef_allele);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneRef_descTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-ref_desc", xmlWriter);
                             

                                          if (localGeneRef_desc==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-ref_desc cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneRef_desc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneRef_maplocTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-ref_maploc", xmlWriter);
                             

                                          if (localGeneRef_maploc==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-ref_maploc cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneRef_maploc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneRef_pseudoTracker){
                                            if (localGeneRef_pseudo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-ref_pseudo cannot be null!!");
                                            }
                                           localGeneRef_pseudo.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_pseudo"),
                                               xmlWriter);
                                        } if (localGeneRef_dbTracker){
                                            if (localGeneRef_db==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-ref_db cannot be null!!");
                                            }
                                           localGeneRef_db.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_db"),
                                               xmlWriter);
                                        } if (localGeneRef_synTracker){
                                            if (localGeneRef_syn==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-ref_syn cannot be null!!");
                                            }
                                           localGeneRef_syn.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_syn"),
                                               xmlWriter);
                                        } if (localGeneRef_locusTagTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-ref_locus-tag", xmlWriter);
                             

                                          if (localGeneRef_locusTag==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-ref_locus-tag cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneRef_locusTag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneRef_formalNameTracker){
                                            if (localGeneRef_formalName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-ref_formal-name cannot be null!!");
                                            }
                                           localGeneRef_formalName.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_formal-name"),
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

                 if (localGeneRef_locusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_locus"));
                                 
                                        if (localGeneRef_locus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneRef_locus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-ref_locus cannot be null!!");
                                        }
                                    } if (localGeneRef_alleleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_allele"));
                                 
                                        if (localGeneRef_allele != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneRef_allele));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-ref_allele cannot be null!!");
                                        }
                                    } if (localGeneRef_descTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_desc"));
                                 
                                        if (localGeneRef_desc != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneRef_desc));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-ref_desc cannot be null!!");
                                        }
                                    } if (localGeneRef_maplocTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_maploc"));
                                 
                                        if (localGeneRef_maploc != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneRef_maploc));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-ref_maploc cannot be null!!");
                                        }
                                    } if (localGeneRef_pseudoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_pseudo"));
                            
                            
                                    if (localGeneRef_pseudo==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-ref_pseudo cannot be null!!");
                                    }
                                    elementList.add(localGeneRef_pseudo);
                                } if (localGeneRef_dbTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_db"));
                            
                            
                                    if (localGeneRef_db==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-ref_db cannot be null!!");
                                    }
                                    elementList.add(localGeneRef_db);
                                } if (localGeneRef_synTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_syn"));
                            
                            
                                    if (localGeneRef_syn==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-ref_syn cannot be null!!");
                                    }
                                    elementList.add(localGeneRef_syn);
                                } if (localGeneRef_locusTagTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_locus-tag"));
                                 
                                        if (localGeneRef_locusTag != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneRef_locusTag));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-ref_locus-tag cannot be null!!");
                                        }
                                    } if (localGeneRef_formalNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-ref_formal-name"));
                            
                            
                                    if (localGeneRef_formalName==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-ref_formal-name cannot be null!!");
                                    }
                                    elementList.add(localGeneRef_formalName);
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
        public static GeneRef_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GeneRef_type0 object =
                new GeneRef_type0();

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
                    
                            if (!"Gene-ref_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GeneRef_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_locus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-ref_locus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneRef_locus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_allele").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-ref_allele" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneRef_allele(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_desc").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-ref_desc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneRef_desc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_maploc").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-ref_maploc" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneRef_maploc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_pseudo").equals(reader.getName())){
                                
                                                object.setGeneRef_pseudo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_pseudo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_db").equals(reader.getName())){
                                
                                                object.setGeneRef_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_db_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_syn").equals(reader.getName())){
                                
                                                object.setGeneRef_syn(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_syn_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_locus-tag").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-ref_locus-tag" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneRef_locusTag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-ref_formal-name").equals(reader.getName())){
                                
                                                object.setGeneRef_formalName(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneRef_formalName_type0.Factory.parse(reader));
                                              
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
           
    