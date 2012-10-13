/*
 * XML Type:  referenceType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.ReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML referenceType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface ReferenceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferenceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("referencetype59a2type");
    
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
     * Gets the "citation" element
     */
    org.rostlab.predictprotein.CitationType getCitation();
    
    /**
     * Sets the "citation" element
     */
    void setCitation(org.rostlab.predictprotein.CitationType citation);
    
    /**
     * Appends and returns a new empty "citation" element
     */
    org.rostlab.predictprotein.CitationType addNewCitation();
    
    /**
     * Gets array of all "scope" elements
     */
    java.lang.String[] getScopeArray();
    
    /**
     * Gets ith "scope" element
     */
    java.lang.String getScopeArray(int i);
    
    /**
     * Gets (as xml) array of all "scope" elements
     */
    org.apache.xmlbeans.XmlString[] xgetScopeArray();
    
    /**
     * Gets (as xml) ith "scope" element
     */
    org.apache.xmlbeans.XmlString xgetScopeArray(int i);
    
    /**
     * Returns number of "scope" element
     */
    int sizeOfScopeArray();
    
    /**
     * Sets array of all "scope" element
     */
    void setScopeArray(java.lang.String[] scopeArray);
    
    /**
     * Sets ith "scope" element
     */
    void setScopeArray(int i, java.lang.String scope);
    
    /**
     * Sets (as xml) array of all "scope" element
     */
    void xsetScopeArray(org.apache.xmlbeans.XmlString[] scopeArray);
    
    /**
     * Sets (as xml) ith "scope" element
     */
    void xsetScopeArray(int i, org.apache.xmlbeans.XmlString scope);
    
    /**
     * Inserts the value as the ith "scope" element
     */
    void insertScope(int i, java.lang.String scope);
    
    /**
     * Appends the value as the last "scope" element
     */
    void addScope(java.lang.String scope);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scope" element
     */
    org.apache.xmlbeans.XmlString insertNewScope(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scope" element
     */
    org.apache.xmlbeans.XmlString addNewScope();
    
    /**
     * Removes the ith "scope" element
     */
    void removeScope(int i);
    
    /**
     * Gets the "source" element
     */
    org.rostlab.predictprotein.SourceDataType getSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(org.rostlab.predictprotein.SourceDataType source);
    
    /**
     * Appends and returns a new empty "source" element
     */
    org.rostlab.predictprotein.SourceDataType addNewSource();
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.ReferenceType newInstance() {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.ReferenceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.ReferenceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.ReferenceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.ReferenceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.ReferenceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.ReferenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
