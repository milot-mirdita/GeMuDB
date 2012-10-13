/*
 * XML Type:  alignmentType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.AlignmentType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML alignmentType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface AlignmentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlignmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("alignmenttype0a3atype");
    
    /**
     * Gets the "dbReference" element
     */
    org.rostlab.predictprotein.DbReferenceType getDbReference();
    
    /**
     * Sets the "dbReference" element
     */
    void setDbReference(org.rostlab.predictprotein.DbReferenceType dbReference);
    
    /**
     * Appends and returns a new empty "dbReference" element
     */
    org.rostlab.predictprotein.DbReferenceType addNewDbReference();
    
    /**
     * Gets the "score" element
     */
    org.rostlab.predictprotein.ReqFloatValueType getScore();
    
    /**
     * True if has "score" element
     */
    boolean isSetScore();
    
    /**
     * Sets the "score" element
     */
    void setScore(org.rostlab.predictprotein.ReqFloatValueType score);
    
    /**
     * Appends and returns a new empty "score" element
     */
    org.rostlab.predictprotein.ReqFloatValueType addNewScore();
    
    /**
     * Unsets the "score" element
     */
    void unsetScore();
    
    /**
     * Gets the "bitscore" element
     */
    org.rostlab.predictprotein.ReqFloatValueType getBitscore();
    
    /**
     * True if has "bitscore" element
     */
    boolean isSetBitscore();
    
    /**
     * Sets the "bitscore" element
     */
    void setBitscore(org.rostlab.predictprotein.ReqFloatValueType bitscore);
    
    /**
     * Appends and returns a new empty "bitscore" element
     */
    org.rostlab.predictprotein.ReqFloatValueType addNewBitscore();
    
    /**
     * Unsets the "bitscore" element
     */
    void unsetBitscore();
    
    /**
     * Gets the "expect" element
     */
    org.rostlab.predictprotein.ReqFloatValueType getExpect();
    
    /**
     * True if has "expect" element
     */
    boolean isSetExpect();
    
    /**
     * Sets the "expect" element
     */
    void setExpect(org.rostlab.predictprotein.ReqFloatValueType expect);
    
    /**
     * Appends and returns a new empty "expect" element
     */
    org.rostlab.predictprotein.ReqFloatValueType addNewExpect();
    
    /**
     * Unsets the "expect" element
     */
    void unsetExpect();
    
    /**
     * Gets the "identity" element
     */
    org.rostlab.predictprotein.ReqFloatValueType getIdentity();
    
    /**
     * Sets the "identity" element
     */
    void setIdentity(org.rostlab.predictprotein.ReqFloatValueType identity);
    
    /**
     * Appends and returns a new empty "identity" element
     */
    org.rostlab.predictprotein.ReqFloatValueType addNewIdentity();
    
    /**
     * Gets the "matchLen" element
     */
    org.rostlab.predictprotein.ReqIntValueType getMatchLen();
    
    /**
     * Sets the "matchLen" element
     */
    void setMatchLen(org.rostlab.predictprotein.ReqIntValueType matchLen);
    
    /**
     * Appends and returns a new empty "matchLen" element
     */
    org.rostlab.predictprotein.ReqIntValueType addNewMatchLen();
    
    /**
     * Gets the "queryStart" element
     */
    org.rostlab.predictprotein.ReqIntValueType getQueryStart();
    
    /**
     * Sets the "queryStart" element
     */
    void setQueryStart(org.rostlab.predictprotein.ReqIntValueType queryStart);
    
    /**
     * Appends and returns a new empty "queryStart" element
     */
    org.rostlab.predictprotein.ReqIntValueType addNewQueryStart();
    
    /**
     * Gets the "queryEnd" element
     */
    org.rostlab.predictprotein.ReqIntValueType getQueryEnd();
    
    /**
     * Sets the "queryEnd" element
     */
    void setQueryEnd(org.rostlab.predictprotein.ReqIntValueType queryEnd);
    
    /**
     * Appends and returns a new empty "queryEnd" element
     */
    org.rostlab.predictprotein.ReqIntValueType addNewQueryEnd();
    
    /**
     * Gets the "subjectStart" element
     */
    org.rostlab.predictprotein.ReqIntValueType getSubjectStart();
    
    /**
     * Sets the "subjectStart" element
     */
    void setSubjectStart(org.rostlab.predictprotein.ReqIntValueType subjectStart);
    
    /**
     * Appends and returns a new empty "subjectStart" element
     */
    org.rostlab.predictprotein.ReqIntValueType addNewSubjectStart();
    
    /**
     * Gets the "subjectEnd" element
     */
    org.rostlab.predictprotein.ReqIntValueType getSubjectEnd();
    
    /**
     * Sets the "subjectEnd" element
     */
    void setSubjectEnd(org.rostlab.predictprotein.ReqIntValueType subjectEnd);
    
    /**
     * Appends and returns a new empty "subjectEnd" element
     */
    org.rostlab.predictprotein.ReqIntValueType addNewSubjectEnd();
    
    /**
     * Gets the "querySeq" element
     */
    java.lang.String getQuerySeq();
    
    /**
     * Gets (as xml) the "querySeq" element
     */
    org.apache.xmlbeans.XmlString xgetQuerySeq();
    
    /**
     * Sets the "querySeq" element
     */
    void setQuerySeq(java.lang.String querySeq);
    
    /**
     * Sets (as xml) the "querySeq" element
     */
    void xsetQuerySeq(org.apache.xmlbeans.XmlString querySeq);
    
    /**
     * Gets the "subjectSeq" element
     */
    java.lang.String getSubjectSeq();
    
    /**
     * Gets (as xml) the "subjectSeq" element
     */
    org.apache.xmlbeans.XmlString xgetSubjectSeq();
    
    /**
     * Sets the "subjectSeq" element
     */
    void setSubjectSeq(java.lang.String subjectSeq);
    
    /**
     * Sets (as xml) the "subjectSeq" element
     */
    void xsetSubjectSeq(org.apache.xmlbeans.XmlString subjectSeq);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.AlignmentType newInstance() {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.AlignmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.AlignmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.AlignmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.AlignmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.AlignmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.AlignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
