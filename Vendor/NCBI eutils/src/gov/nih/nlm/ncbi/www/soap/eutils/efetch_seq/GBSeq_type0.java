
/**
 * GBSeq_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  GBSeq_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GBSeq_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GBSeq_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for GBSeq_locus
                        */

                        
                                    protected java.lang.String localGBSeq_locus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_locus(){
                               return localGBSeq_locus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_locus
                               */
                               public void setGBSeq_locus(java.lang.String param){
                            
                                            this.localGBSeq_locus=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_length
                        */

                        
                                    protected java.math.BigInteger localGBSeq_length ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getGBSeq_length(){
                               return localGBSeq_length;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_length
                               */
                               public void setGBSeq_length(java.math.BigInteger param){
                            
                                            this.localGBSeq_length=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_strandedness
                        */

                        
                                    protected java.lang.String localGBSeq_strandedness ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_strandednessTracker = false ;

                           public boolean isGBSeq_strandednessSpecified(){
                               return localGBSeq_strandednessTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_strandedness(){
                               return localGBSeq_strandedness;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_strandedness
                               */
                               public void setGBSeq_strandedness(java.lang.String param){
                            localGBSeq_strandednessTracker = param != null;
                                   
                                            this.localGBSeq_strandedness=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_moltype
                        */

                        
                                    protected java.lang.String localGBSeq_moltype ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_moltype(){
                               return localGBSeq_moltype;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_moltype
                               */
                               public void setGBSeq_moltype(java.lang.String param){
                            
                                            this.localGBSeq_moltype=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_topology
                        */

                        
                                    protected java.lang.String localGBSeq_topology ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_topologyTracker = false ;

                           public boolean isGBSeq_topologySpecified(){
                               return localGBSeq_topologyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_topology(){
                               return localGBSeq_topology;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_topology
                               */
                               public void setGBSeq_topology(java.lang.String param){
                            localGBSeq_topologyTracker = param != null;
                                   
                                            this.localGBSeq_topology=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_division
                        */

                        
                                    protected java.lang.String localGBSeq_division ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_division(){
                               return localGBSeq_division;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_division
                               */
                               public void setGBSeq_division(java.lang.String param){
                            
                                            this.localGBSeq_division=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_updateDate
                        */

                        
                                    protected java.lang.String localGBSeq_updateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_updateDate(){
                               return localGBSeq_updateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_updateDate
                               */
                               public void setGBSeq_updateDate(java.lang.String param){
                            
                                            this.localGBSeq_updateDate=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_createDate
                        */

                        
                                    protected java.lang.String localGBSeq_createDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_createDateTracker = false ;

                           public boolean isGBSeq_createDateSpecified(){
                               return localGBSeq_createDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_createDate(){
                               return localGBSeq_createDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_createDate
                               */
                               public void setGBSeq_createDate(java.lang.String param){
                            localGBSeq_createDateTracker = param != null;
                                   
                                            this.localGBSeq_createDate=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_updateRelease
                        */

                        
                                    protected java.lang.String localGBSeq_updateRelease ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_updateReleaseTracker = false ;

                           public boolean isGBSeq_updateReleaseSpecified(){
                               return localGBSeq_updateReleaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_updateRelease(){
                               return localGBSeq_updateRelease;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_updateRelease
                               */
                               public void setGBSeq_updateRelease(java.lang.String param){
                            localGBSeq_updateReleaseTracker = param != null;
                                   
                                            this.localGBSeq_updateRelease=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_createRelease
                        */

                        
                                    protected java.lang.String localGBSeq_createRelease ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_createReleaseTracker = false ;

                           public boolean isGBSeq_createReleaseSpecified(){
                               return localGBSeq_createReleaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_createRelease(){
                               return localGBSeq_createRelease;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_createRelease
                               */
                               public void setGBSeq_createRelease(java.lang.String param){
                            localGBSeq_createReleaseTracker = param != null;
                                   
                                            this.localGBSeq_createRelease=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_definition
                        */

                        
                                    protected java.lang.String localGBSeq_definition ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_definition(){
                               return localGBSeq_definition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_definition
                               */
                               public void setGBSeq_definition(java.lang.String param){
                            
                                            this.localGBSeq_definition=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_primaryAccession
                        */

                        
                                    protected java.lang.String localGBSeq_primaryAccession ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_primaryAccessionTracker = false ;

                           public boolean isGBSeq_primaryAccessionSpecified(){
                               return localGBSeq_primaryAccessionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_primaryAccession(){
                               return localGBSeq_primaryAccession;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_primaryAccession
                               */
                               public void setGBSeq_primaryAccession(java.lang.String param){
                            localGBSeq_primaryAccessionTracker = param != null;
                                   
                                            this.localGBSeq_primaryAccession=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_entryVersion
                        */

                        
                                    protected java.lang.String localGBSeq_entryVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_entryVersionTracker = false ;

                           public boolean isGBSeq_entryVersionSpecified(){
                               return localGBSeq_entryVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_entryVersion(){
                               return localGBSeq_entryVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_entryVersion
                               */
                               public void setGBSeq_entryVersion(java.lang.String param){
                            localGBSeq_entryVersionTracker = param != null;
                                   
                                            this.localGBSeq_entryVersion=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_accessionVersion
                        */

                        
                                    protected java.lang.String localGBSeq_accessionVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_accessionVersionTracker = false ;

                           public boolean isGBSeq_accessionVersionSpecified(){
                               return localGBSeq_accessionVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_accessionVersion(){
                               return localGBSeq_accessionVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_accessionVersion
                               */
                               public void setGBSeq_accessionVersion(java.lang.String param){
                            localGBSeq_accessionVersionTracker = param != null;
                                   
                                            this.localGBSeq_accessionVersion=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_otherSeqids
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_otherSeqids_type0 localGBSeq_otherSeqids ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_otherSeqidsTracker = false ;

                           public boolean isGBSeq_otherSeqidsSpecified(){
                               return localGBSeq_otherSeqidsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_otherSeqids_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_otherSeqids_type0 getGBSeq_otherSeqids(){
                               return localGBSeq_otherSeqids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_otherSeqids
                               */
                               public void setGBSeq_otherSeqids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_otherSeqids_type0 param){
                            localGBSeq_otherSeqidsTracker = param != null;
                                   
                                            this.localGBSeq_otherSeqids=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_secondaryAccessions
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_secondaryAccessions_type0 localGBSeq_secondaryAccessions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_secondaryAccessionsTracker = false ;

                           public boolean isGBSeq_secondaryAccessionsSpecified(){
                               return localGBSeq_secondaryAccessionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_secondaryAccessions_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_secondaryAccessions_type0 getGBSeq_secondaryAccessions(){
                               return localGBSeq_secondaryAccessions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_secondaryAccessions
                               */
                               public void setGBSeq_secondaryAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_secondaryAccessions_type0 param){
                            localGBSeq_secondaryAccessionsTracker = param != null;
                                   
                                            this.localGBSeq_secondaryAccessions=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_project
                        */

                        
                                    protected java.lang.String localGBSeq_project ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_projectTracker = false ;

                           public boolean isGBSeq_projectSpecified(){
                               return localGBSeq_projectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_project(){
                               return localGBSeq_project;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_project
                               */
                               public void setGBSeq_project(java.lang.String param){
                            localGBSeq_projectTracker = param != null;
                                   
                                            this.localGBSeq_project=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_keywords
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_keywords_type0 localGBSeq_keywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_keywordsTracker = false ;

                           public boolean isGBSeq_keywordsSpecified(){
                               return localGBSeq_keywordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_keywords_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_keywords_type0 getGBSeq_keywords(){
                               return localGBSeq_keywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_keywords
                               */
                               public void setGBSeq_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_keywords_type0 param){
                            localGBSeq_keywordsTracker = param != null;
                                   
                                            this.localGBSeq_keywords=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_segment
                        */

                        
                                    protected java.lang.String localGBSeq_segment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_segmentTracker = false ;

                           public boolean isGBSeq_segmentSpecified(){
                               return localGBSeq_segmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_segment(){
                               return localGBSeq_segment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_segment
                               */
                               public void setGBSeq_segment(java.lang.String param){
                            localGBSeq_segmentTracker = param != null;
                                   
                                            this.localGBSeq_segment=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_source
                        */

                        
                                    protected java.lang.String localGBSeq_source ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_sourceTracker = false ;

                           public boolean isGBSeq_sourceSpecified(){
                               return localGBSeq_sourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_source(){
                               return localGBSeq_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_source
                               */
                               public void setGBSeq_source(java.lang.String param){
                            localGBSeq_sourceTracker = param != null;
                                   
                                            this.localGBSeq_source=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_organism
                        */

                        
                                    protected java.lang.String localGBSeq_organism ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_organismTracker = false ;

                           public boolean isGBSeq_organismSpecified(){
                               return localGBSeq_organismTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_organism(){
                               return localGBSeq_organism;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_organism
                               */
                               public void setGBSeq_organism(java.lang.String param){
                            localGBSeq_organismTracker = param != null;
                                   
                                            this.localGBSeq_organism=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_taxonomy
                        */

                        
                                    protected java.lang.String localGBSeq_taxonomy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_taxonomyTracker = false ;

                           public boolean isGBSeq_taxonomySpecified(){
                               return localGBSeq_taxonomyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_taxonomy(){
                               return localGBSeq_taxonomy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_taxonomy
                               */
                               public void setGBSeq_taxonomy(java.lang.String param){
                            localGBSeq_taxonomyTracker = param != null;
                                   
                                            this.localGBSeq_taxonomy=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_references
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_references_type0 localGBSeq_references ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_referencesTracker = false ;

                           public boolean isGBSeq_referencesSpecified(){
                               return localGBSeq_referencesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_references_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_references_type0 getGBSeq_references(){
                               return localGBSeq_references;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_references
                               */
                               public void setGBSeq_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_references_type0 param){
                            localGBSeq_referencesTracker = param != null;
                                   
                                            this.localGBSeq_references=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_comment
                        */

                        
                                    protected java.lang.String localGBSeq_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_commentTracker = false ;

                           public boolean isGBSeq_commentSpecified(){
                               return localGBSeq_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_comment(){
                               return localGBSeq_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_comment
                               */
                               public void setGBSeq_comment(java.lang.String param){
                            localGBSeq_commentTracker = param != null;
                                   
                                            this.localGBSeq_comment=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_commentSet
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_commentSet_type0 localGBSeq_commentSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_commentSetTracker = false ;

                           public boolean isGBSeq_commentSetSpecified(){
                               return localGBSeq_commentSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_commentSet_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_commentSet_type0 getGBSeq_commentSet(){
                               return localGBSeq_commentSet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_commentSet
                               */
                               public void setGBSeq_commentSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_commentSet_type0 param){
                            localGBSeq_commentSetTracker = param != null;
                                   
                                            this.localGBSeq_commentSet=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_strucComments
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_strucComments_type0 localGBSeq_strucComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_strucCommentsTracker = false ;

                           public boolean isGBSeq_strucCommentsSpecified(){
                               return localGBSeq_strucCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_strucComments_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_strucComments_type0 getGBSeq_strucComments(){
                               return localGBSeq_strucComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_strucComments
                               */
                               public void setGBSeq_strucComments(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_strucComments_type0 param){
                            localGBSeq_strucCommentsTracker = param != null;
                                   
                                            this.localGBSeq_strucComments=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_primary
                        */

                        
                                    protected java.lang.String localGBSeq_primary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_primaryTracker = false ;

                           public boolean isGBSeq_primarySpecified(){
                               return localGBSeq_primaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_primary(){
                               return localGBSeq_primary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_primary
                               */
                               public void setGBSeq_primary(java.lang.String param){
                            localGBSeq_primaryTracker = param != null;
                                   
                                            this.localGBSeq_primary=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_sourceDb
                        */

                        
                                    protected java.lang.String localGBSeq_sourceDb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_sourceDbTracker = false ;

                           public boolean isGBSeq_sourceDbSpecified(){
                               return localGBSeq_sourceDbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_sourceDb(){
                               return localGBSeq_sourceDb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_sourceDb
                               */
                               public void setGBSeq_sourceDb(java.lang.String param){
                            localGBSeq_sourceDbTracker = param != null;
                                   
                                            this.localGBSeq_sourceDb=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_databaseReference
                        */

                        
                                    protected java.lang.String localGBSeq_databaseReference ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_databaseReferenceTracker = false ;

                           public boolean isGBSeq_databaseReferenceSpecified(){
                               return localGBSeq_databaseReferenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_databaseReference(){
                               return localGBSeq_databaseReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_databaseReference
                               */
                               public void setGBSeq_databaseReference(java.lang.String param){
                            localGBSeq_databaseReferenceTracker = param != null;
                                   
                                            this.localGBSeq_databaseReference=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_featureTable
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureTable_type0 localGBSeq_featureTable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_featureTableTracker = false ;

                           public boolean isGBSeq_featureTableSpecified(){
                               return localGBSeq_featureTableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureTable_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureTable_type0 getGBSeq_featureTable(){
                               return localGBSeq_featureTable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_featureTable
                               */
                               public void setGBSeq_featureTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureTable_type0 param){
                            localGBSeq_featureTableTracker = param != null;
                                   
                                            this.localGBSeq_featureTable=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_featureSet
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureSet_type0 localGBSeq_featureSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_featureSetTracker = false ;

                           public boolean isGBSeq_featureSetSpecified(){
                               return localGBSeq_featureSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureSet_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureSet_type0 getGBSeq_featureSet(){
                               return localGBSeq_featureSet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_featureSet
                               */
                               public void setGBSeq_featureSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureSet_type0 param){
                            localGBSeq_featureSetTracker = param != null;
                                   
                                            this.localGBSeq_featureSet=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_sequence
                        */

                        
                                    protected java.lang.String localGBSeq_sequence ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_sequenceTracker = false ;

                           public boolean isGBSeq_sequenceSpecified(){
                               return localGBSeq_sequenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_sequence(){
                               return localGBSeq_sequence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_sequence
                               */
                               public void setGBSeq_sequence(java.lang.String param){
                            localGBSeq_sequenceTracker = param != null;
                                   
                                            this.localGBSeq_sequence=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_contig
                        */

                        
                                    protected java.lang.String localGBSeq_contig ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_contigTracker = false ;

                           public boolean isGBSeq_contigSpecified(){
                               return localGBSeq_contigTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGBSeq_contig(){
                               return localGBSeq_contig;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_contig
                               */
                               public void setGBSeq_contig(java.lang.String param){
                            localGBSeq_contigTracker = param != null;
                                   
                                            this.localGBSeq_contig=param;
                                    

                               }
                            

                        /**
                        * field for GBSeq_altSeq
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_altSeq_type0 localGBSeq_altSeq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGBSeq_altSeqTracker = false ;

                           public boolean isGBSeq_altSeqSpecified(){
                               return localGBSeq_altSeqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_altSeq_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_altSeq_type0 getGBSeq_altSeq(){
                               return localGBSeq_altSeq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GBSeq_altSeq
                               */
                               public void setGBSeq_altSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_altSeq_type0 param){
                            localGBSeq_altSeqTracker = param != null;
                                   
                                            this.localGBSeq_altSeq=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":GBSeq_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GBSeq_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_locus", xmlWriter);
                             

                                          if (localGBSeq_locus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_locus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_locus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_length", xmlWriter);
                             

                                          if (localGBSeq_length==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_length cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_length));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBSeq_strandednessTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_strandedness", xmlWriter);
                             

                                          if (localGBSeq_strandedness==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_strandedness cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_strandedness);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_moltype", xmlWriter);
                             

                                          if (localGBSeq_moltype==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_moltype cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_moltype);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBSeq_topologyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_topology", xmlWriter);
                             

                                          if (localGBSeq_topology==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_topology cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_topology);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_division", xmlWriter);
                             

                                          if (localGBSeq_division==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_division cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_division);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_update-date", xmlWriter);
                             

                                          if (localGBSeq_updateDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_update-date cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_updateDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBSeq_createDateTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_create-date", xmlWriter);
                             

                                          if (localGBSeq_createDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_create-date cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_createDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_updateReleaseTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_update-release", xmlWriter);
                             

                                          if (localGBSeq_updateRelease==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_update-release cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_updateRelease);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_createReleaseTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_create-release", xmlWriter);
                             

                                          if (localGBSeq_createRelease==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_create-release cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_createRelease);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_definition", xmlWriter);
                             

                                          if (localGBSeq_definition==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_definition cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_definition);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGBSeq_primaryAccessionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_primary-accession", xmlWriter);
                             

                                          if (localGBSeq_primaryAccession==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_primary-accession cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_primaryAccession);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_entryVersionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_entry-version", xmlWriter);
                             

                                          if (localGBSeq_entryVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_entry-version cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_entryVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_accessionVersionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_accession-version", xmlWriter);
                             

                                          if (localGBSeq_accessionVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_accession-version cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_accessionVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_otherSeqidsTracker){
                                            if (localGBSeq_otherSeqids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_other-seqids cannot be null!!");
                                            }
                                           localGBSeq_otherSeqids.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_other-seqids"),
                                               xmlWriter);
                                        } if (localGBSeq_secondaryAccessionsTracker){
                                            if (localGBSeq_secondaryAccessions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_secondary-accessions cannot be null!!");
                                            }
                                           localGBSeq_secondaryAccessions.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_secondary-accessions"),
                                               xmlWriter);
                                        } if (localGBSeq_projectTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_project", xmlWriter);
                             

                                          if (localGBSeq_project==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_project cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_project);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_keywordsTracker){
                                            if (localGBSeq_keywords==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_keywords cannot be null!!");
                                            }
                                           localGBSeq_keywords.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_keywords"),
                                               xmlWriter);
                                        } if (localGBSeq_segmentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_segment", xmlWriter);
                             

                                          if (localGBSeq_segment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_segment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_segment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_sourceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_source", xmlWriter);
                             

                                          if (localGBSeq_source==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_source cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_source);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_organismTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_organism", xmlWriter);
                             

                                          if (localGBSeq_organism==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_organism cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_organism);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_taxonomyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_taxonomy", xmlWriter);
                             

                                          if (localGBSeq_taxonomy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_taxonomy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_taxonomy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_referencesTracker){
                                            if (localGBSeq_references==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_references cannot be null!!");
                                            }
                                           localGBSeq_references.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_references"),
                                               xmlWriter);
                                        } if (localGBSeq_commentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_comment", xmlWriter);
                             

                                          if (localGBSeq_comment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_comment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_commentSetTracker){
                                            if (localGBSeq_commentSet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_comment-set cannot be null!!");
                                            }
                                           localGBSeq_commentSet.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_comment-set"),
                                               xmlWriter);
                                        } if (localGBSeq_strucCommentsTracker){
                                            if (localGBSeq_strucComments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_struc-comments cannot be null!!");
                                            }
                                           localGBSeq_strucComments.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_struc-comments"),
                                               xmlWriter);
                                        } if (localGBSeq_primaryTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_primary", xmlWriter);
                             

                                          if (localGBSeq_primary==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_primary cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_primary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_sourceDbTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_source-db", xmlWriter);
                             

                                          if (localGBSeq_sourceDb==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_source-db cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_sourceDb);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_databaseReferenceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_database-reference", xmlWriter);
                             

                                          if (localGBSeq_databaseReference==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_database-reference cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_databaseReference);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_featureTableTracker){
                                            if (localGBSeq_featureTable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_feature-table cannot be null!!");
                                            }
                                           localGBSeq_featureTable.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_feature-table"),
                                               xmlWriter);
                                        } if (localGBSeq_featureSetTracker){
                                            if (localGBSeq_featureSet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_feature-set cannot be null!!");
                                            }
                                           localGBSeq_featureSet.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_feature-set"),
                                               xmlWriter);
                                        } if (localGBSeq_sequenceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_sequence", xmlWriter);
                             

                                          if (localGBSeq_sequence==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_sequence cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_sequence);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_contigTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "GBSeq_contig", xmlWriter);
                             

                                          if (localGBSeq_contig==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GBSeq_contig cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGBSeq_contig);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGBSeq_altSeqTracker){
                                            if (localGBSeq_altSeq==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GBSeq_alt-seq cannot be null!!");
                                            }
                                           localGBSeq_altSeq.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_alt-seq"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq")){
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_locus"));
                                 
                                        if (localGBSeq_locus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_locus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_locus cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_length"));
                                 
                                        if (localGBSeq_length != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_length));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_length cannot be null!!");
                                        }
                                     if (localGBSeq_strandednessTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_strandedness"));
                                 
                                        if (localGBSeq_strandedness != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_strandedness));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_strandedness cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_moltype"));
                                 
                                        if (localGBSeq_moltype != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_moltype));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_moltype cannot be null!!");
                                        }
                                     if (localGBSeq_topologyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_topology"));
                                 
                                        if (localGBSeq_topology != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_topology));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_topology cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_division"));
                                 
                                        if (localGBSeq_division != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_division));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_division cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_update-date"));
                                 
                                        if (localGBSeq_updateDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_updateDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_update-date cannot be null!!");
                                        }
                                     if (localGBSeq_createDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_create-date"));
                                 
                                        if (localGBSeq_createDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_createDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_create-date cannot be null!!");
                                        }
                                    } if (localGBSeq_updateReleaseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_update-release"));
                                 
                                        if (localGBSeq_updateRelease != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_updateRelease));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_update-release cannot be null!!");
                                        }
                                    } if (localGBSeq_createReleaseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_create-release"));
                                 
                                        if (localGBSeq_createRelease != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_createRelease));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_create-release cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_definition"));
                                 
                                        if (localGBSeq_definition != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_definition));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_definition cannot be null!!");
                                        }
                                     if (localGBSeq_primaryAccessionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_primary-accession"));
                                 
                                        if (localGBSeq_primaryAccession != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_primaryAccession));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_primary-accession cannot be null!!");
                                        }
                                    } if (localGBSeq_entryVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_entry-version"));
                                 
                                        if (localGBSeq_entryVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_entryVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_entry-version cannot be null!!");
                                        }
                                    } if (localGBSeq_accessionVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_accession-version"));
                                 
                                        if (localGBSeq_accessionVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_accessionVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_accession-version cannot be null!!");
                                        }
                                    } if (localGBSeq_otherSeqidsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_other-seqids"));
                            
                            
                                    if (localGBSeq_otherSeqids==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_other-seqids cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_otherSeqids);
                                } if (localGBSeq_secondaryAccessionsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_secondary-accessions"));
                            
                            
                                    if (localGBSeq_secondaryAccessions==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_secondary-accessions cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_secondaryAccessions);
                                } if (localGBSeq_projectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_project"));
                                 
                                        if (localGBSeq_project != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_project));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_project cannot be null!!");
                                        }
                                    } if (localGBSeq_keywordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_keywords"));
                            
                            
                                    if (localGBSeq_keywords==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_keywords cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_keywords);
                                } if (localGBSeq_segmentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_segment"));
                                 
                                        if (localGBSeq_segment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_segment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_segment cannot be null!!");
                                        }
                                    } if (localGBSeq_sourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_source"));
                                 
                                        if (localGBSeq_source != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_source));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_source cannot be null!!");
                                        }
                                    } if (localGBSeq_organismTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_organism"));
                                 
                                        if (localGBSeq_organism != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_organism));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_organism cannot be null!!");
                                        }
                                    } if (localGBSeq_taxonomyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_taxonomy"));
                                 
                                        if (localGBSeq_taxonomy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_taxonomy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_taxonomy cannot be null!!");
                                        }
                                    } if (localGBSeq_referencesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_references"));
                            
                            
                                    if (localGBSeq_references==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_references cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_references);
                                } if (localGBSeq_commentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_comment"));
                                 
                                        if (localGBSeq_comment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_comment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_comment cannot be null!!");
                                        }
                                    } if (localGBSeq_commentSetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_comment-set"));
                            
                            
                                    if (localGBSeq_commentSet==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_comment-set cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_commentSet);
                                } if (localGBSeq_strucCommentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_struc-comments"));
                            
                            
                                    if (localGBSeq_strucComments==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_struc-comments cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_strucComments);
                                } if (localGBSeq_primaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_primary"));
                                 
                                        if (localGBSeq_primary != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_primary));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_primary cannot be null!!");
                                        }
                                    } if (localGBSeq_sourceDbTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_source-db"));
                                 
                                        if (localGBSeq_sourceDb != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_sourceDb));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_source-db cannot be null!!");
                                        }
                                    } if (localGBSeq_databaseReferenceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_database-reference"));
                                 
                                        if (localGBSeq_databaseReference != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_databaseReference));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_database-reference cannot be null!!");
                                        }
                                    } if (localGBSeq_featureTableTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_feature-table"));
                            
                            
                                    if (localGBSeq_featureTable==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_feature-table cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_featureTable);
                                } if (localGBSeq_featureSetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_feature-set"));
                            
                            
                                    if (localGBSeq_featureSet==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_feature-set cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_featureSet);
                                } if (localGBSeq_sequenceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_sequence"));
                                 
                                        if (localGBSeq_sequence != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_sequence));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_sequence cannot be null!!");
                                        }
                                    } if (localGBSeq_contigTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_contig"));
                                 
                                        if (localGBSeq_contig != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGBSeq_contig));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GBSeq_contig cannot be null!!");
                                        }
                                    } if (localGBSeq_altSeqTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "GBSeq_alt-seq"));
                            
                            
                                    if (localGBSeq_altSeq==null){
                                         throw new org.apache.axis2.databinding.ADBException("GBSeq_alt-seq cannot be null!!");
                                    }
                                    elementList.add(localGBSeq_altSeq);
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
        public static GBSeq_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GBSeq_type0 object =
                new GBSeq_type0();

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
                    
                            if (!"GBSeq_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GBSeq_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_locus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_locus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_locus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_length").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_length" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_length(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_strandedness").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_strandedness" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_strandedness(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_moltype").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_moltype" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_moltype(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_topology").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_topology" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_topology(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_division").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_division" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_division(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_update-date").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_update-date" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_updateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_create-date").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_create-date" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_createDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_update-release").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_update-release" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_updateRelease(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_create-release").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_create-release" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_createRelease(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_definition").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_definition" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_definition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_primary-accession").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_primary-accession" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_primaryAccession(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_entry-version").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_entry-version" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_entryVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_accession-version").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_accession-version" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_accessionVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_other-seqids").equals(reader.getName())){
                                
                                                object.setGBSeq_otherSeqids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_otherSeqids_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_secondary-accessions").equals(reader.getName())){
                                
                                                object.setGBSeq_secondaryAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_secondaryAccessions_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_project").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_project" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_project(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_keywords").equals(reader.getName())){
                                
                                                object.setGBSeq_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_keywords_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_segment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_segment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_segment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_source").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_source" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_source(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_organism").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_organism" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_organism(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_taxonomy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_taxonomy" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_taxonomy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_references").equals(reader.getName())){
                                
                                                object.setGBSeq_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_references_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_comment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_comment-set").equals(reader.getName())){
                                
                                                object.setGBSeq_commentSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_commentSet_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_struc-comments").equals(reader.getName())){
                                
                                                object.setGBSeq_strucComments(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_strucComments_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_primary").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_primary" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_primary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_source-db").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_source-db" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_sourceDb(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_database-reference").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_database-reference" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_databaseReference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_feature-table").equals(reader.getName())){
                                
                                                object.setGBSeq_featureTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureTable_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_feature-set").equals(reader.getName())){
                                
                                                object.setGBSeq_featureSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_featureSet_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_sequence").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_sequence" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_sequence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_contig").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GBSeq_contig" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGBSeq_contig(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","GBSeq_alt-seq").equals(reader.getName())){
                                
                                                object.setGBSeq_altSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_altSeq_type0.Factory.parse(reader));
                                              
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
           
    