
/**
 * Annotdesc_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Annotdesc_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Annotdesc_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Annotdesc_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localAnnotdesc_nameTracker = false;
                
                   localAnnotdesc_titleTracker = false;
                
                   localAnnotdesc_commentTracker = false;
                
                   localAnnotdesc_pubTracker = false;
                
                   localAnnotdesc_userTracker = false;
                
                   localAnnotdesc_createDateTracker = false;
                
                   localAnnotdesc_updateDateTracker = false;
                
                   localAnnotdesc_srcTracker = false;
                
                   localAnnotdesc_alignTracker = false;
                
                   localAnnotdesc_regionTracker = false;
                
            }
        

                        /**
                        * field for Annotdesc_name
                        */

                        
                                    protected java.lang.String localAnnotdesc_name ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_nameTracker = false ;

                           public boolean isAnnotdesc_nameSpecified(){
                               return localAnnotdesc_nameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAnnotdesc_name(){
                               return localAnnotdesc_name;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_name
                               */
                               public void setAnnotdesc_name(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_nameTracker = param != null;
                                   
                                            this.localAnnotdesc_name=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_title
                        */

                        
                                    protected java.lang.String localAnnotdesc_title ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_titleTracker = false ;

                           public boolean isAnnotdesc_titleSpecified(){
                               return localAnnotdesc_titleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAnnotdesc_title(){
                               return localAnnotdesc_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_title
                               */
                               public void setAnnotdesc_title(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_titleTracker = param != null;
                                   
                                            this.localAnnotdesc_title=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_comment
                        */

                        
                                    protected java.lang.String localAnnotdesc_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_commentTracker = false ;

                           public boolean isAnnotdesc_commentSpecified(){
                               return localAnnotdesc_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAnnotdesc_comment(){
                               return localAnnotdesc_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_comment
                               */
                               public void setAnnotdesc_comment(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_commentTracker = param != null;
                                   
                                            this.localAnnotdesc_comment=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_pub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_pub_type0 localAnnotdesc_pub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_pubTracker = false ;

                           public boolean isAnnotdesc_pubSpecified(){
                               return localAnnotdesc_pubTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_pub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_pub_type0 getAnnotdesc_pub(){
                               return localAnnotdesc_pub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_pub
                               */
                               public void setAnnotdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_pub_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_pubTracker = param != null;
                                   
                                            this.localAnnotdesc_pub=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_user
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_user_type0 localAnnotdesc_user ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_userTracker = false ;

                           public boolean isAnnotdesc_userSpecified(){
                               return localAnnotdesc_userTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_user_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_user_type0 getAnnotdesc_user(){
                               return localAnnotdesc_user;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_user
                               */
                               public void setAnnotdesc_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_user_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_userTracker = param != null;
                                   
                                            this.localAnnotdesc_user=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_createDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_createDate_type0 localAnnotdesc_createDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_createDateTracker = false ;

                           public boolean isAnnotdesc_createDateSpecified(){
                               return localAnnotdesc_createDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_createDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_createDate_type0 getAnnotdesc_createDate(){
                               return localAnnotdesc_createDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_createDate
                               */
                               public void setAnnotdesc_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_createDate_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_createDateTracker = param != null;
                                   
                                            this.localAnnotdesc_createDate=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_updateDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_updateDate_type0 localAnnotdesc_updateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_updateDateTracker = false ;

                           public boolean isAnnotdesc_updateDateSpecified(){
                               return localAnnotdesc_updateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_updateDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_updateDate_type0 getAnnotdesc_updateDate(){
                               return localAnnotdesc_updateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_updateDate
                               */
                               public void setAnnotdesc_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_updateDate_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_updateDateTracker = param != null;
                                   
                                            this.localAnnotdesc_updateDate=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_src
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_src_type0 localAnnotdesc_src ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_srcTracker = false ;

                           public boolean isAnnotdesc_srcSpecified(){
                               return localAnnotdesc_srcTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_src_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_src_type0 getAnnotdesc_src(){
                               return localAnnotdesc_src;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_src
                               */
                               public void setAnnotdesc_src(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_src_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_srcTracker = param != null;
                                   
                                            this.localAnnotdesc_src=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_align
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_align_type0 localAnnotdesc_align ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_alignTracker = false ;

                           public boolean isAnnotdesc_alignSpecified(){
                               return localAnnotdesc_alignTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_align_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_align_type0 getAnnotdesc_align(){
                               return localAnnotdesc_align;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_align
                               */
                               public void setAnnotdesc_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_align_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_alignTracker = param != null;
                                   
                                            this.localAnnotdesc_align=param;
                                    

                               }
                            

                        /**
                        * field for Annotdesc_region
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_region_type0 localAnnotdesc_region ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotdesc_regionTracker = false ;

                           public boolean isAnnotdesc_regionSpecified(){
                               return localAnnotdesc_regionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_region_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_region_type0 getAnnotdesc_region(){
                               return localAnnotdesc_region;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotdesc_region
                               */
                               public void setAnnotdesc_region(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_region_type0 param){
                            
                                clearAllSettingTrackers();
                            localAnnotdesc_regionTracker = param != null;
                                   
                                            this.localAnnotdesc_region=param;
                                    

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
                           namespacePrefix+":Annotdesc_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Annotdesc_type0",
                           xmlWriter);
                   }

               
                   }
                if (localAnnotdesc_nameTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Annotdesc_name", xmlWriter);
                             

                                          if (localAnnotdesc_name==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Annotdesc_name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAnnotdesc_name);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAnnotdesc_titleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Annotdesc_title", xmlWriter);
                             

                                          if (localAnnotdesc_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Annotdesc_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAnnotdesc_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAnnotdesc_commentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Annotdesc_comment", xmlWriter);
                             

                                          if (localAnnotdesc_comment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Annotdesc_comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAnnotdesc_comment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAnnotdesc_pubTracker){
                                            if (localAnnotdesc_pub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_pub cannot be null!!");
                                            }
                                           localAnnotdesc_pub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_pub"),
                                               xmlWriter);
                                        } if (localAnnotdesc_userTracker){
                                            if (localAnnotdesc_user==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_user cannot be null!!");
                                            }
                                           localAnnotdesc_user.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_user"),
                                               xmlWriter);
                                        } if (localAnnotdesc_createDateTracker){
                                            if (localAnnotdesc_createDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_create-date cannot be null!!");
                                            }
                                           localAnnotdesc_createDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_create-date"),
                                               xmlWriter);
                                        } if (localAnnotdesc_updateDateTracker){
                                            if (localAnnotdesc_updateDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_update-date cannot be null!!");
                                            }
                                           localAnnotdesc_updateDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_update-date"),
                                               xmlWriter);
                                        } if (localAnnotdesc_srcTracker){
                                            if (localAnnotdesc_src==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_src cannot be null!!");
                                            }
                                           localAnnotdesc_src.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_src"),
                                               xmlWriter);
                                        } if (localAnnotdesc_alignTracker){
                                            if (localAnnotdesc_align==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_align cannot be null!!");
                                            }
                                           localAnnotdesc_align.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_align"),
                                               xmlWriter);
                                        } if (localAnnotdesc_regionTracker){
                                            if (localAnnotdesc_region==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Annotdesc_region cannot be null!!");
                                            }
                                           localAnnotdesc_region.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_region"),
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

                 if (localAnnotdesc_nameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_name"));
                                 
                                        if (localAnnotdesc_name != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnnotdesc_name));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Annotdesc_name cannot be null!!");
                                        }
                                    } if (localAnnotdesc_titleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_title"));
                                 
                                        if (localAnnotdesc_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnnotdesc_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Annotdesc_title cannot be null!!");
                                        }
                                    } if (localAnnotdesc_commentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_comment"));
                                 
                                        if (localAnnotdesc_comment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAnnotdesc_comment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Annotdesc_comment cannot be null!!");
                                        }
                                    } if (localAnnotdesc_pubTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_pub"));
                            
                            
                                    if (localAnnotdesc_pub==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_pub cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_pub);
                                } if (localAnnotdesc_userTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_user"));
                            
                            
                                    if (localAnnotdesc_user==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_user cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_user);
                                } if (localAnnotdesc_createDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_create-date"));
                            
                            
                                    if (localAnnotdesc_createDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_create-date cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_createDate);
                                } if (localAnnotdesc_updateDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_update-date"));
                            
                            
                                    if (localAnnotdesc_updateDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_update-date cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_updateDate);
                                } if (localAnnotdesc_srcTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_src"));
                            
                            
                                    if (localAnnotdesc_src==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_src cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_src);
                                } if (localAnnotdesc_alignTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_align"));
                            
                            
                                    if (localAnnotdesc_align==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_align cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_align);
                                } if (localAnnotdesc_regionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Annotdesc_region"));
                            
                            
                                    if (localAnnotdesc_region==null){
                                         throw new org.apache.axis2.databinding.ADBException("Annotdesc_region cannot be null!!");
                                    }
                                    elementList.add(localAnnotdesc_region);
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
        public static Annotdesc_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Annotdesc_type0 object =
                new Annotdesc_type0();

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
                    
                            if (!"Annotdesc_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Annotdesc_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Annotdesc_name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAnnotdesc_name(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Annotdesc_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAnnotdesc_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Annotdesc_comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAnnotdesc_comment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_pub").equals(reader.getName())){
                                
                                                object.setAnnotdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_pub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_user").equals(reader.getName())){
                                
                                                object.setAnnotdesc_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_user_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_create-date").equals(reader.getName())){
                                
                                                object.setAnnotdesc_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_createDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_update-date").equals(reader.getName())){
                                
                                                object.setAnnotdesc_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_updateDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_src").equals(reader.getName())){
                                
                                                object.setAnnotdesc_src(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_src_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_align").equals(reader.getName())){
                                
                                                object.setAnnotdesc_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_align_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Annotdesc_region").equals(reader.getName())){
                                
                                                object.setAnnotdesc_region(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Annotdesc_region_type0.Factory.parse(reader));
                                              
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
           
    