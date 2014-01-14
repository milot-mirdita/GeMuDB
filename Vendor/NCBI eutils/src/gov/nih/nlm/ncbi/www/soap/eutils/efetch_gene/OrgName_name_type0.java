
/**
 * OrgName_name_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  OrgName_name_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OrgName_name_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OrgName_name_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localOrgName_name_binomialTracker = false;
                
                   localOrgName_name_virusTracker = false;
                
                   localOrgName_name_hybridTracker = false;
                
                   localOrgName_name_namedhybridTracker = false;
                
                   localOrgName_name_partialTracker = false;
                
            }
        

                        /**
                        * field for OrgName_name_binomial
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_binomial_type0 localOrgName_name_binomial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgName_name_binomialTracker = false ;

                           public boolean isOrgName_name_binomialSpecified(){
                               return localOrgName_name_binomialTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_binomial_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_binomial_type0 getOrgName_name_binomial(){
                               return localOrgName_name_binomial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgName_name_binomial
                               */
                               public void setOrgName_name_binomial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_binomial_type0 param){
                            
                                clearAllSettingTrackers();
                            localOrgName_name_binomialTracker = param != null;
                                   
                                            this.localOrgName_name_binomial=param;
                                    

                               }
                            

                        /**
                        * field for OrgName_name_virus
                        */

                        
                                    protected java.lang.String localOrgName_name_virus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgName_name_virusTracker = false ;

                           public boolean isOrgName_name_virusSpecified(){
                               return localOrgName_name_virusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrgName_name_virus(){
                               return localOrgName_name_virus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgName_name_virus
                               */
                               public void setOrgName_name_virus(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localOrgName_name_virusTracker = param != null;
                                   
                                            this.localOrgName_name_virus=param;
                                    

                               }
                            

                        /**
                        * field for OrgName_name_hybrid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_hybrid_type0 localOrgName_name_hybrid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgName_name_hybridTracker = false ;

                           public boolean isOrgName_name_hybridSpecified(){
                               return localOrgName_name_hybridTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_hybrid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_hybrid_type0 getOrgName_name_hybrid(){
                               return localOrgName_name_hybrid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgName_name_hybrid
                               */
                               public void setOrgName_name_hybrid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_hybrid_type0 param){
                            
                                clearAllSettingTrackers();
                            localOrgName_name_hybridTracker = param != null;
                                   
                                            this.localOrgName_name_hybrid=param;
                                    

                               }
                            

                        /**
                        * field for OrgName_name_namedhybrid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_namedhybrid_type0 localOrgName_name_namedhybrid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgName_name_namedhybridTracker = false ;

                           public boolean isOrgName_name_namedhybridSpecified(){
                               return localOrgName_name_namedhybridTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_namedhybrid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_namedhybrid_type0 getOrgName_name_namedhybrid(){
                               return localOrgName_name_namedhybrid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgName_name_namedhybrid
                               */
                               public void setOrgName_name_namedhybrid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_namedhybrid_type0 param){
                            
                                clearAllSettingTrackers();
                            localOrgName_name_namedhybridTracker = param != null;
                                   
                                            this.localOrgName_name_namedhybrid=param;
                                    

                               }
                            

                        /**
                        * field for OrgName_name_partial
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_partial_type0 localOrgName_name_partial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrgName_name_partialTracker = false ;

                           public boolean isOrgName_name_partialSpecified(){
                               return localOrgName_name_partialTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_partial_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_partial_type0 getOrgName_name_partial(){
                               return localOrgName_name_partial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrgName_name_partial
                               */
                               public void setOrgName_name_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_partial_type0 param){
                            
                                clearAllSettingTrackers();
                            localOrgName_name_partialTracker = param != null;
                                   
                                            this.localOrgName_name_partial=param;
                                    

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
                           namespacePrefix+":OrgName_name_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OrgName_name_type0",
                           xmlWriter);
                   }

               
                   }
                if (localOrgName_name_binomialTracker){
                                            if (localOrgName_name_binomial==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OrgName_name_binomial cannot be null!!");
                                            }
                                           localOrgName_name_binomial.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_binomial"),
                                               xmlWriter);
                                        } if (localOrgName_name_virusTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "OrgName_name_virus", xmlWriter);
                             

                                          if (localOrgName_name_virus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OrgName_name_virus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrgName_name_virus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrgName_name_hybridTracker){
                                            if (localOrgName_name_hybrid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OrgName_name_hybrid cannot be null!!");
                                            }
                                           localOrgName_name_hybrid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_hybrid"),
                                               xmlWriter);
                                        } if (localOrgName_name_namedhybridTracker){
                                            if (localOrgName_name_namedhybrid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OrgName_name_namedhybrid cannot be null!!");
                                            }
                                           localOrgName_name_namedhybrid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_namedhybrid"),
                                               xmlWriter);
                                        } if (localOrgName_name_partialTracker){
                                            if (localOrgName_name_partial==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OrgName_name_partial cannot be null!!");
                                            }
                                           localOrgName_name_partial.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_partial"),
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

                 if (localOrgName_name_binomialTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "OrgName_name_binomial"));
                            
                            
                                    if (localOrgName_name_binomial==null){
                                         throw new org.apache.axis2.databinding.ADBException("OrgName_name_binomial cannot be null!!");
                                    }
                                    elementList.add(localOrgName_name_binomial);
                                } if (localOrgName_name_virusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "OrgName_name_virus"));
                                 
                                        if (localOrgName_name_virus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrgName_name_virus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OrgName_name_virus cannot be null!!");
                                        }
                                    } if (localOrgName_name_hybridTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "OrgName_name_hybrid"));
                            
                            
                                    if (localOrgName_name_hybrid==null){
                                         throw new org.apache.axis2.databinding.ADBException("OrgName_name_hybrid cannot be null!!");
                                    }
                                    elementList.add(localOrgName_name_hybrid);
                                } if (localOrgName_name_namedhybridTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "OrgName_name_namedhybrid"));
                            
                            
                                    if (localOrgName_name_namedhybrid==null){
                                         throw new org.apache.axis2.databinding.ADBException("OrgName_name_namedhybrid cannot be null!!");
                                    }
                                    elementList.add(localOrgName_name_namedhybrid);
                                } if (localOrgName_name_partialTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "OrgName_name_partial"));
                            
                            
                                    if (localOrgName_name_partial==null){
                                         throw new org.apache.axis2.databinding.ADBException("OrgName_name_partial cannot be null!!");
                                    }
                                    elementList.add(localOrgName_name_partial);
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
        public static OrgName_name_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OrgName_name_type0 object =
                new OrgName_name_type0();

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
                    
                            if (!"OrgName_name_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OrgName_name_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_binomial").equals(reader.getName())){
                                
                                                object.setOrgName_name_binomial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_binomial_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_virus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"OrgName_name_virus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrgName_name_virus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_hybrid").equals(reader.getName())){
                                
                                                object.setOrgName_name_hybrid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_hybrid_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_namedhybrid").equals(reader.getName())){
                                
                                                object.setOrgName_name_namedhybrid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_namedhybrid_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","OrgName_name_partial").equals(reader.getName())){
                                
                                                object.setOrgName_name_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.OrgName_name_partial_type0.Factory.parse(reader));
                                              
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
           
    