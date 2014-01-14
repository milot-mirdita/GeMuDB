
/**
 * IdUrlListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.www.soap.eutils.elink;
            

            /**
            *  IdUrlListType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class IdUrlListType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = IdUrlListType
                Namespace URI = http://www.ncbi.nlm.nih.gov/soap/eutils/elink
                Namespace Prefix = ns5
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localIdUrlSetTracker = false;
                
                   localFirstCharsTracker = false;
                
            }
        

                        /**
                        * field for IdUrlSet
                        * This was an Array!
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] localIdUrlSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdUrlSetTracker = false ;

                           public boolean isIdUrlSetSpecified(){
                               return localIdUrlSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[]
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] getIdUrlSet(){
                               return localIdUrlSet;
                           }

                           
                        


                               
                              /**
                               * validate the array for IdUrlSet
                               */
                              protected void validateIdUrlSet(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IdUrlSet
                              */
                              public void setIdUrlSet(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[] param){
                              
                                   validateIdUrlSet(param);

                               
                                   clearAllSettingTrackers();
                               localIdUrlSetTracker = param != null;
                                      
                                      this.localIdUrlSet=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType
                             */
                             public void addIdUrlSet(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType param){
                                   if (localIdUrlSet == null){
                                   localIdUrlSet = new gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localIdUrlSetTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIdUrlSet);
                               list.add(param);
                               this.localIdUrlSet =
                             (gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[])list.toArray(
                            new gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[list.size()]);

                             }
                             

                        /**
                        * field for FirstChars
                        * This was an Array!
                        */

                        
                                    protected gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] localFirstChars ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstCharsTracker = false ;

                           public boolean isFirstCharsSpecified(){
                               return localFirstCharsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[]
                           */
                           public  gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] getFirstChars(){
                               return localFirstChars;
                           }

                           
                        


                               
                              /**
                               * validate the array for FirstChars
                               */
                              protected void validateFirstChars(gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param FirstChars
                              */
                              public void setFirstChars(gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[] param){
                              
                                   validateFirstChars(param);

                               
                                   clearAllSettingTrackers();
                               localFirstCharsTracker = param != null;
                                      
                                      this.localFirstChars=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType
                             */
                             public void addFirstChars(gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType param){
                                   if (localFirstChars == null){
                                   localFirstChars = new gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localFirstCharsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFirstChars);
                               list.add(param);
                               this.localFirstChars =
                             (gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[])list.toArray(
                            new gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.ncbi.nlm.nih.gov/soap/eutils/elink");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":IdUrlListType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "IdUrlListType",
                           xmlWriter);
                   }

               
                   }
                if (localIdUrlSetTracker){
                                       if (localIdUrlSet!=null){
                                            for (int i = 0;i < localIdUrlSet.length;i++){
                                                if (localIdUrlSet[i] != null){
                                                 localIdUrlSet[i].serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdUrlSet"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("IdUrlSet cannot be null!!");
                                        
                                    }
                                 } if (localFirstCharsTracker){
                                       if (localFirstChars!=null){
                                            for (int i = 0;i < localFirstChars.length;i++){
                                                if (localFirstChars[i] != null){
                                                 localFirstChars[i].serialize(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","FirstChars"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("FirstChars cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.ncbi.nlm.nih.gov/soap/eutils/elink")){
                return "ns5";
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

                 if (localIdUrlSetTracker){
                             if (localIdUrlSet!=null) {
                                 for (int i = 0;i < localIdUrlSet.length;i++){

                                    if (localIdUrlSet[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                          "IdUrlSet"));
                                         elementList.add(localIdUrlSet[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("IdUrlSet cannot be null!!");
                                    
                             }

                        } if (localFirstCharsTracker){
                             if (localFirstChars!=null) {
                                 for (int i = 0;i < localFirstChars.length;i++){

                                    if (localFirstChars[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink",
                                                                          "FirstChars"));
                                         elementList.add(localFirstChars[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("FirstChars cannot be null!!");
                                    
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
        public static IdUrlListType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            IdUrlListType object =
                new IdUrlListType();

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
                    
                            if (!"IdUrlListType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (IdUrlListType)gov.nih.nlm.ncbi.www.soap.eutils.egquery.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdUrlSet").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","IdUrlSet").equals(reader.getName())){
                                                                    list1.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setIdUrlSet((gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                gov.nih.nlm.ncbi.www.soap.eutils.elink.IdUrlSetType.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","FirstChars").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink","FirstChars").equals(reader.getName())){
                                                                    list2.add(gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFirstChars((gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                gov.nih.nlm.ncbi.www.soap.eutils.elink.FirstCharsType.class,
                                                                list2));
                                                            
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
           
    