package org.rostlab.snapdb.service.model;

public class OmimEntry {
	private String linkid;

	public OmimEntry(String id) {
		this.linkid = id;
	}

	public String getLinkId() {
		return linkid;
	}
}
