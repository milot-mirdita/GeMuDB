
/**
 * Pub_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Pub_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Pub_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Pub_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localPub_genTracker = false;
                
                   localPub_subTracker = false;
                
                   localPub_medlineTracker = false;
                
                   localPub_muidTracker = false;
                
                   localPub_articleTracker = false;
                
                   localPub_journalTracker = false;
                
                   localPub_bookTracker = false;
                
                   localPub_procTracker = false;
                
                   localPub_patentTracker = false;
                
                   localPub_patIdTracker = false;
                
                   localPub_manTracker = false;
                
                   localPub_equivTracker = false;
                
                   localPub_pmidTracker = false;
                
            }
        

                        /**
                        * field for Pub_gen
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_gen_type0 localPub_gen ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_genTracker = false ;

                           public boolean isPub_genSpecified(){
                               return localPub_genTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_gen_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_gen_type0 getPub_gen(){
                               return localPub_gen;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_gen
                               */
                               public void setPub_gen(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_gen_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_genTracker = param != null;
                                   
                                            this.localPub_gen=param;
                                    

                               }
                            

                        /**
                        * field for Pub_sub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_sub_type0 localPub_sub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_subTracker = false ;

                           public boolean isPub_subSpecified(){
                               return localPub_subTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_sub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_sub_type0 getPub_sub(){
                               return localPub_sub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_sub
                               */
                               public void setPub_sub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_sub_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_subTracker = param != null;
                                   
                                            this.localPub_sub=param;
                                    

                               }
                            

                        /**
                        * field for Pub_medline
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_medline_type0 localPub_medline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_medlineTracker = false ;

                           public boolean isPub_medlineSpecified(){
                               return localPub_medlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_medline_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_medline_type0 getPub_medline(){
                               return localPub_medline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_medline
                               */
                               public void setPub_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_medline_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_medlineTracker = param != null;
                                   
                                            this.localPub_medline=param;
                                    

                               }
                            

                        /**
                        * field for Pub_muid
                        */

                        
                                    protected java.math.BigInteger localPub_muid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_muidTracker = false ;

                           public boolean isPub_muidSpecified(){
                               return localPub_muidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getPub_muid(){
                               return localPub_muid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_muid
                               */
                               public void setPub_muid(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localPub_muidTracker = param != null;
                                   
                                            this.localPub_muid=param;
                                    

                               }
                            

                        /**
                        * field for Pub_article
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_article_type0 localPub_article ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_articleTracker = false ;

                           public boolean isPub_articleSpecified(){
                               return localPub_articleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_article_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_article_type0 getPub_article(){
                               return localPub_article;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_article
                               */
                               public void setPub_article(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_article_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_articleTracker = param != null;
                                   
                                            this.localPub_article=param;
                                    

                               }
                            

                        /**
                        * field for Pub_journal
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_journal_type0 localPub_journal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_journalTracker = false ;

                           public boolean isPub_journalSpecified(){
                               return localPub_journalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_journal_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_journal_type0 getPub_journal(){
                               return localPub_journal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_journal
                               */
                               public void setPub_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_journal_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_journalTracker = param != null;
                                   
                                            this.localPub_journal=param;
                                    

                               }
                            

                        /**
                        * field for Pub_book
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_book_type0 localPub_book ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_bookTracker = false ;

                           public boolean isPub_bookSpecified(){
                               return localPub_bookTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_book_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_book_type0 getPub_book(){
                               return localPub_book;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_book
                               */
                               public void setPub_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_book_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_bookTracker = param != null;
                                   
                                            this.localPub_book=param;
                                    

                               }
                            

                        /**
                        * field for Pub_proc
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_proc_type0 localPub_proc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_procTracker = false ;

                           public boolean isPub_procSpecified(){
                               return localPub_procTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_proc_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_proc_type0 getPub_proc(){
                               return localPub_proc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_proc
                               */
                               public void setPub_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_proc_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_procTracker = param != null;
                                   
                                            this.localPub_proc=param;
                                    

                               }
                            

                        /**
                        * field for Pub_patent
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patent_type0 localPub_patent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_patentTracker = false ;

                           public boolean isPub_patentSpecified(){
                               return localPub_patentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patent_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patent_type0 getPub_patent(){
                               return localPub_patent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_patent
                               */
                               public void setPub_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patent_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_patentTracker = param != null;
                                   
                                            this.localPub_patent=param;
                                    

                               }
                            

                        /**
                        * field for Pub_patId
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patId_type0 localPub_patId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_patIdTracker = false ;

                           public boolean isPub_patIdSpecified(){
                               return localPub_patIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patId_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patId_type0 getPub_patId(){
                               return localPub_patId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_patId
                               */
                               public void setPub_patId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patId_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_patIdTracker = param != null;
                                   
                                            this.localPub_patId=param;
                                    

                               }
                            

                        /**
                        * field for Pub_man
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_man_type0 localPub_man ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_manTracker = false ;

                           public boolean isPub_manSpecified(){
                               return localPub_manTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_man_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_man_type0 getPub_man(){
                               return localPub_man;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_man
                               */
                               public void setPub_man(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_man_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_manTracker = param != null;
                                   
                                            this.localPub_man=param;
                                    

                               }
                            

                        /**
                        * field for Pub_equiv
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_equiv_type0 localPub_equiv ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_equivTracker = false ;

                           public boolean isPub_equivSpecified(){
                               return localPub_equivTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_equiv_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_equiv_type0 getPub_equiv(){
                               return localPub_equiv;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_equiv
                               */
                               public void setPub_equiv(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_equiv_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_equivTracker = param != null;
                                   
                                            this.localPub_equiv=param;
                                    

                               }
                            

                        /**
                        * field for Pub_pmid
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_pmid_type0 localPub_pmid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPub_pmidTracker = false ;

                           public boolean isPub_pmidSpecified(){
                               return localPub_pmidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_pmid_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_pmid_type0 getPub_pmid(){
                               return localPub_pmid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pub_pmid
                               */
                               public void setPub_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_pmid_type0 param){
                            
                                clearAllSettingTrackers();
                            localPub_pmidTracker = param != null;
                                   
                                            this.localPub_pmid=param;
                                    

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
                           namespacePrefix+":Pub_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Pub_type0",
                           xmlWriter);
                   }

               
                   }
                if (localPub_genTracker){
                                            if (localPub_gen==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_gen cannot be null!!");
                                            }
                                           localPub_gen.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_gen"),
                                               xmlWriter);
                                        } if (localPub_subTracker){
                                            if (localPub_sub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_sub cannot be null!!");
                                            }
                                           localPub_sub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_sub"),
                                               xmlWriter);
                                        } if (localPub_medlineTracker){
                                            if (localPub_medline==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_medline cannot be null!!");
                                            }
                                           localPub_medline.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_medline"),
                                               xmlWriter);
                                        } if (localPub_muidTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Pub_muid", xmlWriter);
                             

                                          if (localPub_muid==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Pub_muid cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPub_muid));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPub_articleTracker){
                                            if (localPub_article==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_article cannot be null!!");
                                            }
                                           localPub_article.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_article"),
                                               xmlWriter);
                                        } if (localPub_journalTracker){
                                            if (localPub_journal==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_journal cannot be null!!");
                                            }
                                           localPub_journal.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_journal"),
                                               xmlWriter);
                                        } if (localPub_bookTracker){
                                            if (localPub_book==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_book cannot be null!!");
                                            }
                                           localPub_book.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_book"),
                                               xmlWriter);
                                        } if (localPub_procTracker){
                                            if (localPub_proc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_proc cannot be null!!");
                                            }
                                           localPub_proc.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_proc"),
                                               xmlWriter);
                                        } if (localPub_patentTracker){
                                            if (localPub_patent==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_patent cannot be null!!");
                                            }
                                           localPub_patent.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_patent"),
                                               xmlWriter);
                                        } if (localPub_patIdTracker){
                                            if (localPub_patId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_pat-id cannot be null!!");
                                            }
                                           localPub_patId.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_pat-id"),
                                               xmlWriter);
                                        } if (localPub_manTracker){
                                            if (localPub_man==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_man cannot be null!!");
                                            }
                                           localPub_man.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_man"),
                                               xmlWriter);
                                        } if (localPub_equivTracker){
                                            if (localPub_equiv==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_equiv cannot be null!!");
                                            }
                                           localPub_equiv.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_equiv"),
                                               xmlWriter);
                                        } if (localPub_pmidTracker){
                                            if (localPub_pmid==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Pub_pmid cannot be null!!");
                                            }
                                           localPub_pmid.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_pmid"),
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

                 if (localPub_genTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_gen"));
                            
                            
                                    if (localPub_gen==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_gen cannot be null!!");
                                    }
                                    elementList.add(localPub_gen);
                                } if (localPub_subTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_sub"));
                            
                            
                                    if (localPub_sub==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_sub cannot be null!!");
                                    }
                                    elementList.add(localPub_sub);
                                } if (localPub_medlineTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_medline"));
                            
                            
                                    if (localPub_medline==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_medline cannot be null!!");
                                    }
                                    elementList.add(localPub_medline);
                                } if (localPub_muidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_muid"));
                                 
                                        if (localPub_muid != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPub_muid));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Pub_muid cannot be null!!");
                                        }
                                    } if (localPub_articleTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_article"));
                            
                            
                                    if (localPub_article==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_article cannot be null!!");
                                    }
                                    elementList.add(localPub_article);
                                } if (localPub_journalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_journal"));
                            
                            
                                    if (localPub_journal==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_journal cannot be null!!");
                                    }
                                    elementList.add(localPub_journal);
                                } if (localPub_bookTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_book"));
                            
                            
                                    if (localPub_book==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_book cannot be null!!");
                                    }
                                    elementList.add(localPub_book);
                                } if (localPub_procTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_proc"));
                            
                            
                                    if (localPub_proc==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_proc cannot be null!!");
                                    }
                                    elementList.add(localPub_proc);
                                } if (localPub_patentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_patent"));
                            
                            
                                    if (localPub_patent==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_patent cannot be null!!");
                                    }
                                    elementList.add(localPub_patent);
                                } if (localPub_patIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_pat-id"));
                            
                            
                                    if (localPub_patId==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_pat-id cannot be null!!");
                                    }
                                    elementList.add(localPub_patId);
                                } if (localPub_manTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_man"));
                            
                            
                                    if (localPub_man==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_man cannot be null!!");
                                    }
                                    elementList.add(localPub_man);
                                } if (localPub_equivTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_equiv"));
                            
                            
                                    if (localPub_equiv==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_equiv cannot be null!!");
                                    }
                                    elementList.add(localPub_equiv);
                                } if (localPub_pmidTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Pub_pmid"));
                            
                            
                                    if (localPub_pmid==null){
                                         throw new org.apache.axis2.databinding.ADBException("Pub_pmid cannot be null!!");
                                    }
                                    elementList.add(localPub_pmid);
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
        public static Pub_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Pub_type0 object =
                new Pub_type0();

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
                    
                            if (!"Pub_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Pub_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_gen").equals(reader.getName())){
                                
                                                object.setPub_gen(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_gen_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_sub").equals(reader.getName())){
                                
                                                object.setPub_sub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_sub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_medline").equals(reader.getName())){
                                
                                                object.setPub_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_medline_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_muid").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Pub_muid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPub_muid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_article").equals(reader.getName())){
                                
                                                object.setPub_article(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_article_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_journal").equals(reader.getName())){
                                
                                                object.setPub_journal(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_journal_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_book").equals(reader.getName())){
                                
                                                object.setPub_book(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_book_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_proc").equals(reader.getName())){
                                
                                                object.setPub_proc(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_proc_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_patent").equals(reader.getName())){
                                
                                                object.setPub_patent(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patent_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_pat-id").equals(reader.getName())){
                                
                                                object.setPub_patId(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_patId_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_man").equals(reader.getName())){
                                
                                                object.setPub_man(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_man_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_equiv").equals(reader.getName())){
                                
                                                object.setPub_equiv(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_equiv_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Pub_pmid").equals(reader.getName())){
                                
                                                object.setPub_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Pub_pmid_type0.Factory.parse(reader));
                                              
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
           
    