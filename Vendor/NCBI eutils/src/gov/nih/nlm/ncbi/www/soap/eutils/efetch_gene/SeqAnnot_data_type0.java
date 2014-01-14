
/**
 * SeqAnnot_data_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqAnnot_data_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqAnnot_data_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-annot_data_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqAnnot_data_ftableTracker = false;
                
                   localSeqAnnot_data_alignTracker = false;
                
                   localSeqAnnot_data_graphTracker = false;
                
                   localSeqAnnot_data_idsTracker = false;
                
                   localSeqAnnot_data_locsTracker = false;
                
                   localSeqAnnot_data_seqTableTracker = false;
                
            }
        

                        /**
                        * field for SeqAnnot_data_ftable
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ftable_type0 localSeqAnnot_data_ftable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAnnot_data_ftableTracker = false ;

                           public boolean isSeqAnnot_data_ftableSpecified(){
                               return localSeqAnnot_data_ftableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ftable_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ftable_type0 getSeqAnnot_data_ftable(){
                               return localSeqAnnot_data_ftable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAnnot_data_ftable
                               */
                               public void setSeqAnnot_data_ftable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ftable_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqAnnot_data_ftableTracker = param != null;
                                   
                                            this.localSeqAnnot_data_ftable=param;
                                    

                               }
                            

                        /**
                        * field for SeqAnnot_data_align
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_align_type0 localSeqAnnot_data_align ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAnnot_data_alignTracker = false ;

                           public boolean isSeqAnnot_data_alignSpecified(){
                               return localSeqAnnot_data_alignTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_align_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_align_type0 getSeqAnnot_data_align(){
                               return localSeqAnnot_data_align;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAnnot_data_align
                               */
                               public void setSeqAnnot_data_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_align_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqAnnot_data_alignTracker = param != null;
                                   
                                            this.localSeqAnnot_data_align=param;
                                    

                               }
                            

                        /**
                        * field for SeqAnnot_data_graph
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_graph_type0 localSeqAnnot_data_graph ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAnnot_data_graphTracker = false ;

                           public boolean isSeqAnnot_data_graphSpecified(){
                               return localSeqAnnot_data_graphTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_graph_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_graph_type0 getSeqAnnot_data_graph(){
                               return localSeqAnnot_data_graph;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAnnot_data_graph
                               */
                               public void setSeqAnnot_data_graph(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_graph_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqAnnot_data_graphTracker = param != null;
                                   
                                            this.localSeqAnnot_data_graph=param;
                                    

                               }
                            

                        /**
                        * field for SeqAnnot_data_ids
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ids_type0 localSeqAnnot_data_ids ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAnnot_data_idsTracker = false ;

                           public boolean isSeqAnnot_data_idsSpecified(){
                               return localSeqAnnot_data_idsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ids_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ids_type0 getSeqAnnot_data_ids(){
                               return localSeqAnnot_data_ids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAnnot_data_ids
                               */
                               public void setSeqAnnot_data_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ids_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqAnnot_data_idsTracker = param != null;
                                   
                                            this.localSeqAnnot_data_ids=param;
                                    

                               }
                            

                        /**
                        * field for SeqAnnot_data_locs
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_locs_type0 localSeqAnnot_data_locs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAnnot_data_locsTracker = false ;

                           public boolean isSeqAnnot_data_locsSpecified(){
                               return localSeqAnnot_data_locsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_locs_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_locs_type0 getSeqAnnot_data_locs(){
                               return localSeqAnnot_data_locs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAnnot_data_locs
                               */
                               public void setSeqAnnot_data_locs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_locs_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqAnnot_data_locsTracker = param != null;
                                   
                                            this.localSeqAnnot_data_locs=param;
                                    

                               }
                            

                        /**
                        * field for SeqAnnot_data_seqTable
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_seqTable_type0 localSeqAnnot_data_seqTable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqAnnot_data_seqTableTracker = false ;

                           public boolean isSeqAnnot_data_seqTableSpecified(){
                               return localSeqAnnot_data_seqTableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_seqTable_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_seqTable_type0 getSeqAnnot_data_seqTable(){
                               return localSeqAnnot_data_seqTable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqAnnot_data_seqTable
                               */
                               public void setSeqAnnot_data_seqTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_seqTable_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqAnnot_data_seqTableTracker = param != null;
                                   
                                            this.localSeqAnnot_data_seqTable=param;
                                    

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
                           namespacePrefix+":Seq-annot_data_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-annot_data_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqAnnot_data_ftableTracker){
                                            if (localSeqAnnot_data_ftable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_ftable cannot be null!!");
                                            }
                                           localSeqAnnot_data_ftable.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_ftable"),
                                               xmlWriter);
                                        } if (localSeqAnnot_data_alignTracker){
                                            if (localSeqAnnot_data_align==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_align cannot be null!!");
                                            }
                                           localSeqAnnot_data_align.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_align"),
                                               xmlWriter);
                                        } if (localSeqAnnot_data_graphTracker){
                                            if (localSeqAnnot_data_graph==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_graph cannot be null!!");
                                            }
                                           localSeqAnnot_data_graph.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_graph"),
                                               xmlWriter);
                                        } if (localSeqAnnot_data_idsTracker){
                                            if (localSeqAnnot_data_ids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_ids cannot be null!!");
                                            }
                                           localSeqAnnot_data_ids.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_ids"),
                                               xmlWriter);
                                        } if (localSeqAnnot_data_locsTracker){
                                            if (localSeqAnnot_data_locs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_locs cannot be null!!");
                                            }
                                           localSeqAnnot_data_locs.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_locs"),
                                               xmlWriter);
                                        } if (localSeqAnnot_data_seqTableTracker){
                                            if (localSeqAnnot_data_seqTable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_seq-table cannot be null!!");
                                            }
                                           localSeqAnnot_data_seqTable.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_seq-table"),
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

                 if (localSeqAnnot_data_ftableTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-annot_data_ftable"));
                            
                            
                                    if (localSeqAnnot_data_ftable==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_ftable cannot be null!!");
                                    }
                                    elementList.add(localSeqAnnot_data_ftable);
                                } if (localSeqAnnot_data_alignTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-annot_data_align"));
                            
                            
                                    if (localSeqAnnot_data_align==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_align cannot be null!!");
                                    }
                                    elementList.add(localSeqAnnot_data_align);
                                } if (localSeqAnnot_data_graphTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-annot_data_graph"));
                            
                            
                                    if (localSeqAnnot_data_graph==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_graph cannot be null!!");
                                    }
                                    elementList.add(localSeqAnnot_data_graph);
                                } if (localSeqAnnot_data_idsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-annot_data_ids"));
                            
                            
                                    if (localSeqAnnot_data_ids==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_ids cannot be null!!");
                                    }
                                    elementList.add(localSeqAnnot_data_ids);
                                } if (localSeqAnnot_data_locsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-annot_data_locs"));
                            
                            
                                    if (localSeqAnnot_data_locs==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_locs cannot be null!!");
                                    }
                                    elementList.add(localSeqAnnot_data_locs);
                                } if (localSeqAnnot_data_seqTableTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-annot_data_seq-table"));
                            
                            
                                    if (localSeqAnnot_data_seqTable==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-annot_data_seq-table cannot be null!!");
                                    }
                                    elementList.add(localSeqAnnot_data_seqTable);
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
        public static SeqAnnot_data_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqAnnot_data_type0 object =
                new SeqAnnot_data_type0();

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
                    
                            if (!"Seq-annot_data_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqAnnot_data_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_ftable").equals(reader.getName())){
                                
                                                object.setSeqAnnot_data_ftable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ftable_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_align").equals(reader.getName())){
                                
                                                object.setSeqAnnot_data_align(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_align_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_graph").equals(reader.getName())){
                                
                                                object.setSeqAnnot_data_graph(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_graph_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_ids").equals(reader.getName())){
                                
                                                object.setSeqAnnot_data_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_ids_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_locs").equals(reader.getName())){
                                
                                                object.setSeqAnnot_data_locs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_locs_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-annot_data_seq-table").equals(reader.getName())){
                                
                                                object.setSeqAnnot_data_seqTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqAnnot_data_seqTable_type0.Factory.parse(reader));
                                              
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
           
    