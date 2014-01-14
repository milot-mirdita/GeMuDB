
/**
 * Value_type48.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Value_type48 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Value_type48
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                "value_type48",
                "ns1");

            

                        /**
                        * field for Value_type48
                        */

                        
                                    protected java.lang.String localValue_type48 ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected Value_type48(java.lang.String value, boolean isRegisterValue) {
                                    localValue_type48 = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localValue_type48, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _embl =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("embl");
                                
                                    public static final java.lang.String _genbank =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("genbank");
                                
                                    public static final java.lang.String _ddbj =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ddbj");
                                
                                    public static final java.lang.String _geninfo =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("geninfo");
                                
                                    public static final java.lang.String _medline =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("medline");
                                
                                    public static final java.lang.String _swissprot =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("swissprot");
                                
                                    public static final java.lang.String _pir =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("pir");
                                
                                    public static final java.lang.String _pdb =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("pdb");
                                
                                    public static final java.lang.String _epd =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("epd");
                                
                                    public static final java.lang.String _ecd =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ecd");
                                
                                    public static final java.lang.String _tfd =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("tfd");
                                
                                    public static final java.lang.String _flybase =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("flybase");
                                
                                    public static final java.lang.String _prosite =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("prosite");
                                
                                    public static final java.lang.String _enzyme =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("enzyme");
                                
                                    public static final java.lang.String _mim =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("mim");
                                
                                    public static final java.lang.String _ecoseq =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ecoseq");
                                
                                    public static final java.lang.String _hiv =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("hiv");
                                
                                    public static final java.lang.String _other =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("other");
                                
                                public static final Value_type48 embl =
                                    new Value_type48(_embl,true);
                            
                                public static final Value_type48 genbank =
                                    new Value_type48(_genbank,true);
                            
                                public static final Value_type48 ddbj =
                                    new Value_type48(_ddbj,true);
                            
                                public static final Value_type48 geninfo =
                                    new Value_type48(_geninfo,true);
                            
                                public static final Value_type48 medline =
                                    new Value_type48(_medline,true);
                            
                                public static final Value_type48 swissprot =
                                    new Value_type48(_swissprot,true);
                            
                                public static final Value_type48 pir =
                                    new Value_type48(_pir,true);
                            
                                public static final Value_type48 pdb =
                                    new Value_type48(_pdb,true);
                            
                                public static final Value_type48 epd =
                                    new Value_type48(_epd,true);
                            
                                public static final Value_type48 ecd =
                                    new Value_type48(_ecd,true);
                            
                                public static final Value_type48 tfd =
                                    new Value_type48(_tfd,true);
                            
                                public static final Value_type48 flybase =
                                    new Value_type48(_flybase,true);
                            
                                public static final Value_type48 prosite =
                                    new Value_type48(_prosite,true);
                            
                                public static final Value_type48 enzyme =
                                    new Value_type48(_enzyme,true);
                            
                                public static final Value_type48 mim =
                                    new Value_type48(_mim,true);
                            
                                public static final Value_type48 ecoseq =
                                    new Value_type48(_ecoseq,true);
                            
                                public static final Value_type48 hiv =
                                    new Value_type48(_hiv,true);
                            
                                public static final Value_type48 other =
                                    new Value_type48(_other,true);
                            

                                public java.lang.String getValue() { return localValue_type48;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localValue_type48.toString();
                                    

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
                                           namespacePrefix+":value_type48",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "value_type48",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localValue_type48==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("value_type48 cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localValue_type48);
                                            
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
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValue_type48)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static Value_type48 fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    Value_type48 enumeration = (Value_type48)
                       
                               _table_.get(value);
                           

                    if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return enumeration;
                }
                public static Value_type48 fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static Value_type48 fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return Value_type48.Factory.fromString(content,namespaceUri);
                    } else {
                       return Value_type48.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Value_type48 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Value_type48 object = null;
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
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"value_type48" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = Value_type48.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = Value_type48.Factory.fromString(content,"");
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
           
    