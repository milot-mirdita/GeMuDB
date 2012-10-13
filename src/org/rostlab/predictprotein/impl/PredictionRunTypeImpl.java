/*
 * XML Type:  predictionRunType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PredictionRunType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML predictionRunType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class PredictionRunTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.PredictionRunType
{
    private static final long serialVersionUID = 1L;
    
    public PredictionRunTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYKEY$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entryKey");
    private static final javax.xml.namespace.QName PREDTEXT$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predText");
    private static final javax.xml.namespace.QName PREDCOMMENT$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predComment");
    private static final javax.xml.namespace.QName LINK$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "link");
    private static final javax.xml.namespace.QName REF$8 = 
        new javax.xml.namespace.QName("", "ref");
    
    
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
     * Gets the "predText" element
     */
    public java.lang.String getPredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "predText" element
     */
    public org.apache.xmlbeans.XmlString xgetPredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDTEXT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "predText" element
     */
    public boolean isSetPredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREDTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "predText" element
     */
    public void setPredText(java.lang.String predText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREDTEXT$2);
            }
            target.setStringValue(predText);
        }
    }
    
    /**
     * Sets (as xml) the "predText" element
     */
    public void xsetPredText(org.apache.xmlbeans.XmlString predText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREDTEXT$2);
            }
            target.set(predText);
        }
    }
    
    /**
     * Unsets the "predText" element
     */
    public void unsetPredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREDTEXT$2, 0);
        }
    }
    
    /**
     * Gets the "predComment" element
     */
    public java.lang.String getPredComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDCOMMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "predComment" element
     */
    public org.apache.xmlbeans.XmlString xgetPredComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDCOMMENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "predComment" element
     */
    public boolean isSetPredComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREDCOMMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "predComment" element
     */
    public void setPredComment(java.lang.String predComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDCOMMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREDCOMMENT$4);
            }
            target.setStringValue(predComment);
        }
    }
    
    /**
     * Sets (as xml) the "predComment" element
     */
    public void xsetPredComment(org.apache.xmlbeans.XmlString predComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDCOMMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREDCOMMENT$4);
            }
            target.set(predComment);
        }
    }
    
    /**
     * Unsets the "predComment" element
     */
    public void unsetPredComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREDCOMMENT$4, 0);
        }
    }
    
    /**
     * Gets array of all "link" elements
     */
    public org.rostlab.predictprotein.PredictionRunType.Link[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$6, targetList);
            org.rostlab.predictprotein.PredictionRunType.Link[] result = new org.rostlab.predictprotein.PredictionRunType.Link[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "link" element
     */
    public org.rostlab.predictprotein.PredictionRunType.Link getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunType.Link target = null;
            target = (org.rostlab.predictprotein.PredictionRunType.Link)get_store().find_element_user(LINK$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$6);
        }
    }
    
    /**
     * Sets array of all "link" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkArray(org.rostlab.predictprotein.PredictionRunType.Link[] linkArray)
    {
        check_orphaned();
        arraySetterHelper(linkArray, LINK$6);
    }
    
    /**
     * Sets ith "link" element
     */
    public void setLinkArray(int i, org.rostlab.predictprotein.PredictionRunType.Link link)
    {
        generatedSetterHelperImpl(link, LINK$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    public org.rostlab.predictprotein.PredictionRunType.Link insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunType.Link target = null;
            target = (org.rostlab.predictprotein.PredictionRunType.Link)get_store().insert_element_user(LINK$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    public org.rostlab.predictprotein.PredictionRunType.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunType.Link target = null;
            target = (org.rostlab.predictprotein.PredictionRunType.Link)get_store().add_element_user(LINK$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$8);
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
            return get_store().find_attribute_user(REF$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$8);
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
            get_store().remove_attribute(REF$8);
        }
    }
    /**
     * An XML link(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.PredictionRunType$Link.
     */
    public static class LinkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.PredictionRunType.Link
    {
        private static final long serialVersionUID = 1L;
        
        public LinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected LinkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName URI$0 = 
            new javax.xml.namespace.QName("", "uri");
        
        
        /**
         * Gets the "uri" attribute
         */
        public java.lang.String getUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uri" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$0);
                return target;
            }
        }
        
        /**
         * Sets the "uri" attribute
         */
        public void setUri(java.lang.String uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$0);
                }
                target.setStringValue(uri);
            }
        }
        
        /**
         * Sets (as xml) the "uri" attribute
         */
        public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$0);
                }
                target.set(uri);
            }
        }
    }
}
