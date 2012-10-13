/*
 * XML Type:  organismType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.OrganismType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML organismType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class OrganismTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.OrganismType
{
    private static final long serialVersionUID = 1L;
    
    public OrganismTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYKEY$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entryKey");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "name");
    private static final javax.xml.namespace.QName DBREFERENCE$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "dbReference");
    private static final javax.xml.namespace.QName LINEAGE$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "lineage");
    
    
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
     * Gets array of all "name" elements
     */
    public org.rostlab.predictprotein.OrganismNameType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$2, targetList);
            org.rostlab.predictprotein.OrganismNameType[] result = new org.rostlab.predictprotein.OrganismNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public org.rostlab.predictprotein.OrganismNameType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.OrganismNameType target = null;
            target = (org.rostlab.predictprotein.OrganismNameType)get_store().find_element_user(NAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNameArray(org.rostlab.predictprotein.OrganismNameType[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$2);
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, org.rostlab.predictprotein.OrganismNameType name)
    {
        generatedSetterHelperImpl(name, NAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public org.rostlab.predictprotein.OrganismNameType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.OrganismNameType target = null;
            target = (org.rostlab.predictprotein.OrganismNameType)get_store().insert_element_user(NAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public org.rostlab.predictprotein.OrganismNameType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.OrganismNameType target = null;
            target = (org.rostlab.predictprotein.OrganismNameType)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, i);
        }
    }
    
    /**
     * Gets array of all "dbReference" elements
     */
    public org.rostlab.predictprotein.DbReferenceType[] getDbReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DBREFERENCE$4, targetList);
            org.rostlab.predictprotein.DbReferenceType[] result = new org.rostlab.predictprotein.DbReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dbReference" element
     */
    public org.rostlab.predictprotein.DbReferenceType getDbReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DbReferenceType target = null;
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().find_element_user(DBREFERENCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dbReference" element
     */
    public int sizeOfDbReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DBREFERENCE$4);
        }
    }
    
    /**
     * Sets array of all "dbReference" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDbReferenceArray(org.rostlab.predictprotein.DbReferenceType[] dbReferenceArray)
    {
        check_orphaned();
        arraySetterHelper(dbReferenceArray, DBREFERENCE$4);
    }
    
    /**
     * Sets ith "dbReference" element
     */
    public void setDbReferenceArray(int i, org.rostlab.predictprotein.DbReferenceType dbReference)
    {
        generatedSetterHelperImpl(dbReference, DBREFERENCE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dbReference" element
     */
    public org.rostlab.predictprotein.DbReferenceType insertNewDbReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DbReferenceType target = null;
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().insert_element_user(DBREFERENCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dbReference" element
     */
    public org.rostlab.predictprotein.DbReferenceType addNewDbReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DbReferenceType target = null;
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().add_element_user(DBREFERENCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "dbReference" element
     */
    public void removeDbReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DBREFERENCE$4, i);
        }
    }
    
    /**
     * Gets the "lineage" element
     */
    public org.rostlab.predictprotein.OrganismType.Lineage getLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.OrganismType.Lineage target = null;
            target = (org.rostlab.predictprotein.OrganismType.Lineage)get_store().find_element_user(LINEAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lineage" element
     */
    public boolean isSetLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINEAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "lineage" element
     */
    public void setLineage(org.rostlab.predictprotein.OrganismType.Lineage lineage)
    {
        generatedSetterHelperImpl(lineage, LINEAGE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lineage" element
     */
    public org.rostlab.predictprotein.OrganismType.Lineage addNewLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.OrganismType.Lineage target = null;
            target = (org.rostlab.predictprotein.OrganismType.Lineage)get_store().add_element_user(LINEAGE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "lineage" element
     */
    public void unsetLineage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINEAGE$6, 0);
        }
    }
    /**
     * An XML lineage(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class LineageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.OrganismType.Lineage
    {
        private static final long serialVersionUID = 1L;
        
        public LineageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAXON$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "taxon");
        
        
        /**
         * Gets array of all "taxon" elements
         */
        public java.lang.String[] getTaxonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TAXON$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "taxon" element
         */
        public java.lang.String getTaxonArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXON$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "taxon" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetTaxonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TAXON$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "taxon" element
         */
        public org.apache.xmlbeans.XmlString xgetTaxonArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXON$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "taxon" element
         */
        public int sizeOfTaxonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXON$0);
            }
        }
        
        /**
         * Sets array of all "taxon" element
         */
        public void setTaxonArray(java.lang.String[] taxonArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taxonArray, TAXON$0);
            }
        }
        
        /**
         * Sets ith "taxon" element
         */
        public void setTaxonArray(int i, java.lang.String taxon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXON$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(taxon);
            }
        }
        
        /**
         * Sets (as xml) array of all "taxon" element
         */
        public void xsetTaxonArray(org.apache.xmlbeans.XmlString[]taxonArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taxonArray, TAXON$0);
            }
        }
        
        /**
         * Sets (as xml) ith "taxon" element
         */
        public void xsetTaxonArray(int i, org.apache.xmlbeans.XmlString taxon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXON$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(taxon);
            }
        }
        
        /**
         * Inserts the value as the ith "taxon" element
         */
        public void insertTaxon(int i, java.lang.String taxon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TAXON$0, i);
                target.setStringValue(taxon);
            }
        }
        
        /**
         * Appends the value as the last "taxon" element
         */
        public void addTaxon(java.lang.String taxon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXON$0);
                target.setStringValue(taxon);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taxon" element
         */
        public org.apache.xmlbeans.XmlString insertNewTaxon(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TAXON$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taxon" element
         */
        public org.apache.xmlbeans.XmlString addNewTaxon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAXON$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "taxon" element
         */
        public void removeTaxon(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXON$0, i);
            }
        }
    }
}
