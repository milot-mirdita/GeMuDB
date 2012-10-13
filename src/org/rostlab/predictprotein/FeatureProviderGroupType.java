/*
 * XML Type:  featureProviderGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.FeatureProviderGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML featureProviderGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface FeatureProviderGroupType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureProviderGroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("featureprovidergrouptype8f01type");
    
    /**
     * Gets array of all "feature" elements
     */
    org.rostlab.predictprotein.FeatureType[] getFeatureArray();
    
    /**
     * Gets ith "feature" element
     */
    org.rostlab.predictprotein.FeatureType getFeatureArray(int i);
    
    /**
     * Returns number of "feature" element
     */
    int sizeOfFeatureArray();
    
    /**
     * Sets array of all "feature" element
     */
    void setFeatureArray(org.rostlab.predictprotein.FeatureType[] featureArray);
    
    /**
     * Sets ith "feature" element
     */
    void setFeatureArray(int i, org.rostlab.predictprotein.FeatureType feature);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "feature" element
     */
    org.rostlab.predictprotein.FeatureType insertNewFeature(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "feature" element
     */
    org.rostlab.predictprotein.FeatureType addNewFeature();
    
    /**
     * Removes the ith "feature" element
     */
    void removeFeature(int i);
    
    /**
     * Gets array of all "disorderedRegion" elements
     */
    org.rostlab.predictprotein.DisorderedRegionFeatureType[] getDisorderedRegionArray();
    
    /**
     * Gets ith "disorderedRegion" element
     */
    org.rostlab.predictprotein.DisorderedRegionFeatureType getDisorderedRegionArray(int i);
    
    /**
     * Returns number of "disorderedRegion" element
     */
    int sizeOfDisorderedRegionArray();
    
    /**
     * Sets array of all "disorderedRegion" element
     */
    void setDisorderedRegionArray(org.rostlab.predictprotein.DisorderedRegionFeatureType[] disorderedRegionArray);
    
    /**
     * Sets ith "disorderedRegion" element
     */
    void setDisorderedRegionArray(int i, org.rostlab.predictprotein.DisorderedRegionFeatureType disorderedRegion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "disorderedRegion" element
     */
    org.rostlab.predictprotein.DisorderedRegionFeatureType insertNewDisorderedRegion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "disorderedRegion" element
     */
    org.rostlab.predictprotein.DisorderedRegionFeatureType addNewDisorderedRegion();
    
    /**
     * Removes the ith "disorderedRegion" element
     */
    void removeDisorderedRegion(int i);
    
    /**
     * Gets array of all "secondaryStructures" elements
     */
    org.rostlab.predictprotein.SecondaryStructureFeatureType[] getSecondaryStructuresArray();
    
    /**
     * Gets ith "secondaryStructures" element
     */
    org.rostlab.predictprotein.SecondaryStructureFeatureType getSecondaryStructuresArray(int i);
    
    /**
     * Returns number of "secondaryStructures" element
     */
    int sizeOfSecondaryStructuresArray();
    
    /**
     * Sets array of all "secondaryStructures" element
     */
    void setSecondaryStructuresArray(org.rostlab.predictprotein.SecondaryStructureFeatureType[] secondaryStructuresArray);
    
    /**
     * Sets ith "secondaryStructures" element
     */
    void setSecondaryStructuresArray(int i, org.rostlab.predictprotein.SecondaryStructureFeatureType secondaryStructures);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "secondaryStructures" element
     */
    org.rostlab.predictprotein.SecondaryStructureFeatureType insertNewSecondaryStructures(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "secondaryStructures" element
     */
    org.rostlab.predictprotein.SecondaryStructureFeatureType addNewSecondaryStructures();
    
    /**
     * Removes the ith "secondaryStructures" element
     */
    void removeSecondaryStructures(int i);
    
    /**
     * Gets array of all "solventAccessibility" elements
     */
    org.rostlab.predictprotein.SolventAccessibilityFeatureType[] getSolventAccessibilityArray();
    
    /**
     * Gets ith "solventAccessibility" element
     */
    org.rostlab.predictprotein.SolventAccessibilityFeatureType getSolventAccessibilityArray(int i);
    
    /**
     * Returns number of "solventAccessibility" element
     */
    int sizeOfSolventAccessibilityArray();
    
    /**
     * Sets array of all "solventAccessibility" element
     */
    void setSolventAccessibilityArray(org.rostlab.predictprotein.SolventAccessibilityFeatureType[] solventAccessibilityArray);
    
    /**
     * Sets ith "solventAccessibility" element
     */
    void setSolventAccessibilityArray(int i, org.rostlab.predictprotein.SolventAccessibilityFeatureType solventAccessibility);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "solventAccessibility" element
     */
    org.rostlab.predictprotein.SolventAccessibilityFeatureType insertNewSolventAccessibility(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "solventAccessibility" element
     */
    org.rostlab.predictprotein.SolventAccessibilityFeatureType addNewSolventAccessibility();
    
    /**
     * Removes the ith "solventAccessibility" element
     */
    void removeSolventAccessibility(int i);
    
    /**
     * Gets the "provider" attribute
     */
    java.lang.String getProvider();
    
    /**
     * Gets (as xml) the "provider" attribute
     */
    org.apache.xmlbeans.XmlString xgetProvider();
    
    /**
     * Sets the "provider" attribute
     */
    void setProvider(java.lang.String provider);
    
    /**
     * Sets (as xml) the "provider" attribute
     */
    void xsetProvider(org.apache.xmlbeans.XmlString provider);
    
    /**
     * Gets the "description" attribute
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" attribute
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" attribute
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" attribute
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" attribute
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" attribute
     */
    void unsetDescription();
    
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
     * Gets the "predRunRef" attribute
     */
    java.lang.String getPredRunRef();
    
    /**
     * Gets (as xml) the "predRunRef" attribute
     */
    org.apache.xmlbeans.XmlString xgetPredRunRef();
    
    /**
     * True if has "predRunRef" attribute
     */
    boolean isSetPredRunRef();
    
    /**
     * Sets the "predRunRef" attribute
     */
    void setPredRunRef(java.lang.String predRunRef);
    
    /**
     * Sets (as xml) the "predRunRef" attribute
     */
    void xsetPredRunRef(org.apache.xmlbeans.XmlString predRunRef);
    
    /**
     * Unsets the "predRunRef" attribute
     */
    void unsetPredRunRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.FeatureProviderGroupType newInstance() {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.FeatureProviderGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.FeatureProviderGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
