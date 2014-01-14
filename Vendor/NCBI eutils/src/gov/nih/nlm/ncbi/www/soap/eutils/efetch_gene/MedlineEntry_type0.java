
/**
 * MedlineEntry_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  MedlineEntry_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MedlineEntry_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Medline-entry_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for MedlineEntry_uid
                        */

                        
                                    protected java.math.BigInteger localMedlineEntry_uid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_uidTracker = false ;

                           public boolean isMedlineEntry_uidSpecified(){
                               return localMedlineEntry_uidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getMedlineEntry_uid(){
                               return localMedlineEntry_uid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_uid
                               */
                               public void setMedlineEntry_uid(java.math.BigInteger param){
                            localMedlineEntry_uidTracker = param != null;
                                   
                                            this.localMedlineEntry_uid=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_em
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_em_type0 localMedlineEntry_em ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_em_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_em_type0 getMedlineEntry_em(){
                               return localMedlineEntry_em;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_em
                               */
                               public void setMedlineEntry_em(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_em_type0 param){
                            
                                            this.localMedlineEntry_em=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_cit
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_cit_type0 localMedlineEntry_cit ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_cit_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_cit_type0 getMedlineEntry_cit(){
                               return localMedlineEntry_cit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_cit
                               */
                               public void setMedlineEntry_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_cit_type0 param){
                            
                                            this.localMedlineEntry_cit=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_abstract
                        */

                        
                                    protected java.lang.String localMedlineEntry_abstract ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_abstractTracker = false ;

                           public boolean isMedlineEntry_abstractSpecified(){
                               return localMedlineEntry_abstractTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMedlineEntry_abstract(){
                               return localMedlineEntry_abstract;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_abstract
                               */
                               public void setMedlineEntry_abstract(java.lang.String param){
                            localMedlineEntry_abstractTracker = param != null;
                                   
                                            this.localMedlineEntry_abstract=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_mesh
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mesh_type0 localMedlineEntry_mesh ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_meshTracker = false ;

                           public boolean isMedlineEntry_meshSpecified(){
                               return localMedlineEntry_meshTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mesh_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mesh_type0 getMedlineEntry_mesh(){
                               return localMedlineEntry_mesh;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_mesh
                               */
                               public void setMedlineEntry_mesh(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mesh_type0 param){
                            localMedlineEntry_meshTracker = param != null;
                                   
                                            this.localMedlineEntry_mesh=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_substance
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_substance_type0 localMedlineEntry_substance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_substanceTracker = false ;

                           public boolean isMedlineEntry_substanceSpecified(){
                               return localMedlineEntry_substanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_substance_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_substance_type0 getMedlineEntry_substance(){
                               return localMedlineEntry_substance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_substance
                               */
                               public void setMedlineEntry_substance(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_substance_type0 param){
                            localMedlineEntry_substanceTracker = param != null;
                                   
                                            this.localMedlineEntry_substance=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_xref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_xref_type0 localMedlineEntry_xref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_xrefTracker = false ;

                           public boolean isMedlineEntry_xrefSpecified(){
                               return localMedlineEntry_xrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_xref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_xref_type0 getMedlineEntry_xref(){
                               return localMedlineEntry_xref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_xref
                               */
                               public void setMedlineEntry_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_xref_type0 param){
                            localMedlineEntry_xrefTracker = param != null;
                                   
                                            this.localMedlineEntry_xref=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_idnum
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_idnum_type0 localMedlineEntry_idnum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_idnumTracker = false ;

                           public boolean isMedlineEntry_idnumSpecified(){
                               return localMedlineEntry_idnumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_idnum_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_idnum_type0 getMedlineEntry_idnum(){
                               return localMedlineEntry_idnum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_idnum
                               */
                               public void setMedlineEntry_idnum(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_idnum_type0 param){
                            localMedlineEntry_idnumTracker = param != null;
                                   
                                            this.localMedlineEntry_idnum=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_gene
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_gene_type0 localMedlineEntry_gene ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_geneTracker = false ;

                           public boolean isMedlineEntry_geneSpecified(){
                               return localMedlineEntry_geneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_gene_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_gene_type0 getMedlineEntry_gene(){
                               return localMedlineEntry_gene;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_gene
                               */
                               public void setMedlineEntry_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_gene_type0 param){
                            localMedlineEntry_geneTracker = param != null;
                                   
                                            this.localMedlineEntry_gene=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_pmid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pmid_type0 localMedlineEntry_pmid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_pmidTracker = false ;

                           public boolean isMedlineEntry_pmidSpecified(){
                               return localMedlineEntry_pmidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pmid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pmid_type0 getMedlineEntry_pmid(){
                               return localMedlineEntry_pmid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_pmid
                               */
                               public void setMedlineEntry_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pmid_type0 param){
                            localMedlineEntry_pmidTracker = param != null;
                                   
                                            this.localMedlineEntry_pmid=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_pubType
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pubType_type0 localMedlineEntry_pubType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_pubTypeTracker = false ;

                           public boolean isMedlineEntry_pubTypeSpecified(){
                               return localMedlineEntry_pubTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pubType_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pubType_type0 getMedlineEntry_pubType(){
                               return localMedlineEntry_pubType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_pubType
                               */
                               public void setMedlineEntry_pubType(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pubType_type0 param){
                            localMedlineEntry_pubTypeTracker = param != null;
                                   
                                            this.localMedlineEntry_pubType=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_mlfield
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mlfield_type0 localMedlineEntry_mlfield ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_mlfieldTracker = false ;

                           public boolean isMedlineEntry_mlfieldSpecified(){
                               return localMedlineEntry_mlfieldTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mlfield_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mlfield_type0 getMedlineEntry_mlfield(){
                               return localMedlineEntry_mlfield;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_mlfield
                               */
                               public void setMedlineEntry_mlfield(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mlfield_type0 param){
                            localMedlineEntry_mlfieldTracker = param != null;
                                   
                                            this.localMedlineEntry_mlfield=param;
                                    

                               }
                            

                        /**
                        * field for MedlineEntry_status
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_status_type0 localMedlineEntry_status ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMedlineEntry_statusTracker = false ;

                           public boolean isMedlineEntry_statusSpecified(){
                               return localMedlineEntry_statusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_status_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_status_type0 getMedlineEntry_status(){
                               return localMedlineEntry_status;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MedlineEntry_status
                               */
                               public void setMedlineEntry_status(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_status_type0 param){
                            localMedlineEntry_statusTracker = param != null;
                                   
                                            this.localMedlineEntry_status=param;
                                    

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
                           namespacePrefix+":Medline-entry_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Medline-entry_type0",
                           xmlWriter);
                   }

               
                   }
                if (localMedlineEntry_uidTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Medline-entry_uid", xmlWriter);
                             

                                          if (localMedlineEntry_uid==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Medline-entry_uid cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMedlineEntry_uid));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localMedlineEntry_em==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_em cannot be null!!");
                                            }
                                           localMedlineEntry_em.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_em"),
                                               xmlWriter);
                                        
                                            if (localMedlineEntry_cit==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_cit cannot be null!!");
                                            }
                                           localMedlineEntry_cit.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_cit"),
                                               xmlWriter);
                                         if (localMedlineEntry_abstractTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Medline-entry_abstract", xmlWriter);
                             

                                          if (localMedlineEntry_abstract==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Medline-entry_abstract cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMedlineEntry_abstract);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMedlineEntry_meshTracker){
                                            if (localMedlineEntry_mesh==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_mesh cannot be null!!");
                                            }
                                           localMedlineEntry_mesh.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_mesh"),
                                               xmlWriter);
                                        } if (localMedlineEntry_substanceTracker){
                                            if (localMedlineEntry_substance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_substance cannot be null!!");
                                            }
                                           localMedlineEntry_substance.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_substance"),
                                               xmlWriter);
                                        } if (localMedlineEntry_xrefTracker){
                                            if (localMedlineEntry_xref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_xref cannot be null!!");
                                            }
                                           localMedlineEntry_xref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_xref"),
                                               xmlWriter);
                                        } if (localMedlineEntry_idnumTracker){
                                            if (localMedlineEntry_idnum==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_idnum cannot be null!!");
                                            }
                                           localMedlineEntry_idnum.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_idnum"),
                                               xmlWriter);
                                        } if (localMedlineEntry_geneTracker){
                                            if (localMedlineEntry_gene==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_gene cannot be null!!");
                                            }
                                           localMedlineEntry_gene.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_gene"),
                                               xmlWriter);
                                        } if (localMedlineEntry_pmidTracker){
                                            if (localMedlineEntry_pmid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_pmid cannot be null!!");
                                            }
                                           localMedlineEntry_pmid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_pmid"),
                                               xmlWriter);
                                        } if (localMedlineEntry_pubTypeTracker){
                                            if (localMedlineEntry_pubType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_pub-type cannot be null!!");
                                            }
                                           localMedlineEntry_pubType.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_pub-type"),
                                               xmlWriter);
                                        } if (localMedlineEntry_mlfieldTracker){
                                            if (localMedlineEntry_mlfield==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_mlfield cannot be null!!");
                                            }
                                           localMedlineEntry_mlfield.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_mlfield"),
                                               xmlWriter);
                                        } if (localMedlineEntry_statusTracker){
                                            if (localMedlineEntry_status==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Medline-entry_status cannot be null!!");
                                            }
                                           localMedlineEntry_status.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_status"),
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

                 if (localMedlineEntry_uidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_uid"));
                                 
                                        if (localMedlineEntry_uid != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMedlineEntry_uid));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Medline-entry_uid cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_em"));
                            
                            
                                    if (localMedlineEntry_em==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_em cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_em);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_cit"));
                            
                            
                                    if (localMedlineEntry_cit==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_cit cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_cit);
                                 if (localMedlineEntry_abstractTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_abstract"));
                                 
                                        if (localMedlineEntry_abstract != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMedlineEntry_abstract));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Medline-entry_abstract cannot be null!!");
                                        }
                                    } if (localMedlineEntry_meshTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_mesh"));
                            
                            
                                    if (localMedlineEntry_mesh==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_mesh cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_mesh);
                                } if (localMedlineEntry_substanceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_substance"));
                            
                            
                                    if (localMedlineEntry_substance==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_substance cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_substance);
                                } if (localMedlineEntry_xrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_xref"));
                            
                            
                                    if (localMedlineEntry_xref==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_xref cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_xref);
                                } if (localMedlineEntry_idnumTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_idnum"));
                            
                            
                                    if (localMedlineEntry_idnum==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_idnum cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_idnum);
                                } if (localMedlineEntry_geneTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_gene"));
                            
                            
                                    if (localMedlineEntry_gene==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_gene cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_gene);
                                } if (localMedlineEntry_pmidTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_pmid"));
                            
                            
                                    if (localMedlineEntry_pmid==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_pmid cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_pmid);
                                } if (localMedlineEntry_pubTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_pub-type"));
                            
                            
                                    if (localMedlineEntry_pubType==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_pub-type cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_pubType);
                                } if (localMedlineEntry_mlfieldTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_mlfield"));
                            
                            
                                    if (localMedlineEntry_mlfield==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_mlfield cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_mlfield);
                                } if (localMedlineEntry_statusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Medline-entry_status"));
                            
                            
                                    if (localMedlineEntry_status==null){
                                         throw new org.apache.axis2.databinding.ADBException("Medline-entry_status cannot be null!!");
                                    }
                                    elementList.add(localMedlineEntry_status);
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
        public static MedlineEntry_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MedlineEntry_type0 object =
                new MedlineEntry_type0();

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
                    
                            if (!"Medline-entry_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MedlineEntry_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_uid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Medline-entry_uid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMedlineEntry_uid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_em").equals(reader.getName())){
                                
                                                object.setMedlineEntry_em(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_em_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_cit").equals(reader.getName())){
                                
                                                object.setMedlineEntry_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_cit_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_abstract").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Medline-entry_abstract" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMedlineEntry_abstract(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_mesh").equals(reader.getName())){
                                
                                                object.setMedlineEntry_mesh(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mesh_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_substance").equals(reader.getName())){
                                
                                                object.setMedlineEntry_substance(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_substance_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_xref").equals(reader.getName())){
                                
                                                object.setMedlineEntry_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_xref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_idnum").equals(reader.getName())){
                                
                                                object.setMedlineEntry_idnum(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_idnum_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_gene").equals(reader.getName())){
                                
                                                object.setMedlineEntry_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_gene_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_pmid").equals(reader.getName())){
                                
                                                object.setMedlineEntry_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pmid_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_pub-type").equals(reader.getName())){
                                
                                                object.setMedlineEntry_pubType(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_pubType_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_mlfield").equals(reader.getName())){
                                
                                                object.setMedlineEntry_mlfield(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_mlfield_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Medline-entry_status").equals(reader.getName())){
                                
                                                object.setMedlineEntry_status(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.MedlineEntry_status_type0.Factory.parse(reader));
                                              
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
           
    