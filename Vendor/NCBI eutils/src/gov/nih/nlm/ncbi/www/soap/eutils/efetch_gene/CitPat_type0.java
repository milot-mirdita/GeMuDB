
/**
 * CitPat_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  CitPat_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CitPat_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Cit-pat_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CitPat_title
                        */

                        
                                    protected java.lang.String localCitPat_title ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitPat_title(){
                               return localCitPat_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_title
                               */
                               public void setCitPat_title(java.lang.String param){
                            
                                            this.localCitPat_title=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_authors
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_authors_type0 localCitPat_authors ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_authors_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_authors_type0 getCitPat_authors(){
                               return localCitPat_authors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_authors
                               */
                               public void setCitPat_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_authors_type0 param){
                            
                                            this.localCitPat_authors=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_country
                        */

                        
                                    protected java.lang.String localCitPat_country ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitPat_country(){
                               return localCitPat_country;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_country
                               */
                               public void setCitPat_country(java.lang.String param){
                            
                                            this.localCitPat_country=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_docType
                        */

                        
                                    protected java.lang.String localCitPat_docType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitPat_docType(){
                               return localCitPat_docType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_docType
                               */
                               public void setCitPat_docType(java.lang.String param){
                            
                                            this.localCitPat_docType=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_number
                        */

                        
                                    protected java.lang.String localCitPat_number ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_numberTracker = false ;

                           public boolean isCitPat_numberSpecified(){
                               return localCitPat_numberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitPat_number(){
                               return localCitPat_number;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_number
                               */
                               public void setCitPat_number(java.lang.String param){
                            localCitPat_numberTracker = param != null;
                                   
                                            this.localCitPat_number=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_dateIssue
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_dateIssue_type0 localCitPat_dateIssue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_dateIssueTracker = false ;

                           public boolean isCitPat_dateIssueSpecified(){
                               return localCitPat_dateIssueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_dateIssue_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_dateIssue_type0 getCitPat_dateIssue(){
                               return localCitPat_dateIssue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_dateIssue
                               */
                               public void setCitPat_dateIssue(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_dateIssue_type0 param){
                            localCitPat_dateIssueTracker = param != null;
                                   
                                            this.localCitPat_dateIssue=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_class
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_class_type0 localCitPat_class ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_classTracker = false ;

                           public boolean isCitPat_classSpecified(){
                               return localCitPat_classTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_class_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_class_type0 getCitPat_class(){
                               return localCitPat_class;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_class
                               */
                               public void setCitPat_class(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_class_type0 param){
                            localCitPat_classTracker = param != null;
                                   
                                            this.localCitPat_class=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_appNumber
                        */

                        
                                    protected java.lang.String localCitPat_appNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_appNumberTracker = false ;

                           public boolean isCitPat_appNumberSpecified(){
                               return localCitPat_appNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitPat_appNumber(){
                               return localCitPat_appNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_appNumber
                               */
                               public void setCitPat_appNumber(java.lang.String param){
                            localCitPat_appNumberTracker = param != null;
                                   
                                            this.localCitPat_appNumber=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_appDate
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_appDate_type0 localCitPat_appDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_appDateTracker = false ;

                           public boolean isCitPat_appDateSpecified(){
                               return localCitPat_appDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_appDate_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_appDate_type0 getCitPat_appDate(){
                               return localCitPat_appDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_appDate
                               */
                               public void setCitPat_appDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_appDate_type0 param){
                            localCitPat_appDateTracker = param != null;
                                   
                                            this.localCitPat_appDate=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_applicants
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_applicants_type0 localCitPat_applicants ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_applicantsTracker = false ;

                           public boolean isCitPat_applicantsSpecified(){
                               return localCitPat_applicantsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_applicants_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_applicants_type0 getCitPat_applicants(){
                               return localCitPat_applicants;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_applicants
                               */
                               public void setCitPat_applicants(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_applicants_type0 param){
                            localCitPat_applicantsTracker = param != null;
                                   
                                            this.localCitPat_applicants=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_assignees
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_assignees_type0 localCitPat_assignees ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_assigneesTracker = false ;

                           public boolean isCitPat_assigneesSpecified(){
                               return localCitPat_assigneesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_assignees_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_assignees_type0 getCitPat_assignees(){
                               return localCitPat_assignees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_assignees
                               */
                               public void setCitPat_assignees(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_assignees_type0 param){
                            localCitPat_assigneesTracker = param != null;
                                   
                                            this.localCitPat_assignees=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_priority
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_priority_type0 localCitPat_priority ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_priorityTracker = false ;

                           public boolean isCitPat_prioritySpecified(){
                               return localCitPat_priorityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_priority_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_priority_type0 getCitPat_priority(){
                               return localCitPat_priority;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_priority
                               */
                               public void setCitPat_priority(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_priority_type0 param){
                            localCitPat_priorityTracker = param != null;
                                   
                                            this.localCitPat_priority=param;
                                    

                               }
                            

                        /**
                        * field for CitPat_abstract
                        */

                        
                                    protected java.lang.String localCitPat_abstract ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCitPat_abstractTracker = false ;

                           public boolean isCitPat_abstractSpecified(){
                               return localCitPat_abstractTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCitPat_abstract(){
                               return localCitPat_abstract;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CitPat_abstract
                               */
                               public void setCitPat_abstract(java.lang.String param){
                            localCitPat_abstractTracker = param != null;
                                   
                                            this.localCitPat_abstract=param;
                                    

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
                           namespacePrefix+":Cit-pat_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Cit-pat_type0",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-pat_title", xmlWriter);
                             

                                          if (localCitPat_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-pat_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitPat_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localCitPat_authors==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_authors cannot be null!!");
                                            }
                                           localCitPat_authors.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_authors"),
                                               xmlWriter);
                                        
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-pat_country", xmlWriter);
                             

                                          if (localCitPat_country==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-pat_country cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitPat_country);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-pat_doc-type", xmlWriter);
                             

                                          if (localCitPat_docType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-pat_doc-type cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitPat_docType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCitPat_numberTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-pat_number", xmlWriter);
                             

                                          if (localCitPat_number==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-pat_number cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitPat_number);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitPat_dateIssueTracker){
                                            if (localCitPat_dateIssue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_date-issue cannot be null!!");
                                            }
                                           localCitPat_dateIssue.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_date-issue"),
                                               xmlWriter);
                                        } if (localCitPat_classTracker){
                                            if (localCitPat_class==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_class cannot be null!!");
                                            }
                                           localCitPat_class.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_class"),
                                               xmlWriter);
                                        } if (localCitPat_appNumberTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-pat_app-number", xmlWriter);
                             

                                          if (localCitPat_appNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-pat_app-number cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitPat_appNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCitPat_appDateTracker){
                                            if (localCitPat_appDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_app-date cannot be null!!");
                                            }
                                           localCitPat_appDate.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_app-date"),
                                               xmlWriter);
                                        } if (localCitPat_applicantsTracker){
                                            if (localCitPat_applicants==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_applicants cannot be null!!");
                                            }
                                           localCitPat_applicants.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_applicants"),
                                               xmlWriter);
                                        } if (localCitPat_assigneesTracker){
                                            if (localCitPat_assignees==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_assignees cannot be null!!");
                                            }
                                           localCitPat_assignees.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_assignees"),
                                               xmlWriter);
                                        } if (localCitPat_priorityTracker){
                                            if (localCitPat_priority==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cit-pat_priority cannot be null!!");
                                            }
                                           localCitPat_priority.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_priority"),
                                               xmlWriter);
                                        } if (localCitPat_abstractTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Cit-pat_abstract", xmlWriter);
                             

                                          if (localCitPat_abstract==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Cit-pat_abstract cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCitPat_abstract);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                                                                      "Cit-pat_title"));
                                 
                                        if (localCitPat_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitPat_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-pat_title cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_authors"));
                            
                            
                                    if (localCitPat_authors==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_authors cannot be null!!");
                                    }
                                    elementList.add(localCitPat_authors);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_country"));
                                 
                                        if (localCitPat_country != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitPat_country));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-pat_country cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_doc-type"));
                                 
                                        if (localCitPat_docType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitPat_docType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-pat_doc-type cannot be null!!");
                                        }
                                     if (localCitPat_numberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_number"));
                                 
                                        if (localCitPat_number != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitPat_number));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-pat_number cannot be null!!");
                                        }
                                    } if (localCitPat_dateIssueTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_date-issue"));
                            
                            
                                    if (localCitPat_dateIssue==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_date-issue cannot be null!!");
                                    }
                                    elementList.add(localCitPat_dateIssue);
                                } if (localCitPat_classTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_class"));
                            
                            
                                    if (localCitPat_class==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_class cannot be null!!");
                                    }
                                    elementList.add(localCitPat_class);
                                } if (localCitPat_appNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_app-number"));
                                 
                                        if (localCitPat_appNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitPat_appNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-pat_app-number cannot be null!!");
                                        }
                                    } if (localCitPat_appDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_app-date"));
                            
                            
                                    if (localCitPat_appDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_app-date cannot be null!!");
                                    }
                                    elementList.add(localCitPat_appDate);
                                } if (localCitPat_applicantsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_applicants"));
                            
                            
                                    if (localCitPat_applicants==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_applicants cannot be null!!");
                                    }
                                    elementList.add(localCitPat_applicants);
                                } if (localCitPat_assigneesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_assignees"));
                            
                            
                                    if (localCitPat_assignees==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_assignees cannot be null!!");
                                    }
                                    elementList.add(localCitPat_assignees);
                                } if (localCitPat_priorityTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_priority"));
                            
                            
                                    if (localCitPat_priority==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cit-pat_priority cannot be null!!");
                                    }
                                    elementList.add(localCitPat_priority);
                                } if (localCitPat_abstractTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Cit-pat_abstract"));
                                 
                                        if (localCitPat_abstract != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCitPat_abstract));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Cit-pat_abstract cannot be null!!");
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
        public static CitPat_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CitPat_type0 object =
                new CitPat_type0();

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
                    
                            if (!"Cit-pat_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CitPat_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-pat_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitPat_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_authors").equals(reader.getName())){
                                
                                                object.setCitPat_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_authors_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_country").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-pat_country" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitPat_country(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_doc-type").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-pat_doc-type" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitPat_docType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_number").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-pat_number" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitPat_number(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_date-issue").equals(reader.getName())){
                                
                                                object.setCitPat_dateIssue(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_dateIssue_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_class").equals(reader.getName())){
                                
                                                object.setCitPat_class(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_class_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_app-number").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-pat_app-number" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitPat_appNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_app-date").equals(reader.getName())){
                                
                                                object.setCitPat_appDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_appDate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_applicants").equals(reader.getName())){
                                
                                                object.setCitPat_applicants(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_applicants_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_assignees").equals(reader.getName())){
                                
                                                object.setCitPat_assignees(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_assignees_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_priority").equals(reader.getName())){
                                
                                                object.setCitPat_priority(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.CitPat_priority_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Cit-pat_abstract").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Cit-pat_abstract" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCitPat_abstract(
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
           
    