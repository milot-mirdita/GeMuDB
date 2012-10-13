/*
 * XML Type:  solventAccessibilityFeatureType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SolventAccessibilityFeatureType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML solventAccessibilityFeatureType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface SolventAccessibilityFeatureType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SolventAccessibilityFeatureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("solventaccessibilityfeaturetype90c4type");
    
    /**
     * Gets the "location" element
     */
    org.rostlab.predictprotein.LocationType getLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(org.rostlab.predictprotein.LocationType location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    org.rostlab.predictprotein.LocationType addNewLocation();
    
    /**
     * Gets the "featureString" element
     */
    java.lang.String getFeatureString();
    
    /**
     * Gets (as xml) the "featureString" element
     */
    org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString xgetFeatureString();
    
    /**
     * Sets the "featureString" element
     */
    void setFeatureString(java.lang.String featureString);
    
    /**
     * Sets (as xml) the "featureString" element
     */
    void xsetFeatureString(org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString featureString);
    
    /**
     * Gets the "reliability" element
     */
    java.lang.String getReliability();
    
    /**
     * Gets (as xml) the "reliability" element
     */
    org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability xgetReliability();
    
    /**
     * Sets the "reliability" element
     */
    void setReliability(java.lang.String reliability);
    
    /**
     * Sets (as xml) the "reliability" element
     */
    void xsetReliability(org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability reliability);
    
    /**
     * An XML featureString(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SolventAccessibilityFeatureType$FeatureString.
     */
    public interface FeatureString extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureString.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("featurestring9c57elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString newInstance() {
              return (org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.SolventAccessibilityFeatureType.FeatureString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML reliability(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SolventAccessibilityFeatureType$Reliability.
     */
    public interface Reliability extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reliability.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("reliabilityf26aelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability newInstance() {
              return (org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.SolventAccessibilityFeatureType.Reliability) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType newInstance() {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.SolventAccessibilityFeatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.SolventAccessibilityFeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
