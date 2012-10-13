/*
 * XML Type:  subcellularLocationType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SubcellularLocationType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML subcellularLocationType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class SubcellularLocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.SubcellularLocationType
{
    private static final long serialVersionUID = 1L;
    
    public SubcellularLocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "location");
    private static final javax.xml.namespace.QName TOPOLOGY$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "topology");
    private static final javax.xml.namespace.QName ORIENTATION$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "orientation");
    
    
    /**
     * Gets array of all "location" elements
     */
    public org.rostlab.predictprotein.EvidencedStringType[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$0, targetList);
            org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(LOCATION$0, i);
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
            return get_store().count_elements(LOCATION$0);
        }
    }
    
    /**
     * Sets array of all "location" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocationArray(org.rostlab.predictprotein.EvidencedStringType[] locationArray)
    {
        check_orphaned();
        arraySetterHelper(locationArray, LOCATION$0);
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.rostlab.predictprotein.EvidencedStringType location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public org.rostlab.predictprotein.EvidencedStringType insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(LOCATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(LOCATION$0);
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
            get_store().remove_element(LOCATION$0, i);
        }
    }
    
    /**
     * Gets array of all "topology" elements
     */
    public org.rostlab.predictprotein.EvidencedStringType[] getTopologyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOPOLOGY$2, targetList);
            org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "topology" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getTopologyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(TOPOLOGY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "topology" element
     */
    public int sizeOfTopologyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOLOGY$2);
        }
    }
    
    /**
     * Sets array of all "topology" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTopologyArray(org.rostlab.predictprotein.EvidencedStringType[] topologyArray)
    {
        check_orphaned();
        arraySetterHelper(topologyArray, TOPOLOGY$2);
    }
    
    /**
     * Sets ith "topology" element
     */
    public void setTopologyArray(int i, org.rostlab.predictprotein.EvidencedStringType topology)
    {
        generatedSetterHelperImpl(topology, TOPOLOGY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topology" element
     */
    public org.rostlab.predictprotein.EvidencedStringType insertNewTopology(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(TOPOLOGY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topology" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewTopology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(TOPOLOGY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "topology" element
     */
    public void removeTopology(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOLOGY$2, i);
        }
    }
    
    /**
     * Gets array of all "orientation" elements
     */
    public org.rostlab.predictprotein.EvidencedStringType[] getOrientationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORIENTATION$4, targetList);
            org.rostlab.predictprotein.EvidencedStringType[] result = new org.rostlab.predictprotein.EvidencedStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "orientation" element
     */
    public org.rostlab.predictprotein.EvidencedStringType getOrientationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().find_element_user(ORIENTATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "orientation" element
     */
    public int sizeOfOrientationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIENTATION$4);
        }
    }
    
    /**
     * Sets array of all "orientation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrientationArray(org.rostlab.predictprotein.EvidencedStringType[] orientationArray)
    {
        check_orphaned();
        arraySetterHelper(orientationArray, ORIENTATION$4);
    }
    
    /**
     * Sets ith "orientation" element
     */
    public void setOrientationArray(int i, org.rostlab.predictprotein.EvidencedStringType orientation)
    {
        generatedSetterHelperImpl(orientation, ORIENTATION$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "orientation" element
     */
    public org.rostlab.predictprotein.EvidencedStringType insertNewOrientation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().insert_element_user(ORIENTATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "orientation" element
     */
    public org.rostlab.predictprotein.EvidencedStringType addNewOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EvidencedStringType target = null;
            target = (org.rostlab.predictprotein.EvidencedStringType)get_store().add_element_user(ORIENTATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "orientation" element
     */
    public void removeOrientation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIENTATION$4, i);
        }
    }
}
