
/**
 * ESearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.esearch;
            

            /**
            *  ESearchRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ESearchRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                "eSearchRequest",
                "ns3");

            

                        /**
                        * field for Db
                        */

                        
                                    protected java.lang.String localDb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDbTracker = false ;

                           public boolean isDbSpecified(){
                               return localDbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDb(){
                               return localDb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Db
                               */
                               public void setDb(java.lang.String param){
                            localDbTracker = param != null;
                                   
                                            this.localDb=param;
                                    

                               }
                            

                        /**
                        * field for Term
                        */

                        
                                    protected java.lang.String localTerm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTermTracker = false ;

                           public boolean isTermSpecified(){
                               return localTermTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTerm(){
                               return localTerm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Term
                               */
                               public void setTerm(java.lang.String param){
                            localTermTracker = param != null;
                                   
                                            this.localTerm=param;
                                    

                               }
                            

                        /**
                        * field for WebEnv
                        */

                        
                                    protected java.lang.String localWebEnv ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWebEnvTracker = false ;

                           public boolean isWebEnvSpecified(){
                               return localWebEnvTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWebEnv(){
                               return localWebEnv;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WebEnv
                               */
                               public void setWebEnv(java.lang.String param){
                            localWebEnvTracker = param != null;
                                   
                                            this.localWebEnv=param;
                                    

                               }
                            

                        /**
                        * field for QueryKey
                        */

                        
                                    protected java.lang.String localQueryKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryKeyTracker = false ;

                           public boolean isQueryKeySpecified(){
                               return localQueryKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQueryKey(){
                               return localQueryKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryKey
                               */
                               public void setQueryKey(java.lang.String param){
                            localQueryKeyTracker = param != null;
                                   
                                            this.localQueryKey=param;
                                    

                               }
                            

                        /**
                        * field for Usehistory
                        */

                        
                                    protected java.lang.String localUsehistory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsehistoryTracker = false ;

                           public boolean isUsehistorySpecified(){
                               return localUsehistoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsehistory(){
                               return localUsehistory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Usehistory
                               */
                               public void setUsehistory(java.lang.String param){
                            localUsehistoryTracker = param != null;
                                   
                                            this.localUsehistory=param;
                                    

                               }
                            

                        /**
                        * field for Tool
                        */

                        
                                    protected java.lang.String localTool ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToolTracker = false ;

                           public boolean isToolSpecified(){
                               return localToolTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTool(){
                               return localTool;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tool
                               */
                               public void setTool(java.lang.String param){
                            localToolTracker = param != null;
                                   
                                            this.localTool=param;
                                    

                               }
                            

                        /**
                        * field for Email
                        */

                        
                                    protected java.lang.String localEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailTracker = false ;

                           public boolean isEmailSpecified(){
                               return localEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmail(){
                               return localEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Email
                               */
                               public void setEmail(java.lang.String param){
                            localEmailTracker = param != null;
                                   
                                            this.localEmail=param;
                                    

                               }
                            

                        /**
                        * field for Field
                        */

                        
                                    protected java.lang.String localField ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFieldTracker = false ;

                           public boolean isFieldSpecified(){
                               return localFieldTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getField(){
                               return localField;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Field
                               */
                               public void setField(java.lang.String param){
                            localFieldTracker = param != null;
                                   
                                            this.localField=param;
                                    

                               }
                            

                        /**
                        * field for Reldate
                        */

                        
                                    protected java.lang.String localReldate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReldateTracker = false ;

                           public boolean isReldateSpecified(){
                               return localReldateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReldate(){
                               return localReldate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reldate
                               */
                               public void setReldate(java.lang.String param){
                            localReldateTracker = param != null;
                                   
                                            this.localReldate=param;
                                    

                               }
                            

                        /**
                        * field for Mindate
                        */

                        
                                    protected java.lang.String localMindate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMindateTracker = false ;

                           public boolean isMindateSpecified(){
                               return localMindateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMindate(){
                               return localMindate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mindate
                               */
                               public void setMindate(java.lang.String param){
                            localMindateTracker = param != null;
                                   
                                            this.localMindate=param;
                                    

                               }
                            

                        /**
                        * field for Maxdate
                        */

                        
                                    protected java.lang.String localMaxdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxdateTracker = false ;

                           public boolean isMaxdateSpecified(){
                               return localMaxdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMaxdate(){
                               return localMaxdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Maxdate
                               */
                               public void setMaxdate(java.lang.String param){
                            localMaxdateTracker = param != null;
                                   
                                            this.localMaxdate=param;
                                    

                               }
                            

                        /**
                        * field for Datetype
                        */

                        
                                    protected java.lang.String localDatetype ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDatetypeTracker = false ;

                           public boolean isDatetypeSpecified(){
                               return localDatetypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDatetype(){
                               return localDatetype;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Datetype
                               */
                               public void setDatetype(java.lang.String param){
                            localDatetypeTracker = param != null;
                                   
                                            this.localDatetype=param;
                                    

                               }
                            

                        /**
                        * field for RetStart
                        */

                        
                                    protected java.lang.String localRetStart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRetStartTracker = false ;

                           public boolean isRetStartSpecified(){
                               return localRetStartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRetStart(){
                               return localRetStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetStart
                               */
                               public void setRetStart(java.lang.String param){
                            localRetStartTracker = param != null;
                                   
                                            this.localRetStart=param;
                                    

                               }
                            

                        /**
                        * field for RetMax
                        */

                        
                                    protected java.lang.String localRetMax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRetMaxTracker = false ;

                           public boolean isRetMaxSpecified(){
                               return localRetMaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRetMax(){
                               return localRetMax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetMax
                               */
                               public void setRetMax(java.lang.String param){
                            localRetMaxTracker = param != null;
                                   
                                            this.localRetMax=param;
                                    

                               }
                            

                        /**
                        * field for Rettype
                        */

                        
                                    protected java.lang.String localRettype ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRettypeTracker = false ;

                           public boolean isRettypeSpecified(){
                               return localRettypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRettype(){
                               return localRettype;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rettype
                               */
                               public void setRettype(java.lang.String param){
                            localRettypeTracker = param != null;
                                   
                                            this.localRettype=param;
                                    

                               }
                            

                        /**
                        * field for Sort
                        */

                        
                                    protected java.lang.String localSort ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSortTracker = false ;

                           public boolean isSortSpecified(){
                               return localSortTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSort(){
                               return localSort;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sort
                               */
                               public void setSort(java.lang.String param){
                            localSortTracker = param != null;
                                   
                                            this.localSort=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/esearch");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":eSearchRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "eSearchRequest",
                           xmlWriter);
                   }

               
                   }
                if (localDbTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "db", xmlWriter);
                             

                                          if (localDb==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("db cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDb);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTermTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "term", xmlWriter);
                             

                                          if (localTerm==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("term cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTerm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWebEnvTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "WebEnv", xmlWriter);
                             

                                          if (localWebEnv==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WebEnv cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWebEnv);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryKeyTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "QueryKey", xmlWriter);
                             

                                          if (localQueryKey==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("QueryKey cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQueryKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsehistoryTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "usehistory", xmlWriter);
                             

                                          if (localUsehistory==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("usehistory cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsehistory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToolTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "tool", xmlWriter);
                             

                                          if (localTool==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("tool cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTool);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "email", xmlWriter);
                             

                                          if (localEmail==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFieldTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "field", xmlWriter);
                             

                                          if (localField==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("field cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localField);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReldateTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "reldate", xmlWriter);
                             

                                          if (localReldate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("reldate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReldate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMindateTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "mindate", xmlWriter);
                             

                                          if (localMindate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("mindate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMindate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxdateTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "maxdate", xmlWriter);
                             

                                          if (localMaxdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("maxdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMaxdate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDatetypeTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "datetype", xmlWriter);
                             

                                          if (localDatetype==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("datetype cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDatetype);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRetStartTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "RetStart", xmlWriter);
                             

                                          if (localRetStart==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RetStart cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRetStart);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRetMaxTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "RetMax", xmlWriter);
                             

                                          if (localRetMax==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RetMax cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRetMax);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRettypeTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "rettype", xmlWriter);
                             

                                          if (localRettype==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("rettype cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRettype);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSortTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/esearch";
                                    writeStartElement(null, namespace, "sort", xmlWriter);
                             

                                          if (localSort==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("sort cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSort);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch")){
                return "ns3";
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

                 if (localDbTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "db"));
                                 
                                        if (localDb != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDb));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("db cannot be null!!");
                                        }
                                    } if (localTermTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "term"));
                                 
                                        if (localTerm != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTerm));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("term cannot be null!!");
                                        }
                                    } if (localWebEnvTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "WebEnv"));
                                 
                                        if (localWebEnv != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWebEnv));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WebEnv cannot be null!!");
                                        }
                                    } if (localQueryKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "QueryKey"));
                                 
                                        if (localQueryKey != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryKey));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("QueryKey cannot be null!!");
                                        }
                                    } if (localUsehistoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "usehistory"));
                                 
                                        if (localUsehistory != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsehistory));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("usehistory cannot be null!!");
                                        }
                                    } if (localToolTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "tool"));
                                 
                                        if (localTool != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTool));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("tool cannot be null!!");
                                        }
                                    } if (localEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "email"));
                                 
                                        if (localEmail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");
                                        }
                                    } if (localFieldTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "field"));
                                 
                                        if (localField != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localField));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("field cannot be null!!");
                                        }
                                    } if (localReldateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "reldate"));
                                 
                                        if (localReldate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReldate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("reldate cannot be null!!");
                                        }
                                    } if (localMindateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "mindate"));
                                 
                                        if (localMindate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMindate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("mindate cannot be null!!");
                                        }
                                    } if (localMaxdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "maxdate"));
                                 
                                        if (localMaxdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("maxdate cannot be null!!");
                                        }
                                    } if (localDatetypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "datetype"));
                                 
                                        if (localDatetype != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDatetype));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("datetype cannot be null!!");
                                        }
                                    } if (localRetStartTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "RetStart"));
                                 
                                        if (localRetStart != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetStart));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RetStart cannot be null!!");
                                        }
                                    } if (localRetMaxTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "RetMax"));
                                 
                                        if (localRetMax != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetMax));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RetMax cannot be null!!");
                                        }
                                    } if (localRettypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "rettype"));
                                 
                                        if (localRettype != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRettype));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("rettype cannot be null!!");
                                        }
                                    } if (localSortTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch",
                                                                      "sort"));
                                 
                                        if (localSort != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSort));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("sort cannot be null!!");
                                        }
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
        public static ESearchRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ESearchRequest object =
                new ESearchRequest();

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
                    
                            if (!"eSearchRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ESearchRequest)gov.nih.nlm.ncbi.www.soap.eutils.egquery.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","db").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"db" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDb(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","term").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"term" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTerm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","WebEnv").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WebEnv" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWebEnv(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","QueryKey").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"QueryKey" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQueryKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","usehistory").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"usehistory" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsehistory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","tool").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tool" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTool(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","email").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"email" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","field").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"field" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setField(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","reldate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"reldate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReldate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","mindate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"mindate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMindate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","maxdate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"maxdate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","datetype").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"datetype" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDatetype(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","RetStart").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RetStart" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetStart(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","RetMax").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RetMax" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetMax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","rettype").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"rettype" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRettype(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch","sort").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sort" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSort(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
           
    