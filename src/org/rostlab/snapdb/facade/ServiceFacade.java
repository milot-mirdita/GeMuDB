package org.rostlab.snapdb.facade;

import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;

public interface ServiceFacade {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			Long id);

	public ProteinId searchProtein(String searchString);

	MutationPosContainer getMutationList(Long id, Integer from, Integer size);

	ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(Long id,
			String alphabet);
}
