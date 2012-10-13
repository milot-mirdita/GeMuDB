/*
 * XML Type:  evidencedStringType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.EvidencedStringType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML evidencedStringType(@http://rostlab.org/predictprotein).
 *
 * This is an atomic type that is a restriction of org.rostlab.predictprotein.EvidencedStringType.
 */
public interface EvidencedStringType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvidencedStringType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("evidencedstringtyped235type");
    
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
     * Gets the "status" attribute
     */
    org.rostlab.predictprotein.EvidencedStringType.Status.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" attribute
     */
    org.rostlab.predictprotein.EvidencedStringType.Status xgetStatus();
    
    /**
     * True if has "status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" attribute
     */
    void setStatus(org.rostlab.predictprotein.EvidencedStringType.Status.Enum status);
    
    /**
     * Sets (as xml) the "status" attribute
     */
    void xsetStatus(org.rostlab.predictprotein.EvidencedStringType.Status status);
    
    /**
     * Unsets the "status" attribute
     */
    void unsetStatus();
    
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.EvidencedStringType$Status.
     */
    public interface Status extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("statusc747attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum BY_SIMILARITY = Enum.forString("By similarity");
        static final Enum PROBABLE = Enum.forString("Probable");
        static final Enum POTENTIAL = Enum.forString("Potential");
        
        static final int INT_BY_SIMILARITY = Enum.INT_BY_SIMILARITY;
        static final int INT_PROBABLE = Enum.INT_PROBABLE;
        static final int INT_POTENTIAL = Enum.INT_POTENTIAL;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.EvidencedStringType$Status.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_BY_SIMILARITY
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_BY_SIMILARITY = 1;
            static final int INT_PROBABLE = 2;
            static final int INT_POTENTIAL = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("By similarity", INT_BY_SIMILARITY),
                    new Enum("Probable", INT_PROBABLE),
                    new Enum("Potential", INT_POTENTIAL),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.EvidencedStringType.Status newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.EvidencedStringType.Status) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.EvidencedStringType.Status newInstance() {
              return (org.rostlab.predictprotein.EvidencedStringType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.EvidencedStringType.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.EvidencedStringType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.EvidencedStringType newInstance() {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.EvidencedStringType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.EvidencedStringType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.EvidencedStringType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.EvidencedStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
