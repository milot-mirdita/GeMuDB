
/**
 * SeqLoc_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqLoc_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqLoc_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-loc_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqLoc_nullTracker = false;
                
                   localSeqLoc_emptyTracker = false;
                
                   localSeqLoc_wholeTracker = false;
                
                   localSeqLoc_intTracker = false;
                
                   localSeqLoc_packedIntTracker = false;
                
                   localSeqLoc_pntTracker = false;
                
                   localSeqLoc_packedPntTracker = false;
                
                   localSeqLoc_mixTracker = false;
                
                   localSeqLoc_equivTracker = false;
                
                   localSeqLoc_bondTracker = false;
                
                   localSeqLoc_featTracker = false;
                
            }
        

                        /**
                        * field for SeqLoc_null
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_null_type0 localSeqLoc_null ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_nullTracker = false ;

                           public boolean isSeqLoc_nullSpecified(){
                               return localSeqLoc_nullTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_null_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_null_type0 getSeqLoc_null(){
                               return localSeqLoc_null;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_null
                               */
                               public void setSeqLoc_null(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_null_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_nullTracker = param != null;
                                   
                                            this.localSeqLoc_null=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_empty
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_empty_type0 localSeqLoc_empty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_emptyTracker = false ;

                           public boolean isSeqLoc_emptySpecified(){
                               return localSeqLoc_emptyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_empty_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_empty_type0 getSeqLoc_empty(){
                               return localSeqLoc_empty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_empty
                               */
                               public void setSeqLoc_empty(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_empty_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_emptyTracker = param != null;
                                   
                                            this.localSeqLoc_empty=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_whole
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_whole_type0 localSeqLoc_whole ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_wholeTracker = false ;

                           public boolean isSeqLoc_wholeSpecified(){
                               return localSeqLoc_wholeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_whole_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_whole_type0 getSeqLoc_whole(){
                               return localSeqLoc_whole;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_whole
                               */
                               public void setSeqLoc_whole(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_whole_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_wholeTracker = param != null;
                                   
                                            this.localSeqLoc_whole=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_int
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_int_type0 localSeqLoc_int ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_intTracker = false ;

                           public boolean isSeqLoc_intSpecified(){
                               return localSeqLoc_intTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_int_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_int_type0 getSeqLoc_int(){
                               return localSeqLoc_int;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_int
                               */
                               public void setSeqLoc_int(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_int_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_intTracker = param != null;
                                   
                                            this.localSeqLoc_int=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_packedInt
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedInt_type0 localSeqLoc_packedInt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_packedIntTracker = false ;

                           public boolean isSeqLoc_packedIntSpecified(){
                               return localSeqLoc_packedIntTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedInt_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedInt_type0 getSeqLoc_packedInt(){
                               return localSeqLoc_packedInt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_packedInt
                               */
                               public void setSeqLoc_packedInt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedInt_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_packedIntTracker = param != null;
                                   
                                            this.localSeqLoc_packedInt=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_pnt
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_pnt_type0 localSeqLoc_pnt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_pntTracker = false ;

                           public boolean isSeqLoc_pntSpecified(){
                               return localSeqLoc_pntTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_pnt_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_pnt_type0 getSeqLoc_pnt(){
                               return localSeqLoc_pnt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_pnt
                               */
                               public void setSeqLoc_pnt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_pnt_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_pntTracker = param != null;
                                   
                                            this.localSeqLoc_pnt=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_packedPnt
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedPnt_type0 localSeqLoc_packedPnt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_packedPntTracker = false ;

                           public boolean isSeqLoc_packedPntSpecified(){
                               return localSeqLoc_packedPntTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedPnt_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedPnt_type0 getSeqLoc_packedPnt(){
                               return localSeqLoc_packedPnt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_packedPnt
                               */
                               public void setSeqLoc_packedPnt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedPnt_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_packedPntTracker = param != null;
                                   
                                            this.localSeqLoc_packedPnt=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_mix
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_mix_type0 localSeqLoc_mix ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_mixTracker = false ;

                           public boolean isSeqLoc_mixSpecified(){
                               return localSeqLoc_mixTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_mix_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_mix_type0 getSeqLoc_mix(){
                               return localSeqLoc_mix;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_mix
                               */
                               public void setSeqLoc_mix(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_mix_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_mixTracker = param != null;
                                   
                                            this.localSeqLoc_mix=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_equiv
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_equiv_type0 localSeqLoc_equiv ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_equivTracker = false ;

                           public boolean isSeqLoc_equivSpecified(){
                               return localSeqLoc_equivTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_equiv_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_equiv_type0 getSeqLoc_equiv(){
                               return localSeqLoc_equiv;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_equiv
                               */
                               public void setSeqLoc_equiv(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_equiv_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_equivTracker = param != null;
                                   
                                            this.localSeqLoc_equiv=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_bond
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_bond_type0 localSeqLoc_bond ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_bondTracker = false ;

                           public boolean isSeqLoc_bondSpecified(){
                               return localSeqLoc_bondTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_bond_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_bond_type0 getSeqLoc_bond(){
                               return localSeqLoc_bond;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_bond
                               */
                               public void setSeqLoc_bond(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_bond_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_bondTracker = param != null;
                                   
                                            this.localSeqLoc_bond=param;
                                    

                               }
                            

                        /**
                        * field for SeqLoc_feat
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_feat_type0 localSeqLoc_feat ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqLoc_featTracker = false ;

                           public boolean isSeqLoc_featSpecified(){
                               return localSeqLoc_featTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_feat_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_feat_type0 getSeqLoc_feat(){
                               return localSeqLoc_feat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqLoc_feat
                               */
                               public void setSeqLoc_feat(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_feat_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqLoc_featTracker = param != null;
                                   
                                            this.localSeqLoc_feat=param;
                                    

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
                           namespacePrefix+":Seq-loc_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-loc_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqLoc_nullTracker){
                                            if (localSeqLoc_null==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_null cannot be null!!");
                                            }
                                           localSeqLoc_null.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_null"),
                                               xmlWriter);
                                        } if (localSeqLoc_emptyTracker){
                                            if (localSeqLoc_empty==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_empty cannot be null!!");
                                            }
                                           localSeqLoc_empty.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_empty"),
                                               xmlWriter);
                                        } if (localSeqLoc_wholeTracker){
                                            if (localSeqLoc_whole==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_whole cannot be null!!");
                                            }
                                           localSeqLoc_whole.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_whole"),
                                               xmlWriter);
                                        } if (localSeqLoc_intTracker){
                                            if (localSeqLoc_int==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_int cannot be null!!");
                                            }
                                           localSeqLoc_int.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_int"),
                                               xmlWriter);
                                        } if (localSeqLoc_packedIntTracker){
                                            if (localSeqLoc_packedInt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_packed-int cannot be null!!");
                                            }
                                           localSeqLoc_packedInt.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_packed-int"),
                                               xmlWriter);
                                        } if (localSeqLoc_pntTracker){
                                            if (localSeqLoc_pnt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_pnt cannot be null!!");
                                            }
                                           localSeqLoc_pnt.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_pnt"),
                                               xmlWriter);
                                        } if (localSeqLoc_packedPntTracker){
                                            if (localSeqLoc_packedPnt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_packed-pnt cannot be null!!");
                                            }
                                           localSeqLoc_packedPnt.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_packed-pnt"),
                                               xmlWriter);
                                        } if (localSeqLoc_mixTracker){
                                            if (localSeqLoc_mix==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_mix cannot be null!!");
                                            }
                                           localSeqLoc_mix.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_mix"),
                                               xmlWriter);
                                        } if (localSeqLoc_equivTracker){
                                            if (localSeqLoc_equiv==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_equiv cannot be null!!");
                                            }
                                           localSeqLoc_equiv.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_equiv"),
                                               xmlWriter);
                                        } if (localSeqLoc_bondTracker){
                                            if (localSeqLoc_bond==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_bond cannot be null!!");
                                            }
                                           localSeqLoc_bond.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_bond"),
                                               xmlWriter);
                                        } if (localSeqLoc_featTracker){
                                            if (localSeqLoc_feat==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-loc_feat cannot be null!!");
                                            }
                                           localSeqLoc_feat.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_feat"),
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

                 if (localSeqLoc_nullTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_null"));
                            
                            
                                    if (localSeqLoc_null==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_null cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_null);
                                } if (localSeqLoc_emptyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_empty"));
                            
                            
                                    if (localSeqLoc_empty==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_empty cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_empty);
                                } if (localSeqLoc_wholeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_whole"));
                            
                            
                                    if (localSeqLoc_whole==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_whole cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_whole);
                                } if (localSeqLoc_intTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_int"));
                            
                            
                                    if (localSeqLoc_int==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_int cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_int);
                                } if (localSeqLoc_packedIntTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_packed-int"));
                            
                            
                                    if (localSeqLoc_packedInt==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_packed-int cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_packedInt);
                                } if (localSeqLoc_pntTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_pnt"));
                            
                            
                                    if (localSeqLoc_pnt==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_pnt cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_pnt);
                                } if (localSeqLoc_packedPntTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_packed-pnt"));
                            
                            
                                    if (localSeqLoc_packedPnt==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_packed-pnt cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_packedPnt);
                                } if (localSeqLoc_mixTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_mix"));
                            
                            
                                    if (localSeqLoc_mix==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_mix cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_mix);
                                } if (localSeqLoc_equivTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_equiv"));
                            
                            
                                    if (localSeqLoc_equiv==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_equiv cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_equiv);
                                } if (localSeqLoc_bondTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_bond"));
                            
                            
                                    if (localSeqLoc_bond==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_bond cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_bond);
                                } if (localSeqLoc_featTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-loc_feat"));
                            
                            
                                    if (localSeqLoc_feat==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-loc_feat cannot be null!!");
                                    }
                                    elementList.add(localSeqLoc_feat);
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
        public static SeqLoc_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqLoc_type0 object =
                new SeqLoc_type0();

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
                    
                            if (!"Seq-loc_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqLoc_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_null").equals(reader.getName())){
                                
                                                object.setSeqLoc_null(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_null_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_empty").equals(reader.getName())){
                                
                                                object.setSeqLoc_empty(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_empty_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_whole").equals(reader.getName())){
                                
                                                object.setSeqLoc_whole(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_whole_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_int").equals(reader.getName())){
                                
                                                object.setSeqLoc_int(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_int_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_packed-int").equals(reader.getName())){
                                
                                                object.setSeqLoc_packedInt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedInt_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_pnt").equals(reader.getName())){
                                
                                                object.setSeqLoc_pnt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_pnt_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_packed-pnt").equals(reader.getName())){
                                
                                                object.setSeqLoc_packedPnt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_packedPnt_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_mix").equals(reader.getName())){
                                
                                                object.setSeqLoc_mix(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_mix_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_equiv").equals(reader.getName())){
                                
                                                object.setSeqLoc_equiv(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_equiv_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_bond").equals(reader.getName())){
                                
                                                object.setSeqLoc_bond(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_bond_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-loc_feat").equals(reader.getName())){
                                
                                                object.setSeqLoc_feat(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqLoc_feat_type0.Factory.parse(reader));
                                              
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
           
    