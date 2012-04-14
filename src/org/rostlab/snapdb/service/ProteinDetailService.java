package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.ExternalMutationContainer;
import org.rostlab.snapdb.service.model.ProteinDetail;

public interface ProteinDetailService {
	public ProteinDetail getProteinDetail(final String id);
	public ExternalMutationContainer getProteinExternalSnpDetail(final String id);
	public ExternalMutationContainer getProteinExternalSnpDetail(String refid, Integer version);
}
