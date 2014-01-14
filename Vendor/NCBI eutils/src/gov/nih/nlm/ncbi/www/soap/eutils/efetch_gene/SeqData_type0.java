
/**
 * SeqData_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqData_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqData_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-data_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqData_iupacnaTracker = false;
                
                   localSeqData_iupacaaTracker = false;
                
                   localSeqData_ncbi2NaTracker = false;
                
                   localSeqData_ncbi4NaTracker = false;
                
                   localSeqData_ncbi8NaTracker = false;
                
                   localSeqData_ncbipnaTracker = false;
                
                   localSeqData_ncbi8AaTracker = false;
                
                   localSeqData_ncbieaaTracker = false;
                
                   localSeqData_ncbipaaTracker = false;
                
                   localSeqData_ncbistdaaTracker = false;
                
                   localSeqData_gapTracker = false;
                
            }
        

                        /**
                        * field for SeqData_iupacna
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacna_type0 localSeqData_iupacna ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_iupacnaTracker = false ;

                           public boolean isSeqData_iupacnaSpecified(){
                               return localSeqData_iupacnaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacna_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacna_type0 getSeqData_iupacna(){
                               return localSeqData_iupacna;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_iupacna
                               */
                               public void setSeqData_iupacna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacna_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_iupacnaTracker = param != null;
                                   
                                            this.localSeqData_iupacna=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_iupacaa
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacaa_type0 localSeqData_iupacaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_iupacaaTracker = false ;

                           public boolean isSeqData_iupacaaSpecified(){
                               return localSeqData_iupacaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacaa_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacaa_type0 getSeqData_iupacaa(){
                               return localSeqData_iupacaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_iupacaa
                               */
                               public void setSeqData_iupacaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacaa_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_iupacaaTracker = param != null;
                                   
                                            this.localSeqData_iupacaa=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbi2Na
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi2Na_type0 localSeqData_ncbi2Na ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbi2NaTracker = false ;

                           public boolean isSeqData_ncbi2NaSpecified(){
                               return localSeqData_ncbi2NaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi2Na_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi2Na_type0 getSeqData_ncbi2Na(){
                               return localSeqData_ncbi2Na;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbi2Na
                               */
                               public void setSeqData_ncbi2Na(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi2Na_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbi2NaTracker = param != null;
                                   
                                            this.localSeqData_ncbi2Na=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbi4Na
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi4Na_type0 localSeqData_ncbi4Na ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbi4NaTracker = false ;

                           public boolean isSeqData_ncbi4NaSpecified(){
                               return localSeqData_ncbi4NaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi4Na_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi4Na_type0 getSeqData_ncbi4Na(){
                               return localSeqData_ncbi4Na;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbi4Na
                               */
                               public void setSeqData_ncbi4Na(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi4Na_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbi4NaTracker = param != null;
                                   
                                            this.localSeqData_ncbi4Na=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbi8Na
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Na_type0 localSeqData_ncbi8Na ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbi8NaTracker = false ;

                           public boolean isSeqData_ncbi8NaSpecified(){
                               return localSeqData_ncbi8NaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Na_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Na_type0 getSeqData_ncbi8Na(){
                               return localSeqData_ncbi8Na;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbi8Na
                               */
                               public void setSeqData_ncbi8Na(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Na_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbi8NaTracker = param != null;
                                   
                                            this.localSeqData_ncbi8Na=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbipna
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipna_type0 localSeqData_ncbipna ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbipnaTracker = false ;

                           public boolean isSeqData_ncbipnaSpecified(){
                               return localSeqData_ncbipnaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipna_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipna_type0 getSeqData_ncbipna(){
                               return localSeqData_ncbipna;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbipna
                               */
                               public void setSeqData_ncbipna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipna_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbipnaTracker = param != null;
                                   
                                            this.localSeqData_ncbipna=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbi8Aa
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Aa_type0 localSeqData_ncbi8Aa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbi8AaTracker = false ;

                           public boolean isSeqData_ncbi8AaSpecified(){
                               return localSeqData_ncbi8AaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Aa_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Aa_type0 getSeqData_ncbi8Aa(){
                               return localSeqData_ncbi8Aa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbi8Aa
                               */
                               public void setSeqData_ncbi8Aa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Aa_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbi8AaTracker = param != null;
                                   
                                            this.localSeqData_ncbi8Aa=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbieaa
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbieaa_type0 localSeqData_ncbieaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbieaaTracker = false ;

                           public boolean isSeqData_ncbieaaSpecified(){
                               return localSeqData_ncbieaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbieaa_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbieaa_type0 getSeqData_ncbieaa(){
                               return localSeqData_ncbieaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbieaa
                               */
                               public void setSeqData_ncbieaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbieaa_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbieaaTracker = param != null;
                                   
                                            this.localSeqData_ncbieaa=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbipaa
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipaa_type0 localSeqData_ncbipaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbipaaTracker = false ;

                           public boolean isSeqData_ncbipaaSpecified(){
                               return localSeqData_ncbipaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipaa_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipaa_type0 getSeqData_ncbipaa(){
                               return localSeqData_ncbipaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbipaa
                               */
                               public void setSeqData_ncbipaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipaa_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbipaaTracker = param != null;
                                   
                                            this.localSeqData_ncbipaa=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_ncbistdaa
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbistdaa_type0 localSeqData_ncbistdaa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_ncbistdaaTracker = false ;

                           public boolean isSeqData_ncbistdaaSpecified(){
                               return localSeqData_ncbistdaaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbistdaa_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbistdaa_type0 getSeqData_ncbistdaa(){
                               return localSeqData_ncbistdaa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_ncbistdaa
                               */
                               public void setSeqData_ncbistdaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbistdaa_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_ncbistdaaTracker = param != null;
                                   
                                            this.localSeqData_ncbistdaa=param;
                                    

                               }
                            

                        /**
                        * field for SeqData_gap
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_gap_type0 localSeqData_gap ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqData_gapTracker = false ;

                           public boolean isSeqData_gapSpecified(){
                               return localSeqData_gapTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_gap_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_gap_type0 getSeqData_gap(){
                               return localSeqData_gap;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqData_gap
                               */
                               public void setSeqData_gap(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_gap_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqData_gapTracker = param != null;
                                   
                                            this.localSeqData_gap=param;
                                    

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
                           namespacePrefix+":Seq-data_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-data_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqData_iupacnaTracker){
                                            if (localSeqData_iupacna==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_iupacna cannot be null!!");
                                            }
                                           localSeqData_iupacna.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_iupacna"),
                                               xmlWriter);
                                        } if (localSeqData_iupacaaTracker){
                                            if (localSeqData_iupacaa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_iupacaa cannot be null!!");
                                            }
                                           localSeqData_iupacaa.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_iupacaa"),
                                               xmlWriter);
                                        } if (localSeqData_ncbi2NaTracker){
                                            if (localSeqData_ncbi2Na==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi2na cannot be null!!");
                                            }
                                           localSeqData_ncbi2Na.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi2na"),
                                               xmlWriter);
                                        } if (localSeqData_ncbi4NaTracker){
                                            if (localSeqData_ncbi4Na==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi4na cannot be null!!");
                                            }
                                           localSeqData_ncbi4Na.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi4na"),
                                               xmlWriter);
                                        } if (localSeqData_ncbi8NaTracker){
                                            if (localSeqData_ncbi8Na==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi8na cannot be null!!");
                                            }
                                           localSeqData_ncbi8Na.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi8na"),
                                               xmlWriter);
                                        } if (localSeqData_ncbipnaTracker){
                                            if (localSeqData_ncbipna==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbipna cannot be null!!");
                                            }
                                           localSeqData_ncbipna.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbipna"),
                                               xmlWriter);
                                        } if (localSeqData_ncbi8AaTracker){
                                            if (localSeqData_ncbi8Aa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi8aa cannot be null!!");
                                            }
                                           localSeqData_ncbi8Aa.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi8aa"),
                                               xmlWriter);
                                        } if (localSeqData_ncbieaaTracker){
                                            if (localSeqData_ncbieaa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbieaa cannot be null!!");
                                            }
                                           localSeqData_ncbieaa.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbieaa"),
                                               xmlWriter);
                                        } if (localSeqData_ncbipaaTracker){
                                            if (localSeqData_ncbipaa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbipaa cannot be null!!");
                                            }
                                           localSeqData_ncbipaa.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbipaa"),
                                               xmlWriter);
                                        } if (localSeqData_ncbistdaaTracker){
                                            if (localSeqData_ncbistdaa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbistdaa cannot be null!!");
                                            }
                                           localSeqData_ncbistdaa.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbistdaa"),
                                               xmlWriter);
                                        } if (localSeqData_gapTracker){
                                            if (localSeqData_gap==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-data_gap cannot be null!!");
                                            }
                                           localSeqData_gap.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_gap"),
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

                 if (localSeqData_iupacnaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_iupacna"));
                            
                            
                                    if (localSeqData_iupacna==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_iupacna cannot be null!!");
                                    }
                                    elementList.add(localSeqData_iupacna);
                                } if (localSeqData_iupacaaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_iupacaa"));
                            
                            
                                    if (localSeqData_iupacaa==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_iupacaa cannot be null!!");
                                    }
                                    elementList.add(localSeqData_iupacaa);
                                } if (localSeqData_ncbi2NaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbi2na"));
                            
                            
                                    if (localSeqData_ncbi2Na==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi2na cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbi2Na);
                                } if (localSeqData_ncbi4NaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbi4na"));
                            
                            
                                    if (localSeqData_ncbi4Na==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi4na cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbi4Na);
                                } if (localSeqData_ncbi8NaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbi8na"));
                            
                            
                                    if (localSeqData_ncbi8Na==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi8na cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbi8Na);
                                } if (localSeqData_ncbipnaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbipna"));
                            
                            
                                    if (localSeqData_ncbipna==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbipna cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbipna);
                                } if (localSeqData_ncbi8AaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbi8aa"));
                            
                            
                                    if (localSeqData_ncbi8Aa==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbi8aa cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbi8Aa);
                                } if (localSeqData_ncbieaaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbieaa"));
                            
                            
                                    if (localSeqData_ncbieaa==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbieaa cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbieaa);
                                } if (localSeqData_ncbipaaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbipaa"));
                            
                            
                                    if (localSeqData_ncbipaa==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbipaa cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbipaa);
                                } if (localSeqData_ncbistdaaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_ncbistdaa"));
                            
                            
                                    if (localSeqData_ncbistdaa==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_ncbistdaa cannot be null!!");
                                    }
                                    elementList.add(localSeqData_ncbistdaa);
                                } if (localSeqData_gapTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-data_gap"));
                            
                            
                                    if (localSeqData_gap==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-data_gap cannot be null!!");
                                    }
                                    elementList.add(localSeqData_gap);
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
        public static SeqData_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqData_type0 object =
                new SeqData_type0();

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
                    
                            if (!"Seq-data_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqData_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_iupacna").equals(reader.getName())){
                                
                                                object.setSeqData_iupacna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacna_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_iupacaa").equals(reader.getName())){
                                
                                                object.setSeqData_iupacaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_iupacaa_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi2na").equals(reader.getName())){
                                
                                                object.setSeqData_ncbi2Na(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi2Na_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi4na").equals(reader.getName())){
                                
                                                object.setSeqData_ncbi4Na(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi4Na_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi8na").equals(reader.getName())){
                                
                                                object.setSeqData_ncbi8Na(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Na_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbipna").equals(reader.getName())){
                                
                                                object.setSeqData_ncbipna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipna_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbi8aa").equals(reader.getName())){
                                
                                                object.setSeqData_ncbi8Aa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbi8Aa_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbieaa").equals(reader.getName())){
                                
                                                object.setSeqData_ncbieaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbieaa_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbipaa").equals(reader.getName())){
                                
                                                object.setSeqData_ncbipaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbipaa_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_ncbistdaa").equals(reader.getName())){
                                
                                                object.setSeqData_ncbistdaa(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_ncbistdaa_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-data_gap").equals(reader.getName())){
                                
                                                object.setSeqData_gap(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqData_gap_type0.Factory.parse(reader));
                                              
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
           
    