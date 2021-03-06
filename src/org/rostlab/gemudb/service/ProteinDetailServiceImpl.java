package org.rostlab.gemudb.service;

import gov.nih.nlm.ncbi.snp.docsum.AssemblyDocument.Assembly;
import gov.nih.nlm.ncbi.snp.docsum.ComponentDocument.Component;
import gov.nih.nlm.ncbi.snp.docsum.ExchangeSetDocument;
import gov.nih.nlm.ncbi.snp.docsum.FxnSetDocument.FxnSet;
import gov.nih.nlm.ncbi.snp.docsum.FxnSetDocument.FxnSet.FxnClass;
import gov.nih.nlm.ncbi.snp.docsum.MapLocDocument.MapLoc;
import gov.nih.nlm.ncbi.snp.docsum.RsDocument.Rs;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchSequenceServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.EFetchRequest;
import gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.EFetchResult;
import gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequest;
import gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResult;
import gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetDbType;
import gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkSetType;
import gov.nih.nlm.ncbi.www.soap.eutils.elink.LinkType;
import gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequest;
import gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResult;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.rostlab.gemudb.dao.SequenceDao;
import org.rostlab.gemudb.dom.Sequence;
import org.rostlab.gemudb.service.model.ExternalMutationContainer;
import org.rostlab.gemudb.service.model.ExternalMutationDetail;
import org.rostlab.gemudb.service.model.ExternalMutationPos;
import org.rostlab.gemudb.service.model.OmimEntry;
import org.rostlab.gemudb.service.model.ProteinDetail;

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
			EFetchRequest fetchGenReq = new EFetchRequest();
			fetchGenReq.setId(genids[0]);
			EFetchResult fetchGenRes = fetchGen
					.run_eFetch(fetchGenReq);
			for (int i = 0; i < fetchGenRes.getEntrezgeneSet()
					.getEntrezgeneSetSequence().length;) {
				gov.nih.nlm.ncbi.www.soap.eutils.efetch_gene.Entrezgene_type0 obj = fetchGenRes.getEntrezgeneSet()
						.getEntrezgeneSetSequence()[i].getEntrezgene();
				proteinDetail.setOfficialGenFullName(obj.getEntrezgene_gene()
						.getGeneRef().getGeneRef_desc());
				proteinDetail.setOfficialGenSymbol(obj.getEntrezgene_gene()
						.getGeneRef().getGeneRef_locus());
				proteinDetail.setGenLocation(obj.getEntrezgene_gene()
						.getGeneRef().getGeneRef_maploc());
				break;
			}
			fetchGen.cleanup();
			final String[] proteinids = queryDataBaseForTerm(seq.getRefId(),
					"protein");
			EFetchSequenceServiceStub fetchSequence = new EFetchSequenceServiceStub();
			gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.EFetchRequest seqReq = new gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.EFetchRequest();
			seqReq.setId(proteinids[0]);
			seqReq.setDb("protein");
			gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.EFetchResult seqRes = fetchSequence
					.run_eFetch(seqReq);
			// results output
			for (int i = 0; i < seqRes.getGBSet().getGBSetSequence().length;) {
				gov.nih.nlm.ncbi.www.soap.eutils.efetch_seq.GBSeq_type0 obj = seqRes.getGBSet()
						.getGBSetSequence()[i].getGBSeq();
				proteinDetail.setOrganismName(obj.getGBSeq_organism());
				proteinDetail.setSource(obj.getGBSeq_source());
				proteinDetail.setDefinition(obj.getGBSeq_definition());
				break;
			}
			fetchSequence.cleanup();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return proteinDetail;
	}

	private String[] queryDataBaseForTerm(String term, String dbname) {
		try {

			EUtilsServiceStub service = new EUtilsServiceStub();
			ESearchRequest req = new ESearchRequest();
			req.setTerm(term);
			req.setDb(dbname);
			ESearchResult res = service.run_eSearch(req);
			service.cleanup();
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
	public ExternalMutationContainer getProteinExternalSnpDetail(String refid) {
		final Sequence seq = sequenceDao.selectByRefId(refid);
		if (seq == null)
			return null;
		return getProteinExternalSnpDetail(seq.getRefId(), seq.getVersion());
	}

	final private String snpServiceUrl = "http://eutils.ncbi.nlm.nih.gov/"
			+ "entrez/eutils/efetch.fcgi?db=snp&id=%s&retmode=xml";
	final private MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
	final HttpClient client = new HttpClient(connectionManager);

	@Override
	public ExternalMutationContainer getProteinExternalSnpDetail(
			final String refid, final Integer version) {

		GetMethod method = null;
		ExternalMutationContainer externalContainer;
		final String refIdWithOutVersion = refid;
		final Map<Integer, ExternalMutationDetail> snpMap = new HashMap<Integer, ExternalMutationDetail>();
		try {
			// Search for PROTEINID in SNP
			final String[] id_array = queryDataBaseForTerm(refIdWithOutVersion
					+ "." + version + " AND \"missense\"[FXN_CLASS]", "snp");
			final String ids = creatIdsString(id_array);
			if (ids == null)
				return new ExternalMutationContainer(0);
			externalContainer = new ExternalMutationContainer(id_array.length);
			if (ids != null) {
				final Date startDate = new Date();
				final Long startTimeSeconds = startDate.getTime() / 1000;
				// DBSNP
				final String snpUrl = String.format(snpServiceUrl, ids);
				Date nowDate = new Date();
				Long nowTimeSec = nowDate.getTime() / 1000;
				ExchangeSetDocument exchangeDoc = null;
				while (nowTimeSec - startTimeSeconds < 120) {
					method = new GetMethod(snpUrl);
					int statusCode = client.executeMethod(method);

					if (statusCode != HttpStatus.SC_OK) {
						throw new RuntimeException("Error: "
								+ method.getStatusLine());
					}

					// Read the response body.
					exchangeDoc = ExchangeSetDocument.Factory.parse(method
							.getResponseBodyAsString());
					if (exchangeDoc != null
							&& exchangeDoc.getExchangeSet() != null
							&& exchangeDoc.getExchangeSet().getRsArray() != null
							&& exchangeDoc.getExchangeSet().getRsArray().length != 0) {
						break;
					} else {
						nowDate = new Date();
						nowTimeSec = nowDate.getTime() / 1000;
					}
				}
				// Extract Pos data

				parseSnpResult(exchangeDoc, snpMap, refIdWithOutVersion);
				// OMIIM
				EUtilsServiceStub service = new EUtilsServiceStub();
				ELinkRequest reqOmim = new ELinkRequest();
				reqOmim.setDb("omim");
				reqOmim.setDbfrom("snp");
				reqOmim.setId(id_array);
				ELinkResult resOmim = service
						.run_eLink(reqOmim);
				parseOmimResult(resOmim, snpMap);
				service.cleanup();
			}
			TreeMap<Integer, List<ExternalMutationDetail>> posMap = new TreeMap<Integer, List<ExternalMutationDetail>>();
			for (Integer key : snpMap.keySet()) {
				List<ExternalMutationDetail> mutList = null;
				final ExternalMutationDetail md = snpMap.get(key);
				if ((mutList = posMap.get(md.getPosition())) == null) {
					mutList = new ArrayList<ExternalMutationDetail>();
					posMap.put(md.getPosition(), mutList);
				}
				mutList.add(md);
			}
			for (Integer key : posMap.keySet()) {
				externalContainer
						.addExternalMutationPos(new ExternalMutationPos(key,
								posMap.get(key)));
			}
			return externalContainer;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			// Release the connection.
			if (method != null)
				method.releaseConnection();
		}
	}

	private void parseOmimResult(ELinkResult resOmim,
			Map<Integer, ExternalMutationDetail> snpMap) {
		for (int i = 0; i < resOmim.getLinkSet().length; i++) {
			LinkSetType links = resOmim.getLinkSet()[i];
			ExternalMutationDetail currentDetail = null;
			for (int k = 0; k < links.getIdList().getId().length; k++) {
				Integer key = Integer.parseInt(links.getIdList().getId()[k]
						.toString());

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
								LinkType link = omimlink.getLink()[omimLinkId];
								currentDetail.addOmimEntry(new OmimEntry(link
										.getId().toString()));
							}
						}
					}
				}
			}
		}
	}

	private void parseSnpResult(final ExchangeSetDocument exchangeDoc,
			final Map<Integer, ExternalMutationDetail> snpMap,
			final String refIdWithOutVersion) {

		ResultArray: for (int i = 0; i < exchangeDoc.getExchangeSet()
				.getRsArray().length; i++) {
			Rs result = exchangeDoc.getExchangeSet().getRsArray()[i];
			ExternalMutationDetail currentDetail = null;
			if ((currentDetail = snpMap.get(result.getRsId())) == null) {
				currentDetail = new ExternalMutationDetail();
				snpMap.put(result.getRsId(), currentDetail);
				currentDetail.setSnpid(result.getRsId());
				currentDetail.setSource("NCBI");
			}
			if (result.getAssemblyArray() != null)
				for (int assid = 0; assid < result.getAssemblyArray().length; assid++) {
					Assembly ass = result.getAssemblyArray()[assid];
					if (ass.getComponentArray() != null)
						for (int compid = 0; compid < ass.getComponentArray().length; compid++) {
							Component comp = ass.getComponentArray()[compid];
							if (comp.getMapLocArray() != null)
								for (int mapid = 0; mapid < comp
										.getMapLocArray().length; mapid++) {
									MapLoc mapLoc = comp.getMapLocArray()[mapid];
									if (mapLoc.getFxnSetArray() != null)
										for (int fxnid = 0; fxnid < mapLoc
												.getFxnSetArray().length; fxnid++) {
											FxnSet set = mapLoc
													.getFxnSetArray()[fxnid];
											if (set.isSetProtAcc() == true)
												if (set.getProtAcc().equals(
														refIdWithOutVersion) == true) {
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
	}
}
