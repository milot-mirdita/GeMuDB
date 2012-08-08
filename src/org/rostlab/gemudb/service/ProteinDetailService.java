package org.rostlab.gemudb.service;

import org.rostlab.gemudb.service.model.ExternalMutationContainer;
import org.rostlab.gemudb.service.model.ProteinDetail;

public interface ProteinDetailService {
	public ProteinDetail getProteinDetail(final String id);
	public ExternalMutationContainer getProteinExternalSnpDetail(final String id);
	public ExternalMutationContainer getProteinExternalSnpDetail(String refid, Integer version);
}
