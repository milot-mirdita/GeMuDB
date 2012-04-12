package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;

public interface ProteinFunctionalEffectService {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(final String id);
	public MutationPosContainer getMutationList(final String id,final int from,final int size);
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(final String lid,
			final String alphabet);
}

