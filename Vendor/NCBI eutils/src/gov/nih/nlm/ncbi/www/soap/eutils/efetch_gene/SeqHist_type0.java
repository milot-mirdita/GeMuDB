
/**
 * SeqHist_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqHist_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqHist_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-hist_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SeqHist_assembly
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_assembly_type0 localSeqHist_assembly ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqHist_assemblyTracker = false ;

                           public boolean isSeqHist_assemblySpecified(){
                               return localSeqHist_assemblyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_assembly_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_assembly_type0 getSeqHist_assembly(){
                               return localSeqHist_assembly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqHist_assembly
                               */
                               public void setSeqHist_assembly(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_assembly_type0 param){
                            localSeqHist_assemblyTracker = param != null;
                                   
                                            this.localSeqHist_assembly=param;
                                    

                               }
                            

                        /**
                        * field for SeqHist_replaces
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replaces_type0 localSeqHist_replaces ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqHist_replacesTracker = false ;

                           public boolean isSeqHist_replacesSpecified(){
                               return localSeqHist_replacesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replaces_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replaces_type0 getSeqHist_replaces(){
                               return localSeqHist_replaces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqHist_replaces
                               */
                               public void setSeqHist_replaces(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replaces_type0 param){
                            localSeqHist_replacesTracker = param != null;
                                   
                                            this.localSeqHist_replaces=param;
                                    

                               }
                            

                        /**
                        * field for SeqHist_replacedBy
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replacedBy_type0 localSeqHist_replacedBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqHist_replacedByTracker = false ;

                           public boolean isSeqHist_replacedBySpecified(){
                               return localSeqHist_replacedByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replacedBy_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replacedBy_type0 getSeqHist_replacedBy(){
                               return localSeqHist_replacedBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqHist_replacedBy
                               */
                               public void setSeqHist_replacedBy(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replacedBy_type0 param){
                            localSeqHist_replacedByTracker = param != null;
                                   
                                            this.localSeqHist_replacedBy=param;
                                    

                               }
                            

                        /**
                        * field for SeqHist_deleted
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_deleted_type0 localSeqHist_deleted ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqHist_deletedTracker = false ;

                           public boolean isSeqHist_deletedSpecified(){
                               return localSeqHist_deletedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_deleted_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_deleted_type0 getSeqHist_deleted(){
                               return localSeqHist_deleted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqHist_deleted
                               */
                               public void setSeqHist_deleted(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_deleted_type0 param){
                            localSeqHist_deletedTracker = param != null;
                                   
                                            this.localSeqHist_deleted=param;
                                    

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
                           namespacePrefix+":Seq-hist_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-hist_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqHist_assemblyTracker){
                                            if (localSeqHist_assembly==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-hist_assembly cannot be null!!");
                                            }
                                           localSeqHist_assembly.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_assembly"),
                                               xmlWriter);
                                        } if (localSeqHist_replacesTracker){
                                            if (localSeqHist_replaces==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-hist_replaces cannot be null!!");
                                            }
                                           localSeqHist_replaces.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_replaces"),
                                               xmlWriter);
                                        } if (localSeqHist_replacedByTracker){
                                            if (localSeqHist_replacedBy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-hist_replaced-by cannot be null!!");
                                            }
                                           localSeqHist_replacedBy.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_replaced-by"),
                                               xmlWriter);
                                        } if (localSeqHist_deletedTracker){
                                            if (localSeqHist_deleted==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-hist_deleted cannot be null!!");
                                            }
                                           localSeqHist_deleted.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_deleted"),
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

                 if (localSeqHist_assemblyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-hist_assembly"));
                            
                            
                                    if (localSeqHist_assembly==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-hist_assembly cannot be null!!");
                                    }
                                    elementList.add(localSeqHist_assembly);
                                } if (localSeqHist_replacesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-hist_replaces"));
                            
                            
                                    if (localSeqHist_replaces==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-hist_replaces cannot be null!!");
                                    }
                                    elementList.add(localSeqHist_replaces);
                                } if (localSeqHist_replacedByTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-hist_replaced-by"));
                            
                            
                                    if (localSeqHist_replacedBy==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-hist_replaced-by cannot be null!!");
                                    }
                                    elementList.add(localSeqHist_replacedBy);
                                } if (localSeqHist_deletedTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-hist_deleted"));
                            
                            
                                    if (localSeqHist_deleted==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-hist_deleted cannot be null!!");
                                    }
                                    elementList.add(localSeqHist_deleted);
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
        public static SeqHist_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqHist_type0 object =
                new SeqHist_type0();

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
                    
                            if (!"Seq-hist_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqHist_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_assembly").equals(reader.getName())){
                                
                                                object.setSeqHist_assembly(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_assembly_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_replaces").equals(reader.getName())){
                                
                                                object.setSeqHist_replaces(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replaces_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_replaced-by").equals(reader.getName())){
                                
                                                object.setSeqHist_replacedBy(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_replacedBy_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-hist_deleted").equals(reader.getName())){
                                
                                                object.setSeqHist_deleted(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqHist_deleted_type0.Factory.parse(reader));
                                              
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
           
    