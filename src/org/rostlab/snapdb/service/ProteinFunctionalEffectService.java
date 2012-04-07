package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;

public interface ProteinFunctionalEffectService {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(final String id);
}

