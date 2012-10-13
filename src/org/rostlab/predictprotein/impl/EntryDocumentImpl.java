/*
 * An XML document type.
 * Localname: entry
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.EntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein.impl;
/**
 * A document containing one entry(@http://rostlab.org/predictprotein) element.
 *
 * This is a complex type.
 */
public class EntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.EntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "entry");
    
    
    /**
     * Gets the "entry" element
     */
    public org.rostlab.predictprotein.EntryDocument.Entry getEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EntryDocument.Entry target = null;
            target = (org.rostlab.predictprotein.EntryDocument.Entry)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entry" element
     */
    public void setEntry(org.rostlab.predictprotein.EntryDocument.Entry entry)
    {
        generatedSetterHelperImpl(entry, ENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entry" element
     */
    public org.rostlab.predictprotein.EntryDocument.Entry addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.rostlab.predictprotein.EntryDocument.Entry target = null;
            target = (org.rostlab.predictprotein.EntryDocument.Entry)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
    /**
     * An XML entry(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public static class EntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.EntryDocument.Entry
    {
        private static final long serialVersionUID = 1L;
        
        public EntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACCESSION$0 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "accession");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "name");
        private static final javax.xml.namespace.QName PROTEIN$4 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "protein");
        private static final javax.xml.namespace.QName GENE$6 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "gene");
        private static final javax.xml.namespace.QName ORGANISM$8 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "organism");
        private static final javax.xml.namespace.QName ORGANISMHOST$10 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "organismHost");
        private static final javax.xml.namespace.QName GENELOCATION$12 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "geneLocation");
        private static final javax.xml.namespace.QName REFERENCE$14 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "reference");
        private static final javax.xml.namespace.QName COMMENT$16 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "comment");
        private static final javax.xml.namespace.QName PREDICTIONRUNS$18 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "predictionRuns");
        private static final javax.xml.namespace.QName ALIPROVIDERGROUP$20 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "aliProviderGroup");
        private static final javax.xml.namespace.QName DBREFERENCE$22 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "dbReference");
        private static final javax.xml.namespace.QName PROTEINEXISTENCE$24 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "proteinExistence");
        private static final javax.xml.namespace.QName KEYWORD$26 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "keyword");
        private static final javax.xml.namespace.QName FEATURETYPEGROUP$28 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "featureTypeGroup");
        private static final javax.xml.namespace.QName EVIDENCE$30 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "evidence");
        private static final javax.xml.namespace.QName SEQUENCE$32 = 
            new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "sequence");
        private static final javax.xml.namespace.QName DATASET$34 = 
            new javax.xml.namespace.QName("", "dataset");
        private static final javax.xml.namespace.QName CREATED$36 = 
            new javax.xml.namespace.QName("", "created");
        private static final javax.xml.namespace.QName MODIFIED$38 = 
            new javax.xml.namespace.QName("", "modified");
        private static final javax.xml.namespace.QName VERSION$40 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets array of all "accession" elements
         */
        public java.lang.String[] getAccessionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACCESSION$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "accession" element
         */
        public java.lang.String getAccessionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "accession" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetAccessionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACCESSION$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "accession" element
         */
        public org.apache.xmlbeans.XmlString xgetAccessionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "accession" element
         */
        public int sizeOfAccessionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCESSION$0);
            }
        }
        
        /**
         * Sets array of all "accession" element
         */
        public void setAccessionArray(java.lang.String[] accessionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(accessionArray, ACCESSION$0);
            }
        }
        
        /**
         * Sets ith "accession" element
         */
        public void setAccessionArray(int i, java.lang.String accession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(accession);
            }
        }
        
        /**
         * Sets (as xml) array of all "accession" element
         */
        public void xsetAccessionArray(org.apache.xmlbeans.XmlString[]accessionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(accessionArray, ACCESSION$0);
            }
        }
        
        /**
         * Sets (as xml) ith "accession" element
         */
        public void xsetAccessionArray(int i, org.apache.xmlbeans.XmlString accession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(accession);
            }
        }
        
        /**
         * Inserts the value as the ith "accession" element
         */
        public void insertAccession(int i, java.lang.String accession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ACCESSION$0, i);
                target.setStringValue(accession);
            }
        }
        
        /**
         * Appends the value as the last "accession" element
         */
        public void addAccession(java.lang.String accession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSION$0);
                target.setStringValue(accession);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "accession" element
         */
        public org.apache.xmlbeans.XmlString insertNewAccession(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ACCESSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "accession" element
         */
        public org.apache.xmlbeans.XmlString addNewAccession()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "accession" element
         */
        public void removeAccession(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCESSION$0, i);
            }
        }
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, i);
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
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$2);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$2);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$2, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
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
         * Gets the "protein" element
         */
        public org.rostlab.predictprotein.ProteinType getProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType target = null;
                target = (org.rostlab.predictprotein.ProteinType)get_store().find_element_user(PROTEIN$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "protein" element
         */
        public void setProtein(org.rostlab.predictprotein.ProteinType protein)
        {
            generatedSetterHelperImpl(protein, PROTEIN$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "protein" element
         */
        public org.rostlab.predictprotein.ProteinType addNewProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinType target = null;
                target = (org.rostlab.predictprotein.ProteinType)get_store().add_element_user(PROTEIN$4);
                return target;
            }
        }
        
        /**
         * Gets array of all "gene" elements
         */
        public org.rostlab.predictprotein.EntryDocument.Entry.Gene[] getGeneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENE$6, targetList);
                org.rostlab.predictprotein.EntryDocument.Entry.Gene[] result = new org.rostlab.predictprotein.EntryDocument.Entry.Gene[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "gene" element
         */
        public org.rostlab.predictprotein.EntryDocument.Entry.Gene getGeneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry.Gene target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry.Gene)get_store().find_element_user(GENE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "gene" element
         */
        public int sizeOfGeneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENE$6);
            }
        }
        
        /**
         * Sets array of all "gene" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGeneArray(org.rostlab.predictprotein.EntryDocument.Entry.Gene[] geneArray)
        {
            check_orphaned();
            arraySetterHelper(geneArray, GENE$6);
        }
        
        /**
         * Sets ith "gene" element
         */
        public void setGeneArray(int i, org.rostlab.predictprotein.EntryDocument.Entry.Gene gene)
        {
            generatedSetterHelperImpl(gene, GENE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gene" element
         */
        public org.rostlab.predictprotein.EntryDocument.Entry.Gene insertNewGene(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry.Gene target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry.Gene)get_store().insert_element_user(GENE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gene" element
         */
        public org.rostlab.predictprotein.EntryDocument.Entry.Gene addNewGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry.Gene target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry.Gene)get_store().add_element_user(GENE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "gene" element
         */
        public void removeGene(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENE$6, i);
            }
        }
        
        /**
         * Gets array of all "organism" elements
         */
        public org.rostlab.predictprotein.OrganismType[] getOrganismArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANISM$8, targetList);
                org.rostlab.predictprotein.OrganismType[] result = new org.rostlab.predictprotein.OrganismType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "organism" element
         */
        public org.rostlab.predictprotein.OrganismType getOrganismArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.OrganismType target = null;
                target = (org.rostlab.predictprotein.OrganismType)get_store().find_element_user(ORGANISM$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "organism" element
         */
        public int sizeOfOrganismArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISM$8);
            }
        }
        
        /**
         * Sets array of all "organism" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrganismArray(org.rostlab.predictprotein.OrganismType[] organismArray)
        {
            check_orphaned();
            arraySetterHelper(organismArray, ORGANISM$8);
        }
        
        /**
         * Sets ith "organism" element
         */
        public void setOrganismArray(int i, org.rostlab.predictprotein.OrganismType organism)
        {
            generatedSetterHelperImpl(organism, ORGANISM$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organism" element
         */
        public org.rostlab.predictprotein.OrganismType insertNewOrganism(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.OrganismType target = null;
                target = (org.rostlab.predictprotein.OrganismType)get_store().insert_element_user(ORGANISM$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organism" element
         */
        public org.rostlab.predictprotein.OrganismType addNewOrganism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.OrganismType target = null;
                target = (org.rostlab.predictprotein.OrganismType)get_store().add_element_user(ORGANISM$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "organism" element
         */
        public void removeOrganism(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISM$8, i);
            }
        }
        
        /**
         * Gets array of all "organismHost" elements
         */
        public org.rostlab.predictprotein.OrganismType[] getOrganismHostArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANISMHOST$10, targetList);
                org.rostlab.predictprotein.OrganismType[] result = new org.rostlab.predictprotein.OrganismType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "organismHost" element
         */
        public org.rostlab.predictprotein.OrganismType getOrganismHostArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.OrganismType target = null;
                target = (org.rostlab.predictprotein.OrganismType)get_store().find_element_user(ORGANISMHOST$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "organismHost" element
         */
        public int sizeOfOrganismHostArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISMHOST$10);
            }
        }
        
        /**
         * Sets array of all "organismHost" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrganismHostArray(org.rostlab.predictprotein.OrganismType[] organismHostArray)
        {
            check_orphaned();
            arraySetterHelper(organismHostArray, ORGANISMHOST$10);
        }
        
        /**
         * Sets ith "organismHost" element
         */
        public void setOrganismHostArray(int i, org.rostlab.predictprotein.OrganismType organismHost)
        {
            generatedSetterHelperImpl(organismHost, ORGANISMHOST$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organismHost" element
         */
        public org.rostlab.predictprotein.OrganismType insertNewOrganismHost(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.OrganismType target = null;
                target = (org.rostlab.predictprotein.OrganismType)get_store().insert_element_user(ORGANISMHOST$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organismHost" element
         */
        public org.rostlab.predictprotein.OrganismType addNewOrganismHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.OrganismType target = null;
                target = (org.rostlab.predictprotein.OrganismType)get_store().add_element_user(ORGANISMHOST$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "organismHost" element
         */
        public void removeOrganismHost(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISMHOST$10, i);
            }
        }
        
        /**
         * Gets array of all "geneLocation" elements
         */
        public org.rostlab.predictprotein.GeneLocationType[] getGeneLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENELOCATION$12, targetList);
                org.rostlab.predictprotein.GeneLocationType[] result = new org.rostlab.predictprotein.GeneLocationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "geneLocation" element
         */
        public org.rostlab.predictprotein.GeneLocationType getGeneLocationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.GeneLocationType target = null;
                target = (org.rostlab.predictprotein.GeneLocationType)get_store().find_element_user(GENELOCATION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "geneLocation" element
         */
        public int sizeOfGeneLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENELOCATION$12);
            }
        }
        
        /**
         * Sets array of all "geneLocation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGeneLocationArray(org.rostlab.predictprotein.GeneLocationType[] geneLocationArray)
        {
            check_orphaned();
            arraySetterHelper(geneLocationArray, GENELOCATION$12);
        }
        
        /**
         * Sets ith "geneLocation" element
         */
        public void setGeneLocationArray(int i, org.rostlab.predictprotein.GeneLocationType geneLocation)
        {
            generatedSetterHelperImpl(geneLocation, GENELOCATION$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "geneLocation" element
         */
        public org.rostlab.predictprotein.GeneLocationType insertNewGeneLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.GeneLocationType target = null;
                target = (org.rostlab.predictprotein.GeneLocationType)get_store().insert_element_user(GENELOCATION$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "geneLocation" element
         */
        public org.rostlab.predictprotein.GeneLocationType addNewGeneLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.GeneLocationType target = null;
                target = (org.rostlab.predictprotein.GeneLocationType)get_store().add_element_user(GENELOCATION$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "geneLocation" element
         */
        public void removeGeneLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENELOCATION$12, i);
            }
        }
        
        /**
         * Gets array of all "reference" elements
         */
        public org.rostlab.predictprotein.ReferenceType[] getReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REFERENCE$14, targetList);
                org.rostlab.predictprotein.ReferenceType[] result = new org.rostlab.predictprotein.ReferenceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reference" element
         */
        public org.rostlab.predictprotein.ReferenceType getReferenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReferenceType target = null;
                target = (org.rostlab.predictprotein.ReferenceType)get_store().find_element_user(REFERENCE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "reference" element
         */
        public int sizeOfReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERENCE$14);
            }
        }
        
        /**
         * Sets array of all "reference" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setReferenceArray(org.rostlab.predictprotein.ReferenceType[] referenceArray)
        {
            check_orphaned();
            arraySetterHelper(referenceArray, REFERENCE$14);
        }
        
        /**
         * Sets ith "reference" element
         */
        public void setReferenceArray(int i, org.rostlab.predictprotein.ReferenceType reference)
        {
            generatedSetterHelperImpl(reference, REFERENCE$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reference" element
         */
        public org.rostlab.predictprotein.ReferenceType insertNewReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReferenceType target = null;
                target = (org.rostlab.predictprotein.ReferenceType)get_store().insert_element_user(REFERENCE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reference" element
         */
        public org.rostlab.predictprotein.ReferenceType addNewReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ReferenceType target = null;
                target = (org.rostlab.predictprotein.ReferenceType)get_store().add_element_user(REFERENCE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "reference" element
         */
        public void removeReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERENCE$14, i);
            }
        }
        
        /**
         * Gets array of all "comment" elements
         */
        public org.rostlab.predictprotein.CommentType[] getCommentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMMENT$16, targetList);
                org.rostlab.predictprotein.CommentType[] result = new org.rostlab.predictprotein.CommentType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "comment" element
         */
        public org.rostlab.predictprotein.CommentType getCommentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType target = null;
                target = (org.rostlab.predictprotein.CommentType)get_store().find_element_user(COMMENT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "comment" element
         */
        public boolean isNilCommentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType target = null;
                target = (org.rostlab.predictprotein.CommentType)get_store().find_element_user(COMMENT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "comment" element
         */
        public int sizeOfCommentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$16);
            }
        }
        
        /**
         * Sets array of all "comment" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCommentArray(org.rostlab.predictprotein.CommentType[] commentArray)
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$16);
        }
        
        /**
         * Sets ith "comment" element
         */
        public void setCommentArray(int i, org.rostlab.predictprotein.CommentType comment)
        {
            generatedSetterHelperImpl(comment, COMMENT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Nils the ith "comment" element
         */
        public void setNilCommentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType target = null;
                target = (org.rostlab.predictprotein.CommentType)get_store().find_element_user(COMMENT$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "comment" element
         */
        public org.rostlab.predictprotein.CommentType insertNewComment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType target = null;
                target = (org.rostlab.predictprotein.CommentType)get_store().insert_element_user(COMMENT$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "comment" element
         */
        public org.rostlab.predictprotein.CommentType addNewComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.CommentType target = null;
                target = (org.rostlab.predictprotein.CommentType)get_store().add_element_user(COMMENT$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "comment" element
         */
        public void removeComment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$16, i);
            }
        }
        
        /**
         * Gets the "predictionRuns" element
         */
        public org.rostlab.predictprotein.PredictionRunGroupType getPredictionRuns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.PredictionRunGroupType target = null;
                target = (org.rostlab.predictprotein.PredictionRunGroupType)get_store().find_element_user(PREDICTIONRUNS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "predictionRuns" element
         */
        public boolean isSetPredictionRuns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREDICTIONRUNS$18) != 0;
            }
        }
        
        /**
         * Sets the "predictionRuns" element
         */
        public void setPredictionRuns(org.rostlab.predictprotein.PredictionRunGroupType predictionRuns)
        {
            generatedSetterHelperImpl(predictionRuns, PREDICTIONRUNS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "predictionRuns" element
         */
        public org.rostlab.predictprotein.PredictionRunGroupType addNewPredictionRuns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.PredictionRunGroupType target = null;
                target = (org.rostlab.predictprotein.PredictionRunGroupType)get_store().add_element_user(PREDICTIONRUNS$18);
                return target;
            }
        }
        
        /**
         * Unsets the "predictionRuns" element
         */
        public void unsetPredictionRuns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREDICTIONRUNS$18, 0);
            }
        }
        
        /**
         * Gets array of all "aliProviderGroup" elements
         */
        public org.rostlab.predictprotein.AliProviderGroupType[] getAliProviderGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIPROVIDERGROUP$20, targetList);
                org.rostlab.predictprotein.AliProviderGroupType[] result = new org.rostlab.predictprotein.AliProviderGroupType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "aliProviderGroup" element
         */
        public org.rostlab.predictprotein.AliProviderGroupType getAliProviderGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.AliProviderGroupType target = null;
                target = (org.rostlab.predictprotein.AliProviderGroupType)get_store().find_element_user(ALIPROVIDERGROUP$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "aliProviderGroup" element
         */
        public int sizeOfAliProviderGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIPROVIDERGROUP$20);
            }
        }
        
        /**
         * Sets array of all "aliProviderGroup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAliProviderGroupArray(org.rostlab.predictprotein.AliProviderGroupType[] aliProviderGroupArray)
        {
            check_orphaned();
            arraySetterHelper(aliProviderGroupArray, ALIPROVIDERGROUP$20);
        }
        
        /**
         * Sets ith "aliProviderGroup" element
         */
        public void setAliProviderGroupArray(int i, org.rostlab.predictprotein.AliProviderGroupType aliProviderGroup)
        {
            generatedSetterHelperImpl(aliProviderGroup, ALIPROVIDERGROUP$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "aliProviderGroup" element
         */
        public org.rostlab.predictprotein.AliProviderGroupType insertNewAliProviderGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.AliProviderGroupType target = null;
                target = (org.rostlab.predictprotein.AliProviderGroupType)get_store().insert_element_user(ALIPROVIDERGROUP$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "aliProviderGroup" element
         */
        public org.rostlab.predictprotein.AliProviderGroupType addNewAliProviderGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.AliProviderGroupType target = null;
                target = (org.rostlab.predictprotein.AliProviderGroupType)get_store().add_element_user(ALIPROVIDERGROUP$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "aliProviderGroup" element
         */
        public void removeAliProviderGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIPROVIDERGROUP$20, i);
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
                get_store().find_all_element_users(DBREFERENCE$22, targetList);
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
                target = (org.rostlab.predictprotein.DbReferenceType)get_store().find_element_user(DBREFERENCE$22, i);
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
                return get_store().count_elements(DBREFERENCE$22);
            }
        }
        
        /**
         * Sets array of all "dbReference" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDbReferenceArray(org.rostlab.predictprotein.DbReferenceType[] dbReferenceArray)
        {
            check_orphaned();
            arraySetterHelper(dbReferenceArray, DBREFERENCE$22);
        }
        
        /**
         * Sets ith "dbReference" element
         */
        public void setDbReferenceArray(int i, org.rostlab.predictprotein.DbReferenceType dbReference)
        {
            generatedSetterHelperImpl(dbReference, DBREFERENCE$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (org.rostlab.predictprotein.DbReferenceType)get_store().insert_element_user(DBREFERENCE$22, i);
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
                target = (org.rostlab.predictprotein.DbReferenceType)get_store().add_element_user(DBREFERENCE$22);
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
                get_store().remove_element(DBREFERENCE$22, i);
            }
        }
        
        /**
         * Gets the "proteinExistence" element
         */
        public org.rostlab.predictprotein.ProteinExistenceType getProteinExistence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinExistenceType target = null;
                target = (org.rostlab.predictprotein.ProteinExistenceType)get_store().find_element_user(PROTEINEXISTENCE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "proteinExistence" element
         */
        public void setProteinExistence(org.rostlab.predictprotein.ProteinExistenceType proteinExistence)
        {
            generatedSetterHelperImpl(proteinExistence, PROTEINEXISTENCE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "proteinExistence" element
         */
        public org.rostlab.predictprotein.ProteinExistenceType addNewProteinExistence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.ProteinExistenceType target = null;
                target = (org.rostlab.predictprotein.ProteinExistenceType)get_store().add_element_user(PROTEINEXISTENCE$24);
                return target;
            }
        }
        
        /**
         * Gets array of all "keyword" elements
         */
        public org.rostlab.predictprotein.KeywordType[] getKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORD$26, targetList);
                org.rostlab.predictprotein.KeywordType[] result = new org.rostlab.predictprotein.KeywordType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "keyword" element
         */
        public org.rostlab.predictprotein.KeywordType getKeywordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.KeywordType target = null;
                target = (org.rostlab.predictprotein.KeywordType)get_store().find_element_user(KEYWORD$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "keyword" element
         */
        public int sizeOfKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$26);
            }
        }
        
        /**
         * Sets array of all "keyword" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeywordArray(org.rostlab.predictprotein.KeywordType[] keywordArray)
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$26);
        }
        
        /**
         * Sets ith "keyword" element
         */
        public void setKeywordArray(int i, org.rostlab.predictprotein.KeywordType keyword)
        {
            generatedSetterHelperImpl(keyword, KEYWORD$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keyword" element
         */
        public org.rostlab.predictprotein.KeywordType insertNewKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.KeywordType target = null;
                target = (org.rostlab.predictprotein.KeywordType)get_store().insert_element_user(KEYWORD$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keyword" element
         */
        public org.rostlab.predictprotein.KeywordType addNewKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.KeywordType target = null;
                target = (org.rostlab.predictprotein.KeywordType)get_store().add_element_user(KEYWORD$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "keyword" element
         */
        public void removeKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$26, i);
            }
        }
        
        /**
         * Gets array of all "featureTypeGroup" elements
         */
        public org.rostlab.predictprotein.FeatureTypeGroupType[] getFeatureTypeGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FEATURETYPEGROUP$28, targetList);
                org.rostlab.predictprotein.FeatureTypeGroupType[] result = new org.rostlab.predictprotein.FeatureTypeGroupType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "featureTypeGroup" element
         */
        public org.rostlab.predictprotein.FeatureTypeGroupType getFeatureTypeGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.FeatureTypeGroupType target = null;
                target = (org.rostlab.predictprotein.FeatureTypeGroupType)get_store().find_element_user(FEATURETYPEGROUP$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "featureTypeGroup" element
         */
        public int sizeOfFeatureTypeGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATURETYPEGROUP$28);
            }
        }
        
        /**
         * Sets array of all "featureTypeGroup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFeatureTypeGroupArray(org.rostlab.predictprotein.FeatureTypeGroupType[] featureTypeGroupArray)
        {
            check_orphaned();
            arraySetterHelper(featureTypeGroupArray, FEATURETYPEGROUP$28);
        }
        
        /**
         * Sets ith "featureTypeGroup" element
         */
        public void setFeatureTypeGroupArray(int i, org.rostlab.predictprotein.FeatureTypeGroupType featureTypeGroup)
        {
            generatedSetterHelperImpl(featureTypeGroup, FEATURETYPEGROUP$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "featureTypeGroup" element
         */
        public org.rostlab.predictprotein.FeatureTypeGroupType insertNewFeatureTypeGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.FeatureTypeGroupType target = null;
                target = (org.rostlab.predictprotein.FeatureTypeGroupType)get_store().insert_element_user(FEATURETYPEGROUP$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "featureTypeGroup" element
         */
        public org.rostlab.predictprotein.FeatureTypeGroupType addNewFeatureTypeGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.FeatureTypeGroupType target = null;
                target = (org.rostlab.predictprotein.FeatureTypeGroupType)get_store().add_element_user(FEATURETYPEGROUP$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "featureTypeGroup" element
         */
        public void removeFeatureTypeGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATURETYPEGROUP$28, i);
            }
        }
        
        /**
         * Gets array of all "evidence" elements
         */
        public org.rostlab.predictprotein.EvidenceType[] getEvidenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EVIDENCE$30, targetList);
                org.rostlab.predictprotein.EvidenceType[] result = new org.rostlab.predictprotein.EvidenceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "evidence" element
         */
        public org.rostlab.predictprotein.EvidenceType getEvidenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidenceType target = null;
                target = (org.rostlab.predictprotein.EvidenceType)get_store().find_element_user(EVIDENCE$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "evidence" element
         */
        public int sizeOfEvidenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVIDENCE$30);
            }
        }
        
        /**
         * Sets array of all "evidence" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEvidenceArray(org.rostlab.predictprotein.EvidenceType[] evidenceArray)
        {
            check_orphaned();
            arraySetterHelper(evidenceArray, EVIDENCE$30);
        }
        
        /**
         * Sets ith "evidence" element
         */
        public void setEvidenceArray(int i, org.rostlab.predictprotein.EvidenceType evidence)
        {
            generatedSetterHelperImpl(evidence, EVIDENCE$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "evidence" element
         */
        public org.rostlab.predictprotein.EvidenceType insertNewEvidence(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidenceType target = null;
                target = (org.rostlab.predictprotein.EvidenceType)get_store().insert_element_user(EVIDENCE$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "evidence" element
         */
        public org.rostlab.predictprotein.EvidenceType addNewEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EvidenceType target = null;
                target = (org.rostlab.predictprotein.EvidenceType)get_store().add_element_user(EVIDENCE$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "evidence" element
         */
        public void removeEvidence(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVIDENCE$30, i);
            }
        }
        
        /**
         * Gets the "sequence" element
         */
        public org.rostlab.predictprotein.SequenceType getSequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.SequenceType target = null;
                target = (org.rostlab.predictprotein.SequenceType)get_store().find_element_user(SEQUENCE$32, 0);
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
        public void setSequence(org.rostlab.predictprotein.SequenceType sequence)
        {
            generatedSetterHelperImpl(sequence, SEQUENCE$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "sequence" element
         */
        public org.rostlab.predictprotein.SequenceType addNewSequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.SequenceType target = null;
                target = (org.rostlab.predictprotein.SequenceType)get_store().add_element_user(SEQUENCE$32);
                return target;
            }
        }
        
        /**
         * Gets the "dataset" attribute
         */
        public org.rostlab.predictprotein.EntryDocument.Entry.Dataset.Enum getDataset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASET$34);
                if (target == null)
                {
                    return null;
                }
                return (org.rostlab.predictprotein.EntryDocument.Entry.Dataset.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataset" attribute
         */
        public org.rostlab.predictprotein.EntryDocument.Entry.Dataset xgetDataset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry.Dataset target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry.Dataset)get_store().find_attribute_user(DATASET$34);
                return target;
            }
        }
        
        /**
         * Sets the "dataset" attribute
         */
        public void setDataset(org.rostlab.predictprotein.EntryDocument.Entry.Dataset.Enum dataset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASET$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASET$34);
                }
                target.setEnumValue(dataset);
            }
        }
        
        /**
         * Sets (as xml) the "dataset" attribute
         */
        public void xsetDataset(org.rostlab.predictprotein.EntryDocument.Entry.Dataset dataset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.rostlab.predictprotein.EntryDocument.Entry.Dataset target = null;
                target = (org.rostlab.predictprotein.EntryDocument.Entry.Dataset)get_store().find_attribute_user(DATASET$34);
                if (target == null)
                {
                    target = (org.rostlab.predictprotein.EntryDocument.Entry.Dataset)get_store().add_attribute_user(DATASET$34);
                }
                target.set(dataset);
            }
        }
        
        /**
         * Gets the "created" attribute
         */
        public java.util.Calendar getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$36);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "created" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(CREATED$36);
                return target;
            }
        }
        
        /**
         * Sets the "created" attribute
         */
        public void setCreated(java.util.Calendar created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATED$36);
                }
                target.setCalendarValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "created" attribute
         */
        public void xsetCreated(org.apache.xmlbeans.XmlDate created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(CREATED$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(CREATED$36);
                }
                target.set(created);
            }
        }
        
        /**
         * Gets the "modified" attribute
         */
        public java.util.Calendar getModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$38);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "modified" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(MODIFIED$38);
                return target;
            }
        }
        
        /**
         * Sets the "modified" attribute
         */
        public void setModified(java.util.Calendar modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODIFIED$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODIFIED$38);
                }
                target.setCalendarValue(modified);
            }
        }
        
        /**
         * Sets (as xml) the "modified" attribute
         */
        public void xsetModified(org.apache.xmlbeans.XmlDate modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(MODIFIED$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(MODIFIED$38);
                }
                target.set(modified);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$40);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSION$40);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$40);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VERSION$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VERSION$40);
                }
                target.set(version);
            }
        }
        /**
         * An XML gene(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public static class GeneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.rostlab.predictprotein.EntryDocument.Entry.Gene
        {
            private static final long serialVersionUID = 1L;
            
            public GeneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("http://rostlab.org/predictprotein", "name");
            
            
            /**
             * Gets array of all "name" elements
             */
            public org.rostlab.predictprotein.GeneNameType[] getNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NAME$0, targetList);
                    org.rostlab.predictprotein.GeneNameType[] result = new org.rostlab.predictprotein.GeneNameType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "name" element
             */
            public org.rostlab.predictprotein.GeneNameType getNameArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.GeneNameType target = null;
                    target = (org.rostlab.predictprotein.GeneNameType)get_store().find_element_user(NAME$0, i);
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
                    return get_store().count_elements(NAME$0);
                }
            }
            
            /**
             * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setNameArray(org.rostlab.predictprotein.GeneNameType[] nameArray)
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
            
            /**
             * Sets ith "name" element
             */
            public void setNameArray(int i, org.rostlab.predictprotein.GeneNameType name)
            {
                generatedSetterHelperImpl(name, NAME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "name" element
             */
            public org.rostlab.predictprotein.GeneNameType insertNewName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.GeneNameType target = null;
                    target = (org.rostlab.predictprotein.GeneNameType)get_store().insert_element_user(NAME$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "name" element
             */
            public org.rostlab.predictprotein.GeneNameType addNewName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.rostlab.predictprotein.GeneNameType target = null;
                    target = (org.rostlab.predictprotein.GeneNameType)get_store().add_element_user(NAME$0);
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
                    get_store().remove_element(NAME$0, i);
                }
            }
        }
        /**
         * An XML dataset(@).
         *
         * This is an atomic type that is a restriction of org.rostlab.predictprotein.EntryDocument$Entry$Dataset.
         */
        public static class DatasetImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.rostlab.predictprotein.EntryDocument.Entry.Dataset
        {
            private static final long serialVersionUID = 1L;
            
            public DatasetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DatasetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
