

/**
 * EUtilsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package gov.nih.nlm.ncbi.www.soap.eutils;

    /*
     *  EUtilsService java interface
     */

    public interface EUtilsService {
          

        /**
          * Auto generated method signature
          * 
                    * @param eSearchRequest0
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResult run_eSearch(

                        gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequest eSearchRequest0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eSearchRequest0
            
          */
        public void startrun_eSearch(

            gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequest eSearchRequest0,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param eLinkRequest2
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResult run_eLink(

                        gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequest eLinkRequest2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eLinkRequest2
            
          */
        public void startrun_eLink(

            gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequest eLinkRequest2,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param eInfoRequest4
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResult run_eInfo(

                        gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequest eInfoRequest4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eInfoRequest4
            
          */
        public void startrun_eInfo(

            gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequest eInfoRequest4,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param eSpellRequest6
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResult run_eSpell(

                        gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequest eSpellRequest6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eSpellRequest6
            
          */
        public void startrun_eSpell(

            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequest eSpellRequest6,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param eSummaryRequest8
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResult run_eSummary(

                        gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequest eSummaryRequest8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eSummaryRequest8
            
          */
        public void startrun_eSummary(

            gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequest eSummaryRequest8,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param eGqueryRequest10
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.egquery.Result run_eGquery(

                        gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequest eGqueryRequest10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eGqueryRequest10
            
          */
        public void startrun_eGquery(

            gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequest eGqueryRequest10,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param ePostRequest12
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostResult run_ePost(

                        gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequest ePostRequest12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param ePostRequest12
            
          */
        public void startrun_ePost(

            gov.nih.nlm.ncbi.www.soap.eutils.epost.EPostRequest ePostRequest12,

            final gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    