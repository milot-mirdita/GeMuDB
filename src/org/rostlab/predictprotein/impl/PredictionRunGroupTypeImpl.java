/*
 * XML Type:  predictionRunGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PredictionRunGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML predictionRunGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class PredictionRunGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.PredictionRunGroupType
{
    private static final long serialVersionUID = 1L;
    
    public PredictionRunGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREDRUNASP$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predRunASP");
    private static final javax.xml.namespace.QName PREDRUNGLOBE$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predRunGLOBE");
    private static final javax.xml.namespace.QName PREDRUNPROFTMB$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predRunProfTMB");
    
    
    /**
     * Gets array of all "predRunASP" elements
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP[] getPredRunASPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREDRUNASP$0, targetList);
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP[] result = new org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "predRunASP" element
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP getPredRunASPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP target = null;
            target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP)get_store().find_element_user(PREDRUNASP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "predRunASP" element
     */
    public int sizeOfPredRunASPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREDRUNASP$0);
        }
    }
    
    /**
     * Sets array of all "predRunASP" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPredRunASPArray(org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP[] predRunASPArray)
    {
        check_orphaned();
        arraySetterHelper(predRunASPArray, PREDRUNASP$0);
    }
    
    /**
     * Sets ith "predRunASP" element
     */
    public void setPredRunASPArray(int i, org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP predRunASP)
    {
        generatedSetterHelperImpl(predRunASP, PREDRUNASP$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "predRunASP" element
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP insertNewPredRunASP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP target = null;
            target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP)get_store().insert_element_user(PREDRUNASP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "predRunASP" element
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP addNewPredRunASP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP target = null;
            target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP)get_store().add_element_user(PREDRUNASP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "predRunASP" element
     */
    public void removePredRunASP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREDRUNASP$0, i);
        }
    }
    
    /**
     * Gets array of all "predRunGLOBE" elements
     */
    public org.rostlab.predictprotein.PredictionRunType[] getPredRunGLOBEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREDRUNGLOBE$2, targetList);
            org.rostlab.predictprotein.PredictionRunType[] result = new org.rostlab.predictprotein.PredictionRunType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "predRunGLOBE" element
     */
    public org.rostlab.predictprotein.PredictionRunType getPredRunGLOBEArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunType target = null;
            target = (org.rostlab.predictprotein.PredictionRunType)get_store().find_element_user(PREDRUNGLOBE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "predRunGLOBE" element
     */
    public int sizeOfPredRunGLOBEArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREDRUNGLOBE$2);
        }
    }
    
    /**
     * Sets array of all "predRunGLOBE" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPredRunGLOBEArray(org.rostlab.predictprotein.PredictionRunType[] predRunGLOBEArray)
    {
        check_orphaned();
        arraySetterHelper(predRunGLOBEArray, PREDRUNGLOBE$2);
    }
    
    /**
     * Sets ith "predRunGLOBE" element
     */
    public void setPredRunGLOBEArray(int i, org.rostlab.predictprotein.PredictionRunType predRunGLOBE)
    {
        generatedSetterHelperImpl(predRunGLOBE, PREDRUNGLOBE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "predRunGLOBE" element
     */
    public org.rostlab.predictprotein.PredictionRunType insertNewPredRunGLOBE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunType target = null;
            target = (org.rostlab.predictprotein.PredictionRunType)get_store().insert_element_user(PREDRUNGLOBE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "predRunGLOBE" element
     */
    public org.rostlab.predictprotein.PredictionRunType addNewPredRunGLOBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunType target = null;
            target = (org.rostlab.predictprotein.PredictionRunType)get_store().add_element_user(PREDRUNGLOBE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "predRunGLOBE" element
     */
    public void removePredRunGLOBE(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREDRUNGLOBE$2, i);
        }
    }
    
    /**
     * Gets array of all "predRunProfTMB" elements
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB[] getPredRunProfTMBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREDRUNPROFTMB$4, targetList);
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB[] result = new org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "predRunProfTMB" element
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB getPredRunProfTMBArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB target = null;
            target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB)get_store().find_element_user(PREDRUNPROFTMB$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "predRunProfTMB" element
     */
    public int sizeOfPredRunProfTMBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREDRUNPROFTMB$4);
        }
    }
    
    /**
     * Sets array of all "predRunProfTMB" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPredRunProfTMBArray(org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB[] predRunProfTMBArray)
    {
        check_orphaned();
        arraySetterHelper(predRunProfTMBArray, PREDRUNPROFTMB$4);
    }
    
    /**
     * Sets ith "predRunProfTMB" element
     */
    public void setPredRunProfTMBArray(int i, org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB predRunProfTMB)
    {
        generatedSetterHelperImpl(predRunProfTMB, PREDRUNPROFTMB$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "predRunProfTMB" element
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB insertNewPredRunProfTMB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB target = null;
            target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB)get_store().insert_element_user(PREDRUNPROFTMB$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "predRunProfTMB" element
     */
    public org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB addNewPredRunProfTMB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB target = null;
            target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB)get_store().add_element_user(PREDRUNPROFTMB$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "predRunProfTMB" element
     */
    public void removePredRunProfTMB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREDRUNPROFTMB$4, i);
        }
    }
    /**
     * An XML predRunASP(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class PredRunASPImpl extends org.rostlab.predictprotein.impl.PredictionRunTypeImpl implements org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP
    {
        private static final long serialVersionUID = 1L;
        
        public PredRunASPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMETERS$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "parameters");
        private static final javax.xml.namespace.QName MEANDPRSCORE$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "meanDprScore");
        private static final javax.xml.namespace.QName DPRSTDDEV$4 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "dprStdDev");
        
        
        /**
         * Gets the "parameters" element
         */
        public org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters getParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters target = null;
                target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "parameters" element
         */
        public boolean isSetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMETERS$0) != 0;
            }
        }
        
        /**
         * Sets the "parameters" element
         */
        public void setParameters(org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters parameters)
        {
            generatedSetterHelperImpl(parameters, PARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "parameters" element
         */
        public org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters addNewParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters target = null;
                target = (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters)get_store().add_element_user(PARAMETERS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "parameters" element
         */
        public void unsetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMETERS$0, 0);
            }
        }
        
        /**
         * Gets the "meanDprScore" element
         */
        public org.rostlab.predictprotein.ReqFloatValueType getMeanDprScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReqFloatValueType target = null;
                target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(MEANDPRSCORE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "meanDprScore" element
         */
        public boolean isSetMeanDprScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEANDPRSCORE$2) != 0;
            }
        }
        
        /**
         * Sets the "meanDprScore" element
         */
        public void setMeanDprScore(org.rostlab.predictprotein.ReqFloatValueType meanDprScore)
        {
            generatedSetterHelperImpl(meanDprScore, MEANDPRSCORE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "meanDprScore" element
         */
        public org.rostlab.predictprotein.ReqFloatValueType addNewMeanDprScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReqFloatValueType target = null;
                target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(MEANDPRSCORE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "meanDprScore" element
         */
        public void unsetMeanDprScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEANDPRSCORE$2, 0);
            }
        }
        
        /**
         * Gets the "dprStdDev" element
         */
        public org.rostlab.predictprotein.ReqFloatValueType getDprStdDev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReqFloatValueType target = null;
                target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(DPRSTDDEV$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dprStdDev" element
         */
        public boolean isSetDprStdDev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DPRSTDDEV$4) != 0;
            }
        }
        
        /**
         * Sets the "dprStdDev" element
         */
        public void setDprStdDev(org.rostlab.predictprotein.ReqFloatValueType dprStdDev)
        {
            generatedSetterHelperImpl(dprStdDev, DPRSTDDEV$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "dprStdDev" element
         */
        public org.rostlab.predictprotein.ReqFloatValueType addNewDprStdDev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReqFloatValueType target = null;
                target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(DPRSTDDEV$4);
                return target;
            }
        }
        
        /**
         * Unsets the "dprStdDev" element
         */
        public void unsetDprStdDev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DPRSTDDEV$4, 0);
            }
        }
        /**
         * An XML parameters(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters
        {
            private static final long serialVersionUID = 1L;
            
            public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName WINDOW$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "window");
            private static final javax.xml.namespace.QName MINMUDPR$2 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "minMuDpr");
            private static final javax.xml.namespace.QName ZSCORECUTOFF$4 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "zScoreCutoff");
            
            
            /**
             * Gets the "window" element
             */
            public org.rostlab.predictprotein.ReqPositiveIntValueType getWindow()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.ReqPositiveIntValueType target = null;
                    target = (org.rostlab.predictprotein.ReqPositiveIntValueType)get_store().find_element_user(WINDOW$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "window" element
             */
            public void setWindow(org.rostlab.predictprotein.ReqPositiveIntValueType window)
            {
                generatedSetterHelperImpl(window, WINDOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "window" element
             */
            public org.rostlab.predictprotein.ReqPositiveIntValueType addNewWindow()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.ReqPositiveIntValueType target = null;
                    target = (org.rostlab.predictprotein.ReqPositiveIntValueType)get_store().add_element_user(WINDOW$0);
                    return target;
                }
            }
            
            /**
             * Gets the "minMuDpr" element
             */
            public org.rostlab.predictprotein.ReqPositiveIntValueType getMinMuDpr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.ReqPositiveIntValueType target = null;
                    target = (org.rostlab.predictprotein.ReqPositiveIntValueType)get_store().find_element_user(MINMUDPR$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "minMuDpr" element
             */
            public void setMinMuDpr(org.rostlab.predictprotein.ReqPositiveIntValueType minMuDpr)
            {
                generatedSetterHelperImpl(minMuDpr, MINMUDPR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "minMuDpr" element
             */
            public org.rostlab.predictprotein.ReqPositiveIntValueType addNewMinMuDpr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.ReqPositiveIntValueType target = null;
                    target = (org.rostlab.predictprotein.ReqPositiveIntValueType)get_store().add_element_user(MINMUDPR$2);
                    return target;
                }
            }
            
            /**
             * Gets the "zScoreCutoff" element
             */
            public org.rostlab.predictprotein.ReqFloatValueType getZScoreCutoff()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.ReqFloatValueType target = null;
                    target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(ZSCORECUTOFF$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "zScoreCutoff" element
             */
            public void setZScoreCutoff(org.rostlab.predictprotein.ReqFloatValueType zScoreCutoff)
            {
                generatedSetterHelperImpl(zScoreCutoff, ZSCORECUTOFF$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "zScoreCutoff" element
             */
            public org.rostlab.predictprotein.ReqFloatValueType addNewZScoreCutoff()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.ReqFloatValueType target = null;
                    target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(ZSCORECUTOFF$4);
                    return target;
                }
            }
        }
    }
    /**
     * An XML predRunProfTMB(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class PredRunProfTMBImpl extends org.rostlab.predictprotein.impl.PredictionRunTypeImpl implements org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB
    {
        private static final long serialVersionUID = 1L;
        
        public PredRunProfTMBImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ZSCORE$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "zScore");
        
        
        /**
         * Gets the "zScore" element
         */
        public org.rostlab.predictprotein.ReqFloatValueType getZScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReqFloatValueType target = null;
                target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(ZSCORE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "zScore" element
         */
        public void setZScore(org.rostlab.predictprotein.ReqFloatValueType zScore)
        {
            generatedSetterHelperImpl(zScore, ZSCORE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "zScore" element
         */
        public org.rostlab.predictprotein.ReqFloatValueType addNewZScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReqFloatValueType target = null;
                target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(ZSCORE$0);
                return target;
            }
        }
    }
}
