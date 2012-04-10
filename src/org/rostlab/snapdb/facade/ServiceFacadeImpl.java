package org.rostlab.snapdb.facade;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.rostlab.snapdb.service.ProteinFunctionalEffectService;
import org.rostlab.snapdb.service.SearchProteinService;
import org.rostlab.snapdb.service.model.MutationsPos;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;

import com.sun.jersey.api.NotFoundException;

@Provider
@Path("/protein")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class ServiceFacadeImpl implements ServiceFacade {
	private ProteinFunctionalEffectService proteinFunctionalEffectService;
	private SearchProteinService searchProteinService;

	@Override
	@GET
	@Path("/prediction/{id}")
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			@PathParam("id") String id) {
		System.out.println("Call getFunctionalEffectPredcition: " + id);
		// ProteinFunctionalEffectPrediction pfep = new
		// ProteinFunctionalEffectPrediction();
		// pfep.setRefId("LALA");
		// pfep.setSequence("MKAQNLLKLTSPGPAPASCQHLQAQPLPHGGFSRPSSSSGLSLQAQLLLHNSLFWPSSCP");
		// Prediction p1=new Prediction();
		// p1.setConservation("01231051228590123850923185092135701239751293875120938571200");
		// p1.setType(PredictionType.SNAP);
		// p1.setReliability("01231051228590123850923185092135701239751293875120938571200");
		// pfep.addPrediction(p1);
		// return pfep;
		return proteinFunctionalEffectService
				.getFunctionalEffectPrediction(Long.parseLong(id));
	}

	@Override
	@POST
	@Path("/search")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ProteinId searchProtein(@FormParam("q") String searchString) {
		System.out.println("Search protein: " + searchString);
		ProteinId retId = searchProteinService.searchProtein(searchString);
		if (retId.getId() == null)
			throw new NotFoundException("");
		else
			return retId;
	}

	@Override
	@GET
	@Path("/mutations/{id}/{from}/{size}")
	public List<MutationsPos> getMutationList(@PathParam("id") String id,
			@PathParam("from") Integer from, @PathParam("size") Integer size) {
		System.out.println("Call getMutationList: " + id);
		return proteinFunctionalEffectService.getMutationList(
				Long.parseLong(id), from, size);
	}

	public ProteinFunctionalEffectService getProteinFunctionalEffectService() {
		return proteinFunctionalEffectService;
	}

	public SearchProteinService getSearchProteinService() {
		return searchProteinService;
	}

	public void setProteinFunctionalEffectService(
			ProteinFunctionalEffectService proteinFunctionalEffectService) {
		this.proteinFunctionalEffectService = proteinFunctionalEffectService;
	}

	public void setSearchProteinService(
			SearchProteinService searchProteinService) {
		this.searchProteinService = searchProteinService;
	}

}
