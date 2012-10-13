/*
 * XML Type:  entryKeyType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.EntryKeyType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML entryKeyType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class EntryKeyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.EntryKeyType
{
    private static final long serialVersionUID = 1L;
    
    public EntryKeyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYKEYVALUE$0 = 
        new javax.xml.namespace.QName("", "entryKeyValue");
    
    
    /**
     * Gets the "entryKeyValue" attribute
     */
    public java.lang.String getEntryKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYKEYVALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entryKeyValue" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEntryKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTRYKEYVALUE$0);
            return target;
        }
    }
    
    /**
     * Sets the "entryKeyValue" attribute
     */
    public void setEntryKeyValue(java.lang.String entryKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYKEYVALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTRYKEYVALUE$0);
            }
            target.setStringValue(entryKeyValue);
        }
    }
    
    /**
     * Sets (as xml) the "entryKeyValue" attribute
     */
    public void xsetEntryKeyValue(org.apache.xmlbeans.XmlString entryKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTRYKEYVALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTRYKEYVALUE$0);
            }
            target.set(entryKeyValue);
        }
    }
}
