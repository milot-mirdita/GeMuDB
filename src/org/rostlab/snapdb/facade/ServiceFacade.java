package org.rostlab.snapdb.facade;

import java.util.List;

import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.MutationsPos;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;

public interface ServiceFacade {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			String id);

	public ProteinId searchProtein(String searchString);

	MutationPosContainer getMutationList(String id, Integer from, Integer size);
}
