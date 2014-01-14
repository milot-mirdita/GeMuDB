

/**
 * EFetchGeneService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package gov.nih.nlm.ncbi.www.soap.eutils;

    /*
     *  EFetchGeneService java interface
     */

    public interface EFetchGeneService {
          

        /**
          * Auto generated method signature
          * 
                    * @param eFetchRequest0
                
         */

         
                     public gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.EFetchResult run_eFetch(

                        gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.EFetchRequest eFetchRequest0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param eFetchRequest0
            
          */
        public void startrun_eFetch(

            gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.EFetchRequest eFetchRequest0,

            final gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    