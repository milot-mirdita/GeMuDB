/*
 * XML Type:  predictionRunType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PredictionRunType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML predictionRunType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface PredictionRunType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PredictionRunType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("predictionruntype9593type");
    
    /**
     * Gets the "entryKey" element
     */
    org.rostlab.predictprotein.EntryKeyType getEntryKey();
    
    /**
     * Sets the "entryKey" element
     */
    void setEntryKey(org.rostlab.predictprotein.EntryKeyType entryKey);
    
    /**
     * Appends and returns a new empty "entryKey" element
     */
    org.rostlab.predictprotein.EntryKeyType addNewEntryKey();
    
    /**
     * Gets the "predText" element
     */
    java.lang.String getPredText();
    
    /**
     * Gets (as xml) the "predText" element
     */
    org.apache.xmlbeans.XmlString xgetPredText();
    
    /**
     * True if has "predText" element
     */
    boolean isSetPredText();
    
    /**
     * Sets the "predText" element
     */
    void setPredText(java.lang.String predText);
    
    /**
     * Sets (as xml) the "predText" element
     */
    void xsetPredText(org.apache.xmlbeans.XmlString predText);
    
    /**
     * Unsets the "predText" element
     */
    void unsetPredText();
    
    /**
     * Gets the "predComment" element
     */
    java.lang.String getPredComment();
    
    /**
     * Gets (as xml) the "predComment" element
     */
    org.apache.xmlbeans.XmlString xgetPredComment();
    
    /**
     * True if has "predComment" element
     */
    boolean isSetPredComment();
    
    /**
     * Sets the "predComment" element
     */
    void setPredComment(java.lang.String predComment);
    
    /**
     * Sets (as xml) the "predComment" element
     */
    void xsetPredComment(org.apache.xmlbeans.XmlString predComment);
    
    /**
     * Unsets the "predComment" element
     */
    void unsetPredComment();
    
    /**
     * Gets array of all "link" elements
     */
    org.rostlab.predictprotein.PredictionRunType.Link[] getLinkArray();
    
    /**
     * Gets ith "link" element
     */
    org.rostlab.predictprotein.PredictionRunType.Link getLinkArray(int i);
    
    /**
     * Returns number of "link" element
     */
    int sizeOfLinkArray();
    
    /**
     * Sets array of all "link" element
     */
    void setLinkArray(org.rostlab.predictprotein.PredictionRunType.Link[] linkArray);
    
    /**
     * Sets ith "link" element
     */
    void setLinkArray(int i, org.rostlab.predictprotein.PredictionRunType.Link link);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    org.rostlab.predictprotein.PredictionRunType.Link insertNewLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    org.rostlab.predictprotein.PredictionRunType.Link addNewLink();
    
    /**
     * Removes the ith "link" element
     */
    void removeLink(int i);
    
    /**
     * Gets the "ref" attribute
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlString xgetRef();
    
    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();
    
    /**
     * Sets the "ref" attribute
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.apache.xmlbeans.XmlString ref);
    
    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();
    
    /**
     * An XML link(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.PredictionRunType$Link.
     */
    public interface Link extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("link35a9elemtype");
        
        /**
         * Gets the "uri" attribute
         */
        java.lang.String getUri();
        
        /**
         * Gets (as xml) the "uri" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetUri();
        
        /**
         * Sets the "uri" attribute
         */
        void setUri(java.lang.String uri);
        
        /**
         * Sets (as xml) the "uri" attribute
         */
        void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.PredictionRunType.Link newInstance() {
              return (org.rostlab.predictprotein.PredictionRunType.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.PredictionRunType.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.PredictionRunType.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.PredictionRunType newInstance() {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.PredictionRunType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.PredictionRunType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.PredictionRunType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.PredictionRunType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.PredictionRunType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
