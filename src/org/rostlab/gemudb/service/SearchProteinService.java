package org.rostlab.gemudb.service;

import org.rostlab.gemudb.service.model.ProteinId;

public interface SearchProteinService {
	public ProteinId searchProtein(final String searchString);
}
