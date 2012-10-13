/*
 * An XML document type.
 * Localname: entry
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.EntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * A document containing one entry(@http://rostlab.org/predictprotein) element.
 *
 * This is a complex type.
 */
public interface EntryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("entry609fdoctype");
    
    /**
     * Gets the "entry" element
     */
    org.rostlab.predictprotein.EntryDocument.Entry getEntry();
    
    /**
     * Sets the "entry" element
     */
    void setEntry(org.rostlab.predictprotein.EntryDocument.Entry entry);
    
    /**
     * Appends and returns a new empty "entry" element
     */
    org.rostlab.predictprotein.EntryDocument.Entry addNewEntry();
    
    /**
     * An XML entry(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface Entry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("entry89fdelemtype");
        
        /**
         * Gets array of all "accession" elements
         */
        java.lang.String[] getAccessionArray();
        
        /**
         * Gets ith "accession" element
         */
        java.lang.String getAccessionArray(int i);
        
        /**
         * Gets (as xml) array of all "accession" elements
         */
        org.apache.xmlbeans.XmlString[] xgetAccessionArray();
        
        /**
         * Gets (as xml) ith "accession" element
         */
        org.apache.xmlbeans.XmlString xgetAccessionArray(int i);
        
        /**
         * Returns number of "accession" element
         */
        int sizeOfAccessionArray();
        
        /**
         * Sets array of all "accession" element
         */
        void setAccessionArray(java.lang.String[] accessionArray);
        
        /**
         * Sets ith "accession" element
         */
        void setAccessionArray(int i, java.lang.String accession);
        
        /**
         * Sets (as xml) array of all "accession" element
         */
        void xsetAccessionArray(org.apache.xmlbeans.XmlString[] accessionArray);
        
        /**
         * Sets (as xml) ith "accession" element
         */
        void xsetAccessionArray(int i, org.apache.xmlbeans.XmlString accession);
        
        /**
         * Inserts the value as the ith "accession" element
         */
        void insertAccession(int i, java.lang.String accession);
        
        /**
         * Appends the value as the last "accession" element
         */
        void addAccession(java.lang.String accession);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "accession" element
         */
        org.apache.xmlbeans.XmlString insertNewAccession(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "accession" element
         */
        org.apache.xmlbeans.XmlString addNewAccession();
        
        /**
         * Removes the ith "accession" element
         */
        void removeAccession(int i);
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * Gets the "protein" element
         */
        org.rostlab.predictprotein.ProteinType getProtein();
        
        /**
         * Sets the "protein" element
         */
        void setProtein(org.rostlab.predictprotein.ProteinType protein);
        
        /**
         * Appends and returns a new empty "protein" element
         */
        org.rostlab.predictprotein.ProteinType addNewProtein();
        
        /**
         * Gets array of all "gene" elements
         */
        org.rostlab.predictprotein.EntryDocument.Entry.Gene[] getGeneArray();
        
        /**
         * Gets ith "gene" element
         */
        org.rostlab.predictprotein.EntryDocument.Entry.Gene getGeneArray(int i);
        
        /**
         * Returns number of "gene" element
         */
        int sizeOfGeneArray();
        
        /**
         * Sets array of all "gene" element
         */
        void setGeneArray(org.rostlab.predictprotein.EntryDocument.Entry.Gene[] geneArray);
        
        /**
         * Sets ith "gene" element
         */
        void setGeneArray(int i, org.rostlab.predictprotein.EntryDocument.Entry.Gene gene);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gene" element
         */
        org.rostlab.predictprotein.EntryDocument.Entry.Gene insertNewGene(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gene" element
         */
        org.rostlab.predictprotein.EntryDocument.Entry.Gene addNewGene();
        
        /**
         * Removes the ith "gene" element
         */
        void removeGene(int i);
        
        /**
         * Gets array of all "organism" elements
         */
        org.rostlab.predictprotein.OrganismType[] getOrganismArray();
        
        /**
         * Gets ith "organism" element
         */
        org.rostlab.predictprotein.OrganismType getOrganismArray(int i);
        
        /**
         * Returns number of "organism" element
         */
        int sizeOfOrganismArray();
        
        /**
         * Sets array of all "organism" element
         */
        void setOrganismArray(org.rostlab.predictprotein.OrganismType[] organismArray);
        
        /**
         * Sets ith "organism" element
         */
        void setOrganismArray(int i, org.rostlab.predictprotein.OrganismType organism);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organism" element
         */
        org.rostlab.predictprotein.OrganismType insertNewOrganism(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organism" element
         */
        org.rostlab.predictprotein.OrganismType addNewOrganism();
        
        /**
         * Removes the ith "organism" element
         */
        void removeOrganism(int i);
        
        /**
         * Gets array of all "organismHost" elements
         */
        org.rostlab.predictprotein.OrganismType[] getOrganismHostArray();
        
        /**
         * Gets ith "organismHost" element
         */
        org.rostlab.predictprotein.OrganismType getOrganismHostArray(int i);
        
        /**
         * Returns number of "organismHost" element
         */
        int sizeOfOrganismHostArray();
        
        /**
         * Sets array of all "organismHost" element
         */
        void setOrganismHostArray(org.rostlab.predictprotein.OrganismType[] organismHostArray);
        
        /**
         * Sets ith "organismHost" element
         */
        void setOrganismHostArray(int i, org.rostlab.predictprotein.OrganismType organismHost);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organismHost" element
         */
        org.rostlab.predictprotein.OrganismType insertNewOrganismHost(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organismHost" element
         */
        org.rostlab.predictprotein.OrganismType addNewOrganismHost();
        
        /**
         * Removes the ith "organismHost" element
         */
        void removeOrganismHost(int i);
        
        /**
         * Gets array of all "geneLocation" elements
         */
        org.rostlab.predictprotein.GeneLocationType[] getGeneLocationArray();
        
        /**
         * Gets ith "geneLocation" element
         */
        org.rostlab.predictprotein.GeneLocationType getGeneLocationArray(int i);
        
        /**
         * Returns number of "geneLocation" element
         */
        int sizeOfGeneLocationArray();
        
        /**
         * Sets array of all "geneLocation" element
         */
        void setGeneLocationArray(org.rostlab.predictprotein.GeneLocationType[] geneLocationArray);
        
        /**
         * Sets ith "geneLocation" element
         */
        void setGeneLocationArray(int i, org.rostlab.predictprotein.GeneLocationType geneLocation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "geneLocation" element
         */
        org.rostlab.predictprotein.GeneLocationType insertNewGeneLocation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "geneLocation" element
         */
        org.rostlab.predictprotein.GeneLocationType addNewGeneLocation();
        
        /**
         * Removes the ith "geneLocation" element
         */
        void removeGeneLocation(int i);
        
        /**
         * Gets array of all "reference" elements
         */
        org.rostlab.predictprotein.ReferenceType[] getReferenceArray();
        
        /**
         * Gets ith "reference" element
         */
        org.rostlab.predictprotein.ReferenceType getReferenceArray(int i);
        
        /**
         * Returns number of "reference" element
         */
        int sizeOfReferenceArray();
        
        /**
         * Sets array of all "reference" element
         */
        void setReferenceArray(org.rostlab.predictprotein.ReferenceType[] referenceArray);
        
        /**
         * Sets ith "reference" element
         */
        void setReferenceArray(int i, org.rostlab.predictprotein.ReferenceType reference);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reference" element
         */
        org.rostlab.predictprotein.ReferenceType insertNewReference(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reference" element
         */
        org.rostlab.predictprotein.ReferenceType addNewReference();
        
        /**
         * Removes the ith "reference" element
         */
        void removeReference(int i);
        
        /**
         * Gets array of all "comment" elements
         */
        org.rostlab.predictprotein.CommentType[] getCommentArray();
        
        /**
         * Gets ith "comment" element
         */
        org.rostlab.predictprotein.CommentType getCommentArray(int i);
        
        /**
         * Tests for nil ith "comment" element
         */
        boolean isNilCommentArray(int i);
        
        /**
         * Returns number of "comment" element
         */
        int sizeOfCommentArray();
        
        /**
         * Sets array of all "comment" element
         */
        void setCommentArray(org.rostlab.predictprotein.CommentType[] commentArray);
        
        /**
         * Sets ith "comment" element
         */
        void setCommentArray(int i, org.rostlab.predictprotein.CommentType comment);
        
        /**
         * Nils the ith "comment" element
         */
        void setNilCommentArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "comment" element
         */
        org.rostlab.predictprotein.CommentType insertNewComment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "comment" element
         */
        org.rostlab.predictprotein.CommentType addNewComment();
        
        /**
         * Removes the ith "comment" element
         */
        void removeComment(int i);
        
        /**
         * Gets the "predictionRuns" element
         */
        org.rostlab.predictprotein.PredictionRunGroupType getPredictionRuns();
        
        /**
         * True if has "predictionRuns" element
         */
        boolean isSetPredictionRuns();
        
        /**
         * Sets the "predictionRuns" element
         */
        void setPredictionRuns(org.rostlab.predictprotein.PredictionRunGroupType predictionRuns);
        
        /**
         * Appends and returns a new empty "predictionRuns" element
         */
        org.rostlab.predictprotein.PredictionRunGroupType addNewPredictionRuns();
        
        /**
         * Unsets the "predictionRuns" element
         */
        void unsetPredictionRuns();
        
        /**
         * Gets array of all "aliProviderGroup" elements
         */
        org.rostlab.predictprotein.AliProviderGroupType[] getAliProviderGroupArray();
        
        /**
         * Gets ith "aliProviderGroup" element
         */
        org.rostlab.predictprotein.AliProviderGroupType getAliProviderGroupArray(int i);
        
        /**
         * Returns number of "aliProviderGroup" element
         */
        int sizeOfAliProviderGroupArray();
        
        /**
         * Sets array of all "aliProviderGroup" element
         */
        void setAliProviderGroupArray(org.rostlab.predictprotein.AliProviderGroupType[] aliProviderGroupArray);
        
        /**
         * Sets ith "aliProviderGroup" element
         */
        void setAliProviderGroupArray(int i, org.rostlab.predictprotein.AliProviderGroupType aliProviderGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "aliProviderGroup" element
         */
        org.rostlab.predictprotein.AliProviderGroupType insertNewAliProviderGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "aliProviderGroup" element
         */
        org.rostlab.predictprotein.AliProviderGroupType addNewAliProviderGroup();
        
        /**
         * Removes the ith "aliProviderGroup" element
         */
        void removeAliProviderGroup(int i);
        
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
         * Gets the "proteinExistence" element
         */
        org.rostlab.predictprotein.ProteinExistenceType getProteinExistence();
        
        /**
         * Sets the "proteinExistence" element
         */
        void setProteinExistence(org.rostlab.predictprotein.ProteinExistenceType proteinExistence);
        
        /**
         * Appends and returns a new empty "proteinExistence" element
         */
        org.rostlab.predictprotein.ProteinExistenceType addNewProteinExistence();
        
        /**
         * Gets array of all "keyword" elements
         */
        org.rostlab.predictprotein.KeywordType[] getKeywordArray();
        
        /**
         * Gets ith "keyword" element
         */
        org.rostlab.predictprotein.KeywordType getKeywordArray(int i);
        
        /**
         * Returns number of "keyword" element
         */
        int sizeOfKeywordArray();
        
        /**
         * Sets array of all "keyword" element
         */
        void setKeywordArray(org.rostlab.predictprotein.KeywordType[] keywordArray);
        
        /**
         * Sets ith "keyword" element
         */
        void setKeywordArray(int i, org.rostlab.predictprotein.KeywordType keyword);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keyword" element
         */
        org.rostlab.predictprotein.KeywordType insertNewKeyword(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keyword" element
         */
        org.rostlab.predictprotein.KeywordType addNewKeyword();
        
        /**
         * Removes the ith "keyword" element
         */
        void removeKeyword(int i);
        
        /**
         * Gets array of all "featureTypeGroup" elements
         */
        org.rostlab.predictprotein.FeatureTypeGroupType[] getFeatureTypeGroupArray();
        
        /**
         * Gets ith "featureTypeGroup" element
         */
        org.rostlab.predictprotein.FeatureTypeGroupType getFeatureTypeGroupArray(int i);
        
        /**
         * Returns number of "featureTypeGroup" element
         */
        int sizeOfFeatureTypeGroupArray();
        
        /**
         * Sets array of all "featureTypeGroup" element
         */
        void setFeatureTypeGroupArray(org.rostlab.predictprotein.FeatureTypeGroupType[] featureTypeGroupArray);
        
        /**
         * Sets ith "featureTypeGroup" element
         */
        void setFeatureTypeGroupArray(int i, org.rostlab.predictprotein.FeatureTypeGroupType featureTypeGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "featureTypeGroup" element
         */
        org.rostlab.predictprotein.FeatureTypeGroupType insertNewFeatureTypeGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "featureTypeGroup" element
         */
        org.rostlab.predictprotein.FeatureTypeGroupType addNewFeatureTypeGroup();
        
        /**
         * Removes the ith "featureTypeGroup" element
         */
        void removeFeatureTypeGroup(int i);
        
        /**
         * Gets array of all "evidence" elements
         */
        org.rostlab.predictprotein.EvidenceType[] getEvidenceArray();
        
        /**
         * Gets ith "evidence" element
         */
        org.rostlab.predictprotein.EvidenceType getEvidenceArray(int i);
        
        /**
         * Returns number of "evidence" element
         */
        int sizeOfEvidenceArray();
        
        /**
         * Sets array of all "evidence" element
         */
        void setEvidenceArray(org.rostlab.predictprotein.EvidenceType[] evidenceArray);
        
        /**
         * Sets ith "evidence" element
         */
        void setEvidenceArray(int i, org.rostlab.predictprotein.EvidenceType evidence);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "evidence" element
         */
        org.rostlab.predictprotein.EvidenceType insertNewEvidence(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "evidence" element
         */
        org.rostlab.predictprotein.EvidenceType addNewEvidence();
        
        /**
         * Removes the ith "evidence" element
         */
        void removeEvidence(int i);
        
        /**
         * Gets the "sequence" element
         */
        org.rostlab.predictprotein.SequenceType getSequence();
        
        /**
         * Sets the "sequence" element
         */
        void setSequence(org.rostlab.predictprotein.SequenceType sequence);
        
        /**
         * Appends and returns a new empty "sequence" element
         */
        org.rostlab.predictprotein.SequenceType addNewSequence();
        
        /**
         * Gets the "dataset" attribute
         */
        org.rostlab.predictprotein.EntryDocument.Entry.Dataset.Enum getDataset();
        
        /**
         * Gets (as xml) the "dataset" attribute
         */
        org.rostlab.predictprotein.EntryDocument.Entry.Dataset xgetDataset();
        
        /**
         * Sets the "dataset" attribute
         */
        void setDataset(org.rostlab.predictprotein.EntryDocument.Entry.Dataset.Enum dataset);
        
        /**
         * Sets (as xml) the "dataset" attribute
         */
        void xsetDataset(org.rostlab.predictprotein.EntryDocument.Entry.Dataset dataset);
        
        /**
         * Gets the "created" attribute
         */
        java.util.Calendar getCreated();
        
        /**
         * Gets (as xml) the "created" attribute
         */
        org.apache.xmlbeans.XmlDate xgetCreated();
        
        /**
         * Sets the "created" attribute
         */
        void setCreated(java.util.Calendar created);
        
        /**
         * Sets (as xml) the "created" attribute
         */
        void xsetCreated(org.apache.xmlbeans.XmlDate created);
        
        /**
         * Gets the "modified" attribute
         */
        java.util.Calendar getModified();
        
        /**
         * Gets (as xml) the "modified" attribute
         */
        org.apache.xmlbeans.XmlDate xgetModified();
        
        /**
         * Sets the "modified" attribute
         */
        void setModified(java.util.Calendar modified);
        
        /**
         * Sets (as xml) the "modified" attribute
         */
        void xsetModified(org.apache.xmlbeans.XmlDate modified);
        
        /**
         * Gets the "version" attribute
         */
        java.math.BigInteger getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.math.BigInteger version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlInteger version);
        
        /**
         * An XML gene(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface Gene extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gene.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("geneb36eelemtype");
            
            /**
             * Gets array of all "name" elements
             */
            org.rostlab.predictprotein.GeneNameType[] getNameArray();
            
            /**
             * Gets ith "name" element
             */
            org.rostlab.predictprotein.GeneNameType getNameArray(int i);
            
            /**
             * Returns number of "name" element
             */
            int sizeOfNameArray();
            
            /**
             * Sets array of all "name" element
             */
            void setNameArray(org.rostlab.predictprotein.GeneNameType[] nameArray);
            
            /**
             * Sets ith "name" element
             */
            void setNameArray(int i, org.rostlab.predictprotein.GeneNameType name);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "name" element
             */
            org.rostlab.predictprotein.GeneNameType insertNewName(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "name" element
             */
            org.rostlab.predictprotein.GeneNameType addNewName();
            
            /**
             * Removes the ith "name" element
             */
            void removeName(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.EntryDocument.Entry.Gene newInstance() {
                  return (org.rostlab.predictprotein.EntryDocument.Entry.Gene) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.EntryDocument.Entry.Gene newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.EntryDocument.Entry.Gene) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML dataset(@).
         *
         * This is an atomic type that is a restriction of org.rostlab.predictprotein.EntryDocument$Entry$Dataset.
         */
        public interface Dataset extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dataset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("dataset26ddattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PP_JOB_DB = Enum.forString("PPJobDB");
            
            static final int INT_PP_JOB_DB = Enum.INT_PP_JOB_DB;
            
            /**
             * Enumeration value class for org.rostlab.predictprotein.EntryDocument$Entry$Dataset.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PP_JOB_DB
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
                
                static final int INT_PP_JOB_DB = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("PPJobDB", INT_PP_JOB_DB),
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
                public static org.rostlab.predictprotein.EntryDocument.Entry.Dataset newValue(java.lang.Object obj) {
                  return (org.rostlab.predictprotein.EntryDocument.Entry.Dataset) type.newValue( obj ); }
                
                public static org.rostlab.predictprotein.EntryDocument.Entry.Dataset newInstance() {
                  return (org.rostlab.predictprotein.EntryDocument.Entry.Dataset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.EntryDocument.Entry.Dataset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.EntryDocument.Entry.Dataset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.EntryDocument.Entry newInstance() {
              return (org.rostlab.predictprotein.EntryDocument.Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.EntryDocument.Entry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.EntryDocument.Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.EntryDocument newInstance() {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.EntryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.EntryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.EntryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.EntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.EntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.EntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
