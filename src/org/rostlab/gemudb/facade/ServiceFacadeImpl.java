package org.rostlab.gemudb.facade;

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

import org.rostlab.gemudb.dom.MutationType;
import org.rostlab.gemudb.service.FunctionalEffectService;
import org.rostlab.gemudb.service.ProteinDetailService;
import org.rostlab.gemudb.service.SearchProteinService;
import org.rostlab.gemudb.service.model.BadRequestException;
import org.rostlab.gemudb.service.model.ExternalMutationContainer;
import org.rostlab.gemudb.service.model.FunctionalEffectPrediction;
import org.rostlab.gemudb.service.model.MutationPos;
import org.rostlab.gemudb.service.model.MutationPosContainer;
import org.rostlab.gemudb.service.model.NotFoundException;
import org.rostlab.gemudb.service.model.ProteinDetail;
import org.rostlab.gemudb.service.model.ProteinId;

import com.sun.jersey.spi.resource.Singleton;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Provider
@Singleton
@Path("/v1")
@Api(value = "v1", description="Gene Mutation Database")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class ServiceFacadeImpl implements ServiceFacade {
	private FunctionalEffectService functionalEffectService;
	private SearchProteinService searchProteinService;
	private ProteinDetailService proteinDetailService;
	final static String AMINOALPHABET = "ACDEFGHIKLMNPQRSTVWY";

	@Override
	@GET
	@Path("/{id}/functionaleffect/{type}")
	@ApiOperation(value = "Get the predicted functional effects of a protein", notes = "Filters by functional effect prediction types.", response = FunctionalEffectPrediction.class)
	@ApiResponses(value = {
	  @ApiResponse(code = 400, message = "Parameter Error"),
	  @ApiResponse(code = 200, message = "FunctionalEffectPrediction") 
	})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final
			@PathParam("id")
			@ApiParam(
					value = "The canonical RefSeq protein accession.", 
					required = true
			)
			String id,
			final
			@PathParam("type")
			@ApiParam(
					value = "A comma seperated string containing all functional effect prediction types that should be returned.",
					allowableValues = "SIFT,SNAP",
					required = true
			)
			String type) {
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
	@ApiOperation(value = "Get the predicted functional effects of a protein", notes = "Filters by alphabet of amino acid one letter codes.", response = FunctionalEffectPrediction.class)
	@ApiResponses(value = {
	  @ApiResponse(code = 400, message = "Parameter Error"),
	  @ApiResponse(code = 200, message = "FunctionalEffectPrediction") 
	})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final 
			@PathParam("id") 
			@ApiParam(
					value = "The canonical RefSeq protein accession.", 
					required = true
			)
			String id,
			final
			@PathParam("type")
			@ApiParam(
					value = "A comma seperated string containing all functional effect prediction types that should be returned.",
					allowableValues = "SIFT,SNAP",
					required = true
			)
			String type,
			final 
			@PathParam("alphabet")
			@ApiParam(
					value = "A string containing the one letter codes of all aminoacids that should return functional effect predictions.", 
					required = true
			)
			String alphabet) {
		final String uppercase = alphabet.toUpperCase();
		System.out.println("Call getFunctionalEffectPredcition: " + id
				+ " alphabet: " + uppercase);
		
		for (int i = 0; i < uppercase.length(); i++) {
			if (AMINOALPHABET.contains(String.valueOf(uppercase.charAt(i))) == false) {
				throw new BadRequestException();
			}
		}
		
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
	@ApiOperation(value = "Search protein by query", notes = "Search method that can either fetch a response directly or use the PICR webservice to map any accessions to the canonical RefSeq accession.", response = ProteinId.class)
	@ApiResponses(value = {
	  @ApiResponse(code = 404, message = "Protein not found."),
	  @ApiResponse(code = 200, message = "ProteinId") 
	})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ProteinId searchProtein(
			final 
			@ApiParam(
					value = "The query to search by. Query can be a protein accession or amino acid sequence.", 
					required = true
			)
			@FormParam("q") 
			String searchString) {
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
	@ApiOperation(value = "Get the details of functional effect prediction", notes = "Returned effects are filtered by position and function effect prediction type.", response = MutationPosContainer.class)
	@ApiResponses(value = {
	  @ApiResponse(code = 404, message = "MutationPos not found."),
	  @ApiResponse(code = 200, message = "MutationPos") 
	})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MutationPos getMutationList(
			final
			@PathParam("id")
			@ApiParam(
					value = "The canonical RefSeq protein accession.", 
					required = true
			)
			String id,
			@ApiParam(
					value = "The position in the protein that should be returned.", 
					required = true
			)
			final
			@PathParam("pos")
			Integer pos,
			final
			@PathParam("type")
			@ApiParam(
					value = "A comma seperated string containing all functional effect prediction types that should be returned.",
					allowableValues = "SIFT,SNAP",
					required = true
			)
			String type) {
		System.out.println("Call getMutationList: " + id);
		MutationPosContainer posContainer = functionalEffectService
				.getFunctionalEffect(id, pos, MutationType.valueOf(type));
		
		final List<MutationPos> retPos = posContainer.getMutationsPos();
		if (retPos.size() == 0) {
			throw new NotFoundException("");
		} else {
			return retPos.get(0);
		}
	}

	@Override
	@GET
	@Path("/{id}/functionaleffect/detail/{alphabet}/{type}/{pos}")
	@ApiOperation(value = "Get the details of functional effect prediction", notes = "Returned effects are filtered by position, alphabet of amino acid one letter codes and function effect prediction type.", response = MutationPosContainer.class)
	@ApiResponses(value = {
	  @ApiResponse(code = 400, message = "Parameter Error"),
	  @ApiResponse(code = 404, message = "MutationPos not found."),
	  @ApiResponse(code = 200, message = "MutationPos") 
	})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public MutationPos getMutationList(
			final
			@PathParam("id")
			@ApiParam(
					value = "The canonical RefSeq protein accession.", 
					required = true
			)
			String id,
			final
			@PathParam("pos")
			@ApiParam(
					value = "The position in the protein that should be returned.", 
					required = true
			)
			Integer pos,
			final
			@PathParam("type")
			@ApiParam(
					value = "A comma seperated string containing all functional effect prediction types that should be returned.",
					allowableValues = "SIFT,SNAP",
					required = true
			)
			String type,
			final
			@PathParam("alphabet")
			@ApiParam(
					value = "A string containing the one letter codes of all aminoacids that should return functional effect predictions.", 
					required = true
			)
			String alphabet) {
		final String uppercase = alphabet.toUpperCase();
		System.out.println("Call getFunctionalEffectPredcition: " + id
				+ " alphabet: " + uppercase);
		for (int i = 0; i < uppercase.length(); i++) {
			if (AMINOALPHABET.contains(String.valueOf(uppercase.charAt(i))) == false) {
				throw new BadRequestException();
			}
		}
		MutationPosContainer posContainer = functionalEffectService
				.getFunctionalEffect(id, pos, MutationType.valueOf(type),
						alphabet);
		
		final List<MutationPos> retPos = posContainer.getMutationsPos();
		if (retPos.size() == 0) {
			throw new NotFoundException("");
		} else {
			return retPos.get(0);
		}
	}

	@Override
	@GET
	@Path("/detail/{id}")
	@ApiOperation(
		value = "Get aggregated common details of a protein", 
		notes = "Protein details are fetched from the NCBI Entrez webservices.", 
		response = ProteinDetail.class
	)
	@ApiResponses(value = {
	  @ApiResponse(code = 400, message = "Parameter Error"),
	  @ApiResponse(code = 200, message = "ProteinDetail") 
	})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ProteinDetail getProteinDetail(
			final
			@PathParam("id")
			@ApiParam(
					value = "The canonical RefSeq protein accession.", 
					required = true
			)
			String refid) {
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
	@ApiOperation(
			value = "Get verified mutations", 
			notes = "Protein verified mutations are fetched from the NCBI dbSNP webservice.", 
			response = ExternalMutationContainer.class
		)
		@ApiResponses(value = {
		  @ApiResponse(code = 400, message = "Parameter Error"),
		  @ApiResponse(code = 404, message = "ExternalMutationContainer not found."),
		  @ApiResponse(code = 200, message = "ExternalMutationContainer") 
		})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public ExternalMutationContainer getProteinSnpDetail(
			final
			@PathParam("id")
			@ApiParam(
					value = "The canonical RefSeq protein accession.", 
					required = true
			)
			String refid) {
		System.out.println("Call getProteinSnpDetail: " + refid);

		ExternalMutationContainer nsdc = proteinDetailService
				.getProteinExternalSnpDetail(refid);

		if (nsdc == null) {
			throw new BadRequestException();
		} else if (nsdc.getExternalMutationPosition().size() == 0) {
			throw new NotFoundException("");
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
