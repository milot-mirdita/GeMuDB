/*
 * XML Type:  isoformType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.IsoformType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML isoformType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class IsoformTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.IsoformType
{
    private static final long serialVersionUID = 1L;
    
    public IsoformTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "id");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "name");
    private static final javax.xml.namespace.QName SEQUENCE$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "sequence");
    private static final javax.xml.namespace.QName NOTE$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "note");
    
    
    /**
     * Gets array of all "id" elements
     */
    public java.lang.String[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public java.lang.String getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "id" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "id" element
     */
    public org.apache.xmlbeans.XmlString xgetIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0);
        }
    }
    
    /**
     * Sets array of all "id" element
     */
    public void setIdArray(java.lang.String[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$0);
        }
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) array of all "id" element
     */
    public void xsetIdArray(org.apache.xmlbeans.XmlString[]idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "id" element
     */
    public void xsetIdArray(int i, org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts the value as the ith "id" element
     */
    public void insertId(int i, java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ID$0, i);
            target.setStringValue(id);
        }
    }
    
    /**
     * Appends the value as the last "id" element
     */
    public void addId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            target.setStringValue(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public org.apache.xmlbeans.XmlString insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public org.apache.xmlbeans.XmlString addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, i);
        }
    }
    
    /**
     * Gets array of all "name" elements
     */
    public org.rostlab.predictprotein.IsoformType.Name[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$2, targetList);
            org.rostlab.predictprotein.IsoformType.Name[] result = new org.rostlab.predictprotein.IsoformType.Name[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public org.rostlab.predictprotein.IsoformType.Name getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Name target = null;
            target = (org.rostlab.predictprotein.IsoformType.Name)get_store().find_element_user(NAME$2, i);
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
    public void setNameArray(org.rostlab.predictprotein.IsoformType.Name[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$2);
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, org.rostlab.predictprotein.IsoformType.Name name)
    {
        generatedSetterHelperImpl(name, NAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public org.rostlab.predictprotein.IsoformType.Name insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Name target = null;
            target = (org.rostlab.predictprotein.IsoformType.Name)get_store().insert_element_user(NAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public org.rostlab.predictprotein.IsoformType.Name addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Name target = null;
            target = (org.rostlab.predictprotein.IsoformType.Name)get_store().add_element_user(NAME$2);
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
     * Gets the "sequence" element
     */
    public org.rostlab.predictprotein.IsoformType.Sequence getSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Sequence target = null;
            target = (org.rostlab.predictprotein.IsoformType.Sequence)get_store().find_element_user(SEQUENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.rostlab.predictprotein.IsoformType.Sequence sequence)
    {
        generatedSetterHelperImpl(sequence, SEQUENCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.rostlab.predictprotein.IsoformType.Sequence addNewSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Sequence target = null;
            target = (org.rostlab.predictprotein.IsoformType.Sequence)get_store().add_element_user(SEQUENCE$4);
            return target;
        }
    }
    
    /**
     * Gets the "note" element
     */
    public org.rostlab.predictprotein.IsoformType.Note getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Note target = null;
            target = (org.rostlab.predictprotein.IsoformType.Note)get_store().find_element_user(NOTE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "note" element
     */
    public boolean isSetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTE$6) != 0;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(org.rostlab.predictprotein.IsoformType.Note note)
    {
        generatedSetterHelperImpl(note, NOTE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "note" element
     */
    public org.rostlab.predictprotein.IsoformType.Note addNewNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType.Note target = null;
            target = (org.rostlab.predictprotein.IsoformType.Note)get_store().add_element_user(NOTE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "note" element
     */
    public void unsetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTE$6, 0);
        }
    }
    /**
     * An XML name(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.IsoformType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.IsoformType.Name
    {
        private static final long serialVersionUID = 1L;
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EVIDENCE$0 = 
            new javax.xml.namespace.QName("", "evidence");
        
        
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
    }
    /**
     * An XML sequence(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class SequenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.IsoformType.Sequence
    {
        private static final long serialVersionUID = 1L;
        
        public SequenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "type" attribute
         */
        public org.rostlab.predictprotein.IsoformType.Sequence.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return (org.rostlab.predictprotein.IsoformType.Sequence.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.rostlab.predictprotein.IsoformType.Sequence.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.IsoformType.Sequence.Type target = null;
                target = (org.rostlab.predictprotein.IsoformType.Sequence.Type)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(org.rostlab.predictprotein.IsoformType.Sequence.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.rostlab.predictprotein.IsoformType.Sequence.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.IsoformType.Sequence.Type target = null;
                target = (org.rostlab.predictprotein.IsoformType.Sequence.Type)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.rostlab.predictprotein.IsoformType.Sequence.Type)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$2);
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
                return get_store().find_attribute_user(REF$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$2);
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
                get_store().remove_attribute(REF$2);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of org.rostlab.predictprotein.IsoformType$Sequence$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.IsoformType.Sequence.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML note(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.IsoformType$Note.
     */
    public static class NoteImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.IsoformType.Note
    {
        private static final long serialVersionUID = 1L;
        
        public NoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NoteImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EVIDENCE$0 = 
            new javax.xml.namespace.QName("", "evidence");
        
        
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
    }
}
