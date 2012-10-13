/*
 * XML Type:  positionType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PositionType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML positionType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface PositionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PositionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("positiontype7d32type");
    
    /**
     * Gets the "position" attribute
     */
    java.math.BigInteger getPosition();
    
    /**
     * Gets (as xml) the "position" attribute
     */
    org.apache.xmlbeans.XmlUnsignedLong xgetPosition();
    
    /**
     * True if has "position" attribute
     */
    boolean isSetPosition();
    
    /**
     * Sets the "position" attribute
     */
    void setPosition(java.math.BigInteger position);
    
    /**
     * Sets (as xml) the "position" attribute
     */
    void xsetPosition(org.apache.xmlbeans.XmlUnsignedLong position);
    
    /**
     * Unsets the "position" attribute
     */
    void unsetPosition();
    
    /**
     * Gets the "status" attribute
     */
    org.rostlab.predictprotein.PositionType.Status.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" attribute
     */
    org.rostlab.predictprotein.PositionType.Status xgetStatus();
    
    /**
     * True if has "status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" attribute
     */
    void setStatus(org.rostlab.predictprotein.PositionType.Status.Enum status);
    
    /**
     * Sets (as xml) the "status" attribute
     */
    void xsetStatus(org.rostlab.predictprotein.PositionType.Status status);
    
    /**
     * Unsets the "status" attribute
     */
    void unsetStatus();
    
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.PositionType$Status.
     */
    public interface Status extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("status3860attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CERTAIN = Enum.forString("certain");
        static final Enum UNCERTAIN = Enum.forString("uncertain");
        static final Enum LESS_THAN = Enum.forString("less than");
        static final Enum GREATER_THAN = Enum.forString("greater than");
        static final Enum UNKNOWN = Enum.forString("unknown");
        
        static final int INT_CERTAIN = Enum.INT_CERTAIN;
        static final int INT_UNCERTAIN = Enum.INT_UNCERTAIN;
        static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
        static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
        static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.PositionType$Status.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CERTAIN
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
            
            static final int INT_CERTAIN = 1;
            static final int INT_UNCERTAIN = 2;
            static final int INT_LESS_THAN = 3;
            static final int INT_GREATER_THAN = 4;
            static final int INT_UNKNOWN = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("certain", INT_CERTAIN),
                    new Enum("uncertain", INT_UNCERTAIN),
                    new Enum("less than", INT_LESS_THAN),
                    new Enum("greater than", INT_GREATER_THAN),
                    new Enum("unknown", INT_UNKNOWN),
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
            public static org.rostlab.predictprotein.PositionType.Status newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.PositionType.Status) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.PositionType.Status newInstance() {
              return (org.rostlab.predictprotein.PositionType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.PositionType.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.PositionType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.PositionType newInstance() {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.PositionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.PositionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.PositionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.PositionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.PositionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.PositionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.PositionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.PositionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.PositionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
