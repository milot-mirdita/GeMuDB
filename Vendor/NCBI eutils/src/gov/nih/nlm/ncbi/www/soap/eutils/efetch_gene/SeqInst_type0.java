
/**
 * SeqInst_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqInst_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqInst_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-inst_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SeqInst_repr
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_repr_type0 localSeqInst_repr ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_repr_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_repr_type0 getSeqInst_repr(){
                               return localSeqInst_repr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_repr
                               */
                               public void setSeqInst_repr(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_repr_type0 param){
                            
                                            this.localSeqInst_repr=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_mol
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_mol_type0 localSeqInst_mol ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_mol_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_mol_type0 getSeqInst_mol(){
                               return localSeqInst_mol;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_mol
                               */
                               public void setSeqInst_mol(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_mol_type0 param){
                            
                                            this.localSeqInst_mol=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_length
                        */

                        
                                    protected java.math.BigInteger localSeqInst_length ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_lengthTracker = false ;

                           public boolean isSeqInst_lengthSpecified(){
                               return localSeqInst_lengthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSeqInst_length(){
                               return localSeqInst_length;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_length
                               */
                               public void setSeqInst_length(java.math.BigInteger param){
                            localSeqInst_lengthTracker = param != null;
                                   
                                            this.localSeqInst_length=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_fuzz
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_fuzz_type0 localSeqInst_fuzz ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_fuzzTracker = false ;

                           public boolean isSeqInst_fuzzSpecified(){
                               return localSeqInst_fuzzTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_fuzz_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_fuzz_type0 getSeqInst_fuzz(){
                               return localSeqInst_fuzz;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_fuzz
                               */
                               public void setSeqInst_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_fuzz_type0 param){
                            localSeqInst_fuzzTracker = param != null;
                                   
                                            this.localSeqInst_fuzz=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_topology
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_topology_type0 localSeqInst_topology ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_topologyTracker = false ;

                           public boolean isSeqInst_topologySpecified(){
                               return localSeqInst_topologyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_topology_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_topology_type0 getSeqInst_topology(){
                               return localSeqInst_topology;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_topology
                               */
                               public void setSeqInst_topology(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_topology_type0 param){
                            localSeqInst_topologyTracker = param != null;
                                   
                                            this.localSeqInst_topology=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_strand
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_strand_type0 localSeqInst_strand ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_strandTracker = false ;

                           public boolean isSeqInst_strandSpecified(){
                               return localSeqInst_strandTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_strand_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_strand_type0 getSeqInst_strand(){
                               return localSeqInst_strand;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_strand
                               */
                               public void setSeqInst_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_strand_type0 param){
                            localSeqInst_strandTracker = param != null;
                                   
                                            this.localSeqInst_strand=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_seqData
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_seqData_type0 localSeqInst_seqData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_seqDataTracker = false ;

                           public boolean isSeqInst_seqDataSpecified(){
                               return localSeqInst_seqDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_seqData_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_seqData_type0 getSeqInst_seqData(){
                               return localSeqInst_seqData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_seqData
                               */
                               public void setSeqInst_seqData(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_seqData_type0 param){
                            localSeqInst_seqDataTracker = param != null;
                                   
                                            this.localSeqInst_seqData=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_ext
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_ext_type0 localSeqInst_ext ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_extTracker = false ;

                           public boolean isSeqInst_extSpecified(){
                               return localSeqInst_extTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_ext_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_ext_type0 getSeqInst_ext(){
                               return localSeqInst_ext;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_ext
                               */
                               public void setSeqInst_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_ext_type0 param){
                            localSeqInst_extTracker = param != null;
                                   
                                            this.localSeqInst_ext=param;
                                    

                               }
                            

                        /**
                        * field for SeqInst_hist
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_hist_type0 localSeqInst_hist ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqInst_histTracker = false ;

                           public boolean isSeqInst_histSpecified(){
                               return localSeqInst_histTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_hist_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_hist_type0 getSeqInst_hist(){
                               return localSeqInst_hist;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqInst_hist
                               */
                               public void setSeqInst_hist(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_hist_type0 param){
                            localSeqInst_histTracker = param != null;
                                   
                                            this.localSeqInst_hist=param;
                                    

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
                           namespacePrefix+":Seq-inst_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-inst_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localSeqInst_repr==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_repr cannot be null!!");
                                            }
                                           localSeqInst_repr.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_repr"),
                                               xmlWriter);
                                        
                                            if (localSeqInst_mol==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_mol cannot be null!!");
                                            }
                                           localSeqInst_mol.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_mol"),
                                               xmlWriter);
                                         if (localSeqInst_lengthTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-inst_length", xmlWriter);
                             

                                          if (localSeqInst_length==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-inst_length cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqInst_length));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqInst_fuzzTracker){
                                            if (localSeqInst_fuzz==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_fuzz cannot be null!!");
                                            }
                                           localSeqInst_fuzz.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_fuzz"),
                                               xmlWriter);
                                        } if (localSeqInst_topologyTracker){
                                            if (localSeqInst_topology==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_topology cannot be null!!");
                                            }
                                           localSeqInst_topology.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_topology"),
                                               xmlWriter);
                                        } if (localSeqInst_strandTracker){
                                            if (localSeqInst_strand==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_strand cannot be null!!");
                                            }
                                           localSeqInst_strand.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_strand"),
                                               xmlWriter);
                                        } if (localSeqInst_seqDataTracker){
                                            if (localSeqInst_seqData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_seq-data cannot be null!!");
                                            }
                                           localSeqInst_seqData.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_seq-data"),
                                               xmlWriter);
                                        } if (localSeqInst_extTracker){
                                            if (localSeqInst_ext==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_ext cannot be null!!");
                                            }
                                           localSeqInst_ext.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_ext"),
                                               xmlWriter);
                                        } if (localSeqInst_histTracker){
                                            if (localSeqInst_hist==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-inst_hist cannot be null!!");
                                            }
                                           localSeqInst_hist.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_hist"),
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
                                                                      "Seq-inst_repr"));
                            
                            
                                    if (localSeqInst_repr==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_repr cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_repr);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_mol"));
                            
                            
                                    if (localSeqInst_mol==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_mol cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_mol);
                                 if (localSeqInst_lengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_length"));
                                 
                                        if (localSeqInst_length != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqInst_length));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-inst_length cannot be null!!");
                                        }
                                    } if (localSeqInst_fuzzTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_fuzz"));
                            
                            
                                    if (localSeqInst_fuzz==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_fuzz cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_fuzz);
                                } if (localSeqInst_topologyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_topology"));
                            
                            
                                    if (localSeqInst_topology==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_topology cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_topology);
                                } if (localSeqInst_strandTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_strand"));
                            
                            
                                    if (localSeqInst_strand==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_strand cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_strand);
                                } if (localSeqInst_seqDataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_seq-data"));
                            
                            
                                    if (localSeqInst_seqData==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_seq-data cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_seqData);
                                } if (localSeqInst_extTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_ext"));
                            
                            
                                    if (localSeqInst_ext==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_ext cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_ext);
                                } if (localSeqInst_histTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-inst_hist"));
                            
                            
                                    if (localSeqInst_hist==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-inst_hist cannot be null!!");
                                    }
                                    elementList.add(localSeqInst_hist);
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
        public static SeqInst_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqInst_type0 object =
                new SeqInst_type0();

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
                    
                            if (!"Seq-inst_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqInst_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_repr").equals(reader.getName())){
                                
                                                object.setSeqInst_repr(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_repr_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_mol").equals(reader.getName())){
                                
                                                object.setSeqInst_mol(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_mol_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_length").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-inst_length" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqInst_length(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_fuzz").equals(reader.getName())){
                                
                                                object.setSeqInst_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_fuzz_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_topology").equals(reader.getName())){
                                
                                                object.setSeqInst_topology(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_topology_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_strand").equals(reader.getName())){
                                
                                                object.setSeqInst_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_strand_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_seq-data").equals(reader.getName())){
                                
                                                object.setSeqInst_seqData(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_seqData_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_ext").equals(reader.getName())){
                                
                                                object.setSeqInst_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_ext_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-inst_hist").equals(reader.getName())){
                                
                                                object.setSeqInst_hist(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqInst_hist_type0.Factory.parse(reader));
                                              
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
           
    