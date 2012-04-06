package org.rostlab.snapdb.facade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.rostlab.snapdb.dom.Prediction;
import org.rostlab.snapdb.dom.PredictionType;
import org.rostlab.snapdb.dom.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.ProteinFunctionalEffectService;
import org.rostlab.snapdb.service.SearchProteinService;

import com.google.gson.Gson;

@Provider
@Path("/protein")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceFacadeImpl implements ServiceFacade {
	private ProteinFunctionalEffectService proteinFunctionEffectService;
	private SearchProteinService searchProteinService;
	final private Gson gsonParser = new Gson();

	@Override
	@GET
	@Path( "/prediction/{id}")
	public String getFunctionlEffectPrediction(@PathParam("id") String id) {
		System.out.println(id);
		
		ProteinFunctionalEffectPrediction pfep = new ProteinFunctionalEffectPrediction();
		pfep.setRefId("LALA");
		pfep.setSequence("MKAQNLLKLTSPGPAPASCQHLQAQPLPHGGFSRPSSSSGLSLQAQLLLHNSLFWPSSCP");
		Prediction p1=new Prediction();
		p1.setConservation("01231051228590123850923185092135701239751293875120938571200");
		p1.setType(PredictionType.SNAP);
		p1.setReliability("01231051228590123850923185092135701239751293875120938571200");
		pfep.addPrediction(p1);
//		return gsonParser.toJson(proteinFunctionEffectService
//				.getFunctionlEffectPrediction(id));
		return gsonParser.toJson(pfep);
	}

	@Override
	@GET
	@Path("/search/{searchString}")
	public String searchProtein(@PathParam("searchString") String searchString) {
		System.out.println(searchString);
		return gsonParser.toJson(searchProteinService
				.searchProtein(searchString));
	}

	public ProteinFunctionalEffectService getProteinFunctionEffectService() {
		return proteinFunctionEffectService;
	}

	public SearchProteinService getSearchProteinService() {
		return searchProteinService;
	}

	public void setProteinFunctionEffectService(
			ProteinFunctionalEffectService proteinFunctionEffectService) {
		this.proteinFunctionEffectService = proteinFunctionEffectService;
	}

	public void setSearchProteinService(
			SearchProteinService searchProteinService) {
		this.searchProteinService = searchProteinService;
	}

}
