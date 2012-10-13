/*
 * XML Type:  featureTypeGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.FeatureTypeGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML featureTypeGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class FeatureTypeGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.FeatureTypeGroupType
{
    private static final long serialVersionUID = 1L;
    
    public FeatureTypeGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREPROVIDERGROUP$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "featureProviderGroup");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName REF$6 = 
        new javax.xml.namespace.QName("", "ref");
    
    
    /**
     * Gets array of all "featureProviderGroup" elements
     */
    public org.rostlab.predictprotein.FeatureProviderGroupType[] getFeatureProviderGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FEATUREPROVIDERGROUP$0, targetList);
            org.rostlab.predictprotein.FeatureProviderGroupType[] result = new org.rostlab.predictprotein.FeatureProviderGroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureProviderGroup" element
     */
    public org.rostlab.predictprotein.FeatureProviderGroupType getFeatureProviderGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureProviderGroupType target = null;
            target = (org.rostlab.predictprotein.FeatureProviderGroupType)get_store().find_element_user(FEATUREPROVIDERGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureProviderGroup" element
     */
    public int sizeOfFeatureProviderGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREPROVIDERGROUP$0);
        }
    }
    
    /**
     * Sets array of all "featureProviderGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFeatureProviderGroupArray(org.rostlab.predictprotein.FeatureProviderGroupType[] featureProviderGroupArray)
    {
        check_orphaned();
        arraySetterHelper(featureProviderGroupArray, FEATUREPROVIDERGROUP$0);
    }
    
    /**
     * Sets ith "featureProviderGroup" element
     */
    public void setFeatureProviderGroupArray(int i, org.rostlab.predictprotein.FeatureProviderGroupType featureProviderGroup)
    {
        generatedSetterHelperImpl(featureProviderGroup, FEATUREPROVIDERGROUP$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureProviderGroup" element
     */
    public org.rostlab.predictprotein.FeatureProviderGroupType insertNewFeatureProviderGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureProviderGroupType target = null;
            target = (org.rostlab.predictprotein.FeatureProviderGroupType)get_store().insert_element_user(FEATUREPROVIDERGROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureProviderGroup" element
     */
    public org.rostlab.predictprotein.FeatureProviderGroupType addNewFeatureProviderGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureProviderGroupType target = null;
            target = (org.rostlab.predictprotein.FeatureProviderGroupType)get_store().add_element_user(FEATUREPROVIDERGROUP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureProviderGroup" element
     */
    public void removeFeatureProviderGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREPROVIDERGROUP$0, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.rostlab.predictprotein.FeatureTypeGroupType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.FeatureTypeGroupType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.rostlab.predictprotein.FeatureTypeGroupType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureTypeGroupType.Type target = null;
            target = (org.rostlab.predictprotein.FeatureTypeGroupType.Type)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.rostlab.predictprotein.FeatureTypeGroupType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.rostlab.predictprotein.FeatureTypeGroupType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.FeatureTypeGroupType.Type target = null;
            target = (org.rostlab.predictprotein.FeatureTypeGroupType.Type)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.FeatureTypeGroupType.Type)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
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
            return get_store().find_attribute_user(DESCRIPTION$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$4);
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
            get_store().remove_attribute(DESCRIPTION$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$6);
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
            return get_store().find_attribute_user(REF$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$6);
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
            get_store().remove_attribute(REF$6);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.FeatureTypeGroupType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.FeatureTypeGroupType.Type
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
