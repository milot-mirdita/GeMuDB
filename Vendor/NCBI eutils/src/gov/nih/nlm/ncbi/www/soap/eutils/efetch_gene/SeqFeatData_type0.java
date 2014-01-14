
/**
 * SeqFeatData_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqFeatData_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqFeatData_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SeqFeatData_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqFeatData_geneTracker = false;
                
                   localSeqFeatData_orgTracker = false;
                
                   localSeqFeatData_cdregionTracker = false;
                
                   localSeqFeatData_protTracker = false;
                
                   localSeqFeatData_rnaTracker = false;
                
                   localSeqFeatData_pubTracker = false;
                
                   localSeqFeatData_seqTracker = false;
                
                   localSeqFeatData_impTracker = false;
                
                   localSeqFeatData_regionTracker = false;
                
                   localSeqFeatData_commentTracker = false;
                
                   localSeqFeatData_bondTracker = false;
                
                   localSeqFeatData_siteTracker = false;
                
                   localSeqFeatData_rsiteTracker = false;
                
                   localSeqFeatData_userTracker = false;
                
                   localSeqFeatData_txinitTracker = false;
                
                   localSeqFeatData_numTracker = false;
                
                   localSeqFeatData_psecStrTracker = false;
                
                   localSeqFeatData_nonStdResidueTracker = false;
                
                   localSeqFeatData_hetTracker = false;
                
                   localSeqFeatData_biosrcTracker = false;
                
            }
        

                        /**
                        * field for SeqFeatData_gene
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_gene_type0 localSeqFeatData_gene ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_geneTracker = false ;

                           public boolean isSeqFeatData_geneSpecified(){
                               return localSeqFeatData_geneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_gene_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_gene_type0 getSeqFeatData_gene(){
                               return localSeqFeatData_gene;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_gene
                               */
                               public void setSeqFeatData_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_gene_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_geneTracker = param != null;
                                   
                                            this.localSeqFeatData_gene=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_org
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_org_type0 localSeqFeatData_org ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_orgTracker = false ;

                           public boolean isSeqFeatData_orgSpecified(){
                               return localSeqFeatData_orgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_org_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_org_type0 getSeqFeatData_org(){
                               return localSeqFeatData_org;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_org
                               */
                               public void setSeqFeatData_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_org_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_orgTracker = param != null;
                                   
                                            this.localSeqFeatData_org=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_cdregion
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_cdregion_type0 localSeqFeatData_cdregion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_cdregionTracker = false ;

                           public boolean isSeqFeatData_cdregionSpecified(){
                               return localSeqFeatData_cdregionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_cdregion_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_cdregion_type0 getSeqFeatData_cdregion(){
                               return localSeqFeatData_cdregion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_cdregion
                               */
                               public void setSeqFeatData_cdregion(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_cdregion_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_cdregionTracker = param != null;
                                   
                                            this.localSeqFeatData_cdregion=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_prot
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_prot_type0 localSeqFeatData_prot ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_protTracker = false ;

                           public boolean isSeqFeatData_protSpecified(){
                               return localSeqFeatData_protTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_prot_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_prot_type0 getSeqFeatData_prot(){
                               return localSeqFeatData_prot;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_prot
                               */
                               public void setSeqFeatData_prot(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_prot_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_protTracker = param != null;
                                   
                                            this.localSeqFeatData_prot=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_rna
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rna_type0 localSeqFeatData_rna ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_rnaTracker = false ;

                           public boolean isSeqFeatData_rnaSpecified(){
                               return localSeqFeatData_rnaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rna_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rna_type0 getSeqFeatData_rna(){
                               return localSeqFeatData_rna;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_rna
                               */
                               public void setSeqFeatData_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rna_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_rnaTracker = param != null;
                                   
                                            this.localSeqFeatData_rna=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_pub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_pub_type0 localSeqFeatData_pub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_pubTracker = false ;

                           public boolean isSeqFeatData_pubSpecified(){
                               return localSeqFeatData_pubTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_pub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_pub_type0 getSeqFeatData_pub(){
                               return localSeqFeatData_pub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_pub
                               */
                               public void setSeqFeatData_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_pub_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_pubTracker = param != null;
                                   
                                            this.localSeqFeatData_pub=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_seq
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_seq_type0 localSeqFeatData_seq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_seqTracker = false ;

                           public boolean isSeqFeatData_seqSpecified(){
                               return localSeqFeatData_seqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_seq_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_seq_type0 getSeqFeatData_seq(){
                               return localSeqFeatData_seq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_seq
                               */
                               public void setSeqFeatData_seq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_seq_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_seqTracker = param != null;
                                   
                                            this.localSeqFeatData_seq=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_imp
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_imp_type0 localSeqFeatData_imp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_impTracker = false ;

                           public boolean isSeqFeatData_impSpecified(){
                               return localSeqFeatData_impTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_imp_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_imp_type0 getSeqFeatData_imp(){
                               return localSeqFeatData_imp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_imp
                               */
                               public void setSeqFeatData_imp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_imp_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_impTracker = param != null;
                                   
                                            this.localSeqFeatData_imp=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_region
                        */

                        
                                    protected java.lang.String localSeqFeatData_region ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_regionTracker = false ;

                           public boolean isSeqFeatData_regionSpecified(){
                               return localSeqFeatData_regionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqFeatData_region(){
                               return localSeqFeatData_region;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_region
                               */
                               public void setSeqFeatData_region(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_regionTracker = param != null;
                                   
                                            this.localSeqFeatData_region=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_comment
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_comment_type0 localSeqFeatData_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_commentTracker = false ;

                           public boolean isSeqFeatData_commentSpecified(){
                               return localSeqFeatData_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_comment_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_comment_type0 getSeqFeatData_comment(){
                               return localSeqFeatData_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_comment
                               */
                               public void setSeqFeatData_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_comment_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_commentTracker = param != null;
                                   
                                            this.localSeqFeatData_comment=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_bond
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_bond_type0 localSeqFeatData_bond ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_bondTracker = false ;

                           public boolean isSeqFeatData_bondSpecified(){
                               return localSeqFeatData_bondTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_bond_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_bond_type0 getSeqFeatData_bond(){
                               return localSeqFeatData_bond;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_bond
                               */
                               public void setSeqFeatData_bond(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_bond_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_bondTracker = param != null;
                                   
                                            this.localSeqFeatData_bond=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_site
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_site_type0 localSeqFeatData_site ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_siteTracker = false ;

                           public boolean isSeqFeatData_siteSpecified(){
                               return localSeqFeatData_siteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_site_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_site_type0 getSeqFeatData_site(){
                               return localSeqFeatData_site;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_site
                               */
                               public void setSeqFeatData_site(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_site_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_siteTracker = param != null;
                                   
                                            this.localSeqFeatData_site=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_rsite
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rsite_type0 localSeqFeatData_rsite ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_rsiteTracker = false ;

                           public boolean isSeqFeatData_rsiteSpecified(){
                               return localSeqFeatData_rsiteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rsite_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rsite_type0 getSeqFeatData_rsite(){
                               return localSeqFeatData_rsite;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_rsite
                               */
                               public void setSeqFeatData_rsite(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rsite_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_rsiteTracker = param != null;
                                   
                                            this.localSeqFeatData_rsite=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_user
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_user_type0 localSeqFeatData_user ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_userTracker = false ;

                           public boolean isSeqFeatData_userSpecified(){
                               return localSeqFeatData_userTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_user_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_user_type0 getSeqFeatData_user(){
                               return localSeqFeatData_user;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_user
                               */
                               public void setSeqFeatData_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_user_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_userTracker = param != null;
                                   
                                            this.localSeqFeatData_user=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_txinit
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_txinit_type0 localSeqFeatData_txinit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_txinitTracker = false ;

                           public boolean isSeqFeatData_txinitSpecified(){
                               return localSeqFeatData_txinitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_txinit_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_txinit_type0 getSeqFeatData_txinit(){
                               return localSeqFeatData_txinit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_txinit
                               */
                               public void setSeqFeatData_txinit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_txinit_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_txinitTracker = param != null;
                                   
                                            this.localSeqFeatData_txinit=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_num
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_num_type0 localSeqFeatData_num ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_numTracker = false ;

                           public boolean isSeqFeatData_numSpecified(){
                               return localSeqFeatData_numTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_num_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_num_type0 getSeqFeatData_num(){
                               return localSeqFeatData_num;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_num
                               */
                               public void setSeqFeatData_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_num_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_numTracker = param != null;
                                   
                                            this.localSeqFeatData_num=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_psecStr
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_psecStr_type0 localSeqFeatData_psecStr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_psecStrTracker = false ;

                           public boolean isSeqFeatData_psecStrSpecified(){
                               return localSeqFeatData_psecStrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_psecStr_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_psecStr_type0 getSeqFeatData_psecStr(){
                               return localSeqFeatData_psecStr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_psecStr
                               */
                               public void setSeqFeatData_psecStr(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_psecStr_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_psecStrTracker = param != null;
                                   
                                            this.localSeqFeatData_psecStr=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_nonStdResidue
                        */

                        
                                    protected java.lang.String localSeqFeatData_nonStdResidue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_nonStdResidueTracker = false ;

                           public boolean isSeqFeatData_nonStdResidueSpecified(){
                               return localSeqFeatData_nonStdResidueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqFeatData_nonStdResidue(){
                               return localSeqFeatData_nonStdResidue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_nonStdResidue
                               */
                               public void setSeqFeatData_nonStdResidue(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_nonStdResidueTracker = param != null;
                                   
                                            this.localSeqFeatData_nonStdResidue=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_het
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_het_type0 localSeqFeatData_het ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_hetTracker = false ;

                           public boolean isSeqFeatData_hetSpecified(){
                               return localSeqFeatData_hetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_het_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_het_type0 getSeqFeatData_het(){
                               return localSeqFeatData_het;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_het
                               */
                               public void setSeqFeatData_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_het_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_hetTracker = param != null;
                                   
                                            this.localSeqFeatData_het=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeatData_biosrc
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_biosrc_type0 localSeqFeatData_biosrc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeatData_biosrcTracker = false ;

                           public boolean isSeqFeatData_biosrcSpecified(){
                               return localSeqFeatData_biosrcTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_biosrc_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_biosrc_type0 getSeqFeatData_biosrc(){
                               return localSeqFeatData_biosrc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeatData_biosrc
                               */
                               public void setSeqFeatData_biosrc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_biosrc_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqFeatData_biosrcTracker = param != null;
                                   
                                            this.localSeqFeatData_biosrc=param;
                                    

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
                           namespacePrefix+":SeqFeatData_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SeqFeatData_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqFeatData_geneTracker){
                                            if (localSeqFeatData_gene==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_gene cannot be null!!");
                                            }
                                           localSeqFeatData_gene.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_gene"),
                                               xmlWriter);
                                        } if (localSeqFeatData_orgTracker){
                                            if (localSeqFeatData_org==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_org cannot be null!!");
                                            }
                                           localSeqFeatData_org.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_org"),
                                               xmlWriter);
                                        } if (localSeqFeatData_cdregionTracker){
                                            if (localSeqFeatData_cdregion==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_cdregion cannot be null!!");
                                            }
                                           localSeqFeatData_cdregion.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_cdregion"),
                                               xmlWriter);
                                        } if (localSeqFeatData_protTracker){
                                            if (localSeqFeatData_prot==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_prot cannot be null!!");
                                            }
                                           localSeqFeatData_prot.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_prot"),
                                               xmlWriter);
                                        } if (localSeqFeatData_rnaTracker){
                                            if (localSeqFeatData_rna==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_rna cannot be null!!");
                                            }
                                           localSeqFeatData_rna.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_rna"),
                                               xmlWriter);
                                        } if (localSeqFeatData_pubTracker){
                                            if (localSeqFeatData_pub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_pub cannot be null!!");
                                            }
                                           localSeqFeatData_pub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_pub"),
                                               xmlWriter);
                                        } if (localSeqFeatData_seqTracker){
                                            if (localSeqFeatData_seq==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_seq cannot be null!!");
                                            }
                                           localSeqFeatData_seq.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_seq"),
                                               xmlWriter);
                                        } if (localSeqFeatData_impTracker){
                                            if (localSeqFeatData_imp==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_imp cannot be null!!");
                                            }
                                           localSeqFeatData_imp.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_imp"),
                                               xmlWriter);
                                        } if (localSeqFeatData_regionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "SeqFeatData_region", xmlWriter);
                             

                                          if (localSeqFeatData_region==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SeqFeatData_region cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqFeatData_region);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqFeatData_commentTracker){
                                            if (localSeqFeatData_comment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_comment cannot be null!!");
                                            }
                                           localSeqFeatData_comment.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_comment"),
                                               xmlWriter);
                                        } if (localSeqFeatData_bondTracker){
                                            if (localSeqFeatData_bond==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_bond cannot be null!!");
                                            }
                                           localSeqFeatData_bond.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_bond"),
                                               xmlWriter);
                                        } if (localSeqFeatData_siteTracker){
                                            if (localSeqFeatData_site==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_site cannot be null!!");
                                            }
                                           localSeqFeatData_site.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_site"),
                                               xmlWriter);
                                        } if (localSeqFeatData_rsiteTracker){
                                            if (localSeqFeatData_rsite==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_rsite cannot be null!!");
                                            }
                                           localSeqFeatData_rsite.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_rsite"),
                                               xmlWriter);
                                        } if (localSeqFeatData_userTracker){
                                            if (localSeqFeatData_user==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_user cannot be null!!");
                                            }
                                           localSeqFeatData_user.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_user"),
                                               xmlWriter);
                                        } if (localSeqFeatData_txinitTracker){
                                            if (localSeqFeatData_txinit==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_txinit cannot be null!!");
                                            }
                                           localSeqFeatData_txinit.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_txinit"),
                                               xmlWriter);
                                        } if (localSeqFeatData_numTracker){
                                            if (localSeqFeatData_num==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_num cannot be null!!");
                                            }
                                           localSeqFeatData_num.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_num"),
                                               xmlWriter);
                                        } if (localSeqFeatData_psecStrTracker){
                                            if (localSeqFeatData_psecStr==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_psec-str cannot be null!!");
                                            }
                                           localSeqFeatData_psecStr.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_psec-str"),
                                               xmlWriter);
                                        } if (localSeqFeatData_nonStdResidueTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "SeqFeatData_non-std-residue", xmlWriter);
                             

                                          if (localSeqFeatData_nonStdResidue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SeqFeatData_non-std-residue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqFeatData_nonStdResidue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqFeatData_hetTracker){
                                            if (localSeqFeatData_het==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_het cannot be null!!");
                                            }
                                           localSeqFeatData_het.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_het"),
                                               xmlWriter);
                                        } if (localSeqFeatData_biosrcTracker){
                                            if (localSeqFeatData_biosrc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SeqFeatData_biosrc cannot be null!!");
                                            }
                                           localSeqFeatData_biosrc.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_biosrc"),
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

                 if (localSeqFeatData_geneTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_gene"));
                            
                            
                                    if (localSeqFeatData_gene==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_gene cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_gene);
                                } if (localSeqFeatData_orgTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_org"));
                            
                            
                                    if (localSeqFeatData_org==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_org cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_org);
                                } if (localSeqFeatData_cdregionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_cdregion"));
                            
                            
                                    if (localSeqFeatData_cdregion==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_cdregion cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_cdregion);
                                } if (localSeqFeatData_protTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_prot"));
                            
                            
                                    if (localSeqFeatData_prot==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_prot cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_prot);
                                } if (localSeqFeatData_rnaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_rna"));
                            
                            
                                    if (localSeqFeatData_rna==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_rna cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_rna);
                                } if (localSeqFeatData_pubTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_pub"));
                            
                            
                                    if (localSeqFeatData_pub==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_pub cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_pub);
                                } if (localSeqFeatData_seqTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_seq"));
                            
                            
                                    if (localSeqFeatData_seq==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_seq cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_seq);
                                } if (localSeqFeatData_impTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_imp"));
                            
                            
                                    if (localSeqFeatData_imp==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_imp cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_imp);
                                } if (localSeqFeatData_regionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_region"));
                                 
                                        if (localSeqFeatData_region != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqFeatData_region));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SeqFeatData_region cannot be null!!");
                                        }
                                    } if (localSeqFeatData_commentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_comment"));
                            
                            
                                    if (localSeqFeatData_comment==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_comment cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_comment);
                                } if (localSeqFeatData_bondTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_bond"));
                            
                            
                                    if (localSeqFeatData_bond==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_bond cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_bond);
                                } if (localSeqFeatData_siteTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_site"));
                            
                            
                                    if (localSeqFeatData_site==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_site cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_site);
                                } if (localSeqFeatData_rsiteTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_rsite"));
                            
                            
                                    if (localSeqFeatData_rsite==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_rsite cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_rsite);
                                } if (localSeqFeatData_userTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_user"));
                            
                            
                                    if (localSeqFeatData_user==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_user cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_user);
                                } if (localSeqFeatData_txinitTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_txinit"));
                            
                            
                                    if (localSeqFeatData_txinit==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_txinit cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_txinit);
                                } if (localSeqFeatData_numTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_num"));
                            
                            
                                    if (localSeqFeatData_num==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_num cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_num);
                                } if (localSeqFeatData_psecStrTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_psec-str"));
                            
                            
                                    if (localSeqFeatData_psecStr==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_psec-str cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_psecStr);
                                } if (localSeqFeatData_nonStdResidueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_non-std-residue"));
                                 
                                        if (localSeqFeatData_nonStdResidue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqFeatData_nonStdResidue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SeqFeatData_non-std-residue cannot be null!!");
                                        }
                                    } if (localSeqFeatData_hetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_het"));
                            
                            
                                    if (localSeqFeatData_het==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_het cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_het);
                                } if (localSeqFeatData_biosrcTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "SeqFeatData_biosrc"));
                            
                            
                                    if (localSeqFeatData_biosrc==null){
                                         throw new org.apache.axis2.databinding.ADBException("SeqFeatData_biosrc cannot be null!!");
                                    }
                                    elementList.add(localSeqFeatData_biosrc);
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
        public static SeqFeatData_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqFeatData_type0 object =
                new SeqFeatData_type0();

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
                    
                            if (!"SeqFeatData_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqFeatData_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_gene").equals(reader.getName())){
                                
                                                object.setSeqFeatData_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_gene_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_org").equals(reader.getName())){
                                
                                                object.setSeqFeatData_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_org_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_cdregion").equals(reader.getName())){
                                
                                                object.setSeqFeatData_cdregion(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_cdregion_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_prot").equals(reader.getName())){
                                
                                                object.setSeqFeatData_prot(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_prot_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_rna").equals(reader.getName())){
                                
                                                object.setSeqFeatData_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rna_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_pub").equals(reader.getName())){
                                
                                                object.setSeqFeatData_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_pub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_seq").equals(reader.getName())){
                                
                                                object.setSeqFeatData_seq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_seq_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_imp").equals(reader.getName())){
                                
                                                object.setSeqFeatData_imp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_imp_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_region").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SeqFeatData_region" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqFeatData_region(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_comment").equals(reader.getName())){
                                
                                                object.setSeqFeatData_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_comment_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_bond").equals(reader.getName())){
                                
                                                object.setSeqFeatData_bond(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_bond_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_site").equals(reader.getName())){
                                
                                                object.setSeqFeatData_site(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_site_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_rsite").equals(reader.getName())){
                                
                                                object.setSeqFeatData_rsite(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_rsite_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_user").equals(reader.getName())){
                                
                                                object.setSeqFeatData_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_user_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_txinit").equals(reader.getName())){
                                
                                                object.setSeqFeatData_txinit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_txinit_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_num").equals(reader.getName())){
                                
                                                object.setSeqFeatData_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_num_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_psec-str").equals(reader.getName())){
                                
                                                object.setSeqFeatData_psecStr(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_psecStr_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_non-std-residue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SeqFeatData_non-std-residue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqFeatData_nonStdResidue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_het").equals(reader.getName())){
                                
                                                object.setSeqFeatData_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_het_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","SeqFeatData_biosrc").equals(reader.getName())){
                                
                                                object.setSeqFeatData_biosrc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeatData_biosrc_type0.Factory.parse(reader));
                                              
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
           
    