
/**
 * GBFeature_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  GBFeature_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GBFeature_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GBFeature_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GBFeature_key
                        */

                        
                                    protected java.lang.String localGBFeature_key ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBFeature_key(){
                               return localGBFeature_key;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_key
                               */
                               public void setGBFeature_key(java.lang.String param){
                            
                                            this.localGBFeature_key=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_location
                        */

                        
                                    protected java.lang.String localGBFeature_location ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBFeature_location(){
                               return localGBFeature_location;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_location
                               */
                               public void setGBFeature_location(java.lang.String param){
                            
                                            this.localGBFeature_location=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_intervals
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_intervals_type0 localGBFeature_intervals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBFeature_intervalsTracker = false ;

                           public boolean isGBFeature_intervalsSpecified(){
                               return localGBFeature_intervalsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_intervals_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_intervals_type0 getGBFeature_intervals(){
                               return localGBFeature_intervals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_intervals
                               */
                               public void setGBFeature_intervals(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_intervals_type0 param){
                            localGBFeature_intervalsTracker = param != null;
                                   
                                            this.localGBFeature_intervals=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_operator
                        */

                        
                                    protected java.lang.String localGBFeature_operator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBFeature_operatorTracker = false ;

                           public boolean isGBFeature_operatorSpecified(){
                               return localGBFeature_operatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBFeature_operator(){
                               return localGBFeature_operator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_operator
                               */
                               public void setGBFeature_operator(java.lang.String param){
                            localGBFeature_operatorTracker = param != null;
                                   
                                            this.localGBFeature_operator=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_partial5
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial5_type0 localGBFeature_partial5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBFeature_partial5Tracker = false ;

                           public boolean isGBFeature_partial5Specified(){
                               return localGBFeature_partial5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial5_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial5_type0 getGBFeature_partial5(){
                               return localGBFeature_partial5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_partial5
                               */
                               public void setGBFeature_partial5(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial5_type0 param){
                            localGBFeature_partial5Tracker = param != null;
                                   
                                            this.localGBFeature_partial5=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_partial3
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial3_type0 localGBFeature_partial3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBFeature_partial3Tracker = false ;

                           public boolean isGBFeature_partial3Specified(){
                               return localGBFeature_partial3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial3_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial3_type0 getGBFeature_partial3(){
                               return localGBFeature_partial3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_partial3
                               */
                               public void setGBFeature_partial3(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial3_type0 param){
                            localGBFeature_partial3Tracker = param != null;
                                   
                                            this.localGBFeature_partial3=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_quals
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_quals_type0 localGBFeature_quals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBFeature_qualsTracker = false ;

                           public boolean isGBFeature_qualsSpecified(){
                               return localGBFeature_qualsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_quals_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_quals_type0 getGBFeature_quals(){
                               return localGBFeature_quals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_quals
                               */
                               public void setGBFeature_quals(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_quals_type0 param){
                            localGBFeature_qualsTracker = param != null;
                                   
                                            this.localGBFeature_quals=param;
                                    

                               }
                            

                        /**
                        * field for GBFeature_xrefs
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_xrefs_type0 localGBFeature_xrefs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBFeature_xrefsTracker = false ;

                           public boolean isGBFeature_xrefsSpecified(){
                               return localGBFeature_xrefsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_xrefs_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_xrefs_type0 getGBFeature_xrefs(){
                               return localGBFeature_xrefs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBFeature_xrefs
                               */
                               public void setGBFeature_xrefs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_xrefs_type0 param){
                            localGBFeature_xrefsTracker = param != null;
                                   
                                            this.localGBFeature_xrefs=param;
                                    

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
                           namespacePrefix+":GBFeature_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GBFeature_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBFeature_key", xmlWriter);
                             

                                          if (localGBFeature_key==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBFeature_key cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBFeature_key);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBFeature_location", xmlWriter);
                             

                                          if (localGBFeature_location==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBFeature_location cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBFeature_location);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBFeature_intervalsTracker){
                                            if (localGBFeature_intervals==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBFeature_intervals cannot be null!!");
                                            }
                                           localGBFeature_intervals.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_intervals"),
                                               xmlWriter);
                                        } if (localGBFeature_operatorTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBFeature_operator", xmlWriter);
                             

                                          if (localGBFeature_operator==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBFeature_operator cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBFeature_operator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBFeature_partial5Tracker){
                                            if (localGBFeature_partial5==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBFeature_partial5 cannot be null!!");
                                            }
                                           localGBFeature_partial5.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_partial5"),
                                               xmlWriter);
                                        } if (localGBFeature_partial3Tracker){
                                            if (localGBFeature_partial3==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBFeature_partial3 cannot be null!!");
                                            }
                                           localGBFeature_partial3.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_partial3"),
                                               xmlWriter);
                                        } if (localGBFeature_qualsTracker){
                                            if (localGBFeature_quals==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBFeature_quals cannot be null!!");
                                            }
                                           localGBFeature_quals.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_quals"),
                                               xmlWriter);
                                        } if (localGBFeature_xrefsTracker){
                                            if (localGBFeature_xrefs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBFeature_xrefs cannot be null!!");
                                            }
                                           localGBFeature_xrefs.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_xrefs"),
                                               xmlWriter);
                                        }
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_key"));
                                 
                                        if (localGBFeature_key != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBFeature_key));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBFeature_key cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_location"));
                                 
                                        if (localGBFeature_location != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBFeature_location));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBFeature_location cannot be null!!");
                                        }
                                     if (localGBFeature_intervalsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_intervals"));
                            
                            
                                    if (localGBFeature_intervals==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBFeature_intervals cannot be null!!");
                                    }
                                    elementList.add(localGBFeature_intervals);
                                } if (localGBFeature_operatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_operator"));
                                 
                                        if (localGBFeature_operator != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBFeature_operator));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBFeature_operator cannot be null!!");
                                        }
                                    } if (localGBFeature_partial5Tracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_partial5"));
                            
                            
                                    if (localGBFeature_partial5==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBFeature_partial5 cannot be null!!");
                                    }
                                    elementList.add(localGBFeature_partial5);
                                } if (localGBFeature_partial3Tracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_partial3"));
                            
                            
                                    if (localGBFeature_partial3==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBFeature_partial3 cannot be null!!");
                                    }
                                    elementList.add(localGBFeature_partial3);
                                } if (localGBFeature_qualsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_quals"));
                            
                            
                                    if (localGBFeature_quals==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBFeature_quals cannot be null!!");
                                    }
                                    elementList.add(localGBFeature_quals);
                                } if (localGBFeature_xrefsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBFeature_xrefs"));
                            
                            
                                    if (localGBFeature_xrefs==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBFeature_xrefs cannot be null!!");
                                    }
                                    elementList.add(localGBFeature_xrefs);
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
        public static GBFeature_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GBFeature_type0 object =
                new GBFeature_type0();

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
                    
                            if (!"GBFeature_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GBFeature_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_key").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBFeature_key" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBFeature_key(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_location").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBFeature_location" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBFeature_location(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_intervals").equals(reader.getName())){
                                
                                                object.setGBFeature_intervals(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_intervals_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_operator").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBFeature_operator" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBFeature_operator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_partial5").equals(reader.getName())){
                                
                                                object.setGBFeature_partial5(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial5_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_partial3").equals(reader.getName())){
                                
                                                object.setGBFeature_partial3(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_partial3_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_quals").equals(reader.getName())){
                                
                                                object.setGBFeature_quals(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_quals_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBFeature_xrefs").equals(reader.getName())){
                                
                                                object.setGBFeature_xrefs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBFeature_xrefs_type0.Factory.parse(reader));
                                              
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
           
    