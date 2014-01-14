
/**
 * GeneTrack_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  GeneTrack_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GeneTrack_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Gene-track_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GeneTrack_geneid
                        */

                        
                                    protected java.math.BigInteger localGeneTrack_geneid ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGeneTrack_geneid(){
                               return localGeneTrack_geneid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneTrack_geneid
                               */
                               public void setGeneTrack_geneid(java.math.BigInteger param){
                            
                                            this.localGeneTrack_geneid=param;
                                    

                               }
                            

                        /**
                        * field for GeneTrack_status
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_status_type0 localGeneTrack_status ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneTrack_statusTracker = false ;

                           public boolean isGeneTrack_statusSpecified(){
                               return localGeneTrack_statusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_status_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_status_type0 getGeneTrack_status(){
                               return localGeneTrack_status;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneTrack_status
                               */
                               public void setGeneTrack_status(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_status_type0 param){
                            localGeneTrack_statusTracker = param != null;
                                   
                                            this.localGeneTrack_status=param;
                                    

                               }
                            

                        /**
                        * field for GeneTrack_currentId
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_currentId_type0 localGeneTrack_currentId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneTrack_currentIdTracker = false ;

                           public boolean isGeneTrack_currentIdSpecified(){
                               return localGeneTrack_currentIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_currentId_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_currentId_type0 getGeneTrack_currentId(){
                               return localGeneTrack_currentId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneTrack_currentId
                               */
                               public void setGeneTrack_currentId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_currentId_type0 param){
                            localGeneTrack_currentIdTracker = param != null;
                                   
                                            this.localGeneTrack_currentId=param;
                                    

                               }
                            

                        /**
                        * field for GeneTrack_createDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_createDate_type0 localGeneTrack_createDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_createDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_createDate_type0 getGeneTrack_createDate(){
                               return localGeneTrack_createDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneTrack_createDate
                               */
                               public void setGeneTrack_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_createDate_type0 param){
                            
                                            this.localGeneTrack_createDate=param;
                                    

                               }
                            

                        /**
                        * field for GeneTrack_updateDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_updateDate_type0 localGeneTrack_updateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_updateDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_updateDate_type0 getGeneTrack_updateDate(){
                               return localGeneTrack_updateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneTrack_updateDate
                               */
                               public void setGeneTrack_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_updateDate_type0 param){
                            
                                            this.localGeneTrack_updateDate=param;
                                    

                               }
                            

                        /**
                        * field for GeneTrack_discontinueDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_discontinueDate_type0 localGeneTrack_discontinueDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneTrack_discontinueDateTracker = false ;

                           public boolean isGeneTrack_discontinueDateSpecified(){
                               return localGeneTrack_discontinueDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_discontinueDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_discontinueDate_type0 getGeneTrack_discontinueDate(){
                               return localGeneTrack_discontinueDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneTrack_discontinueDate
                               */
                               public void setGeneTrack_discontinueDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_discontinueDate_type0 param){
                            localGeneTrack_discontinueDateTracker = param != null;
                                   
                                            this.localGeneTrack_discontinueDate=param;
                                    

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
                           namespacePrefix+":Gene-track_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Gene-track_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-track_geneid", xmlWriter);
                             

                                          if (localGeneTrack_geneid==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-track_geneid cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneTrack_geneid));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGeneTrack_statusTracker){
                                            if (localGeneTrack_status==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-track_status cannot be null!!");
                                            }
                                           localGeneTrack_status.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_status"),
                                               xmlWriter);
                                        } if (localGeneTrack_currentIdTracker){
                                            if (localGeneTrack_currentId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-track_current-id cannot be null!!");
                                            }
                                           localGeneTrack_currentId.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_current-id"),
                                               xmlWriter);
                                        }
                                            if (localGeneTrack_createDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-track_create-date cannot be null!!");
                                            }
                                           localGeneTrack_createDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_create-date"),
                                               xmlWriter);
                                        
                                            if (localGeneTrack_updateDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-track_update-date cannot be null!!");
                                            }
                                           localGeneTrack_updateDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_update-date"),
                                               xmlWriter);
                                         if (localGeneTrack_discontinueDateTracker){
                                            if (localGeneTrack_discontinueDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-track_discontinue-date cannot be null!!");
                                            }
                                           localGeneTrack_discontinueDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_discontinue-date"),
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
                                                                      "Gene-track_geneid"));
                                 
                                        if (localGeneTrack_geneid != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneTrack_geneid));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-track_geneid cannot be null!!");
                                        }
                                     if (localGeneTrack_statusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-track_status"));
                            
                            
                                    if (localGeneTrack_status==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-track_status cannot be null!!");
                                    }
                                    elementList.add(localGeneTrack_status);
                                } if (localGeneTrack_currentIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-track_current-id"));
                            
                            
                                    if (localGeneTrack_currentId==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-track_current-id cannot be null!!");
                                    }
                                    elementList.add(localGeneTrack_currentId);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-track_create-date"));
                            
                            
                                    if (localGeneTrack_createDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-track_create-date cannot be null!!");
                                    }
                                    elementList.add(localGeneTrack_createDate);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-track_update-date"));
                            
                            
                                    if (localGeneTrack_updateDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-track_update-date cannot be null!!");
                                    }
                                    elementList.add(localGeneTrack_updateDate);
                                 if (localGeneTrack_discontinueDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-track_discontinue-date"));
                            
                            
                                    if (localGeneTrack_discontinueDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-track_discontinue-date cannot be null!!");
                                    }
                                    elementList.add(localGeneTrack_discontinueDate);
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
        public static GeneTrack_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GeneTrack_type0 object =
                new GeneTrack_type0();

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
                    
                            if (!"Gene-track_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GeneTrack_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_geneid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-track_geneid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneTrack_geneid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_status").equals(reader.getName())){
                                
                                                object.setGeneTrack_status(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_status_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_current-id").equals(reader.getName())){
                                
                                                object.setGeneTrack_currentId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_currentId_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_create-date").equals(reader.getName())){
                                
                                                object.setGeneTrack_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_createDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_update-date").equals(reader.getName())){
                                
                                                object.setGeneTrack_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_updateDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-track_discontinue-date").equals(reader.getName())){
                                
                                                object.setGeneTrack_discontinueDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneTrack_discontinueDate_type0.Factory.parse(reader));
                                              
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
           
    