/*
 * XML Type:  sequenceType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SequenceType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML sequenceType(@http://rostlab.org/predictprotein).
 *
 * This is an atomic type that is a restriction of org.rostlab.predictprotein.SequenceType.
 */
public class SequenceTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SequenceType
{
    private static final long serialVersionUID = 1L;
    
    public SequenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SequenceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LENGTH$0 = 
        new javax.xml.namespace.QName("", "length");
    private static final javax.xml.namespace.QName MASS$2 = 
        new javax.xml.namespace.QName("", "mass");
    private static final javax.xml.namespace.QName CHECKSUM$4 = 
        new javax.xml.namespace.QName("", "checksum");
    private static final javax.xml.namespace.QName MODIFIED$6 = 
        new javax.xml.namespace.QName("", "modified");
    private static final javax.xml.namespace.QName VERSION$8 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName PRECURSOR$10 = 
        new javax.xml.namespace.QName("", "precursor");
    private static final javax.xml.namespace.QName FRAGMENT$12 = 
        new javax.xml.namespace.QName("", "fragment");
    
    
    /**
     * Gets the "length" attribute
     */
    public java.math.BigInteger getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "length" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LENGTH$0);
            return target;
        }
    }
    
    /**
     * Sets the "length" attribute
     */
    public void setLength(java.math.BigInteger length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$0);
            }
            target.setBigIntegerValue(length);
        }
    }
    
    /**
     * Sets (as xml) the "length" attribute
     */
    public void xsetLength(org.apache.xmlbeans.XmlInteger length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LENGTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LENGTH$0);
            }
            target.set(length);
        }
    }
    
    /**
     * Gets the "mass" attribute
     */
    public java.math.BigInteger getMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASS$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "mass" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MASS$2);
            return target;
        }
    }
    
    /**
     * True if has "mass" attribute
     */
    public boolean isSetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MASS$2) != null;
        }
    }
    
    /**
     * Sets the "mass" attribute
     */
    public void setMass(java.math.BigInteger mass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASS$2);
            }
            target.setBigIntegerValue(mass);
        }
    }
    
    /**
     * Sets (as xml) the "mass" attribute
     */
    public void xsetMass(org.apache.xmlbeans.XmlInteger mass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MASS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(MASS$2);
            }
            target.set(mass);
        }
    }
    
    /**
     * Unsets the "mass" attribute
     */
    public void unsetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MASS$2);
        }
    }
    
    /**
     * Gets the "checksum" attribute
     */
    public java.lang.String getChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKSUM$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "checksum" attribute
     */
    public org.apache.xmlbeans.XmlString xgetChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHECKSUM$4);
            return target;
        }
    }
    
    /**
     * True if has "checksum" attribute
     */
    public boolean isSetChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHECKSUM$4) != null;
        }
    }
    
    /**
     * Sets the "checksum" attribute
     */
    public void setChecksum(java.lang.String checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHECKSUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHECKSUM$4);
            }
            target.setStringValue(checksum);
        }
    }
    
    /**
     * Sets (as xml) the "checksum" attribute
     */
    public void xsetChecksum(org.apache.xmlbeans.XmlString checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHECKSUM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHECKSUM$4);
            }
            target.set(checksum);
        }
    }
    
    /**
     * Unsets the "checksum" attribute
     */
    public void unsetChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHECKSUM$4);
        }
    }
    
    /**
     * Gets the "modified" attribute
     */
    public java.util.Calendar getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" attribute
     */
    public org.apache.xmlbeans.XmlDate xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(MODIFIED$6);
            return target;
        }
    }
    
    /**
     * Sets the "modified" attribute
     */
    public void setModified(java.util.Calendar modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODIFIED$6);
            }
            target.setCalendarValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" attribute
     */
    public void xsetModified(org.apache.xmlbeans.XmlDate modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(MODIFIED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(MODIFIED$6);
            }
            target.set(modified);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigInteger getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSION$8);
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigInteger version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$8);
            }
            target.setBigIntegerValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlInteger version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VERSION$8);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "precursor" attribute
     */
    public boolean getPrecursor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRECURSOR$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "precursor" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrecursor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRECURSOR$10);
            return target;
        }
    }
    
    /**
     * True if has "precursor" attribute
     */
    public boolean isSetPrecursor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRECURSOR$10) != null;
        }
    }
    
    /**
     * Sets the "precursor" attribute
     */
    public void setPrecursor(boolean precursor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRECURSOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRECURSOR$10);
            }
            target.setBooleanValue(precursor);
        }
    }
    
    /**
     * Sets (as xml) the "precursor" attribute
     */
    public void xsetPrecursor(org.apache.xmlbeans.XmlBoolean precursor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRECURSOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRECURSOR$10);
            }
            target.set(precursor);
        }
    }
    
    /**
     * Unsets the "precursor" attribute
     */
    public void unsetPrecursor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRECURSOR$10);
        }
    }
    
    /**
     * Gets the "fragment" attribute
     */
    public org.rostlab.predictprotein.SequenceType.Fragment.Enum getFragment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAGMENT$12);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.SequenceType.Fragment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fragment" attribute
     */
    public org.rostlab.predictprotein.SequenceType.Fragment xgetFragment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SequenceType.Fragment target = null;
            target = (org.rostlab.predictprotein.SequenceType.Fragment)get_store().find_attribute_user(FRAGMENT$12);
            return target;
        }
    }
    
    /**
     * True if has "fragment" attribute
     */
    public boolean isSetFragment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAGMENT$12) != null;
        }
    }
    
    /**
     * Sets the "fragment" attribute
     */
    public void setFragment(org.rostlab.predictprotein.SequenceType.Fragment.Enum fragment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAGMENT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAGMENT$12);
            }
            target.setEnumValue(fragment);
        }
    }
    
    /**
     * Sets (as xml) the "fragment" attribute
     */
    public void xsetFragment(org.rostlab.predictprotein.SequenceType.Fragment fragment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SequenceType.Fragment target = null;
            target = (org.rostlab.predictprotein.SequenceType.Fragment)get_store().find_attribute_user(FRAGMENT$12);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.SequenceType.Fragment)get_store().add_attribute_user(FRAGMENT$12);
            }
            target.set(fragment);
        }
    }
    
    /**
     * Unsets the "fragment" attribute
     */
    public void unsetFragment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAGMENT$12);
        }
    }
    /**
     * An XML fragment(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SequenceType$Fragment.
     */
    public static class FragmentImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.SequenceType.Fragment
    {
        private static final long serialVersionUID = 1L;
        
        public FragmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FragmentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
