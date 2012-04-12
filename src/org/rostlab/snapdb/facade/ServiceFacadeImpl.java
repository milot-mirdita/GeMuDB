package org.rostlab.snapdb.facade;

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
import org.rostlab.snapdb.service.model.BadRequestException;
import org.rostlab.snapdb.service.model.MutationPosContainer;
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
			@PathParam("id") Long id) {
		System.out.println("Call getFunctionalEffectPredcition: " + id);
		ProteinFunctionalEffectPrediction pfep = proteinFunctionalEffectService
				.getFunctionalEffectPrediction(id);
		if (pfep != null) {
			return pfep;
		} else {
			throw new BadRequestException();
		}
	}

	@Override
	@GET
	@Path("/prediction/{id}/{alphabet}")
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			@PathParam("id") Long id, @PathParam("alphabet") String alphabet) {
		System.out.println("Call getFunctionalEffectPredcition: " + id
				+ " alphabet: " + alphabet);
		alphabet = alphabet.toUpperCase();
		for (int i = 0; i < alphabet.length(); i++) {
			if ("ACDEFGHIKLMNPQRSTVWY".contains(String.valueOf(alphabet
					.charAt(i))) == false) {
				throw new BadRequestException();
			}
		}
		;
		ProteinFunctionalEffectPrediction pfep = proteinFunctionalEffectService
				.getFunctionalEffectPrediction(id);
		if (pfep != null) {
			return pfep;
		} else {
			throw new BadRequestException();
		}
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
	public MutationPosContainer getMutationList(@PathParam("id") Long id,
			@PathParam("from") Integer from, @PathParam("size") Integer size) {
		System.out.println("Call getMutationList: " + id);
		return proteinFunctionalEffectService.getMutationList(id, from, size);
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
