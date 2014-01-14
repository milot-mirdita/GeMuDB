
/**
 * Entrezgene_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Entrezgene_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Entrezgene_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Entrezgene_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Entrezgene_trackInfo
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_trackInfo_type0 localEntrezgene_trackInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_trackInfoTracker = false ;

                           public boolean isEntrezgene_trackInfoSpecified(){
                               return localEntrezgene_trackInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_trackInfo_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_trackInfo_type0 getEntrezgene_trackInfo(){
                               return localEntrezgene_trackInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_trackInfo
                               */
                               public void setEntrezgene_trackInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_trackInfo_type0 param){
                            localEntrezgene_trackInfoTracker = param != null;
                                   
                                            this.localEntrezgene_trackInfo=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_type
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_type_type0 localEntrezgene_type ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_type_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_type_type0 getEntrezgene_type(){
                               return localEntrezgene_type;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_type
                               */
                               public void setEntrezgene_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_type_type0 param){
                            
                                            this.localEntrezgene_type=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_source
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_source_type0 localEntrezgene_source ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_source_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_source_type0 getEntrezgene_source(){
                               return localEntrezgene_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_source
                               */
                               public void setEntrezgene_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_source_type0 param){
                            
                                            this.localEntrezgene_source=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_gene
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_gene_type0 localEntrezgene_gene ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_gene_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_gene_type0 getEntrezgene_gene(){
                               return localEntrezgene_gene;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_gene
                               */
                               public void setEntrezgene_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_gene_type0 param){
                            
                                            this.localEntrezgene_gene=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_prot
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_prot_type0 localEntrezgene_prot ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_protTracker = false ;

                           public boolean isEntrezgene_protSpecified(){
                               return localEntrezgene_protTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_prot_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_prot_type0 getEntrezgene_prot(){
                               return localEntrezgene_prot;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_prot
                               */
                               public void setEntrezgene_prot(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_prot_type0 param){
                            localEntrezgene_protTracker = param != null;
                                   
                                            this.localEntrezgene_prot=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_rna
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_rna_type0 localEntrezgene_rna ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_rnaTracker = false ;

                           public boolean isEntrezgene_rnaSpecified(){
                               return localEntrezgene_rnaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_rna_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_rna_type0 getEntrezgene_rna(){
                               return localEntrezgene_rna;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_rna
                               */
                               public void setEntrezgene_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_rna_type0 param){
                            localEntrezgene_rnaTracker = param != null;
                                   
                                            this.localEntrezgene_rna=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_summary
                        */

                        
                                    protected java.lang.String localEntrezgene_summary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_summaryTracker = false ;

                           public boolean isEntrezgene_summarySpecified(){
                               return localEntrezgene_summaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEntrezgene_summary(){
                               return localEntrezgene_summary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_summary
                               */
                               public void setEntrezgene_summary(java.lang.String param){
                            localEntrezgene_summaryTracker = param != null;
                                   
                                            this.localEntrezgene_summary=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_location
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_location_type0 localEntrezgene_location ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_locationTracker = false ;

                           public boolean isEntrezgene_locationSpecified(){
                               return localEntrezgene_locationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_location_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_location_type0 getEntrezgene_location(){
                               return localEntrezgene_location;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_location
                               */
                               public void setEntrezgene_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_location_type0 param){
                            localEntrezgene_locationTracker = param != null;
                                   
                                            this.localEntrezgene_location=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_geneSource
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_geneSource_type0 localEntrezgene_geneSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_geneSourceTracker = false ;

                           public boolean isEntrezgene_geneSourceSpecified(){
                               return localEntrezgene_geneSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_geneSource_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_geneSource_type0 getEntrezgene_geneSource(){
                               return localEntrezgene_geneSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_geneSource
                               */
                               public void setEntrezgene_geneSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_geneSource_type0 param){
                            localEntrezgene_geneSourceTracker = param != null;
                                   
                                            this.localEntrezgene_geneSource=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_locus
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_locus_type0 localEntrezgene_locus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_locusTracker = false ;

                           public boolean isEntrezgene_locusSpecified(){
                               return localEntrezgene_locusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_locus_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_locus_type0 getEntrezgene_locus(){
                               return localEntrezgene_locus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_locus
                               */
                               public void setEntrezgene_locus(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_locus_type0 param){
                            localEntrezgene_locusTracker = param != null;
                                   
                                            this.localEntrezgene_locus=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_properties
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_properties_type0 localEntrezgene_properties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_propertiesTracker = false ;

                           public boolean isEntrezgene_propertiesSpecified(){
                               return localEntrezgene_propertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_properties_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_properties_type0 getEntrezgene_properties(){
                               return localEntrezgene_properties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_properties
                               */
                               public void setEntrezgene_properties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_properties_type0 param){
                            localEntrezgene_propertiesTracker = param != null;
                                   
                                            this.localEntrezgene_properties=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_refgene
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_refgene_type0 localEntrezgene_refgene ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_refgeneTracker = false ;

                           public boolean isEntrezgene_refgeneSpecified(){
                               return localEntrezgene_refgeneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_refgene_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_refgene_type0 getEntrezgene_refgene(){
                               return localEntrezgene_refgene;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_refgene
                               */
                               public void setEntrezgene_refgene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_refgene_type0 param){
                            localEntrezgene_refgeneTracker = param != null;
                                   
                                            this.localEntrezgene_refgene=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_homology
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_homology_type0 localEntrezgene_homology ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_homologyTracker = false ;

                           public boolean isEntrezgene_homologySpecified(){
                               return localEntrezgene_homologyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_homology_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_homology_type0 getEntrezgene_homology(){
                               return localEntrezgene_homology;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_homology
                               */
                               public void setEntrezgene_homology(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_homology_type0 param){
                            localEntrezgene_homologyTracker = param != null;
                                   
                                            this.localEntrezgene_homology=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_comments
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_comments_type0 localEntrezgene_comments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_commentsTracker = false ;

                           public boolean isEntrezgene_commentsSpecified(){
                               return localEntrezgene_commentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_comments_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_comments_type0 getEntrezgene_comments(){
                               return localEntrezgene_comments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_comments
                               */
                               public void setEntrezgene_comments(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_comments_type0 param){
                            localEntrezgene_commentsTracker = param != null;
                                   
                                            this.localEntrezgene_comments=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_uniqueKeys
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_uniqueKeys_type0 localEntrezgene_uniqueKeys ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_uniqueKeysTracker = false ;

                           public boolean isEntrezgene_uniqueKeysSpecified(){
                               return localEntrezgene_uniqueKeysTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_uniqueKeys_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_uniqueKeys_type0 getEntrezgene_uniqueKeys(){
                               return localEntrezgene_uniqueKeys;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_uniqueKeys
                               */
                               public void setEntrezgene_uniqueKeys(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_uniqueKeys_type0 param){
                            localEntrezgene_uniqueKeysTracker = param != null;
                                   
                                            this.localEntrezgene_uniqueKeys=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_xtraIndexTerms
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIndexTerms_type0 localEntrezgene_xtraIndexTerms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_xtraIndexTermsTracker = false ;

                           public boolean isEntrezgene_xtraIndexTermsSpecified(){
                               return localEntrezgene_xtraIndexTermsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIndexTerms_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIndexTerms_type0 getEntrezgene_xtraIndexTerms(){
                               return localEntrezgene_xtraIndexTerms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_xtraIndexTerms
                               */
                               public void setEntrezgene_xtraIndexTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIndexTerms_type0 param){
                            localEntrezgene_xtraIndexTermsTracker = param != null;
                                   
                                            this.localEntrezgene_xtraIndexTerms=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_xtraProperties
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraProperties_type0 localEntrezgene_xtraProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_xtraPropertiesTracker = false ;

                           public boolean isEntrezgene_xtraPropertiesSpecified(){
                               return localEntrezgene_xtraPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraProperties_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraProperties_type0 getEntrezgene_xtraProperties(){
                               return localEntrezgene_xtraProperties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_xtraProperties
                               */
                               public void setEntrezgene_xtraProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraProperties_type0 param){
                            localEntrezgene_xtraPropertiesTracker = param != null;
                                   
                                            this.localEntrezgene_xtraProperties=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_xtraIq
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIq_type0 localEntrezgene_xtraIq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_xtraIqTracker = false ;

                           public boolean isEntrezgene_xtraIqSpecified(){
                               return localEntrezgene_xtraIqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIq_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIq_type0 getEntrezgene_xtraIq(){
                               return localEntrezgene_xtraIq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_xtraIq
                               */
                               public void setEntrezgene_xtraIq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIq_type0 param){
                            localEntrezgene_xtraIqTracker = param != null;
                                   
                                            this.localEntrezgene_xtraIq=param;
                                    

                               }
                            

                        /**
                        * field for Entrezgene_nonUniqueKeys
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_nonUniqueKeys_type0 localEntrezgene_nonUniqueKeys ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEntrezgene_nonUniqueKeysTracker = false ;

                           public boolean isEntrezgene_nonUniqueKeysSpecified(){
                               return localEntrezgene_nonUniqueKeysTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_nonUniqueKeys_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_nonUniqueKeys_type0 getEntrezgene_nonUniqueKeys(){
                               return localEntrezgene_nonUniqueKeys;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Entrezgene_nonUniqueKeys
                               */
                               public void setEntrezgene_nonUniqueKeys(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_nonUniqueKeys_type0 param){
                            localEntrezgene_nonUniqueKeysTracker = param != null;
                                   
                                            this.localEntrezgene_nonUniqueKeys=param;
                                    

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
                           namespacePrefix+":Entrezgene_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Entrezgene_type0",
                           xmlWriter);
                   }

               
                   }
                if (localEntrezgene_trackInfoTracker){
                                            if (localEntrezgene_trackInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_track-info cannot be null!!");
                                            }
                                           localEntrezgene_trackInfo.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_track-info"),
                                               xmlWriter);
                                        }
                                            if (localEntrezgene_type==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_type cannot be null!!");
                                            }
                                           localEntrezgene_type.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_type"),
                                               xmlWriter);
                                        
                                            if (localEntrezgene_source==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_source cannot be null!!");
                                            }
                                           localEntrezgene_source.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_source"),
                                               xmlWriter);
                                        
                                            if (localEntrezgene_gene==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_gene cannot be null!!");
                                            }
                                           localEntrezgene_gene.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_gene"),
                                               xmlWriter);
                                         if (localEntrezgene_protTracker){
                                            if (localEntrezgene_prot==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_prot cannot be null!!");
                                            }
                                           localEntrezgene_prot.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_prot"),
                                               xmlWriter);
                                        } if (localEntrezgene_rnaTracker){
                                            if (localEntrezgene_rna==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_rna cannot be null!!");
                                            }
                                           localEntrezgene_rna.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_rna"),
                                               xmlWriter);
                                        } if (localEntrezgene_summaryTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Entrezgene_summary", xmlWriter);
                             

                                          if (localEntrezgene_summary==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Entrezgene_summary cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEntrezgene_summary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEntrezgene_locationTracker){
                                            if (localEntrezgene_location==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_location cannot be null!!");
                                            }
                                           localEntrezgene_location.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_location"),
                                               xmlWriter);
                                        } if (localEntrezgene_geneSourceTracker){
                                            if (localEntrezgene_geneSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_gene-source cannot be null!!");
                                            }
                                           localEntrezgene_geneSource.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_gene-source"),
                                               xmlWriter);
                                        } if (localEntrezgene_locusTracker){
                                            if (localEntrezgene_locus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_locus cannot be null!!");
                                            }
                                           localEntrezgene_locus.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_locus"),
                                               xmlWriter);
                                        } if (localEntrezgene_propertiesTracker){
                                            if (localEntrezgene_properties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_properties cannot be null!!");
                                            }
                                           localEntrezgene_properties.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_properties"),
                                               xmlWriter);
                                        } if (localEntrezgene_refgeneTracker){
                                            if (localEntrezgene_refgene==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_refgene cannot be null!!");
                                            }
                                           localEntrezgene_refgene.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_refgene"),
                                               xmlWriter);
                                        } if (localEntrezgene_homologyTracker){
                                            if (localEntrezgene_homology==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_homology cannot be null!!");
                                            }
                                           localEntrezgene_homology.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_homology"),
                                               xmlWriter);
                                        } if (localEntrezgene_commentsTracker){
                                            if (localEntrezgene_comments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_comments cannot be null!!");
                                            }
                                           localEntrezgene_comments.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_comments"),
                                               xmlWriter);
                                        } if (localEntrezgene_uniqueKeysTracker){
                                            if (localEntrezgene_uniqueKeys==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_unique-keys cannot be null!!");
                                            }
                                           localEntrezgene_uniqueKeys.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_unique-keys"),
                                               xmlWriter);
                                        } if (localEntrezgene_xtraIndexTermsTracker){
                                            if (localEntrezgene_xtraIndexTerms==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_xtra-index-terms cannot be null!!");
                                            }
                                           localEntrezgene_xtraIndexTerms.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_xtra-index-terms"),
                                               xmlWriter);
                                        } if (localEntrezgene_xtraPropertiesTracker){
                                            if (localEntrezgene_xtraProperties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_xtra-properties cannot be null!!");
                                            }
                                           localEntrezgene_xtraProperties.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_xtra-properties"),
                                               xmlWriter);
                                        } if (localEntrezgene_xtraIqTracker){
                                            if (localEntrezgene_xtraIq==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_xtra-iq cannot be null!!");
                                            }
                                           localEntrezgene_xtraIq.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_xtra-iq"),
                                               xmlWriter);
                                        } if (localEntrezgene_nonUniqueKeysTracker){
                                            if (localEntrezgene_nonUniqueKeys==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Entrezgene_non-unique-keys cannot be null!!");
                                            }
                                           localEntrezgene_nonUniqueKeys.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_non-unique-keys"),
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

                 if (localEntrezgene_trackInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_track-info"));
                            
                            
                                    if (localEntrezgene_trackInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_track-info cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_trackInfo);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_type"));
                            
                            
                                    if (localEntrezgene_type==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_type cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_type);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_source"));
                            
                            
                                    if (localEntrezgene_source==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_source cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_source);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_gene"));
                            
                            
                                    if (localEntrezgene_gene==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_gene cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_gene);
                                 if (localEntrezgene_protTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_prot"));
                            
                            
                                    if (localEntrezgene_prot==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_prot cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_prot);
                                } if (localEntrezgene_rnaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_rna"));
                            
                            
                                    if (localEntrezgene_rna==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_rna cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_rna);
                                } if (localEntrezgene_summaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_summary"));
                                 
                                        if (localEntrezgene_summary != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEntrezgene_summary));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Entrezgene_summary cannot be null!!");
                                        }
                                    } if (localEntrezgene_locationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_location"));
                            
                            
                                    if (localEntrezgene_location==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_location cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_location);
                                } if (localEntrezgene_geneSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_gene-source"));
                            
                            
                                    if (localEntrezgene_geneSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_gene-source cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_geneSource);
                                } if (localEntrezgene_locusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_locus"));
                            
                            
                                    if (localEntrezgene_locus==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_locus cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_locus);
                                } if (localEntrezgene_propertiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_properties"));
                            
                            
                                    if (localEntrezgene_properties==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_properties cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_properties);
                                } if (localEntrezgene_refgeneTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_refgene"));
                            
                            
                                    if (localEntrezgene_refgene==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_refgene cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_refgene);
                                } if (localEntrezgene_homologyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_homology"));
                            
                            
                                    if (localEntrezgene_homology==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_homology cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_homology);
                                } if (localEntrezgene_commentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_comments"));
                            
                            
                                    if (localEntrezgene_comments==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_comments cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_comments);
                                } if (localEntrezgene_uniqueKeysTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_unique-keys"));
                            
                            
                                    if (localEntrezgene_uniqueKeys==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_unique-keys cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_uniqueKeys);
                                } if (localEntrezgene_xtraIndexTermsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_xtra-index-terms"));
                            
                            
                                    if (localEntrezgene_xtraIndexTerms==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_xtra-index-terms cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_xtraIndexTerms);
                                } if (localEntrezgene_xtraPropertiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_xtra-properties"));
                            
                            
                                    if (localEntrezgene_xtraProperties==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_xtra-properties cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_xtraProperties);
                                } if (localEntrezgene_xtraIqTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_xtra-iq"));
                            
                            
                                    if (localEntrezgene_xtraIq==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_xtra-iq cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_xtraIq);
                                } if (localEntrezgene_nonUniqueKeysTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Entrezgene_non-unique-keys"));
                            
                            
                                    if (localEntrezgene_nonUniqueKeys==null){
                                         throw new org.apache.axis2.databinding.ADBException("Entrezgene_non-unique-keys cannot be null!!");
                                    }
                                    elementList.add(localEntrezgene_nonUniqueKeys);
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
        public static Entrezgene_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Entrezgene_type0 object =
                new Entrezgene_type0();

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
                    
                            if (!"Entrezgene_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Entrezgene_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_track-info").equals(reader.getName())){
                                
                                                object.setEntrezgene_trackInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_trackInfo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_type").equals(reader.getName())){
                                
                                                object.setEntrezgene_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_type_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_source").equals(reader.getName())){
                                
                                                object.setEntrezgene_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_source_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_gene").equals(reader.getName())){
                                
                                                object.setEntrezgene_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_gene_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_prot").equals(reader.getName())){
                                
                                                object.setEntrezgene_prot(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_prot_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_rna").equals(reader.getName())){
                                
                                                object.setEntrezgene_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_rna_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_summary").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Entrezgene_summary" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEntrezgene_summary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_location").equals(reader.getName())){
                                
                                                object.setEntrezgene_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_location_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_gene-source").equals(reader.getName())){
                                
                                                object.setEntrezgene_geneSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_geneSource_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_locus").equals(reader.getName())){
                                
                                                object.setEntrezgene_locus(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_locus_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_properties").equals(reader.getName())){
                                
                                                object.setEntrezgene_properties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_properties_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_refgene").equals(reader.getName())){
                                
                                                object.setEntrezgene_refgene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_refgene_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_homology").equals(reader.getName())){
                                
                                                object.setEntrezgene_homology(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_homology_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_comments").equals(reader.getName())){
                                
                                                object.setEntrezgene_comments(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_comments_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_unique-keys").equals(reader.getName())){
                                
                                                object.setEntrezgene_uniqueKeys(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_uniqueKeys_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_xtra-index-terms").equals(reader.getName())){
                                
                                                object.setEntrezgene_xtraIndexTerms(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIndexTerms_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_xtra-properties").equals(reader.getName())){
                                
                                                object.setEntrezgene_xtraProperties(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraProperties_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_xtra-iq").equals(reader.getName())){
                                
                                                object.setEntrezgene_xtraIq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_xtraIq_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Entrezgene_non-unique-keys").equals(reader.getName())){
                                
                                                object.setEntrezgene_nonUniqueKeys(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_nonUniqueKeys_type0.Factory.parse(reader));
                                              
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
           
    