/*
 * An XML document type.
 * Localname: predictprotein
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PredictproteinDocument
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * A document containing one predictprotein(@http://rostlab.org/predictprotein) element.
 *
 * This is a complex type.
 */
public class PredictproteinDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.PredictproteinDocument
{
    private static final long serialVersionUID = 1L;
    
    public PredictproteinDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREDICTPROTEIN$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predictprotein");
    
    
    /**
     * Gets the "predictprotein" element
     */
    public org.rostlab.predictprotein.PredictproteinDocument.Predictprotein getPredictprotein()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictproteinDocument.Predictprotein target = null;
            target = (org.rostlab.predictprotein.PredictproteinDocument.Predictprotein)get_store().find_element_user(PREDICTPROTEIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "predictprotein" element
     */
    public void setPredictprotein(org.rostlab.predictprotein.PredictproteinDocument.Predictprotein predictprotein)
    {
        generatedSetterHelperImpl(predictprotein, PREDICTPROTEIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "predictprotein" element
     */
    public org.rostlab.predictprotein.PredictproteinDocument.Predictprotein addNewPredictprotein()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictproteinDocument.Predictprotein target = null;
            target = (org.rostlab.predictprotein.PredictproteinDocument.Predictprotein)get_store().add_element_user(PREDICTPROTEIN$0);
            return target;
        }
    }
    /**
     * An XML predictprotein(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class PredictproteinImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.PredictproteinDocument.Predictprotein
    {
        private static final long serialVersionUID = 1L;
        
        public PredictproteinImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTRY$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entry");
        private static final javax.xml.namespace.QName COPYRIGHT$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "copyright");
        
        
        /**
         * Gets array of all "entry" elements
         */
        public org.rostlab.predictprotein.EntryDocument.Entry[] getEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTRY$0, targetList);
                org.rostlab.predictprotein.EntryDocument.Entry[] result = new org.rostlab.predictprotein.EntryDocument.Entry[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entry" element
         */
        public org.rostlab.predictprotein.EntryDocument.Entry getEntryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry)get_store().find_element_user(ENTRY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entry" element
         */
        public int sizeOfEntryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTRY$0);
            }
        }
        
        /**
         * Sets array of all "entry" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntryArray(org.rostlab.predictprotein.EntryDocument.Entry[] entryArray)
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$0);
        }
        
        /**
         * Sets ith "entry" element
         */
        public void setEntryArray(int i, org.rostlab.predictprotein.EntryDocument.Entry entry)
        {
            generatedSetterHelperImpl(entry, ENTRY$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entry" element
         */
        public org.rostlab.predictprotein.EntryDocument.Entry insertNewEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry)get_store().insert_element_user(ENTRY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entry" element
         */
        public org.rostlab.predictprotein.EntryDocument.Entry addNewEntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry)get_store().add_element_user(ENTRY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "entry" element
         */
        public void removeEntry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTRY$0, i);
            }
        }
        
        /**
         * Gets the "copyright" element
         */
        public java.lang.String getCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYRIGHT$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COPYRIGHT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "copyright" element
         */
        public boolean isSetCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COPYRIGHT$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYRIGHT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COPYRIGHT$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COPYRIGHT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COPYRIGHT$2);
                }
                target.set(copyright);
            }
        }
        
        /**
         * Unsets the "copyright" element
         */
        public void unsetCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COPYRIGHT$2, 0);
            }
        }
    }
}
