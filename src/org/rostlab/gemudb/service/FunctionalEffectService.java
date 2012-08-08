package org.rostlab.gemudb.service;

import org.rostlab.gemudb.dom.MutationType;
import org.rostlab.gemudb.service.model.FunctionalEffectPrediction;
import org.rostlab.gemudb.service.model.MutationPosContainer;

public interface FunctionalEffectService {
	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id,final MutationType type);

	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final String lid, final MutationType type, final String alphabet);
	
	
	public MutationPosContainer getFunctionalEffect(final String id,
			final int pos, final MutationType type);


	public MutationPosContainer getFunctionalEffect(final String id, final Integer pos,
												   final MutationType type, final String alphabet);
}
