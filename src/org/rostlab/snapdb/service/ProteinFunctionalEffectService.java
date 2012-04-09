package org.rostlab.snapdb.service;

import java.util.List;

import org.rostlab.snapdb.service.model.MutationsPos;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;

public interface ProteinFunctionalEffectService {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(final Long id);
	public List<MutationsPos> getMutationList(final Long id,int from,int size);
}

