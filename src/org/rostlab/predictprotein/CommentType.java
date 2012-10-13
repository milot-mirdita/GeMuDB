/*
 * XML Type:  commentType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.CommentType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML commentType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface CommentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("commenttype4b76type");
    
    /**
     * Gets the "absorption" element
     */
    org.rostlab.predictprotein.CommentType.Absorption getAbsorption();
    
    /**
     * True if has "absorption" element
     */
    boolean isSetAbsorption();
    
    /**
     * Sets the "absorption" element
     */
    void setAbsorption(org.rostlab.predictprotein.CommentType.Absorption absorption);
    
    /**
     * Appends and returns a new empty "absorption" element
     */
    org.rostlab.predictprotein.CommentType.Absorption addNewAbsorption();
    
    /**
     * Unsets the "absorption" element
     */
    void unsetAbsorption();
    
    /**
     * Gets the "kinetics" element
     */
    org.rostlab.predictprotein.CommentType.Kinetics getKinetics();
    
    /**
     * True if has "kinetics" element
     */
    boolean isSetKinetics();
    
    /**
     * Sets the "kinetics" element
     */
    void setKinetics(org.rostlab.predictprotein.CommentType.Kinetics kinetics);
    
    /**
     * Appends and returns a new empty "kinetics" element
     */
    org.rostlab.predictprotein.CommentType.Kinetics addNewKinetics();
    
    /**
     * Unsets the "kinetics" element
     */
    void unsetKinetics();
    
    /**
     * Gets the "phDependence" element
     */
    java.lang.String getPhDependence();
    
    /**
     * Gets (as xml) the "phDependence" element
     */
    org.apache.xmlbeans.XmlString xgetPhDependence();
    
    /**
     * True if has "phDependence" element
     */
    boolean isSetPhDependence();
    
    /**
     * Sets the "phDependence" element
     */
    void setPhDependence(java.lang.String phDependence);
    
    /**
     * Sets (as xml) the "phDependence" element
     */
    void xsetPhDependence(org.apache.xmlbeans.XmlString phDependence);
    
    /**
     * Unsets the "phDependence" element
     */
    void unsetPhDependence();
    
    /**
     * Gets the "redoxPotential" element
     */
    java.lang.String getRedoxPotential();
    
    /**
     * Gets (as xml) the "redoxPotential" element
     */
    org.apache.xmlbeans.XmlString xgetRedoxPotential();
    
    /**
     * True if has "redoxPotential" element
     */
    boolean isSetRedoxPotential();
    
    /**
     * Sets the "redoxPotential" element
     */
    void setRedoxPotential(java.lang.String redoxPotential);
    
    /**
     * Sets (as xml) the "redoxPotential" element
     */
    void xsetRedoxPotential(org.apache.xmlbeans.XmlString redoxPotential);
    
    /**
     * Unsets the "redoxPotential" element
     */
    void unsetRedoxPotential();
    
    /**
     * Gets the "temperatureDependence" element
     */
    java.lang.String getTemperatureDependence();
    
    /**
     * Gets (as xml) the "temperatureDependence" element
     */
    org.apache.xmlbeans.XmlString xgetTemperatureDependence();
    
    /**
     * True if has "temperatureDependence" element
     */
    boolean isSetTemperatureDependence();
    
    /**
     * Sets the "temperatureDependence" element
     */
    void setTemperatureDependence(java.lang.String temperatureDependence);
    
    /**
     * Sets (as xml) the "temperatureDependence" element
     */
    void xsetTemperatureDependence(org.apache.xmlbeans.XmlString temperatureDependence);
    
    /**
     * Unsets the "temperatureDependence" element
     */
    void unsetTemperatureDependence();
    
    /**
     * Gets the "molecule" element
     */
    java.lang.String getMolecule();
    
    /**
     * Gets (as xml) the "molecule" element
     */
    org.apache.xmlbeans.XmlString xgetMolecule();
    
    /**
     * True if has "molecule" element
     */
    boolean isSetMolecule();
    
    /**
     * Sets the "molecule" element
     */
    void setMolecule(java.lang.String molecule);
    
    /**
     * Sets (as xml) the "molecule" element
     */
    void xsetMolecule(org.apache.xmlbeans.XmlString molecule);
    
    /**
     * Unsets the "molecule" element
     */
    void unsetMolecule();
    
    /**
     * Gets array of all "subcellularLocation" elements
     */
    org.rostlab.predictprotein.SubcellularLocationType[] getSubcellularLocationArray();
    
    /**
     * Gets ith "subcellularLocation" element
     */
    org.rostlab.predictprotein.SubcellularLocationType getSubcellularLocationArray(int i);
    
    /**
     * Returns number of "subcellularLocation" element
     */
    int sizeOfSubcellularLocationArray();
    
    /**
     * Sets array of all "subcellularLocation" element
     */
    void setSubcellularLocationArray(org.rostlab.predictprotein.SubcellularLocationType[] subcellularLocationArray);
    
    /**
     * Sets ith "subcellularLocation" element
     */
    void setSubcellularLocationArray(int i, org.rostlab.predictprotein.SubcellularLocationType subcellularLocation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subcellularLocation" element
     */
    org.rostlab.predictprotein.SubcellularLocationType insertNewSubcellularLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subcellularLocation" element
     */
    org.rostlab.predictprotein.SubcellularLocationType addNewSubcellularLocation();
    
    /**
     * Removes the ith "subcellularLocation" element
     */
    void removeSubcellularLocation(int i);
    
    /**
     * Gets the "conflict" element
     */
    org.rostlab.predictprotein.CommentType.Conflict getConflict();
    
    /**
     * True if has "conflict" element
     */
    boolean isSetConflict();
    
    /**
     * Sets the "conflict" element
     */
    void setConflict(org.rostlab.predictprotein.CommentType.Conflict conflict);
    
    /**
     * Appends and returns a new empty "conflict" element
     */
    org.rostlab.predictprotein.CommentType.Conflict addNewConflict();
    
    /**
     * Unsets the "conflict" element
     */
    void unsetConflict();
    
    /**
     * Gets array of all "link" elements
     */
    org.rostlab.predictprotein.CommentType.Link[] getLinkArray();
    
    /**
     * Gets ith "link" element
     */
    org.rostlab.predictprotein.CommentType.Link getLinkArray(int i);
    
    /**
     * Returns number of "link" element
     */
    int sizeOfLinkArray();
    
    /**
     * Sets array of all "link" element
     */
    void setLinkArray(org.rostlab.predictprotein.CommentType.Link[] linkArray);
    
    /**
     * Sets ith "link" element
     */
    void setLinkArray(int i, org.rostlab.predictprotein.CommentType.Link link);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    org.rostlab.predictprotein.CommentType.Link insertNewLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    org.rostlab.predictprotein.CommentType.Link addNewLink();
    
    /**
     * Removes the ith "link" element
     */
    void removeLink(int i);
    
    /**
     * Gets array of all "event" elements
     */
    org.rostlab.predictprotein.EventType[] getEventArray();
    
    /**
     * Gets ith "event" element
     */
    org.rostlab.predictprotein.EventType getEventArray(int i);
    
    /**
     * Returns number of "event" element
     */
    int sizeOfEventArray();
    
    /**
     * Sets array of all "event" element
     */
    void setEventArray(org.rostlab.predictprotein.EventType[] eventArray);
    
    /**
     * Sets ith "event" element
     */
    void setEventArray(int i, org.rostlab.predictprotein.EventType event);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event" element
     */
    org.rostlab.predictprotein.EventType insertNewEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    org.rostlab.predictprotein.EventType addNewEvent();
    
    /**
     * Removes the ith "event" element
     */
    void removeEvent(int i);
    
    /**
     * Gets array of all "isoform" elements
     */
    org.rostlab.predictprotein.IsoformType[] getIsoformArray();
    
    /**
     * Gets ith "isoform" element
     */
    org.rostlab.predictprotein.IsoformType getIsoformArray(int i);
    
    /**
     * Returns number of "isoform" element
     */
    int sizeOfIsoformArray();
    
    /**
     * Sets array of all "isoform" element
     */
    void setIsoformArray(org.rostlab.predictprotein.IsoformType[] isoformArray);
    
    /**
     * Sets ith "isoform" element
     */
    void setIsoformArray(int i, org.rostlab.predictprotein.IsoformType isoform);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isoform" element
     */
    org.rostlab.predictprotein.IsoformType insertNewIsoform(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isoform" element
     */
    org.rostlab.predictprotein.IsoformType addNewIsoform();
    
    /**
     * Removes the ith "isoform" element
     */
    void removeIsoform(int i);
    
    /**
     * Gets array of all "interactant" elements
     */
    org.rostlab.predictprotein.InteractantType[] getInteractantArray();
    
    /**
     * Gets ith "interactant" element
     */
    org.rostlab.predictprotein.InteractantType getInteractantArray(int i);
    
    /**
     * Returns number of "interactant" element
     */
    int sizeOfInteractantArray();
    
    /**
     * Sets array of all "interactant" element
     */
    void setInteractantArray(org.rostlab.predictprotein.InteractantType[] interactantArray);
    
    /**
     * Sets ith "interactant" element
     */
    void setInteractantArray(int i, org.rostlab.predictprotein.InteractantType interactant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interactant" element
     */
    org.rostlab.predictprotein.InteractantType insertNewInteractant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interactant" element
     */
    org.rostlab.predictprotein.InteractantType addNewInteractant();
    
    /**
     * Removes the ith "interactant" element
     */
    void removeInteractant(int i);
    
    /**
     * Gets the "organismsDiffer" element
     */
    boolean getOrganismsDiffer();
    
    /**
     * Gets (as xml) the "organismsDiffer" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOrganismsDiffer();
    
    /**
     * True if has "organismsDiffer" element
     */
    boolean isSetOrganismsDiffer();
    
    /**
     * Sets the "organismsDiffer" element
     */
    void setOrganismsDiffer(boolean organismsDiffer);
    
    /**
     * Sets (as xml) the "organismsDiffer" element
     */
    void xsetOrganismsDiffer(org.apache.xmlbeans.XmlBoolean organismsDiffer);
    
    /**
     * Unsets the "organismsDiffer" element
     */
    void unsetOrganismsDiffer();
    
    /**
     * Gets the "experiments" element
     */
    java.math.BigInteger getExperiments();
    
    /**
     * Gets (as xml) the "experiments" element
     */
    org.apache.xmlbeans.XmlInteger xgetExperiments();
    
    /**
     * True if has "experiments" element
     */
    boolean isSetExperiments();
    
    /**
     * Sets the "experiments" element
     */
    void setExperiments(java.math.BigInteger experiments);
    
    /**
     * Sets (as xml) the "experiments" element
     */
    void xsetExperiments(org.apache.xmlbeans.XmlInteger experiments);
    
    /**
     * Unsets the "experiments" element
     */
    void unsetExperiments();
    
    /**
     * Gets array of all "location" elements
     */
    org.rostlab.predictprotein.LocationType[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    org.rostlab.predictprotein.LocationType getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(org.rostlab.predictprotein.LocationType[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, org.rostlab.predictprotein.LocationType location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    org.rostlab.predictprotein.LocationType insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    org.rostlab.predictprotein.LocationType addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
    /**
     * Gets the "text" element
     */
    org.rostlab.predictprotein.EvidencedStringType getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(org.rostlab.predictprotein.EvidencedStringType text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
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
     * Gets the "mass" attribute
     */
    float getMass();
    
    /**
     * Gets (as xml) the "mass" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetMass();
    
    /**
     * True if has "mass" attribute
     */
    boolean isSetMass();
    
    /**
     * Sets the "mass" attribute
     */
    void setMass(float mass);
    
    /**
     * Sets (as xml) the "mass" attribute
     */
    void xsetMass(org.apache.xmlbeans.XmlFloat mass);
    
    /**
     * Unsets the "mass" attribute
     */
    void unsetMass();
    
    /**
     * Gets the "error" attribute
     */
    java.lang.String getError();
    
    /**
     * Gets (as xml) the "error" attribute
     */
    org.apache.xmlbeans.XmlString xgetError();
    
    /**
     * True if has "error" attribute
     */
    boolean isSetError();
    
    /**
     * Sets the "error" attribute
     */
    void setError(java.lang.String error);
    
    /**
     * Sets (as xml) the "error" attribute
     */
    void xsetError(org.apache.xmlbeans.XmlString error);
    
    /**
     * Unsets the "error" attribute
     */
    void unsetError();
    
    /**
     * Gets the "method" attribute
     */
    java.lang.String getMethod();
    
    /**
     * Gets (as xml) the "method" attribute
     */
    org.apache.xmlbeans.XmlString xgetMethod();
    
    /**
     * True if has "method" attribute
     */
    boolean isSetMethod();
    
    /**
     * Sets the "method" attribute
     */
    void setMethod(java.lang.String method);
    
    /**
     * Sets (as xml) the "method" attribute
     */
    void xsetMethod(org.apache.xmlbeans.XmlString method);
    
    /**
     * Unsets the "method" attribute
     */
    void unsetMethod();
    
    /**
     * Gets the "type" attribute
     */
    org.rostlab.predictprotein.CommentType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.rostlab.predictprotein.CommentType.Type xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.rostlab.predictprotein.CommentType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.rostlab.predictprotein.CommentType.Type type);
    
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
     * An XML absorption(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Absorption extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Absorption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("absorption1ae1elemtype");
        
        /**
         * Gets the "max" element
         */
        java.lang.String getMax();
        
        /**
         * Gets (as xml) the "max" element
         */
        org.apache.xmlbeans.XmlString xgetMax();
        
        /**
         * True if has "max" element
         */
        boolean isSetMax();
        
        /**
         * Sets the "max" element
         */
        void setMax(java.lang.String max);
        
        /**
         * Sets (as xml) the "max" element
         */
        void xsetMax(org.apache.xmlbeans.XmlString max);
        
        /**
         * Unsets the "max" element
         */
        void unsetMax();
        
        /**
         * Gets the "text" element
         */
        java.lang.String getText();
        
        /**
         * Gets (as xml) the "text" element
         */
        org.apache.xmlbeans.XmlString xgetText();
        
        /**
         * True if has "text" element
         */
        boolean isSetText();
        
        /**
         * Sets the "text" element
         */
        void setText(java.lang.String text);
        
        /**
         * Sets (as xml) the "text" element
         */
        void xsetText(org.apache.xmlbeans.XmlString text);
        
        /**
         * Unsets the "text" element
         */
        void unsetText();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.CommentType.Absorption newInstance() {
              return (org.rostlab.predictprotein.CommentType.Absorption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CommentType.Absorption newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CommentType.Absorption) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML kinetics(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Kinetics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Kinetics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("kineticsb2ccelemtype");
        
        /**
         * Gets array of all "KM" elements
         */
        java.lang.String[] getKMArray();
        
        /**
         * Gets ith "KM" element
         */
        java.lang.String getKMArray(int i);
        
        /**
         * Gets (as xml) array of all "KM" elements
         */
        org.apache.xmlbeans.XmlString[] xgetKMArray();
        
        /**
         * Gets (as xml) ith "KM" element
         */
        org.apache.xmlbeans.XmlString xgetKMArray(int i);
        
        /**
         * Returns number of "KM" element
         */
        int sizeOfKMArray();
        
        /**
         * Sets array of all "KM" element
         */
        void setKMArray(java.lang.String[] kmArray);
        
        /**
         * Sets ith "KM" element
         */
        void setKMArray(int i, java.lang.String km);
        
        /**
         * Sets (as xml) array of all "KM" element
         */
        void xsetKMArray(org.apache.xmlbeans.XmlString[] kmArray);
        
        /**
         * Sets (as xml) ith "KM" element
         */
        void xsetKMArray(int i, org.apache.xmlbeans.XmlString km);
        
        /**
         * Inserts the value as the ith "KM" element
         */
        void insertKM(int i, java.lang.String km);
        
        /**
         * Appends the value as the last "KM" element
         */
        void addKM(java.lang.String km);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "KM" element
         */
        org.apache.xmlbeans.XmlString insertNewKM(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "KM" element
         */
        org.apache.xmlbeans.XmlString addNewKM();
        
        /**
         * Removes the ith "KM" element
         */
        void removeKM(int i);
        
        /**
         * Gets array of all "Vmax" elements
         */
        java.lang.String[] getVmaxArray();
        
        /**
         * Gets ith "Vmax" element
         */
        java.lang.String getVmaxArray(int i);
        
        /**
         * Gets (as xml) array of all "Vmax" elements
         */
        org.apache.xmlbeans.XmlString[] xgetVmaxArray();
        
        /**
         * Gets (as xml) ith "Vmax" element
         */
        org.apache.xmlbeans.XmlString xgetVmaxArray(int i);
        
        /**
         * Returns number of "Vmax" element
         */
        int sizeOfVmaxArray();
        
        /**
         * Sets array of all "Vmax" element
         */
        void setVmaxArray(java.lang.String[] vmaxArray);
        
        /**
         * Sets ith "Vmax" element
         */
        void setVmaxArray(int i, java.lang.String vmax);
        
        /**
         * Sets (as xml) array of all "Vmax" element
         */
        void xsetVmaxArray(org.apache.xmlbeans.XmlString[] vmaxArray);
        
        /**
         * Sets (as xml) ith "Vmax" element
         */
        void xsetVmaxArray(int i, org.apache.xmlbeans.XmlString vmax);
        
        /**
         * Inserts the value as the ith "Vmax" element
         */
        void insertVmax(int i, java.lang.String vmax);
        
        /**
         * Appends the value as the last "Vmax" element
         */
        void addVmax(java.lang.String vmax);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Vmax" element
         */
        org.apache.xmlbeans.XmlString insertNewVmax(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Vmax" element
         */
        org.apache.xmlbeans.XmlString addNewVmax();
        
        /**
         * Removes the ith "Vmax" element
         */
        void removeVmax(int i);
        
        /**
         * Gets the "text" element
         */
        java.lang.String getText();
        
        /**
         * Gets (as xml) the "text" element
         */
        org.apache.xmlbeans.XmlString xgetText();
        
        /**
         * True if has "text" element
         */
        boolean isSetText();
        
        /**
         * Sets the "text" element
         */
        void setText(java.lang.String text);
        
        /**
         * Sets (as xml) the "text" element
         */
        void xsetText(org.apache.xmlbeans.XmlString text);
        
        /**
         * Unsets the "text" element
         */
        void unsetText();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.CommentType.Kinetics newInstance() {
              return (org.rostlab.predictprotein.CommentType.Kinetics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CommentType.Kinetics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CommentType.Kinetics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML conflict(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Conflict extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Conflict.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("conflict93e4elemtype");
        
        /**
         * Gets the "sequence" element
         */
        org.rostlab.predictprotein.CommentType.Conflict.Sequence getSequence();
        
        /**
         * True if has "sequence" element
         */
        boolean isSetSequence();
        
        /**
         * Sets the "sequence" element
         */
        void setSequence(org.rostlab.predictprotein.CommentType.Conflict.Sequence sequence);
        
        /**
         * Appends and returns a new empty "sequence" element
         */
        org.rostlab.predictprotein.CommentType.Conflict.Sequence addNewSequence();
        
        /**
         * Unsets the "sequence" element
         */
        void unsetSequence();
        
        /**
         * Gets the "type" attribute
         */
        org.rostlab.predictprotein.CommentType.Conflict.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.rostlab.predictprotein.CommentType.Conflict.Type xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(org.rostlab.predictprotein.CommentType.Conflict.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.rostlab.predictprotein.CommentType.Conflict.Type type);
        
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
         * An XML sequence(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface Sequence extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sequence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("sequence0d67elemtype");
            
            /**
             * Gets the "resource" attribute
             */
            org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource.Enum getResource();
            
            /**
             * Gets (as xml) the "resource" attribute
             */
            org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource xgetResource();
            
            /**
             * Sets the "resource" attribute
             */
            void setResource(org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource.Enum resource);
            
            /**
             * Sets (as xml) the "resource" attribute
             */
            void xsetResource(org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource resource);
            
            /**
             * Gets the "id" attribute
             */
            java.lang.String getId();
            
            /**
             * Gets (as xml) the "id" attribute
             */
            org.apache.xmlbeans.XmlString xgetId();
            
            /**
             * Sets the "id" attribute
             */
            void setId(java.lang.String id);
            
            /**
             * Sets (as xml) the "id" attribute
             */
            void xsetId(org.apache.xmlbeans.XmlString id);
            
            /**
             * Gets the "version" attribute
             */
            java.math.BigInteger getVersion();
            
            /**
             * Gets (as xml) the "version" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetVersion();
            
            /**
             * True if has "version" attribute
             */
            boolean isSetVersion();
            
            /**
             * Sets the "version" attribute
             */
            void setVersion(java.math.BigInteger version);
            
            /**
             * Sets (as xml) the "version" attribute
             */
            void xsetVersion(org.apache.xmlbeans.XmlInteger version);
            
            /**
             * Unsets the "version" attribute
             */
            void unsetVersion();
            
            /**
             * An XML resource(@).
             *
             * This is an atomic type that is a restriction of org.rostlab.predictprotein.CommentType$Conflict$Sequence$Resource.
             */
            public interface Resource extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("resource3315attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum EMBL_CDS = Enum.forString("EMBL-CDS");
                static final Enum EMBL = Enum.forString("EMBL");
                
                static final int INT_EMBL_CDS = Enum.INT_EMBL_CDS;
                static final int INT_EMBL = Enum.INT_EMBL;
                
                /**
                 * Enumeration value class for org.rostlab.predictprotein.CommentType$Conflict$Sequence$Resource.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_EMBL_CDS
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
                    
                    static final int INT_EMBL_CDS = 1;
                    static final int INT_EMBL = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("EMBL-CDS", INT_EMBL_CDS),
                        new Enum("EMBL", INT_EMBL),
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
                    public static org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource newValue(java.lang.Object obj) {
                      return (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource) type.newValue( obj ); }
                    
                    public static org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource newInstance() {
                      return (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.CommentType.Conflict.Sequence newInstance() {
                  return (org.rostlab.predictprotein.CommentType.Conflict.Sequence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.CommentType.Conflict.Sequence newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.CommentType.Conflict.Sequence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of org.rostlab.predictprotein.CommentType$Conflict$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("type4a4aattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum FRAMESHIFT = Enum.forString("frameshift");
            static final Enum ERRONEOUS_INITIATION = Enum.forString("erroneous initiation");
            static final Enum ERRONEOUS_TERMINATION = Enum.forString("erroneous termination");
            static final Enum ERRONEOUS_GENE_MODEL_PREDICTION = Enum.forString("erroneous gene model prediction");
            static final Enum ERRONEOUS_TRANSLATION = Enum.forString("erroneous translation");
            static final Enum MISCELLANEOUS_DISCREPANCY = Enum.forString("miscellaneous discrepancy");
            
            static final int INT_FRAMESHIFT = Enum.INT_FRAMESHIFT;
            static final int INT_ERRONEOUS_INITIATION = Enum.INT_ERRONEOUS_INITIATION;
            static final int INT_ERRONEOUS_TERMINATION = Enum.INT_ERRONEOUS_TERMINATION;
            static final int INT_ERRONEOUS_GENE_MODEL_PREDICTION = Enum.INT_ERRONEOUS_GENE_MODEL_PREDICTION;
            static final int INT_ERRONEOUS_TRANSLATION = Enum.INT_ERRONEOUS_TRANSLATION;
            static final int INT_MISCELLANEOUS_DISCREPANCY = Enum.INT_MISCELLANEOUS_DISCREPANCY;
            
            /**
             * Enumeration value class for org.rostlab.predictprotein.CommentType$Conflict$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_FRAMESHIFT
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
                
                static final int INT_FRAMESHIFT = 1;
                static final int INT_ERRONEOUS_INITIATION = 2;
                static final int INT_ERRONEOUS_TERMINATION = 3;
                static final int INT_ERRONEOUS_GENE_MODEL_PREDICTION = 4;
                static final int INT_ERRONEOUS_TRANSLATION = 5;
                static final int INT_MISCELLANEOUS_DISCREPANCY = 6;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("frameshift", INT_FRAMESHIFT),
                      new Enum("erroneous initiation", INT_ERRONEOUS_INITIATION),
                      new Enum("erroneous termination", INT_ERRONEOUS_TERMINATION),
                      new Enum("erroneous gene model prediction", INT_ERRONEOUS_GENE_MODEL_PREDICTION),
                      new Enum("erroneous translation", INT_ERRONEOUS_TRANSLATION),
                      new Enum("miscellaneous discrepancy", INT_MISCELLANEOUS_DISCREPANCY),
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
                public static org.rostlab.predictprotein.CommentType.Conflict.Type newValue(java.lang.Object obj) {
                  return (org.rostlab.predictprotein.CommentType.Conflict.Type) type.newValue( obj ); }
                
                public static org.rostlab.predictprotein.CommentType.Conflict.Type newInstance() {
                  return (org.rostlab.predictprotein.CommentType.Conflict.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.CommentType.Conflict.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.CommentType.Conflict.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.CommentType.Conflict newInstance() {
              return (org.rostlab.predictprotein.CommentType.Conflict) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CommentType.Conflict newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CommentType.Conflict) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML link(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Link extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("link340celemtype");
        
        /**
         * Gets the "uri" attribute
         */
        java.lang.String getUri();
        
        /**
         * Gets (as xml) the "uri" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetUri();
        
        /**
         * Sets the "uri" attribute
         */
        void setUri(java.lang.String uri);
        
        /**
         * Sets (as xml) the "uri" attribute
         */
        void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.CommentType.Link newInstance() {
              return (org.rostlab.predictprotein.CommentType.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CommentType.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CommentType.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.CommentType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("type98d0attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ALLERGEN = Enum.forString("allergen");
        static final Enum ALTERNATIVE_PRODUCTS = Enum.forString("alternative products");
        static final Enum BIOTECHNOLOGY = Enum.forString("biotechnology");
        static final Enum BIOPHYSICOCHEMICAL_PROPERTIES = Enum.forString("biophysicochemical properties");
        static final Enum CATALYTIC_ACTIVITY = Enum.forString("catalytic activity");
        static final Enum CAUTION = Enum.forString("caution");
        static final Enum COFACTOR = Enum.forString("cofactor");
        static final Enum DEVELOPMENTAL_STAGE = Enum.forString("developmental stage");
        static final Enum DISEASE = Enum.forString("disease");
        static final Enum DOMAIN = Enum.forString("domain");
        static final Enum ENZYME_REGULATION = Enum.forString("enzyme regulation");
        static final Enum FUNCTION = Enum.forString("function");
        static final Enum INDUCTION = Enum.forString("induction");
        static final Enum MISCELLANEOUS = Enum.forString("miscellaneous");
        static final Enum PATHWAY = Enum.forString("pathway");
        static final Enum PHARMACEUTICAL = Enum.forString("pharmaceutical");
        static final Enum POLYMORPHISM = Enum.forString("polymorphism");
        static final Enum PTM = Enum.forString("PTM");
        static final Enum RNA_EDITING = Enum.forString("RNA editing");
        static final Enum SIMILARITY = Enum.forString("similarity");
        static final Enum SUBCELLULAR_LOCATION = Enum.forString("subcellular location");
        static final Enum SEQUENCE_CAUTION = Enum.forString("sequence caution");
        static final Enum SUBUNIT = Enum.forString("subunit");
        static final Enum TISSUE_SPECIFICITY = Enum.forString("tissue specificity");
        static final Enum TOXIC_DOSE = Enum.forString("toxic dose");
        static final Enum ONLINE_INFORMATION = Enum.forString("online information");
        static final Enum MASS_SPECTROMETRY = Enum.forString("mass spectrometry");
        static final Enum INTERACTION = Enum.forString("interaction");
        
        static final int INT_ALLERGEN = Enum.INT_ALLERGEN;
        static final int INT_ALTERNATIVE_PRODUCTS = Enum.INT_ALTERNATIVE_PRODUCTS;
        static final int INT_BIOTECHNOLOGY = Enum.INT_BIOTECHNOLOGY;
        static final int INT_BIOPHYSICOCHEMICAL_PROPERTIES = Enum.INT_BIOPHYSICOCHEMICAL_PROPERTIES;
        static final int INT_CATALYTIC_ACTIVITY = Enum.INT_CATALYTIC_ACTIVITY;
        static final int INT_CAUTION = Enum.INT_CAUTION;
        static final int INT_COFACTOR = Enum.INT_COFACTOR;
        static final int INT_DEVELOPMENTAL_STAGE = Enum.INT_DEVELOPMENTAL_STAGE;
        static final int INT_DISEASE = Enum.INT_DISEASE;
        static final int INT_DOMAIN = Enum.INT_DOMAIN;
        static final int INT_ENZYME_REGULATION = Enum.INT_ENZYME_REGULATION;
        static final int INT_FUNCTION = Enum.INT_FUNCTION;
        static final int INT_INDUCTION = Enum.INT_INDUCTION;
        static final int INT_MISCELLANEOUS = Enum.INT_MISCELLANEOUS;
        static final int INT_PATHWAY = Enum.INT_PATHWAY;
        static final int INT_PHARMACEUTICAL = Enum.INT_PHARMACEUTICAL;
        static final int INT_POLYMORPHISM = Enum.INT_POLYMORPHISM;
        static final int INT_PTM = Enum.INT_PTM;
        static final int INT_RNA_EDITING = Enum.INT_RNA_EDITING;
        static final int INT_SIMILARITY = Enum.INT_SIMILARITY;
        static final int INT_SUBCELLULAR_LOCATION = Enum.INT_SUBCELLULAR_LOCATION;
        static final int INT_SEQUENCE_CAUTION = Enum.INT_SEQUENCE_CAUTION;
        static final int INT_SUBUNIT = Enum.INT_SUBUNIT;
        static final int INT_TISSUE_SPECIFICITY = Enum.INT_TISSUE_SPECIFICITY;
        static final int INT_TOXIC_DOSE = Enum.INT_TOXIC_DOSE;
        static final int INT_ONLINE_INFORMATION = Enum.INT_ONLINE_INFORMATION;
        static final int INT_MASS_SPECTROMETRY = Enum.INT_MASS_SPECTROMETRY;
        static final int INT_INTERACTION = Enum.INT_INTERACTION;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.CommentType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ALLERGEN
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
            
            static final int INT_ALLERGEN = 1;
            static final int INT_ALTERNATIVE_PRODUCTS = 2;
            static final int INT_BIOTECHNOLOGY = 3;
            static final int INT_BIOPHYSICOCHEMICAL_PROPERTIES = 4;
            static final int INT_CATALYTIC_ACTIVITY = 5;
            static final int INT_CAUTION = 6;
            static final int INT_COFACTOR = 7;
            static final int INT_DEVELOPMENTAL_STAGE = 8;
            static final int INT_DISEASE = 9;
            static final int INT_DOMAIN = 10;
            static final int INT_ENZYME_REGULATION = 11;
            static final int INT_FUNCTION = 12;
            static final int INT_INDUCTION = 13;
            static final int INT_MISCELLANEOUS = 14;
            static final int INT_PATHWAY = 15;
            static final int INT_PHARMACEUTICAL = 16;
            static final int INT_POLYMORPHISM = 17;
            static final int INT_PTM = 18;
            static final int INT_RNA_EDITING = 19;
            static final int INT_SIMILARITY = 20;
            static final int INT_SUBCELLULAR_LOCATION = 21;
            static final int INT_SEQUENCE_CAUTION = 22;
            static final int INT_SUBUNIT = 23;
            static final int INT_TISSUE_SPECIFICITY = 24;
            static final int INT_TOXIC_DOSE = 25;
            static final int INT_ONLINE_INFORMATION = 26;
            static final int INT_MASS_SPECTROMETRY = 27;
            static final int INT_INTERACTION = 28;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("allergen", INT_ALLERGEN),
                    new Enum("alternative products", INT_ALTERNATIVE_PRODUCTS),
                    new Enum("biotechnology", INT_BIOTECHNOLOGY),
                    new Enum("biophysicochemical properties", INT_BIOPHYSICOCHEMICAL_PROPERTIES),
                    new Enum("catalytic activity", INT_CATALYTIC_ACTIVITY),
                    new Enum("caution", INT_CAUTION),
                    new Enum("cofactor", INT_COFACTOR),
                    new Enum("developmental stage", INT_DEVELOPMENTAL_STAGE),
                    new Enum("disease", INT_DISEASE),
                    new Enum("domain", INT_DOMAIN),
                    new Enum("enzyme regulation", INT_ENZYME_REGULATION),
                    new Enum("function", INT_FUNCTION),
                    new Enum("induction", INT_INDUCTION),
                    new Enum("miscellaneous", INT_MISCELLANEOUS),
                    new Enum("pathway", INT_PATHWAY),
                    new Enum("pharmaceutical", INT_PHARMACEUTICAL),
                    new Enum("polymorphism", INT_POLYMORPHISM),
                    new Enum("PTM", INT_PTM),
                    new Enum("RNA editing", INT_RNA_EDITING),
                    new Enum("similarity", INT_SIMILARITY),
                    new Enum("subcellular location", INT_SUBCELLULAR_LOCATION),
                    new Enum("sequence caution", INT_SEQUENCE_CAUTION),
                    new Enum("subunit", INT_SUBUNIT),
                    new Enum("tissue specificity", INT_TISSUE_SPECIFICITY),
                    new Enum("toxic dose", INT_TOXIC_DOSE),
                    new Enum("online information", INT_ONLINE_INFORMATION),
                    new Enum("mass spectrometry", INT_MASS_SPECTROMETRY),
                    new Enum("interaction", INT_INTERACTION),
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
            public static org.rostlab.predictprotein.CommentType.Type newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.CommentType.Type) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.CommentType.Type newInstance() {
              return (org.rostlab.predictprotein.CommentType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.CommentType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.CommentType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.CommentType newInstance() {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.CommentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.CommentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.CommentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.CommentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.CommentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.CommentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.CommentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.CommentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.CommentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
