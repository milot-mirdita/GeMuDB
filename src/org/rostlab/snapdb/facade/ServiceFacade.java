package org.rostlab.snapdb.facade;

import org.rostlab.snapdb.service.model.MutationPosContainer;
import org.rostlab.snapdb.service.model.ExternalMutationContainer;
import org.rostlab.snapdb.service.model.ProteinDetail;
import org.rostlab.snapdb.service.model.ProteinFunctionalEffectPrediction;
import org.rostlab.snapdb.service.model.ProteinId;

public interface ServiceFacade {
	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id);

	public ProteinId searchProtein(final String searchString);

	public MutationPosContainer getMutationList(final String id,
			final Integer from, final Integer size);

	public ProteinFunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id, final String alphabet);

	public ProteinDetail getProteinDetail(final String id);

	public ExternalMutationContainer getProteinSnpDetail(String refid);
}
