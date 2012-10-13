/*
 * XML Type:  dbReferenceType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.DbReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML dbReferenceType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class DbReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.DbReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public DbReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYKEY$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entryKey");
    private static final javax.xml.namespace.QName PROPERTY$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "property");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName EVIDENCE$8 = 
        new javax.xml.namespace.QName("", "evidence");
    
    
    /**
     * Gets the "entryKey" element
     */
    public org.rostlab.predictprotein.EntryKeyType getEntryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EntryKeyType target = null;
            target = (org.rostlab.predictprotein.EntryKeyType)get_store().find_element_user(ENTRYKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entryKey" element
     */
    public void setEntryKey(org.rostlab.predictprotein.EntryKeyType entryKey)
    {
        generatedSetterHelperImpl(entryKey, ENTRYKEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entryKey" element
     */
    public org.rostlab.predictprotein.EntryKeyType addNewEntryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EntryKeyType target = null;
            target = (org.rostlab.predictprotein.EntryKeyType)get_store().add_element_user(ENTRYKEY$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.rostlab.predictprotein.PropertyType[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$2, targetList);
            org.rostlab.predictprotein.PropertyType[] result = new org.rostlab.predictprotein.PropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.rostlab.predictprotein.PropertyType getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PropertyType target = null;
            target = (org.rostlab.predictprotein.PropertyType)get_store().find_element_user(PROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPropertyArray(org.rostlab.predictprotein.PropertyType[] propertyArray)
    {
        check_orphaned();
        arraySetterHelper(propertyArray, PROPERTY$2);
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.rostlab.predictprotein.PropertyType property)
    {
        generatedSetterHelperImpl(property, PROPERTY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.rostlab.predictprotein.PropertyType insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PropertyType target = null;
            target = (org.rostlab.predictprotein.PropertyType)get_store().insert_element_user(PROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.rostlab.predictprotein.PropertyType addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PropertyType target = null;
            target = (org.rostlab.predictprotein.PropertyType)get_store().add_element_user(PROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$2, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$8);
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
            return get_store().find_attribute_user(EVIDENCE$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$8);
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
            get_store().remove_attribute(EVIDENCE$8);
        }
    }
}
