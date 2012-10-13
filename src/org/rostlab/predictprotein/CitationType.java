/*
 * XML Type:  citationType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.CitationType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML citationType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface CitationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("citationtypeb070type");
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "editorList" element
     */
    org.rostlab.predictprotein.NameListType getEditorList();
    
    /**
     * True if has "editorList" element
     */
    boolean isSetEditorList();
    
    /**
     * Sets the "editorList" element
     */
    void setEditorList(org.rostlab.predictprotein.NameListType editorList);
    
    /**
     * Appends and returns a new empty "editorList" element
     */
    org.rostlab.predictprotein.NameListType addNewEditorList();
    
    /**
     * Unsets the "editorList" element
     */
    void unsetEditorList();
    
    /**
     * Gets the "authorList" element
     */
    org.rostlab.predictprotein.NameListType getAuthorList();
    
    /**
     * True if has "authorList" element
     */
    boolean isSetAuthorList();
    
    /**
     * Sets the "authorList" element
     */
    void setAuthorList(org.rostlab.predictprotein.NameListType authorList);
    
    /**
     * Appends and returns a new empty "authorList" element
     */
    org.rostlab.predictprotein.NameListType addNewAuthorList();
    
    /**
     * Unsets the "authorList" element
     */
    void unsetAuthorList();
    
    /**
     * Gets the "locator" element
     */
    java.lang.String getLocator();
    
    /**
     * Gets (as xml) the "locator" element
     */
    org.apache.xmlbeans.XmlString xgetLocator();
    
    /**
     * True if has "locator" element
     */
    boolean isSetLocator();
    
    /**
     * Sets the "locator" element
     */
    void setLocator(java.lang.String locator);
    
    /**
     * Sets (as xml) the "locator" element
     */
    void xsetLocator(org.apache.xmlbeans.XmlString locator);
    
    /**
     * Unsets the "locator" element
     */
    void unsetLocator();
    
    /**
     * Gets array of all "dbReference" elements
     */
    org.rostlab.predictprotein.DbReferenceType[] getDbReferenceArray();
    
    /**
     * Gets ith "dbReference" element
     */
    org.rostlab.predictprotein.DbReferenceType getDbReferenceArray(int i);
    
    /**
     * Returns number of "dbReference" element
     */
    int sizeOfDbReferenceArray();
    
    /**
     * Sets array of all "dbReference" element
     */
    void setDbReferenceArray(org.rostlab.predictprotein.DbReferenceType[] dbReferenceArray);
    
    /**
     * Sets ith "dbReference" element
     */
    void setDbReferenceArray(int i, org.rostlab.predictprotein.DbReferenceType dbReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dbReference" element
     */
    org.rostlab.predictprotein.DbReferenceType insertNewDbReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dbReference" element
     */
    org.rostlab.predictprotein.DbReferenceType addNewDbReference();
    
    /**
     * Removes the ith "dbReference" element
     */
    void removeDbReference(int i);
    
    /**
     * Gets the "citingCitation" element
     */
    org.rostlab.predictprotein.CitationType getCitingCitation();
    
    /**
     * True if has "citingCitation" element
     */
    boolean isSetCitingCitation();
    
    /**
     * Sets the "citingCitation" element
     */
    void setCitingCitation(org.rostlab.predictprotein.CitationType citingCitation);
    
    /**
     * Appends and returns a new empty "citingCitation" element
     */
    org.rostlab.predictprotein.CitationType addNewCitingCitation();
    
    /**
     * Unsets the "citingCitation" element
     */
    void unsetCitingCitation();
    
    /**
     * Gets the "type" attribute
     */
    org.rostlab.predictprotein.CitationType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.rostlab.predictprotein.CitationType.Type xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.rostlab.predictprotein.CitationType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.rostlab.predictprotein.CitationType.Type type);
    
    /**
     * Gets the "date" attribute
     */
    java.util.Calendar getDate();
    
    /**
     * Gets (as xml) the "date" attribute
     */
    org.rostlab.predictprotein.CitationType.Date xgetDate();
    
    /**
     * True if has "date" attribute
     */
    boolean isSetDate();
    
    /**
     * Sets the "date" attribute
     */
    void setDate(java.util.Calendar date);
    
    /**
     * Sets (as xml) the "date" attribute
     */
    void xsetDate(org.rostlab.predictprotein.CitationType.Date date);
    
    /**
     * Unsets the "date" attribute
     */
    void unsetDate();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "volume" attribute
     */
    java.lang.String getVolume();
    
    /**
     * Gets (as xml) the "volume" attribute
     */
    org.apache.xmlbeans.XmlString xgetVolume();
    
    /**
     * True if has "volume" attribute
     */
    boolean isSetVolume();
    
    /**
     * Sets the "volume" attribute
     */
    void setVolume(java.lang.String volume);
    
    /**
     * Sets (as xml) the "volume" attribute
     */
    void xsetVolume(org.apache.xmlbeans.XmlString volume);
    
    /**
     * Unsets the "volume" attribute
     */
    void unsetVolume();
    
    /**
     * Gets the "first" attribute
     */
    java.lang.String getFirst();
    
    /**
     * Gets (as xml) the "first" attribute
     */
    org.apache.xmlbeans.XmlString xgetFirst();
    
    /**
     * True if has "first" attribute
     */
    boolean isSetFirst();
    
    /**
     * Sets the "first" attribute
     */
    void setFirst(java.lang.String first);
    
    /**
     * Sets (as xml) the "first" attribute
     */
    void xsetFirst(org.apache.xmlbeans.XmlString first);
    
    /**
     * Unsets the "first" attribute
     */
    void unsetFirst();
    
    /**
     * Gets the "last" attribute
     */
    java.lang.String getLast();
    
    /**
     * Gets (as xml) the "last" attribute
     */
    org.apache.xmlbeans.XmlString xgetLast();
    
    /**
     * True if has "last" attribute
     */
    boolean isSetLast();
    
    /**
     * Sets the "last" attribute
     */
    void setLast(java.lang.String last);
    
    /**
     * Sets (as xml) the "last" attribute
     */
    void xsetLast(org.apache.xmlbeans.XmlString last);
    
    /**
     * Unsets the "last" attribute
     */
    void unsetLast();
    
    /**
     * Gets the "publisher" attribute
     */
    java.lang.String getPublisher();
    
    /**
     * Gets (as xml) the "publisher" attribute
     */
    org.apache.xmlbeans.XmlString xgetPublisher();
    
    /**
     * True if has "publisher" attribute
     */
    boolean isSetPublisher();
    
    /**
     * Sets the "publisher" attribute
     */
    void setPublisher(java.lang.String publisher);
    
    /**
     * Sets (as xml) the "publisher" attribute
     */
    void xsetPublisher(org.apache.xmlbeans.XmlString publisher);
    
    /**
     * Unsets the "publisher" attribute
     */
    void unsetPublisher();
    
    /**
     * Gets the "city" attribute
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "city" attribute
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * True if has "city" attribute
     */
    boolean isSetCity();
    
    /**
     * Sets the "city" attribute
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "city" attribute
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Unsets the "city" attribute
     */
    void unsetCity();
    
    /**
     * Gets the "db" attribute
     */
    java.lang.String getDb();
    
    /**
     * Gets (as xml) the "db" attribute
     */
    org.apache.xmlbeans.XmlString xgetDb();
    
    /**
     * True if has "db" attribute
     */
    boolean isSetDb();
    
    /**
     * Sets the "db" attribute
     */
    void setDb(java.lang.String db);
    
    /**
     * Sets (as xml) the "db" attribute
     */
    void xsetDb(org.apache.xmlbeans.XmlString db);
    
    /**
     * Unsets the "db" attribute
     */
    void unsetDb();
    
    /**
     * Gets the "country" attribute
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "country" attribute
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "country" attribute
     */
    boolean isSetCountry();
    
    /**
     * Sets the "country" attribute
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "country" attribute
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "country" attribute
     */
    void unsetCountry();
    
    /**
     * Gets the "number" attribute
     */
    java.lang.String getNumber();
    
    /**
     * Gets (as xml) the "number" attribute
     */
    org.apache.xmlbeans.XmlString xgetNumber();
    
    /**
     * True if has "number" attribute
     */
    boolean isSetNumber();
    
    /**
     * Sets the "number" attribute
     */
    void setNumber(java.lang.String number);
    
    /**
     * Sets (as xml) the "number" attribute
     */
    void xsetNumber(org.apache.xmlbeans.XmlString number);
    
    /**
     * Unsets the "number" attribute
     */
    void unsetNumber();
    
    /**
     * Gets the "institute" attribute
     */
    java.lang.String getInstitute();
    
    /**
     * Gets (as xml) the "institute" attribute
     */
    org.apache.xmlbeans.XmlString xgetInstitute();
    
    /**
     * True if has "institute" attribute
     */
    boolean isSetInstitute();
    
    /**
     * Sets the "institute" attribute
     */
    void setInstitute(java.lang.String institute);
    
    /**
     * Sets (as xml) the "institute" attribute
     */
    void xsetInstitute(org.apache.xmlbeans.XmlString institute);
    
    /**
     * Unsets the "institute" attribute
     */
    void unsetInstitute();
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.CitationType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("type0e56attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum BOOK = Enum.forString("book");
        static final Enum JOURNAL_ARTICLE = Enum.forString("journal article");
        static final Enum ONLINE_JOURNAL_ARTICLE = Enum.forString("online journal article");
        static final Enum PATENT = Enum.forString("patent");
        static final Enum SUBMISSION = Enum.forString("submission");
        static final Enum THESIS = Enum.forString("thesis");
        static final Enum UNPUBLISHED_OBSERVATIONS = Enum.forString("unpublished observations");
        static final Enum UNPUBLISHED_RESULTS = Enum.forString("unpublished results");
        
        static final int INT_BOOK = Enum.INT_BOOK;
        static final int INT_JOURNAL_ARTICLE = Enum.INT_JOURNAL_ARTICLE;
        static final int INT_ONLINE_JOURNAL_ARTICLE = Enum.INT_ONLINE_JOURNAL_ARTICLE;
        static final int INT_PATENT = Enum.INT_PATENT;
        static final int INT_SUBMISSION = Enum.INT_SUBMISSION;
        static final int INT_THESIS = Enum.INT_THESIS;
        static final int INT_UNPUBLISHED_OBSERVATIONS = Enum.INT_UNPUBLISHED_OBSERVATIONS;
        static final int INT_UNPUBLISHED_RESULTS = Enum.INT_UNPUBLISHED_RESULTS;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.CitationType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_BOOK
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
            
            static final int INT_BOOK = 1;
            static final int INT_JOURNAL_ARTICLE = 2;
            static final int INT_ONLINE_JOURNAL_ARTICLE = 3;
            static final int INT_PATENT = 4;
            static final int INT_SUBMISSION = 5;
            static final int INT_THESIS = 6;
            static final int INT_UNPUBLISHED_OBSERVATIONS = 7;
            static final int INT_UNPUBLISHED_RESULTS = 8;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("book", INT_BOOK),
                    new Enum("journal article", INT_JOURNAL_ARTICLE),
                    new Enum("online journal article", INT_ONLINE_JOURNAL_ARTICLE),
                    new Enum("patent", INT_PATENT),
                    new Enum("submission", INT_SUBMISSION),
                    new Enum("thesis", INT_THESIS),
                    new Enum("unpublished observations", INT_UNPUBLISHED_OBSERVATIONS),
                    new Enum("unpublished results", INT_UNPUBLISHED_RESULTS),
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
            public static org.rostlab.predictprotein.CitationType.Type newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.CitationType.Type) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.CitationType.Type newInstance() {
              return (org.rostlab.predictprotein.CitationType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CitationType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CitationType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML date(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlDate
     *     org.apache.xmlbeans.XmlGYearMonth
     *     org.apache.xmlbeans.XmlGYear
     */
    public interface Date extends org.apache.xmlbeans.XmlAnySimpleType
    {
        java.lang.Object getObjectValue();
        void setObjectValue(java.lang.Object val);
        /** @deprecated */
        java.lang.Object objectValue();
        /** @deprecated */
        void objectSet(java.lang.Object val);
        org.apache.xmlbeans.SchemaType instanceType();
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("datef462attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.CitationType.Date newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.CitationType.Date) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.CitationType.Date newInstance() {
              return (org.rostlab.predictprotein.CitationType.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CitationType.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CitationType.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.CitationType newInstance() {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.CitationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.CitationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.CitationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.CitationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.CitationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.CitationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.CitationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.CitationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
