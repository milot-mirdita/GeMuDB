/*
 * XML Type:  proteinType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.ProteinType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML proteinType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface ProteinType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProteinType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("proteintype399atype");
    
    /**
     * Gets the "recommendedName" element
     */
    org.rostlab.predictprotein.ProteinType.RecommendedName getRecommendedName();
    
    /**
     * True if has "recommendedName" element
     */
    boolean isSetRecommendedName();
    
    /**
     * Sets the "recommendedName" element
     */
    void setRecommendedName(org.rostlab.predictprotein.ProteinType.RecommendedName recommendedName);
    
    /**
     * Appends and returns a new empty "recommendedName" element
     */
    org.rostlab.predictprotein.ProteinType.RecommendedName addNewRecommendedName();
    
    /**
     * Unsets the "recommendedName" element
     */
    void unsetRecommendedName();
    
    /**
     * Gets array of all "alternativeName" elements
     */
    org.rostlab.predictprotein.ProteinType.AlternativeName[] getAlternativeNameArray();
    
    /**
     * Gets ith "alternativeName" element
     */
    org.rostlab.predictprotein.ProteinType.AlternativeName getAlternativeNameArray(int i);
    
    /**
     * Returns number of "alternativeName" element
     */
    int sizeOfAlternativeNameArray();
    
    /**
     * Sets array of all "alternativeName" element
     */
    void setAlternativeNameArray(org.rostlab.predictprotein.ProteinType.AlternativeName[] alternativeNameArray);
    
    /**
     * Sets ith "alternativeName" element
     */
    void setAlternativeNameArray(int i, org.rostlab.predictprotein.ProteinType.AlternativeName alternativeName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
     */
    org.rostlab.predictprotein.ProteinType.AlternativeName insertNewAlternativeName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternativeName" element
     */
    org.rostlab.predictprotein.ProteinType.AlternativeName addNewAlternativeName();
    
    /**
     * Removes the ith "alternativeName" element
     */
    void removeAlternativeName(int i);
    
    /**
     * Gets array of all "submittedName" elements
     */
    org.rostlab.predictprotein.ProteinType.SubmittedName[] getSubmittedNameArray();
    
    /**
     * Gets ith "submittedName" element
     */
    org.rostlab.predictprotein.ProteinType.SubmittedName getSubmittedNameArray(int i);
    
    /**
     * Returns number of "submittedName" element
     */
    int sizeOfSubmittedNameArray();
    
    /**
     * Sets array of all "submittedName" element
     */
    void setSubmittedNameArray(org.rostlab.predictprotein.ProteinType.SubmittedName[] submittedNameArray);
    
    /**
     * Sets ith "submittedName" element
     */
    void setSubmittedNameArray(int i, org.rostlab.predictprotein.ProteinType.SubmittedName submittedName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "submittedName" element
     */
    org.rostlab.predictprotein.ProteinType.SubmittedName insertNewSubmittedName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "submittedName" element
     */
    org.rostlab.predictprotein.ProteinType.SubmittedName addNewSubmittedName();
    
    /**
     * Removes the ith "submittedName" element
     */
    void removeSubmittedName(int i);
    
    /**
     * Gets the "allergenName" element
     */
    org.rostlab.predictprotein.EvidencedStringType getAllergenName();
    
    /**
     * True if has "allergenName" element
     */
    boolean isSetAllergenName();
    
    /**
     * Sets the "allergenName" element
     */
    void setAllergenName(org.rostlab.predictprotein.EvidencedStringType allergenName);
    
    /**
     * Appends and returns a new empty "allergenName" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewAllergenName();
    
    /**
     * Unsets the "allergenName" element
     */
    void unsetAllergenName();
    
    /**
     * Gets the "biotechName" element
     */
    org.rostlab.predictprotein.EvidencedStringType getBiotechName();
    
    /**
     * True if has "biotechName" element
     */
    boolean isSetBiotechName();
    
    /**
     * Sets the "biotechName" element
     */
    void setBiotechName(org.rostlab.predictprotein.EvidencedStringType biotechName);
    
    /**
     * Appends and returns a new empty "biotechName" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewBiotechName();
    
    /**
     * Unsets the "biotechName" element
     */
    void unsetBiotechName();
    
    /**
     * Gets array of all "CdAntigenName" elements
     */
    org.rostlab.predictprotein.EvidencedStringType[] getCdAntigenNameArray();
    
    /**
     * Gets ith "CdAntigenName" element
     */
    org.rostlab.predictprotein.EvidencedStringType getCdAntigenNameArray(int i);
    
    /**
     * Returns number of "CdAntigenName" element
     */
    int sizeOfCdAntigenNameArray();
    
    /**
     * Sets array of all "CdAntigenName" element
     */
    void setCdAntigenNameArray(org.rostlab.predictprotein.EvidencedStringType[] cdAntigenNameArray);
    
    /**
     * Sets ith "CdAntigenName" element
     */
    void setCdAntigenNameArray(int i, org.rostlab.predictprotein.EvidencedStringType cdAntigenName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CdAntigenName" element
     */
    org.rostlab.predictprotein.EvidencedStringType insertNewCdAntigenName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CdAntigenName" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewCdAntigenName();
    
    /**
     * Removes the ith "CdAntigenName" element
     */
    void removeCdAntigenName(int i);
    
    /**
     * Gets array of all "innName" elements
     */
    org.rostlab.predictprotein.EvidencedStringType[] getInnNameArray();
    
    /**
     * Gets ith "innName" element
     */
    org.rostlab.predictprotein.EvidencedStringType getInnNameArray(int i);
    
    /**
     * Returns number of "innName" element
     */
    int sizeOfInnNameArray();
    
    /**
     * Sets array of all "innName" element
     */
    void setInnNameArray(org.rostlab.predictprotein.EvidencedStringType[] innNameArray);
    
    /**
     * Sets ith "innName" element
     */
    void setInnNameArray(int i, org.rostlab.predictprotein.EvidencedStringType innName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "innName" element
     */
    org.rostlab.predictprotein.EvidencedStringType insertNewInnName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "innName" element
     */
    org.rostlab.predictprotein.EvidencedStringType addNewInnName();
    
    /**
     * Removes the ith "innName" element
     */
    void removeInnName(int i);
    
    /**
     * Gets array of all "domain" elements
     */
    org.rostlab.predictprotein.ProteinType.Domain[] getDomainArray();
    
    /**
     * Gets ith "domain" element
     */
    org.rostlab.predictprotein.ProteinType.Domain getDomainArray(int i);
    
    /**
     * Returns number of "domain" element
     */
    int sizeOfDomainArray();
    
    /**
     * Sets array of all "domain" element
     */
    void setDomainArray(org.rostlab.predictprotein.ProteinType.Domain[] domainArray);
    
    /**
     * Sets ith "domain" element
     */
    void setDomainArray(int i, org.rostlab.predictprotein.ProteinType.Domain domain);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "domain" element
     */
    org.rostlab.predictprotein.ProteinType.Domain insertNewDomain(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "domain" element
     */
    org.rostlab.predictprotein.ProteinType.Domain addNewDomain();
    
    /**
     * Removes the ith "domain" element
     */
    void removeDomain(int i);
    
    /**
     * Gets array of all "component" elements
     */
    org.rostlab.predictprotein.ProteinType.Component[] getComponentArray();
    
    /**
     * Gets ith "component" element
     */
    org.rostlab.predictprotein.ProteinType.Component getComponentArray(int i);
    
    /**
     * Returns number of "component" element
     */
    int sizeOfComponentArray();
    
    /**
     * Sets array of all "component" element
     */
    void setComponentArray(org.rostlab.predictprotein.ProteinType.Component[] componentArray);
    
    /**
     * Sets ith "component" element
     */
    void setComponentArray(int i, org.rostlab.predictprotein.ProteinType.Component component);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    org.rostlab.predictprotein.ProteinType.Component insertNewComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    org.rostlab.predictprotein.ProteinType.Component addNewComponent();
    
    /**
     * Removes the ith "component" element
     */
    void removeComponent(int i);
    
    /**
     * An XML recommendedName(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface RecommendedName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecommendedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("recommendednamea98celemtype");
        
        /**
         * Gets the "fullName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getFullName();
        
        /**
         * Sets the "fullName" element
         */
        void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
        
        /**
         * Appends and returns a new empty "fullName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewFullName();
        
        /**
         * Gets array of all "shortName" elements
         */
        org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray();
        
        /**
         * Gets ith "shortName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i);
        
        /**
         * Returns number of "shortName" element
         */
        int sizeOfShortNameArray();
        
        /**
         * Sets array of all "shortName" element
         */
        void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray);
        
        /**
         * Sets ith "shortName" element
         */
        void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shortName" element
         */
        org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shortName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewShortName();
        
        /**
         * Removes the ith "shortName" element
         */
        void removeShortName(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.ProteinType.RecommendedName newInstance() {
              return (org.rostlab.predictprotein.ProteinType.RecommendedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.ProteinType.RecommendedName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.ProteinType.RecommendedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML alternativeName(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface AlternativeName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlternativeName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("alternativename4ddeelemtype");
        
        /**
         * Gets the "fullName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getFullName();
        
        /**
         * True if has "fullName" element
         */
        boolean isSetFullName();
        
        /**
         * Sets the "fullName" element
         */
        void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
        
        /**
         * Appends and returns a new empty "fullName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewFullName();
        
        /**
         * Unsets the "fullName" element
         */
        void unsetFullName();
        
        /**
         * Gets array of all "shortName" elements
         */
        org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray();
        
        /**
         * Gets ith "shortName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i);
        
        /**
         * Returns number of "shortName" element
         */
        int sizeOfShortNameArray();
        
        /**
         * Sets array of all "shortName" element
         */
        void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray);
        
        /**
         * Sets ith "shortName" element
         */
        void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shortName" element
         */
        org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shortName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewShortName();
        
        /**
         * Removes the ith "shortName" element
         */
        void removeShortName(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.ProteinType.AlternativeName newInstance() {
              return (org.rostlab.predictprotein.ProteinType.AlternativeName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.ProteinType.AlternativeName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.ProteinType.AlternativeName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML submittedName(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface SubmittedName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmittedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("submittedname1e2celemtype");
        
        /**
         * Gets the "fullName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getFullName();
        
        /**
         * Sets the "fullName" element
         */
        void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
        
        /**
         * Appends and returns a new empty "fullName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewFullName();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.ProteinType.SubmittedName newInstance() {
              return (org.rostlab.predictprotein.ProteinType.SubmittedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.ProteinType.SubmittedName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.ProteinType.SubmittedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML domain(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Domain extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Domain.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("domain04faelemtype");
        
        /**
         * Gets the "recommendedName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.RecommendedName getRecommendedName();
        
        /**
         * True if has "recommendedName" element
         */
        boolean isSetRecommendedName();
        
        /**
         * Sets the "recommendedName" element
         */
        void setRecommendedName(org.rostlab.predictprotein.ProteinType.Domain.RecommendedName recommendedName);
        
        /**
         * Appends and returns a new empty "recommendedName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.RecommendedName addNewRecommendedName();
        
        /**
         * Unsets the "recommendedName" element
         */
        void unsetRecommendedName();
        
        /**
         * Gets array of all "alternativeName" elements
         */
        org.rostlab.predictprotein.ProteinType.Domain.AlternativeName[] getAlternativeNameArray();
        
        /**
         * Gets ith "alternativeName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.AlternativeName getAlternativeNameArray(int i);
        
        /**
         * Returns number of "alternativeName" element
         */
        int sizeOfAlternativeNameArray();
        
        /**
         * Sets array of all "alternativeName" element
         */
        void setAlternativeNameArray(org.rostlab.predictprotein.ProteinType.Domain.AlternativeName[] alternativeNameArray);
        
        /**
         * Sets ith "alternativeName" element
         */
        void setAlternativeNameArray(int i, org.rostlab.predictprotein.ProteinType.Domain.AlternativeName alternativeName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.AlternativeName insertNewAlternativeName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alternativeName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.AlternativeName addNewAlternativeName();
        
        /**
         * Removes the ith "alternativeName" element
         */
        void removeAlternativeName(int i);
        
        /**
         * Gets array of all "submittedName" elements
         */
        org.rostlab.predictprotein.ProteinType.Domain.SubmittedName[] getSubmittedNameArray();
        
        /**
         * Gets ith "submittedName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.SubmittedName getSubmittedNameArray(int i);
        
        /**
         * Returns number of "submittedName" element
         */
        int sizeOfSubmittedNameArray();
        
        /**
         * Sets array of all "submittedName" element
         */
        void setSubmittedNameArray(org.rostlab.predictprotein.ProteinType.Domain.SubmittedName[] submittedNameArray);
        
        /**
         * Sets ith "submittedName" element
         */
        void setSubmittedNameArray(int i, org.rostlab.predictprotein.ProteinType.Domain.SubmittedName submittedName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "submittedName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.SubmittedName insertNewSubmittedName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "submittedName" element
         */
        org.rostlab.predictprotein.ProteinType.Domain.SubmittedName addNewSubmittedName();
        
        /**
         * Removes the ith "submittedName" element
         */
        void removeSubmittedName(int i);
        
        /**
         * Gets the "allergenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getAllergenName();
        
        /**
         * True if has "allergenName" element
         */
        boolean isSetAllergenName();
        
        /**
         * Sets the "allergenName" element
         */
        void setAllergenName(org.rostlab.predictprotein.EvidencedStringType allergenName);
        
        /**
         * Appends and returns a new empty "allergenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewAllergenName();
        
        /**
         * Unsets the "allergenName" element
         */
        void unsetAllergenName();
        
        /**
         * Gets the "biotechName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getBiotechName();
        
        /**
         * True if has "biotechName" element
         */
        boolean isSetBiotechName();
        
        /**
         * Sets the "biotechName" element
         */
        void setBiotechName(org.rostlab.predictprotein.EvidencedStringType biotechName);
        
        /**
         * Appends and returns a new empty "biotechName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewBiotechName();
        
        /**
         * Unsets the "biotechName" element
         */
        void unsetBiotechName();
        
        /**
         * Gets array of all "CdAntigenName" elements
         */
        org.rostlab.predictprotein.EvidencedStringType[] getCdAntigenNameArray();
        
        /**
         * Gets ith "CdAntigenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getCdAntigenNameArray(int i);
        
        /**
         * Returns number of "CdAntigenName" element
         */
        int sizeOfCdAntigenNameArray();
        
        /**
         * Sets array of all "CdAntigenName" element
         */
        void setCdAntigenNameArray(org.rostlab.predictprotein.EvidencedStringType[] cdAntigenNameArray);
        
        /**
         * Sets ith "CdAntigenName" element
         */
        void setCdAntigenNameArray(int i, org.rostlab.predictprotein.EvidencedStringType cdAntigenName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CdAntigenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType insertNewCdAntigenName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CdAntigenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewCdAntigenName();
        
        /**
         * Removes the ith "CdAntigenName" element
         */
        void removeCdAntigenName(int i);
        
        /**
         * Gets array of all "innName" elements
         */
        org.rostlab.predictprotein.EvidencedStringType[] getInnNameArray();
        
        /**
         * Gets ith "innName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getInnNameArray(int i);
        
        /**
         * Returns number of "innName" element
         */
        int sizeOfInnNameArray();
        
        /**
         * Sets array of all "innName" element
         */
        void setInnNameArray(org.rostlab.predictprotein.EvidencedStringType[] innNameArray);
        
        /**
         * Sets ith "innName" element
         */
        void setInnNameArray(int i, org.rostlab.predictprotein.EvidencedStringType innName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "innName" element
         */
        org.rostlab.predictprotein.EvidencedStringType insertNewInnName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "innName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewInnName();
        
        /**
         * Removes the ith "innName" element
         */
        void removeInnName(int i);
        
        /**
         * An XML recommendedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface RecommendedName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecommendedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("recommendedname6548elemtype");
            
            /**
             * Gets the "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getFullName();
            
            /**
             * Sets the "fullName" element
             */
            void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewFullName();
            
            /**
             * Gets array of all "shortName" elements
             */
            org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray();
            
            /**
             * Gets ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i);
            
            /**
             * Returns number of "shortName" element
             */
            int sizeOfShortNameArray();
            
            /**
             * Sets array of all "shortName" element
             */
            void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray);
            
            /**
             * Sets ith "shortName" element
             */
            void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewShortName();
            
            /**
             * Removes the ith "shortName" element
             */
            void removeShortName(int i);
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.ProteinType.Domain.RecommendedName newInstance() {
                  return (org.rostlab.predictprotein.ProteinType.Domain.RecommendedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.ProteinType.Domain.RecommendedName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.ProteinType.Domain.RecommendedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML alternativeName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface AlternativeName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlternativeName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("alternativename7d36elemtype");
            
            /**
             * Gets the "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getFullName();
            
            /**
             * True if has "fullName" element
             */
            boolean isSetFullName();
            
            /**
             * Sets the "fullName" element
             */
            void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewFullName();
            
            /**
             * Unsets the "fullName" element
             */
            void unsetFullName();
            
            /**
             * Gets array of all "shortName" elements
             */
            org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray();
            
            /**
             * Gets ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i);
            
            /**
             * Returns number of "shortName" element
             */
            int sizeOfShortNameArray();
            
            /**
             * Sets array of all "shortName" element
             */
            void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray);
            
            /**
             * Sets ith "shortName" element
             */
            void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewShortName();
            
            /**
             * Removes the ith "shortName" element
             */
            void removeShortName(int i);
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.ProteinType.Domain.AlternativeName newInstance() {
                  return (org.rostlab.predictprotein.ProteinType.Domain.AlternativeName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.ProteinType.Domain.AlternativeName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.ProteinType.Domain.AlternativeName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML submittedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface SubmittedName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmittedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("submittedname24a8elemtype");
            
            /**
             * Gets the "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getFullName();
            
            /**
             * Sets the "fullName" element
             */
            void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewFullName();
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.ProteinType.Domain.SubmittedName newInstance() {
                  return (org.rostlab.predictprotein.ProteinType.Domain.SubmittedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.ProteinType.Domain.SubmittedName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.ProteinType.Domain.SubmittedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.ProteinType.Domain newInstance() {
              return (org.rostlab.predictprotein.ProteinType.Domain) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.ProteinType.Domain newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.ProteinType.Domain) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML component(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Component extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Component.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("componenta303elemtype");
        
        /**
         * Gets the "recommendedName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.RecommendedName getRecommendedName();
        
        /**
         * True if has "recommendedName" element
         */
        boolean isSetRecommendedName();
        
        /**
         * Sets the "recommendedName" element
         */
        void setRecommendedName(org.rostlab.predictprotein.ProteinType.Component.RecommendedName recommendedName);
        
        /**
         * Appends and returns a new empty "recommendedName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.RecommendedName addNewRecommendedName();
        
        /**
         * Unsets the "recommendedName" element
         */
        void unsetRecommendedName();
        
        /**
         * Gets array of all "alternativeName" elements
         */
        org.rostlab.predictprotein.ProteinType.Component.AlternativeName[] getAlternativeNameArray();
        
        /**
         * Gets ith "alternativeName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.AlternativeName getAlternativeNameArray(int i);
        
        /**
         * Returns number of "alternativeName" element
         */
        int sizeOfAlternativeNameArray();
        
        /**
         * Sets array of all "alternativeName" element
         */
        void setAlternativeNameArray(org.rostlab.predictprotein.ProteinType.Component.AlternativeName[] alternativeNameArray);
        
        /**
         * Sets ith "alternativeName" element
         */
        void setAlternativeNameArray(int i, org.rostlab.predictprotein.ProteinType.Component.AlternativeName alternativeName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.AlternativeName insertNewAlternativeName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alternativeName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.AlternativeName addNewAlternativeName();
        
        /**
         * Removes the ith "alternativeName" element
         */
        void removeAlternativeName(int i);
        
        /**
         * Gets array of all "submittedName" elements
         */
        org.rostlab.predictprotein.ProteinType.Component.SubmittedName[] getSubmittedNameArray();
        
        /**
         * Gets ith "submittedName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.SubmittedName getSubmittedNameArray(int i);
        
        /**
         * Returns number of "submittedName" element
         */
        int sizeOfSubmittedNameArray();
        
        /**
         * Sets array of all "submittedName" element
         */
        void setSubmittedNameArray(org.rostlab.predictprotein.ProteinType.Component.SubmittedName[] submittedNameArray);
        
        /**
         * Sets ith "submittedName" element
         */
        void setSubmittedNameArray(int i, org.rostlab.predictprotein.ProteinType.Component.SubmittedName submittedName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "submittedName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.SubmittedName insertNewSubmittedName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "submittedName" element
         */
        org.rostlab.predictprotein.ProteinType.Component.SubmittedName addNewSubmittedName();
        
        /**
         * Removes the ith "submittedName" element
         */
        void removeSubmittedName(int i);
        
        /**
         * Gets the "allergenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getAllergenName();
        
        /**
         * True if has "allergenName" element
         */
        boolean isSetAllergenName();
        
        /**
         * Sets the "allergenName" element
         */
        void setAllergenName(org.rostlab.predictprotein.EvidencedStringType allergenName);
        
        /**
         * Appends and returns a new empty "allergenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewAllergenName();
        
        /**
         * Unsets the "allergenName" element
         */
        void unsetAllergenName();
        
        /**
         * Gets the "biotechName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getBiotechName();
        
        /**
         * True if has "biotechName" element
         */
        boolean isSetBiotechName();
        
        /**
         * Sets the "biotechName" element
         */
        void setBiotechName(org.rostlab.predictprotein.EvidencedStringType biotechName);
        
        /**
         * Appends and returns a new empty "biotechName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewBiotechName();
        
        /**
         * Unsets the "biotechName" element
         */
        void unsetBiotechName();
        
        /**
         * Gets array of all "CdAntigenName" elements
         */
        org.rostlab.predictprotein.EvidencedStringType[] getCdAntigenNameArray();
        
        /**
         * Gets ith "CdAntigenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getCdAntigenNameArray(int i);
        
        /**
         * Returns number of "CdAntigenName" element
         */
        int sizeOfCdAntigenNameArray();
        
        /**
         * Sets array of all "CdAntigenName" element
         */
        void setCdAntigenNameArray(org.rostlab.predictprotein.EvidencedStringType[] cdAntigenNameArray);
        
        /**
         * Sets ith "CdAntigenName" element
         */
        void setCdAntigenNameArray(int i, org.rostlab.predictprotein.EvidencedStringType cdAntigenName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CdAntigenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType insertNewCdAntigenName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CdAntigenName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewCdAntigenName();
        
        /**
         * Removes the ith "CdAntigenName" element
         */
        void removeCdAntigenName(int i);
        
        /**
         * Gets array of all "innName" elements
         */
        org.rostlab.predictprotein.EvidencedStringType[] getInnNameArray();
        
        /**
         * Gets ith "innName" element
         */
        org.rostlab.predictprotein.EvidencedStringType getInnNameArray(int i);
        
        /**
         * Returns number of "innName" element
         */
        int sizeOfInnNameArray();
        
        /**
         * Sets array of all "innName" element
         */
        void setInnNameArray(org.rostlab.predictprotein.EvidencedStringType[] innNameArray);
        
        /**
         * Sets ith "innName" element
         */
        void setInnNameArray(int i, org.rostlab.predictprotein.EvidencedStringType innName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "innName" element
         */
        org.rostlab.predictprotein.EvidencedStringType insertNewInnName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "innName" element
         */
        org.rostlab.predictprotein.EvidencedStringType addNewInnName();
        
        /**
         * Removes the ith "innName" element
         */
        void removeInnName(int i);
        
        /**
         * An XML recommendedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface RecommendedName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecommendedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("recommendednameb7f5elemtype");
            
            /**
             * Gets the "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getFullName();
            
            /**
             * Sets the "fullName" element
             */
            void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewFullName();
            
            /**
             * Gets array of all "shortName" elements
             */
            org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray();
            
            /**
             * Gets ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i);
            
            /**
             * Returns number of "shortName" element
             */
            int sizeOfShortNameArray();
            
            /**
             * Sets array of all "shortName" element
             */
            void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray);
            
            /**
             * Sets ith "shortName" element
             */
            void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewShortName();
            
            /**
             * Removes the ith "shortName" element
             */
            void removeShortName(int i);
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.ProteinType.Component.RecommendedName newInstance() {
                  return (org.rostlab.predictprotein.ProteinType.Component.RecommendedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.ProteinType.Component.RecommendedName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.ProteinType.Component.RecommendedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML alternativeName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface AlternativeName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlternativeName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("alternativename7147elemtype");
            
            /**
             * Gets the "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getFullName();
            
            /**
             * True if has "fullName" element
             */
            boolean isSetFullName();
            
            /**
             * Sets the "fullName" element
             */
            void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewFullName();
            
            /**
             * Unsets the "fullName" element
             */
            void unsetFullName();
            
            /**
             * Gets array of all "shortName" elements
             */
            org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray();
            
            /**
             * Gets ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i);
            
            /**
             * Returns number of "shortName" element
             */
            int sizeOfShortNameArray();
            
            /**
             * Sets array of all "shortName" element
             */
            void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray);
            
            /**
             * Sets ith "shortName" element
             */
            void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewShortName();
            
            /**
             * Removes the ith "shortName" element
             */
            void removeShortName(int i);
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.ProteinType.Component.AlternativeName newInstance() {
                  return (org.rostlab.predictprotein.ProteinType.Component.AlternativeName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.ProteinType.Component.AlternativeName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.ProteinType.Component.AlternativeName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML submittedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface SubmittedName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmittedName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("submittedname3c95elemtype");
            
            /**
             * Gets the "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType getFullName();
            
            /**
             * Sets the "fullName" element
             */
            void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName);
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            org.rostlab.predictprotein.EvidencedStringType addNewFullName();
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.ProteinType.Component.SubmittedName newInstance() {
                  return (org.rostlab.predictprotein.ProteinType.Component.SubmittedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.ProteinType.Component.SubmittedName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.ProteinType.Component.SubmittedName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.ProteinType.Component newInstance() {
              return (org.rostlab.predictprotein.ProteinType.Component) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.ProteinType.Component newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.ProteinType.Component) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.ProteinType newInstance() {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.ProteinType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.ProteinType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.ProteinType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.ProteinType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.ProteinType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.ProteinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
