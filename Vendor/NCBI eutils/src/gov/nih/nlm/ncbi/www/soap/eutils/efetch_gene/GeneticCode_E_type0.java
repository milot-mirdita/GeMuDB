
/**
 * GeneticCode_E_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  GeneticCode_E_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GeneticCode_E_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Genetic-code_E_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localGeneticCode_E_nameTracker = false;
                
                   localGeneticCode_E_idTracker = false;
                
                   localGeneticCode_E_ncbieaaTracker = false;
                
                   localGeneticCode_E_ncbi8AaTracker = false;
                
                   localGeneticCode_E_ncbistdaaTracker = false;
                
                   localGeneticCode_E_sncbieaaTracker = false;
                
                   localGeneticCode_E_sncbi8AaTracker = false;
                
                   localGeneticCode_E_sncbistdaaTracker = false;
                
            }
        

                        /**
                        * field for GeneticCode_E_name
                        */

                        
                                    protected java.lang.String localGeneticCode_E_name ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_nameTracker = false ;

                           public boolean isGeneticCode_E_nameSpecified(){
                               return localGeneticCode_E_nameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneticCode_E_name(){
                               return localGeneticCode_E_name;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_name
                               */
                               public void setGeneticCode_E_name(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_nameTracker = param != null;
                                   
                                            this.localGeneticCode_E_name=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_id
                        */

                        
                                    protected java.math.BigInteger localGeneticCode_E_id ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_idTracker = false ;

                           public boolean isGeneticCode_E_idSpecified(){
                               return localGeneticCode_E_idTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGeneticCode_E_id(){
                               return localGeneticCode_E_id;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_id
                               */
                               public void setGeneticCode_E_id(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_idTracker = param != null;
                                   
                                            this.localGeneticCode_E_id=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_ncbieaa
                        */

                        
                                    protected java.lang.String localGeneticCode_E_ncbieaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_ncbieaaTracker = false ;

                           public boolean isGeneticCode_E_ncbieaaSpecified(){
                               return localGeneticCode_E_ncbieaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneticCode_E_ncbieaa(){
                               return localGeneticCode_E_ncbieaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_ncbieaa
                               */
                               public void setGeneticCode_E_ncbieaa(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_ncbieaaTracker = param != null;
                                   
                                            this.localGeneticCode_E_ncbieaa=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_ncbi8Aa
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localGeneticCode_E_ncbi8Aa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_ncbi8AaTracker = false ;

                           public boolean isGeneticCode_E_ncbi8AaSpecified(){
                               return localGeneticCode_E_ncbi8AaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getGeneticCode_E_ncbi8Aa(){
                               return localGeneticCode_E_ncbi8Aa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_ncbi8Aa
                               */
                               public void setGeneticCode_E_ncbi8Aa(org.apache.axis2.databinding.types.HexBinary param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_ncbi8AaTracker = param != null;
                                   
                                            this.localGeneticCode_E_ncbi8Aa=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_ncbistdaa
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localGeneticCode_E_ncbistdaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_ncbistdaaTracker = false ;

                           public boolean isGeneticCode_E_ncbistdaaSpecified(){
                               return localGeneticCode_E_ncbistdaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getGeneticCode_E_ncbistdaa(){
                               return localGeneticCode_E_ncbistdaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_ncbistdaa
                               */
                               public void setGeneticCode_E_ncbistdaa(org.apache.axis2.databinding.types.HexBinary param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_ncbistdaaTracker = param != null;
                                   
                                            this.localGeneticCode_E_ncbistdaa=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_sncbieaa
                        */

                        
                                    protected java.lang.String localGeneticCode_E_sncbieaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_sncbieaaTracker = false ;

                           public boolean isGeneticCode_E_sncbieaaSpecified(){
                               return localGeneticCode_E_sncbieaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneticCode_E_sncbieaa(){
                               return localGeneticCode_E_sncbieaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_sncbieaa
                               */
                               public void setGeneticCode_E_sncbieaa(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_sncbieaaTracker = param != null;
                                   
                                            this.localGeneticCode_E_sncbieaa=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_sncbi8Aa
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localGeneticCode_E_sncbi8Aa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_sncbi8AaTracker = false ;

                           public boolean isGeneticCode_E_sncbi8AaSpecified(){
                               return localGeneticCode_E_sncbi8AaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getGeneticCode_E_sncbi8Aa(){
                               return localGeneticCode_E_sncbi8Aa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_sncbi8Aa
                               */
                               public void setGeneticCode_E_sncbi8Aa(org.apache.axis2.databinding.types.HexBinary param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_sncbi8AaTracker = param != null;
                                   
                                            this.localGeneticCode_E_sncbi8Aa=param;
                                    

                               }
                            

                        /**
                        * field for GeneticCode_E_sncbistdaa
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localGeneticCode_E_sncbistdaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneticCode_E_sncbistdaaTracker = false ;

                           public boolean isGeneticCode_E_sncbistdaaSpecified(){
                               return localGeneticCode_E_sncbistdaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getGeneticCode_E_sncbistdaa(){
                               return localGeneticCode_E_sncbistdaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneticCode_E_sncbistdaa
                               */
                               public void setGeneticCode_E_sncbistdaa(org.apache.axis2.databinding.types.HexBinary param){
                            
                                clearAllSettingTrackers();
                            localGeneticCode_E_sncbistdaaTracker = param != null;
                                   
                                            this.localGeneticCode_E_sncbistdaa=param;
                                    

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
                           namespacePrefix+":Genetic-code_E_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Genetic-code_E_type0",
                           xmlWriter);
                   }

               
                   }
                if (localGeneticCode_E_nameTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_name", xmlWriter);
                             

                                          if (localGeneticCode_E_name==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneticCode_E_name);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_idTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_id", xmlWriter);
                             

                                          if (localGeneticCode_E_id==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_id cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_id));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_ncbieaaTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_ncbieaa", xmlWriter);
                             

                                          if (localGeneticCode_E_ncbieaa==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_ncbieaa cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneticCode_E_ncbieaa);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_ncbi8AaTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_ncbi8aa", xmlWriter);
                             

                                          if (localGeneticCode_E_ncbi8Aa==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_ncbi8aa cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_ncbi8Aa));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_ncbistdaaTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_ncbistdaa", xmlWriter);
                             

                                          if (localGeneticCode_E_ncbistdaa==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_ncbistdaa cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_ncbistdaa));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_sncbieaaTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_sncbieaa", xmlWriter);
                             

                                          if (localGeneticCode_E_sncbieaa==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_sncbieaa cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneticCode_E_sncbieaa);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_sncbi8AaTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_sncbi8aa", xmlWriter);
                             

                                          if (localGeneticCode_E_sncbi8Aa==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_sncbi8aa cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_sncbi8Aa));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneticCode_E_sncbistdaaTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Genetic-code_E_sncbistdaa", xmlWriter);
                             

                                          if (localGeneticCode_E_sncbistdaa==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_sncbistdaa cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_sncbistdaa));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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

                 if (localGeneticCode_E_nameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_name"));
                                 
                                        if (localGeneticCode_E_name != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_name));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_name cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_idTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_id"));
                                 
                                        if (localGeneticCode_E_id != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_id));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_id cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_ncbieaaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_ncbieaa"));
                                 
                                        if (localGeneticCode_E_ncbieaa != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_ncbieaa));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_ncbieaa cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_ncbi8AaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_ncbi8aa"));
                                 
                                        if (localGeneticCode_E_ncbi8Aa != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_ncbi8Aa));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_ncbi8aa cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_ncbistdaaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_ncbistdaa"));
                                 
                                        if (localGeneticCode_E_ncbistdaa != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_ncbistdaa));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_ncbistdaa cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_sncbieaaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_sncbieaa"));
                                 
                                        if (localGeneticCode_E_sncbieaa != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_sncbieaa));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_sncbieaa cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_sncbi8AaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_sncbi8aa"));
                                 
                                        if (localGeneticCode_E_sncbi8Aa != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_sncbi8Aa));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_sncbi8aa cannot be null!!");
                                        }
                                    } if (localGeneticCode_E_sncbistdaaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Genetic-code_E_sncbistdaa"));
                                 
                                        if (localGeneticCode_E_sncbistdaa != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneticCode_E_sncbistdaa));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Genetic-code_E_sncbistdaa cannot be null!!");
                                        }
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
        public static GeneticCode_E_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GeneticCode_E_type0 object =
                new GeneticCode_E_type0();

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
                    
                            if (!"Genetic-code_E_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GeneticCode_E_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_name(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_id").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_id" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_id(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_ncbieaa").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_ncbieaa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_ncbieaa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_ncbi8aa").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_ncbi8aa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_ncbi8Aa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_ncbistdaa").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_ncbistdaa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_ncbistdaa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_sncbieaa").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_sncbieaa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_sncbieaa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_sncbi8aa").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_sncbi8aa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_sncbi8Aa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Genetic-code_E_sncbistdaa").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Genetic-code_E_sncbistdaa" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneticCode_E_sncbistdaa(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
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
           
    