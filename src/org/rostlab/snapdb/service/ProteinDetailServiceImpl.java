package org.rostlab.snapdb.service;

import gov.nih.nlm.ncbi.snp.docsum.AssemblyDocument.Assembly;
import gov.nih.nlm.ncbi.snp.docsum.ComponentDocument.Component;
import gov.nih.nlm.ncbi.snp.docsum.ExchangeSetDocument;
import gov.nih.nlm.ncbi.snp.docsum.FxnSetDocument.FxnSet;
import gov.nih.nlm.ncbi.snp.docsum.FxnSetDocument.FxnSet.FxnClass;
import gov.nih.nlm.ncbi.snp.docsum.MapLocDocument.MapLoc;
import gov.nih.nlm.ncbi.snp.docsum.RsDocument.Rs;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub.Entrezgene_type0;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchSequenceServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub.LinkSetDbType;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub.LinkSetType;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub.LinkTypeE;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Sequence;
import org.rostlab.snapdb.service.model.NcbiSnpDetail;
import org.rostlab.snapdb.service.model.NcbiSnpDetailContainer;
import org.rostlab.snapdb.service.model.OmimEntry;
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
		if (seq == null)
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
					.getEntrezgeneSetSequence().length;) {
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

			final String[] proteinids = queryDataBaseForTerm(seq.getRefId(),
					"protein");
			EFetchSequenceServiceStub fetchSequence = new EFetchSequenceServiceStub();
			EFetchSequenceServiceStub.EFetchRequest seqReq = new EFetchSequenceServiceStub.EFetchRequest();
			seqReq.setId(proteinids[0]);
			seqReq.setDb("protein");
			EFetchSequenceServiceStub.EFetchResult seqRes = fetchSequence
					.run_eFetch(seqReq);
			// results output
			for (int i = 0; i < seqRes.getGBSet().getGBSetSequence().length;) {
				EFetchSequenceServiceStub.GBSeq_type0 obj = seqRes.getGBSet()
						.getGBSetSequence()[i].getGBSeq();
				proteinDetail.setOrganismName(obj.getGBSeq_organism());
				proteinDetail.setSource(obj.getGBSeq_source());
				proteinDetail.setDefinition(obj.getGBSeq_definition());
				break;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return proteinDetail;
	}

	private String[] queryDataBaseForTerm(String term, String dbname) {
		try {

			EUtilsServiceStub service = new EUtilsServiceStub();
			EUtilsServiceStub.ESearchRequest req = new EUtilsServiceStub.ESearchRequest();
			req.setTerm(term);
			req.setDb(dbname);
			EUtilsServiceStub.ESearchResult res = service.run_eSearch(req);
			return res.getIdList().getId();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String creatIdsString(final String[] ids) {
		if (ids == null)
			return null;
		int N = ids.length;
		String retId = null;
		for (int i = 0; i < N; i++) {
			if (i > 0)
				retId += ",";
			retId += ids[i];
		}
		return retId;
	}

	@Override
	public NcbiSnpDetailContainer getProteinSnpDetail(String refid) {
		final Sequence seq = sequenceDao.selectByRefId(refid);
		if (seq == null)
			return null;
		return getProteinSnpDetail(seq.getRefId(), seq.getVersion());
	}

	final String snpServiceUrl = "http://eutils.ncbi.nlm.nih.gov/"
			+ "entrez/eutils/efetch.fcgi?db=snp&id=%s&retmode=xml";

	@Override
	public NcbiSnpDetailContainer getProteinSnpDetail(final String refid,
			final Integer version) {

		final HttpClient client = new HttpClient();
		NcbiSnpDetailContainer ncbiContainer;
		final String refIdWithOutVersion = refid;
		final Map<Integer, NcbiSnpDetail> snpMap = new HashMap<Integer, NcbiSnpDetail>();
		try {
			// Search for PROTEINID in SNP
			final String[] id_array = queryDataBaseForTerm(refIdWithOutVersion
					+ "." + version + " AND \"missense\"[FXN_CLASS]", "snp");
			final String ids = creatIdsString(id_array);
			if (ids == null)
				return new NcbiSnpDetailContainer(0);
			ncbiContainer = new NcbiSnpDetailContainer(id_array.length);
			if (ids != null) {

				// DBSNP
				final String snpUrl = String.format(snpServiceUrl, ids);
				GetMethod method = new GetMethod(snpUrl);
				int statusCode = client.executeMethod(method);

				if (statusCode != HttpStatus.SC_OK) {
					throw new RuntimeException("Error: "
							+ method.getStatusLine());
				}

				// Read the response body.
				ExchangeSetDocument exchangeDoc;
				exchangeDoc = ExchangeSetDocument.Factory.parse(method
						.getResponseBodyAsString());
				System.out
						.println(exchangeDoc.getExchangeSet().getRsArray().length);
				// Extract Pos data

				ResultArray: for (int i = 0; i < exchangeDoc.getExchangeSet()
						.getRsArray().length; i++) {
					Rs result = exchangeDoc.getExchangeSet().getRsArray()[i];
					NcbiSnpDetail currentDetail = null;
					if ((currentDetail = snpMap.get(result.getRsId())) == null) {
						currentDetail = new NcbiSnpDetail();
						snpMap.put(result.getRsId(), currentDetail);
						currentDetail.setSnpid(result.getRsId());
					}
					if (result.getAssemblyArray() != null)
						for (int assid = 0; assid < result.getAssemblyArray().length; assid++) {
							Assembly ass = result.getAssemblyArray()[assid];
							if (ass.getComponentArray() != null)
								for (int compid = 0; compid < ass
										.getComponentArray().length; compid++) {
									Component comp = ass.getComponentArray()[compid];
									if (comp.getMapLocArray() != null)
										for (int mapid = 0; mapid < comp
												.getMapLocArray().length; mapid++) {
											MapLoc mapLoc = comp
													.getMapLocArray()[mapid];
											if (mapLoc.getFxnSetArray() != null)
												for (int fxnid = 0; fxnid < mapLoc
														.getFxnSetArray().length; fxnid++) {
													FxnSet set = mapLoc
															.getFxnSetArray()[fxnid];
													if (set.isSetProtAcc() == true)
														if (set.getProtAcc()
																.equals(refIdWithOutVersion) == true) {
															if (set.isSetFxnClass()) {

																Boolean effectValue = false;
																switch (set
																		.getFxnClass()
																		.intValue()) {
																case FxnClass.INT_REFERENCE:
																	continue;
																case FxnClass.INT_MISSENSE:
																case FxnClass.INT_NON_SYNONYMOUS_CODON:
																	effectValue = true;
																	break;
																}
																currentDetail
																		.setEffect(effectValue);
															}
															if (set.isSetAaPosition())
																currentDetail
																		.setPosition(set
																				.getAaPosition() + 1);// because
																										// ncbi
																										// is
																										// a
																										// null
																										// index
															if (set.isSetResidue())
																currentDetail
																		.setMutation(set
																				.getResidue()
																				.charAt(0));
															if (currentDetail
																	.isComplete()) {
																continue ResultArray;
															}
														}
												}
										}
								}
						}

				}
				// OMIIM
				EUtilsServiceStub service = new EUtilsServiceStub();
				EUtilsServiceStub.ELinkRequest reqOmim = new EUtilsServiceStub.ELinkRequest();
				reqOmim.setDb("omim");
				reqOmim.setDbfrom("snp");
				reqOmim.setId(id_array);
				EUtilsServiceStub.ELinkResult resOmim = service
						.run_eLink(reqOmim);
				for (int i = 0; i < resOmim.getLinkSet().length; i++) {
					LinkSetType links = resOmim.getLinkSet()[i];
					NcbiSnpDetail currentDetail = null;
					for (int k = 0; k < links.getIdList().getId().length; k++) {
						Integer key = Integer.parseInt(links.getIdList()
								.getId()[k].toString());

						if ((currentDetail = snpMap.get(key)) != null) {
							break;
						}

					}
					if (currentDetail != null) {
						// check if there is a link
						if (links.getLinkSetDb() != null
								&& links.getLinkSetDb().length > 0) {
							for (int omimid = 0; omimid < links.getLinkSetDb().length; omimid++) {
								LinkSetDbType omimlink = links.getLinkSetDb()[omimid];
								if (omimlink.getLink() != null) {
									for (int omimLinkId = 0; omimLinkId < omimlink
											.getLink().length; omimLinkId++) {
										LinkTypeE link = omimlink.getLink()[omimLinkId];
										currentDetail
												.addOmimEntry(new OmimEntry(
														link.getId().toString()));
									}
								}
							}
						}
					}
				}
			}
			for (Integer key : snpMap.keySet()) {
				ncbiContainer.addNcbiSnpDetail(snpMap.get(key));
			}

			return ncbiContainer;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
