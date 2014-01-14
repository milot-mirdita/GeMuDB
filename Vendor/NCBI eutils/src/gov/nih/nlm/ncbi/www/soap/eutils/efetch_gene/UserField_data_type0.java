
/**
 * UserField_data_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  UserField_data_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class UserField_data_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = User-field_data_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localUserField_data_strTracker = false;
                
                   localUserField_data_intTracker = false;
                
                   localUserField_data_realTracker = false;
                
                   localUserField_data_boolTracker = false;
                
                   localUserField_data_osTracker = false;
                
                   localUserField_data_objectTracker = false;
                
                   localUserField_data_strsTracker = false;
                
                   localUserField_data_intsTracker = false;
                
                   localUserField_data_realsTracker = false;
                
                   localUserField_data_ossTracker = false;
                
                   localUserField_data_fieldsTracker = false;
                
                   localUserField_data_objectsTracker = false;
                
            }
        

                        /**
                        * field for UserField_data_str
                        */

                        
                                    protected java.lang.String localUserField_data_str ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_strTracker = false ;

                           public boolean isUserField_data_strSpecified(){
                               return localUserField_data_strTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserField_data_str(){
                               return localUserField_data_str;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_str
                               */
                               public void setUserField_data_str(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_strTracker = param != null;
                                   
                                            this.localUserField_data_str=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_int
                        */

                        
                                    protected java.math.BigInteger localUserField_data_int ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_intTracker = false ;

                           public boolean isUserField_data_intSpecified(){
                               return localUserField_data_intTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getUserField_data_int(){
                               return localUserField_data_int;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_int
                               */
                               public void setUserField_data_int(java.math.BigInteger param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_intTracker = param != null;
                                   
                                            this.localUserField_data_int=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_real
                        */

                        
                                    protected double localUserField_data_real ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_realTracker = false ;

                           public boolean isUserField_data_realSpecified(){
                               return localUserField_data_realTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getUserField_data_real(){
                               return localUserField_data_real;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_real
                               */
                               public void setUserField_data_real(double param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localUserField_data_realTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localUserField_data_real=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_bool
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_bool_type0 localUserField_data_bool ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_boolTracker = false ;

                           public boolean isUserField_data_boolSpecified(){
                               return localUserField_data_boolTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_bool_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_bool_type0 getUserField_data_bool(){
                               return localUserField_data_bool;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_bool
                               */
                               public void setUserField_data_bool(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_bool_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_boolTracker = param != null;
                                   
                                            this.localUserField_data_bool=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_os
                        */

                        
                                    protected org.apache.axis2.databinding.types.HexBinary localUserField_data_os ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_osTracker = false ;

                           public boolean isUserField_data_osSpecified(){
                               return localUserField_data_osTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.HexBinary
                           */
                           public  org.apache.axis2.databinding.types.HexBinary getUserField_data_os(){
                               return localUserField_data_os;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_os
                               */
                               public void setUserField_data_os(org.apache.axis2.databinding.types.HexBinary param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_osTracker = param != null;
                                   
                                            this.localUserField_data_os=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_object
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_object_type0 localUserField_data_object ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_objectTracker = false ;

                           public boolean isUserField_data_objectSpecified(){
                               return localUserField_data_objectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_object_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_object_type0 getUserField_data_object(){
                               return localUserField_data_object;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_object
                               */
                               public void setUserField_data_object(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_object_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_objectTracker = param != null;
                                   
                                            this.localUserField_data_object=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_strs
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_strs_type0 localUserField_data_strs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_strsTracker = false ;

                           public boolean isUserField_data_strsSpecified(){
                               return localUserField_data_strsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_strs_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_strs_type0 getUserField_data_strs(){
                               return localUserField_data_strs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_strs
                               */
                               public void setUserField_data_strs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_strs_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_strsTracker = param != null;
                                   
                                            this.localUserField_data_strs=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_ints
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_ints_type0 localUserField_data_ints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_intsTracker = false ;

                           public boolean isUserField_data_intsSpecified(){
                               return localUserField_data_intsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_ints_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_ints_type0 getUserField_data_ints(){
                               return localUserField_data_ints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_ints
                               */
                               public void setUserField_data_ints(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_ints_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_intsTracker = param != null;
                                   
                                            this.localUserField_data_ints=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_reals
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_reals_type0 localUserField_data_reals ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_realsTracker = false ;

                           public boolean isUserField_data_realsSpecified(){
                               return localUserField_data_realsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_reals_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_reals_type0 getUserField_data_reals(){
                               return localUserField_data_reals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_reals
                               */
                               public void setUserField_data_reals(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_reals_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_realsTracker = param != null;
                                   
                                            this.localUserField_data_reals=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_oss
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_oss_type0 localUserField_data_oss ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_ossTracker = false ;

                           public boolean isUserField_data_ossSpecified(){
                               return localUserField_data_ossTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_oss_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_oss_type0 getUserField_data_oss(){
                               return localUserField_data_oss;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_oss
                               */
                               public void setUserField_data_oss(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_oss_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_ossTracker = param != null;
                                   
                                            this.localUserField_data_oss=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_fields
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_fields_type0 localUserField_data_fields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_fieldsTracker = false ;

                           public boolean isUserField_data_fieldsSpecified(){
                               return localUserField_data_fieldsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_fields_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_fields_type0 getUserField_data_fields(){
                               return localUserField_data_fields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_fields
                               */
                               public void setUserField_data_fields(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_fields_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_fieldsTracker = param != null;
                                   
                                            this.localUserField_data_fields=param;
                                    

                               }
                            

                        /**
                        * field for UserField_data_objects
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_objects_type0 localUserField_data_objects ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserField_data_objectsTracker = false ;

                           public boolean isUserField_data_objectsSpecified(){
                               return localUserField_data_objectsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_objects_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_objects_type0 getUserField_data_objects(){
                               return localUserField_data_objects;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserField_data_objects
                               */
                               public void setUserField_data_objects(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_objects_type0 param){
                            
                                clearAllSettingTrackers();
                            localUserField_data_objectsTracker = param != null;
                                   
                                            this.localUserField_data_objects=param;
                                    

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
                           namespacePrefix+":User-field_data_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "User-field_data_type0",
                           xmlWriter);
                   }

               
                   }
                if (localUserField_data_strTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "User-field_data_str", xmlWriter);
                             

                                          if (localUserField_data_str==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("User-field_data_str cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserField_data_str);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserField_data_intTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "User-field_data_int", xmlWriter);
                             

                                          if (localUserField_data_int==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("User-field_data_int cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_int));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserField_data_realTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "User-field_data_real", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localUserField_data_real)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_real cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_real));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserField_data_boolTracker){
                                            if (localUserField_data_bool==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_bool cannot be null!!");
                                            }
                                           localUserField_data_bool.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_bool"),
                                               xmlWriter);
                                        } if (localUserField_data_osTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "User-field_data_os", xmlWriter);
                             

                                          if (localUserField_data_os==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("User-field_data_os cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_os));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserField_data_objectTracker){
                                            if (localUserField_data_object==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_object cannot be null!!");
                                            }
                                           localUserField_data_object.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_object"),
                                               xmlWriter);
                                        } if (localUserField_data_strsTracker){
                                            if (localUserField_data_strs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_strs cannot be null!!");
                                            }
                                           localUserField_data_strs.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_strs"),
                                               xmlWriter);
                                        } if (localUserField_data_intsTracker){
                                            if (localUserField_data_ints==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_ints cannot be null!!");
                                            }
                                           localUserField_data_ints.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_ints"),
                                               xmlWriter);
                                        } if (localUserField_data_realsTracker){
                                            if (localUserField_data_reals==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_reals cannot be null!!");
                                            }
                                           localUserField_data_reals.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_reals"),
                                               xmlWriter);
                                        } if (localUserField_data_ossTracker){
                                            if (localUserField_data_oss==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_oss cannot be null!!");
                                            }
                                           localUserField_data_oss.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_oss"),
                                               xmlWriter);
                                        } if (localUserField_data_fieldsTracker){
                                            if (localUserField_data_fields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_fields cannot be null!!");
                                            }
                                           localUserField_data_fields.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_fields"),
                                               xmlWriter);
                                        } if (localUserField_data_objectsTracker){
                                            if (localUserField_data_objects==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User-field_data_objects cannot be null!!");
                                            }
                                           localUserField_data_objects.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_objects"),
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

                 if (localUserField_data_strTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_str"));
                                 
                                        if (localUserField_data_str != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_str));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("User-field_data_str cannot be null!!");
                                        }
                                    } if (localUserField_data_intTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_int"));
                                 
                                        if (localUserField_data_int != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_int));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("User-field_data_int cannot be null!!");
                                        }
                                    } if (localUserField_data_realTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_real"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_real));
                            } if (localUserField_data_boolTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_bool"));
                            
                            
                                    if (localUserField_data_bool==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_bool cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_bool);
                                } if (localUserField_data_osTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_os"));
                                 
                                        if (localUserField_data_os != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserField_data_os));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("User-field_data_os cannot be null!!");
                                        }
                                    } if (localUserField_data_objectTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_object"));
                            
                            
                                    if (localUserField_data_object==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_object cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_object);
                                } if (localUserField_data_strsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_strs"));
                            
                            
                                    if (localUserField_data_strs==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_strs cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_strs);
                                } if (localUserField_data_intsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_ints"));
                            
                            
                                    if (localUserField_data_ints==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_ints cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_ints);
                                } if (localUserField_data_realsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_reals"));
                            
                            
                                    if (localUserField_data_reals==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_reals cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_reals);
                                } if (localUserField_data_ossTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_oss"));
                            
                            
                                    if (localUserField_data_oss==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_oss cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_oss);
                                } if (localUserField_data_fieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_fields"));
                            
                            
                                    if (localUserField_data_fields==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_fields cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_fields);
                                } if (localUserField_data_objectsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "User-field_data_objects"));
                            
                            
                                    if (localUserField_data_objects==null){
                                         throw new org.apache.axis2.databinding.ADBException("User-field_data_objects cannot be null!!");
                                    }
                                    elementList.add(localUserField_data_objects);
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
        public static UserField_data_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserField_data_type0 object =
                new UserField_data_type0();

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
                    
                            if (!"User-field_data_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserField_data_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
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
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_str").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"User-field_data_str" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserField_data_str(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_int").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"User-field_data_int" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserField_data_int(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_real").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"User-field_data_real" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserField_data_real(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_bool").equals(reader.getName())){
                                
                                                object.setUserField_data_bool(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_bool_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_os").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"User-field_data_os" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserField_data_os(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToHexBinary(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_object").equals(reader.getName())){
                                
                                                object.setUserField_data_object(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_object_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_strs").equals(reader.getName())){
                                
                                                object.setUserField_data_strs(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_strs_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_ints").equals(reader.getName())){
                                
                                                object.setUserField_data_ints(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_ints_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_reals").equals(reader.getName())){
                                
                                                object.setUserField_data_reals(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_reals_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_oss").equals(reader.getName())){
                                
                                                object.setUserField_data_oss(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_oss_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_fields").equals(reader.getName())){
                                
                                                object.setUserField_data_fields(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_fields_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","User-field_data_objects").equals(reader.getName())){
                                
                                                object.setUserField_data_objects(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.UserField_data_objects_type0.Factory.parse(reader));
                                              
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
           
    