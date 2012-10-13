/*
 * XML Type:  proteinType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.ProteinType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML proteinType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class ProteinTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType
{
    private static final long serialVersionUID = 1L;
    
    public ProteinTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECOMMENDEDNAME$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "recommendedName");
    private static final javax.xml.namespace.QName ALTERNATIVENAME$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "alternativeName");
    private static final javax.xml.namespace.QName SUBMITTEDNAME$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "submittedName");
    private static final javax.xml.namespace.QName ALLERGENNAME$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "allergenName");
    private static final javax.xml.namespace.QName BIOTECHNAME$8 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "biotechName");
    private static final javax.xml.namespace.QName CDANTIGENNAME$10 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "CdAntigenName");
    private static final javax.xml.namespace.QName INNNAME$12 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "innName");
    private static final javax.xml.namespace.QName DOMAIN$14 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "domain");
    private static final javax.xml.namespace.QName COMPONENT$16 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "component");
    
    
    /**
     * Gets the "recommendedName" element
     */
    public org.rostlab.predictprotein.ProteinType.RecommendedName getRecommendedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.RecommendedName target = null;
            target = (org.rostlab.predictprotein.ProteinType.RecommendedName)get_store().find_element_user(RECOMMENDEDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "recommendedName" element
     */
    public boolean isSetRecommendedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECOMMENDEDNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "recommendedName" element
     */
    public void setRecommendedName(org.rostlab.predictprotein.ProteinType.RecommendedName recommendedName)
    {
        generatedSetterHelperImpl(recommendedName, RECOMMENDEDNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recommendedName" element
     */
    public org.rostlab.predictprotein.ProteinType.RecommendedName addNewRecommendedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.RecommendedName target = null;
            target = (org.rostlab.predictprotein.ProteinType.RecommendedName)get_store().add_element_user(RECOMMENDEDNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "recommendedName" element
     */
    public void unsetRecommendedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECOMMENDEDNAME$0, 0);
        }
    }
    
    /**
     * Gets array of all "alternativeName" elements
     */
    public org.rostlab.predictprotein.ProteinType.AlternativeName[] getAlternativeNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTERNATIVENAME$2, targetList);
            org.rostlab.predictprotein.ProteinType.AlternativeName[] result = new org.rostlab.predictprotein.ProteinType.AlternativeName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alternativeName" element
     */
    public org.rostlab.predictprotein.ProteinType.AlternativeName getAlternativeNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.AlternativeName target = null;
            target = (org.rostlab.predictprotein.ProteinType.AlternativeName)get_store().find_element_user(ALTERNATIVENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alternativeName" element
     */
    public int sizeOfAlternativeNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATIVENAME$2);
        }
    }
    
    /**
     * Sets array of all "alternativeName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAlternativeNameArray(org.rostlab.predictprotein.ProteinType.AlternativeName[] alternativeNameArray)
    {
        check_orphaned();
        arraySetterHelper(alternativeNameArray, ALTERNATIVENAME$2);
    }
    
    /**
     * Sets ith "alternativeName" element
     */
    public void setAlternativeNameArray(int i, org.rostlab.predictprotein.ProteinType.AlternativeName alternativeName)
    {
        generatedSetterHelperImpl(alternativeName, ALTERNATIVENAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
     */
    public org.rostlab.predictprotein.ProteinType.AlternativeName insertNewAlternativeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.AlternativeName target = null;
            target = (org.rostlab.predictprotein.ProteinType.AlternativeName)get_store().insert_element_user(ALTERNATIVENAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternativeName" element
     */
    public org.rostlab.predictprotein.ProteinType.AlternativeName addNewAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.AlternativeName target = null;
            target = (org.rostlab.predictprotein.ProteinType.AlternativeName)get_store().add_element_user(ALTERNATIVENAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "alternativeName" element
     */
    public void removeAlternativeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATIVENAME$2, i);
        }
    }
    
    /**
     * Gets array of all "submittedName" elements
     */
    public org.rostlab.predictprotein.ProteinType.SubmittedName[] getSubmittedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBMITTEDNAME$4, targetList);
            org.rostlab.predictprotein.ProteinType.SubmittedName[] result = new org.rostlab.predictprotein.ProteinType.SubmittedName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "submittedName" element
     */
    public org.rostlab.predictprotein.ProteinType.SubmittedName getSubmittedNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.SubmittedName target = null;
            target = (org.rostlab.predictprotein.ProteinType.SubmittedName)get_store().find_element_user(SUBMITTEDNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "submittedName" element
     */
    public int sizeOfSubmittedNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITTEDNAME$4);
        }
    }
    
    /**
     * Sets array of all "submittedName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubmittedNameArray(org.rostlab.predictprotein.ProteinType.SubmittedName[] submittedNameArray)
    {
        check_orphaned();
        arraySetterHelper(submittedNameArray, SUBMITTEDNAME$4);
    }
    
    /**
     * Sets ith "submittedName" element
     */
    public void setSubmittedNameArray(int i, org.rostlab.predictprotein.ProteinType.SubmittedName submittedName)
    {
        generatedSetterHelperImpl(submittedName, SUBMITTEDNAME$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "submittedName" element
     */
    public org.rostlab.predictprotein.ProteinType.SubmittedName insertNewSubmittedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.SubmittedName target = null;
            target = (org.rostlab.predictprotein.ProteinType.SubmittedName)get_store().insert_element_user(SUBMITTEDNAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "submittedName" element
     */
    public org.rostlab.predictprotein.ProteinType.SubmittedName addNewSubmittedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.SubmittedName target = null;
            target = (org.rostlab.predictprotein.ProteinType.SubmittedName)get_store().add_element_user(SUBMITTEDNAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "submittedName" element
     */
    public void removeSubmittedName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITTEDNAME$4, i);
        }
    }
    
    /**
     * Gets the "allergenName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getAllergenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(ALLERGENNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allergenName" element
     */
    public boolean isSetAllergenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLERGENNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "allergenName" element
     */
    public void setAllergenName(org.rostlab.predictprotein.EvidencedStringType allergenName)
    {
        generatedSetterHelperImpl(allergenName, ALLERGENNAME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "allergenName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewAllergenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(ALLERGENNAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "allergenName" element
     */
    public void unsetAllergenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLERGENNAME$6, 0);
        }
    }
    
    /**
     * Gets the "biotechName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getBiotechName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(BIOTECHNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "biotechName" element
     */
    public boolean isSetBiotechName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIOTECHNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "biotechName" element
     */
    public void setBiotechName(org.rostlab.predictprotein.EvidencedStringType biotechName)
    {
        generatedSetterHelperImpl(biotechName, BIOTECHNAME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "biotechName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewBiotechName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(BIOTECHNAME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "biotechName" element
     */
    public void unsetBiotechName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIOTECHNAME$8, 0);
        }
    }
    
    /**
     * Gets array of all "CdAntigenName" elements
     */
    public org.rostlab.predictprotein.EvidencedStringType[] getCdAntigenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CDANTIGENNAME$10, targetList);
            org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CdAntigenName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getCdAntigenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(CDANTIGENNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CdAntigenName" element
     */
    public int sizeOfCdAntigenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CDANTIGENNAME$10);
        }
    }
    
    /**
     * Sets array of all "CdAntigenName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCdAntigenNameArray(org.rostlab.predictprotein.EvidencedStringType[] cdAntigenNameArray)
    {
        check_orphaned();
        arraySetterHelper(cdAntigenNameArray, CDANTIGENNAME$10);
    }
    
    /**
     * Sets ith "CdAntigenName" element
     */
    public void setCdAntigenNameArray(int i, org.rostlab.predictprotein.EvidencedStringType cdAntigenName)
    {
        generatedSetterHelperImpl(cdAntigenName, CDANTIGENNAME$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CdAntigenName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType insertNewCdAntigenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(CDANTIGENNAME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CdAntigenName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewCdAntigenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(CDANTIGENNAME$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "CdAntigenName" element
     */
    public void removeCdAntigenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CDANTIGENNAME$10, i);
        }
    }
    
    /**
     * Gets array of all "innName" elements
     */
    public org.rostlab.predictprotein.EvidencedStringType[] getInnNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INNNAME$12, targetList);
            org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "innName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getInnNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(INNNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "innName" element
     */
    public int sizeOfInnNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INNNAME$12);
        }
    }
    
    /**
     * Sets array of all "innName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInnNameArray(org.rostlab.predictprotein.EvidencedStringType[] innNameArray)
    {
        check_orphaned();
        arraySetterHelper(innNameArray, INNNAME$12);
    }
    
    /**
     * Sets ith "innName" element
     */
    public void setInnNameArray(int i, org.rostlab.predictprotein.EvidencedStringType innName)
    {
        generatedSetterHelperImpl(innName, INNNAME$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "innName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType insertNewInnName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(INNNAME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "innName" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewInnName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(INNNAME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "innName" element
     */
    public void removeInnName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INNNAME$12, i);
        }
    }
    
    /**
     * Gets array of all "domain" elements
     */
    public org.rostlab.predictprotein.ProteinType.Domain[] getDomainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOMAIN$14, targetList);
            org.rostlab.predictprotein.ProteinType.Domain[] result = new org.rostlab.predictprotein.ProteinType.Domain[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "domain" element
     */
    public org.rostlab.predictprotein.ProteinType.Domain getDomainArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.Domain target = null;
            target = (org.rostlab.predictprotein.ProteinType.Domain)get_store().find_element_user(DOMAIN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "domain" element
     */
    public int sizeOfDomainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAIN$14);
        }
    }
    
    /**
     * Sets array of all "domain" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDomainArray(org.rostlab.predictprotein.ProteinType.Domain[] domainArray)
    {
        check_orphaned();
        arraySetterHelper(domainArray, DOMAIN$14);
    }
    
    /**
     * Sets ith "domain" element
     */
    public void setDomainArray(int i, org.rostlab.predictprotein.ProteinType.Domain domain)
    {
        generatedSetterHelperImpl(domain, DOMAIN$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "domain" element
     */
    public org.rostlab.predictprotein.ProteinType.Domain insertNewDomain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.Domain target = null;
            target = (org.rostlab.predictprotein.ProteinType.Domain)get_store().insert_element_user(DOMAIN$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "domain" element
     */
    public org.rostlab.predictprotein.ProteinType.Domain addNewDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.Domain target = null;
            target = (org.rostlab.predictprotein.ProteinType.Domain)get_store().add_element_user(DOMAIN$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "domain" element
     */
    public void removeDomain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAIN$14, i);
        }
    }
    
    /**
     * Gets array of all "component" elements
     */
    public org.rostlab.predictprotein.ProteinType.Component[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$16, targetList);
            org.rostlab.predictprotein.ProteinType.Component[] result = new org.rostlab.predictprotein.ProteinType.Component[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public org.rostlab.predictprotein.ProteinType.Component getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.Component target = null;
            target = (org.rostlab.predictprotein.ProteinType.Component)get_store().find_element_user(COMPONENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$16);
        }
    }
    
    /**
     * Sets array of all "component" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComponentArray(org.rostlab.predictprotein.ProteinType.Component[] componentArray)
    {
        check_orphaned();
        arraySetterHelper(componentArray, COMPONENT$16);
    }
    
    /**
     * Sets ith "component" element
     */
    public void setComponentArray(int i, org.rostlab.predictprotein.ProteinType.Component component)
    {
        generatedSetterHelperImpl(component, COMPONENT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    public org.rostlab.predictprotein.ProteinType.Component insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.Component target = null;
            target = (org.rostlab.predictprotein.ProteinType.Component)get_store().insert_element_user(COMPONENT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public org.rostlab.predictprotein.ProteinType.Component addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ProteinType.Component target = null;
            target = (org.rostlab.predictprotein.ProteinType.Component)get_store().add_element_user(COMPONENT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$16, i);
        }
    }
    /**
     * An XML recommendedName(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class RecommendedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.RecommendedName
    {
        private static final long serialVersionUID = 1L;
        
        public RecommendedNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLNAME$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
        private static final javax.xml.namespace.QName SHORTNAME$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "shortName");
        private static final javax.xml.namespace.QName REF$4 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "fullName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fullName" element
         */
        public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
        {
            generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fullName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "shortName" elements
         */
        public org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SHORTNAME$2, targetList);
                org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "shortName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(SHORTNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "shortName" element
         */
        public int sizeOfShortNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHORTNAME$2);
            }
        }
        
        /**
         * Sets array of all "shortName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray)
        {
            check_orphaned();
            arraySetterHelper(shortNameArray, SHORTNAME$2);
        }
        
        /**
         * Sets ith "shortName" element
         */
        public void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName)
        {
            generatedSetterHelperImpl(shortName, SHORTNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shortName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(SHORTNAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shortName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(SHORTNAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "shortName" element
         */
        public void removeShortName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHORTNAME$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
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
                return get_store().find_attribute_user(REF$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
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
                get_store().remove_attribute(REF$4);
            }
        }
    }
    /**
     * An XML alternativeName(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class AlternativeNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.AlternativeName
    {
        private static final long serialVersionUID = 1L;
        
        public AlternativeNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLNAME$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
        private static final javax.xml.namespace.QName SHORTNAME$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "shortName");
        private static final javax.xml.namespace.QName REF$4 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "fullName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fullName" element
         */
        public boolean isSetFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "fullName" element
         */
        public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
        {
            generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fullName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                return target;
            }
        }
        
        /**
         * Unsets the "fullName" element
         */
        public void unsetFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLNAME$0, 0);
            }
        }
        
        /**
         * Gets array of all "shortName" elements
         */
        public org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SHORTNAME$2, targetList);
                org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "shortName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(SHORTNAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "shortName" element
         */
        public int sizeOfShortNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHORTNAME$2);
            }
        }
        
        /**
         * Sets array of all "shortName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray)
        {
            check_orphaned();
            arraySetterHelper(shortNameArray, SHORTNAME$2);
        }
        
        /**
         * Sets ith "shortName" element
         */
        public void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName)
        {
            generatedSetterHelperImpl(shortName, SHORTNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shortName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(SHORTNAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shortName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewShortName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(SHORTNAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "shortName" element
         */
        public void removeShortName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHORTNAME$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
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
                return get_store().find_attribute_user(REF$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
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
                get_store().remove_attribute(REF$4);
            }
        }
    }
    /**
     * An XML submittedName(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class SubmittedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.SubmittedName
    {
        private static final long serialVersionUID = 1L;
        
        public SubmittedNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLNAME$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "fullName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fullName" element
         */
        public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
        {
            generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fullName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                return target;
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
    }
    /**
     * An XML domain(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class DomainImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Domain
    {
        private static final long serialVersionUID = 1L;
        
        public DomainImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECOMMENDEDNAME$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "recommendedName");
        private static final javax.xml.namespace.QName ALTERNATIVENAME$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "alternativeName");
        private static final javax.xml.namespace.QName SUBMITTEDNAME$4 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "submittedName");
        private static final javax.xml.namespace.QName ALLERGENNAME$6 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "allergenName");
        private static final javax.xml.namespace.QName BIOTECHNAME$8 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "biotechName");
        private static final javax.xml.namespace.QName CDANTIGENNAME$10 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "CdAntigenName");
        private static final javax.xml.namespace.QName INNNAME$12 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "innName");
        
        
        /**
         * Gets the "recommendedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.RecommendedName getRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.RecommendedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.RecommendedName)get_store().find_element_user(RECOMMENDEDNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "recommendedName" element
         */
        public boolean isSetRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECOMMENDEDNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "recommendedName" element
         */
        public void setRecommendedName(org.rostlab.predictprotein.ProteinType.Domain.RecommendedName recommendedName)
        {
            generatedSetterHelperImpl(recommendedName, RECOMMENDEDNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "recommendedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.RecommendedName addNewRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.RecommendedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.RecommendedName)get_store().add_element_user(RECOMMENDEDNAME$0);
                return target;
            }
        }
        
        /**
         * Unsets the "recommendedName" element
         */
        public void unsetRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECOMMENDEDNAME$0, 0);
            }
        }
        
        /**
         * Gets array of all "alternativeName" elements
         */
        public org.rostlab.predictprotein.ProteinType.Domain.AlternativeName[] getAlternativeNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVENAME$2, targetList);
                org.rostlab.predictprotein.ProteinType.Domain.AlternativeName[] result = new org.rostlab.predictprotein.ProteinType.Domain.AlternativeName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alternativeName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.AlternativeName getAlternativeNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.AlternativeName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.AlternativeName)get_store().find_element_user(ALTERNATIVENAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alternativeName" element
         */
        public int sizeOfAlternativeNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVENAME$2);
            }
        }
        
        /**
         * Sets array of all "alternativeName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeNameArray(org.rostlab.predictprotein.ProteinType.Domain.AlternativeName[] alternativeNameArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeNameArray, ALTERNATIVENAME$2);
        }
        
        /**
         * Sets ith "alternativeName" element
         */
        public void setAlternativeNameArray(int i, org.rostlab.predictprotein.ProteinType.Domain.AlternativeName alternativeName)
        {
            generatedSetterHelperImpl(alternativeName, ALTERNATIVENAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.AlternativeName insertNewAlternativeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.AlternativeName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.AlternativeName)get_store().insert_element_user(ALTERNATIVENAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alternativeName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.AlternativeName addNewAlternativeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.AlternativeName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.AlternativeName)get_store().add_element_user(ALTERNATIVENAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "alternativeName" element
         */
        public void removeAlternativeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVENAME$2, i);
            }
        }
        
        /**
         * Gets array of all "submittedName" elements
         */
        public org.rostlab.predictprotein.ProteinType.Domain.SubmittedName[] getSubmittedNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBMITTEDNAME$4, targetList);
                org.rostlab.predictprotein.ProteinType.Domain.SubmittedName[] result = new org.rostlab.predictprotein.ProteinType.Domain.SubmittedName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "submittedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.SubmittedName getSubmittedNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.SubmittedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.SubmittedName)get_store().find_element_user(SUBMITTEDNAME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "submittedName" element
         */
        public int sizeOfSubmittedNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITTEDNAME$4);
            }
        }
        
        /**
         * Sets array of all "submittedName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubmittedNameArray(org.rostlab.predictprotein.ProteinType.Domain.SubmittedName[] submittedNameArray)
        {
            check_orphaned();
            arraySetterHelper(submittedNameArray, SUBMITTEDNAME$4);
        }
        
        /**
         * Sets ith "submittedName" element
         */
        public void setSubmittedNameArray(int i, org.rostlab.predictprotein.ProteinType.Domain.SubmittedName submittedName)
        {
            generatedSetterHelperImpl(submittedName, SUBMITTEDNAME$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "submittedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.SubmittedName insertNewSubmittedName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.SubmittedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.SubmittedName)get_store().insert_element_user(SUBMITTEDNAME$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "submittedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Domain.SubmittedName addNewSubmittedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Domain.SubmittedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Domain.SubmittedName)get_store().add_element_user(SUBMITTEDNAME$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "submittedName" element
         */
        public void removeSubmittedName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITTEDNAME$4, i);
            }
        }
        
        /**
         * Gets the "allergenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(ALLERGENNAME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "allergenName" element
         */
        public boolean isSetAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLERGENNAME$6) != 0;
            }
        }
        
        /**
         * Sets the "allergenName" element
         */
        public void setAllergenName(org.rostlab.predictprotein.EvidencedStringType allergenName)
        {
            generatedSetterHelperImpl(allergenName, ALLERGENNAME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "allergenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(ALLERGENNAME$6);
                return target;
            }
        }
        
        /**
         * Unsets the "allergenName" element
         */
        public void unsetAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLERGENNAME$6, 0);
            }
        }
        
        /**
         * Gets the "biotechName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(BIOTECHNAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "biotechName" element
         */
        public boolean isSetBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOTECHNAME$8) != 0;
            }
        }
        
        /**
         * Sets the "biotechName" element
         */
        public void setBiotechName(org.rostlab.predictprotein.EvidencedStringType biotechName)
        {
            generatedSetterHelperImpl(biotechName, BIOTECHNAME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "biotechName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(BIOTECHNAME$8);
                return target;
            }
        }
        
        /**
         * Unsets the "biotechName" element
         */
        public void unsetBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOTECHNAME$8, 0);
            }
        }
        
        /**
         * Gets array of all "CdAntigenName" elements
         */
        public org.rostlab.predictprotein.EvidencedStringType[] getCdAntigenNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CDANTIGENNAME$10, targetList);
                org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CdAntigenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getCdAntigenNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(CDANTIGENNAME$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CdAntigenName" element
         */
        public int sizeOfCdAntigenNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CDANTIGENNAME$10);
            }
        }
        
        /**
         * Sets array of all "CdAntigenName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCdAntigenNameArray(org.rostlab.predictprotein.EvidencedStringType[] cdAntigenNameArray)
        {
            check_orphaned();
            arraySetterHelper(cdAntigenNameArray, CDANTIGENNAME$10);
        }
        
        /**
         * Sets ith "CdAntigenName" element
         */
        public void setCdAntigenNameArray(int i, org.rostlab.predictprotein.EvidencedStringType cdAntigenName)
        {
            generatedSetterHelperImpl(cdAntigenName, CDANTIGENNAME$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CdAntigenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType insertNewCdAntigenName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(CDANTIGENNAME$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CdAntigenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewCdAntigenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(CDANTIGENNAME$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "CdAntigenName" element
         */
        public void removeCdAntigenName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CDANTIGENNAME$10, i);
            }
        }
        
        /**
         * Gets array of all "innName" elements
         */
        public org.rostlab.predictprotein.EvidencedStringType[] getInnNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INNNAME$12, targetList);
                org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "innName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getInnNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(INNNAME$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "innName" element
         */
        public int sizeOfInnNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INNNAME$12);
            }
        }
        
        /**
         * Sets array of all "innName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInnNameArray(org.rostlab.predictprotein.EvidencedStringType[] innNameArray)
        {
            check_orphaned();
            arraySetterHelper(innNameArray, INNNAME$12);
        }
        
        /**
         * Sets ith "innName" element
         */
        public void setInnNameArray(int i, org.rostlab.predictprotein.EvidencedStringType innName)
        {
            generatedSetterHelperImpl(innName, INNNAME$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "innName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType insertNewInnName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(INNNAME$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "innName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewInnName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(INNNAME$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "innName" element
         */
        public void removeInnName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INNNAME$12, i);
            }
        }
        /**
         * An XML recommendedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class RecommendedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Domain.RecommendedName
        {
            private static final long serialVersionUID = 1L;
            
            public RecommendedNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FULLNAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
            private static final javax.xml.namespace.QName SHORTNAME$2 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "shortName");
            private static final javax.xml.namespace.QName REF$4 = 
                new javax.xml.namespace.QName("", "ref");
            
            
            /**
             * Gets the "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "fullName" element
             */
            public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
            {
                generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                    return target;
                }
            }
            
            /**
             * Gets array of all "shortName" elements
             */
            public org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SHORTNAME$2, targetList);
                    org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(SHORTNAME$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "shortName" element
             */
            public int sizeOfShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SHORTNAME$2);
                }
            }
            
            /**
             * Sets array of all "shortName" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray)
            {
                check_orphaned();
                arraySetterHelper(shortNameArray, SHORTNAME$2);
            }
            
            /**
             * Sets ith "shortName" element
             */
            public void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName)
            {
                generatedSetterHelperImpl(shortName, SHORTNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(SHORTNAME$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewShortName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(SHORTNAME$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "shortName" element
             */
            public void removeShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SHORTNAME$2, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
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
                    return get_store().find_attribute_user(REF$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
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
                    get_store().remove_attribute(REF$4);
                }
            }
        }
        /**
         * An XML alternativeName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class AlternativeNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Domain.AlternativeName
        {
            private static final long serialVersionUID = 1L;
            
            public AlternativeNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FULLNAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
            private static final javax.xml.namespace.QName SHORTNAME$2 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "shortName");
            private static final javax.xml.namespace.QName REF$4 = 
                new javax.xml.namespace.QName("", "ref");
            
            
            /**
             * Gets the "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "fullName" element
             */
            public boolean isSetFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FULLNAME$0) != 0;
                }
            }
            
            /**
             * Sets the "fullName" element
             */
            public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
            {
                generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "fullName" element
             */
            public void unsetFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FULLNAME$0, 0);
                }
            }
            
            /**
             * Gets array of all "shortName" elements
             */
            public org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SHORTNAME$2, targetList);
                    org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(SHORTNAME$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "shortName" element
             */
            public int sizeOfShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SHORTNAME$2);
                }
            }
            
            /**
             * Sets array of all "shortName" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray)
            {
                check_orphaned();
                arraySetterHelper(shortNameArray, SHORTNAME$2);
            }
            
            /**
             * Sets ith "shortName" element
             */
            public void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName)
            {
                generatedSetterHelperImpl(shortName, SHORTNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(SHORTNAME$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewShortName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(SHORTNAME$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "shortName" element
             */
            public void removeShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SHORTNAME$2, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
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
                    return get_store().find_attribute_user(REF$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
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
                    get_store().remove_attribute(REF$4);
                }
            }
        }
        /**
         * An XML submittedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class SubmittedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Domain.SubmittedName
        {
            private static final long serialVersionUID = 1L;
            
            public SubmittedNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FULLNAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
            private static final javax.xml.namespace.QName REF$2 = 
                new javax.xml.namespace.QName("", "ref");
            
            
            /**
             * Gets the "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "fullName" element
             */
            public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
            {
                generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                    return target;
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
        }
    }
    /**
     * An XML component(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class ComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Component
    {
        private static final long serialVersionUID = 1L;
        
        public ComponentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECOMMENDEDNAME$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "recommendedName");
        private static final javax.xml.namespace.QName ALTERNATIVENAME$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "alternativeName");
        private static final javax.xml.namespace.QName SUBMITTEDNAME$4 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "submittedName");
        private static final javax.xml.namespace.QName ALLERGENNAME$6 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "allergenName");
        private static final javax.xml.namespace.QName BIOTECHNAME$8 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "biotechName");
        private static final javax.xml.namespace.QName CDANTIGENNAME$10 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "CdAntigenName");
        private static final javax.xml.namespace.QName INNNAME$12 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "innName");
        
        
        /**
         * Gets the "recommendedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.RecommendedName getRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.RecommendedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.RecommendedName)get_store().find_element_user(RECOMMENDEDNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "recommendedName" element
         */
        public boolean isSetRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECOMMENDEDNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "recommendedName" element
         */
        public void setRecommendedName(org.rostlab.predictprotein.ProteinType.Component.RecommendedName recommendedName)
        {
            generatedSetterHelperImpl(recommendedName, RECOMMENDEDNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "recommendedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.RecommendedName addNewRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.RecommendedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.RecommendedName)get_store().add_element_user(RECOMMENDEDNAME$0);
                return target;
            }
        }
        
        /**
         * Unsets the "recommendedName" element
         */
        public void unsetRecommendedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECOMMENDEDNAME$0, 0);
            }
        }
        
        /**
         * Gets array of all "alternativeName" elements
         */
        public org.rostlab.predictprotein.ProteinType.Component.AlternativeName[] getAlternativeNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTERNATIVENAME$2, targetList);
                org.rostlab.predictprotein.ProteinType.Component.AlternativeName[] result = new org.rostlab.predictprotein.ProteinType.Component.AlternativeName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alternativeName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.AlternativeName getAlternativeNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.AlternativeName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.AlternativeName)get_store().find_element_user(ALTERNATIVENAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alternativeName" element
         */
        public int sizeOfAlternativeNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTERNATIVENAME$2);
            }
        }
        
        /**
         * Sets array of all "alternativeName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAlternativeNameArray(org.rostlab.predictprotein.ProteinType.Component.AlternativeName[] alternativeNameArray)
        {
            check_orphaned();
            arraySetterHelper(alternativeNameArray, ALTERNATIVENAME$2);
        }
        
        /**
         * Sets ith "alternativeName" element
         */
        public void setAlternativeNameArray(int i, org.rostlab.predictprotein.ProteinType.Component.AlternativeName alternativeName)
        {
            generatedSetterHelperImpl(alternativeName, ALTERNATIVENAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.AlternativeName insertNewAlternativeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.AlternativeName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.AlternativeName)get_store().insert_element_user(ALTERNATIVENAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alternativeName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.AlternativeName addNewAlternativeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.AlternativeName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.AlternativeName)get_store().add_element_user(ALTERNATIVENAME$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "alternativeName" element
         */
        public void removeAlternativeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTERNATIVENAME$2, i);
            }
        }
        
        /**
         * Gets array of all "submittedName" elements
         */
        public org.rostlab.predictprotein.ProteinType.Component.SubmittedName[] getSubmittedNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBMITTEDNAME$4, targetList);
                org.rostlab.predictprotein.ProteinType.Component.SubmittedName[] result = new org.rostlab.predictprotein.ProteinType.Component.SubmittedName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "submittedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.SubmittedName getSubmittedNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.SubmittedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.SubmittedName)get_store().find_element_user(SUBMITTEDNAME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "submittedName" element
         */
        public int sizeOfSubmittedNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITTEDNAME$4);
            }
        }
        
        /**
         * Sets array of all "submittedName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubmittedNameArray(org.rostlab.predictprotein.ProteinType.Component.SubmittedName[] submittedNameArray)
        {
            check_orphaned();
            arraySetterHelper(submittedNameArray, SUBMITTEDNAME$4);
        }
        
        /**
         * Sets ith "submittedName" element
         */
        public void setSubmittedNameArray(int i, org.rostlab.predictprotein.ProteinType.Component.SubmittedName submittedName)
        {
            generatedSetterHelperImpl(submittedName, SUBMITTEDNAME$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "submittedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.SubmittedName insertNewSubmittedName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.SubmittedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.SubmittedName)get_store().insert_element_user(SUBMITTEDNAME$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "submittedName" element
         */
        public org.rostlab.predictprotein.ProteinType.Component.SubmittedName addNewSubmittedName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType.Component.SubmittedName target = null;
                target = (org.rostlab.predictprotein.ProteinType.Component.SubmittedName)get_store().add_element_user(SUBMITTEDNAME$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "submittedName" element
         */
        public void removeSubmittedName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITTEDNAME$4, i);
            }
        }
        
        /**
         * Gets the "allergenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(ALLERGENNAME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "allergenName" element
         */
        public boolean isSetAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLERGENNAME$6) != 0;
            }
        }
        
        /**
         * Sets the "allergenName" element
         */
        public void setAllergenName(org.rostlab.predictprotein.EvidencedStringType allergenName)
        {
            generatedSetterHelperImpl(allergenName, ALLERGENNAME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "allergenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(ALLERGENNAME$6);
                return target;
            }
        }
        
        /**
         * Unsets the "allergenName" element
         */
        public void unsetAllergenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLERGENNAME$6, 0);
            }
        }
        
        /**
         * Gets the "biotechName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(BIOTECHNAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "biotechName" element
         */
        public boolean isSetBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOTECHNAME$8) != 0;
            }
        }
        
        /**
         * Sets the "biotechName" element
         */
        public void setBiotechName(org.rostlab.predictprotein.EvidencedStringType biotechName)
        {
            generatedSetterHelperImpl(biotechName, BIOTECHNAME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "biotechName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(BIOTECHNAME$8);
                return target;
            }
        }
        
        /**
         * Unsets the "biotechName" element
         */
        public void unsetBiotechName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOTECHNAME$8, 0);
            }
        }
        
        /**
         * Gets array of all "CdAntigenName" elements
         */
        public org.rostlab.predictprotein.EvidencedStringType[] getCdAntigenNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CDANTIGENNAME$10, targetList);
                org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "CdAntigenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getCdAntigenNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(CDANTIGENNAME$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "CdAntigenName" element
         */
        public int sizeOfCdAntigenNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CDANTIGENNAME$10);
            }
        }
        
        /**
         * Sets array of all "CdAntigenName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCdAntigenNameArray(org.rostlab.predictprotein.EvidencedStringType[] cdAntigenNameArray)
        {
            check_orphaned();
            arraySetterHelper(cdAntigenNameArray, CDANTIGENNAME$10);
        }
        
        /**
         * Sets ith "CdAntigenName" element
         */
        public void setCdAntigenNameArray(int i, org.rostlab.predictprotein.EvidencedStringType cdAntigenName)
        {
            generatedSetterHelperImpl(cdAntigenName, CDANTIGENNAME$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CdAntigenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType insertNewCdAntigenName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(CDANTIGENNAME$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CdAntigenName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewCdAntigenName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(CDANTIGENNAME$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "CdAntigenName" element
         */
        public void removeCdAntigenName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CDANTIGENNAME$10, i);
            }
        }
        
        /**
         * Gets array of all "innName" elements
         */
        public org.rostlab.predictprotein.EvidencedStringType[] getInnNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INNNAME$12, targetList);
                org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "innName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType getInnNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(INNNAME$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "innName" element
         */
        public int sizeOfInnNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INNNAME$12);
            }
        }
        
        /**
         * Sets array of all "innName" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInnNameArray(org.rostlab.predictprotein.EvidencedStringType[] innNameArray)
        {
            check_orphaned();
            arraySetterHelper(innNameArray, INNNAME$12);
        }
        
        /**
         * Sets ith "innName" element
         */
        public void setInnNameArray(int i, org.rostlab.predictprotein.EvidencedStringType innName)
        {
            generatedSetterHelperImpl(innName, INNNAME$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "innName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType insertNewInnName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(INNNAME$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "innName" element
         */
        public org.rostlab.predictprotein.EvidencedStringType addNewInnName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidencedStringType target = null;
                target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(INNNAME$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "innName" element
         */
        public void removeInnName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INNNAME$12, i);
            }
        }
        /**
         * An XML recommendedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class RecommendedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Component.RecommendedName
        {
            private static final long serialVersionUID = 1L;
            
            public RecommendedNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FULLNAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
            private static final javax.xml.namespace.QName SHORTNAME$2 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "shortName");
            private static final javax.xml.namespace.QName REF$4 = 
                new javax.xml.namespace.QName("", "ref");
            
            
            /**
             * Gets the "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "fullName" element
             */
            public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
            {
                generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                    return target;
                }
            }
            
            /**
             * Gets array of all "shortName" elements
             */
            public org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SHORTNAME$2, targetList);
                    org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(SHORTNAME$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "shortName" element
             */
            public int sizeOfShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SHORTNAME$2);
                }
            }
            
            /**
             * Sets array of all "shortName" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray)
            {
                check_orphaned();
                arraySetterHelper(shortNameArray, SHORTNAME$2);
            }
            
            /**
             * Sets ith "shortName" element
             */
            public void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName)
            {
                generatedSetterHelperImpl(shortName, SHORTNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(SHORTNAME$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewShortName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(SHORTNAME$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "shortName" element
             */
            public void removeShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SHORTNAME$2, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
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
                    return get_store().find_attribute_user(REF$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
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
                    get_store().remove_attribute(REF$4);
                }
            }
        }
        /**
         * An XML alternativeName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class AlternativeNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Component.AlternativeName
        {
            private static final long serialVersionUID = 1L;
            
            public AlternativeNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FULLNAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
            private static final javax.xml.namespace.QName SHORTNAME$2 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "shortName");
            private static final javax.xml.namespace.QName REF$4 = 
                new javax.xml.namespace.QName("", "ref");
            
            
            /**
             * Gets the "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "fullName" element
             */
            public boolean isSetFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FULLNAME$0) != 0;
                }
            }
            
            /**
             * Sets the "fullName" element
             */
            public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
            {
                generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "fullName" element
             */
            public void unsetFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FULLNAME$0, 0);
                }
            }
            
            /**
             * Gets array of all "shortName" elements
             */
            public org.rostlab.predictprotein.EvidencedStringType[] getShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SHORTNAME$2, targetList);
                    org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getShortNameArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(SHORTNAME$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "shortName" element
             */
            public int sizeOfShortNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SHORTNAME$2);
                }
            }
            
            /**
             * Sets array of all "shortName" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setShortNameArray(org.rostlab.predictprotein.EvidencedStringType[] shortNameArray)
            {
                check_orphaned();
                arraySetterHelper(shortNameArray, SHORTNAME$2);
            }
            
            /**
             * Sets ith "shortName" element
             */
            public void setShortNameArray(int i, org.rostlab.predictprotein.EvidencedStringType shortName)
            {
                generatedSetterHelperImpl(shortName, SHORTNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType insertNewShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(SHORTNAME$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "shortName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewShortName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(SHORTNAME$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "shortName" element
             */
            public void removeShortName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SHORTNAME$2, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
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
                    return get_store().find_attribute_user(REF$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REF$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REF$4);
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
                    get_store().remove_attribute(REF$4);
                }
            }
        }
        /**
         * An XML submittedName(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class SubmittedNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.ProteinType.Component.SubmittedName
        {
            private static final long serialVersionUID = 1L;
            
            public SubmittedNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FULLNAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "fullName");
            private static final javax.xml.namespace.QName REF$2 = 
                new javax.xml.namespace.QName("", "ref");
            
            
            /**
             * Gets the "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType getFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(FULLNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "fullName" element
             */
            public void setFullName(org.rostlab.predictprotein.EvidencedStringType fullName)
            {
                generatedSetterHelperImpl(fullName, FULLNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "fullName" element
             */
            public org.rostlab.predictprotein.EvidencedStringType addNewFullName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.EvidencedStringType target = null;
                    target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(FULLNAME$0);
                    return target;
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
        }
    }
}
