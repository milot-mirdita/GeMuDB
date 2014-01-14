
/**
 * SeqTableColumn_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqTableColumn_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqTableColumn_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SeqTable-column_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SeqTableColumn_header
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_header_type0 localSeqTableColumn_header ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_header_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_header_type0 getSeqTableColumn_header(){
                               return localSeqTableColumn_header;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableColumn_header
                               */
                               public void setSeqTableColumn_header(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_header_type0 param){
                            
                                            this.localSeqTableColumn_header=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableColumn_data
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_data_type0 localSeqTableColumn_data ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableColumn_dataTracker = false ;

                           public boolean isSeqTableColumn_dataSpecified(){
                               return localSeqTableColumn_dataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_data_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_data_type0 getSeqTableColumn_data(){
                               return localSeqTableColumn_data;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableColumn_data
                               */
                               public void setSeqTableColumn_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_data_type0 param){
                            localSeqTableColumn_dataTracker = param != null;
                                   
                                            this.localSeqTableColumn_data=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableColumn_sparse
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparse_type0 localSeqTableColumn_sparse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableColumn_sparseTracker = false ;

                           public boolean isSeqTableColumn_sparseSpecified(){
                               return localSeqTableColumn_sparseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparse_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparse_type0 getSeqTableColumn_sparse(){
                               return localSeqTableColumn_sparse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableColumn_sparse
                               */
                               public void setSeqTableColumn_sparse(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparse_type0 param){
                            localSeqTableColumn_sparseTracker = param != null;
                                   
                                            this.localSeqTableColumn_sparse=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableColumn_default
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_default_type0 localSeqTableColumn_default ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableColumn_defaultTracker = false ;

                           public boolean isSeqTableColumn_defaultSpecified(){
                               return localSeqTableColumn_defaultTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_default_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_default_type0 getSeqTableColumn_default(){
                               return localSeqTableColumn_default;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableColumn_default
                               */
                               public void setSeqTableColumn_default(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_default_type0 param){
                            localSeqTableColumn_defaultTracker = param != null;
                                   
                                            this.localSeqTableColumn_default=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableColumn_sparseOther
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparseOther_type0 localSeqTableColumn_sparseOther ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableColumn_sparseOtherTracker = false ;

                           public boolean isSeqTableColumn_sparseOtherSpecified(){
                               return localSeqTableColumn_sparseOtherTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparseOther_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparseOther_type0 getSeqTableColumn_sparseOther(){
                               return localSeqTableColumn_sparseOther;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableColumn_sparseOther
                               */
                               public void setSeqTableColumn_sparseOther(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparseOther_type0 param){
                            localSeqTableColumn_sparseOtherTracker = param != null;
                                   
                                            this.localSeqTableColumn_sparseOther=param;
                                    

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
                           namespacePrefix+":SeqTable-column_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SeqTable-column_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localSeqTableColumn_header==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-column_header cannot be null!!");
                                            }
                                           localSeqTableColumn_header.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_header"),
                                               xmlWriter);
                                         if (localSeqTableColumn_dataTracker){
                                            if (localSeqTableColumn_data==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-column_data cannot be null!!");
                                            }
                                           localSeqTableColumn_data.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_data"),
                                               xmlWriter);
                                        } if (localSeqTableColumn_sparseTracker){
                                            if (localSeqTableColumn_sparse==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-column_sparse cannot be null!!");
                                            }
                                           localSeqTableColumn_sparse.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_sparse"),
                                               xmlWriter);
                                        } if (localSeqTableColumn_defaultTracker){
                                            if (localSeqTableColumn_default==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-column_default cannot be null!!");
                                            }
                                           localSeqTableColumn_default.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_default"),
                                               xmlWriter);
                                        } if (localSeqTableColumn_sparseOtherTracker){
                                            if (localSeqTableColumn_sparseOther==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-column_sparse-other cannot be null!!");
                                            }
                                           localSeqTableColumn_sparseOther.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_sparse-other"),
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
                                                                      "SeqTable-column_header"));
                            
                            
                                    if (localSeqTableColumn_header==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-column_header cannot be null!!");
                                    }
                                    elementList.add(localSeqTableColumn_header);
                                 if (localSeqTableColumn_dataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-column_data"));
                            
                            
                                    if (localSeqTableColumn_data==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-column_data cannot be null!!");
                                    }
                                    elementList.add(localSeqTableColumn_data);
                                } if (localSeqTableColumn_sparseTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-column_sparse"));
                            
                            
                                    if (localSeqTableColumn_sparse==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-column_sparse cannot be null!!");
                                    }
                                    elementList.add(localSeqTableColumn_sparse);
                                } if (localSeqTableColumn_defaultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-column_default"));
                            
                            
                                    if (localSeqTableColumn_default==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-column_default cannot be null!!");
                                    }
                                    elementList.add(localSeqTableColumn_default);
                                } if (localSeqTableColumn_sparseOtherTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-column_sparse-other"));
                            
                            
                                    if (localSeqTableColumn_sparseOther==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-column_sparse-other cannot be null!!");
                                    }
                                    elementList.add(localSeqTableColumn_sparseOther);
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
        public static SeqTableColumn_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqTableColumn_type0 object =
                new SeqTableColumn_type0();

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
                    
                            if (!"SeqTable-column_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqTableColumn_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_header").equals(reader.getName())){
                                
                                                object.setSeqTableColumn_header(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_header_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_data").equals(reader.getName())){
                                
                                                object.setSeqTableColumn_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_data_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_sparse").equals(reader.getName())){
                                
                                                object.setSeqTableColumn_sparse(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparse_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_default").equals(reader.getName())){
                                
                                                object.setSeqTableColumn_default(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_default_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-column_sparse-other").equals(reader.getName())){
                                
                                                object.setSeqTableColumn_sparseOther(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableColumn_sparseOther_type0.Factory.parse(reader));
                                              
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
           
    