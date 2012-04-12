import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchGeneServiceStub.Entrezgene_type0;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchSequenceServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EFetchSnpServiceStub;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceStub;

import org.junit.Test;

public class GetOmimInformation {

	@Test
	public void testProteinToGen() {
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();

			EUtilsServiceStub.ESearchRequest req = new EUtilsServiceStub.ESearchRequest();
			req.setTerm("NP_064582.2");
			req.setDb("gene");
			EUtilsServiceStub.ESearchResult res = service.run_eSearch(req);
			// results output
			int N = res.getIdList().getId().length;
			String ids = "";
			for (int i = 0; i < N; i++) {
				if (i > 0)
					ids += ",";
				ids += res.getIdList().getId()[i];
			}
			System.out.println("Search in Gen " + res.getCount() + " hits");
			System.out.println("Search links in nuccore for the first " + N
					+ " UIDs: " + ids);
			System.out.println();

			EFetchGeneServiceStub fetchGen = new EFetchGeneServiceStub();
			EFetchGeneServiceStub.EFetchRequest fetchGenReq = new EFetchGeneServiceStub.EFetchRequest();
			fetchGenReq.setId(res.getIdList().getId()[0]);
			EFetchGeneServiceStub.EFetchResult fetchGenRes = fetchGen.run_eFetch(fetchGenReq);
			for (int i = 0; i < fetchGenRes.getEntrezgeneSet().getEntrezgeneSetSequence().length; i++) {
				Entrezgene_type0 obj = fetchGenRes.getEntrezgeneSet().getEntrezgeneSetSequence()[i].getEntrezgene();
				System.out.print("Official Full Name: ");	
				System.out.println(obj.getEntrezgene_gene().getGeneRef().getGeneRef_desc());
				System.out.print("Official Symbol: ");
				System.out.println(obj.getEntrezgene_gene().getGeneRef().getGeneRef_locus());
				System.out.print("Location: ");
				System.out.println(obj.getEntrezgene_gene().getGeneRef().getGeneRef_maploc());
			}
		} catch (Exception e) {

		}
	}

	@Test
	public void testSnpToOmim() {
		// http://www.biostars.org/post/show/5636/how-to-get-the-omim-id-for-a-dbsnp-entry/
		final String url = "http://eutils.ncbi.nlm.nih.gov/entrez/eutils/elink.fcgi?dbfrom=snp&id=121965089&db=omim";
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();

			EUtilsServiceStub.ESearchRequest req = new EUtilsServiceStub.ESearchRequest();
			req.setTerm("NP_064582.2");
			req.setDb("snp");
			EUtilsServiceStub.ESearchResult res = service.run_eSearch(req);
			// results output
			int N = res.getIdList().getId().length;
			String ids = "";
			for (int i = 0; i < N; i++) {
				if (i > 0)
					ids += ",";
				ids += res.getIdList().getId()[i];
			}
			System.out.println("Search in PubMed for \"cat\" returned "
					+ res.getCount() + " hits");
			System.out.println("Search links in nuccore for the first " + N
					+ " UIDs: " + ids);
			System.out.println();
			EFetchSnpServiceStub fetchService = new EFetchSnpServiceStub();
			EFetchSnpServiceStub.EFetchRequest reqIdSnp = new EFetchSnpServiceStub.EFetchRequest();
			reqIdSnp.setId(res.getIdList().getId()[0]);
			EFetchSnpServiceStub.EFetchResult resIdSnp = fetchService.run_eFetch(reqIdSnp);
			// results output
			// for (int i = 0; i < resIdSnp.getExchangeSet().get().length; i++)
			// {
			// EFetchSequenceServiceStub.GBSeq_type0 obj = resIdSnp.getGBSet()
			// .getGBSetSequence()[i].getGBSeq();
			// System.out.println("Organism: " + obj.getGBSeq_organism());
			// System.out.println("Locus: " + obj.getGBSeq_locus());
			// System.out.println("Definition: " + obj.getGBSeq_definition());
			// System.out
			// .println("------------------------------------------");
			// }

			EUtilsServiceStub.ELinkRequest reqOmim = new EUtilsServiceStub.ELinkRequest();
			reqOmim.setDb("omim");
			reqOmim.setDbfrom("snp");
			reqOmim.setId(res.getIdList().getId());
			EUtilsServiceStub.ELinkResult resOmim = service.run_eLink(reqOmim);

			for (int i = 0; i < resOmim.getLinkSet().length; i++) {
				System.out.print("Links from "
						+ resOmim.getLinkSet()[i].getDbFrom());
				System.out.println(" to "
						+ resOmim.getLinkSet()[i].getLinkSetDb()[0].getDbTo());
				System.out.print("  " + resOmim.getLinkSet()[i].getDbFrom()
						+ " id(s): ");
				for (int k = 0; k < resOmim.getLinkSet()[i].getIdList().getId().length; k++) {
					System.out.print(resOmim.getLinkSet()[i].getIdList()
							.getId()[k].getString() + " ");
				}
				System.out.println();
				System.out.print("  "
						+ resOmim.getLinkSet()[i].getLinkSetDb()[0].getDbTo()
						+ " id(s): ");
				for (int k = 0; k < resOmim.getLinkSet()[i].getLinkSetDb()[0]
						.getLink().length; k++) {
					System.out.print(resOmim.getLinkSet()[i].getLinkSetDb()[0]
							.getLink()[k].getId().getString() + " ");
				}
				System.out.println("\n----------------------");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void test() {
		// eInfo utility returns a list of available databases
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();

			// call NCBI EInfo utility
			EUtilsServiceStub.EInfoRequest req = new EUtilsServiceStub.EInfoRequest();
			EUtilsServiceStub.EInfoResult res = service.run_eInfo(req);
			// results output
			for (int i = 0; i < res.getDbList().getDbName().length; i++) {
				System.out.println(res.getDbList().getDbName()[i]);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void testQuery() {
		// run_eGquery provides Entrez database counts for a single search
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();
			// call NCBI eGQuery utility
			EUtilsServiceStub.EGqueryRequest req = new EUtilsServiceStub.EGqueryRequest();
			req.setTerm("mouse");
			EUtilsServiceStub.Result res = service.run_eGquery(req);
			// results output
			System.out.println("Search term: " + res.getTerm());
			System.out.println("Results: ");
			for (int i = 0; i < res.getEGQueryResult().getResultItem().length; i++) {
				System.out.println("  "
						+ res.getEGQueryResult().getResultItem()[i].getDbName()
						+ ": "
						+ res.getEGQueryResult().getResultItem()[i].getCount());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void ESummary() {
		// eInfo utility returns a list of available databases
		System.out.println("ESummary");
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();
			// call NCBI ESummary utility
			EUtilsServiceStub.ESummaryRequest req = new EUtilsServiceStub.ESummaryRequest();
			req.setDb("nucleotide");
			req.setId("28864546,28800981");
			EUtilsServiceStub.ESummaryResult res = service.run_eSummary(req);
			// results output
			for (int i = 0; i < res.getDocSum().length; i++) {
				System.out.println("ID: " + res.getDocSum()[i].getId());
				for (int k = 0; k < res.getDocSum()[i].getItem().length; k++) {
					System.out.println("    "
							+ res.getDocSum()[i].getItem()[k].getName() + ": "
							+ res.getDocSum()[i].getItem()[k].getItemContent());
				}
			}
			System.out.println("-----------------------\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void testELink() {
		System.out.println("testELink");
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();
			// call NCBI ELink utility
			EUtilsServiceStub.ELinkRequest req = new EUtilsServiceStub.ELinkRequest();
			req.setDb("protein");
			req.setDbfrom("nuccore");
			req.setId(new String[] { "48819,7140345" });
			EUtilsServiceStub.ELinkResult res = service.run_eLink(req);
			// results output
			for (int i = 0; i < res.getLinkSet().length; i++) {
				System.out.print("Links from "
						+ res.getLinkSet()[i].getDbFrom());
				System.out.println(" to "
						+ res.getLinkSet()[i].getLinkSetDb()[0].getDbTo());
				System.out.print("  " + res.getLinkSet()[i].getDbFrom()
						+ " id(s): ");
				for (int k = 0; k < res.getLinkSet()[i].getIdList().getId().length; k++) {
					System.out.print(res.getLinkSet()[i].getIdList().getId()[k]
							.getString() + " ");
				}
				System.out.println();
				System.out.print("  "
						+ res.getLinkSet()[i].getLinkSetDb()[0].getDbTo()
						+ " id(s): ");
				for (int k = 0; k < res.getLinkSet()[i].getLinkSetDb()[0]
						.getLink().length; k++) {
					System.out.print(res.getLinkSet()[i].getLinkSetDb()[0]
							.getLink()[k].getId().getString() + " ");
				}
				System.out.println("\n----------------------");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void testSpell() {
		// retrieves spelling suggestions
		System.out.println("testSpell");
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();
			// call NCBI ESpell utility
			EUtilsServiceStub.ESpellRequest req = new EUtilsServiceStub.ESpellRequest();
			req.setDb("pubmed");
			req.setTerm("mouss");
			EUtilsServiceStub.ESpellResult res = service.run_eSpell(req);
			// results output
			System.out.println("Misspelled word: " + res.getQuery());
			System.out.println("Corrected word: " + res.getCorrectedQuery());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test
	public void testFlow() {
		String[] ids = { "" };
		String fetchIds = "";
		// STEP #1: search in PubMed for "cat"
		//

		System.out.println("testFlow");
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();
			// call NCBI ESearch utility
			EUtilsServiceStub.ESearchRequest req = new EUtilsServiceStub.ESearchRequest();
			req.setDb("pubmed");
			req.setTerm("cat+AND+pubmed_nuccore[sb]");
			req.setSort("PublicationDate");
			req.setRetMax("5");
			EUtilsServiceStub.ESearchResult res = service.run_eSearch(req);
			// results output
			int N = res.getIdList().getId().length;
			ids[0] = "";
			for (int i = 0; i < N; i++) {
				if (i > 0)
					ids[0] += ",";
				ids[0] += res.getIdList().getId()[i];
			}
			System.out.println("Search in PubMed for \"cat\" returned "
					+ res.getCount() + " hits");
			System.out.println("Search links in nuccore for the first " + N
					+ " UIDs: " + ids[0]);
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// STEP #2: get links in nucleotide database (nuccore)
		//
		try {
			EUtilsServiceStub service = new EUtilsServiceStub();
			// call NCBI ELink utility
			EUtilsServiceStub.ELinkRequest req = new EUtilsServiceStub.ELinkRequest();
			req.setDb("nuccore");
			req.setDbfrom("pubmed");
			req.setId(ids);
			EUtilsServiceStub.ELinkResult res = service.run_eLink(req);
			for (int i = 0; i < res.getLinkSet()[0].getLinkSetDb()[0].getLink().length; i++) {
				if (i > 0)
					fetchIds += ",";
				fetchIds += res.getLinkSet()[0].getLinkSetDb()[0].getLink()[i]
						.getId().getString();
			}
			System.out
					.println("ELink returned the following UIDs from nuccore: "
							+ fetchIds);
			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// STEP #3: fetch records from nuccore
		//
		try {
			EFetchSequenceServiceStub service = new EFetchSequenceServiceStub();
			// call NCBI EFetch utility
			EFetchSequenceServiceStub.EFetchRequest req = new EFetchSequenceServiceStub.EFetchRequest();
			req.setDb("nuccore");
			req.setId(fetchIds);
			EFetchSequenceServiceStub.EFetchResult res = service
					.run_eFetch(req);
			// results output
			for (int i = 0; i < res.getGBSet().getGBSetSequence().length; i++) {
				EFetchSequenceServiceStub.GBSeq_type0 obj = res.getGBSet()
						.getGBSetSequence()[i].getGBSeq();
				System.out.println("Organism: " + obj.getGBSeq_organism());
				System.out.println("Locus: " + obj.getGBSeq_locus());
				System.out.println("Definition: " + obj.getGBSeq_definition());
				System.out
						.println("------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}