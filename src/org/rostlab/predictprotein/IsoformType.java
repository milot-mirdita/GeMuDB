/*
 * XML Type:  isoformType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.IsoformType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML isoformType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface IsoformType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsoformType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("isoformtype9860type");
    
    /**
     * Gets array of all "id" elements
     */
    java.lang.String[] getIdArray();
    
    /**
     * Gets ith "id" element
     */
    java.lang.String getIdArray(int i);
    
    /**
     * Gets (as xml) array of all "id" elements
     */
    org.apache.xmlbeans.XmlString[] xgetIdArray();
    
    /**
     * Gets (as xml) ith "id" element
     */
    org.apache.xmlbeans.XmlString xgetIdArray(int i);
    
    /**
     * Returns number of "id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "id" element
     */
    void setIdArray(java.lang.String[] idArray);
    
    /**
     * Sets ith "id" element
     */
    void setIdArray(int i, java.lang.String id);
    
    /**
     * Sets (as xml) array of all "id" element
     */
    void xsetIdArray(org.apache.xmlbeans.XmlString[] idArray);
    
    /**
     * Sets (as xml) ith "id" element
     */
    void xsetIdArray(int i, org.apache.xmlbeans.XmlString id);
    
    /**
     * Inserts the value as the ith "id" element
     */
    void insertId(int i, java.lang.String id);
    
    /**
     * Appends the value as the last "id" element
     */
    void addId(java.lang.String id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    org.apache.xmlbeans.XmlString insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    org.apache.xmlbeans.XmlString addNewId();
    
    /**
     * Removes the ith "id" element
     */
    void removeId(int i);
    
    /**
     * Gets array of all "name" elements
     */
    org.rostlab.predictprotein.IsoformType.Name[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    org.rostlab.predictprotein.IsoformType.Name getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.rostlab.predictprotein.IsoformType.Name[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.rostlab.predictprotein.IsoformType.Name name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.rostlab.predictprotein.IsoformType.Name insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.rostlab.predictprotein.IsoformType.Name addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
    /**
     * Gets the "sequence" element
     */
    org.rostlab.predictprotein.IsoformType.Sequence getSequence();
    
    /**
     * Sets the "sequence" element
     */
    void setSequence(org.rostlab.predictprotein.IsoformType.Sequence sequence);
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    org.rostlab.predictprotein.IsoformType.Sequence addNewSequence();
    
    /**
     * Gets the "note" element
     */
    org.rostlab.predictprotein.IsoformType.Note getNote();
    
    /**
     * True if has "note" element
     */
    boolean isSetNote();
    
    /**
     * Sets the "note" element
     */
    void setNote(org.rostlab.predictprotein.IsoformType.Note note);
    
    /**
     * Appends and returns a new empty "note" element
     */
    org.rostlab.predictprotein.IsoformType.Note addNewNote();
    
    /**
     * Unsets the "note" element
     */
    void unsetNote();
    
    /**
     * An XML name(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.IsoformType$Name.
     */
    public interface Name extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("name8587elemtype");
        
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
            public static org.rostlab.predictprotein.IsoformType.Name newInstance() {
              return (org.rostlab.predictprotein.IsoformType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.IsoformType.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.IsoformType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML sequence(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Sequence extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sequence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("sequencef2bdelemtype");
        
        /**
         * Gets the "type" attribute
         */
        org.rostlab.predictprotein.IsoformType.Sequence.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.rostlab.predictprotein.IsoformType.Sequence.Type xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(org.rostlab.predictprotein.IsoformType.Sequence.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.rostlab.predictprotein.IsoformType.Sequence.Type type);
        
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
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of org.rostlab.predictprotein.IsoformType$Sequence$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("typea923attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NOT_DESCRIBED = Enum.forString("not described");
            static final Enum DESCRIBED = Enum.forString("described");
            static final Enum DISPLAYED = Enum.forString("displayed");
            static final Enum EXTERNAL = Enum.forString("external");
            
            static final int INT_NOT_DESCRIBED = Enum.INT_NOT_DESCRIBED;
            static final int INT_DESCRIBED = Enum.INT_DESCRIBED;
            static final int INT_DISPLAYED = Enum.INT_DISPLAYED;
            static final int INT_EXTERNAL = Enum.INT_EXTERNAL;
            
            /**
             * Enumeration value class for org.rostlab.predictprotein.IsoformType$Sequence$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NOT_DESCRIBED
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
                
                static final int INT_NOT_DESCRIBED = 1;
                static final int INT_DESCRIBED = 2;
                static final int INT_DISPLAYED = 3;
                static final int INT_EXTERNAL = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("not described", INT_NOT_DESCRIBED),
                      new Enum("described", INT_DESCRIBED),
                      new Enum("displayed", INT_DISPLAYED),
                      new Enum("external", INT_EXTERNAL),
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
                public static org.rostlab.predictprotein.IsoformType.Sequence.Type newValue(java.lang.Object obj) {
                  return (org.rostlab.predictprotein.IsoformType.Sequence.Type) type.newValue( obj ); }
                
                public static org.rostlab.predictprotein.IsoformType.Sequence.Type newInstance() {
                  return (org.rostlab.predictprotein.IsoformType.Sequence.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.IsoformType.Sequence.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.IsoformType.Sequence.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.IsoformType.Sequence newInstance() {
              return (org.rostlab.predictprotein.IsoformType.Sequence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.IsoformType.Sequence newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.IsoformType.Sequence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML note(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.IsoformType$Note.
     */
    public interface Note extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Note.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("noteb0eeelemtype");
        
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
            public static org.rostlab.predictprotein.IsoformType.Note newInstance() {
              return (org.rostlab.predictprotein.IsoformType.Note) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.IsoformType.Note newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.IsoformType.Note) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.IsoformType newInstance() {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.IsoformType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.IsoformType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.IsoformType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.IsoformType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.IsoformType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.IsoformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
