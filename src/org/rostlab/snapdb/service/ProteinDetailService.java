package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.ExternalSnpDetailContainer;
import org.rostlab.snapdb.service.model.ProteinDetail;

public interface ProteinDetailService {
	public ProteinDetail getProteinDetail(final String id);
	public ExternalSnpDetailContainer getProteinExternalSnpDetail(final String id);
	public ExternalSnpDetailContainer getProteinExternalSnpDetail(String refid, Integer version);
}
