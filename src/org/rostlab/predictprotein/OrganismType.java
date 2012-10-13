/*
 * XML Type:  organismType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.OrganismType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML organismType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface OrganismType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganismType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("organismtype5e1btype");
    
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
     * Gets array of all "name" elements
     */
    org.rostlab.predictprotein.OrganismNameType[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    org.rostlab.predictprotein.OrganismNameType getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.rostlab.predictprotein.OrganismNameType[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.rostlab.predictprotein.OrganismNameType name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.rostlab.predictprotein.OrganismNameType insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.rostlab.predictprotein.OrganismNameType addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
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
     * Gets the "lineage" element
     */
    org.rostlab.predictprotein.OrganismType.Lineage getLineage();
    
    /**
     * True if has "lineage" element
     */
    boolean isSetLineage();
    
    /**
     * Sets the "lineage" element
     */
    void setLineage(org.rostlab.predictprotein.OrganismType.Lineage lineage);
    
    /**
     * Appends and returns a new empty "lineage" element
     */
    org.rostlab.predictprotein.OrganismType.Lineage addNewLineage();
    
    /**
     * Unsets the "lineage" element
     */
    void unsetLineage();
    
    /**
     * An XML lineage(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Lineage extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Lineage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("lineageb604elemtype");
        
        /**
         * Gets array of all "taxon" elements
         */
        java.lang.String[] getTaxonArray();
        
        /**
         * Gets ith "taxon" element
         */
        java.lang.String getTaxonArray(int i);
        
        /**
         * Gets (as xml) array of all "taxon" elements
         */
        org.apache.xmlbeans.XmlString[] xgetTaxonArray();
        
        /**
         * Gets (as xml) ith "taxon" element
         */
        org.apache.xmlbeans.XmlString xgetTaxonArray(int i);
        
        /**
         * Returns number of "taxon" element
         */
        int sizeOfTaxonArray();
        
        /**
         * Sets array of all "taxon" element
         */
        void setTaxonArray(java.lang.String[] taxonArray);
        
        /**
         * Sets ith "taxon" element
         */
        void setTaxonArray(int i, java.lang.String taxon);
        
        /**
         * Sets (as xml) array of all "taxon" element
         */
        void xsetTaxonArray(org.apache.xmlbeans.XmlString[] taxonArray);
        
        /**
         * Sets (as xml) ith "taxon" element
         */
        void xsetTaxonArray(int i, org.apache.xmlbeans.XmlString taxon);
        
        /**
         * Inserts the value as the ith "taxon" element
         */
        void insertTaxon(int i, java.lang.String taxon);
        
        /**
         * Appends the value as the last "taxon" element
         */
        void addTaxon(java.lang.String taxon);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taxon" element
         */
        org.apache.xmlbeans.XmlString insertNewTaxon(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taxon" element
         */
        org.apache.xmlbeans.XmlString addNewTaxon();
        
        /**
         * Removes the ith "taxon" element
         */
        void removeTaxon(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.OrganismType.Lineage newInstance() {
              return (org.rostlab.predictprotein.OrganismType.Lineage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.OrganismType.Lineage newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.OrganismType.Lineage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.OrganismType newInstance() {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.OrganismType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.OrganismType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.OrganismType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.OrganismType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.OrganismType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.OrganismType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
