package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.ProteinDetail;
import org.rostlab.snapdb.service.model.NcbiSnpDetail;

public interface ProteinDetailService {
	public ProteinDetail getProteinDetail(final String id);
	public NcbiSnpDetail getProteinSnpDetail(final String id);
}
