/*
 * XML Type:  statusType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.StatusType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML statusType(@http://rostlab.org/predictprotein).
 *
 * This is an atomic type that is a restriction of org.rostlab.predictprotein.StatusType.
 */
public class StatusTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.StatusType
{
    private static final long serialVersionUID = 1L;
    
    public StatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected StatusTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "status" attribute
     */
    public org.rostlab.predictprotein.StatusType.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STATUS$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.StatusType.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.rostlab.predictprotein.StatusType.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.StatusType.Status target = null;
            target = (org.rostlab.predictprotein.StatusType.Status)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.StatusType.Status)get_default_attribute_value(STATUS$0);
            }
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
            return get_store().find_attribute_user(STATUS$0) != null;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(org.rostlab.predictprotein.StatusType.Status.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$0);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(org.rostlab.predictprotein.StatusType.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.StatusType.Status target = null;
            target = (org.rostlab.predictprotein.StatusType.Status)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.StatusType.Status)get_store().add_attribute_user(STATUS$0);
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
            get_store().remove_attribute(STATUS$0);
        }
    }
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.StatusType$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.StatusType.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
