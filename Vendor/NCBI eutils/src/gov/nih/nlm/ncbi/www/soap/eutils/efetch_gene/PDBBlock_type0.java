
/**
 * PDBBlock_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  PDBBlock_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PDBBlock_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PDB-block_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for PDBBlock_deposition
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_deposition_type0 localPDBBlock_deposition ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_deposition_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_deposition_type0 getPDBBlock_deposition(){
                               return localPDBBlock_deposition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDBBlock_deposition
                               */
                               public void setPDBBlock_deposition(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_deposition_type0 param){
                            
                                            this.localPDBBlock_deposition=param;
                                    

                               }
                            

                        /**
                        * field for PDBBlock_class
                        */

                        
                                    protected java.lang.String localPDBBlock_class ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPDBBlock_class(){
                               return localPDBBlock_class;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDBBlock_class
                               */
                               public void setPDBBlock_class(java.lang.String param){
                            
                                            this.localPDBBlock_class=param;
                                    

                               }
                            

                        /**
                        * field for PDBBlock_compound
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_compound_type0 localPDBBlock_compound ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_compound_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_compound_type0 getPDBBlock_compound(){
                               return localPDBBlock_compound;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDBBlock_compound
                               */
                               public void setPDBBlock_compound(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_compound_type0 param){
                            
                                            this.localPDBBlock_compound=param;
                                    

                               }
                            

                        /**
                        * field for PDBBlock_source
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_source_type0 localPDBBlock_source ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_source_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_source_type0 getPDBBlock_source(){
                               return localPDBBlock_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDBBlock_source
                               */
                               public void setPDBBlock_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_source_type0 param){
                            
                                            this.localPDBBlock_source=param;
                                    

                               }
                            

                        /**
                        * field for PDBBlock_expMethod
                        */

                        
                                    protected java.lang.String localPDBBlock_expMethod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPDBBlock_expMethodTracker = false ;

                           public boolean isPDBBlock_expMethodSpecified(){
                               return localPDBBlock_expMethodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPDBBlock_expMethod(){
                               return localPDBBlock_expMethod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDBBlock_expMethod
                               */
                               public void setPDBBlock_expMethod(java.lang.String param){
                            localPDBBlock_expMethodTracker = param != null;
                                   
                                            this.localPDBBlock_expMethod=param;
                                    

                               }
                            

                        /**
                        * field for PDBBlock_replace
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_replace_type0 localPDBBlock_replace ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPDBBlock_replaceTracker = false ;

                           public boolean isPDBBlock_replaceSpecified(){
                               return localPDBBlock_replaceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_replace_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_replace_type0 getPDBBlock_replace(){
                               return localPDBBlock_replace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDBBlock_replace
                               */
                               public void setPDBBlock_replace(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_replace_type0 param){
                            localPDBBlock_replaceTracker = param != null;
                                   
                                            this.localPDBBlock_replace=param;
                                    

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
                           namespacePrefix+":PDB-block_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PDB-block_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPDBBlock_deposition==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PDB-block_deposition cannot be null!!");
                                            }
                                           localPDBBlock_deposition.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_deposition"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "PDB-block_class", xmlWriter);
                             

                                          if (localPDBBlock_class==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PDB-block_class cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPDBBlock_class);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localPDBBlock_compound==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PDB-block_compound cannot be null!!");
                                            }
                                           localPDBBlock_compound.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_compound"),
                                               xmlWriter);
                                        
                                            if (localPDBBlock_source==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PDB-block_source cannot be null!!");
                                            }
                                           localPDBBlock_source.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_source"),
                                               xmlWriter);
                                         if (localPDBBlock_expMethodTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "PDB-block_exp-method", xmlWriter);
                             

                                          if (localPDBBlock_expMethod==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PDB-block_exp-method cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPDBBlock_expMethod);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPDBBlock_replaceTracker){
                                            if (localPDBBlock_replace==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PDB-block_replace cannot be null!!");
                                            }
                                           localPDBBlock_replace.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_replace"),
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
                                                                      "PDB-block_deposition"));
                            
                            
                                    if (localPDBBlock_deposition==null){
                                         throw new org.apache.axis2.databinding.ADBException("PDB-block_deposition cannot be null!!");
                                    }
                                    elementList.add(localPDBBlock_deposition);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "PDB-block_class"));
                                 
                                        if (localPDBBlock_class != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPDBBlock_class));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PDB-block_class cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "PDB-block_compound"));
                            
                            
                                    if (localPDBBlock_compound==null){
                                         throw new org.apache.axis2.databinding.ADBException("PDB-block_compound cannot be null!!");
                                    }
                                    elementList.add(localPDBBlock_compound);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "PDB-block_source"));
                            
                            
                                    if (localPDBBlock_source==null){
                                         throw new org.apache.axis2.databinding.ADBException("PDB-block_source cannot be null!!");
                                    }
                                    elementList.add(localPDBBlock_source);
                                 if (localPDBBlock_expMethodTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "PDB-block_exp-method"));
                                 
                                        if (localPDBBlock_expMethod != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPDBBlock_expMethod));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PDB-block_exp-method cannot be null!!");
                                        }
                                    } if (localPDBBlock_replaceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "PDB-block_replace"));
                            
                            
                                    if (localPDBBlock_replace==null){
                                         throw new org.apache.axis2.databinding.ADBException("PDB-block_replace cannot be null!!");
                                    }
                                    elementList.add(localPDBBlock_replace);
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
        public static PDBBlock_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PDBBlock_type0 object =
                new PDBBlock_type0();

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
                    
                            if (!"PDB-block_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PDBBlock_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_deposition").equals(reader.getName())){
                                
                                                object.setPDBBlock_deposition(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_deposition_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_class").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PDB-block_class" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPDBBlock_class(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_compound").equals(reader.getName())){
                                
                                                object.setPDBBlock_compound(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_compound_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_source").equals(reader.getName())){
                                
                                                object.setPDBBlock_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_source_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_exp-method").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PDB-block_exp-method" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPDBBlock_expMethod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","PDB-block_replace").equals(reader.getName())){
                                
                                                object.setPDBBlock_replace(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PDBBlock_replace_type0.Factory.parse(reader));
                                              
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
           
    