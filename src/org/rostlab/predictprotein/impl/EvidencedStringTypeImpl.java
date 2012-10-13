/*
 * XML Type:  evidencedStringType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.EvidencedStringType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML evidencedStringType(@http://rostlab.org/predictprotein).
 *
 * This is an atomic type that is a restriction of org.rostlab.predictprotein.EvidencedStringType.
 */
public class EvidencedStringTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.EvidencedStringType
{
    private static final long serialVersionUID = 1L;
    
    public EvidencedStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected EvidencedStringTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName EVIDENCE$0 = 
        new javax.xml.namespace.QName("", "evidence");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "evidence" attribute
     */
    public java.lang.String getEvidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
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
            return get_store().find_attribute_user(EVIDENCE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$0);
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
            get_store().remove_attribute(EVIDENCE$0);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public org.rostlab.predictprotein.EvidencedStringType.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.EvidencedStringType.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.rostlab.predictprotein.EvidencedStringType.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType.Status target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType.Status)get_store().find_attribute_user(STATUS$2);
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
    public void setStatus(org.rostlab.predictprotein.EvidencedStringType.Status.Enum status)
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
    public void xsetStatus(org.rostlab.predictprotein.EvidencedStringType.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType.Status target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType.Status)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.EvidencedStringType.Status)get_store().add_attribute_user(STATUS$2);
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
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.EvidencedStringType$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.EvidencedStringType.Status
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
