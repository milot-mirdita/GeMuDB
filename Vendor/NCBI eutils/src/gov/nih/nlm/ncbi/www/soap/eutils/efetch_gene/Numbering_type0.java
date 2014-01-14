
/**
 * Numbering_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Numbering_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Numbering_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Numbering_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localNumbering_contTracker = false;
                
                   localNumbering_enumTracker = false;
                
                   localNumbering_refTracker = false;
                
                   localNumbering_realTracker = false;
                
            }
        

                        /**
                        * field for Numbering_cont
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_cont_type0 localNumbering_cont ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumbering_contTracker = false ;

                           public boolean isNumbering_contSpecified(){
                               return localNumbering_contTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_cont_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_cont_type0 getNumbering_cont(){
                               return localNumbering_cont;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numbering_cont
                               */
                               public void setNumbering_cont(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_cont_type0 param){
                            
                                clearAllSettingTrackers();
                            localNumbering_contTracker = param != null;
                                   
                                            this.localNumbering_cont=param;
                                    

                               }
                            

                        /**
                        * field for Numbering_enum
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_enum_type0 localNumbering_enum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumbering_enumTracker = false ;

                           public boolean isNumbering_enumSpecified(){
                               return localNumbering_enumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_enum_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_enum_type0 getNumbering_enum(){
                               return localNumbering_enum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numbering_enum
                               */
                               public void setNumbering_enum(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_enum_type0 param){
                            
                                clearAllSettingTrackers();
                            localNumbering_enumTracker = param != null;
                                   
                                            this.localNumbering_enum=param;
                                    

                               }
                            

                        /**
                        * field for Numbering_ref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_ref_type0 localNumbering_ref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumbering_refTracker = false ;

                           public boolean isNumbering_refSpecified(){
                               return localNumbering_refTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_ref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_ref_type0 getNumbering_ref(){
                               return localNumbering_ref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numbering_ref
                               */
                               public void setNumbering_ref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_ref_type0 param){
                            
                                clearAllSettingTrackers();
                            localNumbering_refTracker = param != null;
                                   
                                            this.localNumbering_ref=param;
                                    

                               }
                            

                        /**
                        * field for Numbering_real
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_real_type0 localNumbering_real ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumbering_realTracker = false ;

                           public boolean isNumbering_realSpecified(){
                               return localNumbering_realTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_real_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_real_type0 getNumbering_real(){
                               return localNumbering_real;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numbering_real
                               */
                               public void setNumbering_real(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_real_type0 param){
                            
                                clearAllSettingTrackers();
                            localNumbering_realTracker = param != null;
                                   
                                            this.localNumbering_real=param;
                                    

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
                           namespacePrefix+":Numbering_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Numbering_type0",
                           xmlWriter);
                   }

               
                   }
                if (localNumbering_contTracker){
                                            if (localNumbering_cont==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Numbering_cont cannot be null!!");
                                            }
                                           localNumbering_cont.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_cont"),
                                               xmlWriter);
                                        } if (localNumbering_enumTracker){
                                            if (localNumbering_enum==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Numbering_enum cannot be null!!");
                                            }
                                           localNumbering_enum.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_enum"),
                                               xmlWriter);
                                        } if (localNumbering_refTracker){
                                            if (localNumbering_ref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Numbering_ref cannot be null!!");
                                            }
                                           localNumbering_ref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_ref"),
                                               xmlWriter);
                                        } if (localNumbering_realTracker){
                                            if (localNumbering_real==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Numbering_real cannot be null!!");
                                            }
                                           localNumbering_real.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_real"),
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

                 if (localNumbering_contTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Numbering_cont"));
                            
                            
                                    if (localNumbering_cont==null){
                                         throw new org.apache.axis2.databinding.ADBException("Numbering_cont cannot be null!!");
                                    }
                                    elementList.add(localNumbering_cont);
                                } if (localNumbering_enumTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Numbering_enum"));
                            
                            
                                    if (localNumbering_enum==null){
                                         throw new org.apache.axis2.databinding.ADBException("Numbering_enum cannot be null!!");
                                    }
                                    elementList.add(localNumbering_enum);
                                } if (localNumbering_refTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Numbering_ref"));
                            
                            
                                    if (localNumbering_ref==null){
                                         throw new org.apache.axis2.databinding.ADBException("Numbering_ref cannot be null!!");
                                    }
                                    elementList.add(localNumbering_ref);
                                } if (localNumbering_realTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Numbering_real"));
                            
                            
                                    if (localNumbering_real==null){
                                         throw new org.apache.axis2.databinding.ADBException("Numbering_real cannot be null!!");
                                    }
                                    elementList.add(localNumbering_real);
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
        public static Numbering_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Numbering_type0 object =
                new Numbering_type0();

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
                    
                            if (!"Numbering_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Numbering_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_cont").equals(reader.getName())){
                                
                                                object.setNumbering_cont(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_cont_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_enum").equals(reader.getName())){
                                
                                                object.setNumbering_enum(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_enum_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_ref").equals(reader.getName())){
                                
                                                object.setNumbering_ref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_ref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Numbering_real").equals(reader.getName())){
                                
                                                object.setNumbering_real(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Numbering_real_type0.Factory.parse(reader));
                                              
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
           
    