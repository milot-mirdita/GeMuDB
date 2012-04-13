package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.NcbiSnpDetailContainer;
import org.rostlab.snapdb.service.model.ProteinDetail;

public interface ProteinDetailService {
	public ProteinDetail getProteinDetail(final String id);
	public NcbiSnpDetailContainer getProteinSnpDetail(final String id);
	public NcbiSnpDetailContainer getProteinSnpDetail(String refid, Integer version);
}
