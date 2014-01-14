
/**
 * GeneSource_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  GeneSource_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GeneSource_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Gene-source_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GeneSource_src
                        */

                        
                                    protected java.lang.String localGeneSource_src ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneSource_src(){
                               return localGeneSource_src;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_src
                               */
                               public void setGeneSource_src(java.lang.String param){
                            
                                            this.localGeneSource_src=param;
                                    

                               }
                            

                        /**
                        * field for GeneSource_srcInt
                        */

                        
                                    protected java.math.BigInteger localGeneSource_srcInt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneSource_srcIntTracker = false ;

                           public boolean isGeneSource_srcIntSpecified(){
                               return localGeneSource_srcIntTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGeneSource_srcInt(){
                               return localGeneSource_srcInt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_srcInt
                               */
                               public void setGeneSource_srcInt(java.math.BigInteger param){
                            localGeneSource_srcIntTracker = param != null;
                                   
                                            this.localGeneSource_srcInt=param;
                                    

                               }
                            

                        /**
                        * field for GeneSource_srcStr1
                        */

                        
                                    protected java.lang.String localGeneSource_srcStr1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneSource_srcStr1Tracker = false ;

                           public boolean isGeneSource_srcStr1Specified(){
                               return localGeneSource_srcStr1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneSource_srcStr1(){
                               return localGeneSource_srcStr1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_srcStr1
                               */
                               public void setGeneSource_srcStr1(java.lang.String param){
                            localGeneSource_srcStr1Tracker = param != null;
                                   
                                            this.localGeneSource_srcStr1=param;
                                    

                               }
                            

                        /**
                        * field for GeneSource_srcStr2
                        */

                        
                                    protected java.lang.String localGeneSource_srcStr2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneSource_srcStr2Tracker = false ;

                           public boolean isGeneSource_srcStr2Specified(){
                               return localGeneSource_srcStr2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneSource_srcStr2(){
                               return localGeneSource_srcStr2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_srcStr2
                               */
                               public void setGeneSource_srcStr2(java.lang.String param){
                            localGeneSource_srcStr2Tracker = param != null;
                                   
                                            this.localGeneSource_srcStr2=param;
                                    

                               }
                            

                        /**
                        * field for GeneSource_geneDisplay
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_geneDisplay_type0 localGeneSource_geneDisplay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneSource_geneDisplayTracker = false ;

                           public boolean isGeneSource_geneDisplaySpecified(){
                               return localGeneSource_geneDisplayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_geneDisplay_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_geneDisplay_type0 getGeneSource_geneDisplay(){
                               return localGeneSource_geneDisplay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_geneDisplay
                               */
                               public void setGeneSource_geneDisplay(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_geneDisplay_type0 param){
                            localGeneSource_geneDisplayTracker = param != null;
                                   
                                            this.localGeneSource_geneDisplay=param;
                                    

                               }
                            

                        /**
                        * field for GeneSource_locusDisplay
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_locusDisplay_type0 localGeneSource_locusDisplay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneSource_locusDisplayTracker = false ;

                           public boolean isGeneSource_locusDisplaySpecified(){
                               return localGeneSource_locusDisplayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_locusDisplay_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_locusDisplay_type0 getGeneSource_locusDisplay(){
                               return localGeneSource_locusDisplay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_locusDisplay
                               */
                               public void setGeneSource_locusDisplay(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_locusDisplay_type0 param){
                            localGeneSource_locusDisplayTracker = param != null;
                                   
                                            this.localGeneSource_locusDisplay=param;
                                    

                               }
                            

                        /**
                        * field for GeneSource_extraTerms
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_extraTerms_type0 localGeneSource_extraTerms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneSource_extraTermsTracker = false ;

                           public boolean isGeneSource_extraTermsSpecified(){
                               return localGeneSource_extraTermsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_extraTerms_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_extraTerms_type0 getGeneSource_extraTerms(){
                               return localGeneSource_extraTerms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneSource_extraTerms
                               */
                               public void setGeneSource_extraTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_extraTerms_type0 param){
                            localGeneSource_extraTermsTracker = param != null;
                                   
                                            this.localGeneSource_extraTerms=param;
                                    

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
                           namespacePrefix+":Gene-source_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Gene-source_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-source_src", xmlWriter);
                             

                                          if (localGeneSource_src==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-source_src cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneSource_src);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGeneSource_srcIntTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-source_src-int", xmlWriter);
                             

                                          if (localGeneSource_srcInt==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-source_src-int cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneSource_srcInt));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneSource_srcStr1Tracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-source_src-str1", xmlWriter);
                             

                                          if (localGeneSource_srcStr1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-source_src-str1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneSource_srcStr1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneSource_srcStr2Tracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-source_src-str2", xmlWriter);
                             

                                          if (localGeneSource_srcStr2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-source_src-str2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneSource_srcStr2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneSource_geneDisplayTracker){
                                            if (localGeneSource_geneDisplay==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-source_gene-display cannot be null!!");
                                            }
                                           localGeneSource_geneDisplay.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_gene-display"),
                                               xmlWriter);
                                        } if (localGeneSource_locusDisplayTracker){
                                            if (localGeneSource_locusDisplay==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-source_locus-display cannot be null!!");
                                            }
                                           localGeneSource_locusDisplay.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_locus-display"),
                                               xmlWriter);
                                        } if (localGeneSource_extraTermsTracker){
                                            if (localGeneSource_extraTerms==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-source_extra-terms cannot be null!!");
                                            }
                                           localGeneSource_extraTerms.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_extra-terms"),
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
                                                                      "Gene-source_src"));
                                 
                                        if (localGeneSource_src != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneSource_src));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-source_src cannot be null!!");
                                        }
                                     if (localGeneSource_srcIntTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-source_src-int"));
                                 
                                        if (localGeneSource_srcInt != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneSource_srcInt));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-source_src-int cannot be null!!");
                                        }
                                    } if (localGeneSource_srcStr1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-source_src-str1"));
                                 
                                        if (localGeneSource_srcStr1 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneSource_srcStr1));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-source_src-str1 cannot be null!!");
                                        }
                                    } if (localGeneSource_srcStr2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-source_src-str2"));
                                 
                                        if (localGeneSource_srcStr2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneSource_srcStr2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-source_src-str2 cannot be null!!");
                                        }
                                    } if (localGeneSource_geneDisplayTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-source_gene-display"));
                            
                            
                                    if (localGeneSource_geneDisplay==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-source_gene-display cannot be null!!");
                                    }
                                    elementList.add(localGeneSource_geneDisplay);
                                } if (localGeneSource_locusDisplayTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-source_locus-display"));
                            
                            
                                    if (localGeneSource_locusDisplay==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-source_locus-display cannot be null!!");
                                    }
                                    elementList.add(localGeneSource_locusDisplay);
                                } if (localGeneSource_extraTermsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-source_extra-terms"));
                            
                            
                                    if (localGeneSource_extraTerms==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-source_extra-terms cannot be null!!");
                                    }
                                    elementList.add(localGeneSource_extraTerms);
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
        public static GeneSource_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GeneSource_type0 object =
                new GeneSource_type0();

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
                    
                            if (!"Gene-source_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GeneSource_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_src").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-source_src" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneSource_src(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_src-int").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-source_src-int" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneSource_srcInt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_src-str1").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-source_src-str1" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneSource_srcStr1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_src-str2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-source_src-str2" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneSource_srcStr2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_gene-display").equals(reader.getName())){
                                
                                                object.setGeneSource_geneDisplay(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_geneDisplay_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_locus-display").equals(reader.getName())){
                                
                                                object.setGeneSource_locusDisplay(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_locusDisplay_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-source_extra-terms").equals(reader.getName())){
                                
                                                object.setGeneSource_extraTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneSource_extraTerms_type0.Factory.parse(reader));
                                              
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
           
    