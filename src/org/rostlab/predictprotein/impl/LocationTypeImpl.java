/*
 * XML Type:  locationType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.LocationType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML locationType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class LocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.LocationType
{
    private static final long serialVersionUID = 1L;
    
    public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGIN$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "begin");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "end");
    private static final javax.xml.namespace.QName POSITION$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "position");
    private static final javax.xml.namespace.QName SEQUENCE$6 = 
        new javax.xml.namespace.QName("", "sequence");
    
    
    /**
     * Gets the "begin" element
     */
    public org.rostlab.predictprotein.PositionType getBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType target = null;
            target = (org.rostlab.predictprotein.PositionType)get_store().find_element_user(BEGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "begin" element
     */
    public boolean isSetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGIN$0) != 0;
        }
    }
    
    /**
     * Sets the "begin" element
     */
    public void setBegin(org.rostlab.predictprotein.PositionType begin)
    {
        generatedSetterHelperImpl(begin, BEGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "begin" element
     */
    public org.rostlab.predictprotein.PositionType addNewBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType target = null;
            target = (org.rostlab.predictprotein.PositionType)get_store().add_element_user(BEGIN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "begin" element
     */
    public void unsetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGIN$0, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public org.rostlab.predictprotein.PositionType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType target = null;
            target = (org.rostlab.predictprotein.PositionType)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$2) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(org.rostlab.predictprotein.PositionType end)
    {
        generatedSetterHelperImpl(end, END$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public org.rostlab.predictprotein.PositionType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType target = null;
            target = (org.rostlab.predictprotein.PositionType)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$2, 0);
        }
    }
    
    /**
     * Gets the "position" element
     */
    public org.rostlab.predictprotein.PositionType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType target = null;
            target = (org.rostlab.predictprotein.PositionType)get_store().find_element_user(POSITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$4) != 0;
        }
    }
    
    /**
     * Sets the "position" element
     */
    public void setPosition(org.rostlab.predictprotein.PositionType position)
    {
        generatedSetterHelperImpl(position, POSITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "position" element
     */
    public org.rostlab.predictprotein.PositionType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PositionType target = null;
            target = (org.rostlab.predictprotein.PositionType)get_store().add_element_user(POSITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$4, 0);
        }
    }
    
    /**
     * Gets the "sequence" attribute
     */
    public java.lang.String getSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sequence" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQUENCE$6);
            return target;
        }
    }
    
    /**
     * True if has "sequence" attribute
     */
    public boolean isSetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEQUENCE$6) != null;
        }
    }
    
    /**
     * Sets the "sequence" attribute
     */
    public void setSequence(java.lang.String sequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEQUENCE$6);
            }
            target.setStringValue(sequence);
        }
    }
    
    /**
     * Sets (as xml) the "sequence" attribute
     */
    public void xsetSequence(org.apache.xmlbeans.XmlString sequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQUENCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEQUENCE$6);
            }
            target.set(sequence);
        }
    }
    
    /**
     * Unsets the "sequence" attribute
     */
    public void unsetSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEQUENCE$6);
        }
    }
}
