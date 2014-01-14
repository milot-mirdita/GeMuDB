
/**
 * Imprint_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  Imprint_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Imprint_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Imprint_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Imprint_date
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_date_type0 localImprint_date ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_date_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_date_type0 getImprint_date(){
                               return localImprint_date;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_date
                               */
                               public void setImprint_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_date_type0 param){
                            
                                            this.localImprint_date=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_volume
                        */

                        
                                    protected java.lang.String localImprint_volume ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_volumeTracker = false ;

                           public boolean isImprint_volumeSpecified(){
                               return localImprint_volumeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_volume(){
                               return localImprint_volume;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_volume
                               */
                               public void setImprint_volume(java.lang.String param){
                            localImprint_volumeTracker = param != null;
                                   
                                            this.localImprint_volume=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_issue
                        */

                        
                                    protected java.lang.String localImprint_issue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_issueTracker = false ;

                           public boolean isImprint_issueSpecified(){
                               return localImprint_issueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_issue(){
                               return localImprint_issue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_issue
                               */
                               public void setImprint_issue(java.lang.String param){
                            localImprint_issueTracker = param != null;
                                   
                                            this.localImprint_issue=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_pages
                        */

                        
                                    protected java.lang.String localImprint_pages ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_pagesTracker = false ;

                           public boolean isImprint_pagesSpecified(){
                               return localImprint_pagesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_pages(){
                               return localImprint_pages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_pages
                               */
                               public void setImprint_pages(java.lang.String param){
                            localImprint_pagesTracker = param != null;
                                   
                                            this.localImprint_pages=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_section
                        */

                        
                                    protected java.lang.String localImprint_section ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_sectionTracker = false ;

                           public boolean isImprint_sectionSpecified(){
                               return localImprint_sectionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_section(){
                               return localImprint_section;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_section
                               */
                               public void setImprint_section(java.lang.String param){
                            localImprint_sectionTracker = param != null;
                                   
                                            this.localImprint_section=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_pub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pub_type0 localImprint_pub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_pubTracker = false ;

                           public boolean isImprint_pubSpecified(){
                               return localImprint_pubTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pub_type0 getImprint_pub(){
                               return localImprint_pub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_pub
                               */
                               public void setImprint_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pub_type0 param){
                            localImprint_pubTracker = param != null;
                                   
                                            this.localImprint_pub=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_cprt
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_cprt_type0 localImprint_cprt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_cprtTracker = false ;

                           public boolean isImprint_cprtSpecified(){
                               return localImprint_cprtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_cprt_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_cprt_type0 getImprint_cprt(){
                               return localImprint_cprt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_cprt
                               */
                               public void setImprint_cprt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_cprt_type0 param){
                            localImprint_cprtTracker = param != null;
                                   
                                            this.localImprint_cprt=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_partSup
                        */

                        
                                    protected java.lang.String localImprint_partSup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_partSupTracker = false ;

                           public boolean isImprint_partSupSpecified(){
                               return localImprint_partSupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_partSup(){
                               return localImprint_partSup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_partSup
                               */
                               public void setImprint_partSup(java.lang.String param){
                            localImprint_partSupTracker = param != null;
                                   
                                            this.localImprint_partSup=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_language
                        */

                        
                                    protected java.lang.String localImprint_language =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ENG");
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_language(){
                               return localImprint_language;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_language
                               */
                               public void setImprint_language(java.lang.String param){
                            
                                            this.localImprint_language=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_prepub
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_prepub_type0 localImprint_prepub ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_prepubTracker = false ;

                           public boolean isImprint_prepubSpecified(){
                               return localImprint_prepubTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_prepub_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_prepub_type0 getImprint_prepub(){
                               return localImprint_prepub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_prepub
                               */
                               public void setImprint_prepub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_prepub_type0 param){
                            localImprint_prepubTracker = param != null;
                                   
                                            this.localImprint_prepub=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_partSupi
                        */

                        
                                    protected java.lang.String localImprint_partSupi ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_partSupiTracker = false ;

                           public boolean isImprint_partSupiSpecified(){
                               return localImprint_partSupiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImprint_partSupi(){
                               return localImprint_partSupi;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_partSupi
                               */
                               public void setImprint_partSupi(java.lang.String param){
                            localImprint_partSupiTracker = param != null;
                                   
                                            this.localImprint_partSupi=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_retract
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_retract_type0 localImprint_retract ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_retractTracker = false ;

                           public boolean isImprint_retractSpecified(){
                               return localImprint_retractTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_retract_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_retract_type0 getImprint_retract(){
                               return localImprint_retract;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_retract
                               */
                               public void setImprint_retract(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_retract_type0 param){
                            localImprint_retractTracker = param != null;
                                   
                                            this.localImprint_retract=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_pubstatus
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pubstatus_type0 localImprint_pubstatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_pubstatusTracker = false ;

                           public boolean isImprint_pubstatusSpecified(){
                               return localImprint_pubstatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pubstatus_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pubstatus_type0 getImprint_pubstatus(){
                               return localImprint_pubstatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_pubstatus
                               */
                               public void setImprint_pubstatus(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pubstatus_type0 param){
                            localImprint_pubstatusTracker = param != null;
                                   
                                            this.localImprint_pubstatus=param;
                                    

                               }
                            

                        /**
                        * field for Imprint_history
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_history_type0 localImprint_history ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImprint_historyTracker = false ;

                           public boolean isImprint_historySpecified(){
                               return localImprint_historyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_history_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_history_type0 getImprint_history(){
                               return localImprint_history;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Imprint_history
                               */
                               public void setImprint_history(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_history_type0 param){
                            localImprint_historyTracker = param != null;
                                   
                                            this.localImprint_history=param;
                                    

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
                           namespacePrefix+":Imprint_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Imprint_type0",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localImprint_date==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_date cannot be null!!");
                                            }
                                           localImprint_date.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_date"),
                                               xmlWriter);
                                         if (localImprint_volumeTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_volume", xmlWriter);
                             

                                          if (localImprint_volume==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_volume cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_volume);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImprint_issueTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_issue", xmlWriter);
                             

                                          if (localImprint_issue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_issue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_issue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImprint_pagesTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_pages", xmlWriter);
                             

                                          if (localImprint_pages==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_pages cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_pages);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImprint_sectionTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_section", xmlWriter);
                             

                                          if (localImprint_section==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_section cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_section);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImprint_pubTracker){
                                            if (localImprint_pub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_pub cannot be null!!");
                                            }
                                           localImprint_pub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_pub"),
                                               xmlWriter);
                                        } if (localImprint_cprtTracker){
                                            if (localImprint_cprt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_cprt cannot be null!!");
                                            }
                                           localImprint_cprt.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_cprt"),
                                               xmlWriter);
                                        } if (localImprint_partSupTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_part-sup", xmlWriter);
                             

                                          if (localImprint_partSup==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_part-sup cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_partSup);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_language", xmlWriter);
                             

                                          if (localImprint_language==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_language cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_language);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localImprint_prepubTracker){
                                            if (localImprint_prepub==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_prepub cannot be null!!");
                                            }
                                           localImprint_prepub.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_prepub"),
                                               xmlWriter);
                                        } if (localImprint_partSupiTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Imprint_part-supi", xmlWriter);
                             

                                          if (localImprint_partSupi==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Imprint_part-supi cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImprint_partSupi);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localImprint_retractTracker){
                                            if (localImprint_retract==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_retract cannot be null!!");
                                            }
                                           localImprint_retract.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_retract"),
                                               xmlWriter);
                                        } if (localImprint_pubstatusTracker){
                                            if (localImprint_pubstatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_pubstatus cannot be null!!");
                                            }
                                           localImprint_pubstatus.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_pubstatus"),
                                               xmlWriter);
                                        } if (localImprint_historyTracker){
                                            if (localImprint_history==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Imprint_history cannot be null!!");
                                            }
                                           localImprint_history.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_history"),
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
                                                                      "Imprint_date"));
                            
                            
                                    if (localImprint_date==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_date cannot be null!!");
                                    }
                                    elementList.add(localImprint_date);
                                 if (localImprint_volumeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_volume"));
                                 
                                        if (localImprint_volume != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_volume));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_volume cannot be null!!");
                                        }
                                    } if (localImprint_issueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_issue"));
                                 
                                        if (localImprint_issue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_issue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_issue cannot be null!!");
                                        }
                                    } if (localImprint_pagesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_pages"));
                                 
                                        if (localImprint_pages != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_pages));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_pages cannot be null!!");
                                        }
                                    } if (localImprint_sectionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_section"));
                                 
                                        if (localImprint_section != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_section));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_section cannot be null!!");
                                        }
                                    } if (localImprint_pubTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_pub"));
                            
                            
                                    if (localImprint_pub==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_pub cannot be null!!");
                                    }
                                    elementList.add(localImprint_pub);
                                } if (localImprint_cprtTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_cprt"));
                            
                            
                                    if (localImprint_cprt==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_cprt cannot be null!!");
                                    }
                                    elementList.add(localImprint_cprt);
                                } if (localImprint_partSupTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_part-sup"));
                                 
                                        if (localImprint_partSup != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_partSup));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_part-sup cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_language"));
                                 
                                        if (localImprint_language != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_language));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_language cannot be null!!");
                                        }
                                     if (localImprint_prepubTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_prepub"));
                            
                            
                                    if (localImprint_prepub==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_prepub cannot be null!!");
                                    }
                                    elementList.add(localImprint_prepub);
                                } if (localImprint_partSupiTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_part-supi"));
                                 
                                        if (localImprint_partSupi != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImprint_partSupi));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Imprint_part-supi cannot be null!!");
                                        }
                                    } if (localImprint_retractTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_retract"));
                            
                            
                                    if (localImprint_retract==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_retract cannot be null!!");
                                    }
                                    elementList.add(localImprint_retract);
                                } if (localImprint_pubstatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_pubstatus"));
                            
                            
                                    if (localImprint_pubstatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_pubstatus cannot be null!!");
                                    }
                                    elementList.add(localImprint_pubstatus);
                                } if (localImprint_historyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Imprint_history"));
                            
                            
                                    if (localImprint_history==null){
                                         throw new org.apache.axis2.databinding.ADBException("Imprint_history cannot be null!!");
                                    }
                                    elementList.add(localImprint_history);
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
        public static Imprint_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Imprint_type0 object =
                new Imprint_type0();

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
                    
                            if (!"Imprint_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Imprint_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_date").equals(reader.getName())){
                                
                                                object.setImprint_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_date_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_volume").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_volume" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_volume(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_issue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_issue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_issue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_pages").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_pages" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_pages(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_section").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_section" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_section(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_pub").equals(reader.getName())){
                                
                                                object.setImprint_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_cprt").equals(reader.getName())){
                                
                                                object.setImprint_cprt(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_cprt_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_part-sup").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_part-sup" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_partSup(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_language").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_language" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_language(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_prepub").equals(reader.getName())){
                                
                                                object.setImprint_prepub(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_prepub_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_part-supi").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Imprint_part-supi" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImprint_partSupi(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_retract").equals(reader.getName())){
                                
                                                object.setImprint_retract(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_retract_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_pubstatus").equals(reader.getName())){
                                
                                                object.setImprint_pubstatus(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_pubstatus_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Imprint_history").equals(reader.getName())){
                                
                                                object.setImprint_history(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Imprint_history_type0.Factory.parse(reader));
                                              
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
           
    