/*
 * XML Type:  featureType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.FeatureType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML featureType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class FeatureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.FeatureType
{
    private static final long serialVersionUID = 1L;
    
    public FeatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINAL$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "original");
    private static final javax.xml.namespace.QName VARIATION$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "variation");
    private static final javax.xml.namespace.QName LOCATION$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "location");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName DESCRIPTION$12 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName EVIDENCE$14 = 
        new javax.xml.namespace.QName("", "evidence");
    private static final javax.xml.namespace.QName REF$16 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName SOTERMID$18 = 
        new javax.xml.namespace.QName("", "soTermId");
    
    
    /**
     * Gets the "original" element
     */
    public java.lang.String getOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "original" element
     */
    public org.apache.xmlbeans.XmlString xgetOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "original" element
     */
    public boolean isSetOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINAL$0) != 0;
        }
    }
    
    /**
     * Sets the "original" element
     */
    public void setOriginal(java.lang.String original)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINAL$0);
            }
            target.setStringValue(original);
        }
    }
    
    /**
     * Sets (as xml) the "original" element
     */
    public void xsetOriginal(org.apache.xmlbeans.XmlString original)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINAL$0);
            }
            target.set(original);
        }
    }
    
    /**
     * Unsets the "original" element
     */
    public void unsetOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINAL$0, 0);
        }
    }
    
    /**
     * Gets array of all "variation" elements
     */
    public java.lang.String[] getVariationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIATION$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "variation" element
     */
    public java.lang.String getVariationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "variation" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetVariationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIATION$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "variation" element
     */
    public org.apache.xmlbeans.XmlString xgetVariationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "variation" element
     */
    public int sizeOfVariationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIATION$2);
        }
    }
    
    /**
     * Sets array of all "variation" element
     */
    public void setVariationArray(java.lang.String[] variationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variationArray, VARIATION$2);
        }
    }
    
    /**
     * Sets ith "variation" element
     */
    public void setVariationArray(int i, java.lang.String variation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(variation);
        }
    }
    
    /**
     * Sets (as xml) array of all "variation" element
     */
    public void xsetVariationArray(org.apache.xmlbeans.XmlString[]variationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variationArray, VARIATION$2);
        }
    }
    
    /**
     * Sets (as xml) ith "variation" element
     */
    public void xsetVariationArray(int i, org.apache.xmlbeans.XmlString variation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(variation);
        }
    }
    
    /**
     * Inserts the value as the ith "variation" element
     */
    public void insertVariation(int i, java.lang.String variation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VARIATION$2, i);
            target.setStringValue(variation);
        }
    }
    
    /**
     * Appends the value as the last "variation" element
     */
    public void addVariation(java.lang.String variation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIATION$2);
            target.setStringValue(variation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variation" element
     */
    public org.apache.xmlbeans.XmlString insertNewVariation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VARIATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variation" element
     */
    public org.apache.xmlbeans.XmlString addNewVariation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "variation" element
     */
    public void removeVariation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIATION$2, i);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public org.rostlab.predictprotein.LocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().find_element_user(LOCATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.rostlab.predictprotein.LocationType location)
    {
        generatedSetterHelperImpl(location, LOCATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.rostlab.predictprotein.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().add_element_user(LOCATION$4);
            return target;
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.rostlab.predictprotein.FeatureType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.FeatureType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.rostlab.predictprotein.FeatureType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureType.Type target = null;
            target = (org.rostlab.predictprotein.FeatureType.Type)get_store().find_attribute_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.rostlab.predictprotein.FeatureType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.rostlab.predictprotein.FeatureType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureType.Type target = null;
            target = (org.rostlab.predictprotein.FeatureType.Type)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.FeatureType.Type)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
            return target;
        }
    }
    
    /**
     * True if has "status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$8) != null;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$8);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$8);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$12);
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
            return get_store().find_attribute_user(DESCRIPTION$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$12);
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
            get_store().remove_attribute(DESCRIPTION$12);
        }
    }
    
    /**
     * Gets the "evidence" attribute
     */
    public java.lang.String getEvidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$14);
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
            return get_store().find_attribute_user(EVIDENCE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$14);
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
            get_store().remove_attribute(EVIDENCE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$16);
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
            return get_store().find_attribute_user(REF$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$16);
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
            get_store().remove_attribute(REF$16);
        }
    }
    
    /**
     * Gets the "soTermId" attribute
     */
    public java.lang.String getSoTermId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOTERMID$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "soTermId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoTermId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOTERMID$18);
            return target;
        }
    }
    
    /**
     * True if has "soTermId" attribute
     */
    public boolean isSetSoTermId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOTERMID$18) != null;
        }
    }
    
    /**
     * Sets the "soTermId" attribute
     */
    public void setSoTermId(java.lang.String soTermId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOTERMID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOTERMID$18);
            }
            target.setStringValue(soTermId);
        }
    }
    
    /**
     * Sets (as xml) the "soTermId" attribute
     */
    public void xsetSoTermId(org.apache.xmlbeans.XmlString soTermId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOTERMID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOTERMID$18);
            }
            target.set(soTermId);
        }
    }
    
    /**
     * Unsets the "soTermId" attribute
     */
    public void unsetSoTermId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOTERMID$18);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.FeatureType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.FeatureType.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
