
/**
 * PackedSeg_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  PackedSeg_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PackedSeg_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Packed-seg_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for PackedSeg_dim
                        */

                        
                                    protected java.math.BigInteger localPackedSeg_dim =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger("2");
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getPackedSeg_dim(){
                               return localPackedSeg_dim;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_dim
                               */
                               public void setPackedSeg_dim(java.math.BigInteger param){
                            
                                            this.localPackedSeg_dim=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_numseg
                        */

                        
                                    protected java.math.BigInteger localPackedSeg_numseg ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getPackedSeg_numseg(){
                               return localPackedSeg_numseg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_numseg
                               */
                               public void setPackedSeg_numseg(java.math.BigInteger param){
                            
                                            this.localPackedSeg_numseg=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_ids
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_ids_type0 localPackedSeg_ids ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_ids_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_ids_type0 getPackedSeg_ids(){
                               return localPackedSeg_ids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_ids
                               */
                               public void setPackedSeg_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_ids_type0 param){
                            
                                            this.localPackedSeg_ids=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_starts
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_starts_type0 localPackedSeg_starts ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_starts_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_starts_type0 getPackedSeg_starts(){
                               return localPackedSeg_starts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_starts
                               */
                               public void setPackedSeg_starts(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_starts_type0 param){
                            
                                            this.localPackedSeg_starts=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_present
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localPackedSeg_present ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getPackedSeg_present(){
                               return localPackedSeg_present;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_present
                               */
                               public void setPackedSeg_present(org.apache.axis2.databinding.types.HexBinary param){
                            
                                            this.localPackedSeg_present=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_lens
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_lens_type0 localPackedSeg_lens ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_lens_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_lens_type0 getPackedSeg_lens(){
                               return localPackedSeg_lens;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_lens
                               */
                               public void setPackedSeg_lens(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_lens_type0 param){
                            
                                            this.localPackedSeg_lens=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_strands
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_strands_type0 localPackedSeg_strands ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackedSeg_strandsTracker = false ;

                           public boolean isPackedSeg_strandsSpecified(){
                               return localPackedSeg_strandsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_strands_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_strands_type0 getPackedSeg_strands(){
                               return localPackedSeg_strands;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_strands
                               */
                               public void setPackedSeg_strands(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_strands_type0 param){
                            localPackedSeg_strandsTracker = param != null;
                                   
                                            this.localPackedSeg_strands=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeg_scores
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_scores_type0 localPackedSeg_scores ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackedSeg_scoresTracker = false ;

                           public boolean isPackedSeg_scoresSpecified(){
                               return localPackedSeg_scoresTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_scores_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_scores_type0 getPackedSeg_scores(){
                               return localPackedSeg_scores;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeg_scores
                               */
                               public void setPackedSeg_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_scores_type0 param){
                            localPackedSeg_scoresTracker = param != null;
                                   
                                            this.localPackedSeg_scores=param;
                                    

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
                           namespacePrefix+":Packed-seg_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Packed-seg_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Packed-seg_dim", xmlWriter);
                             

                                          if (localPackedSeg_dim==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Packed-seg_dim cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackedSeg_dim));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Packed-seg_numseg", xmlWriter);
                             

                                          if (localPackedSeg_numseg==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Packed-seg_numseg cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackedSeg_numseg));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localPackedSeg_ids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seg_ids cannot be null!!");
                                            }
                                           localPackedSeg_ids.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_ids"),
                                               xmlWriter);
                                        
                                            if (localPackedSeg_starts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seg_starts cannot be null!!");
                                            }
                                           localPackedSeg_starts.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_starts"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Packed-seg_present", xmlWriter);
                             

                                          if (localPackedSeg_present==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Packed-seg_present cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackedSeg_present));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localPackedSeg_lens==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seg_lens cannot be null!!");
                                            }
                                           localPackedSeg_lens.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_lens"),
                                               xmlWriter);
                                         if (localPackedSeg_strandsTracker){
                                            if (localPackedSeg_strands==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seg_strands cannot be null!!");
                                            }
                                           localPackedSeg_strands.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_strands"),
                                               xmlWriter);
                                        } if (localPackedSeg_scoresTracker){
                                            if (localPackedSeg_scores==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seg_scores cannot be null!!");
                                            }
                                           localPackedSeg_scores.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_scores"),
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
                                                                      "Packed-seg_dim"));
                                 
                                        if (localPackedSeg_dim != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackedSeg_dim));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Packed-seg_dim cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_numseg"));
                                 
                                        if (localPackedSeg_numseg != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackedSeg_numseg));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Packed-seg_numseg cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_ids"));
                            
                            
                                    if (localPackedSeg_ids==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seg_ids cannot be null!!");
                                    }
                                    elementList.add(localPackedSeg_ids);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_starts"));
                            
                            
                                    if (localPackedSeg_starts==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seg_starts cannot be null!!");
                                    }
                                    elementList.add(localPackedSeg_starts);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_present"));
                                 
                                        if (localPackedSeg_present != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackedSeg_present));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Packed-seg_present cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_lens"));
                            
                            
                                    if (localPackedSeg_lens==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seg_lens cannot be null!!");
                                    }
                                    elementList.add(localPackedSeg_lens);
                                 if (localPackedSeg_strandsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_strands"));
                            
                            
                                    if (localPackedSeg_strands==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seg_strands cannot be null!!");
                                    }
                                    elementList.add(localPackedSeg_strands);
                                } if (localPackedSeg_scoresTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seg_scores"));
                            
                            
                                    if (localPackedSeg_scores==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seg_scores cannot be null!!");
                                    }
                                    elementList.add(localPackedSeg_scores);
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
        public static PackedSeg_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PackedSeg_type0 object =
                new PackedSeg_type0();

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
                    
                            if (!"Packed-seg_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PackedSeg_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_dim").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Packed-seg_dim" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPackedSeg_dim(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_numseg").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Packed-seg_numseg" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPackedSeg_numseg(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_ids").equals(reader.getName())){
                                
                                                object.setPackedSeg_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_ids_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_starts").equals(reader.getName())){
                                
                                                object.setPackedSeg_starts(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_starts_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_present").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Packed-seg_present" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPackedSeg_present(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_lens").equals(reader.getName())){
                                
                                                object.setPackedSeg_lens(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_lens_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_strands").equals(reader.getName())){
                                
                                                object.setPackedSeg_strands(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_strands_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seg_scores").equals(reader.getName())){
                                
                                                object.setPackedSeg_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeg_scores_type0.Factory.parse(reader));
                                              
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
           
    