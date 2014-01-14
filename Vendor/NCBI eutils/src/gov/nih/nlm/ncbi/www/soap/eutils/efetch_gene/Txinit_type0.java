
/**
 * Txinit_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Txinit_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Txinit_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Txinit_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Txinit_name
                        */

                        
                                    protected java.lang.String localTxinit_name ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTxinit_name(){
                               return localTxinit_name;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_name
                               */
                               public void setTxinit_name(java.lang.String param){
                            
                                            this.localTxinit_name=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_syn
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_syn_type0 localTxinit_syn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_synTracker = false ;

                           public boolean isTxinit_synSpecified(){
                               return localTxinit_synTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_syn_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_syn_type0 getTxinit_syn(){
                               return localTxinit_syn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_syn
                               */
                               public void setTxinit_syn(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_syn_type0 param){
                            localTxinit_synTracker = param != null;
                                   
                                            this.localTxinit_syn=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_gene
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_gene_type0 localTxinit_gene ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_geneTracker = false ;

                           public boolean isTxinit_geneSpecified(){
                               return localTxinit_geneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_gene_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_gene_type0 getTxinit_gene(){
                               return localTxinit_gene;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_gene
                               */
                               public void setTxinit_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_gene_type0 param){
                            localTxinit_geneTracker = param != null;
                                   
                                            this.localTxinit_gene=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_protein
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_protein_type0 localTxinit_protein ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_proteinTracker = false ;

                           public boolean isTxinit_proteinSpecified(){
                               return localTxinit_proteinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_protein_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_protein_type0 getTxinit_protein(){
                               return localTxinit_protein;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_protein
                               */
                               public void setTxinit_protein(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_protein_type0 param){
                            localTxinit_proteinTracker = param != null;
                                   
                                            this.localTxinit_protein=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_rna
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_rna_type0 localTxinit_rna ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_rnaTracker = false ;

                           public boolean isTxinit_rnaSpecified(){
                               return localTxinit_rnaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_rna_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_rna_type0 getTxinit_rna(){
                               return localTxinit_rna;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_rna
                               */
                               public void setTxinit_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_rna_type0 param){
                            localTxinit_rnaTracker = param != null;
                                   
                                            this.localTxinit_rna=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_expression
                        */

                        
                                    protected java.lang.String localTxinit_expression ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_expressionTracker = false ;

                           public boolean isTxinit_expressionSpecified(){
                               return localTxinit_expressionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTxinit_expression(){
                               return localTxinit_expression;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_expression
                               */
                               public void setTxinit_expression(java.lang.String param){
                            localTxinit_expressionTracker = param != null;
                                   
                                            this.localTxinit_expression=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_txsystem
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txsystem_type0 localTxinit_txsystem ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txsystem_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txsystem_type0 getTxinit_txsystem(){
                               return localTxinit_txsystem;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_txsystem
                               */
                               public void setTxinit_txsystem(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txsystem_type0 param){
                            
                                            this.localTxinit_txsystem=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_txdescr
                        */

                        
                                    protected java.lang.String localTxinit_txdescr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_txdescrTracker = false ;

                           public boolean isTxinit_txdescrSpecified(){
                               return localTxinit_txdescrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTxinit_txdescr(){
                               return localTxinit_txdescr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_txdescr
                               */
                               public void setTxinit_txdescr(java.lang.String param){
                            localTxinit_txdescrTracker = param != null;
                                   
                                            this.localTxinit_txdescr=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_txorg
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txorg_type0 localTxinit_txorg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_txorgTracker = false ;

                           public boolean isTxinit_txorgSpecified(){
                               return localTxinit_txorgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txorg_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txorg_type0 getTxinit_txorg(){
                               return localTxinit_txorg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_txorg
                               */
                               public void setTxinit_txorg(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txorg_type0 param){
                            localTxinit_txorgTracker = param != null;
                                   
                                            this.localTxinit_txorg=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_mappingPrecise
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_mappingPrecise_type0 localTxinit_mappingPrecise ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_mappingPreciseTracker = false ;

                           public boolean isTxinit_mappingPreciseSpecified(){
                               return localTxinit_mappingPreciseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_mappingPrecise_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_mappingPrecise_type0 getTxinit_mappingPrecise(){
                               return localTxinit_mappingPrecise;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_mappingPrecise
                               */
                               public void setTxinit_mappingPrecise(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_mappingPrecise_type0 param){
                            localTxinit_mappingPreciseTracker = param != null;
                                   
                                            this.localTxinit_mappingPrecise=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_locationAccurate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_locationAccurate_type0 localTxinit_locationAccurate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_locationAccurateTracker = false ;

                           public boolean isTxinit_locationAccurateSpecified(){
                               return localTxinit_locationAccurateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_locationAccurate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_locationAccurate_type0 getTxinit_locationAccurate(){
                               return localTxinit_locationAccurate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_locationAccurate
                               */
                               public void setTxinit_locationAccurate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_locationAccurate_type0 param){
                            localTxinit_locationAccurateTracker = param != null;
                                   
                                            this.localTxinit_locationAccurate=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_inittype
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_inittype_type0 localTxinit_inittype ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_inittypeTracker = false ;

                           public boolean isTxinit_inittypeSpecified(){
                               return localTxinit_inittypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_inittype_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_inittype_type0 getTxinit_inittype(){
                               return localTxinit_inittype;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_inittype
                               */
                               public void setTxinit_inittype(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_inittype_type0 param){
                            localTxinit_inittypeTracker = param != null;
                                   
                                            this.localTxinit_inittype=param;
                                    

                               }
                            

                        /**
                        * field for Txinit_evidence
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_evidence_type0 localTxinit_evidence ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTxinit_evidenceTracker = false ;

                           public boolean isTxinit_evidenceSpecified(){
                               return localTxinit_evidenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_evidence_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_evidence_type0 getTxinit_evidence(){
                               return localTxinit_evidence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Txinit_evidence
                               */
                               public void setTxinit_evidence(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_evidence_type0 param){
                            localTxinit_evidenceTracker = param != null;
                                   
                                            this.localTxinit_evidence=param;
                                    

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
                           namespacePrefix+":Txinit_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Txinit_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Txinit_name", xmlWriter);
                             

                                          if (localTxinit_name==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Txinit_name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTxinit_name);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localTxinit_synTracker){
                                            if (localTxinit_syn==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_syn cannot be null!!");
                                            }
                                           localTxinit_syn.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_syn"),
                                               xmlWriter);
                                        } if (localTxinit_geneTracker){
                                            if (localTxinit_gene==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_gene cannot be null!!");
                                            }
                                           localTxinit_gene.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_gene"),
                                               xmlWriter);
                                        } if (localTxinit_proteinTracker){
                                            if (localTxinit_protein==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_protein cannot be null!!");
                                            }
                                           localTxinit_protein.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_protein"),
                                               xmlWriter);
                                        } if (localTxinit_rnaTracker){
                                            if (localTxinit_rna==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_rna cannot be null!!");
                                            }
                                           localTxinit_rna.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_rna"),
                                               xmlWriter);
                                        } if (localTxinit_expressionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Txinit_expression", xmlWriter);
                             

                                          if (localTxinit_expression==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Txinit_expression cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTxinit_expression);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localTxinit_txsystem==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_txsystem cannot be null!!");
                                            }
                                           localTxinit_txsystem.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_txsystem"),
                                               xmlWriter);
                                         if (localTxinit_txdescrTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Txinit_txdescr", xmlWriter);
                             

                                          if (localTxinit_txdescr==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Txinit_txdescr cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTxinit_txdescr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTxinit_txorgTracker){
                                            if (localTxinit_txorg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_txorg cannot be null!!");
                                            }
                                           localTxinit_txorg.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_txorg"),
                                               xmlWriter);
                                        } if (localTxinit_mappingPreciseTracker){
                                            if (localTxinit_mappingPrecise==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_mapping-precise cannot be null!!");
                                            }
                                           localTxinit_mappingPrecise.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_mapping-precise"),
                                               xmlWriter);
                                        } if (localTxinit_locationAccurateTracker){
                                            if (localTxinit_locationAccurate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_location-accurate cannot be null!!");
                                            }
                                           localTxinit_locationAccurate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_location-accurate"),
                                               xmlWriter);
                                        } if (localTxinit_inittypeTracker){
                                            if (localTxinit_inittype==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_inittype cannot be null!!");
                                            }
                                           localTxinit_inittype.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_inittype"),
                                               xmlWriter);
                                        } if (localTxinit_evidenceTracker){
                                            if (localTxinit_evidence==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Txinit_evidence cannot be null!!");
                                            }
                                           localTxinit_evidence.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_evidence"),
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
                                                                      "Txinit_name"));
                                 
                                        if (localTxinit_name != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxinit_name));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Txinit_name cannot be null!!");
                                        }
                                     if (localTxinit_synTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_syn"));
                            
                            
                                    if (localTxinit_syn==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_syn cannot be null!!");
                                    }
                                    elementList.add(localTxinit_syn);
                                } if (localTxinit_geneTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_gene"));
                            
                            
                                    if (localTxinit_gene==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_gene cannot be null!!");
                                    }
                                    elementList.add(localTxinit_gene);
                                } if (localTxinit_proteinTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_protein"));
                            
                            
                                    if (localTxinit_protein==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_protein cannot be null!!");
                                    }
                                    elementList.add(localTxinit_protein);
                                } if (localTxinit_rnaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_rna"));
                            
                            
                                    if (localTxinit_rna==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_rna cannot be null!!");
                                    }
                                    elementList.add(localTxinit_rna);
                                } if (localTxinit_expressionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_expression"));
                                 
                                        if (localTxinit_expression != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxinit_expression));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Txinit_expression cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_txsystem"));
                            
                            
                                    if (localTxinit_txsystem==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_txsystem cannot be null!!");
                                    }
                                    elementList.add(localTxinit_txsystem);
                                 if (localTxinit_txdescrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_txdescr"));
                                 
                                        if (localTxinit_txdescr != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTxinit_txdescr));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Txinit_txdescr cannot be null!!");
                                        }
                                    } if (localTxinit_txorgTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_txorg"));
                            
                            
                                    if (localTxinit_txorg==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_txorg cannot be null!!");
                                    }
                                    elementList.add(localTxinit_txorg);
                                } if (localTxinit_mappingPreciseTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_mapping-precise"));
                            
                            
                                    if (localTxinit_mappingPrecise==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_mapping-precise cannot be null!!");
                                    }
                                    elementList.add(localTxinit_mappingPrecise);
                                } if (localTxinit_locationAccurateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_location-accurate"));
                            
                            
                                    if (localTxinit_locationAccurate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_location-accurate cannot be null!!");
                                    }
                                    elementList.add(localTxinit_locationAccurate);
                                } if (localTxinit_inittypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_inittype"));
                            
                            
                                    if (localTxinit_inittype==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_inittype cannot be null!!");
                                    }
                                    elementList.add(localTxinit_inittype);
                                } if (localTxinit_evidenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Txinit_evidence"));
                            
                            
                                    if (localTxinit_evidence==null){
                                         throw new org.apache.axis2.databinding.ADBException("Txinit_evidence cannot be null!!");
                                    }
                                    elementList.add(localTxinit_evidence);
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
        public static Txinit_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Txinit_type0 object =
                new Txinit_type0();

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
                    
                            if (!"Txinit_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Txinit_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Txinit_name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTxinit_name(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_syn").equals(reader.getName())){
                                
                                                object.setTxinit_syn(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_syn_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_gene").equals(reader.getName())){
                                
                                                object.setTxinit_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_gene_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_protein").equals(reader.getName())){
                                
                                                object.setTxinit_protein(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_protein_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_rna").equals(reader.getName())){
                                
                                                object.setTxinit_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_rna_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_expression").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Txinit_expression" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTxinit_expression(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_txsystem").equals(reader.getName())){
                                
                                                object.setTxinit_txsystem(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txsystem_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_txdescr").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Txinit_txdescr" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTxinit_txdescr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_txorg").equals(reader.getName())){
                                
                                                object.setTxinit_txorg(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_txorg_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_mapping-precise").equals(reader.getName())){
                                
                                                object.setTxinit_mappingPrecise(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_mappingPrecise_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_location-accurate").equals(reader.getName())){
                                
                                                object.setTxinit_locationAccurate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_locationAccurate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_inittype").equals(reader.getName())){
                                
                                                object.setTxinit_inittype(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_inittype_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Txinit_evidence").equals(reader.getName())){
                                
                                                object.setTxinit_evidence(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Txinit_evidence_type0.Factory.parse(reader));
                                              
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
           
    