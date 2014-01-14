
/**
 * SeqFeat_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene;
            

            /**
            *  SeqFeat_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SeqFeat_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Seq-feat_type0
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SeqFeat_id
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_id_type0 localSeqFeat_id ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_idTracker = false ;

                           public boolean isSeqFeat_idSpecified(){
                               return localSeqFeat_idTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_id_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_id_type0 getSeqFeat_id(){
                               return localSeqFeat_id;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_id
                               */
                               public void setSeqFeat_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_id_type0 param){
                            localSeqFeat_idTracker = param != null;
                                   
                                            this.localSeqFeat_id=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_data
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_data_type0 localSeqFeat_data ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_data_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_data_type0 getSeqFeat_data(){
                               return localSeqFeat_data;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_data
                               */
                               public void setSeqFeat_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_data_type0 param){
                            
                                            this.localSeqFeat_data=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_partial
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_partial_type0 localSeqFeat_partial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_partialTracker = false ;

                           public boolean isSeqFeat_partialSpecified(){
                               return localSeqFeat_partialTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_partial_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_partial_type0 getSeqFeat_partial(){
                               return localSeqFeat_partial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_partial
                               */
                               public void setSeqFeat_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_partial_type0 param){
                            localSeqFeat_partialTracker = param != null;
                                   
                                            this.localSeqFeat_partial=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_except
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_except_type0 localSeqFeat_except ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_exceptTracker = false ;

                           public boolean isSeqFeat_exceptSpecified(){
                               return localSeqFeat_exceptTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_except_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_except_type0 getSeqFeat_except(){
                               return localSeqFeat_except;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_except
                               */
                               public void setSeqFeat_except(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_except_type0 param){
                            localSeqFeat_exceptTracker = param != null;
                                   
                                            this.localSeqFeat_except=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_comment
                        */

                        
                                    protected java.lang.String localSeqFeat_comment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_commentTracker = false ;

                           public boolean isSeqFeat_commentSpecified(){
                               return localSeqFeat_commentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqFeat_comment(){
                               return localSeqFeat_comment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_comment
                               */
                               public void setSeqFeat_comment(java.lang.String param){
                            localSeqFeat_commentTracker = param != null;
                                   
                                            this.localSeqFeat_comment=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_product
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_product_type0 localSeqFeat_product ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_productTracker = false ;

                           public boolean isSeqFeat_productSpecified(){
                               return localSeqFeat_productTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_product_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_product_type0 getSeqFeat_product(){
                               return localSeqFeat_product;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_product
                               */
                               public void setSeqFeat_product(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_product_type0 param){
                            localSeqFeat_productTracker = param != null;
                                   
                                            this.localSeqFeat_product=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_location
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_location_type0 localSeqFeat_location ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_location_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_location_type0 getSeqFeat_location(){
                               return localSeqFeat_location;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_location
                               */
                               public void setSeqFeat_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_location_type0 param){
                            
                                            this.localSeqFeat_location=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_qual
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_qual_type0 localSeqFeat_qual ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_qualTracker = false ;

                           public boolean isSeqFeat_qualSpecified(){
                               return localSeqFeat_qualTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_qual_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_qual_type0 getSeqFeat_qual(){
                               return localSeqFeat_qual;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_qual
                               */
                               public void setSeqFeat_qual(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_qual_type0 param){
                            localSeqFeat_qualTracker = param != null;
                                   
                                            this.localSeqFeat_qual=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_title
                        */

                        
                                    protected java.lang.String localSeqFeat_title ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_titleTracker = false ;

                           public boolean isSeqFeat_titleSpecified(){
                               return localSeqFeat_titleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqFeat_title(){
                               return localSeqFeat_title;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_title
                               */
                               public void setSeqFeat_title(java.lang.String param){
                            localSeqFeat_titleTracker = param != null;
                                   
                                            this.localSeqFeat_title=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_ext
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ext_type0 localSeqFeat_ext ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_extTracker = false ;

                           public boolean isSeqFeat_extSpecified(){
                               return localSeqFeat_extTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ext_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ext_type0 getSeqFeat_ext(){
                               return localSeqFeat_ext;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_ext
                               */
                               public void setSeqFeat_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ext_type0 param){
                            localSeqFeat_extTracker = param != null;
                                   
                                            this.localSeqFeat_ext=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_cit
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_cit_type0 localSeqFeat_cit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_citTracker = false ;

                           public boolean isSeqFeat_citSpecified(){
                               return localSeqFeat_citTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_cit_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_cit_type0 getSeqFeat_cit(){
                               return localSeqFeat_cit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_cit
                               */
                               public void setSeqFeat_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_cit_type0 param){
                            localSeqFeat_citTracker = param != null;
                                   
                                            this.localSeqFeat_cit=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_expEv
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_expEv_type0 localSeqFeat_expEv ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_expEvTracker = false ;

                           public boolean isSeqFeat_expEvSpecified(){
                               return localSeqFeat_expEvTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_expEv_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_expEv_type0 getSeqFeat_expEv(){
                               return localSeqFeat_expEv;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_expEv
                               */
                               public void setSeqFeat_expEv(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_expEv_type0 param){
                            localSeqFeat_expEvTracker = param != null;
                                   
                                            this.localSeqFeat_expEv=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_xref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_xref_type0 localSeqFeat_xref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_xrefTracker = false ;

                           public boolean isSeqFeat_xrefSpecified(){
                               return localSeqFeat_xrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_xref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_xref_type0 getSeqFeat_xref(){
                               return localSeqFeat_xref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_xref
                               */
                               public void setSeqFeat_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_xref_type0 param){
                            localSeqFeat_xrefTracker = param != null;
                                   
                                            this.localSeqFeat_xref=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_dbxref
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_dbxref_type0 localSeqFeat_dbxref ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_dbxrefTracker = false ;

                           public boolean isSeqFeat_dbxrefSpecified(){
                               return localSeqFeat_dbxrefTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_dbxref_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_dbxref_type0 getSeqFeat_dbxref(){
                               return localSeqFeat_dbxref;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_dbxref
                               */
                               public void setSeqFeat_dbxref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_dbxref_type0 param){
                            localSeqFeat_dbxrefTracker = param != null;
                                   
                                            this.localSeqFeat_dbxref=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_pseudo
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_pseudo_type0 localSeqFeat_pseudo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_pseudoTracker = false ;

                           public boolean isSeqFeat_pseudoSpecified(){
                               return localSeqFeat_pseudoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_pseudo_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_pseudo_type0 getSeqFeat_pseudo(){
                               return localSeqFeat_pseudo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_pseudo
                               */
                               public void setSeqFeat_pseudo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_pseudo_type0 param){
                            localSeqFeat_pseudoTracker = param != null;
                                   
                                            this.localSeqFeat_pseudo=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_exceptText
                        */

                        
                                    protected java.lang.String localSeqFeat_exceptText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_exceptTextTracker = false ;

                           public boolean isSeqFeat_exceptTextSpecified(){
                               return localSeqFeat_exceptTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeqFeat_exceptText(){
                               return localSeqFeat_exceptText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_exceptText
                               */
                               public void setSeqFeat_exceptText(java.lang.String param){
                            localSeqFeat_exceptTextTracker = param != null;
                                   
                                            this.localSeqFeat_exceptText=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_ids
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ids_type0 localSeqFeat_ids ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_idsTracker = false ;

                           public boolean isSeqFeat_idsSpecified(){
                               return localSeqFeat_idsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ids_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ids_type0 getSeqFeat_ids(){
                               return localSeqFeat_ids;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_ids
                               */
                               public void setSeqFeat_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ids_type0 param){
                            localSeqFeat_idsTracker = param != null;
                                   
                                            this.localSeqFeat_ids=param;
                                    

                               }
                            

                        /**
                        * field for SeqFeat_exts
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_exts_type0 localSeqFeat_exts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeqFeat_extsTracker = false ;

                           public boolean isSeqFeat_extsSpecified(){
                               return localSeqFeat_extsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_exts_type0
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_exts_type0 getSeqFeat_exts(){
                               return localSeqFeat_exts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeqFeat_exts
                               */
                               public void setSeqFeat_exts(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_exts_type0 param){
                            localSeqFeat_extsTracker = param != null;
                                   
                                            this.localSeqFeat_exts=param;
                                    

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
                           namespacePrefix+":Seq-feat_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Seq-feat_type0",
                           xmlWriter);
                   }

               
                   }
                if (localSeqFeat_idTracker){
                                            if (localSeqFeat_id==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_id cannot be null!!");
                                            }
                                           localSeqFeat_id.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_id"),
                                               xmlWriter);
                                        }
                                            if (localSeqFeat_data==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_data cannot be null!!");
                                            }
                                           localSeqFeat_data.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_data"),
                                               xmlWriter);
                                         if (localSeqFeat_partialTracker){
                                            if (localSeqFeat_partial==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_partial cannot be null!!");
                                            }
                                           localSeqFeat_partial.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_partial"),
                                               xmlWriter);
                                        } if (localSeqFeat_exceptTracker){
                                            if (localSeqFeat_except==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_except cannot be null!!");
                                            }
                                           localSeqFeat_except.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_except"),
                                               xmlWriter);
                                        } if (localSeqFeat_commentTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-feat_comment", xmlWriter);
                             

                                          if (localSeqFeat_comment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-feat_comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqFeat_comment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqFeat_productTracker){
                                            if (localSeqFeat_product==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_product cannot be null!!");
                                            }
                                           localSeqFeat_product.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_product"),
                                               xmlWriter);
                                        }
                                            if (localSeqFeat_location==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_location cannot be null!!");
                                            }
                                           localSeqFeat_location.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_location"),
                                               xmlWriter);
                                         if (localSeqFeat_qualTracker){
                                            if (localSeqFeat_qual==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_qual cannot be null!!");
                                            }
                                           localSeqFeat_qual.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_qual"),
                                               xmlWriter);
                                        } if (localSeqFeat_titleTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-feat_title", xmlWriter);
                             

                                          if (localSeqFeat_title==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-feat_title cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqFeat_title);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqFeat_extTracker){
                                            if (localSeqFeat_ext==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_ext cannot be null!!");
                                            }
                                           localSeqFeat_ext.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_ext"),
                                               xmlWriter);
                                        } if (localSeqFeat_citTracker){
                                            if (localSeqFeat_cit==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_cit cannot be null!!");
                                            }
                                           localSeqFeat_cit.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_cit"),
                                               xmlWriter);
                                        } if (localSeqFeat_expEvTracker){
                                            if (localSeqFeat_expEv==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_exp-ev cannot be null!!");
                                            }
                                           localSeqFeat_expEv.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_exp-ev"),
                                               xmlWriter);
                                        } if (localSeqFeat_xrefTracker){
                                            if (localSeqFeat_xref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_xref cannot be null!!");
                                            }
                                           localSeqFeat_xref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_xref"),
                                               xmlWriter);
                                        } if (localSeqFeat_dbxrefTracker){
                                            if (localSeqFeat_dbxref==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_dbxref cannot be null!!");
                                            }
                                           localSeqFeat_dbxref.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_dbxref"),
                                               xmlWriter);
                                        } if (localSeqFeat_pseudoTracker){
                                            if (localSeqFeat_pseudo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_pseudo cannot be null!!");
                                            }
                                           localSeqFeat_pseudo.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_pseudo"),
                                               xmlWriter);
                                        } if (localSeqFeat_exceptTextTracker){
                                    namespace = "http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene";
                                    writeStartElement(null, namespace, "Seq-feat_except-text", xmlWriter);
                             

                                          if (localSeqFeat_exceptText==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Seq-feat_except-text cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeqFeat_exceptText);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeqFeat_idsTracker){
                                            if (localSeqFeat_ids==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_ids cannot be null!!");
                                            }
                                           localSeqFeat_ids.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_ids"),
                                               xmlWriter);
                                        } if (localSeqFeat_extsTracker){
                                            if (localSeqFeat_exts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Seq-feat_exts cannot be null!!");
                                            }
                                           localSeqFeat_exts.serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_exts"),
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

                 if (localSeqFeat_idTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_id"));
                            
                            
                                    if (localSeqFeat_id==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_id cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_id);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_data"));
                            
                            
                                    if (localSeqFeat_data==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_data cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_data);
                                 if (localSeqFeat_partialTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_partial"));
                            
                            
                                    if (localSeqFeat_partial==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_partial cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_partial);
                                } if (localSeqFeat_exceptTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_except"));
                            
                            
                                    if (localSeqFeat_except==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_except cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_except);
                                } if (localSeqFeat_commentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_comment"));
                                 
                                        if (localSeqFeat_comment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqFeat_comment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-feat_comment cannot be null!!");
                                        }
                                    } if (localSeqFeat_productTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_product"));
                            
                            
                                    if (localSeqFeat_product==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_product cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_product);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_location"));
                            
                            
                                    if (localSeqFeat_location==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_location cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_location);
                                 if (localSeqFeat_qualTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_qual"));
                            
                            
                                    if (localSeqFeat_qual==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_qual cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_qual);
                                } if (localSeqFeat_titleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_title"));
                                 
                                        if (localSeqFeat_title != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqFeat_title));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-feat_title cannot be null!!");
                                        }
                                    } if (localSeqFeat_extTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_ext"));
                            
                            
                                    if (localSeqFeat_ext==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_ext cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_ext);
                                } if (localSeqFeat_citTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_cit"));
                            
                            
                                    if (localSeqFeat_cit==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_cit cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_cit);
                                } if (localSeqFeat_expEvTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_exp-ev"));
                            
                            
                                    if (localSeqFeat_expEv==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_exp-ev cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_expEv);
                                } if (localSeqFeat_xrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_xref"));
                            
                            
                                    if (localSeqFeat_xref==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_xref cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_xref);
                                } if (localSeqFeat_dbxrefTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_dbxref"));
                            
                            
                                    if (localSeqFeat_dbxref==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_dbxref cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_dbxref);
                                } if (localSeqFeat_pseudoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_pseudo"));
                            
                            
                                    if (localSeqFeat_pseudo==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_pseudo cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_pseudo);
                                } if (localSeqFeat_exceptTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_except-text"));
                                 
                                        if (localSeqFeat_exceptText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeqFeat_exceptText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Seq-feat_except-text cannot be null!!");
                                        }
                                    } if (localSeqFeat_idsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_ids"));
                            
                            
                                    if (localSeqFeat_ids==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_ids cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_ids);
                                } if (localSeqFeat_extsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene",
                                                                      "Seq-feat_exts"));
                            
                            
                                    if (localSeqFeat_exts==null){
                                         throw new org.apache.axis2.databinding.ADBException("Seq-feat_exts cannot be null!!");
                                    }
                                    elementList.add(localSeqFeat_exts);
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
        public static SeqFeat_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SeqFeat_type0 object =
                new SeqFeat_type0();

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
                    
                            if (!"Seq-feat_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SeqFeat_type0)gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_id").equals(reader.getName())){
                                
                                                object.setSeqFeat_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_id_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_data").equals(reader.getName())){
                                
                                                object.setSeqFeat_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_data_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_partial").equals(reader.getName())){
                                
                                                object.setSeqFeat_partial(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_partial_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_except").equals(reader.getName())){
                                
                                                object.setSeqFeat_except(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_except_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_comment").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-feat_comment" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqFeat_comment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_product").equals(reader.getName())){
                                
                                                object.setSeqFeat_product(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_product_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_location").equals(reader.getName())){
                                
                                                object.setSeqFeat_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_location_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_qual").equals(reader.getName())){
                                
                                                object.setSeqFeat_qual(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_qual_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_title").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-feat_title" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqFeat_title(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_ext").equals(reader.getName())){
                                
                                                object.setSeqFeat_ext(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ext_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_cit").equals(reader.getName())){
                                
                                                object.setSeqFeat_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_cit_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_exp-ev").equals(reader.getName())){
                                
                                                object.setSeqFeat_expEv(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_expEv_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_xref").equals(reader.getName())){
                                
                                                object.setSeqFeat_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_xref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_dbxref").equals(reader.getName())){
                                
                                                object.setSeqFeat_dbxref(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_dbxref_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_pseudo").equals(reader.getName())){
                                
                                                object.setSeqFeat_pseudo(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_pseudo_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_except-text").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Seq-feat_except-text" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeqFeat_exceptText(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_ids").equals(reader.getName())){
                                
                                                object.setSeqFeat_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_ids_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch_gene","Seq-feat_exts").equals(reader.getName())){
                                
                                                object.setSeqFeat_exts(gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.SeqFeat_exts_type0.Factory.parse(reader));
                                              
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
           
    