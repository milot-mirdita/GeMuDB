
/**
 * SeqAlign_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqAlign_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqAlign_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-align_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SeqAlign_type
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_type_type0 localSeqAlign_type ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_type_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_type_type0 getSeqAlign_type(){
                               return localSeqAlign_type;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_type
                               */
                               public void setSeqAlign_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_type_type0 param){
                            
                                            this.localSeqAlign_type=param;
                                    

                               }
                            

                        /**
                        * field for SeqAlign_dim
                        */

                        
                                    protected java.math.BigInteger localSeqAlign_dim ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAlign_dimTracker = false ;

                           public boolean isSeqAlign_dimSpecified(){
                               return localSeqAlign_dimTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSeqAlign_dim(){
                               return localSeqAlign_dim;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_dim
                               */
                               public void setSeqAlign_dim(java.math.BigInteger param){
                            localSeqAlign_dimTracker = param != null;
                                   
                                            this.localSeqAlign_dim=param;
                                    

                               }
                            

                        /**
                        * field for SeqAlign_score
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_score_type0 localSeqAlign_score ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAlign_scoreTracker = false ;

                           public boolean isSeqAlign_scoreSpecified(){
                               return localSeqAlign_scoreTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_score_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_score_type0 getSeqAlign_score(){
                               return localSeqAlign_score;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_score
                               */
                               public void setSeqAlign_score(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_score_type0 param){
                            localSeqAlign_scoreTracker = param != null;
                                   
                                            this.localSeqAlign_score=param;
                                    

                               }
                            

                        /**
                        * field for SeqAlign_segs
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_segs_type0 localSeqAlign_segs ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_segs_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_segs_type0 getSeqAlign_segs(){
                               return localSeqAlign_segs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_segs
                               */
                               public void setSeqAlign_segs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_segs_type0 param){
                            
                                            this.localSeqAlign_segs=param;
                                    

                               }
                            

                        /**
                        * field for SeqAlign_bounds
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_bounds_type0 localSeqAlign_bounds ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAlign_boundsTracker = false ;

                           public boolean isSeqAlign_boundsSpecified(){
                               return localSeqAlign_boundsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_bounds_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_bounds_type0 getSeqAlign_bounds(){
                               return localSeqAlign_bounds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_bounds
                               */
                               public void setSeqAlign_bounds(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_bounds_type0 param){
                            localSeqAlign_boundsTracker = param != null;
                                   
                                            this.localSeqAlign_bounds=param;
                                    

                               }
                            

                        /**
                        * field for SeqAlign_id
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_id_type0 localSeqAlign_id ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAlign_idTracker = false ;

                           public boolean isSeqAlign_idSpecified(){
                               return localSeqAlign_idTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_id_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_id_type0 getSeqAlign_id(){
                               return localSeqAlign_id;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_id
                               */
                               public void setSeqAlign_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_id_type0 param){
                            localSeqAlign_idTracker = param != null;
                                   
                                            this.localSeqAlign_id=param;
                                    

                               }
                            

                        /**
                        * field for SeqAlign_ext
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_ext_type0 localSeqAlign_ext ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAlign_extTracker = false ;

                           public boolean isSeqAlign_extSpecified(){
                               return localSeqAlign_extTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_ext_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_ext_type0 getSeqAlign_ext(){
                               return localSeqAlign_ext;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAlign_ext
                               */
                               public void setSeqAlign_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_ext_type0 param){
                            localSeqAlign_extTracker = param != null;
                                   
                                            this.localSeqAlign_ext=param;
                                    

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
                           namespacePrefix+":Seq-align_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-align_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localSeqAlign_type==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-align_type cannot be null!!");
                                            }
                                           localSeqAlign_type.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_type"),
                                               xmlWriter);
                                         if (localSeqAlign_dimTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-align_dim", xmlWriter);
                             

                                          if (localSeqAlign_dim==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-align_dim cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqAlign_dim));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqAlign_scoreTracker){
                                            if (localSeqAlign_score==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-align_score cannot be null!!");
                                            }
                                           localSeqAlign_score.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_score"),
                                               xmlWriter);
                                        }
                                            if (localSeqAlign_segs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-align_segs cannot be null!!");
                                            }
                                           localSeqAlign_segs.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_segs"),
                                               xmlWriter);
                                         if (localSeqAlign_boundsTracker){
                                            if (localSeqAlign_bounds==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-align_bounds cannot be null!!");
                                            }
                                           localSeqAlign_bounds.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_bounds"),
                                               xmlWriter);
                                        } if (localSeqAlign_idTracker){
                                            if (localSeqAlign_id==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-align_id cannot be null!!");
                                            }
                                           localSeqAlign_id.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_id"),
                                               xmlWriter);
                                        } if (localSeqAlign_extTracker){
                                            if (localSeqAlign_ext==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-align_ext cannot be null!!");
                                            }
                                           localSeqAlign_ext.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_ext"),
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

                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_type"));
                            
                            
                                    if (localSeqAlign_type==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-align_type cannot be null!!");
                                    }
                                    elementList.add(localSeqAlign_type);
                                 if (localSeqAlign_dimTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_dim"));
                                 
                                        if (localSeqAlign_dim != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqAlign_dim));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-align_dim cannot be null!!");
                                        }
                                    } if (localSeqAlign_scoreTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_score"));
                            
                            
                                    if (localSeqAlign_score==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-align_score cannot be null!!");
                                    }
                                    elementList.add(localSeqAlign_score);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_segs"));
                            
                            
                                    if (localSeqAlign_segs==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-align_segs cannot be null!!");
                                    }
                                    elementList.add(localSeqAlign_segs);
                                 if (localSeqAlign_boundsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_bounds"));
                            
                            
                                    if (localSeqAlign_bounds==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-align_bounds cannot be null!!");
                                    }
                                    elementList.add(localSeqAlign_bounds);
                                } if (localSeqAlign_idTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_id"));
                            
                            
                                    if (localSeqAlign_id==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-align_id cannot be null!!");
                                    }
                                    elementList.add(localSeqAlign_id);
                                } if (localSeqAlign_extTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-align_ext"));
                            
                            
                                    if (localSeqAlign_ext==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-align_ext cannot be null!!");
                                    }
                                    elementList.add(localSeqAlign_ext);
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
        public static SeqAlign_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqAlign_type0 object =
                new SeqAlign_type0();

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
                    
                            if (!"Seq-align_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqAlign_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_type").equals(reader.getName())){
                                
                                                object.setSeqAlign_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_type_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_dim").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-align_dim" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqAlign_dim(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_score").equals(reader.getName())){
                                
                                                object.setSeqAlign_score(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_score_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_segs").equals(reader.getName())){
                                
                                                object.setSeqAlign_segs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_segs_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_bounds").equals(reader.getName())){
                                
                                                object.setSeqAlign_bounds(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_bounds_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_id").equals(reader.getName())){
                                
                                                object.setSeqAlign_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_id_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-align_ext").equals(reader.getName())){
                                
                                                object.setSeqAlign_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAlign_ext_type0.Factory.parse(reader));
                                              
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
           
    