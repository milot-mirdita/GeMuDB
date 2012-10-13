/*
 * XML Type:  sequenceType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SequenceType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML sequenceType(@http://rostlab.org/predictprotein).
 *
 * This is an atomic type that is a restriction of org.rostlab.predictprotein.SequenceType.
 */
public interface SequenceType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SequenceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("sequencetypea9catype");
    
    /**
     * Gets the "length" attribute
     */
    java.math.BigInteger getLength();
    
    /**
     * Gets (as xml) the "length" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetLength();
    
    /**
     * Sets the "length" attribute
     */
    void setLength(java.math.BigInteger length);
    
    /**
     * Sets (as xml) the "length" attribute
     */
    void xsetLength(org.apache.xmlbeans.XmlInteger length);
    
    /**
     * Gets the "mass" attribute
     */
    java.math.BigInteger getMass();
    
    /**
     * Gets (as xml) the "mass" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetMass();
    
    /**
     * True if has "mass" attribute
     */
    boolean isSetMass();
    
    /**
     * Sets the "mass" attribute
     */
    void setMass(java.math.BigInteger mass);
    
    /**
     * Sets (as xml) the "mass" attribute
     */
    void xsetMass(org.apache.xmlbeans.XmlInteger mass);
    
    /**
     * Unsets the "mass" attribute
     */
    void unsetMass();
    
    /**
     * Gets the "checksum" attribute
     */
    java.lang.String getChecksum();
    
    /**
     * Gets (as xml) the "checksum" attribute
     */
    org.apache.xmlbeans.XmlString xgetChecksum();
    
    /**
     * True if has "checksum" attribute
     */
    boolean isSetChecksum();
    
    /**
     * Sets the "checksum" attribute
     */
    void setChecksum(java.lang.String checksum);
    
    /**
     * Sets (as xml) the "checksum" attribute
     */
    void xsetChecksum(org.apache.xmlbeans.XmlString checksum);
    
    /**
     * Unsets the "checksum" attribute
     */
    void unsetChecksum();
    
    /**
     * Gets the "modified" attribute
     */
    java.util.Calendar getModified();
    
    /**
     * Gets (as xml) the "modified" attribute
     */
    org.apache.xmlbeans.XmlDate xgetModified();
    
    /**
     * Sets the "modified" attribute
     */
    void setModified(java.util.Calendar modified);
    
    /**
     * Sets (as xml) the "modified" attribute
     */
    void xsetModified(org.apache.xmlbeans.XmlDate modified);
    
    /**
     * Gets the "version" attribute
     */
    java.math.BigInteger getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(java.math.BigInteger version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.apache.xmlbeans.XmlInteger version);
    
    /**
     * Gets the "precursor" attribute
     */
    boolean getPrecursor();
    
    /**
     * Gets (as xml) the "precursor" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPrecursor();
    
    /**
     * True if has "precursor" attribute
     */
    boolean isSetPrecursor();
    
    /**
     * Sets the "precursor" attribute
     */
    void setPrecursor(boolean precursor);
    
    /**
     * Sets (as xml) the "precursor" attribute
     */
    void xsetPrecursor(org.apache.xmlbeans.XmlBoolean precursor);
    
    /**
     * Unsets the "precursor" attribute
     */
    void unsetPrecursor();
    
    /**
     * Gets the "fragment" attribute
     */
    org.rostlab.predictprotein.SequenceType.Fragment.Enum getFragment();
    
    /**
     * Gets (as xml) the "fragment" attribute
     */
    org.rostlab.predictprotein.SequenceType.Fragment xgetFragment();
    
    /**
     * True if has "fragment" attribute
     */
    boolean isSetFragment();
    
    /**
     * Sets the "fragment" attribute
     */
    void setFragment(org.rostlab.predictprotein.SequenceType.Fragment.Enum fragment);
    
    /**
     * Sets (as xml) the "fragment" attribute
     */
    void xsetFragment(org.rostlab.predictprotein.SequenceType.Fragment fragment);
    
    /**
     * Unsets the "fragment" attribute
     */
    void unsetFragment();
    
    /**
     * An XML fragment(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SequenceType$Fragment.
     */
    public interface Fragment extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fragment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("fragment095aattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum SINGLE = Enum.forString("single");
        static final Enum MULTIPLE = Enum.forString("multiple");
        
        static final int INT_SINGLE = Enum.INT_SINGLE;
        static final int INT_MULTIPLE = Enum.INT_MULTIPLE;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.SequenceType$Fragment.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SINGLE
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
            
            static final int INT_SINGLE = 1;
            static final int INT_MULTIPLE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("single", INT_SINGLE),
                    new Enum("multiple", INT_MULTIPLE),
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
            public static org.rostlab.predictprotein.SequenceType.Fragment newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.SequenceType.Fragment) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.SequenceType.Fragment newInstance() {
              return (org.rostlab.predictprotein.SequenceType.Fragment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.SequenceType.Fragment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.SequenceType.Fragment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.SequenceType newInstance() {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.SequenceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.SequenceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.SequenceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.SequenceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.SequenceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.SequenceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
