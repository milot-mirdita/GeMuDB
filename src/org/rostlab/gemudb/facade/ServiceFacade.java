package org.rostlab.gemudb.facade;

import org.rostlab.gemudb.service.model.ExternalMutationContainer;
import org.rostlab.gemudb.service.model.FunctionalEffectPrediction;
import org.rostlab.gemudb.service.model.MutationPos;
import org.rostlab.gemudb.service.model.ProteinDetail;
import org.rostlab.gemudb.service.model.ProteinId;

public interface ServiceFacade {

	public ProteinId searchProtein(final String searchString);

	public MutationPos getMutationList(final String id, final Integer pos,
			final String type);

	public MutationPos getMutationList(String id, Integer pos, String type,
			String alphabet);

	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id, final String type, final String alphabet);

	public FunctionalEffectPrediction getFunctionalEffectPrediction(
			final String id, final String type);

	public ProteinDetail getProteinDetail(final String id);

	public ExternalMutationContainer getProteinSnpDetail(String refid);

}
