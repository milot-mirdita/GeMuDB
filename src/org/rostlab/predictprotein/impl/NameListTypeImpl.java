/*
 * XML Type:  nameListType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.NameListType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML nameListType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class NameListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.NameListType
{
    private static final long serialVersionUID = 1L;
    
    public NameListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "person");
    private static final javax.xml.namespace.QName CONSORTIUM$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "consortium");
    
    
    /**
     * Gets array of all "person" elements
     */
    public org.rostlab.predictprotein.PersonType[] getPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSON$0, targetList);
            org.rostlab.predictprotein.PersonType[] result = new org.rostlab.predictprotein.PersonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "person" element
     */
    public org.rostlab.predictprotein.PersonType getPersonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PersonType target = null;
            target = (org.rostlab.predictprotein.PersonType)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "person" element
     */
    public int sizeOfPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$0);
        }
    }
    
    /**
     * Sets array of all "person" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPersonArray(org.rostlab.predictprotein.PersonType[] personArray)
    {
        check_orphaned();
        arraySetterHelper(personArray, PERSON$0);
    }
    
    /**
     * Sets ith "person" element
     */
    public void setPersonArray(int i, org.rostlab.predictprotein.PersonType person)
    {
        generatedSetterHelperImpl(person, PERSON$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "person" element
     */
    public org.rostlab.predictprotein.PersonType insertNewPerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PersonType target = null;
            target = (org.rostlab.predictprotein.PersonType)get_store().insert_element_user(PERSON$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "person" element
     */
    public org.rostlab.predictprotein.PersonType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PersonType target = null;
            target = (org.rostlab.predictprotein.PersonType)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "person" element
     */
    public void removePerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$0, i);
        }
    }
    
    /**
     * Gets array of all "consortium" elements
     */
    public org.rostlab.predictprotein.ConsortiumType[] getConsortiumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSORTIUM$2, targetList);
            org.rostlab.predictprotein.ConsortiumType[] result = new org.rostlab.predictprotein.ConsortiumType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "consortium" element
     */
    public org.rostlab.predictprotein.ConsortiumType getConsortiumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ConsortiumType target = null;
            target = (org.rostlab.predictprotein.ConsortiumType)get_store().find_element_user(CONSORTIUM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "consortium" element
     */
    public int sizeOfConsortiumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSORTIUM$2);
        }
    }
    
    /**
     * Sets array of all "consortium" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConsortiumArray(org.rostlab.predictprotein.ConsortiumType[] consortiumArray)
    {
        check_orphaned();
        arraySetterHelper(consortiumArray, CONSORTIUM$2);
    }
    
    /**
     * Sets ith "consortium" element
     */
    public void setConsortiumArray(int i, org.rostlab.predictprotein.ConsortiumType consortium)
    {
        generatedSetterHelperImpl(consortium, CONSORTIUM$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "consortium" element
     */
    public org.rostlab.predictprotein.ConsortiumType insertNewConsortium(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ConsortiumType target = null;
            target = (org.rostlab.predictprotein.ConsortiumType)get_store().insert_element_user(CONSORTIUM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "consortium" element
     */
    public org.rostlab.predictprotein.ConsortiumType addNewConsortium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ConsortiumType target = null;
            target = (org.rostlab.predictprotein.ConsortiumType)get_store().add_element_user(CONSORTIUM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "consortium" element
     */
    public void removeConsortium(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSORTIUM$2, i);
        }
    }
}
