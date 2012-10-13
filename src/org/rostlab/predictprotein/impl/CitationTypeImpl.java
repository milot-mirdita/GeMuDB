/*
 * XML Type:  citationType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.CitationType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML citationType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class CitationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CitationType
{
    private static final long serialVersionUID = 1L;
    
    public CitationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "title");
    private static final javax.xml.namespace.QName EDITORLIST$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "editorList");
    private static final javax.xml.namespace.QName AUTHORLIST$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "authorList");
    private static final javax.xml.namespace.QName LOCATOR$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "locator");
    private static final javax.xml.namespace.QName DBREFERENCE$8 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "dbReference");
    private static final javax.xml.namespace.QName CITINGCITATION$10 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "citingCitation");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DATE$14 = 
        new javax.xml.namespace.QName("", "date");
    private static final javax.xml.namespace.QName NAME$16 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName VOLUME$18 = 
        new javax.xml.namespace.QName("", "volume");
    private static final javax.xml.namespace.QName FIRST$20 = 
        new javax.xml.namespace.QName("", "first");
    private static final javax.xml.namespace.QName LAST$22 = 
        new javax.xml.namespace.QName("", "last");
    private static final javax.xml.namespace.QName PUBLISHER$24 = 
        new javax.xml.namespace.QName("", "publisher");
    private static final javax.xml.namespace.QName CITY$26 = 
        new javax.xml.namespace.QName("", "city");
    private static final javax.xml.namespace.QName DB$28 = 
        new javax.xml.namespace.QName("", "db");
    private static final javax.xml.namespace.QName COUNTRY$30 = 
        new javax.xml.namespace.QName("", "country");
    private static final javax.xml.namespace.QName NUMBER$32 = 
        new javax.xml.namespace.QName("", "number");
    private static final javax.xml.namespace.QName INSTITUTE$34 = 
        new javax.xml.namespace.QName("", "institute");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$0) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$0, 0);
        }
    }
    
    /**
     * Gets the "editorList" element
     */
    public org.rostlab.predictprotein.NameListType getEditorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.NameListType target = null;
            target = (org.rostlab.predictprotein.NameListType)get_store().find_element_user(EDITORLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "editorList" element
     */
    public boolean isSetEditorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDITORLIST$2) != 0;
        }
    }
    
    /**
     * Sets the "editorList" element
     */
    public void setEditorList(org.rostlab.predictprotein.NameListType editorList)
    {
        generatedSetterHelperImpl(editorList, EDITORLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "editorList" element
     */
    public org.rostlab.predictprotein.NameListType addNewEditorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.NameListType target = null;
            target = (org.rostlab.predictprotein.NameListType)get_store().add_element_user(EDITORLIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "editorList" element
     */
    public void unsetEditorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDITORLIST$2, 0);
        }
    }
    
    /**
     * Gets the "authorList" element
     */
    public org.rostlab.predictprotein.NameListType getAuthorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.NameListType target = null;
            target = (org.rostlab.predictprotein.NameListType)get_store().find_element_user(AUTHORLIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authorList" element
     */
    public boolean isSetAuthorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORLIST$4) != 0;
        }
    }
    
    /**
     * Sets the "authorList" element
     */
    public void setAuthorList(org.rostlab.predictprotein.NameListType authorList)
    {
        generatedSetterHelperImpl(authorList, AUTHORLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authorList" element
     */
    public org.rostlab.predictprotein.NameListType addNewAuthorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.NameListType target = null;
            target = (org.rostlab.predictprotein.NameListType)get_store().add_element_user(AUTHORLIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "authorList" element
     */
    public void unsetAuthorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORLIST$4, 0);
        }
    }
    
    /**
     * Gets the "locator" element
     */
    public java.lang.String getLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locator" element
     */
    public org.apache.xmlbeans.XmlString xgetLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATOR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "locator" element
     */
    public boolean isSetLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATOR$6) != 0;
        }
    }
    
    /**
     * Sets the "locator" element
     */
    public void setLocator(java.lang.String locator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATOR$6);
            }
            target.setStringValue(locator);
        }
    }
    
    /**
     * Sets (as xml) the "locator" element
     */
    public void xsetLocator(org.apache.xmlbeans.XmlString locator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATOR$6);
            }
            target.set(locator);
        }
    }
    
    /**
     * Unsets the "locator" element
     */
    public void unsetLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATOR$6, 0);
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
            get_store().find_all_element_users(DBREFERENCE$8, targetList);
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
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().find_element_user(DBREFERENCE$8, i);
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
            return get_store().count_elements(DBREFERENCE$8);
        }
    }
    
    /**
     * Sets array of all "dbReference" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDbReferenceArray(org.rostlab.predictprotein.DbReferenceType[] dbReferenceArray)
    {
        check_orphaned();
        arraySetterHelper(dbReferenceArray, DBREFERENCE$8);
    }
    
    /**
     * Sets ith "dbReference" element
     */
    public void setDbReferenceArray(int i, org.rostlab.predictprotein.DbReferenceType dbReference)
    {
        generatedSetterHelperImpl(dbReference, DBREFERENCE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().insert_element_user(DBREFERENCE$8, i);
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
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().add_element_user(DBREFERENCE$8);
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
            get_store().remove_element(DBREFERENCE$8, i);
        }
    }
    
    /**
     * Gets the "citingCitation" element
     */
    public org.rostlab.predictprotein.CitationType getCitingCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType target = null;
            target = (org.rostlab.predictprotein.CitationType)get_store().find_element_user(CITINGCITATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "citingCitation" element
     */
    public boolean isSetCitingCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITINGCITATION$10) != 0;
        }
    }
    
    /**
     * Sets the "citingCitation" element
     */
    public void setCitingCitation(org.rostlab.predictprotein.CitationType citingCitation)
    {
        generatedSetterHelperImpl(citingCitation, CITINGCITATION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "citingCitation" element
     */
    public org.rostlab.predictprotein.CitationType addNewCitingCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType target = null;
            target = (org.rostlab.predictprotein.CitationType)get_store().add_element_user(CITINGCITATION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "citingCitation" element
     */
    public void unsetCitingCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITINGCITATION$10, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.rostlab.predictprotein.CitationType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.CitationType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.rostlab.predictprotein.CitationType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType.Type target = null;
            target = (org.rostlab.predictprotein.CitationType.Type)get_store().find_attribute_user(TYPE$12);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.rostlab.predictprotein.CitationType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$12);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.rostlab.predictprotein.CitationType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType.Type target = null;
            target = (org.rostlab.predictprotein.CitationType.Type)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.CitationType.Type)get_store().add_attribute_user(TYPE$12);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "date" attribute
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$14);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" attribute
     */
    public org.rostlab.predictprotein.CitationType.Date xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType.Date target = null;
            target = (org.rostlab.predictprotein.CitationType.Date)get_store().find_attribute_user(DATE$14);
            return target;
        }
    }
    
    /**
     * True if has "date" attribute
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATE$14) != null;
        }
    }
    
    /**
     * Sets the "date" attribute
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATE$14);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" attribute
     */
    public void xsetDate(org.rostlab.predictprotein.CitationType.Date date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CitationType.Date target = null;
            target = (org.rostlab.predictprotein.CitationType.Date)get_store().find_attribute_user(DATE$14);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.CitationType.Date)get_store().add_attribute_user(DATE$14);
            }
            target.set(date);
        }
    }
    
    /**
     * Unsets the "date" attribute
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATE$14);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$16) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$16);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$16);
        }
    }
    
    /**
     * Gets the "volume" attribute
     */
    public java.lang.String getVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUME$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "volume" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VOLUME$18);
            return target;
        }
    }
    
    /**
     * True if has "volume" attribute
     */
    public boolean isSetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VOLUME$18) != null;
        }
    }
    
    /**
     * Sets the "volume" attribute
     */
    public void setVolume(java.lang.String volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLUME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLUME$18);
            }
            target.setStringValue(volume);
        }
    }
    
    /**
     * Sets (as xml) the "volume" attribute
     */
    public void xsetVolume(org.apache.xmlbeans.XmlString volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VOLUME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VOLUME$18);
            }
            target.set(volume);
        }
    }
    
    /**
     * Unsets the "volume" attribute
     */
    public void unsetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VOLUME$18);
        }
    }
    
    /**
     * Gets the "first" attribute
     */
    public java.lang.String getFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "first" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIRST$20);
            return target;
        }
    }
    
    /**
     * True if has "first" attribute
     */
    public boolean isSetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIRST$20) != null;
        }
    }
    
    /**
     * Sets the "first" attribute
     */
    public void setFirst(java.lang.String first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIRST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIRST$20);
            }
            target.setStringValue(first);
        }
    }
    
    /**
     * Sets (as xml) the "first" attribute
     */
    public void xsetFirst(org.apache.xmlbeans.XmlString first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIRST$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIRST$20);
            }
            target.set(first);
        }
    }
    
    /**
     * Unsets the "first" attribute
     */
    public void unsetFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIRST$20);
        }
    }
    
    /**
     * Gets the "last" attribute
     */
    public java.lang.String getLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "last" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LAST$22);
            return target;
        }
    }
    
    /**
     * True if has "last" attribute
     */
    public boolean isSetLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LAST$22) != null;
        }
    }
    
    /**
     * Sets the "last" attribute
     */
    public void setLast(java.lang.String last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAST$22);
            }
            target.setStringValue(last);
        }
    }
    
    /**
     * Sets (as xml) the "last" attribute
     */
    public void xsetLast(org.apache.xmlbeans.XmlString last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LAST$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LAST$22);
            }
            target.set(last);
        }
    }
    
    /**
     * Unsets the "last" attribute
     */
    public void unsetLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LAST$22);
        }
    }
    
    /**
     * Gets the "publisher" attribute
     */
    public java.lang.String getPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHER$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publisher" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHER$24);
            return target;
        }
    }
    
    /**
     * True if has "publisher" attribute
     */
    public boolean isSetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLISHER$24) != null;
        }
    }
    
    /**
     * Sets the "publisher" attribute
     */
    public void setPublisher(java.lang.String publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHER$24);
            }
            target.setStringValue(publisher);
        }
    }
    
    /**
     * Sets (as xml) the "publisher" attribute
     */
    public void xsetPublisher(org.apache.xmlbeans.XmlString publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUBLISHER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUBLISHER$24);
            }
            target.set(publisher);
        }
    }
    
    /**
     * Unsets the "publisher" attribute
     */
    public void unsetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLISHER$24);
        }
    }
    
    /**
     * Gets the "city" attribute
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "city" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$26);
            return target;
        }
    }
    
    /**
     * True if has "city" attribute
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CITY$26) != null;
        }
    }
    
    /**
     * Sets the "city" attribute
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CITY$26);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "city" attribute
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CITY$26);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "city" attribute
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CITY$26);
        }
    }
    
    /**
     * Gets the "db" attribute
     */
    public java.lang.String getDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DB$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "db" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DB$28);
            return target;
        }
    }
    
    /**
     * True if has "db" attribute
     */
    public boolean isSetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DB$28) != null;
        }
    }
    
    /**
     * Sets the "db" attribute
     */
    public void setDb(java.lang.String db)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DB$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DB$28);
            }
            target.setStringValue(db);
        }
    }
    
    /**
     * Sets (as xml) the "db" attribute
     */
    public void xsetDb(org.apache.xmlbeans.XmlString db)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DB$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DB$28);
            }
            target.set(db);
        }
    }
    
    /**
     * Unsets the "db" attribute
     */
    public void unsetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DB$28);
        }
    }
    
    /**
     * Gets the "country" attribute
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$30);
            return target;
        }
    }
    
    /**
     * True if has "country" attribute
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTRY$30) != null;
        }
    }
    
    /**
     * Sets the "country" attribute
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRY$30);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" attribute
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRY$30);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" attribute
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTRY$30);
        }
    }
    
    /**
     * Gets the "number" attribute
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" attribute
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBER$32);
            return target;
        }
    }
    
    /**
     * True if has "number" attribute
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMBER$32) != null;
        }
    }
    
    /**
     * Sets the "number" attribute
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBER$32);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" attribute
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMBER$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMBER$32);
            }
            target.set(number);
        }
    }
    
    /**
     * Unsets the "number" attribute
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMBER$32);
        }
    }
    
    /**
     * Gets the "institute" attribute
     */
    public java.lang.String getInstitute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTE$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "institute" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInstitute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSTITUTE$34);
            return target;
        }
    }
    
    /**
     * True if has "institute" attribute
     */
    public boolean isSetInstitute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTITUTE$34) != null;
        }
    }
    
    /**
     * Sets the "institute" attribute
     */
    public void setInstitute(java.lang.String institute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTITUTE$34);
            }
            target.setStringValue(institute);
        }
    }
    
    /**
     * Sets (as xml) the "institute" attribute
     */
    public void xsetInstitute(org.apache.xmlbeans.XmlString institute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSTITUTE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INSTITUTE$34);
            }
            target.set(institute);
        }
    }
    
    /**
     * Unsets the "institute" attribute
     */
    public void unsetInstitute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTITUTE$34);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.CitationType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.CitationType.Type
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
    /**
     * An XML date(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlDate
     *     org.apache.xmlbeans.XmlGYearMonth
     *     org.apache.xmlbeans.XmlGYear
     */
    public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.rostlab.predictprotein.CitationType.Date, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlGYear
    {
        private static final long serialVersionUID = 1L;
        
        public DateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
