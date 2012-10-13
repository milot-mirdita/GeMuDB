/*
 * XML Type:  featureType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.FeatureType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML featureType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface FeatureType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("featuretypeaecdtype");
    
    /**
     * Gets the "original" element
     */
    java.lang.String getOriginal();
    
    /**
     * Gets (as xml) the "original" element
     */
    org.apache.xmlbeans.XmlString xgetOriginal();
    
    /**
     * True if has "original" element
     */
    boolean isSetOriginal();
    
    /**
     * Sets the "original" element
     */
    void setOriginal(java.lang.String original);
    
    /**
     * Sets (as xml) the "original" element
     */
    void xsetOriginal(org.apache.xmlbeans.XmlString original);
    
    /**
     * Unsets the "original" element
     */
    void unsetOriginal();
    
    /**
     * Gets array of all "variation" elements
     */
    java.lang.String[] getVariationArray();
    
    /**
     * Gets ith "variation" element
     */
    java.lang.String getVariationArray(int i);
    
    /**
     * Gets (as xml) array of all "variation" elements
     */
    org.apache.xmlbeans.XmlString[] xgetVariationArray();
    
    /**
     * Gets (as xml) ith "variation" element
     */
    org.apache.xmlbeans.XmlString xgetVariationArray(int i);
    
    /**
     * Returns number of "variation" element
     */
    int sizeOfVariationArray();
    
    /**
     * Sets array of all "variation" element
     */
    void setVariationArray(java.lang.String[] variationArray);
    
    /**
     * Sets ith "variation" element
     */
    void setVariationArray(int i, java.lang.String variation);
    
    /**
     * Sets (as xml) array of all "variation" element
     */
    void xsetVariationArray(org.apache.xmlbeans.XmlString[] variationArray);
    
    /**
     * Sets (as xml) ith "variation" element
     */
    void xsetVariationArray(int i, org.apache.xmlbeans.XmlString variation);
    
    /**
     * Inserts the value as the ith "variation" element
     */
    void insertVariation(int i, java.lang.String variation);
    
    /**
     * Appends the value as the last "variation" element
     */
    void addVariation(java.lang.String variation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variation" element
     */
    org.apache.xmlbeans.XmlString insertNewVariation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variation" element
     */
    org.apache.xmlbeans.XmlString addNewVariation();
    
    /**
     * Removes the ith "variation" element
     */
    void removeVariation(int i);
    
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
     * Gets the "type" attribute
     */
    org.rostlab.predictprotein.FeatureType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.rostlab.predictprotein.FeatureType.Type xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.rostlab.predictprotein.FeatureType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.rostlab.predictprotein.FeatureType.Type type);
    
    /**
     * Gets the "status" attribute
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "status" attribute
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" attribute
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "status" attribute
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "status" attribute
     */
    void unsetStatus();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
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
     * Gets the "soTermId" attribute
     */
    java.lang.String getSoTermId();
    
    /**
     * Gets (as xml) the "soTermId" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoTermId();
    
    /**
     * True if has "soTermId" attribute
     */
    boolean isSetSoTermId();
    
    /**
     * Sets the "soTermId" attribute
     */
    void setSoTermId(java.lang.String soTermId);
    
    /**
     * Sets (as xml) the "soTermId" attribute
     */
    void xsetSoTermId(org.apache.xmlbeans.XmlString soTermId);
    
    /**
     * Unsets the "soTermId" attribute
     */
    void unsetSoTermId();
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.FeatureType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("typefc27attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ACTIVE_SITE = Enum.forString("active site");
        static final Enum BINDING_SITE = Enum.forString("binding site");
        static final Enum CALCIUM_BINDING_REGION = Enum.forString("calcium-binding region");
        static final Enum CHAIN = Enum.forString("chain");
        static final Enum COILED_COIL_REGION = Enum.forString("coiled-coil region");
        static final Enum COMPOSITIONALLY_BIASED_REGION = Enum.forString("compositionally biased region");
        static final Enum CROSS_LINK = Enum.forString("cross-link");
        static final Enum DISORDERED_REGION = Enum.forString("disordered region");
        static final Enum DISULFIDE_BOND = Enum.forString("disulfide bond");
        static final Enum DNA_BINDING_REGION = Enum.forString("DNA-binding region");
        static final Enum DOMAIN = Enum.forString("domain");
        static final Enum GLYCOSYLATION_SITE = Enum.forString("glycosylation site");
        static final Enum HELICAL_TRANSMEMBRANE_REGION = Enum.forString("helical transmembrane region");
        static final Enum HELIX = Enum.forString("helix");
        static final Enum INITIATOR_METHIONINE = Enum.forString("initiator methionine");
        static final Enum LIPID_MOIETY_BINDING_REGION = Enum.forString("lipid moiety-binding region");
        static final Enum METAL_ION_BINDING_SITE = Enum.forString("metal ion-binding site");
        static final Enum MODIFIED_RESIDUE = Enum.forString("modified residue");
        static final Enum MUTAGENESIS_SITE = Enum.forString("mutagenesis site");
        static final Enum NON_CONSECUTIVE_RESIDUES = Enum.forString("non-consecutive residues");
        static final Enum NON_REGULAR_SECONDARY_STRUCTURE = Enum.forString("non-regular secondary structure");
        static final Enum NON_STANDARD_AMINO_ACID = Enum.forString("non-standard amino acid");
        static final Enum NON_TERMINAL_RESIDUE = Enum.forString("non-terminal residue");
        static final Enum NUCLEAR_LOCALISATION_SIGNAL = Enum.forString("nuclear localisation signal");
        static final Enum NUCLEOTIDE_PHOSPHATE_BINDING_REGION = Enum.forString("nucleotide phosphate-binding region");
        static final Enum PEPTIDE = Enum.forString("peptide");
        static final Enum PROPEPTIDE = Enum.forString("propeptide");
        static final Enum PROTEIN_BINDING_REGION = Enum.forString("protein binding region");
        static final Enum REGION_OF_INTEREST = Enum.forString("region of interest");
        static final Enum REPEAT = Enum.forString("repeat");
        static final Enum SECONDARY_STRUCTURE_SWITCH = Enum.forString("secondary structure switch");
        static final Enum SEQUENCE_CONFLICT = Enum.forString("sequence conflict");
        static final Enum SEQUENCE_VARIANT = Enum.forString("sequence variant");
        static final Enum SHORT_SEQUENCE_MOTIF = Enum.forString("short sequence motif");
        static final Enum SIGNAL_PEPTIDE = Enum.forString("signal peptide");
        static final Enum SITE = Enum.forString("site");
        static final Enum SOLVENT_ACCESSIBILITY = Enum.forString("solvent accessibility");
        static final Enum SPLICE_VARIANT = Enum.forString("splice variant");
        static final Enum STRAND = Enum.forString("strand");
        static final Enum TOPOLOGICAL_DOMAIN = Enum.forString("topological domain");
        static final Enum TRANSIT_PEPTIDE = Enum.forString("transit peptide");
        static final Enum TRANSMEMBRANE_BETA_BARREL_DOWN_STRAND = Enum.forString("transmembrane beta-barrel down strand");
        static final Enum TRANSMEMBRANE_BETA_BARREL_OUTER_LOOP = Enum.forString("transmembrane beta-barrel outer loop");
        static final Enum TRANSMEMBRANE_BETA_BARREL_PERIPLASMIC_LOOP = Enum.forString("transmembrane beta-barrel periplasmic loop");
        static final Enum TRANSMEMBRANE_BETA_BARREL_UP_STRAND = Enum.forString("transmembrane beta-barrel up strand");
        static final Enum TRANSMEMBRANE_REGION = Enum.forString("transmembrane region");
        static final Enum TURN = Enum.forString("turn");
        static final Enum UNSURE_RESIDUE = Enum.forString("unsure residue");
        static final Enum ZINC_FINGER_REGION = Enum.forString("zinc finger region");
        
        static final int INT_ACTIVE_SITE = Enum.INT_ACTIVE_SITE;
        static final int INT_BINDING_SITE = Enum.INT_BINDING_SITE;
        static final int INT_CALCIUM_BINDING_REGION = Enum.INT_CALCIUM_BINDING_REGION;
        static final int INT_CHAIN = Enum.INT_CHAIN;
        static final int INT_COILED_COIL_REGION = Enum.INT_COILED_COIL_REGION;
        static final int INT_COMPOSITIONALLY_BIASED_REGION = Enum.INT_COMPOSITIONALLY_BIASED_REGION;
        static final int INT_CROSS_LINK = Enum.INT_CROSS_LINK;
        static final int INT_DISORDERED_REGION = Enum.INT_DISORDERED_REGION;
        static final int INT_DISULFIDE_BOND = Enum.INT_DISULFIDE_BOND;
        static final int INT_DNA_BINDING_REGION = Enum.INT_DNA_BINDING_REGION;
        static final int INT_DOMAIN = Enum.INT_DOMAIN;
        static final int INT_GLYCOSYLATION_SITE = Enum.INT_GLYCOSYLATION_SITE;
        static final int INT_HELICAL_TRANSMEMBRANE_REGION = Enum.INT_HELICAL_TRANSMEMBRANE_REGION;
        static final int INT_HELIX = Enum.INT_HELIX;
        static final int INT_INITIATOR_METHIONINE = Enum.INT_INITIATOR_METHIONINE;
        static final int INT_LIPID_MOIETY_BINDING_REGION = Enum.INT_LIPID_MOIETY_BINDING_REGION;
        static final int INT_METAL_ION_BINDING_SITE = Enum.INT_METAL_ION_BINDING_SITE;
        static final int INT_MODIFIED_RESIDUE = Enum.INT_MODIFIED_RESIDUE;
        static final int INT_MUTAGENESIS_SITE = Enum.INT_MUTAGENESIS_SITE;
        static final int INT_NON_CONSECUTIVE_RESIDUES = Enum.INT_NON_CONSECUTIVE_RESIDUES;
        static final int INT_NON_REGULAR_SECONDARY_STRUCTURE = Enum.INT_NON_REGULAR_SECONDARY_STRUCTURE;
        static final int INT_NON_TERMINAL_RESIDUE = Enum.INT_NON_TERMINAL_RESIDUE;
        static final int INT_NUCLEAR_LOCALISATION_SIGNAL = Enum.INT_NUCLEAR_LOCALISATION_SIGNAL;
        static final int INT_NUCLEOTIDE_PHOSPHATE_BINDING_REGION = Enum.INT_NUCLEOTIDE_PHOSPHATE_BINDING_REGION;
        static final int INT_PEPTIDE = Enum.INT_PEPTIDE;
        static final int INT_PROPEPTIDE = Enum.INT_PROPEPTIDE;
        static final int INT_PROTEIN_BINDING_REGION = Enum.INT_PROTEIN_BINDING_REGION;
        static final int INT_REGION_OF_INTEREST = Enum.INT_REGION_OF_INTEREST;
        static final int INT_REPEAT = Enum.INT_REPEAT;
        static final int INT_SECONDARY_STRUCTURE_SWITCH = Enum.INT_SECONDARY_STRUCTURE_SWITCH;
        static final int INT_SEQUENCE_CONFLICT = Enum.INT_SEQUENCE_CONFLICT;
        static final int INT_SEQUENCE_VARIANT = Enum.INT_SEQUENCE_VARIANT;
        static final int INT_SHORT_SEQUENCE_MOTIF = Enum.INT_SHORT_SEQUENCE_MOTIF;
        static final int INT_SIGNAL_PEPTIDE = Enum.INT_SIGNAL_PEPTIDE;
        static final int INT_SITE = Enum.INT_SITE;
        static final int INT_SOLVENT_ACCESSIBILITY = Enum.INT_SOLVENT_ACCESSIBILITY;
        static final int INT_SPLICE_VARIANT = Enum.INT_SPLICE_VARIANT;
        static final int INT_STRAND = Enum.INT_STRAND;
        static final int INT_TOPOLOGICAL_DOMAIN = Enum.INT_TOPOLOGICAL_DOMAIN;
        static final int INT_TRANSIT_PEPTIDE = Enum.INT_TRANSIT_PEPTIDE;
        static final int INT_TRANSMEMBRANE_BETA_BARREL_DOWN_STRAND = Enum.INT_TRANSMEMBRANE_BETA_BARREL_DOWN_STRAND;
        static final int INT_TRANSMEMBRANE_BETA_BARREL_OUTER_LOOP = Enum.INT_TRANSMEMBRANE_BETA_BARREL_OUTER_LOOP;
        static final int INT_TRANSMEMBRANE_BETA_BARREL_PERIPLASMIC_LOOP = Enum.INT_TRANSMEMBRANE_BETA_BARREL_PERIPLASMIC_LOOP;
        static final int INT_TRANSMEMBRANE_BETA_BARREL_UP_STRAND = Enum.INT_TRANSMEMBRANE_BETA_BARREL_UP_STRAND;
        static final int INT_TRANSMEMBRANE_REGION = Enum.INT_TRANSMEMBRANE_REGION;
        static final int INT_TURN = Enum.INT_TURN;
        static final int INT_UNSURE_RESIDUE = Enum.INT_UNSURE_RESIDUE;
        static final int INT_ZINC_FINGER_REGION = Enum.INT_ZINC_FINGER_REGION;
        
        /**
         * Enumeration value class for org.rostlab.predictprotein.FeatureType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ACTIVE_SITE
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
            
            static final int INT_ACTIVE_SITE = 1;
            static final int INT_BINDING_SITE = 2;
            static final int INT_CALCIUM_BINDING_REGION = 3;
            static final int INT_CHAIN = 4;
            static final int INT_COILED_COIL_REGION = 5;
            static final int INT_COMPOSITIONALLY_BIASED_REGION = 6;
            static final int INT_CROSS_LINK = 7;
            static final int INT_DISORDERED_REGION = 8;
            static final int INT_DISULFIDE_BOND = 9;
            static final int INT_DNA_BINDING_REGION = 10;
            static final int INT_DOMAIN = 11;
            static final int INT_GLYCOSYLATION_SITE = 12;
            static final int INT_HELICAL_TRANSMEMBRANE_REGION = 13;
            static final int INT_HELIX = 14;
            static final int INT_INITIATOR_METHIONINE = 15;
            static final int INT_LIPID_MOIETY_BINDING_REGION = 16;
            static final int INT_METAL_ION_BINDING_SITE = 17;
            static final int INT_MODIFIED_RESIDUE = 18;
            static final int INT_MUTAGENESIS_SITE = 19;
            static final int INT_NON_CONSECUTIVE_RESIDUES = 20;
            static final int INT_NON_REGULAR_SECONDARY_STRUCTURE = 21;
            static final int INT_NON_STANDARD_AMINO_ACID = 22;
            static final int INT_NON_TERMINAL_RESIDUE = 23;
            static final int INT_NUCLEAR_LOCALISATION_SIGNAL = 24;
            static final int INT_NUCLEOTIDE_PHOSPHATE_BINDING_REGION = 25;
            static final int INT_PEPTIDE = 26;
            static final int INT_PROPEPTIDE = 27;
            static final int INT_PROTEIN_BINDING_REGION = 28;
            static final int INT_REGION_OF_INTEREST = 29;
            static final int INT_REPEAT = 30;
            static final int INT_SECONDARY_STRUCTURE_SWITCH = 31;
            static final int INT_NON_STANDARD_AMINO_ACID_2 = 32;
            static final int INT_SEQUENCE_CONFLICT = 33;
            static final int INT_SEQUENCE_VARIANT = 34;
            static final int INT_SHORT_SEQUENCE_MOTIF = 35;
            static final int INT_SIGNAL_PEPTIDE = 36;
            static final int INT_SITE = 37;
            static final int INT_SOLVENT_ACCESSIBILITY = 38;
            static final int INT_SPLICE_VARIANT = 39;
            static final int INT_STRAND = 40;
            static final int INT_TOPOLOGICAL_DOMAIN = 41;
            static final int INT_TRANSIT_PEPTIDE = 42;
            static final int INT_TRANSMEMBRANE_BETA_BARREL_DOWN_STRAND = 43;
            static final int INT_TRANSMEMBRANE_BETA_BARREL_OUTER_LOOP = 44;
            static final int INT_TRANSMEMBRANE_BETA_BARREL_PERIPLASMIC_LOOP = 45;
            static final int INT_TRANSMEMBRANE_BETA_BARREL_UP_STRAND = 46;
            static final int INT_TRANSMEMBRANE_REGION = 47;
            static final int INT_TURN = 48;
            static final int INT_UNSURE_RESIDUE = 49;
            static final int INT_ZINC_FINGER_REGION = 50;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("active site", INT_ACTIVE_SITE),
                    new Enum("binding site", INT_BINDING_SITE),
                    new Enum("calcium-binding region", INT_CALCIUM_BINDING_REGION),
                    new Enum("chain", INT_CHAIN),
                    new Enum("coiled-coil region", INT_COILED_COIL_REGION),
                    new Enum("compositionally biased region", INT_COMPOSITIONALLY_BIASED_REGION),
                    new Enum("cross-link", INT_CROSS_LINK),
                    new Enum("disordered region", INT_DISORDERED_REGION),
                    new Enum("disulfide bond", INT_DISULFIDE_BOND),
                    new Enum("DNA-binding region", INT_DNA_BINDING_REGION),
                    new Enum("domain", INT_DOMAIN),
                    new Enum("glycosylation site", INT_GLYCOSYLATION_SITE),
                    new Enum("helical transmembrane region", INT_HELICAL_TRANSMEMBRANE_REGION),
                    new Enum("helix", INT_HELIX),
                    new Enum("initiator methionine", INT_INITIATOR_METHIONINE),
                    new Enum("lipid moiety-binding region", INT_LIPID_MOIETY_BINDING_REGION),
                    new Enum("metal ion-binding site", INT_METAL_ION_BINDING_SITE),
                    new Enum("modified residue", INT_MODIFIED_RESIDUE),
                    new Enum("mutagenesis site", INT_MUTAGENESIS_SITE),
                    new Enum("non-consecutive residues", INT_NON_CONSECUTIVE_RESIDUES),
                    new Enum("non-regular secondary structure", INT_NON_REGULAR_SECONDARY_STRUCTURE),
                    new Enum("non-standard amino acid", INT_NON_STANDARD_AMINO_ACID),
                    new Enum("non-terminal residue", INT_NON_TERMINAL_RESIDUE),
                    new Enum("nuclear localisation signal", INT_NUCLEAR_LOCALISATION_SIGNAL),
                    new Enum("nucleotide phosphate-binding region", INT_NUCLEOTIDE_PHOSPHATE_BINDING_REGION),
                    new Enum("peptide", INT_PEPTIDE),
                    new Enum("propeptide", INT_PROPEPTIDE),
                    new Enum("protein binding region", INT_PROTEIN_BINDING_REGION),
                    new Enum("region of interest", INT_REGION_OF_INTEREST),
                    new Enum("repeat", INT_REPEAT),
                    new Enum("secondary structure switch", INT_SECONDARY_STRUCTURE_SWITCH),
                    new Enum("non-standard amino acid", INT_NON_STANDARD_AMINO_ACID_2),
                    new Enum("sequence conflict", INT_SEQUENCE_CONFLICT),
                    new Enum("sequence variant", INT_SEQUENCE_VARIANT),
                    new Enum("short sequence motif", INT_SHORT_SEQUENCE_MOTIF),
                    new Enum("signal peptide", INT_SIGNAL_PEPTIDE),
                    new Enum("site", INT_SITE),
                    new Enum("solvent accessibility", INT_SOLVENT_ACCESSIBILITY),
                    new Enum("splice variant", INT_SPLICE_VARIANT),
                    new Enum("strand", INT_STRAND),
                    new Enum("topological domain", INT_TOPOLOGICAL_DOMAIN),
                    new Enum("transit peptide", INT_TRANSIT_PEPTIDE),
                    new Enum("transmembrane beta-barrel down strand", INT_TRANSMEMBRANE_BETA_BARREL_DOWN_STRAND),
                    new Enum("transmembrane beta-barrel outer loop", INT_TRANSMEMBRANE_BETA_BARREL_OUTER_LOOP),
                    new Enum("transmembrane beta-barrel periplasmic loop", INT_TRANSMEMBRANE_BETA_BARREL_PERIPLASMIC_LOOP),
                    new Enum("transmembrane beta-barrel up strand", INT_TRANSMEMBRANE_BETA_BARREL_UP_STRAND),
                    new Enum("transmembrane region", INT_TRANSMEMBRANE_REGION),
                    new Enum("turn", INT_TURN),
                    new Enum("unsure residue", INT_UNSURE_RESIDUE),
                    new Enum("zinc finger region", INT_ZINC_FINGER_REGION),
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
            public static org.rostlab.predictprotein.FeatureType.Type newValue(java.lang.Object obj) {
              return (org.rostlab.predictprotein.FeatureType.Type) type.newValue( obj ); }
            
            public static org.rostlab.predictprotein.FeatureType.Type newInstance() {
              return (org.rostlab.predictprotein.FeatureType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.FeatureType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.FeatureType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.FeatureType newInstance() {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.FeatureType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.FeatureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.FeatureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.FeatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.FeatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.FeatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
