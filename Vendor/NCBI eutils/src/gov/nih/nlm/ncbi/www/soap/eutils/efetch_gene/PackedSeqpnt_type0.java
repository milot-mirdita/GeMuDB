
/**
 * PackedSeqpnt_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  PackedSeqpnt_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PackedSeqpnt_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Packed-seqpnt_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for PackedSeqpnt_strand
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_strand_type0 localPackedSeqpnt_strand ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackedSeqpnt_strandTracker = false ;

                           public boolean isPackedSeqpnt_strandSpecified(){
                               return localPackedSeqpnt_strandTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_strand_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_strand_type0 getPackedSeqpnt_strand(){
                               return localPackedSeqpnt_strand;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeqpnt_strand
                               */
                               public void setPackedSeqpnt_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_strand_type0 param){
                            localPackedSeqpnt_strandTracker = param != null;
                                   
                                            this.localPackedSeqpnt_strand=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeqpnt_id
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_id_type0 localPackedSeqpnt_id ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_id_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_id_type0 getPackedSeqpnt_id(){
                               return localPackedSeqpnt_id;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeqpnt_id
                               */
                               public void setPackedSeqpnt_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_id_type0 param){
                            
                                            this.localPackedSeqpnt_id=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeqpnt_fuzz
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_fuzz_type0 localPackedSeqpnt_fuzz ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackedSeqpnt_fuzzTracker = false ;

                           public boolean isPackedSeqpnt_fuzzSpecified(){
                               return localPackedSeqpnt_fuzzTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_fuzz_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_fuzz_type0 getPackedSeqpnt_fuzz(){
                               return localPackedSeqpnt_fuzz;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeqpnt_fuzz
                               */
                               public void setPackedSeqpnt_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_fuzz_type0 param){
                            localPackedSeqpnt_fuzzTracker = param != null;
                                   
                                            this.localPackedSeqpnt_fuzz=param;
                                    

                               }
                            

                        /**
                        * field for PackedSeqpnt_points
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_points_type0 localPackedSeqpnt_points ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_points_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_points_type0 getPackedSeqpnt_points(){
                               return localPackedSeqpnt_points;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackedSeqpnt_points
                               */
                               public void setPackedSeqpnt_points(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_points_type0 param){
                            
                                            this.localPackedSeqpnt_points=param;
                                    

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
                           namespacePrefix+":Packed-seqpnt_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Packed-seqpnt_type0",
                           xmlWriter);
                   }

               
                   }
                if (localPackedSeqpnt_strandTracker){
                                            if (localPackedSeqpnt_strand==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_strand cannot be null!!");
                                            }
                                           localPackedSeqpnt_strand.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_strand"),
                                               xmlWriter);
                                        }
                                            if (localPackedSeqpnt_id==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_id cannot be null!!");
                                            }
                                           localPackedSeqpnt_id.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_id"),
                                               xmlWriter);
                                         if (localPackedSeqpnt_fuzzTracker){
                                            if (localPackedSeqpnt_fuzz==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_fuzz cannot be null!!");
                                            }
                                           localPackedSeqpnt_fuzz.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_fuzz"),
                                               xmlWriter);
                                        }
                                            if (localPackedSeqpnt_points==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_points cannot be null!!");
                                            }
                                           localPackedSeqpnt_points.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_points"),
                                               xmlWriter);
                                        
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

                 if (localPackedSeqpnt_strandTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seqpnt_strand"));
                            
                            
                                    if (localPackedSeqpnt_strand==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_strand cannot be null!!");
                                    }
                                    elementList.add(localPackedSeqpnt_strand);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seqpnt_id"));
                            
                            
                                    if (localPackedSeqpnt_id==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_id cannot be null!!");
                                    }
                                    elementList.add(localPackedSeqpnt_id);
                                 if (localPackedSeqpnt_fuzzTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seqpnt_fuzz"));
                            
                            
                                    if (localPackedSeqpnt_fuzz==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_fuzz cannot be null!!");
                                    }
                                    elementList.add(localPackedSeqpnt_fuzz);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Packed-seqpnt_points"));
                            
                            
                                    if (localPackedSeqpnt_points==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packed-seqpnt_points cannot be null!!");
                                    }
                                    elementList.add(localPackedSeqpnt_points);
                                

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
        public static PackedSeqpnt_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PackedSeqpnt_type0 object =
                new PackedSeqpnt_type0();

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
                    
                            if (!"Packed-seqpnt_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PackedSeqpnt_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_strand").equals(reader.getName())){
                                
                                                object.setPackedSeqpnt_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_strand_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_id").equals(reader.getName())){
                                
                                                object.setPackedSeqpnt_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_id_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_fuzz").equals(reader.getName())){
                                
                                                object.setPackedSeqpnt_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_fuzz_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Packed-seqpnt_points").equals(reader.getName())){
                                
                                                object.setPackedSeqpnt_points(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.PackedSeqpnt_points_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    