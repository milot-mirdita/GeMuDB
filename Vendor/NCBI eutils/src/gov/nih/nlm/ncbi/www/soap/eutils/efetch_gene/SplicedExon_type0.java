
/**
 * SplicedExon_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SplicedExon_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SplicedExon_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Spliced-exon_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SplicedExon_productStart
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStart_type0 localSplicedExon_productStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStart_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStart_type0 getSplicedExon_productStart(){
                               return localSplicedExon_productStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_productStart
                               */
                               public void setSplicedExon_productStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStart_type0 param){
                            
                                            this.localSplicedExon_productStart=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_productEnd
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productEnd_type0 localSplicedExon_productEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productEnd_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productEnd_type0 getSplicedExon_productEnd(){
                               return localSplicedExon_productEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_productEnd
                               */
                               public void setSplicedExon_productEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productEnd_type0 param){
                            
                                            this.localSplicedExon_productEnd=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_genomicStart
                        */

                        
                                    protected java.math.BigInteger localSplicedExon_genomicStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSplicedExon_genomicStart(){
                               return localSplicedExon_genomicStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_genomicStart
                               */
                               public void setSplicedExon_genomicStart(java.math.BigInteger param){
                            
                                            this.localSplicedExon_genomicStart=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_genomicEnd
                        */

                        
                                    protected java.math.BigInteger localSplicedExon_genomicEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSplicedExon_genomicEnd(){
                               return localSplicedExon_genomicEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_genomicEnd
                               */
                               public void setSplicedExon_genomicEnd(java.math.BigInteger param){
                            
                                            this.localSplicedExon_genomicEnd=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_productId
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productId_type0 localSplicedExon_productId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_productIdTracker = false ;

                           public boolean isSplicedExon_productIdSpecified(){
                               return localSplicedExon_productIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productId_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productId_type0 getSplicedExon_productId(){
                               return localSplicedExon_productId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_productId
                               */
                               public void setSplicedExon_productId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productId_type0 param){
                            localSplicedExon_productIdTracker = param != null;
                                   
                                            this.localSplicedExon_productId=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_genomicId
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicId_type0 localSplicedExon_genomicId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_genomicIdTracker = false ;

                           public boolean isSplicedExon_genomicIdSpecified(){
                               return localSplicedExon_genomicIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicId_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicId_type0 getSplicedExon_genomicId(){
                               return localSplicedExon_genomicId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_genomicId
                               */
                               public void setSplicedExon_genomicId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicId_type0 param){
                            localSplicedExon_genomicIdTracker = param != null;
                                   
                                            this.localSplicedExon_genomicId=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_productStrand
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStrand_type0 localSplicedExon_productStrand ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_productStrandTracker = false ;

                           public boolean isSplicedExon_productStrandSpecified(){
                               return localSplicedExon_productStrandTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStrand_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStrand_type0 getSplicedExon_productStrand(){
                               return localSplicedExon_productStrand;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_productStrand
                               */
                               public void setSplicedExon_productStrand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStrand_type0 param){
                            localSplicedExon_productStrandTracker = param != null;
                                   
                                            this.localSplicedExon_productStrand=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_genomicStrand
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicStrand_type0 localSplicedExon_genomicStrand ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_genomicStrandTracker = false ;

                           public boolean isSplicedExon_genomicStrandSpecified(){
                               return localSplicedExon_genomicStrandTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicStrand_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicStrand_type0 getSplicedExon_genomicStrand(){
                               return localSplicedExon_genomicStrand;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_genomicStrand
                               */
                               public void setSplicedExon_genomicStrand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicStrand_type0 param){
                            localSplicedExon_genomicStrandTracker = param != null;
                                   
                                            this.localSplicedExon_genomicStrand=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_parts
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_parts_type0 localSplicedExon_parts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_partsTracker = false ;

                           public boolean isSplicedExon_partsSpecified(){
                               return localSplicedExon_partsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_parts_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_parts_type0 getSplicedExon_parts(){
                               return localSplicedExon_parts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_parts
                               */
                               public void setSplicedExon_parts(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_parts_type0 param){
                            localSplicedExon_partsTracker = param != null;
                                   
                                            this.localSplicedExon_parts=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_scores
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_scores_type0 localSplicedExon_scores ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_scoresTracker = false ;

                           public boolean isSplicedExon_scoresSpecified(){
                               return localSplicedExon_scoresTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_scores_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_scores_type0 getSplicedExon_scores(){
                               return localSplicedExon_scores;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_scores
                               */
                               public void setSplicedExon_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_scores_type0 param){
                            localSplicedExon_scoresTracker = param != null;
                                   
                                            this.localSplicedExon_scores=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_acceptorBeforeExon
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_acceptorBeforeExon_type0 localSplicedExon_acceptorBeforeExon ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_acceptorBeforeExonTracker = false ;

                           public boolean isSplicedExon_acceptorBeforeExonSpecified(){
                               return localSplicedExon_acceptorBeforeExonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_acceptorBeforeExon_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_acceptorBeforeExon_type0 getSplicedExon_acceptorBeforeExon(){
                               return localSplicedExon_acceptorBeforeExon;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_acceptorBeforeExon
                               */
                               public void setSplicedExon_acceptorBeforeExon(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_acceptorBeforeExon_type0 param){
                            localSplicedExon_acceptorBeforeExonTracker = param != null;
                                   
                                            this.localSplicedExon_acceptorBeforeExon=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_donorAfterExon
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_donorAfterExon_type0 localSplicedExon_donorAfterExon ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_donorAfterExonTracker = false ;

                           public boolean isSplicedExon_donorAfterExonSpecified(){
                               return localSplicedExon_donorAfterExonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_donorAfterExon_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_donorAfterExon_type0 getSplicedExon_donorAfterExon(){
                               return localSplicedExon_donorAfterExon;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_donorAfterExon
                               */
                               public void setSplicedExon_donorAfterExon(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_donorAfterExon_type0 param){
                            localSplicedExon_donorAfterExonTracker = param != null;
                                   
                                            this.localSplicedExon_donorAfterExon=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_partial
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_partial_type0 localSplicedExon_partial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_partialTracker = false ;

                           public boolean isSplicedExon_partialSpecified(){
                               return localSplicedExon_partialTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_partial_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_partial_type0 getSplicedExon_partial(){
                               return localSplicedExon_partial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_partial
                               */
                               public void setSplicedExon_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_partial_type0 param){
                            localSplicedExon_partialTracker = param != null;
                                   
                                            this.localSplicedExon_partial=param;
                                    

                               }
                            

                        /**
                        * field for SplicedExon_ext
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_ext_type0 localSplicedExon_ext ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSplicedExon_extTracker = false ;

                           public boolean isSplicedExon_extSpecified(){
                               return localSplicedExon_extTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_ext_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_ext_type0 getSplicedExon_ext(){
                               return localSplicedExon_ext;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SplicedExon_ext
                               */
                               public void setSplicedExon_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_ext_type0 param){
                            localSplicedExon_extTracker = param != null;
                                   
                                            this.localSplicedExon_ext=param;
                                    

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
                           namespacePrefix+":Spliced-exon_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Spliced-exon_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localSplicedExon_productStart==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-start cannot be null!!");
                                            }
                                           localSplicedExon_productStart.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-start"),
                                               xmlWriter);
                                        
                                            if (localSplicedExon_productEnd==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-end cannot be null!!");
                                            }
                                           localSplicedExon_productEnd.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-end"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Spliced-exon_genomic-start", xmlWriter);
                             

                                          if (localSplicedExon_genomicStart==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-start cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSplicedExon_genomicStart));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Spliced-exon_genomic-end", xmlWriter);
                             

                                          if (localSplicedExon_genomicEnd==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-end cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSplicedExon_genomicEnd));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localSplicedExon_productIdTracker){
                                            if (localSplicedExon_productId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-id cannot be null!!");
                                            }
                                           localSplicedExon_productId.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-id"),
                                               xmlWriter);
                                        } if (localSplicedExon_genomicIdTracker){
                                            if (localSplicedExon_genomicId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-id cannot be null!!");
                                            }
                                           localSplicedExon_genomicId.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_genomic-id"),
                                               xmlWriter);
                                        } if (localSplicedExon_productStrandTracker){
                                            if (localSplicedExon_productStrand==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-strand cannot be null!!");
                                            }
                                           localSplicedExon_productStrand.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-strand"),
                                               xmlWriter);
                                        } if (localSplicedExon_genomicStrandTracker){
                                            if (localSplicedExon_genomicStrand==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-strand cannot be null!!");
                                            }
                                           localSplicedExon_genomicStrand.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_genomic-strand"),
                                               xmlWriter);
                                        } if (localSplicedExon_partsTracker){
                                            if (localSplicedExon_parts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_parts cannot be null!!");
                                            }
                                           localSplicedExon_parts.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_parts"),
                                               xmlWriter);
                                        } if (localSplicedExon_scoresTracker){
                                            if (localSplicedExon_scores==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_scores cannot be null!!");
                                            }
                                           localSplicedExon_scores.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_scores"),
                                               xmlWriter);
                                        } if (localSplicedExon_acceptorBeforeExonTracker){
                                            if (localSplicedExon_acceptorBeforeExon==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_acceptor-before-exon cannot be null!!");
                                            }
                                           localSplicedExon_acceptorBeforeExon.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_acceptor-before-exon"),
                                               xmlWriter);
                                        } if (localSplicedExon_donorAfterExonTracker){
                                            if (localSplicedExon_donorAfterExon==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_donor-after-exon cannot be null!!");
                                            }
                                           localSplicedExon_donorAfterExon.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_donor-after-exon"),
                                               xmlWriter);
                                        } if (localSplicedExon_partialTracker){
                                            if (localSplicedExon_partial==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_partial cannot be null!!");
                                            }
                                           localSplicedExon_partial.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_partial"),
                                               xmlWriter);
                                        } if (localSplicedExon_extTracker){
                                            if (localSplicedExon_ext==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Spliced-exon_ext cannot be null!!");
                                            }
                                           localSplicedExon_ext.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_ext"),
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
                                                                      "Spliced-exon_product-start"));
                            
                            
                                    if (localSplicedExon_productStart==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-start cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_productStart);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_product-end"));
                            
                            
                                    if (localSplicedExon_productEnd==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-end cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_productEnd);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_genomic-start"));
                                 
                                        if (localSplicedExon_genomicStart != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSplicedExon_genomicStart));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-start cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_genomic-end"));
                                 
                                        if (localSplicedExon_genomicEnd != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSplicedExon_genomicEnd));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-end cannot be null!!");
                                        }
                                     if (localSplicedExon_productIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_product-id"));
                            
                            
                                    if (localSplicedExon_productId==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-id cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_productId);
                                } if (localSplicedExon_genomicIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_genomic-id"));
                            
                            
                                    if (localSplicedExon_genomicId==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-id cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_genomicId);
                                } if (localSplicedExon_productStrandTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_product-strand"));
                            
                            
                                    if (localSplicedExon_productStrand==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_product-strand cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_productStrand);
                                } if (localSplicedExon_genomicStrandTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_genomic-strand"));
                            
                            
                                    if (localSplicedExon_genomicStrand==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_genomic-strand cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_genomicStrand);
                                } if (localSplicedExon_partsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_parts"));
                            
                            
                                    if (localSplicedExon_parts==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_parts cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_parts);
                                } if (localSplicedExon_scoresTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_scores"));
                            
                            
                                    if (localSplicedExon_scores==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_scores cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_scores);
                                } if (localSplicedExon_acceptorBeforeExonTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_acceptor-before-exon"));
                            
                            
                                    if (localSplicedExon_acceptorBeforeExon==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_acceptor-before-exon cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_acceptorBeforeExon);
                                } if (localSplicedExon_donorAfterExonTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_donor-after-exon"));
                            
                            
                                    if (localSplicedExon_donorAfterExon==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_donor-after-exon cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_donorAfterExon);
                                } if (localSplicedExon_partialTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_partial"));
                            
                            
                                    if (localSplicedExon_partial==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_partial cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_partial);
                                } if (localSplicedExon_extTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Spliced-exon_ext"));
                            
                            
                                    if (localSplicedExon_ext==null){
                                         throw new org.apache.axis2.databinding.ADBException("Spliced-exon_ext cannot be null!!");
                                    }
                                    elementList.add(localSplicedExon_ext);
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
        public static SplicedExon_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SplicedExon_type0 object =
                new SplicedExon_type0();

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
                    
                            if (!"Spliced-exon_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SplicedExon_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-start").equals(reader.getName())){
                                
                                                object.setSplicedExon_productStart(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStart_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-end").equals(reader.getName())){
                                
                                                object.setSplicedExon_productEnd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productEnd_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_genomic-start").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Spliced-exon_genomic-start" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSplicedExon_genomicStart(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_genomic-end").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Spliced-exon_genomic-end" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSplicedExon_genomicEnd(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-id").equals(reader.getName())){
                                
                                                object.setSplicedExon_productId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productId_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_genomic-id").equals(reader.getName())){
                                
                                                object.setSplicedExon_genomicId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicId_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_product-strand").equals(reader.getName())){
                                
                                                object.setSplicedExon_productStrand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_productStrand_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_genomic-strand").equals(reader.getName())){
                                
                                                object.setSplicedExon_genomicStrand(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_genomicStrand_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_parts").equals(reader.getName())){
                                
                                                object.setSplicedExon_parts(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_parts_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_scores").equals(reader.getName())){
                                
                                                object.setSplicedExon_scores(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_scores_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_acceptor-before-exon").equals(reader.getName())){
                                
                                                object.setSplicedExon_acceptorBeforeExon(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_acceptorBeforeExon_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_donor-after-exon").equals(reader.getName())){
                                
                                                object.setSplicedExon_donorAfterExon(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_donorAfterExon_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_partial").equals(reader.getName())){
                                
                                                object.setSplicedExon_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_partial_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Spliced-exon_ext").equals(reader.getName())){
                                
                                                object.setSplicedExon_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SplicedExon_ext_type0.Factory.parse(reader));
                                              
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
           
    