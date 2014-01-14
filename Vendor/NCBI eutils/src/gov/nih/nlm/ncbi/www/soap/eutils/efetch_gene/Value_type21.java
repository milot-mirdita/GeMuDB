
/**
 * Value_type21.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Value_type21 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Value_type21
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                "value_type21",
                "ns1");

            

                        /**
                        * field for Value_type21
                        */

                        
                                    protected java.lang.String localValue_type21 ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected Value_type21(java.lang.String value, boolean isRegisterValue) {
                                    localValue_type21 = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localValue_type21, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _value1 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("chromosome");
                                
                                    public static final java.lang.String _value2 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("map");
                                
                                    public static final java.lang.String _value3 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("clone");
                                
                                    public static final java.lang.String _value4 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("subclone");
                                
                                    public static final java.lang.String _value5 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("haplotype");
                                
                                    public static final java.lang.String _value6 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("genotype");
                                
                                    public static final java.lang.String _value7 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("sex");
                                
                                    public static final java.lang.String _value8 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("cell-line");
                                
                                    public static final java.lang.String _value9 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("cell-type");
                                
                                    public static final java.lang.String _value10 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("tissue-type");
                                
                                    public static final java.lang.String _value11 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("clone-lib");
                                
                                    public static final java.lang.String _value12 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("dev-stage");
                                
                                    public static final java.lang.String _value13 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("frequency");
                                
                                    public static final java.lang.String _value14 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("germline");
                                
                                    public static final java.lang.String _value15 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("rearranged");
                                
                                    public static final java.lang.String _value16 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("lab-host");
                                
                                    public static final java.lang.String _value17 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("pop-variant");
                                
                                    public static final java.lang.String _value18 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("tissue-lib");
                                
                                    public static final java.lang.String _value19 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("plasmid-name");
                                
                                    public static final java.lang.String _value20 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("transposon-name");
                                
                                    public static final java.lang.String _value21 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("insertion-seq-name");
                                
                                    public static final java.lang.String _value22 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("plastid-name");
                                
                                    public static final java.lang.String _value23 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("country");
                                
                                    public static final java.lang.String _value24 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("segment");
                                
                                    public static final java.lang.String _value25 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("endogenous-virus-name");
                                
                                    public static final java.lang.String _value26 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("transgenic");
                                
                                    public static final java.lang.String _value27 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("environmental-sample");
                                
                                    public static final java.lang.String _value28 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("isolation-source");
                                
                                    public static final java.lang.String _value29 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("lat-lon");
                                
                                    public static final java.lang.String _value30 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("collection-date");
                                
                                    public static final java.lang.String _value31 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("collected-by");
                                
                                    public static final java.lang.String _value32 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("identified-by");
                                
                                    public static final java.lang.String _value33 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("fwd-primer-seq");
                                
                                    public static final java.lang.String _value34 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("rev-primer-seq");
                                
                                    public static final java.lang.String _value35 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("fwd-primer-name");
                                
                                    public static final java.lang.String _value36 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("rev-primer-name");
                                
                                    public static final java.lang.String _value37 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("metagenomic");
                                
                                    public static final java.lang.String _value38 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("mating-type");
                                
                                    public static final java.lang.String _value39 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("linkage-group");
                                
                                    public static final java.lang.String _value40 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("haplogroup");
                                
                                    public static final java.lang.String _value41 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("other");
                                
                                public static final Value_type21 value1 =
                                    new Value_type21(_value1,true);
                            
                                public static final Value_type21 value2 =
                                    new Value_type21(_value2,true);
                            
                                public static final Value_type21 value3 =
                                    new Value_type21(_value3,true);
                            
                                public static final Value_type21 value4 =
                                    new Value_type21(_value4,true);
                            
                                public static final Value_type21 value5 =
                                    new Value_type21(_value5,true);
                            
                                public static final Value_type21 value6 =
                                    new Value_type21(_value6,true);
                            
                                public static final Value_type21 value7 =
                                    new Value_type21(_value7,true);
                            
                                public static final Value_type21 value8 =
                                    new Value_type21(_value8,true);
                            
                                public static final Value_type21 value9 =
                                    new Value_type21(_value9,true);
                            
                                public static final Value_type21 value10 =
                                    new Value_type21(_value10,true);
                            
                                public static final Value_type21 value11 =
                                    new Value_type21(_value11,true);
                            
                                public static final Value_type21 value12 =
                                    new Value_type21(_value12,true);
                            
                                public static final Value_type21 value13 =
                                    new Value_type21(_value13,true);
                            
                                public static final Value_type21 value14 =
                                    new Value_type21(_value14,true);
                            
                                public static final Value_type21 value15 =
                                    new Value_type21(_value15,true);
                            
                                public static final Value_type21 value16 =
                                    new Value_type21(_value16,true);
                            
                                public static final Value_type21 value17 =
                                    new Value_type21(_value17,true);
                            
                                public static final Value_type21 value18 =
                                    new Value_type21(_value18,true);
                            
                                public static final Value_type21 value19 =
                                    new Value_type21(_value19,true);
                            
                                public static final Value_type21 value20 =
                                    new Value_type21(_value20,true);
                            
                                public static final Value_type21 value21 =
                                    new Value_type21(_value21,true);
                            
                                public static final Value_type21 value22 =
                                    new Value_type21(_value22,true);
                            
                                public static final Value_type21 value23 =
                                    new Value_type21(_value23,true);
                            
                                public static final Value_type21 value24 =
                                    new Value_type21(_value24,true);
                            
                                public static final Value_type21 value25 =
                                    new Value_type21(_value25,true);
                            
                                public static final Value_type21 value26 =
                                    new Value_type21(_value26,true);
                            
                                public static final Value_type21 value27 =
                                    new Value_type21(_value27,true);
                            
                                public static final Value_type21 value28 =
                                    new Value_type21(_value28,true);
                            
                                public static final Value_type21 value29 =
                                    new Value_type21(_value29,true);
                            
                                public static final Value_type21 value30 =
                                    new Value_type21(_value30,true);
                            
                                public static final Value_type21 value31 =
                                    new Value_type21(_value31,true);
                            
                                public static final Value_type21 value32 =
                                    new Value_type21(_value32,true);
                            
                                public static final Value_type21 value33 =
                                    new Value_type21(_value33,true);
                            
                                public static final Value_type21 value34 =
                                    new Value_type21(_value34,true);
                            
                                public static final Value_type21 value35 =
                                    new Value_type21(_value35,true);
                            
                                public static final Value_type21 value36 =
                                    new Value_type21(_value36,true);
                            
                                public static final Value_type21 value37 =
                                    new Value_type21(_value37,true);
                            
                                public static final Value_type21 value38 =
                                    new Value_type21(_value38,true);
                            
                                public static final Value_type21 value39 =
                                    new Value_type21(_value39,true);
                            
                                public static final Value_type21 value40 =
                                    new Value_type21(_value40,true);
                            
                                public static final Value_type21 value41 =
                                    new Value_type21(_value41,true);
                            

                                public java.lang.String getValue() { return localValue_type21;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localValue_type21.toString();
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String _localName = parentQName.getLocalPart();
                        
                            writeStartElement(null, namespace, _localName, xmlWriter);

                            // add the type details if this is used in a simple type
                               if (serializeType){
                                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene");
                                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           namespacePrefix+":value_type21",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "value_type21",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localValue_type21==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("value_type21 cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localValue_type21);
                                            
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


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValue_type21)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static Value_type21 fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    Value_type21 enumeration = (Value_type21)
                       
                               _table_.get(value);
                           

                    if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return enumeration;
                }
                public static Value_type21 fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static Value_type21 fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return Value_type21.Factory.fromString(content,namespaceUri);
                    } else {
                       return Value_type21.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Value_type21 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Value_type21 object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();
            

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"value_type21" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = Value_type21.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = Value_type21.Factory.fromString(content,"");
                                        }
                                        
                                        
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
           
    