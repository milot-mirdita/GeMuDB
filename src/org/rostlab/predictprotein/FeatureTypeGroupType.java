/*
 * XML Type:  featureTypeGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.FeatureTypeGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML featureTypeGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface FeatureTypeGroupType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureTypeGroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("featuretypegrouptype9398type");
    
    /**
     * Gets array of all "featureProviderGroup" elements
     */
    org.rostlab.predictprotein.FeatureProviderGroupType[] getFeatureProviderGroupArray();
    
    /**
     * Gets ith "featureProviderGroup" element
     */
    org.rostlab.predictprotein.FeatureProviderGroupType getFeatureProviderGroupArray(int i);
    
    /**
     * Returns number of "featureProviderGroup" element
     */
    int sizeOfFeatureProviderGroupArray();
    
    /**
     * Sets array of all "featureProviderGroup" element
     */
    void setFeatureProviderGroupArray(org.rostlab.predictprotein.FeatureProviderGroupType[] featureProviderGroupArray);
    
    /**
     * Sets ith "featureProviderGroup" element
     */
    void setFeatureProviderGroupArray(int i, org.rostlab.predictprotein.FeatureProviderGroupType featureProviderGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureProviderGroup" element
     */
    org.rostlab.predictprotein.FeatureProviderGroupType insertNewFeatureProviderGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureProviderGroup" element
     */
    org.rostlab.predictprotein.FeatureProviderGroupType addNewFeatureProviderGroup();
    
    /**
     * Removes the ith "featureProviderGroup" element
     */
    void removeFeatureProviderGroup(int i);
    
    /**
     * Gets the "type" attribute
     */
    org.rostlab.predictprotein.FeatureTypeGroupType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.rostlab.predictprotein.FeatureTypeGroupType.Type xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.rostlab.predictprotein.FeatureTypeGroupType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.rostlab.predictprotein.FeatureTypeGroupType.Type type);
    
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
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.FeatureTypeGroupType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("typeab7eattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum COMPOSITIONALLY_BIASED_REGION = Enum.forString("compositionally biased region");
        static final Enum DISORDERED_REGION = Enum.forString("disordered region");
        static final Enum DISULFIDE_BOND = Enum.forString("disulfide bond");
        static final Enum DNA_BINDING_REGION = Enum.forString("DNA-binding region");
        static final Enum HELICAL_TRANSMEMBRANE_REGION = Enum.forString("helical transmembrane region");
        static final Enum NON_REGULAR_SECONDARY_STRUCTURE = Enum.forString("non-regular secondary structure");
        static final Enum NUCLEAR_LOCALISATION_SIGNAL = Enum.forString("nuclear localisation signal");
        static final Enum PROTEIN_BINDING_REGION = Enum.forString("protein binding region");
        static final Enum SECONDARY_STRUCTURES = Enum.forString("secondary structures");
        static final Enum SECONDARY_STRUCTURE_SWITCH = Enum.forString("secondary structure switch");
        static final Enum SOLVENT_ACCESSIBILITY = Enum.forString("solvent accessibility");
        static final Enum TRANSMEMBRANE_BETA_BARREL = Enum.forString("transmembrane beta-barrel");
        static final Enum TRANSMEMBRANE_REGION = Enum.forString("transmembrane region");
        
        static final int INT_COMPOSITIONALLY_BIASED_REGION = Enum.INT_COMPOSITIONALLY_BIASED_REGION;
        static final int INT_DISORDERED_REGION = Enum.INT_DISORDERED_REGION;
        static final int INT_DISULFIDE_BOND = Enum.INT_DISULFIDE_BOND;
        static final int INT_DNA_BINDING_REGION = Enum.INT_DNA_BINDING_REGION;
        static final int INT_HELICAL_TRANSMEMBRANE_REGION = Enum.INT_HELICAL_TRANSMEMBRANE_REGION;
        static final int INT_NON_REGULAR_SECONDARY_STRUCTURE = Enum.INT_NON_REGULAR_SECONDARY_STRUCTURE;
        static final int INT_NUCLEAR_LOCALISATION_SIGNAL = Enum.INT_NUCLEAR_LOCALISATION_SIGNAL;
        static final int INT_PROTEIN_BINDING_REGION = Enum.INT_PROTEIN_BINDING_REGION;
        static final int INT_SECONDARY_STRUCTURES = Enum.INT_SECONDARY_STRUCTURES;
        static final int INT_SECONDARY_STRUCTURE_SWITCH = Enum.INT_SECONDARY_STRUCTURE_SWITCH;
        static final int INT_SOLVENT_ACCESSIBILITY = Enum.INT_SOLVENT_ACCESSIBILITY;
        static final int INT_TRANSMEMBRANE_BETA_BARREL = Enum.INT_TRANSMEMBRANE_BETA_BARREL;
        static final int INT_TRANSMEMBRANE_REGION = Enum.INT_TRANSMEMBRANE_REGION;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.FeatureTypeGroupType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_COMPOSITIONALLY_BIASED_REGION
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
            
            static final int INT_COMPOSITIONALLY_BIASED_REGION = 1;
            static final int INT_DISORDERED_REGION = 2;
            static final int INT_DISULFIDE_BOND = 3;
            static final int INT_DNA_BINDING_REGION = 4;
            static final int INT_HELICAL_TRANSMEMBRANE_REGION = 5;
            static final int INT_NON_REGULAR_SECONDARY_STRUCTURE = 6;
            static final int INT_NUCLEAR_LOCALISATION_SIGNAL = 7;
            static final int INT_PROTEIN_BINDING_REGION = 8;
            static final int INT_SECONDARY_STRUCTURES = 9;
            static final int INT_SECONDARY_STRUCTURE_SWITCH = 10;
            static final int INT_SOLVENT_ACCESSIBILITY = 11;
            static final int INT_TRANSMEMBRANE_BETA_BARREL = 12;
            static final int INT_TRANSMEMBRANE_REGION = 13;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("compositionally biased region", INT_COMPOSITIONALLY_BIASED_REGION),
                    new Enum("disordered region", INT_DISORDERED_REGION),
                    new Enum("disulfide bond", INT_DISULFIDE_BOND),
                    new Enum("DNA-binding region", INT_DNA_BINDING_REGION),
                    new Enum("helical transmembrane region", INT_HELICAL_TRANSMEMBRANE_REGION),
                    new Enum("non-regular secondary structure", INT_NON_REGULAR_SECONDARY_STRUCTURE),
                    new Enum("nuclear localisation signal", INT_NUCLEAR_LOCALISATION_SIGNAL),
                    new Enum("protein binding region", INT_PROTEIN_BINDING_REGION),
                    new Enum("secondary structures", INT_SECONDARY_STRUCTURES),
                    new Enum("secondary structure switch", INT_SECONDARY_STRUCTURE_SWITCH),
                    new Enum("solvent accessibility", INT_SOLVENT_ACCESSIBILITY),
                    new Enum("transmembrane beta-barrel", INT_TRANSMEMBRANE_BETA_BARREL),
                    new Enum("transmembrane region", INT_TRANSMEMBRANE_REGION),
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
            public static org.rostlab.predictprotein.FeatureTypeGroupType.Type newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.FeatureTypeGroupType.Type) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.FeatureTypeGroupType.Type newInstance() {
              return (org.rostlab.predictprotein.FeatureTypeGroupType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.FeatureTypeGroupType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.FeatureTypeGroupType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.FeatureTypeGroupType newInstance() {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.FeatureTypeGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.FeatureTypeGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
