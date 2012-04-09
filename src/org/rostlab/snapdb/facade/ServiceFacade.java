package org.rostlab.snapdb.facade;

import java.util.List;

import javax.ws.rs.PathParam;

import org.rostlab.snapdb.service.model.MutationsPos;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;

public interface ServiceFacade {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			String id);

	public ProteinId searchProtein(String searchString);

	List<MutationsPos> getMutationList(String id, Integer from, Integer size);
}
