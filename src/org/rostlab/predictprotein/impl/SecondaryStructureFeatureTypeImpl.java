/*
 * XML Type:  secondaryStructureFeatureType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.SecondaryStructureFeatureType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML secondaryStructureFeatureType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class SecondaryStructureFeatureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.SecondaryStructureFeatureType
{
    private static final long serialVersionUID = 1L;
    
    public SecondaryStructureFeatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "location");
    private static final javax.xml.namespace.QName FEATURESTRING$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "featureString");
    private static final javax.xml.namespace.QName RELIABILITY$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "reliability");
    
    
    /**
     * Gets the "location" element
     */
    public org.rostlab.predictprotein.LocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.rostlab.predictprotein.LocationType location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.rostlab.predictprotein.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.LocationType target = null;
            target = (org.rostlab.predictprotein.LocationType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "featureString" element
     */
    public java.lang.String getFeatureString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURESTRING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featureString" element
     */
    public org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString xgetFeatureString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString)get_store().find_element_user(FEATURESTRING$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "featureString" element
     */
    public void setFeatureString(java.lang.String featureString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURESTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURESTRING$2);
            }
            target.setStringValue(featureString);
        }
    }
    
    /**
     * Sets (as xml) the "featureString" element
     */
    public void xsetFeatureString(org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString featureString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString)get_store().find_element_user(FEATURESTRING$2, 0);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString)get_store().add_element_user(FEATURESTRING$2);
            }
            target.set(featureString);
        }
    }
    
    /**
     * Gets the "reliability" element
     */
    public java.lang.String getReliability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reliability" element
     */
    public org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability xgetReliability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability)get_store().find_element_user(RELIABILITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reliability" element
     */
    public void setReliability(java.lang.String reliability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELIABILITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELIABILITY$4);
            }
            target.setStringValue(reliability);
        }
    }
    
    /**
     * Sets (as xml) the "reliability" element
     */
    public void xsetReliability(org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability reliability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability target = null;
            target = (org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability)get_store().find_element_user(RELIABILITY$4, 0);
            if (target == null)
            {
                target = (org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability)get_store().add_element_user(RELIABILITY$4);
            }
            target.set(reliability);
        }
    }
    /**
     * An XML featureString(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SecondaryStructureFeatureType$FeatureString.
     */
    public static class FeatureStringImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SecondaryStructureFeatureType.FeatureString
    {
        private static final long serialVersionUID = 1L;
        
        public FeatureStringImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FeatureStringImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML reliability(@http://rostlab.org/predictprotein).
     *
     * This is an atomic type that is a restriction of org.rostlab.predictprotein.SecondaryStructureFeatureType$Reliability.
     */
    public static class ReliabilityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.rostlab.predictprotein.SecondaryStructureFeatureType.Reliability
    {
        private static final long serialVersionUID = 1L;
        
        public ReliabilityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ReliabilityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
