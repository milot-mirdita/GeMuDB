
/**
 * SeqTableSingleData_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqTableSingleData_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqTableSingleData_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SeqTable-single-data_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqTableSingleData_intTracker = false;
                
                   localSeqTableSingleData_realTracker = false;
                
                   localSeqTableSingleData_stringTracker = false;
                
                   localSeqTableSingleData_bytesTracker = false;
                
                   localSeqTableSingleData_bitTracker = false;
                
                   localSeqTableSingleData_locTracker = false;
                
                   localSeqTableSingleData_idTracker = false;
                
                   localSeqTableSingleData_intervalTracker = false;
                
            }
        

                        /**
                        * field for SeqTableSingleData_int
                        */

                        
                                    protected java.math.BigInteger localSeqTableSingleData_int ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_intTracker = false ;

                           public boolean isSeqTableSingleData_intSpecified(){
                               return localSeqTableSingleData_intTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSeqTableSingleData_int(){
                               return localSeqTableSingleData_int;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_int
                               */
                               public void setSeqTableSingleData_int(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_intTracker = param != null;
                                   
                                            this.localSeqTableSingleData_int=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_real
                        */

                        
                                    protected double localSeqTableSingleData_real ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_realTracker = false ;

                           public boolean isSeqTableSingleData_realSpecified(){
                               return localSeqTableSingleData_realTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getSeqTableSingleData_real(){
                               return localSeqTableSingleData_real;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_real
                               */
                               public void setSeqTableSingleData_real(double param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localSeqTableSingleData_realTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localSeqTableSingleData_real=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_string
                        */

                        
                                    protected java.lang.String localSeqTableSingleData_string ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_stringTracker = false ;

                           public boolean isSeqTableSingleData_stringSpecified(){
                               return localSeqTableSingleData_stringTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqTableSingleData_string(){
                               return localSeqTableSingleData_string;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_string
                               */
                               public void setSeqTableSingleData_string(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_stringTracker = param != null;
                                   
                                            this.localSeqTableSingleData_string=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_bytes
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localSeqTableSingleData_bytes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_bytesTracker = false ;

                           public boolean isSeqTableSingleData_bytesSpecified(){
                               return localSeqTableSingleData_bytesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getSeqTableSingleData_bytes(){
                               return localSeqTableSingleData_bytes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_bytes
                               */
                               public void setSeqTableSingleData_bytes(org.apache.axis2.databinding.types.HexBinary param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_bytesTracker = param != null;
                                   
                                            this.localSeqTableSingleData_bytes=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_bit
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_bit_type0 localSeqTableSingleData_bit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_bitTracker = false ;

                           public boolean isSeqTableSingleData_bitSpecified(){
                               return localSeqTableSingleData_bitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_bit_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_bit_type0 getSeqTableSingleData_bit(){
                               return localSeqTableSingleData_bit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_bit
                               */
                               public void setSeqTableSingleData_bit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_bit_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_bitTracker = param != null;
                                   
                                            this.localSeqTableSingleData_bit=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_loc
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_loc_type0 localSeqTableSingleData_loc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_locTracker = false ;

                           public boolean isSeqTableSingleData_locSpecified(){
                               return localSeqTableSingleData_locTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_loc_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_loc_type0 getSeqTableSingleData_loc(){
                               return localSeqTableSingleData_loc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_loc
                               */
                               public void setSeqTableSingleData_loc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_loc_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_locTracker = param != null;
                                   
                                            this.localSeqTableSingleData_loc=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_id
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_id_type0 localSeqTableSingleData_id ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_idTracker = false ;

                           public boolean isSeqTableSingleData_idSpecified(){
                               return localSeqTableSingleData_idTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_id_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_id_type0 getSeqTableSingleData_id(){
                               return localSeqTableSingleData_id;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_id
                               */
                               public void setSeqTableSingleData_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_id_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_idTracker = param != null;
                                   
                                            this.localSeqTableSingleData_id=param;
                                    

                               }
                            

                        /**
                        * field for SeqTableSingleData_interval
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_interval_type0 localSeqTableSingleData_interval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqTableSingleData_intervalTracker = false ;

                           public boolean isSeqTableSingleData_intervalSpecified(){
                               return localSeqTableSingleData_intervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_interval_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_interval_type0 getSeqTableSingleData_interval(){
                               return localSeqTableSingleData_interval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqTableSingleData_interval
                               */
                               public void setSeqTableSingleData_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_interval_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqTableSingleData_intervalTracker = param != null;
                                   
                                            this.localSeqTableSingleData_interval=param;
                                    

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
                           namespacePrefix+":SeqTable-single-data_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SeqTable-single-data_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqTableSingleData_intTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "SeqTable-single-data_int", xmlWriter);
                             

                                          if (localSeqTableSingleData_int==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_int cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_int));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqTableSingleData_realTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "SeqTable-single-data_real", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localSeqTableSingleData_real)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_real cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_real));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqTableSingleData_stringTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "SeqTable-single-data_string", xmlWriter);
                             

                                          if (localSeqTableSingleData_string==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_string cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqTableSingleData_string);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqTableSingleData_bytesTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "SeqTable-single-data_bytes", xmlWriter);
                             

                                          if (localSeqTableSingleData_bytes==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_bytes cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_bytes));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqTableSingleData_bitTracker){
                                            if (localSeqTableSingleData_bit==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_bit cannot be null!!");
                                            }
                                           localSeqTableSingleData_bit.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_bit"),
                                               xmlWriter);
                                        } if (localSeqTableSingleData_locTracker){
                                            if (localSeqTableSingleData_loc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_loc cannot be null!!");
                                            }
                                           localSeqTableSingleData_loc.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_loc"),
                                               xmlWriter);
                                        } if (localSeqTableSingleData_idTracker){
                                            if (localSeqTableSingleData_id==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_id cannot be null!!");
                                            }
                                           localSeqTableSingleData_id.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_id"),
                                               xmlWriter);
                                        } if (localSeqTableSingleData_intervalTracker){
                                            if (localSeqTableSingleData_interval==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_interval cannot be null!!");
                                            }
                                           localSeqTableSingleData_interval.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_interval"),
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

                 if (localSeqTableSingleData_intTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_int"));
                                 
                                        if (localSeqTableSingleData_int != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_int));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_int cannot be null!!");
                                        }
                                    } if (localSeqTableSingleData_realTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_real"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_real));
                            } if (localSeqTableSingleData_stringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_string"));
                                 
                                        if (localSeqTableSingleData_string != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_string));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_string cannot be null!!");
                                        }
                                    } if (localSeqTableSingleData_bytesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_bytes"));
                                 
                                        if (localSeqTableSingleData_bytes != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqTableSingleData_bytes));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_bytes cannot be null!!");
                                        }
                                    } if (localSeqTableSingleData_bitTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_bit"));
                            
                            
                                    if (localSeqTableSingleData_bit==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_bit cannot be null!!");
                                    }
                                    elementList.add(localSeqTableSingleData_bit);
                                } if (localSeqTableSingleData_locTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_loc"));
                            
                            
                                    if (localSeqTableSingleData_loc==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_loc cannot be null!!");
                                    }
                                    elementList.add(localSeqTableSingleData_loc);
                                } if (localSeqTableSingleData_idTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_id"));
                            
                            
                                    if (localSeqTableSingleData_id==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_id cannot be null!!");
                                    }
                                    elementList.add(localSeqTableSingleData_id);
                                } if (localSeqTableSingleData_intervalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqTable-single-data_interval"));
                            
                            
                                    if (localSeqTableSingleData_interval==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqTable-single-data_interval cannot be null!!");
                                    }
                                    elementList.add(localSeqTableSingleData_interval);
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
        public static SeqTableSingleData_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqTableSingleData_type0 object =
                new SeqTableSingleData_type0();

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
                    
                            if (!"SeqTable-single-data_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqTableSingleData_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_int").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SeqTable-single-data_int" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqTableSingleData_int(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_real").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SeqTable-single-data_real" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqTableSingleData_real(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_string").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SeqTable-single-data_string" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqTableSingleData_string(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_bytes").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SeqTable-single-data_bytes" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqTableSingleData_bytes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_bit").equals(reader.getName())){
                                
                                                object.setSeqTableSingleData_bit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_bit_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_loc").equals(reader.getName())){
                                
                                                object.setSeqTableSingleData_loc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_loc_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_id").equals(reader.getName())){
                                
                                                object.setSeqTableSingleData_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_id_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqTable-single-data_interval").equals(reader.getName())){
                                
                                                object.setSeqTableSingleData_interval(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqTableSingleData_interval_type0.Factory.parse(reader));
                                              
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
           
    