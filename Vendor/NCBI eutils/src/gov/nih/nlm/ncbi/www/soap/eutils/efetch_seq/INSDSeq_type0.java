
/**
 * INSDSeq_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq;
            

            /**
            *  INSDSeq_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class INSDSeq_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = INSDSeq_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for INSDSeq_locus
                        */

                        
                                    protected java.lang.String localINSDSeq_locus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_locus(){
                               return localINSDSeq_locus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_locus
                               */
                               public void setINSDSeq_locus(java.lang.String param){
                            
                                            this.localINSDSeq_locus=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_length
                        */

                        
                                    protected java.math.BigInteger localINSDSeq_length ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getINSDSeq_length(){
                               return localINSDSeq_length;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_length
                               */
                               public void setINSDSeq_length(java.math.BigInteger param){
                            
                                            this.localINSDSeq_length=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_strandedness
                        */

                        
                                    protected java.lang.String localINSDSeq_strandedness ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_strandednessTracker = false ;

                           public boolean isINSDSeq_strandednessSpecified(){
                               return localINSDSeq_strandednessTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_strandedness(){
                               return localINSDSeq_strandedness;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_strandedness
                               */
                               public void setINSDSeq_strandedness(java.lang.String param){
                            localINSDSeq_strandednessTracker = param != null;
                                   
                                            this.localINSDSeq_strandedness=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_moltype
                        */

                        
                                    protected java.lang.String localINSDSeq_moltype ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_moltype(){
                               return localINSDSeq_moltype;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_moltype
                               */
                               public void setINSDSeq_moltype(java.lang.String param){
                            
                                            this.localINSDSeq_moltype=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_topology
                        */

                        
                                    protected java.lang.String localINSDSeq_topology ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_topologyTracker = false ;

                           public boolean isINSDSeq_topologySpecified(){
                               return localINSDSeq_topologyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_topology(){
                               return localINSDSeq_topology;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_topology
                               */
                               public void setINSDSeq_topology(java.lang.String param){
                            localINSDSeq_topologyTracker = param != null;
                                   
                                            this.localINSDSeq_topology=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_division
                        */

                        
                                    protected java.lang.String localINSDSeq_division ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_division(){
                               return localINSDSeq_division;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_division
                               */
                               public void setINSDSeq_division(java.lang.String param){
                            
                                            this.localINSDSeq_division=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_updateDate
                        */

                        
                                    protected java.lang.String localINSDSeq_updateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_updateDate(){
                               return localINSDSeq_updateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_updateDate
                               */
                               public void setINSDSeq_updateDate(java.lang.String param){
                            
                                            this.localINSDSeq_updateDate=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_createDate
                        */

                        
                                    protected java.lang.String localINSDSeq_createDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_createDateTracker = false ;

                           public boolean isINSDSeq_createDateSpecified(){
                               return localINSDSeq_createDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_createDate(){
                               return localINSDSeq_createDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_createDate
                               */
                               public void setINSDSeq_createDate(java.lang.String param){
                            localINSDSeq_createDateTracker = param != null;
                                   
                                            this.localINSDSeq_createDate=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_updateRelease
                        */

                        
                                    protected java.lang.String localINSDSeq_updateRelease ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_updateReleaseTracker = false ;

                           public boolean isINSDSeq_updateReleaseSpecified(){
                               return localINSDSeq_updateReleaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_updateRelease(){
                               return localINSDSeq_updateRelease;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_updateRelease
                               */
                               public void setINSDSeq_updateRelease(java.lang.String param){
                            localINSDSeq_updateReleaseTracker = param != null;
                                   
                                            this.localINSDSeq_updateRelease=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_createRelease
                        */

                        
                                    protected java.lang.String localINSDSeq_createRelease ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_createReleaseTracker = false ;

                           public boolean isINSDSeq_createReleaseSpecified(){
                               return localINSDSeq_createReleaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_createRelease(){
                               return localINSDSeq_createRelease;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_createRelease
                               */
                               public void setINSDSeq_createRelease(java.lang.String param){
                            localINSDSeq_createReleaseTracker = param != null;
                                   
                                            this.localINSDSeq_createRelease=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_definition
                        */

                        
                                    protected java.lang.String localINSDSeq_definition ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_definition(){
                               return localINSDSeq_definition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_definition
                               */
                               public void setINSDSeq_definition(java.lang.String param){
                            
                                            this.localINSDSeq_definition=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_primaryAccession
                        */

                        
                                    protected java.lang.String localINSDSeq_primaryAccession ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_primaryAccessionTracker = false ;

                           public boolean isINSDSeq_primaryAccessionSpecified(){
                               return localINSDSeq_primaryAccessionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_primaryAccession(){
                               return localINSDSeq_primaryAccession;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_primaryAccession
                               */
                               public void setINSDSeq_primaryAccession(java.lang.String param){
                            localINSDSeq_primaryAccessionTracker = param != null;
                                   
                                            this.localINSDSeq_primaryAccession=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_entryVersion
                        */

                        
                                    protected java.lang.String localINSDSeq_entryVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_entryVersionTracker = false ;

                           public boolean isINSDSeq_entryVersionSpecified(){
                               return localINSDSeq_entryVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_entryVersion(){
                               return localINSDSeq_entryVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_entryVersion
                               */
                               public void setINSDSeq_entryVersion(java.lang.String param){
                            localINSDSeq_entryVersionTracker = param != null;
                                   
                                            this.localINSDSeq_entryVersion=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_accessionVersion
                        */

                        
                                    protected java.lang.String localINSDSeq_accessionVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_accessionVersionTracker = false ;

                           public boolean isINSDSeq_accessionVersionSpecified(){
                               return localINSDSeq_accessionVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_accessionVersion(){
                               return localINSDSeq_accessionVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_accessionVersion
                               */
                               public void setINSDSeq_accessionVersion(java.lang.String param){
                            localINSDSeq_accessionVersionTracker = param != null;
                                   
                                            this.localINSDSeq_accessionVersion=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_otherSeqids
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_otherSeqids_type0 localINSDSeq_otherSeqids ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_otherSeqidsTracker = false ;

                           public boolean isINSDSeq_otherSeqidsSpecified(){
                               return localINSDSeq_otherSeqidsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_otherSeqids_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_otherSeqids_type0 getINSDSeq_otherSeqids(){
                               return localINSDSeq_otherSeqids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_otherSeqids
                               */
                               public void setINSDSeq_otherSeqids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_otherSeqids_type0 param){
                            localINSDSeq_otherSeqidsTracker = param != null;
                                   
                                            this.localINSDSeq_otherSeqids=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_secondaryAccessions
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_secondaryAccessions_type0 localINSDSeq_secondaryAccessions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_secondaryAccessionsTracker = false ;

                           public boolean isINSDSeq_secondaryAccessionsSpecified(){
                               return localINSDSeq_secondaryAccessionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_secondaryAccessions_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_secondaryAccessions_type0 getINSDSeq_secondaryAccessions(){
                               return localINSDSeq_secondaryAccessions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_secondaryAccessions
                               */
                               public void setINSDSeq_secondaryAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_secondaryAccessions_type0 param){
                            localINSDSeq_secondaryAccessionsTracker = param != null;
                                   
                                            this.localINSDSeq_secondaryAccessions=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_project
                        */

                        
                                    protected java.lang.String localINSDSeq_project ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_projectTracker = false ;

                           public boolean isINSDSeq_projectSpecified(){
                               return localINSDSeq_projectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_project(){
                               return localINSDSeq_project;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_project
                               */
                               public void setINSDSeq_project(java.lang.String param){
                            localINSDSeq_projectTracker = param != null;
                                   
                                            this.localINSDSeq_project=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_keywords
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_keywords_type0 localINSDSeq_keywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_keywordsTracker = false ;

                           public boolean isINSDSeq_keywordsSpecified(){
                               return localINSDSeq_keywordsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_keywords_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_keywords_type0 getINSDSeq_keywords(){
                               return localINSDSeq_keywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_keywords
                               */
                               public void setINSDSeq_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_keywords_type0 param){
                            localINSDSeq_keywordsTracker = param != null;
                                   
                                            this.localINSDSeq_keywords=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_segment
                        */

                        
                                    protected java.lang.String localINSDSeq_segment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_segmentTracker = false ;

                           public boolean isINSDSeq_segmentSpecified(){
                               return localINSDSeq_segmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_segment(){
                               return localINSDSeq_segment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_segment
                               */
                               public void setINSDSeq_segment(java.lang.String param){
                            localINSDSeq_segmentTracker = param != null;
                                   
                                            this.localINSDSeq_segment=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_source
                        */

                        
                                    protected java.lang.String localINSDSeq_source ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_sourceTracker = false ;

                           public boolean isINSDSeq_sourceSpecified(){
                               return localINSDSeq_sourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_source(){
                               return localINSDSeq_source;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_source
                               */
                               public void setINSDSeq_source(java.lang.String param){
                            localINSDSeq_sourceTracker = param != null;
                                   
                                            this.localINSDSeq_source=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_organism
                        */

                        
                                    protected java.lang.String localINSDSeq_organism ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_organismTracker = false ;

                           public boolean isINSDSeq_organismSpecified(){
                               return localINSDSeq_organismTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_organism(){
                               return localINSDSeq_organism;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_organism
                               */
                               public void setINSDSeq_organism(java.lang.String param){
                            localINSDSeq_organismTracker = param != null;
                                   
                                            this.localINSDSeq_organism=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_taxonomy
                        */

                        
                                    protected java.lang.String localINSDSeq_taxonomy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_taxonomyTracker = false ;

                           public boolean isINSDSeq_taxonomySpecified(){
                               return localINSDSeq_taxonomyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_taxonomy(){
                               return localINSDSeq_taxonomy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_taxonomy
                               */
                               public void setINSDSeq_taxonomy(java.lang.String param){
                            localINSDSeq_taxonomyTracker = param != null;
                                   
                                            this.localINSDSeq_taxonomy=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_references
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_references_type0 localINSDSeq_references ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_referencesTracker = false ;

                           public boolean isINSDSeq_referencesSpecified(){
                               return localINSDSeq_referencesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_references_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_references_type0 getINSDSeq_references(){
                               return localINSDSeq_references;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_references
                               */
                               public void setINSDSeq_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_references_type0 param){
                            localINSDSeq_referencesTracker = param != null;
                                   
                                            this.localINSDSeq_references=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_comment
                        */

                        
                                    protected java.lang.String localINSDSeq_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_commentTracker = false ;

                           public boolean isINSDSeq_commentSpecified(){
                               return localINSDSeq_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_comment(){
                               return localINSDSeq_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_comment
                               */
                               public void setINSDSeq_comment(java.lang.String param){
                            localINSDSeq_commentTracker = param != null;
                                   
                                            this.localINSDSeq_comment=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_commentSet
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_commentSet_type0 localINSDSeq_commentSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_commentSetTracker = false ;

                           public boolean isINSDSeq_commentSetSpecified(){
                               return localINSDSeq_commentSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_commentSet_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_commentSet_type0 getINSDSeq_commentSet(){
                               return localINSDSeq_commentSet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_commentSet
                               */
                               public void setINSDSeq_commentSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_commentSet_type0 param){
                            localINSDSeq_commentSetTracker = param != null;
                                   
                                            this.localINSDSeq_commentSet=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_strucComments
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_strucComments_type0 localINSDSeq_strucComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_strucCommentsTracker = false ;

                           public boolean isINSDSeq_strucCommentsSpecified(){
                               return localINSDSeq_strucCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_strucComments_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_strucComments_type0 getINSDSeq_strucComments(){
                               return localINSDSeq_strucComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_strucComments
                               */
                               public void setINSDSeq_strucComments(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_strucComments_type0 param){
                            localINSDSeq_strucCommentsTracker = param != null;
                                   
                                            this.localINSDSeq_strucComments=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_primary
                        */

                        
                                    protected java.lang.String localINSDSeq_primary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_primaryTracker = false ;

                           public boolean isINSDSeq_primarySpecified(){
                               return localINSDSeq_primaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_primary(){
                               return localINSDSeq_primary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_primary
                               */
                               public void setINSDSeq_primary(java.lang.String param){
                            localINSDSeq_primaryTracker = param != null;
                                   
                                            this.localINSDSeq_primary=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_sourceDb
                        */

                        
                                    protected java.lang.String localINSDSeq_sourceDb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_sourceDbTracker = false ;

                           public boolean isINSDSeq_sourceDbSpecified(){
                               return localINSDSeq_sourceDbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_sourceDb(){
                               return localINSDSeq_sourceDb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_sourceDb
                               */
                               public void setINSDSeq_sourceDb(java.lang.String param){
                            localINSDSeq_sourceDbTracker = param != null;
                                   
                                            this.localINSDSeq_sourceDb=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_databaseReference
                        */

                        
                                    protected java.lang.String localINSDSeq_databaseReference ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_databaseReferenceTracker = false ;

                           public boolean isINSDSeq_databaseReferenceSpecified(){
                               return localINSDSeq_databaseReferenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_databaseReference(){
                               return localINSDSeq_databaseReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_databaseReference
                               */
                               public void setINSDSeq_databaseReference(java.lang.String param){
                            localINSDSeq_databaseReferenceTracker = param != null;
                                   
                                            this.localINSDSeq_databaseReference=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_featureTable
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureTable_type0 localINSDSeq_featureTable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_featureTableTracker = false ;

                           public boolean isINSDSeq_featureTableSpecified(){
                               return localINSDSeq_featureTableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureTable_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureTable_type0 getINSDSeq_featureTable(){
                               return localINSDSeq_featureTable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_featureTable
                               */
                               public void setINSDSeq_featureTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureTable_type0 param){
                            localINSDSeq_featureTableTracker = param != null;
                                   
                                            this.localINSDSeq_featureTable=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_featureSet
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureSet_type0 localINSDSeq_featureSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_featureSetTracker = false ;

                           public boolean isINSDSeq_featureSetSpecified(){
                               return localINSDSeq_featureSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureSet_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureSet_type0 getINSDSeq_featureSet(){
                               return localINSDSeq_featureSet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_featureSet
                               */
                               public void setINSDSeq_featureSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureSet_type0 param){
                            localINSDSeq_featureSetTracker = param != null;
                                   
                                            this.localINSDSeq_featureSet=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_sequence
                        */

                        
                                    protected java.lang.String localINSDSeq_sequence ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_sequenceTracker = false ;

                           public boolean isINSDSeq_sequenceSpecified(){
                               return localINSDSeq_sequenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_sequence(){
                               return localINSDSeq_sequence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_sequence
                               */
                               public void setINSDSeq_sequence(java.lang.String param){
                            localINSDSeq_sequenceTracker = param != null;
                                   
                                            this.localINSDSeq_sequence=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_contig
                        */

                        
                                    protected java.lang.String localINSDSeq_contig ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_contigTracker = false ;

                           public boolean isINSDSeq_contigSpecified(){
                               return localINSDSeq_contigTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getINSDSeq_contig(){
                               return localINSDSeq_contig;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_contig
                               */
                               public void setINSDSeq_contig(java.lang.String param){
                            localINSDSeq_contigTracker = param != null;
                                   
                                            this.localINSDSeq_contig=param;
                                    

                               }
                            

                        /**
                        * field for INSDSeq_altSeq
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_altSeq_type0 localINSDSeq_altSeq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localINSDSeq_altSeqTracker = false ;

                           public boolean isINSDSeq_altSeqSpecified(){
                               return localINSDSeq_altSeqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_altSeq_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_altSeq_type0 getINSDSeq_altSeq(){
                               return localINSDSeq_altSeq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param INSDSeq_altSeq
                               */
                               public void setINSDSeq_altSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_altSeq_type0 param){
                            localINSDSeq_altSeqTracker = param != null;
                                   
                                            this.localINSDSeq_altSeq=param;
                                    

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
                           namespacePrefix+":INSDSeq_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "INSDSeq_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_locus", xmlWriter);
                             

                                          if (localINSDSeq_locus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_locus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_locus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_length", xmlWriter);
                             

                                          if (localINSDSeq_length==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_length cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_length));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localINSDSeq_strandednessTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_strandedness", xmlWriter);
                             

                                          if (localINSDSeq_strandedness==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_strandedness cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_strandedness);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_moltype", xmlWriter);
                             

                                          if (localINSDSeq_moltype==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_moltype cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_moltype);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localINSDSeq_topologyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_topology", xmlWriter);
                             

                                          if (localINSDSeq_topology==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_topology cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_topology);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_division", xmlWriter);
                             

                                          if (localINSDSeq_division==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_division cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_division);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_update-date", xmlWriter);
                             

                                          if (localINSDSeq_updateDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_update-date cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_updateDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localINSDSeq_createDateTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_create-date", xmlWriter);
                             

                                          if (localINSDSeq_createDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_create-date cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_createDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_updateReleaseTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_update-release", xmlWriter);
                             

                                          if (localINSDSeq_updateRelease==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_update-release cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_updateRelease);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_createReleaseTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_create-release", xmlWriter);
                             

                                          if (localINSDSeq_createRelease==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_create-release cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_createRelease);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_definition", xmlWriter);
                             

                                          if (localINSDSeq_definition==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_definition cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_definition);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localINSDSeq_primaryAccessionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_primary-accession", xmlWriter);
                             

                                          if (localINSDSeq_primaryAccession==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_primary-accession cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_primaryAccession);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_entryVersionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_entry-version", xmlWriter);
                             

                                          if (localINSDSeq_entryVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_entry-version cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_entryVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_accessionVersionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_accession-version", xmlWriter);
                             

                                          if (localINSDSeq_accessionVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_accession-version cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_accessionVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_otherSeqidsTracker){
                                            if (localINSDSeq_otherSeqids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_other-seqids cannot be null!!");
                                            }
                                           localINSDSeq_otherSeqids.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_other-seqids"),
                                               xmlWriter);
                                        } if (localINSDSeq_secondaryAccessionsTracker){
                                            if (localINSDSeq_secondaryAccessions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_secondary-accessions cannot be null!!");
                                            }
                                           localINSDSeq_secondaryAccessions.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_secondary-accessions"),
                                               xmlWriter);
                                        } if (localINSDSeq_projectTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_project", xmlWriter);
                             

                                          if (localINSDSeq_project==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_project cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_project);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_keywordsTracker){
                                            if (localINSDSeq_keywords==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_keywords cannot be null!!");
                                            }
                                           localINSDSeq_keywords.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_keywords"),
                                               xmlWriter);
                                        } if (localINSDSeq_segmentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_segment", xmlWriter);
                             

                                          if (localINSDSeq_segment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_segment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_segment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_sourceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_source", xmlWriter);
                             

                                          if (localINSDSeq_source==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_source cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_source);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_organismTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_organism", xmlWriter);
                             

                                          if (localINSDSeq_organism==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_organism cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_organism);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_taxonomyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_taxonomy", xmlWriter);
                             

                                          if (localINSDSeq_taxonomy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_taxonomy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_taxonomy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_referencesTracker){
                                            if (localINSDSeq_references==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_references cannot be null!!");
                                            }
                                           localINSDSeq_references.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_references"),
                                               xmlWriter);
                                        } if (localINSDSeq_commentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_comment", xmlWriter);
                             

                                          if (localINSDSeq_comment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_comment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_commentSetTracker){
                                            if (localINSDSeq_commentSet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_comment-set cannot be null!!");
                                            }
                                           localINSDSeq_commentSet.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_comment-set"),
                                               xmlWriter);
                                        } if (localINSDSeq_strucCommentsTracker){
                                            if (localINSDSeq_strucComments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_struc-comments cannot be null!!");
                                            }
                                           localINSDSeq_strucComments.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_struc-comments"),
                                               xmlWriter);
                                        } if (localINSDSeq_primaryTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_primary", xmlWriter);
                             

                                          if (localINSDSeq_primary==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_primary cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_primary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_sourceDbTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_source-db", xmlWriter);
                             

                                          if (localINSDSeq_sourceDb==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_source-db cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_sourceDb);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_databaseReferenceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_database-reference", xmlWriter);
                             

                                          if (localINSDSeq_databaseReference==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_database-reference cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_databaseReference);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_featureTableTracker){
                                            if (localINSDSeq_featureTable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_feature-table cannot be null!!");
                                            }
                                           localINSDSeq_featureTable.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_feature-table"),
                                               xmlWriter);
                                        } if (localINSDSeq_featureSetTracker){
                                            if (localINSDSeq_featureSet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_feature-set cannot be null!!");
                                            }
                                           localINSDSeq_featureSet.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_feature-set"),
                                               xmlWriter);
                                        } if (localINSDSeq_sequenceTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_sequence", xmlWriter);
                             

                                          if (localINSDSeq_sequence==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_sequence cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_sequence);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_contigTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq";
                                    writeStartElement(null, namespace, "INSDSeq_contig", xmlWriter);
                             

                                          if (localINSDSeq_contig==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("INSDSeq_contig cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localINSDSeq_contig);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localINSDSeq_altSeqTracker){
                                            if (localINSDSeq_altSeq==null){
                                                 throw new org.apache.axis2.databinding.ADBException("INSDSeq_alt-seq cannot be null!!");
                                            }
                                           localINSDSeq_altSeq.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_alt-seq"),
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
                                                                      "INSDSeq_locus"));
                                 
                                        if (localINSDSeq_locus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_locus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_locus cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_length"));
                                 
                                        if (localINSDSeq_length != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_length));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_length cannot be null!!");
                                        }
                                     if (localINSDSeq_strandednessTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_strandedness"));
                                 
                                        if (localINSDSeq_strandedness != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_strandedness));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_strandedness cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_moltype"));
                                 
                                        if (localINSDSeq_moltype != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_moltype));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_moltype cannot be null!!");
                                        }
                                     if (localINSDSeq_topologyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_topology"));
                                 
                                        if (localINSDSeq_topology != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_topology));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_topology cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_division"));
                                 
                                        if (localINSDSeq_division != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_division));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_division cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_update-date"));
                                 
                                        if (localINSDSeq_updateDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_updateDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_update-date cannot be null!!");
                                        }
                                     if (localINSDSeq_createDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_create-date"));
                                 
                                        if (localINSDSeq_createDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_createDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_create-date cannot be null!!");
                                        }
                                    } if (localINSDSeq_updateReleaseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_update-release"));
                                 
                                        if (localINSDSeq_updateRelease != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_updateRelease));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_update-release cannot be null!!");
                                        }
                                    } if (localINSDSeq_createReleaseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_create-release"));
                                 
                                        if (localINSDSeq_createRelease != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_createRelease));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_create-release cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_definition"));
                                 
                                        if (localINSDSeq_definition != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_definition));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_definition cannot be null!!");
                                        }
                                     if (localINSDSeq_primaryAccessionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_primary-accession"));
                                 
                                        if (localINSDSeq_primaryAccession != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_primaryAccession));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_primary-accession cannot be null!!");
                                        }
                                    } if (localINSDSeq_entryVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_entry-version"));
                                 
                                        if (localINSDSeq_entryVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_entryVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_entry-version cannot be null!!");
                                        }
                                    } if (localINSDSeq_accessionVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_accession-version"));
                                 
                                        if (localINSDSeq_accessionVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_accessionVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_accession-version cannot be null!!");
                                        }
                                    } if (localINSDSeq_otherSeqidsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_other-seqids"));
                            
                            
                                    if (localINSDSeq_otherSeqids==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_other-seqids cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_otherSeqids);
                                } if (localINSDSeq_secondaryAccessionsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_secondary-accessions"));
                            
                            
                                    if (localINSDSeq_secondaryAccessions==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_secondary-accessions cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_secondaryAccessions);
                                } if (localINSDSeq_projectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_project"));
                                 
                                        if (localINSDSeq_project != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_project));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_project cannot be null!!");
                                        }
                                    } if (localINSDSeq_keywordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_keywords"));
                            
                            
                                    if (localINSDSeq_keywords==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_keywords cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_keywords);
                                } if (localINSDSeq_segmentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_segment"));
                                 
                                        if (localINSDSeq_segment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_segment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_segment cannot be null!!");
                                        }
                                    } if (localINSDSeq_sourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_source"));
                                 
                                        if (localINSDSeq_source != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_source));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_source cannot be null!!");
                                        }
                                    } if (localINSDSeq_organismTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_organism"));
                                 
                                        if (localINSDSeq_organism != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_organism));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_organism cannot be null!!");
                                        }
                                    } if (localINSDSeq_taxonomyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_taxonomy"));
                                 
                                        if (localINSDSeq_taxonomy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_taxonomy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_taxonomy cannot be null!!");
                                        }
                                    } if (localINSDSeq_referencesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_references"));
                            
                            
                                    if (localINSDSeq_references==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_references cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_references);
                                } if (localINSDSeq_commentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_comment"));
                                 
                                        if (localINSDSeq_comment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_comment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_comment cannot be null!!");
                                        }
                                    } if (localINSDSeq_commentSetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_comment-set"));
                            
                            
                                    if (localINSDSeq_commentSet==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_comment-set cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_commentSet);
                                } if (localINSDSeq_strucCommentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_struc-comments"));
                            
                            
                                    if (localINSDSeq_strucComments==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_struc-comments cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_strucComments);
                                } if (localINSDSeq_primaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_primary"));
                                 
                                        if (localINSDSeq_primary != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_primary));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_primary cannot be null!!");
                                        }
                                    } if (localINSDSeq_sourceDbTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_source-db"));
                                 
                                        if (localINSDSeq_sourceDb != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_sourceDb));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_source-db cannot be null!!");
                                        }
                                    } if (localINSDSeq_databaseReferenceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_database-reference"));
                                 
                                        if (localINSDSeq_databaseReference != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_databaseReference));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_database-reference cannot be null!!");
                                        }
                                    } if (localINSDSeq_featureTableTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_feature-table"));
                            
                            
                                    if (localINSDSeq_featureTable==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_feature-table cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_featureTable);
                                } if (localINSDSeq_featureSetTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_feature-set"));
                            
                            
                                    if (localINSDSeq_featureSet==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_feature-set cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_featureSet);
                                } if (localINSDSeq_sequenceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_sequence"));
                                 
                                        if (localINSDSeq_sequence != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_sequence));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_sequence cannot be null!!");
                                        }
                                    } if (localINSDSeq_contigTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_contig"));
                                 
                                        if (localINSDSeq_contig != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localINSDSeq_contig));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("INSDSeq_contig cannot be null!!");
                                        }
                                    } if (localINSDSeq_altSeqTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq",
                                                                      "INSDSeq_alt-seq"));
                            
                            
                                    if (localINSDSeq_altSeq==null){
                                         throw new org.apache.axis2.databinding.ADBException("INSDSeq_alt-seq cannot be null!!");
                                    }
                                    elementList.add(localINSDSeq_altSeq);
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
        public static INSDSeq_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            INSDSeq_type0 object =
                new INSDSeq_type0();

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
                    
                            if (!"INSDSeq_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (INSDSeq_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_locus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_locus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_locus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_length").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_length" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_length(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_strandedness").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_strandedness" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_strandedness(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_moltype").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_moltype" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_moltype(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_topology").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_topology" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_topology(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_division").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_division" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_division(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_update-date").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_update-date" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_updateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_create-date").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_create-date" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_createDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_update-release").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_update-release" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_updateRelease(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_create-release").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_create-release" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_createRelease(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_definition").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_definition" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_definition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_primary-accession").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_primary-accession" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_primaryAccession(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_entry-version").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_entry-version" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_entryVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_accession-version").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_accession-version" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_accessionVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_other-seqids").equals(reader.getName())){
                                
                                                object.setINSDSeq_otherSeqids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_otherSeqids_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_secondary-accessions").equals(reader.getName())){
                                
                                                object.setINSDSeq_secondaryAccessions(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_secondaryAccessions_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_project").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_project" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_project(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_keywords").equals(reader.getName())){
                                
                                                object.setINSDSeq_keywords(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_keywords_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_segment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_segment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_segment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_source").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_source" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_source(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_organism").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_organism" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_organism(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_taxonomy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_taxonomy" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_taxonomy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_references").equals(reader.getName())){
                                
                                                object.setINSDSeq_references(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_references_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_comment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_comment-set").equals(reader.getName())){
                                
                                                object.setINSDSeq_commentSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_commentSet_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_struc-comments").equals(reader.getName())){
                                
                                                object.setINSDSeq_strucComments(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_strucComments_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_primary").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_primary" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_primary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_source-db").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_source-db" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_sourceDb(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_database-reference").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_database-reference" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_databaseReference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_feature-table").equals(reader.getName())){
                                
                                                object.setINSDSeq_featureTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureTable_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_feature-set").equals(reader.getName())){
                                
                                                object.setINSDSeq_featureSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_featureSet_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_sequence").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_sequence" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_sequence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_contig").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"INSDSeq_contig" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setINSDSeq_contig(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_seq","INSDSeq_alt-seq").equals(reader.getName())){
                                
                                                object.setINSDSeq_altSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.INSDSeq_altSeq_type0.Factory.parse(reader));
                                              
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
           
    