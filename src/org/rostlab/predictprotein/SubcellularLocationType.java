/*
 * XML Type:  subcellularLocationType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SubcellularLocationType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML subcellularLocationType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface SubcellularLocationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubcellularLocationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("subcellularlocationtype7c16type");
    
    /**
     * Gets array of all "location" elements
     */
    org.rostlab.predictprotein.EvidencedStringType[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    org.rostlab.predictprotein.EvidencedStringType getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(org.rostlab.predictprotein.EvidencedStringType[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, org.rostlab.predictprotein.EvidencedStringType location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    org.rostlab.predictprotein.EvidencedStringType insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
    /**
     * Gets array of all "topology" elements
     */
    org.rostlab.predictprotein.EvidencedStringType[] getTopologyArray();
    
    /**
     * Gets ith "topology" element
     */
    org.rostlab.predictprotein.EvidencedStringType getTopologyArray(int i);
    
    /**
     * Returns number of "topology" element
     */
    int sizeOfTopologyArray();
    
    /**
     * Sets array of all "topology" element
     */
    void setTopologyArray(org.rostlab.predictprotein.EvidencedStringType[] topologyArray);
    
    /**
     * Sets ith "topology" element
     */
    void setTopologyArray(int i, org.rostlab.predictprotein.EvidencedStringType topology);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topology" element
     */
    org.rostlab.predictprotein.EvidencedStringType insertNewTopology(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topology" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewTopology();
    
    /**
     * Removes the ith "topology" element
     */
    void removeTopology(int i);
    
    /**
     * Gets array of all "orientation" elements
     */
    org.rostlab.predictprotein.EvidencedStringType[] getOrientationArray();
    
    /**
     * Gets ith "orientation" element
     */
    org.rostlab.predictprotein.EvidencedStringType getOrientationArray(int i);
    
    /**
     * Returns number of "orientation" element
     */
    int sizeOfOrientationArray();
    
    /**
     * Sets array of all "orientation" element
     */
    void setOrientationArray(org.rostlab.predictprotein.EvidencedStringType[] orientationArray);
    
    /**
     * Sets ith "orientation" element
     */
    void setOrientationArray(int i, org.rostlab.predictprotein.EvidencedStringType orientation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "orientation" element
     */
    org.rostlab.predictprotein.EvidencedStringType insertNewOrientation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "orientation" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewOrientation();
    
    /**
     * Removes the ith "orientation" element
     */
    void removeOrientation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.SubcellularLocationType newInstance() {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.SubcellularLocationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.SubcellularLocationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.SubcellularLocationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.SubcellularLocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
