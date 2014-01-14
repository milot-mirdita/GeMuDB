
/**
 * Seqdesc_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Seqdesc_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Seqdesc_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seqdesc_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localSeqdesc_molTypeTracker = false;
                
                   localSeqdesc_modifTracker = false;
                
                   localSeqdesc_methodTracker = false;
                
                   localSeqdesc_nameTracker = false;
                
                   localSeqdesc_titleTracker = false;
                
                   localSeqdesc_orgTracker = false;
                
                   localSeqdesc_commentTracker = false;
                
                   localSeqdesc_numTracker = false;
                
                   localSeqdesc_maplocTracker = false;
                
                   localSeqdesc_pirTracker = false;
                
                   localSeqdesc_genbankTracker = false;
                
                   localSeqdesc_pubTracker = false;
                
                   localSeqdesc_regionTracker = false;
                
                   localSeqdesc_userTracker = false;
                
                   localSeqdesc_spTracker = false;
                
                   localSeqdesc_dbxrefTracker = false;
                
                   localSeqdesc_emblTracker = false;
                
                   localSeqdesc_createDateTracker = false;
                
                   localSeqdesc_updateDateTracker = false;
                
                   localSeqdesc_prfTracker = false;
                
                   localSeqdesc_pdbTracker = false;
                
                   localSeqdesc_hetTracker = false;
                
                   localSeqdesc_sourceTracker = false;
                
                   localSeqdesc_molinfoTracker = false;
                
            }
        

                        /**
                        * field for Seqdesc_molType
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molType_type0 localSeqdesc_molType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_molTypeTracker = false ;

                           public boolean isSeqdesc_molTypeSpecified(){
                               return localSeqdesc_molTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molType_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molType_type0 getSeqdesc_molType(){
                               return localSeqdesc_molType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_molType
                               */
                               public void setSeqdesc_molType(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molType_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_molTypeTracker = param != null;
                                   
                                            this.localSeqdesc_molType=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_modif
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_modif_type0 localSeqdesc_modif ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_modifTracker = false ;

                           public boolean isSeqdesc_modifSpecified(){
                               return localSeqdesc_modifTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_modif_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_modif_type0 getSeqdesc_modif(){
                               return localSeqdesc_modif;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_modif
                               */
                               public void setSeqdesc_modif(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_modif_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_modifTracker = param != null;
                                   
                                            this.localSeqdesc_modif=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_method
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_method_type0 localSeqdesc_method ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_methodTracker = false ;

                           public boolean isSeqdesc_methodSpecified(){
                               return localSeqdesc_methodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_method_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_method_type0 getSeqdesc_method(){
                               return localSeqdesc_method;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_method
                               */
                               public void setSeqdesc_method(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_method_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_methodTracker = param != null;
                                   
                                            this.localSeqdesc_method=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_name
                        */

                        
                                    protected java.lang.String localSeqdesc_name ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_nameTracker = false ;

                           public boolean isSeqdesc_nameSpecified(){
                               return localSeqdesc_nameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqdesc_name(){
                               return localSeqdesc_name;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_name
                               */
                               public void setSeqdesc_name(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_nameTracker = param != null;
                                   
                                            this.localSeqdesc_name=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_title
                        */

                        
                                    protected java.lang.String localSeqdesc_title ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_titleTracker = false ;

                           public boolean isSeqdesc_titleSpecified(){
                               return localSeqdesc_titleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqdesc_title(){
                               return localSeqdesc_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_title
                               */
                               public void setSeqdesc_title(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_titleTracker = param != null;
                                   
                                            this.localSeqdesc_title=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_org
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_org_type0 localSeqdesc_org ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_orgTracker = false ;

                           public boolean isSeqdesc_orgSpecified(){
                               return localSeqdesc_orgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_org_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_org_type0 getSeqdesc_org(){
                               return localSeqdesc_org;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_org
                               */
                               public void setSeqdesc_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_org_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_orgTracker = param != null;
                                   
                                            this.localSeqdesc_org=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_comment
                        */

                        
                                    protected java.lang.String localSeqdesc_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_commentTracker = false ;

                           public boolean isSeqdesc_commentSpecified(){
                               return localSeqdesc_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqdesc_comment(){
                               return localSeqdesc_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_comment
                               */
                               public void setSeqdesc_comment(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_commentTracker = param != null;
                                   
                                            this.localSeqdesc_comment=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_num
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_num_type0 localSeqdesc_num ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_numTracker = false ;

                           public boolean isSeqdesc_numSpecified(){
                               return localSeqdesc_numTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_num_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_num_type0 getSeqdesc_num(){
                               return localSeqdesc_num;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_num
                               */
                               public void setSeqdesc_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_num_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_numTracker = param != null;
                                   
                                            this.localSeqdesc_num=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_maploc
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_maploc_type0 localSeqdesc_maploc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_maplocTracker = false ;

                           public boolean isSeqdesc_maplocSpecified(){
                               return localSeqdesc_maplocTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_maploc_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_maploc_type0 getSeqdesc_maploc(){
                               return localSeqdesc_maploc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_maploc
                               */
                               public void setSeqdesc_maploc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_maploc_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_maplocTracker = param != null;
                                   
                                            this.localSeqdesc_maploc=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_pir
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pir_type0 localSeqdesc_pir ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_pirTracker = false ;

                           public boolean isSeqdesc_pirSpecified(){
                               return localSeqdesc_pirTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pir_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pir_type0 getSeqdesc_pir(){
                               return localSeqdesc_pir;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_pir
                               */
                               public void setSeqdesc_pir(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pir_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_pirTracker = param != null;
                                   
                                            this.localSeqdesc_pir=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_genbank
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_genbank_type0 localSeqdesc_genbank ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_genbankTracker = false ;

                           public boolean isSeqdesc_genbankSpecified(){
                               return localSeqdesc_genbankTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_genbank_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_genbank_type0 getSeqdesc_genbank(){
                               return localSeqdesc_genbank;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_genbank
                               */
                               public void setSeqdesc_genbank(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_genbank_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_genbankTracker = param != null;
                                   
                                            this.localSeqdesc_genbank=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_pub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pub_type0 localSeqdesc_pub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_pubTracker = false ;

                           public boolean isSeqdesc_pubSpecified(){
                               return localSeqdesc_pubTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pub_type0 getSeqdesc_pub(){
                               return localSeqdesc_pub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_pub
                               */
                               public void setSeqdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pub_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_pubTracker = param != null;
                                   
                                            this.localSeqdesc_pub=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_region
                        */

                        
                                    protected java.lang.String localSeqdesc_region ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_regionTracker = false ;

                           public boolean isSeqdesc_regionSpecified(){
                               return localSeqdesc_regionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqdesc_region(){
                               return localSeqdesc_region;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_region
                               */
                               public void setSeqdesc_region(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_regionTracker = param != null;
                                   
                                            this.localSeqdesc_region=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_user
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_user_type0 localSeqdesc_user ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_userTracker = false ;

                           public boolean isSeqdesc_userSpecified(){
                               return localSeqdesc_userTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_user_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_user_type0 getSeqdesc_user(){
                               return localSeqdesc_user;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_user
                               */
                               public void setSeqdesc_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_user_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_userTracker = param != null;
                                   
                                            this.localSeqdesc_user=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_sp
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_sp_type0 localSeqdesc_sp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_spTracker = false ;

                           public boolean isSeqdesc_spSpecified(){
                               return localSeqdesc_spTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_sp_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_sp_type0 getSeqdesc_sp(){
                               return localSeqdesc_sp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_sp
                               */
                               public void setSeqdesc_sp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_sp_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_spTracker = param != null;
                                   
                                            this.localSeqdesc_sp=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_dbxref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_dbxref_type0 localSeqdesc_dbxref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_dbxrefTracker = false ;

                           public boolean isSeqdesc_dbxrefSpecified(){
                               return localSeqdesc_dbxrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_dbxref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_dbxref_type0 getSeqdesc_dbxref(){
                               return localSeqdesc_dbxref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_dbxref
                               */
                               public void setSeqdesc_dbxref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_dbxref_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_dbxrefTracker = param != null;
                                   
                                            this.localSeqdesc_dbxref=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_embl
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_embl_type0 localSeqdesc_embl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_emblTracker = false ;

                           public boolean isSeqdesc_emblSpecified(){
                               return localSeqdesc_emblTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_embl_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_embl_type0 getSeqdesc_embl(){
                               return localSeqdesc_embl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_embl
                               */
                               public void setSeqdesc_embl(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_embl_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_emblTracker = param != null;
                                   
                                            this.localSeqdesc_embl=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_createDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_createDate_type0 localSeqdesc_createDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_createDateTracker = false ;

                           public boolean isSeqdesc_createDateSpecified(){
                               return localSeqdesc_createDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_createDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_createDate_type0 getSeqdesc_createDate(){
                               return localSeqdesc_createDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_createDate
                               */
                               public void setSeqdesc_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_createDate_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_createDateTracker = param != null;
                                   
                                            this.localSeqdesc_createDate=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_updateDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_updateDate_type0 localSeqdesc_updateDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_updateDateTracker = false ;

                           public boolean isSeqdesc_updateDateSpecified(){
                               return localSeqdesc_updateDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_updateDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_updateDate_type0 getSeqdesc_updateDate(){
                               return localSeqdesc_updateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_updateDate
                               */
                               public void setSeqdesc_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_updateDate_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_updateDateTracker = param != null;
                                   
                                            this.localSeqdesc_updateDate=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_prf
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_prf_type0 localSeqdesc_prf ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_prfTracker = false ;

                           public boolean isSeqdesc_prfSpecified(){
                               return localSeqdesc_prfTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_prf_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_prf_type0 getSeqdesc_prf(){
                               return localSeqdesc_prf;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_prf
                               */
                               public void setSeqdesc_prf(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_prf_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_prfTracker = param != null;
                                   
                                            this.localSeqdesc_prf=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_pdb
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pdb_type0 localSeqdesc_pdb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_pdbTracker = false ;

                           public boolean isSeqdesc_pdbSpecified(){
                               return localSeqdesc_pdbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pdb_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pdb_type0 getSeqdesc_pdb(){
                               return localSeqdesc_pdb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_pdb
                               */
                               public void setSeqdesc_pdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pdb_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_pdbTracker = param != null;
                                   
                                            this.localSeqdesc_pdb=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_het
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_het_type0 localSeqdesc_het ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_hetTracker = false ;

                           public boolean isSeqdesc_hetSpecified(){
                               return localSeqdesc_hetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_het_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_het_type0 getSeqdesc_het(){
                               return localSeqdesc_het;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_het
                               */
                               public void setSeqdesc_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_het_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_hetTracker = param != null;
                                   
                                            this.localSeqdesc_het=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_source
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_source_type0 localSeqdesc_source ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_sourceTracker = false ;

                           public boolean isSeqdesc_sourceSpecified(){
                               return localSeqdesc_sourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_source_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_source_type0 getSeqdesc_source(){
                               return localSeqdesc_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_source
                               */
                               public void setSeqdesc_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_source_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_sourceTracker = param != null;
                                   
                                            this.localSeqdesc_source=param;
                                    

                               }
                            

                        /**
                        * field for Seqdesc_molinfo
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molinfo_type0 localSeqdesc_molinfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqdesc_molinfoTracker = false ;

                           public boolean isSeqdesc_molinfoSpecified(){
                               return localSeqdesc_molinfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molinfo_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molinfo_type0 getSeqdesc_molinfo(){
                               return localSeqdesc_molinfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Seqdesc_molinfo
                               */
                               public void setSeqdesc_molinfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molinfo_type0 param){
                            
                                clearAllSettingTrackers();
                            localSeqdesc_molinfoTracker = param != null;
                                   
                                            this.localSeqdesc_molinfo=param;
                                    

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
                           namespacePrefix+":Seqdesc_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seqdesc_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqdesc_molTypeTracker){
                                            if (localSeqdesc_molType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_mol-type cannot be null!!");
                                            }
                                           localSeqdesc_molType.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_mol-type"),
                                               xmlWriter);
                                        } if (localSeqdesc_modifTracker){
                                            if (localSeqdesc_modif==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_modif cannot be null!!");
                                            }
                                           localSeqdesc_modif.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_modif"),
                                               xmlWriter);
                                        } if (localSeqdesc_methodTracker){
                                            if (localSeqdesc_method==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_method cannot be null!!");
                                            }
                                           localSeqdesc_method.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_method"),
                                               xmlWriter);
                                        } if (localSeqdesc_nameTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seqdesc_name", xmlWriter);
                             

                                          if (localSeqdesc_name==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seqdesc_name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqdesc_name);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqdesc_titleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seqdesc_title", xmlWriter);
                             

                                          if (localSeqdesc_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seqdesc_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqdesc_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqdesc_orgTracker){
                                            if (localSeqdesc_org==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_org cannot be null!!");
                                            }
                                           localSeqdesc_org.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_org"),
                                               xmlWriter);
                                        } if (localSeqdesc_commentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seqdesc_comment", xmlWriter);
                             

                                          if (localSeqdesc_comment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seqdesc_comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqdesc_comment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqdesc_numTracker){
                                            if (localSeqdesc_num==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_num cannot be null!!");
                                            }
                                           localSeqdesc_num.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_num"),
                                               xmlWriter);
                                        } if (localSeqdesc_maplocTracker){
                                            if (localSeqdesc_maploc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_maploc cannot be null!!");
                                            }
                                           localSeqdesc_maploc.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_maploc"),
                                               xmlWriter);
                                        } if (localSeqdesc_pirTracker){
                                            if (localSeqdesc_pir==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_pir cannot be null!!");
                                            }
                                           localSeqdesc_pir.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_pir"),
                                               xmlWriter);
                                        } if (localSeqdesc_genbankTracker){
                                            if (localSeqdesc_genbank==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_genbank cannot be null!!");
                                            }
                                           localSeqdesc_genbank.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_genbank"),
                                               xmlWriter);
                                        } if (localSeqdesc_pubTracker){
                                            if (localSeqdesc_pub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_pub cannot be null!!");
                                            }
                                           localSeqdesc_pub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_pub"),
                                               xmlWriter);
                                        } if (localSeqdesc_regionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seqdesc_region", xmlWriter);
                             

                                          if (localSeqdesc_region==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seqdesc_region cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqdesc_region);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqdesc_userTracker){
                                            if (localSeqdesc_user==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_user cannot be null!!");
                                            }
                                           localSeqdesc_user.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_user"),
                                               xmlWriter);
                                        } if (localSeqdesc_spTracker){
                                            if (localSeqdesc_sp==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_sp cannot be null!!");
                                            }
                                           localSeqdesc_sp.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_sp"),
                                               xmlWriter);
                                        } if (localSeqdesc_dbxrefTracker){
                                            if (localSeqdesc_dbxref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_dbxref cannot be null!!");
                                            }
                                           localSeqdesc_dbxref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_dbxref"),
                                               xmlWriter);
                                        } if (localSeqdesc_emblTracker){
                                            if (localSeqdesc_embl==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_embl cannot be null!!");
                                            }
                                           localSeqdesc_embl.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_embl"),
                                               xmlWriter);
                                        } if (localSeqdesc_createDateTracker){
                                            if (localSeqdesc_createDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_create-date cannot be null!!");
                                            }
                                           localSeqdesc_createDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_create-date"),
                                               xmlWriter);
                                        } if (localSeqdesc_updateDateTracker){
                                            if (localSeqdesc_updateDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_update-date cannot be null!!");
                                            }
                                           localSeqdesc_updateDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_update-date"),
                                               xmlWriter);
                                        } if (localSeqdesc_prfTracker){
                                            if (localSeqdesc_prf==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_prf cannot be null!!");
                                            }
                                           localSeqdesc_prf.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_prf"),
                                               xmlWriter);
                                        } if (localSeqdesc_pdbTracker){
                                            if (localSeqdesc_pdb==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_pdb cannot be null!!");
                                            }
                                           localSeqdesc_pdb.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_pdb"),
                                               xmlWriter);
                                        } if (localSeqdesc_hetTracker){
                                            if (localSeqdesc_het==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_het cannot be null!!");
                                            }
                                           localSeqdesc_het.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_het"),
                                               xmlWriter);
                                        } if (localSeqdesc_sourceTracker){
                                            if (localSeqdesc_source==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_source cannot be null!!");
                                            }
                                           localSeqdesc_source.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_source"),
                                               xmlWriter);
                                        } if (localSeqdesc_molinfoTracker){
                                            if (localSeqdesc_molinfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seqdesc_molinfo cannot be null!!");
                                            }
                                           localSeqdesc_molinfo.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_molinfo"),
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

                 if (localSeqdesc_molTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_mol-type"));
                            
                            
                                    if (localSeqdesc_molType==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_mol-type cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_molType);
                                } if (localSeqdesc_modifTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_modif"));
                            
                            
                                    if (localSeqdesc_modif==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_modif cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_modif);
                                } if (localSeqdesc_methodTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_method"));
                            
                            
                                    if (localSeqdesc_method==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_method cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_method);
                                } if (localSeqdesc_nameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_name"));
                                 
                                        if (localSeqdesc_name != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqdesc_name));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seqdesc_name cannot be null!!");
                                        }
                                    } if (localSeqdesc_titleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_title"));
                                 
                                        if (localSeqdesc_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqdesc_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seqdesc_title cannot be null!!");
                                        }
                                    } if (localSeqdesc_orgTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_org"));
                            
                            
                                    if (localSeqdesc_org==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_org cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_org);
                                } if (localSeqdesc_commentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_comment"));
                                 
                                        if (localSeqdesc_comment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqdesc_comment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seqdesc_comment cannot be null!!");
                                        }
                                    } if (localSeqdesc_numTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_num"));
                            
                            
                                    if (localSeqdesc_num==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_num cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_num);
                                } if (localSeqdesc_maplocTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_maploc"));
                            
                            
                                    if (localSeqdesc_maploc==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_maploc cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_maploc);
                                } if (localSeqdesc_pirTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_pir"));
                            
                            
                                    if (localSeqdesc_pir==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_pir cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_pir);
                                } if (localSeqdesc_genbankTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_genbank"));
                            
                            
                                    if (localSeqdesc_genbank==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_genbank cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_genbank);
                                } if (localSeqdesc_pubTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_pub"));
                            
                            
                                    if (localSeqdesc_pub==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_pub cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_pub);
                                } if (localSeqdesc_regionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_region"));
                                 
                                        if (localSeqdesc_region != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqdesc_region));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seqdesc_region cannot be null!!");
                                        }
                                    } if (localSeqdesc_userTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_user"));
                            
                            
                                    if (localSeqdesc_user==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_user cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_user);
                                } if (localSeqdesc_spTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_sp"));
                            
                            
                                    if (localSeqdesc_sp==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_sp cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_sp);
                                } if (localSeqdesc_dbxrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_dbxref"));
                            
                            
                                    if (localSeqdesc_dbxref==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_dbxref cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_dbxref);
                                } if (localSeqdesc_emblTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_embl"));
                            
                            
                                    if (localSeqdesc_embl==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_embl cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_embl);
                                } if (localSeqdesc_createDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_create-date"));
                            
                            
                                    if (localSeqdesc_createDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_create-date cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_createDate);
                                } if (localSeqdesc_updateDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_update-date"));
                            
                            
                                    if (localSeqdesc_updateDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_update-date cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_updateDate);
                                } if (localSeqdesc_prfTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_prf"));
                            
                            
                                    if (localSeqdesc_prf==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_prf cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_prf);
                                } if (localSeqdesc_pdbTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_pdb"));
                            
                            
                                    if (localSeqdesc_pdb==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_pdb cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_pdb);
                                } if (localSeqdesc_hetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_het"));
                            
                            
                                    if (localSeqdesc_het==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_het cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_het);
                                } if (localSeqdesc_sourceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_source"));
                            
                            
                                    if (localSeqdesc_source==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_source cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_source);
                                } if (localSeqdesc_molinfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seqdesc_molinfo"));
                            
                            
                                    if (localSeqdesc_molinfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seqdesc_molinfo cannot be null!!");
                                    }
                                    elementList.add(localSeqdesc_molinfo);
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
        public static Seqdesc_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Seqdesc_type0 object =
                new Seqdesc_type0();

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
                    
                            if (!"Seqdesc_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Seqdesc_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_mol-type").equals(reader.getName())){
                                
                                                object.setSeqdesc_molType(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molType_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_modif").equals(reader.getName())){
                                
                                                object.setSeqdesc_modif(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_modif_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_method").equals(reader.getName())){
                                
                                                object.setSeqdesc_method(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_method_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seqdesc_name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqdesc_name(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seqdesc_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqdesc_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_org").equals(reader.getName())){
                                
                                                object.setSeqdesc_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_org_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seqdesc_comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqdesc_comment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_num").equals(reader.getName())){
                                
                                                object.setSeqdesc_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_num_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_maploc").equals(reader.getName())){
                                
                                                object.setSeqdesc_maploc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_maploc_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_pir").equals(reader.getName())){
                                
                                                object.setSeqdesc_pir(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pir_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_genbank").equals(reader.getName())){
                                
                                                object.setSeqdesc_genbank(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_genbank_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_pub").equals(reader.getName())){
                                
                                                object.setSeqdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_region").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seqdesc_region" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqdesc_region(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_user").equals(reader.getName())){
                                
                                                object.setSeqdesc_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_user_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_sp").equals(reader.getName())){
                                
                                                object.setSeqdesc_sp(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_sp_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_dbxref").equals(reader.getName())){
                                
                                                object.setSeqdesc_dbxref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_dbxref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_embl").equals(reader.getName())){
                                
                                                object.setSeqdesc_embl(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_embl_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_create-date").equals(reader.getName())){
                                
                                                object.setSeqdesc_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_createDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_update-date").equals(reader.getName())){
                                
                                                object.setSeqdesc_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_updateDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_prf").equals(reader.getName())){
                                
                                                object.setSeqdesc_prf(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_prf_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_pdb").equals(reader.getName())){
                                
                                                object.setSeqdesc_pdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_pdb_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_het").equals(reader.getName())){
                                
                                                object.setSeqdesc_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_het_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_source").equals(reader.getName())){
                                
                                                object.setSeqdesc_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_source_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seqdesc_molinfo").equals(reader.getName())){
                                
                                                object.setSeqdesc_molinfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Seqdesc_molinfo_type0.Factory.parse(reader));
                                              
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
           
    