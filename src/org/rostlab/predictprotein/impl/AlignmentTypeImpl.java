/*
 * XML Type:  alignmentType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.AlignmentType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * An XML alignmentType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public class AlignmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.AlignmentType
{
    private static final long serialVersionUID = 1L;
    
    public AlignmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBREFERENCE$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "dbReference");
    private static final javax.xml.namespace.QName SCORE$2 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "score");
    private static final javax.xml.namespace.QName BITSCORE$4 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "bitscore");
    private static final javax.xml.namespace.QName EXPECT$6 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "expect");
    private static final javax.xml.namespace.QName IDENTITY$8 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "identity");
    private static final javax.xml.namespace.QName MATCHLEN$10 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "matchLen");
    private static final javax.xml.namespace.QName QUERYSTART$12 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "queryStart");
    private static final javax.xml.namespace.QName QUERYEND$14 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "queryEnd");
    private static final javax.xml.namespace.QName SUBJECTSTART$16 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "subjectStart");
    private static final javax.xml.namespace.QName SUBJECTEND$18 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "subjectEnd");
    private static final javax.xml.namespace.QName QUERYSEQ$20 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "querySeq");
    private static final javax.xml.namespace.QName SUBJECTSEQ$22 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "subjectSeq");
    
    
    /**
     * Gets the "dbReference" element
     */
    public org.rostlab.predictprotein.DbReferenceType getDbReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DbReferenceType target = null;
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().find_element_user(DBREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dbReference" element
     */
    public void setDbReference(org.rostlab.predictprotein.DbReferenceType dbReference)
    {
        generatedSetterHelperImpl(dbReference, DBREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dbReference" element
     */
    public org.rostlab.predictprotein.DbReferenceType addNewDbReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.DbReferenceType target = null;
            target = (org.rostlab.predictprotein.DbReferenceType)get_store().add_element_user(DBREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "score" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "score" element
     */
    public boolean isSetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORE$2) != 0;
        }
    }
    
    /**
     * Sets the "score" element
     */
    public void setScore(org.rostlab.predictprotein.ReqFloatValueType score)
    {
        generatedSetterHelperImpl(score, SCORE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "score" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType addNewScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(SCORE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "score" element
     */
    public void unsetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORE$2, 0);
        }
    }
    
    /**
     * Gets the "bitscore" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType getBitscore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(BITSCORE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bitscore" element
     */
    public boolean isSetBitscore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BITSCORE$4) != 0;
        }
    }
    
    /**
     * Sets the "bitscore" element
     */
    public void setBitscore(org.rostlab.predictprotein.ReqFloatValueType bitscore)
    {
        generatedSetterHelperImpl(bitscore, BITSCORE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bitscore" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType addNewBitscore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(BITSCORE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bitscore" element
     */
    public void unsetBitscore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BITSCORE$4, 0);
        }
    }
    
    /**
     * Gets the "expect" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType getExpect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(EXPECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expect" element
     */
    public boolean isSetExpect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECT$6) != 0;
        }
    }
    
    /**
     * Sets the "expect" element
     */
    public void setExpect(org.rostlab.predictprotein.ReqFloatValueType expect)
    {
        generatedSetterHelperImpl(expect, EXPECT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expect" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType addNewExpect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(EXPECT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "expect" element
     */
    public void unsetExpect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECT$6, 0);
        }
    }
    
    /**
     * Gets the "identity" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType getIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().find_element_user(IDENTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identity" element
     */
    public void setIdentity(org.rostlab.predictprotein.ReqFloatValueType identity)
    {
        generatedSetterHelperImpl(identity, IDENTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identity" element
     */
    public org.rostlab.predictprotein.ReqFloatValueType addNewIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqFloatValueType target = null;
            target = (org.rostlab.predictprotein.ReqFloatValueType)get_store().add_element_user(IDENTITY$8);
            return target;
        }
    }
    
    /**
     * Gets the "matchLen" element
     */
    public org.rostlab.predictprotein.ReqIntValueType getMatchLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().find_element_user(MATCHLEN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "matchLen" element
     */
    public void setMatchLen(org.rostlab.predictprotein.ReqIntValueType matchLen)
    {
        generatedSetterHelperImpl(matchLen, MATCHLEN$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "matchLen" element
     */
    public org.rostlab.predictprotein.ReqIntValueType addNewMatchLen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().add_element_user(MATCHLEN$10);
            return target;
        }
    }
    
    /**
     * Gets the "queryStart" element
     */
    public org.rostlab.predictprotein.ReqIntValueType getQueryStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().find_element_user(QUERYSTART$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryStart" element
     */
    public void setQueryStart(org.rostlab.predictprotein.ReqIntValueType queryStart)
    {
        generatedSetterHelperImpl(queryStart, QUERYSTART$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "queryStart" element
     */
    public org.rostlab.predictprotein.ReqIntValueType addNewQueryStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().add_element_user(QUERYSTART$12);
            return target;
        }
    }
    
    /**
     * Gets the "queryEnd" element
     */
    public org.rostlab.predictprotein.ReqIntValueType getQueryEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().find_element_user(QUERYEND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "queryEnd" element
     */
    public void setQueryEnd(org.rostlab.predictprotein.ReqIntValueType queryEnd)
    {
        generatedSetterHelperImpl(queryEnd, QUERYEND$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "queryEnd" element
     */
    public org.rostlab.predictprotein.ReqIntValueType addNewQueryEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().add_element_user(QUERYEND$14);
            return target;
        }
    }
    
    /**
     * Gets the "subjectStart" element
     */
    public org.rostlab.predictprotein.ReqIntValueType getSubjectStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().find_element_user(SUBJECTSTART$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subjectStart" element
     */
    public void setSubjectStart(org.rostlab.predictprotein.ReqIntValueType subjectStart)
    {
        generatedSetterHelperImpl(subjectStart, SUBJECTSTART$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subjectStart" element
     */
    public org.rostlab.predictprotein.ReqIntValueType addNewSubjectStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().add_element_user(SUBJECTSTART$16);
            return target;
        }
    }
    
    /**
     * Gets the "subjectEnd" element
     */
    public org.rostlab.predictprotein.ReqIntValueType getSubjectEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().find_element_user(SUBJECTEND$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subjectEnd" element
     */
    public void setSubjectEnd(org.rostlab.predictprotein.ReqIntValueType subjectEnd)
    {
        generatedSetterHelperImpl(subjectEnd, SUBJECTEND$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subjectEnd" element
     */
    public org.rostlab.predictprotein.ReqIntValueType addNewSubjectEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.ReqIntValueType target = null;
            target = (org.rostlab.predictprotein.ReqIntValueType)get_store().add_element_user(SUBJECTEND$18);
            return target;
        }
    }
    
    /**
     * Gets the "querySeq" element
     */
    public java.lang.String getQuerySeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYSEQ$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "querySeq" element
     */
    public org.apache.xmlbeans.XmlString xgetQuerySeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYSEQ$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "querySeq" element
     */
    public void setQuerySeq(java.lang.String querySeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYSEQ$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYSEQ$20);
            }
            target.setStringValue(querySeq);
        }
    }
    
    /**
     * Sets (as xml) the "querySeq" element
     */
    public void xsetQuerySeq(org.apache.xmlbeans.XmlString querySeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYSEQ$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYSEQ$20);
            }
            target.set(querySeq);
        }
    }
    
    /**
     * Gets the "subjectSeq" element
     */
    public java.lang.String getSubjectSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTSEQ$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subjectSeq" element
     */
    public org.apache.xmlbeans.XmlString xgetSubjectSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTSEQ$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subjectSeq" element
     */
    public void setSubjectSeq(java.lang.String subjectSeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTSEQ$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTSEQ$22);
            }
            target.setStringValue(subjectSeq);
        }
    }
    
    /**
     * Sets (as xml) the "subjectSeq" element
     */
    public void xsetSubjectSeq(org.apache.xmlbeans.XmlString subjectSeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTSEQ$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECTSEQ$22);
            }
            target.set(subjectSeq);
        }
    }
}
