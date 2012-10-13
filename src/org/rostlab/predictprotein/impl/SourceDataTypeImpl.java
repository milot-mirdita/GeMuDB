/*
 * XML Type:  sourceDataType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SourceDataType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML sourceDataType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class SourceDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.SourceDataType
{
    private static final long serialVersionUID = 1L;
    
    public SourceDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIES$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "species");
    private static final javax.xml.namespace.QName STRAIN$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "strain");
    private static final javax.xml.namespace.QName PLASMID$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "plasmid");
    private static final javax.xml.namespace.QName TRANSPOSON$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "transposon");
    private static final javax.xml.namespace.QName TISSUE$8 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "tissue");
    
    
    /**
     * Gets array of all "species" elements
     */
    public org.rostlab.predictprotein.SourceDataType.Species[] getSpeciesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIES$0, targetList);
            org.rostlab.predictprotein.SourceDataType.Species[] result = new org.rostlab.predictprotein.SourceDataType.Species[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "species" element
     */
    public org.rostlab.predictprotein.SourceDataType.Species getSpeciesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Species target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Species)get_store().find_element_user(SPECIES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "species" element
     */
    public int sizeOfSpeciesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIES$0);
        }
    }
    
    /**
     * Sets array of all "species" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpeciesArray(org.rostlab.predictprotein.SourceDataType.Species[] speciesArray)
    {
        check_orphaned();
        arraySetterHelper(speciesArray, SPECIES$0);
    }
    
    /**
     * Sets ith "species" element
     */
    public void setSpeciesArray(int i, org.rostlab.predictprotein.SourceDataType.Species species)
    {
        generatedSetterHelperImpl(species, SPECIES$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "species" element
     */
    public org.rostlab.predictprotein.SourceDataType.Species insertNewSpecies(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Species target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Species)get_store().insert_element_user(SPECIES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "species" element
     */
    public org.rostlab.predictprotein.SourceDataType.Species addNewSpecies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Species target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Species)get_store().add_element_user(SPECIES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "species" element
     */
    public void removeSpecies(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIES$0, i);
        }
    }
    
    /**
     * Gets array of all "strain" elements
     */
    public org.rostlab.predictprotein.SourceDataType.Strain[] getStrainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRAIN$2, targetList);
            org.rostlab.predictprotein.SourceDataType.Strain[] result = new org.rostlab.predictprotein.SourceDataType.Strain[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "strain" element
     */
    public org.rostlab.predictprotein.SourceDataType.Strain getStrainArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Strain target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Strain)get_store().find_element_user(STRAIN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "strain" element
     */
    public int sizeOfStrainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRAIN$2);
        }
    }
    
    /**
     * Sets array of all "strain" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStrainArray(org.rostlab.predictprotein.SourceDataType.Strain[] strainArray)
    {
        check_orphaned();
        arraySetterHelper(strainArray, STRAIN$2);
    }
    
    /**
     * Sets ith "strain" element
     */
    public void setStrainArray(int i, org.rostlab.predictprotein.SourceDataType.Strain strain)
    {
        generatedSetterHelperImpl(strain, STRAIN$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "strain" element
     */
    public org.rostlab.predictprotein.SourceDataType.Strain insertNewStrain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Strain target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Strain)get_store().insert_element_user(STRAIN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "strain" element
     */
    public org.rostlab.predictprotein.SourceDataType.Strain addNewStrain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Strain target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Strain)get_store().add_element_user(STRAIN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "strain" element
     */
    public void removeStrain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRAIN$2, i);
        }
    }
    
    /**
     * Gets array of all "plasmid" elements
     */
    public org.rostlab.predictprotein.SourceDataType.Plasmid[] getPlasmidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLASMID$4, targetList);
            org.rostlab.predictprotein.SourceDataType.Plasmid[] result = new org.rostlab.predictprotein.SourceDataType.Plasmid[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "plasmid" element
     */
    public org.rostlab.predictprotein.SourceDataType.Plasmid getPlasmidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Plasmid target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Plasmid)get_store().find_element_user(PLASMID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "plasmid" element
     */
    public int sizeOfPlasmidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLASMID$4);
        }
    }
    
    /**
     * Sets array of all "plasmid" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPlasmidArray(org.rostlab.predictprotein.SourceDataType.Plasmid[] plasmidArray)
    {
        check_orphaned();
        arraySetterHelper(plasmidArray, PLASMID$4);
    }
    
    /**
     * Sets ith "plasmid" element
     */
    public void setPlasmidArray(int i, org.rostlab.predictprotein.SourceDataType.Plasmid plasmid)
    {
        generatedSetterHelperImpl(plasmid, PLASMID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "plasmid" element
     */
    public org.rostlab.predictprotein.SourceDataType.Plasmid insertNewPlasmid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Plasmid target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Plasmid)get_store().insert_element_user(PLASMID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "plasmid" element
     */
    public org.rostlab.predictprotein.SourceDataType.Plasmid addNewPlasmid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Plasmid target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Plasmid)get_store().add_element_user(PLASMID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "plasmid" element
     */
    public void removePlasmid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLASMID$4, i);
        }
    }
    
    /**
     * Gets array of all "transposon" elements
     */
    public org.rostlab.predictprotein.SourceDataType.Transposon[] getTransposonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSPOSON$6, targetList);
            org.rostlab.predictprotein.SourceDataType.Transposon[] result = new org.rostlab.predictprotein.SourceDataType.Transposon[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transposon" element
     */
    public org.rostlab.predictprotein.SourceDataType.Transposon getTransposonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Transposon target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Transposon)get_store().find_element_user(TRANSPOSON$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transposon" element
     */
    public int sizeOfTransposonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSPOSON$6);
        }
    }
    
    /**
     * Sets array of all "transposon" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTransposonArray(org.rostlab.predictprotein.SourceDataType.Transposon[] transposonArray)
    {
        check_orphaned();
        arraySetterHelper(transposonArray, TRANSPOSON$6);
    }
    
    /**
     * Sets ith "transposon" element
     */
    public void setTransposonArray(int i, org.rostlab.predictprotein.SourceDataType.Transposon transposon)
    {
        generatedSetterHelperImpl(transposon, TRANSPOSON$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transposon" element
     */
    public org.rostlab.predictprotein.SourceDataType.Transposon insertNewTransposon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Transposon target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Transposon)get_store().insert_element_user(TRANSPOSON$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transposon" element
     */
    public org.rostlab.predictprotein.SourceDataType.Transposon addNewTransposon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Transposon target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Transposon)get_store().add_element_user(TRANSPOSON$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "transposon" element
     */
    public void removeTransposon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSPOSON$6, i);
        }
    }
    
    /**
     * Gets array of all "tissue" elements
     */
    public org.rostlab.predictprotein.SourceDataType.Tissue[] getTissueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TISSUE$8, targetList);
            org.rostlab.predictprotein.SourceDataType.Tissue[] result = new org.rostlab.predictprotein.SourceDataType.Tissue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tissue" element
     */
    public org.rostlab.predictprotein.SourceDataType.Tissue getTissueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Tissue target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Tissue)get_store().find_element_user(TISSUE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tissue" element
     */
    public int sizeOfTissueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TISSUE$8);
        }
    }
    
    /**
     * Sets array of all "tissue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTissueArray(org.rostlab.predictprotein.SourceDataType.Tissue[] tissueArray)
    {
        check_orphaned();
        arraySetterHelper(tissueArray, TISSUE$8);
    }
    
    /**
     * Sets ith "tissue" element
     */
    public void setTissueArray(int i, org.rostlab.predictprotein.SourceDataType.Tissue tissue)
    {
        generatedSetterHelperImpl(tissue, TISSUE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tissue" element
     */
    public org.rostlab.predictprotein.SourceDataType.Tissue insertNewTissue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Tissue target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Tissue)get_store().insert_element_user(TISSUE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tissue" element
     */
    public org.rostlab.predictprotein.SourceDataType.Tissue addNewTissue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType.Tissue target = null;
            target = (org.rostlab.predictprotein.SourceDataType.Tissue)get_store().add_element_user(TISSUE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "tissue" element
     */
    public void removeTissue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TISSUE$8, i);
        }
    }
    /**
     * An XML species(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SourceDataType$Species.
     */
    public static class SpeciesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SourceDataType.Species
    {
        private static final long serialVersionUID = 1L;
        
        public SpeciesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SpeciesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName REF$0 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "ref" attribute
         */
        public java.lang.String getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$0);
                return target;
            }
        }
        
        /**
         * True if has "ref" attribute
         */
        public boolean isSetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REF$0) != null;
            }
        }
        
        /**
         * Sets the "ref" attribute
         */
        public void setRef(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$0);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        public void xsetRef(org.apache.xmlbeans.XmlString ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$0);
                }
                target.set(ref);
            }
        }
        
        /**
         * Unsets the "ref" attribute
         */
        public void unsetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REF$0);
            }
        }
    }
    /**
     * An XML strain(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SourceDataType$Strain.
     */
    public static class StrainImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SourceDataType.Strain
    {
        private static final long serialVersionUID = 1L;
        
        public StrainImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected StrainImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EVIDENCE$0 = 
            new javax.xml.namespace.QName("", "evidence");
        
        
        /**
         * Gets the "evidence" attribute
         */
        public java.lang.String getEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "evidence" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                return target;
            }
        }
        
        /**
         * True if has "evidence" attribute
         */
        public boolean isSetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVIDENCE$0) != null;
            }
        }
        
        /**
         * Sets the "evidence" attribute
         */
        public void setEvidence(java.lang.String evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.setStringValue(evidence);
            }
        }
        
        /**
         * Sets (as xml) the "evidence" attribute
         */
        public void xsetEvidence(org.apache.xmlbeans.XmlString evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.set(evidence);
            }
        }
        
        /**
         * Unsets the "evidence" attribute
         */
        public void unsetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVIDENCE$0);
            }
        }
    }
    /**
     * An XML plasmid(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SourceDataType$Plasmid.
     */
    public static class PlasmidImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SourceDataType.Plasmid
    {
        private static final long serialVersionUID = 1L;
        
        public PlasmidImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PlasmidImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EVIDENCE$0 = 
            new javax.xml.namespace.QName("", "evidence");
        
        
        /**
         * Gets the "evidence" attribute
         */
        public java.lang.String getEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "evidence" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                return target;
            }
        }
        
        /**
         * True if has "evidence" attribute
         */
        public boolean isSetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVIDENCE$0) != null;
            }
        }
        
        /**
         * Sets the "evidence" attribute
         */
        public void setEvidence(java.lang.String evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.setStringValue(evidence);
            }
        }
        
        /**
         * Sets (as xml) the "evidence" attribute
         */
        public void xsetEvidence(org.apache.xmlbeans.XmlString evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.set(evidence);
            }
        }
        
        /**
         * Unsets the "evidence" attribute
         */
        public void unsetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVIDENCE$0);
            }
        }
    }
    /**
     * An XML transposon(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SourceDataType$Transposon.
     */
    public static class TransposonImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SourceDataType.Transposon
    {
        private static final long serialVersionUID = 1L;
        
        public TransposonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TransposonImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EVIDENCE$0 = 
            new javax.xml.namespace.QName("", "evidence");
        
        
        /**
         * Gets the "evidence" attribute
         */
        public java.lang.String getEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "evidence" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                return target;
            }
        }
        
        /**
         * True if has "evidence" attribute
         */
        public boolean isSetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVIDENCE$0) != null;
            }
        }
        
        /**
         * Sets the "evidence" attribute
         */
        public void setEvidence(java.lang.String evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.setStringValue(evidence);
            }
        }
        
        /**
         * Sets (as xml) the "evidence" attribute
         */
        public void xsetEvidence(org.apache.xmlbeans.XmlString evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.set(evidence);
            }
        }
        
        /**
         * Unsets the "evidence" attribute
         */
        public void unsetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVIDENCE$0);
            }
        }
    }
    /**
     * An XML tissue(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SourceDataType$Tissue.
     */
    public static class TissueImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SourceDataType.Tissue
    {
        private static final long serialVersionUID = 1L;
        
        public TissueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TissueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EVIDENCE$0 = 
            new javax.xml.namespace.QName("", "evidence");
        
        
        /**
         * Gets the "evidence" attribute
         */
        public java.lang.String getEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "evidence" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                return target;
            }
        }
        
        /**
         * True if has "evidence" attribute
         */
        public boolean isSetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVIDENCE$0) != null;
            }
        }
        
        /**
         * Sets the "evidence" attribute
         */
        public void setEvidence(java.lang.String evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.setStringValue(evidence);
            }
        }
        
        /**
         * Sets (as xml) the "evidence" attribute
         */
        public void xsetEvidence(org.apache.xmlbeans.XmlString evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$0);
                }
                target.set(evidence);
            }
        }
        
        /**
         * Unsets the "evidence" attribute
         */
        public void unsetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVIDENCE$0);
            }
        }
    }
}
