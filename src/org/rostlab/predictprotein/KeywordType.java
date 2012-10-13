/*
 * XML Type:  keywordType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.KeywordType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML keywordType(@http://rostlab.org/predictprotein).
 *
 * This is an atomic type that is a restriction of org.rostlab.predictprotein.KeywordType.
 */
public interface KeywordType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeywordType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("keywordtype8380type");
    
    /**
     * Gets the "evidence" attribute
     */
    java.lang.String getEvidence();
    
    /**
     * Gets (as xml) the "evidence" attribute
     */
    org.apache.xmlbeans.XmlString xgetEvidence();
    
    /**
     * True if has "evidence" attribute
     */
    boolean isSetEvidence();
    
    /**
     * Sets the "evidence" attribute
     */
    void setEvidence(java.lang.String evidence);
    
    /**
     * Sets (as xml) the "evidence" attribute
     */
    void xsetEvidence(org.apache.xmlbeans.XmlString evidence);
    
    /**
     * Unsets the "evidence" attribute
     */
    void unsetEvidence();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.KeywordType newInstance() {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.KeywordType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.KeywordType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.KeywordType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.KeywordType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.KeywordType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.KeywordType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
