
/**
 * IntFuzz_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  IntFuzz_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class IntFuzz_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Int-fuzz_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localIntFuzz_pMTracker = false;
                
                   localIntFuzz_rangeTracker = false;
                
                   localIntFuzz_pctTracker = false;
                
                   localIntFuzz_limTracker = false;
                
                   localIntFuzz_altTracker = false;
                
            }
        

                        /**
                        * field for IntFuzz_pM
                        */

                        
                                    protected java.math.BigInteger localIntFuzz_pM ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntFuzz_pMTracker = false ;

                           public boolean isIntFuzz_pMSpecified(){
                               return localIntFuzz_pMTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getIntFuzz_pM(){
                               return localIntFuzz_pM;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntFuzz_pM
                               */
                               public void setIntFuzz_pM(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localIntFuzz_pMTracker = param != null;
                                   
                                            this.localIntFuzz_pM=param;
                                    

                               }
                            

                        /**
                        * field for IntFuzz_range
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_range_type0 localIntFuzz_range ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntFuzz_rangeTracker = false ;

                           public boolean isIntFuzz_rangeSpecified(){
                               return localIntFuzz_rangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_range_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_range_type0 getIntFuzz_range(){
                               return localIntFuzz_range;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntFuzz_range
                               */
                               public void setIntFuzz_range(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_range_type0 param){
                            
                                clearAllSettingTrackers();
                            localIntFuzz_rangeTracker = param != null;
                                   
                                            this.localIntFuzz_range=param;
                                    

                               }
                            

                        /**
                        * field for IntFuzz_pct
                        */

                        
                                    protected java.math.BigInteger localIntFuzz_pct ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntFuzz_pctTracker = false ;

                           public boolean isIntFuzz_pctSpecified(){
                               return localIntFuzz_pctTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getIntFuzz_pct(){
                               return localIntFuzz_pct;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntFuzz_pct
                               */
                               public void setIntFuzz_pct(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localIntFuzz_pctTracker = param != null;
                                   
                                            this.localIntFuzz_pct=param;
                                    

                               }
                            

                        /**
                        * field for IntFuzz_lim
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_lim_type0 localIntFuzz_lim ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntFuzz_limTracker = false ;

                           public boolean isIntFuzz_limSpecified(){
                               return localIntFuzz_limTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_lim_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_lim_type0 getIntFuzz_lim(){
                               return localIntFuzz_lim;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntFuzz_lim
                               */
                               public void setIntFuzz_lim(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_lim_type0 param){
                            
                                clearAllSettingTrackers();
                            localIntFuzz_limTracker = param != null;
                                   
                                            this.localIntFuzz_lim=param;
                                    

                               }
                            

                        /**
                        * field for IntFuzz_alt
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_alt_type0 localIntFuzz_alt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntFuzz_altTracker = false ;

                           public boolean isIntFuzz_altSpecified(){
                               return localIntFuzz_altTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_alt_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_alt_type0 getIntFuzz_alt(){
                               return localIntFuzz_alt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntFuzz_alt
                               */
                               public void setIntFuzz_alt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_alt_type0 param){
                            
                                clearAllSettingTrackers();
                            localIntFuzz_altTracker = param != null;
                                   
                                            this.localIntFuzz_alt=param;
                                    

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
                           namespacePrefix+":Int-fuzz_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Int-fuzz_type0",
                           xmlWriter);
                   }

               
                   }
                if (localIntFuzz_pMTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Int-fuzz_p-m", xmlWriter);
                             

                                          if (localIntFuzz_pM==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Int-fuzz_p-m cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntFuzz_pM));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIntFuzz_rangeTracker){
                                            if (localIntFuzz_range==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Int-fuzz_range cannot be null!!");
                                            }
                                           localIntFuzz_range.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_range"),
                                               xmlWriter);
                                        } if (localIntFuzz_pctTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Int-fuzz_pct", xmlWriter);
                             

                                          if (localIntFuzz_pct==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Int-fuzz_pct cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntFuzz_pct));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIntFuzz_limTracker){
                                            if (localIntFuzz_lim==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Int-fuzz_lim cannot be null!!");
                                            }
                                           localIntFuzz_lim.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_lim"),
                                               xmlWriter);
                                        } if (localIntFuzz_altTracker){
                                            if (localIntFuzz_alt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Int-fuzz_alt cannot be null!!");
                                            }
                                           localIntFuzz_alt.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_alt"),
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

                 if (localIntFuzz_pMTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Int-fuzz_p-m"));
                                 
                                        if (localIntFuzz_pM != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntFuzz_pM));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Int-fuzz_p-m cannot be null!!");
                                        }
                                    } if (localIntFuzz_rangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Int-fuzz_range"));
                            
                            
                                    if (localIntFuzz_range==null){
                                         throw new org.apache.axis2.databinding.ADBException("Int-fuzz_range cannot be null!!");
                                    }
                                    elementList.add(localIntFuzz_range);
                                } if (localIntFuzz_pctTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Int-fuzz_pct"));
                                 
                                        if (localIntFuzz_pct != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntFuzz_pct));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Int-fuzz_pct cannot be null!!");
                                        }
                                    } if (localIntFuzz_limTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Int-fuzz_lim"));
                            
                            
                                    if (localIntFuzz_lim==null){
                                         throw new org.apache.axis2.databinding.ADBException("Int-fuzz_lim cannot be null!!");
                                    }
                                    elementList.add(localIntFuzz_lim);
                                } if (localIntFuzz_altTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Int-fuzz_alt"));
                            
                            
                                    if (localIntFuzz_alt==null){
                                         throw new org.apache.axis2.databinding.ADBException("Int-fuzz_alt cannot be null!!");
                                    }
                                    elementList.add(localIntFuzz_alt);
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
        public static IntFuzz_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            IntFuzz_type0 object =
                new IntFuzz_type0();

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
                    
                            if (!"Int-fuzz_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (IntFuzz_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_p-m").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Int-fuzz_p-m" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntFuzz_pM(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_range").equals(reader.getName())){
                                
                                                object.setIntFuzz_range(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_range_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_pct").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Int-fuzz_pct" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntFuzz_pct(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_lim").equals(reader.getName())){
                                
                                                object.setIntFuzz_lim(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_lim_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Int-fuzz_alt").equals(reader.getName())){
                                
                                                object.setIntFuzz_alt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.IntFuzz_alt_type0.Factory.parse(reader));
                                              
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
           
    