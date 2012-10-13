/*
 * XML Type:  featureProviderGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.FeatureProviderGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML featureProviderGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class FeatureProviderGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.FeatureProviderGroupType
{
    private static final long serialVersionUID = 1L;
    
    public FeatureProviderGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURE$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "feature");
    private static final javax.xml.namespace.QName DISORDEREDREGION$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "disorderedRegion");
    private static final javax.xml.namespace.QName SECONDARYSTRUCTURES$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "secondaryStructures");
    private static final javax.xml.namespace.QName SOLVENTACCESSIBILITY$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "solventAccessibility");
    private static final javax.xml.namespace.QName PROVIDER$8 = 
        new javax.xml.namespace.QName("", "provider");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName REF$12 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName PREDRUNREF$14 = 
        new javax.xml.namespace.QName("", "predRunRef");
    
    
    /**
     * Gets array of all "feature" elements
     */
    public org.rostlab.predictprotein.FeatureType[] getFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATURE$0, targetList);
            org.rostlab.predictprotein.FeatureType[] result = new org.rostlab.predictprotein.FeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "feature" element
     */
    public org.rostlab.predictprotein.FeatureType getFeatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureType target = null;
            target = (org.rostlab.predictprotein.FeatureType)get_store().find_element_user(FEATURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "feature" element
     */
    public int sizeOfFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURE$0);
        }
    }
    
    /**
     * Sets array of all "feature" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureArray(org.rostlab.predictprotein.FeatureType[] featureArray)
    {
        check_orphaned();
        arraySetterHelper(featureArray, FEATURE$0);
    }
    
    /**
     * Sets ith "feature" element
     */
    public void setFeatureArray(int i, org.rostlab.predictprotein.FeatureType feature)
    {
        generatedSetterHelperImpl(feature, FEATURE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "feature" element
     */
    public org.rostlab.predictprotein.FeatureType insertNewFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureType target = null;
            target = (org.rostlab.predictprotein.FeatureType)get_store().insert_element_user(FEATURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "feature" element
     */
    public org.rostlab.predictprotein.FeatureType addNewFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureType target = null;
            target = (org.rostlab.predictprotein.FeatureType)get_store().add_element_user(FEATURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "feature" element
     */
    public void removeFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURE$0, i);
        }
    }
    
    /**
     * Gets array of all "disorderedRegion" elements
     */
    public org.rostlab.predictprotein.DisorderedRegionFeatureType[] getDisorderedRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISORDEREDREGION$2, targetList);
            org.rostlab.predictprotein.DisorderedRegionFeatureType[] result = new org.rostlab.predictprotein.DisorderedRegionFeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "disorderedRegion" element
     */
    public org.rostlab.predictprotein.DisorderedRegionFeatureType getDisorderedRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DisorderedRegionFeatureType target = null;
            target = (org.rostlab.predictprotein.DisorderedRegionFeatureType)get_store().find_element_user(DISORDEREDREGION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "disorderedRegion" element
     */
    public int sizeOfDisorderedRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISORDEREDREGION$2);
        }
    }
    
    /**
     * Sets array of all "disorderedRegion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDisorderedRegionArray(org.rostlab.predictprotein.DisorderedRegionFeatureType[] disorderedRegionArray)
    {
        check_orphaned();
        arraySetterHelper(disorderedRegionArray, DISORDEREDREGION$2);
    }
    
    /**
     * Sets ith "disorderedRegion" element
     */
    public void setDisorderedRegionArray(int i, org.rostlab.predictprotein.DisorderedRegionFeatureType disorderedRegion)
    {
        generatedSetterHelperImpl(disorderedRegion, DISORDEREDREGION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "disorderedRegion" element
     */
    public org.rostlab.predictprotein.DisorderedRegionFeatureType insertNewDisorderedRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DisorderedRegionFeatureType target = null;
            target = (org.rostlab.predictprotein.DisorderedRegionFeatureType)get_store().insert_element_user(DISORDEREDREGION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "disorderedRegion" element
     */
    public org.rostlab.predictprotein.DisorderedRegionFeatureType addNewDisorderedRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DisorderedRegionFeatureType target = null;
            target = (org.rostlab.predictprotein.DisorderedRegionFeatureType)get_store().add_element_user(DISORDEREDREGION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "disorderedRegion" element
     */
    public void removeDisorderedRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISORDEREDREGION$2, i);
        }
    }
    
    /**
     * Gets array of all "secondaryStructures" elements
     */
    public org.rostlab.predictprotein.SecondaryStructureFeatureType[] getSecondaryStructuresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECONDARYSTRUCTURES$4, targetList);
            org.rostlab.predictprotein.SecondaryStructureFeatureType[] result = new org.rostlab.predictprotein.SecondaryStructureFeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "secondaryStructures" element
     */
    public org.rostlab.predictprotein.SecondaryStructureFeatureType getSecondaryStructuresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType)get_store().find_element_user(SECONDARYSTRUCTURES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "secondaryStructures" element
     */
    public int sizeOfSecondaryStructuresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYSTRUCTURES$4);
        }
    }
    
    /**
     * Sets array of all "secondaryStructures" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSecondaryStructuresArray(org.rostlab.predictprotein.SecondaryStructureFeatureType[] secondaryStructuresArray)
    {
        check_orphaned();
        arraySetterHelper(secondaryStructuresArray, SECONDARYSTRUCTURES$4);
    }
    
    /**
     * Sets ith "secondaryStructures" element
     */
    public void setSecondaryStructuresArray(int i, org.rostlab.predictprotein.SecondaryStructureFeatureType secondaryStructures)
    {
        generatedSetterHelperImpl(secondaryStructures, SECONDARYSTRUCTURES$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "secondaryStructures" element
     */
    public org.rostlab.predictprotein.SecondaryStructureFeatureType insertNewSecondaryStructures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType)get_store().insert_element_user(SECONDARYSTRUCTURES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "secondaryStructures" element
     */
    public org.rostlab.predictprotein.SecondaryStructureFeatureType addNewSecondaryStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType)get_store().add_element_user(SECONDARYSTRUCTURES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "secondaryStructures" element
     */
    public void removeSecondaryStructures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYSTRUCTURES$4, i);
        }
    }
    
    /**
     * Gets array of all "solventAccessibility" elements
     */
    public org.rostlab.predictprotein.SolventAccessibilityFeatureType[] getSolventAccessibilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOLVENTACCESSIBILITY$6, targetList);
            org.rostlab.predictprotein.SolventAccessibilityFeatureType[] result = new org.rostlab.predictprotein.SolventAccessibilityFeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "solventAccessibility" element
     */
    public org.rostlab.predictprotein.SolventAccessibilityFeatureType getSolventAccessibilityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SolventAccessibilityFeatureType target = null;
            target = (org.rostlab.predictprotein.SolventAccessibilityFeatureType)get_store().find_element_user(SOLVENTACCESSIBILITY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "solventAccessibility" element
     */
    public int sizeOfSolventAccessibilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLVENTACCESSIBILITY$6);
        }
    }
    
    /**
     * Sets array of all "solventAccessibility" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSolventAccessibilityArray(org.rostlab.predictprotein.SolventAccessibilityFeatureType[] solventAccessibilityArray)
    {
        check_orphaned();
        arraySetterHelper(solventAccessibilityArray, SOLVENTACCESSIBILITY$6);
    }
    
    /**
     * Sets ith "solventAccessibility" element
     */
    public void setSolventAccessibilityArray(int i, org.rostlab.predictprotein.SolventAccessibilityFeatureType solventAccessibility)
    {
        generatedSetterHelperImpl(solventAccessibility, SOLVENTACCESSIBILITY$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "solventAccessibility" element
     */
    public org.rostlab.predictprotein.SolventAccessibilityFeatureType insertNewSolventAccessibility(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SolventAccessibilityFeatureType target = null;
            target = (org.rostlab.predictprotein.SolventAccessibilityFeatureType)get_store().insert_element_user(SOLVENTACCESSIBILITY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "solventAccessibility" element
     */
    public org.rostlab.predictprotein.SolventAccessibilityFeatureType addNewSolventAccessibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SolventAccessibilityFeatureType target = null;
            target = (org.rostlab.predictprotein.SolventAccessibilityFeatureType)get_store().add_element_user(SOLVENTACCESSIBILITY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "solventAccessibility" element
     */
    public void removeSolventAccessibility(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLVENTACCESSIBILITY$6, i);
        }
    }
    
    /**
     * Gets the "provider" attribute
     */
    public java.lang.String getProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDER$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "provider" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROVIDER$8);
            return target;
        }
    }
    
    /**
     * Sets the "provider" attribute
     */
    public void setProvider(java.lang.String provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVIDER$8);
            }
            target.setStringValue(provider);
        }
    }
    
    /**
     * Sets (as xml) the "provider" attribute
     */
    public void xsetProvider(org.apache.xmlbeans.XmlString provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROVIDER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROVIDER$8);
            }
            target.set(provider);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$10) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$10);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$12);
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
            return get_store().find_attribute_user(REF$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$12);
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
            get_store().remove_attribute(REF$12);
        }
    }
    
    /**
     * Gets the "predRunRef" attribute
     */
    public java.lang.String getPredRunRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREDRUNREF$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "predRunRef" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPredRunRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREDRUNREF$14);
            return target;
        }
    }
    
    /**
     * True if has "predRunRef" attribute
     */
    public boolean isSetPredRunRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREDRUNREF$14) != null;
        }
    }
    
    /**
     * Sets the "predRunRef" attribute
     */
    public void setPredRunRef(java.lang.String predRunRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREDRUNREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREDRUNREF$14);
            }
            target.setStringValue(predRunRef);
        }
    }
    
    /**
     * Sets (as xml) the "predRunRef" attribute
     */
    public void xsetPredRunRef(org.apache.xmlbeans.XmlString predRunRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREDRUNREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREDRUNREF$14);
            }
            target.set(predRunRef);
        }
    }
    
    /**
     * Unsets the "predRunRef" attribute
     */
    public void unsetPredRunRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREDRUNREF$14);
        }
    }
}
