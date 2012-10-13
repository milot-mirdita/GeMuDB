/*
 * XML Type:  predictionRunGroupType
 * Namespace: http://rostlab.org/predictprotein
 * Java type: org.rostlab.predictprotein.PredictionRunGroupType
 *
 * Automatically generated - do not modify.
 */
package org.rostlab.predictprotein;


/**
 * An XML predictionRunGroupType(@http://rostlab.org/predictprotein).
 *
 * This is a complex type.
 */
public interface PredictionRunGroupType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PredictionRunGroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("predictionrungrouptypec1actype");
    
    /**
     * Gets array of all "predRunASP" elements
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP[] getPredRunASPArray();
    
    /**
     * Gets ith "predRunASP" element
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP getPredRunASPArray(int i);
    
    /**
     * Returns number of "predRunASP" element
     */
    int sizeOfPredRunASPArray();
    
    /**
     * Sets array of all "predRunASP" element
     */
    void setPredRunASPArray(org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP[] predRunASPArray);
    
    /**
     * Sets ith "predRunASP" element
     */
    void setPredRunASPArray(int i, org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP predRunASP);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "predRunASP" element
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP insertNewPredRunASP(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "predRunASP" element
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP addNewPredRunASP();
    
    /**
     * Removes the ith "predRunASP" element
     */
    void removePredRunASP(int i);
    
    /**
     * Gets array of all "predRunGLOBE" elements
     */
    org.rostlab.predictprotein.PredictionRunType[] getPredRunGLOBEArray();
    
    /**
     * Gets ith "predRunGLOBE" element
     */
    org.rostlab.predictprotein.PredictionRunType getPredRunGLOBEArray(int i);
    
    /**
     * Returns number of "predRunGLOBE" element
     */
    int sizeOfPredRunGLOBEArray();
    
    /**
     * Sets array of all "predRunGLOBE" element
     */
    void setPredRunGLOBEArray(org.rostlab.predictprotein.PredictionRunType[] predRunGLOBEArray);
    
    /**
     * Sets ith "predRunGLOBE" element
     */
    void setPredRunGLOBEArray(int i, org.rostlab.predictprotein.PredictionRunType predRunGLOBE);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "predRunGLOBE" element
     */
    org.rostlab.predictprotein.PredictionRunType insertNewPredRunGLOBE(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "predRunGLOBE" element
     */
    org.rostlab.predictprotein.PredictionRunType addNewPredRunGLOBE();
    
    /**
     * Removes the ith "predRunGLOBE" element
     */
    void removePredRunGLOBE(int i);
    
    /**
     * Gets array of all "predRunProfTMB" elements
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB[] getPredRunProfTMBArray();
    
    /**
     * Gets ith "predRunProfTMB" element
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB getPredRunProfTMBArray(int i);
    
    /**
     * Returns number of "predRunProfTMB" element
     */
    int sizeOfPredRunProfTMBArray();
    
    /**
     * Sets array of all "predRunProfTMB" element
     */
    void setPredRunProfTMBArray(org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB[] predRunProfTMBArray);
    
    /**
     * Sets ith "predRunProfTMB" element
     */
    void setPredRunProfTMBArray(int i, org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB predRunProfTMB);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "predRunProfTMB" element
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB insertNewPredRunProfTMB(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "predRunProfTMB" element
     */
    org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB addNewPredRunProfTMB();
    
    /**
     * Removes the ith "predRunProfTMB" element
     */
    void removePredRunProfTMB(int i);
    
    /**
     * An XML predRunASP(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface PredRunASP extends org.rostlab.predictprotein.PredictionRunType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PredRunASP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("predrunasp679celemtype");
        
        /**
         * Gets the "parameters" element
         */
        org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters getParameters();
        
        /**
         * True if has "parameters" element
         */
        boolean isSetParameters();
        
        /**
         * Sets the "parameters" element
         */
        void setParameters(org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters parameters);
        
        /**
         * Appends and returns a new empty "parameters" element
         */
        org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters addNewParameters();
        
        /**
         * Unsets the "parameters" element
         */
        void unsetParameters();
        
        /**
         * Gets the "meanDprScore" element
         */
        org.rostlab.predictprotein.ReqFloatValueType getMeanDprScore();
        
        /**
         * True if has "meanDprScore" element
         */
        boolean isSetMeanDprScore();
        
        /**
         * Sets the "meanDprScore" element
         */
        void setMeanDprScore(org.rostlab.predictprotein.ReqFloatValueType meanDprScore);
        
        /**
         * Appends and returns a new empty "meanDprScore" element
         */
        org.rostlab.predictprotein.ReqFloatValueType addNewMeanDprScore();
        
        /**
         * Unsets the "meanDprScore" element
         */
        void unsetMeanDprScore();
        
        /**
         * Gets the "dprStdDev" element
         */
        org.rostlab.predictprotein.ReqFloatValueType getDprStdDev();
        
        /**
         * True if has "dprStdDev" element
         */
        boolean isSetDprStdDev();
        
        /**
         * Sets the "dprStdDev" element
         */
        void setDprStdDev(org.rostlab.predictprotein.ReqFloatValueType dprStdDev);
        
        /**
         * Appends and returns a new empty "dprStdDev" element
         */
        org.rostlab.predictprotein.ReqFloatValueType addNewDprStdDev();
        
        /**
         * Unsets the "dprStdDev" element
         */
        void unsetDprStdDev();
        
        /**
         * An XML parameters(@http://rostlab.org/predictprotein).
         *
         * This is a complex type.
         */
        public interface Parameters extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("parameters3e22elemtype");
            
            /**
             * Gets the "window" element
             */
            org.rostlab.predictprotein.ReqPositiveIntValueType getWindow();
            
            /**
             * Sets the "window" element
             */
            void setWindow(org.rostlab.predictprotein.ReqPositiveIntValueType window);
            
            /**
             * Appends and returns a new empty "window" element
             */
            org.rostlab.predictprotein.ReqPositiveIntValueType addNewWindow();
            
            /**
             * Gets the "minMuDpr" element
             */
            org.rostlab.predictprotein.ReqPositiveIntValueType getMinMuDpr();
            
            /**
             * Sets the "minMuDpr" element
             */
            void setMinMuDpr(org.rostlab.predictprotein.ReqPositiveIntValueType minMuDpr);
            
            /**
             * Appends and returns a new empty "minMuDpr" element
             */
            org.rostlab.predictprotein.ReqPositiveIntValueType addNewMinMuDpr();
            
            /**
             * Gets the "zScoreCutoff" element
             */
            org.rostlab.predictprotein.ReqFloatValueType getZScoreCutoff();
            
            /**
             * Sets the "zScoreCutoff" element
             */
            void setZScoreCutoff(org.rostlab.predictprotein.ReqFloatValueType zScoreCutoff);
            
            /**
             * Appends and returns a new empty "zScoreCutoff" element
             */
            org.rostlab.predictprotein.ReqFloatValueType addNewZScoreCutoff();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters newInstance() {
                  return (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP newInstance() {
              return (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.PredictionRunGroupType.PredRunASP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML predRunProfTMB(@http://rostlab.org/predictprotein).
     *
     * This is a complex type.
     */
    public interface PredRunProfTMB extends org.rostlab.predictprotein.PredictionRunType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PredRunProfTMB.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB9FB67C369912DF29A673889FFC55F91").resolveHandle("predrunproftmb0eeaelemtype");
        
        /**
         * Gets the "zScore" element
         */
        org.rostlab.predictprotein.ReqFloatValueType getZScore();
        
        /**
         * Sets the "zScore" element
         */
        void setZScore(org.rostlab.predictprotein.ReqFloatValueType zScore);
        
        /**
         * Appends and returns a new empty "zScore" element
         */
        org.rostlab.predictprotein.ReqFloatValueType addNewZScore();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB newInstance() {
              return (org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.rostlab.predictprotein.PredictionRunGroupType.PredRunProfTMB) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.rostlab.predictprotein.PredictionRunGroupType newInstance() {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.rostlab.predictprotein.PredictionRunGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.rostlab.predictprotein.PredictionRunGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
