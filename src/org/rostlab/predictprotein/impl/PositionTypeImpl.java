/*
 * XML Type:  positionType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PositionType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML positionType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class PositionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.PositionType
{
    private static final long serialVersionUID = 1L;
    
    public PositionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITION$0 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "position" attribute
     */
    public java.math.BigInteger getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedLong xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(POSITION$0);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$0) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
    public void setPosition(java.math.BigInteger position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$0);
            }
            target.setBigIntegerValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
    public void xsetPosition(org.apache.xmlbeans.XmlUnsignedLong position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_attribute_user(POSITION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_attribute_user(POSITION$0);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$0);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public org.rostlab.predictprotein.PositionType.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STATUS$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.PositionType.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.rostlab.predictprotein.PositionType.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType.Status target = null;
            target = (org.rostlab.predictprotein.PositionType.Status)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.PositionType.Status)get_default_attribute_value(STATUS$2);
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
            return get_store().find_attribute_user(STATUS$2) != null;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(org.rostlab.predictprotein.PositionType.Status.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(org.rostlab.predictprotein.PositionType.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType.Status target = null;
            target = (org.rostlab.predictprotein.PositionType.Status)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.PositionType.Status)get_store().add_attribute_user(STATUS$2);
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
            get_store().remove_attribute(STATUS$2);
        }
    }
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.PositionType$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.PositionType.Status
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
