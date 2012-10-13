/*
 * XML Type:  aliProviderGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.AliProviderGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML aliProviderGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class AliProviderGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.AliProviderGroupType
{
    private static final long serialVersionUID = 1L;
    
    public AliProviderGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNMENT$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "alignment");
    private static final javax.xml.namespace.QName PROVIDER$2 = 
        new javax.xml.namespace.QName("", "provider");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName REF$6 = 
        new javax.xml.namespace.QName("", "ref");
    
    
    /**
     * Gets array of all "alignment" elements
     */
    public org.rostlab.predictprotein.AlignmentType[] getAlignmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALIGNMENT$0, targetList);
            org.rostlab.predictprotein.AlignmentType[] result = new org.rostlab.predictprotein.AlignmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alignment" element
     */
    public org.rostlab.predictprotein.AlignmentType getAlignmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.AlignmentType target = null;
            target = (org.rostlab.predictprotein.AlignmentType)get_store().find_element_user(ALIGNMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alignment" element
     */
    public int sizeOfAlignmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIGNMENT$0);
        }
    }
    
    /**
     * Sets array of all "alignment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAlignmentArray(org.rostlab.predictprotein.AlignmentType[] alignmentArray)
    {
        check_orphaned();
        arraySetterHelper(alignmentArray, ALIGNMENT$0);
    }
    
    /**
     * Sets ith "alignment" element
     */
    public void setAlignmentArray(int i, org.rostlab.predictprotein.AlignmentType alignment)
    {
        generatedSetterHelperImpl(alignment, ALIGNMENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alignment" element
     */
    public org.rostlab.predictprotein.AlignmentType insertNewAlignment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.AlignmentType target = null;
            target = (org.rostlab.predictprotein.AlignmentType)get_store().insert_element_user(ALIGNMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alignment" element
     */
    public org.rostlab.predictprotein.AlignmentType addNewAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.AlignmentType target = null;
            target = (org.rostlab.predictprotein.AlignmentType)get_store().add_element_user(ALIGNMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "alignment" element
     */
    public void removeAlignment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIGNMENT$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDER$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROVIDER$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVIDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVIDER$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROVIDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROVIDER$2);
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
}
