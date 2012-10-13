/*
 * XML Type:  evidenceType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.EvidenceType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML evidenceType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class EvidenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.EvidenceType
{
    private static final long serialVersionUID = 1L;
    
    public EvidenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYKEY$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entryKey");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("", "category");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ATTRIBUTE$6 = 
        new javax.xml.namespace.QName("", "attribute");
    private static final javax.xml.namespace.QName DATE$8 = 
        new javax.xml.namespace.QName("", "date");
    
    
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
     * Gets the "category" attribute
     */
    public org.rostlab.predictprotein.EvidenceType.Category.Enum getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$2);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.EvidenceType.Category.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "category" attribute
     */
    public org.rostlab.predictprotein.EvidenceType.Category xgetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidenceType.Category target = null;
            target = (org.rostlab.predictprotein.EvidenceType.Category)get_store().find_attribute_user(CATEGORY$2);
            return target;
        }
    }
    
    /**
     * Sets the "category" attribute
     */
    public void setCategory(org.rostlab.predictprotein.EvidenceType.Category.Enum category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORY$2);
            }
            target.setEnumValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "category" attribute
     */
    public void xsetCategory(org.rostlab.predictprotein.EvidenceType.Category category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidenceType.Category target = null;
            target = (org.rostlab.predictprotein.EvidenceType.Category)get_store().find_attribute_user(CATEGORY$2);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.EvidenceType.Category)get_store().add_attribute_user(CATEGORY$2);
            }
            target.set(category);
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
     * Gets the "attribute" attribute
     */
    public java.lang.String getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attribute" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTRIBUTE$6);
            return target;
        }
    }
    
    /**
     * True if has "attribute" attribute
     */
    public boolean isSetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTRIBUTE$6) != null;
        }
    }
    
    /**
     * Sets the "attribute" attribute
     */
    public void setAttribute(java.lang.String attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTRIBUTE$6);
            }
            target.setStringValue(attribute);
        }
    }
    
    /**
     * Sets (as xml) the "attribute" attribute
     */
    public void xsetAttribute(org.apache.xmlbeans.XmlString attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTRIBUTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ATTRIBUTE$6);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Unsets the "attribute" attribute
     */
    public void unsetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTRIBUTE$6);
        }
    }
    
    /**
     * Gets the "date" attribute
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" attribute
     */
    public org.apache.xmlbeans.XmlDate xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$8);
            return target;
        }
    }
    
    /**
     * Sets the "date" attribute
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$8);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" attribute
     */
    public void xsetDate(org.apache.xmlbeans.XmlDate date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(DATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(DATE$8);
            }
            target.set(date);
        }
    }
    /**
     * An XML category(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.EvidenceType$Category.
     */
    public static class CategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.EvidenceType.Category
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
