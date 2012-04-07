package org.rostlab.snapdb.service;

import org.rostlab.snapdb.service.model.ProteinId;

public interface SearchProteinService {
	public ProteinId searchProtein(final String searchString);
}
