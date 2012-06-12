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

import org.rostlab.snapdb.service.ProteinDetailService;
import org.rostlab.snapdb.service.ProteinFunctionalEffectService;
import org.rostlab.snapdb.service.SearchProteinService;
import org.rostlab.snapdb.service.model.BadRequestException;
import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.ExternalMutationContainer;
import org.rostlab.snapdb.service.model.ProteinDetail;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;

import com.sun.jersey.api.NotFoundException;
import com.sun.jersey.spi.resource.Singleton;

@Provider
@Singleton
@Path("/protein")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class ServiceFacadeImpl implements ServiceFacade {
	private ProteinFunctionalEffectService proteinFunctionalEffectService;
	private SearchProteinService searchProteinService;
	private ProteinDetailService proteinDetailService;

	@Override
	@GET
	@Path("/prediction/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			@PathParam("id") String id) {
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
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			@PathParam("id") String id, @PathParam("alphabet") String alphabet) {
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
				.getFunctionalEffectPrediction(id, alphabet);
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
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ProteinId searchProtein(@FormParam("q") String searchString) {
		System.out.println("Search protein: " + searchString);
		ProteinId retId = searchProteinService.searchProtein(searchString);
		if (retId.getRefId() == null)
			throw new NotFoundException("");
		else
			return retId;
	}

	@Override
	@GET
	@Path("/mutations/{id}/{from}/{size}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MutationPosContainer getMutationList(@PathParam("id") String id,
			@PathParam("from") Integer from, @PathParam("size") Integer size) {
		System.out.println("Call getMutationList: " + id);
		System.out.println(proteinFunctionalEffectService);
		MutationPosContainer posContainer = proteinFunctionalEffectService
				.getMutationList(id, from, size);
		System.out.println(posContainer);
		if (posContainer == null)
			throw new BadRequestException();
		else
			return posContainer;
	}

	@Override
	@GET
	@Path("/mutations/{id}/{from}/{size}/{alphabet}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MutationPosContainer getMutationList(@PathParam("id") String id,
			@PathParam("from") Integer from, @PathParam("size") Integer size,
			@PathParam("alphabet") String alphabet) {
		System.out.println("Call getFunctionalEffectPredcition: " + id
				+ " alphabet: " + alphabet);
		alphabet = alphabet.toUpperCase();
		for (int i = 0; i < alphabet.length(); i++) {
			if ("ACDEFGHIKLMNPQRSTVWY".contains(String.valueOf(alphabet
					.charAt(i))) == false) {
				throw new BadRequestException();
			}
		}
		MutationPosContainer posContainer = proteinFunctionalEffectService
				.getMutationList(id, from, size,alphabet);
		if (posContainer == null)
			throw new BadRequestException();
		else
			return posContainer;
	}

	@Override
	@GET
	@Path("/detail/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ProteinDetail getProteinDetail(@PathParam("id") String refid) {
		System.out.println("Call getProteinDetail: " + refid);
		ProteinDetail pd = proteinDetailService.getProteinDetail(refid);
		if (pd == null) {
			throw new BadRequestException();
		} else {
			return pd;
		}
	}

	@Override
	@GET
	@Path("/externalsnp/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ExternalMutationContainer getProteinSnpDetail(
			@PathParam("id") String refid) {
		System.out.println("Call getProteinSnpDetail: " + refid);

		ExternalMutationContainer nsdc = proteinDetailService
				.getProteinExternalSnpDetail(refid);

		if (nsdc == null) {
			throw new BadRequestException();
		} else if (nsdc.getExternalMutationPosition().size() == 0) {
			throw new NotFoundException();
		} else {
			return nsdc;
		}
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

	public ProteinDetailService getProteinDetailService() {
		return proteinDetailService;
	}

	public void setProteinDetailService(
			ProteinDetailService proteinDetailService) {
		this.proteinDetailService = proteinDetailService;
	}

}
