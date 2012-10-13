/*
 * XML Type:  referenceType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.ReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML referenceType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class ReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYKEY$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entryKey");
    private static final javax.xml.namespace.QName CITATION$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "citation");
    private static final javax.xml.namespace.QName SCOPE$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "scope");
    private static final javax.xml.namespace.QName SOURCE$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "source");
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
     * Gets the "citation" element
     */
    public org.rostlab.predictprotein.CitationType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType target = null;
            target = (org.rostlab.predictprotein.CitationType)get_store().find_element_user(CITATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(org.rostlab.predictprotein.CitationType citation)
    {
        generatedSetterHelperImpl(citation, CITATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "citation" element
     */
    public org.rostlab.predictprotein.CitationType addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType target = null;
            target = (org.rostlab.predictprotein.CitationType)get_store().add_element_user(CITATION$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "scope" elements
     */
    public java.lang.String[] getScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOPE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "scope" element
     */
    public java.lang.String getScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "scope" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOPE$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scope" element
     */
    public int sizeOfScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$4);
        }
    }
    
    /**
     * Sets array of all "scope" element
     */
    public void setScopeArray(java.lang.String[] scopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scopeArray, SCOPE$4);
        }
    }
    
    /**
     * Sets ith "scope" element
     */
    public void setScopeArray(int i, java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) array of all "scope" element
     */
    public void xsetScopeArray(org.apache.xmlbeans.XmlString[]scopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scopeArray, SCOPE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "scope" element
     */
    public void xsetScopeArray(int i, org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scope);
        }
    }
    
    /**
     * Inserts the value as the ith "scope" element
     */
    public void insertScope(int i, java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCOPE$4, i);
            target.setStringValue(scope);
        }
    }
    
    /**
     * Appends the value as the last "scope" element
     */
    public void addScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$4);
            target.setStringValue(scope);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scope" element
     */
    public org.apache.xmlbeans.XmlString insertNewScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SCOPE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scope" element
     */
    public org.apache.xmlbeans.XmlString addNewScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "scope" element
     */
    public void removeScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$4, i);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.rostlab.predictprotein.SourceDataType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType target = null;
            target = (org.rostlab.predictprotein.SourceDataType)get_store().find_element_user(SOURCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$6) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.rostlab.predictprotein.SourceDataType source)
    {
        generatedSetterHelperImpl(source, SOURCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.rostlab.predictprotein.SourceDataType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SourceDataType target = null;
            target = (org.rostlab.predictprotein.SourceDataType)get_store().add_element_user(SOURCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$6, 0);
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
