package org.rostlab.gemudb.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.rostlab.gemudb.dom.MutationType;
import org.rostlab.gemudb.service.FunctionalEffectService;
import org.rostlab.gemudb.service.ProteinDetailService;
import org.rostlab.gemudb.service.SearchProteinService;
import org.rostlab.gemudb.service.model.BadRequestException;
import org.rostlab.gemudb.service.model.ExternalMutationContainer;
import org.rostlab.gemudb.service.model.FunctionalEffectPrediction;
import org.rostlab.gemudb.service.model.MutationPos;
import org.rostlab.gemudb.service.model.MutationPosContainer;
import org.rostlab.gemudb.service.model.ProteinDetail;
import org.rostlab.gemudb.service.model.ProteinId;

import com.sun.jersey.api.NotFoundException;
import com.sun.jersey.spi.resource.Singleton;

@Provider
@Singleton
@Path("/v1")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class ServiceFacadeImpl implements ServiceFacade {
	private FunctionalEffectService functionalEffectService;
	private SearchProteinService searchProteinService;
	private ProteinDetailService proteinDetailService;
	final static String AMINOALPHABET = "ACDEFGHIKLMNPQRSTVWY";

	@Override
	@GET
	@Path("/{id}/functionaleffect/{type}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			@PathParam("id") String id, @PathParam("type") String type) {
		System.out.println("Call getFunctionalEffectPredcition: " + id);
		FunctionalEffectPrediction fp = functionalEffectService
				.getFunctionalEffectPrediction(id, MutationType.valueOf(type));
		if (fp != null) {
			return fp;
		} else {
			throw new BadRequestException();
		}
	}

	@Override
	@GET
	@Path("/{id}/functionaleffect/{alphabet}/{type}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			@PathParam("id") String id, @PathParam("type") String type,
			@PathParam("alphabet") String alphabet) {
		System.out.println("Call getFunctionalEffectPredcition: " + id
				+ " alphabet: " + alphabet);
		alphabet = alphabet.toUpperCase();
		for (int i = 0; i < alphabet.length(); i++) {
			if (AMINOALPHABET.contains(String.valueOf(alphabet.charAt(i))) == false) {
				throw new BadRequestException();
			}
		}
		;
		FunctionalEffectPrediction fp = functionalEffectService
				.getFunctionalEffectPrediction(id, MutationType.valueOf(type),
						alphabet);
		if (fp != null) {
			return fp;
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
	@Path("/{id}/functionaleffect/detail/{type}/{pos}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MutationPos getMutationList(@PathParam("id") String id,
			@PathParam("pos") Integer pos, @PathParam("type") String type) {
		System.out.println("Call getMutationList: " + id);
		System.out.println(functionalEffectService);
		MutationPosContainer posContainer = functionalEffectService
				.getFunctionalEffect(id, pos, MutationType.valueOf(type));
		final MutationPos retPos = posContainer.getMutationsPos().get(0);
		return retPos;
	}

	@Override
	@GET
	@Path("/{id}/functionaleffect/detail/{alphabet}/{type}/{pos}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MutationPos getMutationList(@PathParam("id") String id,
			@PathParam("pos") Integer pos, @PathParam("type") String type,
			@PathParam("alphabet") String alphabet) {
		System.out.println("Call getFunctionalEffectPredcition: " + id
				+ " alphabet: " + alphabet);
		alphabet = alphabet.toUpperCase();
		for (int i = 0; i < alphabet.length(); i++) {
			if (AMINOALPHABET.contains(String.valueOf(alphabet.charAt(i))) == false) {
				throw new BadRequestException();
			}
		}
		MutationPosContainer posContainer = functionalEffectService
				.getFunctionalEffect(id, pos, MutationType.valueOf(type),
						alphabet);
		final MutationPos retPos = posContainer.getMutationsPos().get(0);
		return retPos;
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

	public FunctionalEffectService getFunctionalEffectService() {
		return functionalEffectService;
	}

	public SearchProteinService getSearchProteinService() {
		return searchProteinService;
	}

	public void setFunctionalEffectService(
			FunctionalEffectService proteinFunctionalEffectService) {
		this.functionalEffectService = proteinFunctionalEffectService;
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
