package org.rostlab.snapdb.service;

import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub.Entrezgene_type0;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchSequenceServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub;

import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Sequence;
import org.rostlab.snapdb.service.model.ProteinDetail;

public class ProteinDetailServiceImpl implements ProteinDetailService {
	private SequenceDao sequenceDao;

	public SequenceDao getSequenceDao() {
		return sequenceDao;
	}

	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}

	@Override
	public ProteinDetail getProteinDetail(final String refId) {

		Sequence seq = sequenceDao.selectByRefId(refId);
		if(seq==null)
			return null;
		ProteinDetail proteinDetail = new ProteinDetail();
		try {

			final String[] genids = queryDataBaseForTerm(seq.getRefId(), "gene");
			// results output
			EFetchGeneServiceStub fetchGen = new EFetchGeneServiceStub();
			EFetchGeneServiceStub.EFetchRequest fetchGenReq = new EFetchGeneServiceStub.EFetchRequest();
			fetchGenReq.setId(genids[0]);
			EFetchGeneServiceStub.EFetchResult fetchGenRes = fetchGen
					.run_eFetch(fetchGenReq);
			for (int i = 0; i < fetchGenRes.getEntrezgeneSet()
					.getEntrezgeneSetSequence().length; i++) {
				Entrezgene_type0 obj = fetchGenRes.getEntrezgeneSet()
						.getEntrezgeneSetSequence()[i].getEntrezgene();
				proteinDetail.setOfficialGenFullName(obj.getEntrezgene_gene()
						.getGeneRef().getGeneRef_desc());
				proteinDetail.setOfficialGenSymbol(obj.getEntrezgene_gene()
						.getGeneRef().getGeneRef_locus());
				proteinDetail.setGenLocation(obj.getEntrezgene_gene()
						.getGeneRef().getGeneRef_maploc());
				break;
			}

			final String[] proteinids=queryDataBaseForTerm(seq.getRefId(), "protein");
			EFetchSequenceServiceStub fetchSequence = new EFetchSequenceServiceStub();
			EFetchSequenceServiceStub.EFetchRequest seqReq = new EFetchSequenceServiceStub.EFetchRequest();
			seqReq.setId(proteinids[0]);
			EFetchSequenceServiceStub.EFetchResult seqRes = fetchSequence
					.run_eFetch(seqReq);
			// results output
			for (int i = 0; i < seqRes.getGBSet().getGBSetSequence().length; i++) {
				EFetchSequenceServiceStub.GBSeq_type0 obj = seqRes.getGBSet()
						.getGBSetSequence()[i].getGBSeq();
				System.out.println("Organism: " + obj.getGBSeq_organism());
				System.out.println("Locus: " + obj.getGBSeq_locus());
				System.out.println("Definition: " + obj.getGBSeq_definition());
				System.out
						.println("------------------------------------------");
			}
		} catch (Exception e) {

		}

		return proteinDetail;
	}

	private String[] queryDataBaseForTerm(String refId, String dbname) {
		try {

			EUtilsServiceStub service = new EUtilsServiceStub();

			EUtilsServiceStub.ESearchRequest req = new EUtilsServiceStub.ESearchRequest();
			req.setTerm(refId);
			req.setDb(dbname);
			EUtilsServiceStub.ESearchResult res = service.run_eSearch(req);
			return res.getIdList().getId();
		} catch (Exception e) {

		}
		return null;
	}

}
