
/**
 * GeneCommentary_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  GeneCommentary_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GeneCommentary_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Gene-commentary_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GeneCommentary_type
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_type_type0 localGeneCommentary_type ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_type_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_type_type0 getGeneCommentary_type(){
                               return localGeneCommentary_type;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_type
                               */
                               public void setGeneCommentary_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_type_type0 param){
                            
                                            this.localGeneCommentary_type=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_heading
                        */

                        
                                    protected java.lang.String localGeneCommentary_heading ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_headingTracker = false ;

                           public boolean isGeneCommentary_headingSpecified(){
                               return localGeneCommentary_headingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneCommentary_heading(){
                               return localGeneCommentary_heading;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_heading
                               */
                               public void setGeneCommentary_heading(java.lang.String param){
                            localGeneCommentary_headingTracker = param != null;
                                   
                                            this.localGeneCommentary_heading=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_label
                        */

                        
                                    protected java.lang.String localGeneCommentary_label ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_labelTracker = false ;

                           public boolean isGeneCommentary_labelSpecified(){
                               return localGeneCommentary_labelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneCommentary_label(){
                               return localGeneCommentary_label;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_label
                               */
                               public void setGeneCommentary_label(java.lang.String param){
                            localGeneCommentary_labelTracker = param != null;
                                   
                                            this.localGeneCommentary_label=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_text
                        */

                        
                                    protected java.lang.String localGeneCommentary_text ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_textTracker = false ;

                           public boolean isGeneCommentary_textSpecified(){
                               return localGeneCommentary_textTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneCommentary_text(){
                               return localGeneCommentary_text;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_text
                               */
                               public void setGeneCommentary_text(java.lang.String param){
                            localGeneCommentary_textTracker = param != null;
                                   
                                            this.localGeneCommentary_text=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_accession
                        */

                        
                                    protected java.lang.String localGeneCommentary_accession ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_accessionTracker = false ;

                           public boolean isGeneCommentary_accessionSpecified(){
                               return localGeneCommentary_accessionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGeneCommentary_accession(){
                               return localGeneCommentary_accession;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_accession
                               */
                               public void setGeneCommentary_accession(java.lang.String param){
                            localGeneCommentary_accessionTracker = param != null;
                                   
                                            this.localGeneCommentary_accession=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_version
                        */

                        
                                    protected java.math.BigInteger localGeneCommentary_version ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_versionTracker = false ;

                           public boolean isGeneCommentary_versionSpecified(){
                               return localGeneCommentary_versionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGeneCommentary_version(){
                               return localGeneCommentary_version;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_version
                               */
                               public void setGeneCommentary_version(java.math.BigInteger param){
                            localGeneCommentary_versionTracker = param != null;
                                   
                                            this.localGeneCommentary_version=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_xtraProperties
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_xtraProperties_type0 localGeneCommentary_xtraProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_xtraPropertiesTracker = false ;

                           public boolean isGeneCommentary_xtraPropertiesSpecified(){
                               return localGeneCommentary_xtraPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_xtraProperties_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_xtraProperties_type0 getGeneCommentary_xtraProperties(){
                               return localGeneCommentary_xtraProperties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_xtraProperties
                               */
                               public void setGeneCommentary_xtraProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_xtraProperties_type0 param){
                            localGeneCommentary_xtraPropertiesTracker = param != null;
                                   
                                            this.localGeneCommentary_xtraProperties=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_refs
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_refs_type0 localGeneCommentary_refs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_refsTracker = false ;

                           public boolean isGeneCommentary_refsSpecified(){
                               return localGeneCommentary_refsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_refs_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_refs_type0 getGeneCommentary_refs(){
                               return localGeneCommentary_refs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_refs
                               */
                               public void setGeneCommentary_refs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_refs_type0 param){
                            localGeneCommentary_refsTracker = param != null;
                                   
                                            this.localGeneCommentary_refs=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_source
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_source_type0 localGeneCommentary_source ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_sourceTracker = false ;

                           public boolean isGeneCommentary_sourceSpecified(){
                               return localGeneCommentary_sourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_source_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_source_type0 getGeneCommentary_source(){
                               return localGeneCommentary_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_source
                               */
                               public void setGeneCommentary_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_source_type0 param){
                            localGeneCommentary_sourceTracker = param != null;
                                   
                                            this.localGeneCommentary_source=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_genomicCoords
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_genomicCoords_type0 localGeneCommentary_genomicCoords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_genomicCoordsTracker = false ;

                           public boolean isGeneCommentary_genomicCoordsSpecified(){
                               return localGeneCommentary_genomicCoordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_genomicCoords_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_genomicCoords_type0 getGeneCommentary_genomicCoords(){
                               return localGeneCommentary_genomicCoords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_genomicCoords
                               */
                               public void setGeneCommentary_genomicCoords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_genomicCoords_type0 param){
                            localGeneCommentary_genomicCoordsTracker = param != null;
                                   
                                            this.localGeneCommentary_genomicCoords=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_seqs
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_seqs_type0 localGeneCommentary_seqs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_seqsTracker = false ;

                           public boolean isGeneCommentary_seqsSpecified(){
                               return localGeneCommentary_seqsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_seqs_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_seqs_type0 getGeneCommentary_seqs(){
                               return localGeneCommentary_seqs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_seqs
                               */
                               public void setGeneCommentary_seqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_seqs_type0 param){
                            localGeneCommentary_seqsTracker = param != null;
                                   
                                            this.localGeneCommentary_seqs=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_products
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_products_type0 localGeneCommentary_products ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_productsTracker = false ;

                           public boolean isGeneCommentary_productsSpecified(){
                               return localGeneCommentary_productsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_products_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_products_type0 getGeneCommentary_products(){
                               return localGeneCommentary_products;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_products
                               */
                               public void setGeneCommentary_products(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_products_type0 param){
                            localGeneCommentary_productsTracker = param != null;
                                   
                                            this.localGeneCommentary_products=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_properties
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_properties_type0 localGeneCommentary_properties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_propertiesTracker = false ;

                           public boolean isGeneCommentary_propertiesSpecified(){
                               return localGeneCommentary_propertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_properties_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_properties_type0 getGeneCommentary_properties(){
                               return localGeneCommentary_properties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_properties
                               */
                               public void setGeneCommentary_properties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_properties_type0 param){
                            localGeneCommentary_propertiesTracker = param != null;
                                   
                                            this.localGeneCommentary_properties=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_comment
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_comment_type0 localGeneCommentary_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_commentTracker = false ;

                           public boolean isGeneCommentary_commentSpecified(){
                               return localGeneCommentary_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_comment_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_comment_type0 getGeneCommentary_comment(){
                               return localGeneCommentary_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_comment
                               */
                               public void setGeneCommentary_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_comment_type0 param){
                            localGeneCommentary_commentTracker = param != null;
                                   
                                            this.localGeneCommentary_comment=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_createDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_createDate_type0 localGeneCommentary_createDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_createDateTracker = false ;

                           public boolean isGeneCommentary_createDateSpecified(){
                               return localGeneCommentary_createDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_createDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_createDate_type0 getGeneCommentary_createDate(){
                               return localGeneCommentary_createDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_createDate
                               */
                               public void setGeneCommentary_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_createDate_type0 param){
                            localGeneCommentary_createDateTracker = param != null;
                                   
                                            this.localGeneCommentary_createDate=param;
                                    

                               }
                            

                        /**
                        * field for GeneCommentary_updateDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_updateDate_type0 localGeneCommentary_updateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeneCommentary_updateDateTracker = false ;

                           public boolean isGeneCommentary_updateDateSpecified(){
                               return localGeneCommentary_updateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_updateDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_updateDate_type0 getGeneCommentary_updateDate(){
                               return localGeneCommentary_updateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeneCommentary_updateDate
                               */
                               public void setGeneCommentary_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_updateDate_type0 param){
                            localGeneCommentary_updateDateTracker = param != null;
                                   
                                            this.localGeneCommentary_updateDate=param;
                                    

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
                           namespacePrefix+":Gene-commentary_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Gene-commentary_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localGeneCommentary_type==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_type cannot be null!!");
                                            }
                                           localGeneCommentary_type.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_type"),
                                               xmlWriter);
                                         if (localGeneCommentary_headingTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-commentary_heading", xmlWriter);
                             

                                          if (localGeneCommentary_heading==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-commentary_heading cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneCommentary_heading);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneCommentary_labelTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-commentary_label", xmlWriter);
                             

                                          if (localGeneCommentary_label==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-commentary_label cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneCommentary_label);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneCommentary_textTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-commentary_text", xmlWriter);
                             

                                          if (localGeneCommentary_text==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-commentary_text cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneCommentary_text);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneCommentary_accessionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-commentary_accession", xmlWriter);
                             

                                          if (localGeneCommentary_accession==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-commentary_accession cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGeneCommentary_accession);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneCommentary_versionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Gene-commentary_version", xmlWriter);
                             

                                          if (localGeneCommentary_version==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Gene-commentary_version cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneCommentary_version));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGeneCommentary_xtraPropertiesTracker){
                                            if (localGeneCommentary_xtraProperties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_xtra-properties cannot be null!!");
                                            }
                                           localGeneCommentary_xtraProperties.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_xtra-properties"),
                                               xmlWriter);
                                        } if (localGeneCommentary_refsTracker){
                                            if (localGeneCommentary_refs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_refs cannot be null!!");
                                            }
                                           localGeneCommentary_refs.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_refs"),
                                               xmlWriter);
                                        } if (localGeneCommentary_sourceTracker){
                                            if (localGeneCommentary_source==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_source cannot be null!!");
                                            }
                                           localGeneCommentary_source.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_source"),
                                               xmlWriter);
                                        } if (localGeneCommentary_genomicCoordsTracker){
                                            if (localGeneCommentary_genomicCoords==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_genomic-coords cannot be null!!");
                                            }
                                           localGeneCommentary_genomicCoords.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_genomic-coords"),
                                               xmlWriter);
                                        } if (localGeneCommentary_seqsTracker){
                                            if (localGeneCommentary_seqs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_seqs cannot be null!!");
                                            }
                                           localGeneCommentary_seqs.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_seqs"),
                                               xmlWriter);
                                        } if (localGeneCommentary_productsTracker){
                                            if (localGeneCommentary_products==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_products cannot be null!!");
                                            }
                                           localGeneCommentary_products.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_products"),
                                               xmlWriter);
                                        } if (localGeneCommentary_propertiesTracker){
                                            if (localGeneCommentary_properties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_properties cannot be null!!");
                                            }
                                           localGeneCommentary_properties.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_properties"),
                                               xmlWriter);
                                        } if (localGeneCommentary_commentTracker){
                                            if (localGeneCommentary_comment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_comment cannot be null!!");
                                            }
                                           localGeneCommentary_comment.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_comment"),
                                               xmlWriter);
                                        } if (localGeneCommentary_createDateTracker){
                                            if (localGeneCommentary_createDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_create-date cannot be null!!");
                                            }
                                           localGeneCommentary_createDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_create-date"),
                                               xmlWriter);
                                        } if (localGeneCommentary_updateDateTracker){
                                            if (localGeneCommentary_updateDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gene-commentary_update-date cannot be null!!");
                                            }
                                           localGeneCommentary_updateDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_update-date"),
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
                                                                      "Gene-commentary_type"));
                            
                            
                                    if (localGeneCommentary_type==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_type cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_type);
                                 if (localGeneCommentary_headingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_heading"));
                                 
                                        if (localGeneCommentary_heading != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneCommentary_heading));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-commentary_heading cannot be null!!");
                                        }
                                    } if (localGeneCommentary_labelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_label"));
                                 
                                        if (localGeneCommentary_label != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneCommentary_label));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-commentary_label cannot be null!!");
                                        }
                                    } if (localGeneCommentary_textTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_text"));
                                 
                                        if (localGeneCommentary_text != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneCommentary_text));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-commentary_text cannot be null!!");
                                        }
                                    } if (localGeneCommentary_accessionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_accession"));
                                 
                                        if (localGeneCommentary_accession != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneCommentary_accession));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-commentary_accession cannot be null!!");
                                        }
                                    } if (localGeneCommentary_versionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_version"));
                                 
                                        if (localGeneCommentary_version != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeneCommentary_version));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Gene-commentary_version cannot be null!!");
                                        }
                                    } if (localGeneCommentary_xtraPropertiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_xtra-properties"));
                            
                            
                                    if (localGeneCommentary_xtraProperties==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_xtra-properties cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_xtraProperties);
                                } if (localGeneCommentary_refsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_refs"));
                            
                            
                                    if (localGeneCommentary_refs==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_refs cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_refs);
                                } if (localGeneCommentary_sourceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_source"));
                            
                            
                                    if (localGeneCommentary_source==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_source cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_source);
                                } if (localGeneCommentary_genomicCoordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_genomic-coords"));
                            
                            
                                    if (localGeneCommentary_genomicCoords==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_genomic-coords cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_genomicCoords);
                                } if (localGeneCommentary_seqsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_seqs"));
                            
                            
                                    if (localGeneCommentary_seqs==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_seqs cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_seqs);
                                } if (localGeneCommentary_productsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_products"));
                            
                            
                                    if (localGeneCommentary_products==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_products cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_products);
                                } if (localGeneCommentary_propertiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_properties"));
                            
                            
                                    if (localGeneCommentary_properties==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_properties cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_properties);
                                } if (localGeneCommentary_commentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_comment"));
                            
                            
                                    if (localGeneCommentary_comment==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_comment cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_comment);
                                } if (localGeneCommentary_createDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_create-date"));
                            
                            
                                    if (localGeneCommentary_createDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_create-date cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_createDate);
                                } if (localGeneCommentary_updateDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Gene-commentary_update-date"));
                            
                            
                                    if (localGeneCommentary_updateDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gene-commentary_update-date cannot be null!!");
                                    }
                                    elementList.add(localGeneCommentary_updateDate);
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
        public static GeneCommentary_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GeneCommentary_type0 object =
                new GeneCommentary_type0();

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
                    
                            if (!"Gene-commentary_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GeneCommentary_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_type").equals(reader.getName())){
                                
                                                object.setGeneCommentary_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_type_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_heading").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-commentary_heading" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneCommentary_heading(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_label").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-commentary_label" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneCommentary_label(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_text").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-commentary_text" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneCommentary_text(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_accession").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-commentary_accession" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneCommentary_accession(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_version").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Gene-commentary_version" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeneCommentary_version(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_xtra-properties").equals(reader.getName())){
                                
                                                object.setGeneCommentary_xtraProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_xtraProperties_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_refs").equals(reader.getName())){
                                
                                                object.setGeneCommentary_refs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_refs_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_source").equals(reader.getName())){
                                
                                                object.setGeneCommentary_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_source_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_genomic-coords").equals(reader.getName())){
                                
                                                object.setGeneCommentary_genomicCoords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_genomicCoords_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_seqs").equals(reader.getName())){
                                
                                                object.setGeneCommentary_seqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_seqs_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_products").equals(reader.getName())){
                                
                                                object.setGeneCommentary_products(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_products_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_properties").equals(reader.getName())){
                                
                                                object.setGeneCommentary_properties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_properties_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_comment").equals(reader.getName())){
                                
                                                object.setGeneCommentary_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_comment_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_create-date").equals(reader.getName())){
                                
                                                object.setGeneCommentary_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_createDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Gene-commentary_update-date").equals(reader.getName())){
                                
                                                object.setGeneCommentary_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.GeneCommentary_updateDate_type0.Factory.parse(reader));
                                              
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
           
    