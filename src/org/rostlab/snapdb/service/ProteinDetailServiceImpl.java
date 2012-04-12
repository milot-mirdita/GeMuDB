package org.rostlab.snapdb.service;

import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub.Entrezgene_type0;

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
	public ProteinDetail getProteinDetail(Long id) {
		
		Sequence seq=sequenceDao.selectById(id);
		ProteinDetail proteinDetail = new ProteinDetail();
		try {

			final String[] ids= queryDataBaseForTerm(seq.getRefId(),"gene");
			// results output
			EFetchGeneServiceStub fetchGen = new EFetchGeneServiceStub();
			EFetchGeneServiceStub.EFetchRequest fetchGenReq = new EFetchGeneServiceStub.EFetchRequest();
			fetchGenReq.setId(ids[0]);
			EFetchGeneServiceStub.EFetchResult fetchGenRes = fetchGen.run_eFetch(fetchGenReq);
			for (int i = 0; i < fetchGenRes.getEntrezgeneSet().getEntrezgeneSetSequence().length; i++) {
				Entrezgene_type0 obj = fetchGenRes.getEntrezgeneSet().getEntrezgeneSetSequence()[i].getEntrezgene();
				proteinDetail.setOfficialGenFullName(obj.getEntrezgene_gene().getGeneRef().getGeneRef_desc());
				proteinDetail.setOfficialGenSymbol(obj.getEntrezgene_gene().getGeneRef().getGeneRef_locus());
				proteinDetail.setGenLocation(obj.getEntrezgene_gene().getGeneRef().getGeneRef_maploc());
				break;
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
