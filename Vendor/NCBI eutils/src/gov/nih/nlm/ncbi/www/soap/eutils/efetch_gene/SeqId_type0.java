
/**
 * SeqId_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqId_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqId_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-id_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqId_localTracker = false;
                
                   localSeqId_gibbsqTracker = false;
                
                   localSeqId_gibbmtTracker = false;
                
                   localSeqId_giimTracker = false;
                
                   localSeqId_genbankTracker = false;
                
                   localSeqId_emblTracker = false;
                
                   localSeqId_pirTracker = false;
                
                   localSeqId_swissprotTracker = false;
                
                   localSeqId_patentTracker = false;
                
                   localSeqId_otherTracker = false;
                
                   localSeqId_generalTracker = false;
                
                   localSeqId_giTracker = false;
                
                   localSeqId_ddbjTracker = false;
                
                   localSeqId_prfTracker = false;
                
                   localSeqId_pdbTracker = false;
                
                   localSeqId_tpgTracker = false;
                
                   localSeqId_tpeTracker = false;
                
                   localSeqId_tpdTracker = false;
                
                   localSeqId_gpipeTracker = false;
                
                   localSeqId_namedAnnotTrackTracker = false;
                
            }
        

                        /**
                        * field for SeqId_local
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_local_type0 localSeqId_local ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_localTracker = false ;

                           public boolean isSeqId_localSpecified(){
                               return localSeqId_localTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_local_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_local_type0 getSeqId_local(){
                               return localSeqId_local;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_local
                               */
                               public void setSeqId_local(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_local_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_localTracker = param != null;
                                   
                                            this.localSeqId_local=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_gibbsq
                        */

                        
                                    protected java.math.BigInteger localSeqId_gibbsq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_gibbsqTracker = false ;

                           public boolean isSeqId_gibbsqSpecified(){
                               return localSeqId_gibbsqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSeqId_gibbsq(){
                               return localSeqId_gibbsq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_gibbsq
                               */
                               public void setSeqId_gibbsq(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localSeqId_gibbsqTracker = param != null;
                                   
                                            this.localSeqId_gibbsq=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_gibbmt
                        */

                        
                                    protected java.math.BigInteger localSeqId_gibbmt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_gibbmtTracker = false ;

                           public boolean isSeqId_gibbmtSpecified(){
                               return localSeqId_gibbmtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSeqId_gibbmt(){
                               return localSeqId_gibbmt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_gibbmt
                               */
                               public void setSeqId_gibbmt(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localSeqId_gibbmtTracker = param != null;
                                   
                                            this.localSeqId_gibbmt=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_giim
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_giim_type0 localSeqId_giim ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_giimTracker = false ;

                           public boolean isSeqId_giimSpecified(){
                               return localSeqId_giimTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_giim_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_giim_type0 getSeqId_giim(){
                               return localSeqId_giim;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_giim
                               */
                               public void setSeqId_giim(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_giim_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_giimTracker = param != null;
                                   
                                            this.localSeqId_giim=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_genbank
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_genbank_type0 localSeqId_genbank ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_genbankTracker = false ;

                           public boolean isSeqId_genbankSpecified(){
                               return localSeqId_genbankTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_genbank_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_genbank_type0 getSeqId_genbank(){
                               return localSeqId_genbank;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_genbank
                               */
                               public void setSeqId_genbank(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_genbank_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_genbankTracker = param != null;
                                   
                                            this.localSeqId_genbank=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_embl
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_embl_type0 localSeqId_embl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_emblTracker = false ;

                           public boolean isSeqId_emblSpecified(){
                               return localSeqId_emblTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_embl_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_embl_type0 getSeqId_embl(){
                               return localSeqId_embl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_embl
                               */
                               public void setSeqId_embl(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_embl_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_emblTracker = param != null;
                                   
                                            this.localSeqId_embl=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_pir
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pir_type0 localSeqId_pir ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_pirTracker = false ;

                           public boolean isSeqId_pirSpecified(){
                               return localSeqId_pirTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pir_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pir_type0 getSeqId_pir(){
                               return localSeqId_pir;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_pir
                               */
                               public void setSeqId_pir(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pir_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_pirTracker = param != null;
                                   
                                            this.localSeqId_pir=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_swissprot
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_swissprot_type0 localSeqId_swissprot ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_swissprotTracker = false ;

                           public boolean isSeqId_swissprotSpecified(){
                               return localSeqId_swissprotTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_swissprot_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_swissprot_type0 getSeqId_swissprot(){
                               return localSeqId_swissprot;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_swissprot
                               */
                               public void setSeqId_swissprot(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_swissprot_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_swissprotTracker = param != null;
                                   
                                            this.localSeqId_swissprot=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_patent
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_patent_type0 localSeqId_patent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_patentTracker = false ;

                           public boolean isSeqId_patentSpecified(){
                               return localSeqId_patentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_patent_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_patent_type0 getSeqId_patent(){
                               return localSeqId_patent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_patent
                               */
                               public void setSeqId_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_patent_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_patentTracker = param != null;
                                   
                                            this.localSeqId_patent=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_other
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_other_type0 localSeqId_other ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_otherTracker = false ;

                           public boolean isSeqId_otherSpecified(){
                               return localSeqId_otherTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_other_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_other_type0 getSeqId_other(){
                               return localSeqId_other;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_other
                               */
                               public void setSeqId_other(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_other_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_otherTracker = param != null;
                                   
                                            this.localSeqId_other=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_general
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_general_type0 localSeqId_general ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_generalTracker = false ;

                           public boolean isSeqId_generalSpecified(){
                               return localSeqId_generalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_general_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_general_type0 getSeqId_general(){
                               return localSeqId_general;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_general
                               */
                               public void setSeqId_general(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_general_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_generalTracker = param != null;
                                   
                                            this.localSeqId_general=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_gi
                        */

                        
                                    protected java.math.BigInteger localSeqId_gi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_giTracker = false ;

                           public boolean isSeqId_giSpecified(){
                               return localSeqId_giTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getSeqId_gi(){
                               return localSeqId_gi;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_gi
                               */
                               public void setSeqId_gi(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localSeqId_giTracker = param != null;
                                   
                                            this.localSeqId_gi=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_ddbj
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_ddbj_type0 localSeqId_ddbj ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_ddbjTracker = false ;

                           public boolean isSeqId_ddbjSpecified(){
                               return localSeqId_ddbjTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_ddbj_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_ddbj_type0 getSeqId_ddbj(){
                               return localSeqId_ddbj;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_ddbj
                               */
                               public void setSeqId_ddbj(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_ddbj_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_ddbjTracker = param != null;
                                   
                                            this.localSeqId_ddbj=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_prf
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_prf_type0 localSeqId_prf ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_prfTracker = false ;

                           public boolean isSeqId_prfSpecified(){
                               return localSeqId_prfTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_prf_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_prf_type0 getSeqId_prf(){
                               return localSeqId_prf;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_prf
                               */
                               public void setSeqId_prf(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_prf_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_prfTracker = param != null;
                                   
                                            this.localSeqId_prf=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_pdb
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pdb_type0 localSeqId_pdb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_pdbTracker = false ;

                           public boolean isSeqId_pdbSpecified(){
                               return localSeqId_pdbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pdb_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pdb_type0 getSeqId_pdb(){
                               return localSeqId_pdb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_pdb
                               */
                               public void setSeqId_pdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pdb_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_pdbTracker = param != null;
                                   
                                            this.localSeqId_pdb=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_tpg
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpg_type0 localSeqId_tpg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_tpgTracker = false ;

                           public boolean isSeqId_tpgSpecified(){
                               return localSeqId_tpgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpg_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpg_type0 getSeqId_tpg(){
                               return localSeqId_tpg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_tpg
                               */
                               public void setSeqId_tpg(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpg_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_tpgTracker = param != null;
                                   
                                            this.localSeqId_tpg=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_tpe
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpe_type0 localSeqId_tpe ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_tpeTracker = false ;

                           public boolean isSeqId_tpeSpecified(){
                               return localSeqId_tpeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpe_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpe_type0 getSeqId_tpe(){
                               return localSeqId_tpe;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_tpe
                               */
                               public void setSeqId_tpe(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpe_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_tpeTracker = param != null;
                                   
                                            this.localSeqId_tpe=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_tpd
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpd_type0 localSeqId_tpd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_tpdTracker = false ;

                           public boolean isSeqId_tpdSpecified(){
                               return localSeqId_tpdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpd_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpd_type0 getSeqId_tpd(){
                               return localSeqId_tpd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_tpd
                               */
                               public void setSeqId_tpd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpd_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_tpdTracker = param != null;
                                   
                                            this.localSeqId_tpd=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_gpipe
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_gpipe_type0 localSeqId_gpipe ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_gpipeTracker = false ;

                           public boolean isSeqId_gpipeSpecified(){
                               return localSeqId_gpipeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_gpipe_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_gpipe_type0 getSeqId_gpipe(){
                               return localSeqId_gpipe;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_gpipe
                               */
                               public void setSeqId_gpipe(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_gpipe_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_gpipeTracker = param != null;
                                   
                                            this.localSeqId_gpipe=param;
                                    

                               }
                            

                        /**
                        * field for SeqId_namedAnnotTrack
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_namedAnnotTrack_type0 localSeqId_namedAnnotTrack ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqId_namedAnnotTrackTracker = false ;

                           public boolean isSeqId_namedAnnotTrackSpecified(){
                               return localSeqId_namedAnnotTrackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_namedAnnotTrack_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_namedAnnotTrack_type0 getSeqId_namedAnnotTrack(){
                               return localSeqId_namedAnnotTrack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqId_namedAnnotTrack
                               */
                               public void setSeqId_namedAnnotTrack(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_namedAnnotTrack_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqId_namedAnnotTrackTracker = param != null;
                                   
                                            this.localSeqId_namedAnnotTrack=param;
                                    

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
                           namespacePrefix+":Seq-id_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-id_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqId_localTracker){
                                            if (localSeqId_local==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_local cannot be null!!");
                                            }
                                           localSeqId_local.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_local"),
                                               xmlWriter);
                                        } if (localSeqId_gibbsqTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-id_gibbsq", xmlWriter);
                             

                                          if (localSeqId_gibbsq==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-id_gibbsq cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqId_gibbsq));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqId_gibbmtTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-id_gibbmt", xmlWriter);
                             

                                          if (localSeqId_gibbmt==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-id_gibbmt cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqId_gibbmt));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqId_giimTracker){
                                            if (localSeqId_giim==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_giim cannot be null!!");
                                            }
                                           localSeqId_giim.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_giim"),
                                               xmlWriter);
                                        } if (localSeqId_genbankTracker){
                                            if (localSeqId_genbank==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_genbank cannot be null!!");
                                            }
                                           localSeqId_genbank.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_genbank"),
                                               xmlWriter);
                                        } if (localSeqId_emblTracker){
                                            if (localSeqId_embl==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_embl cannot be null!!");
                                            }
                                           localSeqId_embl.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_embl"),
                                               xmlWriter);
                                        } if (localSeqId_pirTracker){
                                            if (localSeqId_pir==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_pir cannot be null!!");
                                            }
                                           localSeqId_pir.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_pir"),
                                               xmlWriter);
                                        } if (localSeqId_swissprotTracker){
                                            if (localSeqId_swissprot==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_swissprot cannot be null!!");
                                            }
                                           localSeqId_swissprot.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_swissprot"),
                                               xmlWriter);
                                        } if (localSeqId_patentTracker){
                                            if (localSeqId_patent==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_patent cannot be null!!");
                                            }
                                           localSeqId_patent.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_patent"),
                                               xmlWriter);
                                        } if (localSeqId_otherTracker){
                                            if (localSeqId_other==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_other cannot be null!!");
                                            }
                                           localSeqId_other.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_other"),
                                               xmlWriter);
                                        } if (localSeqId_generalTracker){
                                            if (localSeqId_general==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_general cannot be null!!");
                                            }
                                           localSeqId_general.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_general"),
                                               xmlWriter);
                                        } if (localSeqId_giTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-id_gi", xmlWriter);
                             

                                          if (localSeqId_gi==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-id_gi cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqId_gi));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqId_ddbjTracker){
                                            if (localSeqId_ddbj==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_ddbj cannot be null!!");
                                            }
                                           localSeqId_ddbj.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_ddbj"),
                                               xmlWriter);
                                        } if (localSeqId_prfTracker){
                                            if (localSeqId_prf==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_prf cannot be null!!");
                                            }
                                           localSeqId_prf.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_prf"),
                                               xmlWriter);
                                        } if (localSeqId_pdbTracker){
                                            if (localSeqId_pdb==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_pdb cannot be null!!");
                                            }
                                           localSeqId_pdb.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_pdb"),
                                               xmlWriter);
                                        } if (localSeqId_tpgTracker){
                                            if (localSeqId_tpg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_tpg cannot be null!!");
                                            }
                                           localSeqId_tpg.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_tpg"),
                                               xmlWriter);
                                        } if (localSeqId_tpeTracker){
                                            if (localSeqId_tpe==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_tpe cannot be null!!");
                                            }
                                           localSeqId_tpe.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_tpe"),
                                               xmlWriter);
                                        } if (localSeqId_tpdTracker){
                                            if (localSeqId_tpd==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_tpd cannot be null!!");
                                            }
                                           localSeqId_tpd.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_tpd"),
                                               xmlWriter);
                                        } if (localSeqId_gpipeTracker){
                                            if (localSeqId_gpipe==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_gpipe cannot be null!!");
                                            }
                                           localSeqId_gpipe.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_gpipe"),
                                               xmlWriter);
                                        } if (localSeqId_namedAnnotTrackTracker){
                                            if (localSeqId_namedAnnotTrack==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-id_named-annot-track cannot be null!!");
                                            }
                                           localSeqId_namedAnnotTrack.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_named-annot-track"),
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

                 if (localSeqId_localTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_local"));
                            
                            
                                    if (localSeqId_local==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_local cannot be null!!");
                                    }
                                    elementList.add(localSeqId_local);
                                } if (localSeqId_gibbsqTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_gibbsq"));
                                 
                                        if (localSeqId_gibbsq != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqId_gibbsq));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-id_gibbsq cannot be null!!");
                                        }
                                    } if (localSeqId_gibbmtTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_gibbmt"));
                                 
                                        if (localSeqId_gibbmt != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqId_gibbmt));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-id_gibbmt cannot be null!!");
                                        }
                                    } if (localSeqId_giimTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_giim"));
                            
                            
                                    if (localSeqId_giim==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_giim cannot be null!!");
                                    }
                                    elementList.add(localSeqId_giim);
                                } if (localSeqId_genbankTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_genbank"));
                            
                            
                                    if (localSeqId_genbank==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_genbank cannot be null!!");
                                    }
                                    elementList.add(localSeqId_genbank);
                                } if (localSeqId_emblTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_embl"));
                            
                            
                                    if (localSeqId_embl==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_embl cannot be null!!");
                                    }
                                    elementList.add(localSeqId_embl);
                                } if (localSeqId_pirTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_pir"));
                            
                            
                                    if (localSeqId_pir==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_pir cannot be null!!");
                                    }
                                    elementList.add(localSeqId_pir);
                                } if (localSeqId_swissprotTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_swissprot"));
                            
                            
                                    if (localSeqId_swissprot==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_swissprot cannot be null!!");
                                    }
                                    elementList.add(localSeqId_swissprot);
                                } if (localSeqId_patentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_patent"));
                            
                            
                                    if (localSeqId_patent==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_patent cannot be null!!");
                                    }
                                    elementList.add(localSeqId_patent);
                                } if (localSeqId_otherTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_other"));
                            
                            
                                    if (localSeqId_other==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_other cannot be null!!");
                                    }
                                    elementList.add(localSeqId_other);
                                } if (localSeqId_generalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_general"));
                            
                            
                                    if (localSeqId_general==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_general cannot be null!!");
                                    }
                                    elementList.add(localSeqId_general);
                                } if (localSeqId_giTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_gi"));
                                 
                                        if (localSeqId_gi != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqId_gi));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-id_gi cannot be null!!");
                                        }
                                    } if (localSeqId_ddbjTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_ddbj"));
                            
                            
                                    if (localSeqId_ddbj==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_ddbj cannot be null!!");
                                    }
                                    elementList.add(localSeqId_ddbj);
                                } if (localSeqId_prfTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_prf"));
                            
                            
                                    if (localSeqId_prf==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_prf cannot be null!!");
                                    }
                                    elementList.add(localSeqId_prf);
                                } if (localSeqId_pdbTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_pdb"));
                            
                            
                                    if (localSeqId_pdb==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_pdb cannot be null!!");
                                    }
                                    elementList.add(localSeqId_pdb);
                                } if (localSeqId_tpgTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_tpg"));
                            
                            
                                    if (localSeqId_tpg==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_tpg cannot be null!!");
                                    }
                                    elementList.add(localSeqId_tpg);
                                } if (localSeqId_tpeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_tpe"));
                            
                            
                                    if (localSeqId_tpe==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_tpe cannot be null!!");
                                    }
                                    elementList.add(localSeqId_tpe);
                                } if (localSeqId_tpdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_tpd"));
                            
                            
                                    if (localSeqId_tpd==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_tpd cannot be null!!");
                                    }
                                    elementList.add(localSeqId_tpd);
                                } if (localSeqId_gpipeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_gpipe"));
                            
                            
                                    if (localSeqId_gpipe==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_gpipe cannot be null!!");
                                    }
                                    elementList.add(localSeqId_gpipe);
                                } if (localSeqId_namedAnnotTrackTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-id_named-annot-track"));
                            
                            
                                    if (localSeqId_namedAnnotTrack==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-id_named-annot-track cannot be null!!");
                                    }
                                    elementList.add(localSeqId_namedAnnotTrack);
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
        public static SeqId_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqId_type0 object =
                new SeqId_type0();

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
                    
                            if (!"Seq-id_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqId_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_local").equals(reader.getName())){
                                
                                                object.setSeqId_local(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_local_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_gibbsq").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-id_gibbsq" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqId_gibbsq(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_gibbmt").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-id_gibbmt" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqId_gibbmt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_giim").equals(reader.getName())){
                                
                                                object.setSeqId_giim(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_giim_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_genbank").equals(reader.getName())){
                                
                                                object.setSeqId_genbank(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_genbank_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_embl").equals(reader.getName())){
                                
                                                object.setSeqId_embl(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_embl_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_pir").equals(reader.getName())){
                                
                                                object.setSeqId_pir(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pir_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_swissprot").equals(reader.getName())){
                                
                                                object.setSeqId_swissprot(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_swissprot_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_patent").equals(reader.getName())){
                                
                                                object.setSeqId_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_patent_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_other").equals(reader.getName())){
                                
                                                object.setSeqId_other(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_other_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_general").equals(reader.getName())){
                                
                                                object.setSeqId_general(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_general_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_gi").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-id_gi" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqId_gi(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_ddbj").equals(reader.getName())){
                                
                                                object.setSeqId_ddbj(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_ddbj_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_prf").equals(reader.getName())){
                                
                                                object.setSeqId_prf(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_prf_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_pdb").equals(reader.getName())){
                                
                                                object.setSeqId_pdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_pdb_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_tpg").equals(reader.getName())){
                                
                                                object.setSeqId_tpg(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpg_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_tpe").equals(reader.getName())){
                                
                                                object.setSeqId_tpe(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpe_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_tpd").equals(reader.getName())){
                                
                                                object.setSeqId_tpd(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_tpd_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_gpipe").equals(reader.getName())){
                                
                                                object.setSeqId_gpipe(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_gpipe_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-id_named-annot-track").equals(reader.getName())){
                                
                                                object.setSeqId_namedAnnotTrack(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqId_namedAnnotTrack_type0.Factory.parse(reader));
                                              
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
           
    