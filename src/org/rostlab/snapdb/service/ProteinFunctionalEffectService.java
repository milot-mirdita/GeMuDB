package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;

public interface ProteinFunctionalEffectService {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(final Long id);
	public MutationPosContainer getMutationList(final Long id,int from,int size);
}

