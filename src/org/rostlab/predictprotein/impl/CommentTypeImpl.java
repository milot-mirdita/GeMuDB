/*
 * XML Type:  commentType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.CommentType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML commentType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class CommentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CommentType
{
    private static final long serialVersionUID = 1L;
    
    public CommentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSORPTION$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "absorption");
    private static final javax.xml.namespace.QName KINETICS$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "kinetics");
    private static final javax.xml.namespace.QName PHDEPENDENCE$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "phDependence");
    private static final javax.xml.namespace.QName REDOXPOTENTIAL$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "redoxPotential");
    private static final javax.xml.namespace.QName TEMPERATUREDEPENDENCE$8 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "temperatureDependence");
    private static final javax.xml.namespace.QName MOLECULE$10 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "molecule");
    private static final javax.xml.namespace.QName SUBCELLULARLOCATION$12 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "subcellularLocation");
    private static final javax.xml.namespace.QName CONFLICT$14 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "conflict");
    private static final javax.xml.namespace.QName LINK$16 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "link");
    private static final javax.xml.namespace.QName EVENT$18 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "event");
    private static final javax.xml.namespace.QName ISOFORM$20 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "isoform");
    private static final javax.xml.namespace.QName INTERACTANT$22 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "interactant");
    private static final javax.xml.namespace.QName ORGANISMSDIFFER$24 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "organismsDiffer");
    private static final javax.xml.namespace.QName EXPERIMENTS$26 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "experiments");
    private static final javax.xml.namespace.QName LOCATION$28 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "location");
    private static final javax.xml.namespace.QName TEXT$30 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "text");
    private static final javax.xml.namespace.QName NAME$32 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName MASS$34 = 
        new javax.xml.namespace.QName("", "mass");
    private static final javax.xml.namespace.QName ERROR$36 = 
        new javax.xml.namespace.QName("", "error");
    private static final javax.xml.namespace.QName METHOD$38 = 
        new javax.xml.namespace.QName("", "method");
    private static final javax.xml.namespace.QName TYPE$40 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName EVIDENCE$42 = 
        new javax.xml.namespace.QName("", "evidence");
    
    
    /**
     * Gets the "absorption" element
     */
    public org.rostlab.predictprotein.CommentType.Absorption getAbsorption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Absorption target = null;
            target = (org.rostlab.predictprotein.CommentType.Absorption)get_store().find_element_user(ABSORPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "absorption" element
     */
    public boolean isSetAbsorption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSORPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "absorption" element
     */
    public void setAbsorption(org.rostlab.predictprotein.CommentType.Absorption absorption)
    {
        generatedSetterHelperImpl(absorption, ABSORPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "absorption" element
     */
    public org.rostlab.predictprotein.CommentType.Absorption addNewAbsorption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Absorption target = null;
            target = (org.rostlab.predictprotein.CommentType.Absorption)get_store().add_element_user(ABSORPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "absorption" element
     */
    public void unsetAbsorption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSORPTION$0, 0);
        }
    }
    
    /**
     * Gets the "kinetics" element
     */
    public org.rostlab.predictprotein.CommentType.Kinetics getKinetics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Kinetics target = null;
            target = (org.rostlab.predictprotein.CommentType.Kinetics)get_store().find_element_user(KINETICS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kinetics" element
     */
    public boolean isSetKinetics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KINETICS$2) != 0;
        }
    }
    
    /**
     * Sets the "kinetics" element
     */
    public void setKinetics(org.rostlab.predictprotein.CommentType.Kinetics kinetics)
    {
        generatedSetterHelperImpl(kinetics, KINETICS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "kinetics" element
     */
    public org.rostlab.predictprotein.CommentType.Kinetics addNewKinetics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Kinetics target = null;
            target = (org.rostlab.predictprotein.CommentType.Kinetics)get_store().add_element_user(KINETICS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "kinetics" element
     */
    public void unsetKinetics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KINETICS$2, 0);
        }
    }
    
    /**
     * Gets the "phDependence" element
     */
    public java.lang.String getPhDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHDEPENDENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "phDependence" element
     */
    public org.apache.xmlbeans.XmlString xgetPhDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHDEPENDENCE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "phDependence" element
     */
    public boolean isSetPhDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHDEPENDENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "phDependence" element
     */
    public void setPhDependence(java.lang.String phDependence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHDEPENDENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHDEPENDENCE$4);
            }
            target.setStringValue(phDependence);
        }
    }
    
    /**
     * Sets (as xml) the "phDependence" element
     */
    public void xsetPhDependence(org.apache.xmlbeans.XmlString phDependence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHDEPENDENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHDEPENDENCE$4);
            }
            target.set(phDependence);
        }
    }
    
    /**
     * Unsets the "phDependence" element
     */
    public void unsetPhDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHDEPENDENCE$4, 0);
        }
    }
    
    /**
     * Gets the "redoxPotential" element
     */
    public java.lang.String getRedoxPotential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REDOXPOTENTIAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "redoxPotential" element
     */
    public org.apache.xmlbeans.XmlString xgetRedoxPotential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REDOXPOTENTIAL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "redoxPotential" element
     */
    public boolean isSetRedoxPotential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REDOXPOTENTIAL$6) != 0;
        }
    }
    
    /**
     * Sets the "redoxPotential" element
     */
    public void setRedoxPotential(java.lang.String redoxPotential)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REDOXPOTENTIAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REDOXPOTENTIAL$6);
            }
            target.setStringValue(redoxPotential);
        }
    }
    
    /**
     * Sets (as xml) the "redoxPotential" element
     */
    public void xsetRedoxPotential(org.apache.xmlbeans.XmlString redoxPotential)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REDOXPOTENTIAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REDOXPOTENTIAL$6);
            }
            target.set(redoxPotential);
        }
    }
    
    /**
     * Unsets the "redoxPotential" element
     */
    public void unsetRedoxPotential()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REDOXPOTENTIAL$6, 0);
        }
    }
    
    /**
     * Gets the "temperatureDependence" element
     */
    public java.lang.String getTemperatureDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPERATUREDEPENDENCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "temperatureDependence" element
     */
    public org.apache.xmlbeans.XmlString xgetTemperatureDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPERATUREDEPENDENCE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "temperatureDependence" element
     */
    public boolean isSetTemperatureDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPERATUREDEPENDENCE$8) != 0;
        }
    }
    
    /**
     * Sets the "temperatureDependence" element
     */
    public void setTemperatureDependence(java.lang.String temperatureDependence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPERATUREDEPENDENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPERATUREDEPENDENCE$8);
            }
            target.setStringValue(temperatureDependence);
        }
    }
    
    /**
     * Sets (as xml) the "temperatureDependence" element
     */
    public void xsetTemperatureDependence(org.apache.xmlbeans.XmlString temperatureDependence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPERATUREDEPENDENCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPERATUREDEPENDENCE$8);
            }
            target.set(temperatureDependence);
        }
    }
    
    /**
     * Unsets the "temperatureDependence" element
     */
    public void unsetTemperatureDependence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPERATUREDEPENDENCE$8, 0);
        }
    }
    
    /**
     * Gets the "molecule" element
     */
    public java.lang.String getMolecule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOLECULE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "molecule" element
     */
    public org.apache.xmlbeans.XmlString xgetMolecule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOLECULE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "molecule" element
     */
    public boolean isSetMolecule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOLECULE$10) != 0;
        }
    }
    
    /**
     * Sets the "molecule" element
     */
    public void setMolecule(java.lang.String molecule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOLECULE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOLECULE$10);
            }
            target.setStringValue(molecule);
        }
    }
    
    /**
     * Sets (as xml) the "molecule" element
     */
    public void xsetMolecule(org.apache.xmlbeans.XmlString molecule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOLECULE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOLECULE$10);
            }
            target.set(molecule);
        }
    }
    
    /**
     * Unsets the "molecule" element
     */
    public void unsetMolecule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOLECULE$10, 0);
        }
    }
    
    /**
     * Gets array of all "subcellularLocation" elements
     */
    public org.rostlab.predictprotein.SubcellularLocationType[] getSubcellularLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBCELLULARLOCATION$12, targetList);
            org.rostlab.predictprotein.SubcellularLocationType[] result = new org.rostlab.predictprotein.SubcellularLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subcellularLocation" element
     */
    public org.rostlab.predictprotein.SubcellularLocationType getSubcellularLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SubcellularLocationType target = null;
            target = (org.rostlab.predictprotein.SubcellularLocationType)get_store().find_element_user(SUBCELLULARLOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subcellularLocation" element
     */
    public int sizeOfSubcellularLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCELLULARLOCATION$12);
        }
    }
    
    /**
     * Sets array of all "subcellularLocation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubcellularLocationArray(org.rostlab.predictprotein.SubcellularLocationType[] subcellularLocationArray)
    {
        check_orphaned();
        arraySetterHelper(subcellularLocationArray, SUBCELLULARLOCATION$12);
    }
    
    /**
     * Sets ith "subcellularLocation" element
     */
    public void setSubcellularLocationArray(int i, org.rostlab.predictprotein.SubcellularLocationType subcellularLocation)
    {
        generatedSetterHelperImpl(subcellularLocation, SUBCELLULARLOCATION$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subcellularLocation" element
     */
    public org.rostlab.predictprotein.SubcellularLocationType insertNewSubcellularLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SubcellularLocationType target = null;
            target = (org.rostlab.predictprotein.SubcellularLocationType)get_store().insert_element_user(SUBCELLULARLOCATION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subcellularLocation" element
     */
    public org.rostlab.predictprotein.SubcellularLocationType addNewSubcellularLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SubcellularLocationType target = null;
            target = (org.rostlab.predictprotein.SubcellularLocationType)get_store().add_element_user(SUBCELLULARLOCATION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "subcellularLocation" element
     */
    public void removeSubcellularLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCELLULARLOCATION$12, i);
        }
    }
    
    /**
     * Gets the "conflict" element
     */
    public org.rostlab.predictprotein.CommentType.Conflict getConflict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Conflict target = null;
            target = (org.rostlab.predictprotein.CommentType.Conflict)get_store().find_element_user(CONFLICT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conflict" element
     */
    public boolean isSetConflict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFLICT$14) != 0;
        }
    }
    
    /**
     * Sets the "conflict" element
     */
    public void setConflict(org.rostlab.predictprotein.CommentType.Conflict conflict)
    {
        generatedSetterHelperImpl(conflict, CONFLICT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conflict" element
     */
    public org.rostlab.predictprotein.CommentType.Conflict addNewConflict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Conflict target = null;
            target = (org.rostlab.predictprotein.CommentType.Conflict)get_store().add_element_user(CONFLICT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "conflict" element
     */
    public void unsetConflict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFLICT$14, 0);
        }
    }
    
    /**
     * Gets array of all "link" elements
     */
    public org.rostlab.predictprotein.CommentType.Link[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$16, targetList);
            org.rostlab.predictprotein.CommentType.Link[] result = new org.rostlab.predictprotein.CommentType.Link[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "link" element
     */
    public org.rostlab.predictprotein.CommentType.Link getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Link target = null;
            target = (org.rostlab.predictprotein.CommentType.Link)get_store().find_element_user(LINK$16, i);
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
            return get_store().count_elements(LINK$16);
        }
    }
    
    /**
     * Sets array of all "link" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkArray(org.rostlab.predictprotein.CommentType.Link[] linkArray)
    {
        check_orphaned();
        arraySetterHelper(linkArray, LINK$16);
    }
    
    /**
     * Sets ith "link" element
     */
    public void setLinkArray(int i, org.rostlab.predictprotein.CommentType.Link link)
    {
        generatedSetterHelperImpl(link, LINK$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    public org.rostlab.predictprotein.CommentType.Link insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Link target = null;
            target = (org.rostlab.predictprotein.CommentType.Link)get_store().insert_element_user(LINK$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    public org.rostlab.predictprotein.CommentType.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Link target = null;
            target = (org.rostlab.predictprotein.CommentType.Link)get_store().add_element_user(LINK$16);
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
            get_store().remove_element(LINK$16, i);
        }
    }
    
    /**
     * Gets array of all "event" elements
     */
    public org.rostlab.predictprotein.EventType[] getEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENT$18, targetList);
            org.rostlab.predictprotein.EventType[] result = new org.rostlab.predictprotein.EventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event" element
     */
    public org.rostlab.predictprotein.EventType getEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EventType target = null;
            target = (org.rostlab.predictprotein.EventType)get_store().find_element_user(EVENT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "event" element
     */
    public int sizeOfEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$18);
        }
    }
    
    /**
     * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEventArray(org.rostlab.predictprotein.EventType[] eventArray)
    {
        check_orphaned();
        arraySetterHelper(eventArray, EVENT$18);
    }
    
    /**
     * Sets ith "event" element
     */
    public void setEventArray(int i, org.rostlab.predictprotein.EventType event)
    {
        generatedSetterHelperImpl(event, EVENT$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event" element
     */
    public org.rostlab.predictprotein.EventType insertNewEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EventType target = null;
            target = (org.rostlab.predictprotein.EventType)get_store().insert_element_user(EVENT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event" element
     */
    public org.rostlab.predictprotein.EventType addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EventType target = null;
            target = (org.rostlab.predictprotein.EventType)get_store().add_element_user(EVENT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "event" element
     */
    public void removeEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$18, i);
        }
    }
    
    /**
     * Gets array of all "isoform" elements
     */
    public org.rostlab.predictprotein.IsoformType[] getIsoformArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISOFORM$20, targetList);
            org.rostlab.predictprotein.IsoformType[] result = new org.rostlab.predictprotein.IsoformType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "isoform" element
     */
    public org.rostlab.predictprotein.IsoformType getIsoformArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType target = null;
            target = (org.rostlab.predictprotein.IsoformType)get_store().find_element_user(ISOFORM$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "isoform" element
     */
    public int sizeOfIsoformArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISOFORM$20);
        }
    }
    
    /**
     * Sets array of all "isoform" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIsoformArray(org.rostlab.predictprotein.IsoformType[] isoformArray)
    {
        check_orphaned();
        arraySetterHelper(isoformArray, ISOFORM$20);
    }
    
    /**
     * Sets ith "isoform" element
     */
    public void setIsoformArray(int i, org.rostlab.predictprotein.IsoformType isoform)
    {
        generatedSetterHelperImpl(isoform, ISOFORM$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isoform" element
     */
    public org.rostlab.predictprotein.IsoformType insertNewIsoform(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType target = null;
            target = (org.rostlab.predictprotein.IsoformType)get_store().insert_element_user(ISOFORM$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isoform" element
     */
    public org.rostlab.predictprotein.IsoformType addNewIsoform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.IsoformType target = null;
            target = (org.rostlab.predictprotein.IsoformType)get_store().add_element_user(ISOFORM$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "isoform" element
     */
    public void removeIsoform(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISOFORM$20, i);
        }
    }
    
    /**
     * Gets array of all "interactant" elements
     */
    public org.rostlab.predictprotein.InteractantType[] getInteractantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERACTANT$22, targetList);
            org.rostlab.predictprotein.InteractantType[] result = new org.rostlab.predictprotein.InteractantType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interactant" element
     */
    public org.rostlab.predictprotein.InteractantType getInteractantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.InteractantType target = null;
            target = (org.rostlab.predictprotein.InteractantType)get_store().find_element_user(INTERACTANT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interactant" element
     */
    public int sizeOfInteractantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERACTANT$22);
        }
    }
    
    /**
     * Sets array of all "interactant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInteractantArray(org.rostlab.predictprotein.InteractantType[] interactantArray)
    {
        check_orphaned();
        arraySetterHelper(interactantArray, INTERACTANT$22);
    }
    
    /**
     * Sets ith "interactant" element
     */
    public void setInteractantArray(int i, org.rostlab.predictprotein.InteractantType interactant)
    {
        generatedSetterHelperImpl(interactant, INTERACTANT$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interactant" element
     */
    public org.rostlab.predictprotein.InteractantType insertNewInteractant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.InteractantType target = null;
            target = (org.rostlab.predictprotein.InteractantType)get_store().insert_element_user(INTERACTANT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interactant" element
     */
    public org.rostlab.predictprotein.InteractantType addNewInteractant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.InteractantType target = null;
            target = (org.rostlab.predictprotein.InteractantType)get_store().add_element_user(INTERACTANT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "interactant" element
     */
    public void removeInteractant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERACTANT$22, i);
        }
    }
    
    /**
     * Gets the "organismsDiffer" element
     */
    public boolean getOrganismsDiffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISMSDIFFER$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "organismsDiffer" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrganismsDiffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORGANISMSDIFFER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "organismsDiffer" element
     */
    public boolean isSetOrganismsDiffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISMSDIFFER$24) != 0;
        }
    }
    
    /**
     * Sets the "organismsDiffer" element
     */
    public void setOrganismsDiffer(boolean organismsDiffer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISMSDIFFER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISMSDIFFER$24);
            }
            target.setBooleanValue(organismsDiffer);
        }
    }
    
    /**
     * Sets (as xml) the "organismsDiffer" element
     */
    public void xsetOrganismsDiffer(org.apache.xmlbeans.XmlBoolean organismsDiffer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORGANISMSDIFFER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORGANISMSDIFFER$24);
            }
            target.set(organismsDiffer);
        }
    }
    
    /**
     * Unsets the "organismsDiffer" element
     */
    public void unsetOrganismsDiffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISMSDIFFER$24, 0);
        }
    }
    
    /**
     * Gets the "experiments" element
     */
    public java.math.BigInteger getExperiments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPERIMENTS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "experiments" element
     */
    public org.apache.xmlbeans.XmlInteger xgetExperiments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXPERIMENTS$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "experiments" element
     */
    public boolean isSetExperiments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPERIMENTS$26) != 0;
        }
    }
    
    /**
     * Sets the "experiments" element
     */
    public void setExperiments(java.math.BigInteger experiments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPERIMENTS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPERIMENTS$26);
            }
            target.setBigIntegerValue(experiments);
        }
    }
    
    /**
     * Sets (as xml) the "experiments" element
     */
    public void xsetExperiments(org.apache.xmlbeans.XmlInteger experiments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXPERIMENTS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EXPERIMENTS$26);
            }
            target.set(experiments);
        }
    }
    
    /**
     * Unsets the "experiments" element
     */
    public void unsetExperiments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPERIMENTS$26, 0);
        }
    }
    
    /**
     * Gets array of all "location" elements
     */
    public org.rostlab.predictprotein.LocationType[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$28, targetList);
            org.rostlab.predictprotein.LocationType[] result = new org.rostlab.predictprotein.LocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.rostlab.predictprotein.LocationType getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().find_element_user(LOCATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$28);
        }
    }
    
    /**
     * Sets array of all "location" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocationArray(org.rostlab.predictprotein.LocationType[] locationArray)
    {
        check_orphaned();
        arraySetterHelper(locationArray, LOCATION$28);
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.rostlab.predictprotein.LocationType location)
    {
        generatedSetterHelperImpl(location, LOCATION$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public org.rostlab.predictprotein.LocationType insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().insert_element_user(LOCATION$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.rostlab.predictprotein.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().add_element_user(LOCATION$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$28, i);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(TEXT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$30) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.rostlab.predictprotein.EvidencedStringType text)
    {
        generatedSetterHelperImpl(text, TEXT$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(TEXT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$32);
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
            return get_store().find_attribute_user(NAME$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$32);
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
            get_store().remove_attribute(NAME$32);
        }
    }
    
    /**
     * Gets the "mass" attribute
     */
    public float getMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASS$34);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "mass" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(MASS$34);
            return target;
        }
    }
    
    /**
     * True if has "mass" attribute
     */
    public boolean isSetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MASS$34) != null;
        }
    }
    
    /**
     * Sets the "mass" attribute
     */
    public void setMass(float mass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASS$34);
            }
            target.setFloatValue(mass);
        }
    }
    
    /**
     * Sets (as xml) the "mass" attribute
     */
    public void xsetMass(org.apache.xmlbeans.XmlFloat mass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(MASS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(MASS$34);
            }
            target.set(mass);
        }
    }
    
    /**
     * Unsets the "mass" attribute
     */
    public void unsetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MASS$34);
        }
    }
    
    /**
     * Gets the "error" attribute
     */
    public java.lang.String getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERROR$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "error" attribute
     */
    public org.apache.xmlbeans.XmlString xgetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERROR$36);
            return target;
        }
    }
    
    /**
     * True if has "error" attribute
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERROR$36) != null;
        }
    }
    
    /**
     * Sets the "error" attribute
     */
    public void setError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERROR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERROR$36);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "error" attribute
     */
    public void xsetError(org.apache.xmlbeans.XmlString error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERROR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERROR$36);
            }
            target.set(error);
        }
    }
    
    /**
     * Unsets the "error" attribute
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERROR$36);
        }
    }
    
    /**
     * Gets the "method" attribute
     */
    public java.lang.String getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$38);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$38);
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$38) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(java.lang.String method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$38);
            }
            target.setStringValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(org.apache.xmlbeans.XmlString method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$38);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$38);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.rostlab.predictprotein.CommentType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$40);
            if (target == null)
            {
                return null;
            }
            return (org.rostlab.predictprotein.CommentType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.rostlab.predictprotein.CommentType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Type target = null;
            target = (org.rostlab.predictprotein.CommentType.Type)get_store().find_attribute_user(TYPE$40);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.rostlab.predictprotein.CommentType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$40);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.rostlab.predictprotein.CommentType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.CommentType.Type target = null;
            target = (org.rostlab.predictprotein.CommentType.Type)get_store().find_attribute_user(TYPE$40);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.CommentType.Type)get_store().add_attribute_user(TYPE$40);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$42);
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
            return get_store().find_attribute_user(EVIDENCE$42) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVIDENCE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVIDENCE$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVIDENCE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVIDENCE$42);
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
            get_store().remove_attribute(EVIDENCE$42);
        }
    }
    /**
     * An XML absorption(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class AbsorptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CommentType.Absorption
    {
        private static final long serialVersionUID = 1L;
        
        public AbsorptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAX$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "max");
        private static final javax.xml.namespace.QName TEXT$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "text");
        
        
        /**
         * Gets the "max" element
         */
        public java.lang.String getMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "max" element
         */
        public org.apache.xmlbeans.XmlString xgetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAX$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "max" element
         */
        public boolean isSetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAX$0) != 0;
            }
        }
        
        /**
         * Sets the "max" element
         */
        public void setMax(java.lang.String max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAX$0);
                }
                target.setStringValue(max);
            }
        }
        
        /**
         * Sets (as xml) the "max" element
         */
        public void xsetMax(org.apache.xmlbeans.XmlString max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAX$0);
                }
                target.set(max);
            }
        }
        
        /**
         * Unsets the "max" element
         */
        public void unsetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAX$0, 0);
            }
        }
        
        /**
         * Gets the "text" element
         */
        public java.lang.String getText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text" element
         */
        public org.apache.xmlbeans.XmlString xgetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "text" element
         */
        public boolean isSetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$2) != 0;
            }
        }
        
        /**
         * Sets the "text" element
         */
        public void setText(java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$2);
                }
                target.setStringValue(text);
            }
        }
        
        /**
         * Sets (as xml) the "text" element
         */
        public void xsetText(org.apache.xmlbeans.XmlString text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$2);
                }
                target.set(text);
            }
        }
        
        /**
         * Unsets the "text" element
         */
        public void unsetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$2, 0);
            }
        }
    }
    /**
     * An XML kinetics(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class KineticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CommentType.Kinetics
    {
        private static final long serialVersionUID = 1L;
        
        public KineticsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KM$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "KM");
        private static final javax.xml.namespace.QName VMAX$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "Vmax");
        private static final javax.xml.namespace.QName TEXT$4 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "text");
        
        
        /**
         * Gets array of all "KM" elements
         */
        public java.lang.String[] getKMArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KM$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "KM" element
         */
        public java.lang.String getKMArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "KM" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetKMArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KM$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "KM" element
         */
        public org.apache.xmlbeans.XmlString xgetKMArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "KM" element
         */
        public int sizeOfKMArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KM$0);
            }
        }
        
        /**
         * Sets array of all "KM" element
         */
        public void setKMArray(java.lang.String[] kmArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(kmArray, KM$0);
            }
        }
        
        /**
         * Sets ith "KM" element
         */
        public void setKMArray(int i, java.lang.String km)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(km);
            }
        }
        
        /**
         * Sets (as xml) array of all "KM" element
         */
        public void xsetKMArray(org.apache.xmlbeans.XmlString[]kmArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(kmArray, KM$0);
            }
        }
        
        /**
         * Sets (as xml) ith "KM" element
         */
        public void xsetKMArray(int i, org.apache.xmlbeans.XmlString km)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(km);
            }
        }
        
        /**
         * Inserts the value as the ith "KM" element
         */
        public void insertKM(int i, java.lang.String km)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KM$0, i);
                target.setStringValue(km);
            }
        }
        
        /**
         * Appends the value as the last "KM" element
         */
        public void addKM(java.lang.String km)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KM$0);
                target.setStringValue(km);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "KM" element
         */
        public org.apache.xmlbeans.XmlString insertNewKM(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "KM" element
         */
        public org.apache.xmlbeans.XmlString addNewKM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "KM" element
         */
        public void removeKM(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KM$0, i);
            }
        }
        
        /**
         * Gets array of all "Vmax" elements
         */
        public java.lang.String[] getVmaxArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VMAX$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Vmax" element
         */
        public java.lang.String getVmaxArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VMAX$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "Vmax" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetVmaxArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VMAX$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Vmax" element
         */
        public org.apache.xmlbeans.XmlString xgetVmaxArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VMAX$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Vmax" element
         */
        public int sizeOfVmaxArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VMAX$2);
            }
        }
        
        /**
         * Sets array of all "Vmax" element
         */
        public void setVmaxArray(java.lang.String[] vmaxArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(vmaxArray, VMAX$2);
            }
        }
        
        /**
         * Sets ith "Vmax" element
         */
        public void setVmaxArray(int i, java.lang.String vmax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VMAX$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(vmax);
            }
        }
        
        /**
         * Sets (as xml) array of all "Vmax" element
         */
        public void xsetVmaxArray(org.apache.xmlbeans.XmlString[]vmaxArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(vmaxArray, VMAX$2);
            }
        }
        
        /**
         * Sets (as xml) ith "Vmax" element
         */
        public void xsetVmaxArray(int i, org.apache.xmlbeans.XmlString vmax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VMAX$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(vmax);
            }
        }
        
        /**
         * Inserts the value as the ith "Vmax" element
         */
        public void insertVmax(int i, java.lang.String vmax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VMAX$2, i);
                target.setStringValue(vmax);
            }
        }
        
        /**
         * Appends the value as the last "Vmax" element
         */
        public void addVmax(java.lang.String vmax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VMAX$2);
                target.setStringValue(vmax);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Vmax" element
         */
        public org.apache.xmlbeans.XmlString insertNewVmax(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VMAX$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Vmax" element
         */
        public org.apache.xmlbeans.XmlString addNewVmax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VMAX$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Vmax" element
         */
        public void removeVmax(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VMAX$2, i);
            }
        }
        
        /**
         * Gets the "text" element
         */
        public java.lang.String getText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text" element
         */
        public org.apache.xmlbeans.XmlString xgetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "text" element
         */
        public boolean isSetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXT$4) != 0;
            }
        }
        
        /**
         * Sets the "text" element
         */
        public void setText(java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$4);
                }
                target.setStringValue(text);
            }
        }
        
        /**
         * Sets (as xml) the "text" element
         */
        public void xsetText(org.apache.xmlbeans.XmlString text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$4);
                }
                target.set(text);
            }
        }
        
        /**
         * Unsets the "text" element
         */
        public void unsetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXT$4, 0);
            }
        }
    }
    /**
     * An XML conflict(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class ConflictImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CommentType.Conflict
    {
        private static final long serialVersionUID = 1L;
        
        public ConflictImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQUENCE$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "sequence");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName REF$4 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "sequence" element
         */
        public org.rostlab.predictprotein.CommentType.Conflict.Sequence getSequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType.Conflict.Sequence target = null;
                target = (org.rostlab.predictprotein.CommentType.Conflict.Sequence)get_store().find_element_user(SEQUENCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sequence" element
         */
        public boolean isSetSequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQUENCE$0) != 0;
            }
        }
        
        /**
         * Sets the "sequence" element
         */
        public void setSequence(org.rostlab.predictprotein.CommentType.Conflict.Sequence sequence)
        {
            generatedSetterHelperImpl(sequence, SEQUENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "sequence" element
         */
        public org.rostlab.predictprotein.CommentType.Conflict.Sequence addNewSequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType.Conflict.Sequence target = null;
                target = (org.rostlab.predictprotein.CommentType.Conflict.Sequence)get_store().add_element_user(SEQUENCE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "sequence" element
         */
        public void unsetSequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQUENCE$0, 0);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public org.rostlab.predictprotein.CommentType.Conflict.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (org.rostlab.predictprotein.CommentType.Conflict.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.rostlab.predictprotein.CommentType.Conflict.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType.Conflict.Type target = null;
                target = (org.rostlab.predictprotein.CommentType.Conflict.Type)get_store().find_attribute_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(org.rostlab.predictprotein.CommentType.Conflict.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.rostlab.predictprotein.CommentType.Conflict.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType.Conflict.Type target = null;
                target = (org.rostlab.predictprotein.CommentType.Conflict.Type)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.rostlab.predictprotein.CommentType.Conflict.Type)get_store().add_attribute_user(TYPE$2);
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
        /**
         * An XML sequence(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class SequenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CommentType.Conflict.Sequence
        {
            private static final long serialVersionUID = 1L;
            
            public SequenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESOURCE$0 = 
                new javax.xml.namespace.QName("", "resource");
            private static final javax.xml.namespace.QName ID$2 = 
                new javax.xml.namespace.QName("", "id");
            private static final javax.xml.namespace.QName VERSION$4 = 
                new javax.xml.namespace.QName("", "version");
            
            
            /**
             * Gets the "resource" attribute
             */
            public org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource.Enum getResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "resource" attribute
             */
            public org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource xgetResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource target = null;
                    target = (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource)get_store().find_attribute_user(RESOURCE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "resource" attribute
             */
            public void setResource(org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource.Enum resource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCE$0);
                    }
                    target.setEnumValue(resource);
                }
            }
            
            /**
             * Sets (as xml) the "resource" attribute
             */
            public void xsetResource(org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource resource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource target = null;
                    target = (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource)get_store().find_attribute_user(RESOURCE$0);
                    if (target == null)
                    {
                      target = (org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource)get_store().add_attribute_user(RESOURCE$0);
                    }
                    target.set(resource);
                }
            }
            
            /**
             * Gets the "id" attribute
             */
            public java.lang.String getId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "id" attribute
             */
            public org.apache.xmlbeans.XmlString xgetId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                    return target;
                }
            }
            
            /**
             * Sets the "id" attribute
             */
            public void setId(java.lang.String id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
                    }
                    target.setStringValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "id" attribute
             */
            public void xsetId(org.apache.xmlbeans.XmlString id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
                    }
                    target.set(id);
                }
            }
            
            /**
             * Gets the "version" attribute
             */
            public java.math.BigInteger getVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "version" attribute
             */
            public org.apache.xmlbeans.XmlInteger xgetVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSION$4);
                    return target;
                }
            }
            
            /**
             * True if has "version" attribute
             */
            public boolean isSetVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VERSION$4) != null;
                }
            }
            
            /**
             * Sets the "version" attribute
             */
            public void setVersion(java.math.BigInteger version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
                    }
                    target.setBigIntegerValue(version);
                }
            }
            
            /**
             * Sets (as xml) the "version" attribute
             */
            public void xsetVersion(org.apache.xmlbeans.XmlInteger version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSION$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VERSION$4);
                    }
                    target.set(version);
                }
            }
            
            /**
             * Unsets the "version" attribute
             */
            public void unsetVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VERSION$4);
                }
            }
            /**
             * An XML resource(@).
             *
             * This is an atomic type that is a restriction of org.rostlab.predictprotein.CommentType$Conflict$Sequence$Resource.
             */
            public static class ResourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.CommentType.Conflict.Sequence.Resource
            {
                private static final long serialVersionUID = 1L;
                
                public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ResourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of org.rostlab.predictprotein.CommentType$Conflict$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.CommentType.Conflict.Type
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
     * An XML link(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class LinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.CommentType.Link
    {
        private static final long serialVersionUID = 1L;
        
        public LinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
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
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.CommentType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.CommentType.Type
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
