/*
 * An XML document type.
 * Localname: copyright
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.CopyrightDocument
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * A document containing one copyright(@http://rostlab.org/predictprotein) element.
 *
 * This is a complex type.
 */
public class CopyrightDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CopyrightDocument
{
    private static final long serialVersionUID = 1L;
    
    public CopyrightDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COPYRIGHT$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "copyright");
    
    
    /**
     * Gets the "copyright" element
     */
    public java.lang.String getCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYRIGHT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "copyright" element
     */
    public org.apache.xmlbeans.XmlString xgetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COPYRIGHT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "copyright" element
     */
    public void setCopyright(java.lang.String copyright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYRIGHT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COPYRIGHT$0);
            }
            target.setStringValue(copyright);
        }
    }
    
    /**
     * Sets (as xml) the "copyright" element
     */
    public void xsetCopyright(org.apache.xmlbeans.XmlString copyright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COPYRIGHT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COPYRIGHT$0);
            }
            target.set(copyright);
        }
    }
}
