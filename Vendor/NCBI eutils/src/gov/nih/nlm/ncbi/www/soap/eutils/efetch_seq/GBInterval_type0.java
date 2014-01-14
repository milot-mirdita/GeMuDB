
/**
 * GBInterval_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  GBInterval_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GBInterval_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GBInterval_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GBInterval_from
                        */

                        
                                    protected java.math.BigInteger localGBInterval_from ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBInterval_fromTracker = false ;

                           public boolean isGBInterval_fromSpecified(){
                               return localGBInterval_fromTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGBInterval_from(){
                               return localGBInterval_from;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBInterval_from
                               */
                               public void setGBInterval_from(java.math.BigInteger param){
                            localGBInterval_fromTracker = param != null;
                                   
                                            this.localGBInterval_from=param;
                                    

                               }
                            

                        /**
                        * field for GBInterval_to
                        */

                        
                                    protected java.math.BigInteger localGBInterval_to ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBInterval_toTracker = false ;

                           public boolean isGBInterval_toSpecified(){
                               return localGBInterval_toTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGBInterval_to(){
                               return localGBInterval_to;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBInterval_to
                               */
                               public void setGBInterval_to(java.math.BigInteger param){
                            localGBInterval_toTracker = param != null;
                                   
                                            this.localGBInterval_to=param;
                                    

                               }
                            

                        /**
                        * field for GBInterval_point
                        */

                        
                                    protected java.math.BigInteger localGBInterval_point ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBInterval_pointTracker = false ;

                           public boolean isGBInterval_pointSpecified(){
                               return localGBInterval_pointTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGBInterval_point(){
                               return localGBInterval_point;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBInterval_point
                               */
                               public void setGBInterval_point(java.math.BigInteger param){
                            localGBInterval_pointTracker = param != null;
                                   
                                            this.localGBInterval_point=param;
                                    

                               }
                            

                        /**
                        * field for GBInterval_iscomp
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_iscomp_type0 localGBInterval_iscomp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBInterval_iscompTracker = false ;

                           public boolean isGBInterval_iscompSpecified(){
                               return localGBInterval_iscompTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_iscomp_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_iscomp_type0 getGBInterval_iscomp(){
                               return localGBInterval_iscomp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBInterval_iscomp
                               */
                               public void setGBInterval_iscomp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_iscomp_type0 param){
                            localGBInterval_iscompTracker = param != null;
                                   
                                            this.localGBInterval_iscomp=param;
                                    

                               }
                            

                        /**
                        * field for GBInterval_interbp
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_interbp_type0 localGBInterval_interbp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBInterval_interbpTracker = false ;

                           public boolean isGBInterval_interbpSpecified(){
                               return localGBInterval_interbpTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_interbp_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_interbp_type0 getGBInterval_interbp(){
                               return localGBInterval_interbp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBInterval_interbp
                               */
                               public void setGBInterval_interbp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_interbp_type0 param){
                            localGBInterval_interbpTracker = param != null;
                                   
                                            this.localGBInterval_interbp=param;
                                    

                               }
                            

                        /**
                        * field for GBInterval_accession
                        */

                        
                                    protected java.lang.String localGBInterval_accession ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBInterval_accession(){
                               return localGBInterval_accession;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBInterval_accession
                               */
                               public void setGBInterval_accession(java.lang.String param){
                            
                                            this.localGBInterval_accession=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":GBInterval_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GBInterval_type0",
                           xmlWriter);
                   }

               
                   }
                if (localGBInterval_fromTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBInterval_from", xmlWriter);
                             

                                          if (localGBInterval_from==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBInterval_from cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_from));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBInterval_toTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBInterval_to", xmlWriter);
                             

                                          if (localGBInterval_to==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBInterval_to cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_to));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBInterval_pointTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBInterval_point", xmlWriter);
                             

                                          if (localGBInterval_point==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBInterval_point cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_point));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBInterval_iscompTracker){
                                            if (localGBInterval_iscomp==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBInterval_iscomp cannot be null!!");
                                            }
                                           localGBInterval_iscomp.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_iscomp"),
                                               xmlWriter);
                                        } if (localGBInterval_interbpTracker){
                                            if (localGBInterval_interbp==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBInterval_interbp cannot be null!!");
                                            }
                                           localGBInterval_interbp.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_interbp"),
                                               xmlWriter);
                                        }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBInterval_accession", xmlWriter);
                             

                                          if (localGBInterval_accession==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBInterval_accession cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBInterval_accession);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq")){
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

                 if (localGBInterval_fromTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBInterval_from"));
                                 
                                        if (localGBInterval_from != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_from));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBInterval_from cannot be null!!");
                                        }
                                    } if (localGBInterval_toTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBInterval_to"));
                                 
                                        if (localGBInterval_to != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_to));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBInterval_to cannot be null!!");
                                        }
                                    } if (localGBInterval_pointTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBInterval_point"));
                                 
                                        if (localGBInterval_point != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_point));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBInterval_point cannot be null!!");
                                        }
                                    } if (localGBInterval_iscompTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBInterval_iscomp"));
                            
                            
                                    if (localGBInterval_iscomp==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBInterval_iscomp cannot be null!!");
                                    }
                                    elementList.add(localGBInterval_iscomp);
                                } if (localGBInterval_interbpTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBInterval_interbp"));
                            
                            
                                    if (localGBInterval_interbp==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBInterval_interbp cannot be null!!");
                                    }
                                    elementList.add(localGBInterval_interbp);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBInterval_accession"));
                                 
                                        if (localGBInterval_accession != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBInterval_accession));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBInterval_accession cannot be null!!");
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
        public static GBInterval_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GBInterval_type0 object =
                new GBInterval_type0();

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
                    
                            if (!"GBInterval_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GBInterval_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_from").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBInterval_from" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBInterval_from(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_to").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBInterval_to" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBInterval_to(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_point").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBInterval_point" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBInterval_point(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_iscomp").equals(reader.getName())){
                                
                                                object.setGBInterval_iscomp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_iscomp_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_interbp").equals(reader.getName())){
                                
                                                object.setGBInterval_interbp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBInterval_interbp_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBInterval_accession").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBInterval_accession" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBInterval_accession(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    