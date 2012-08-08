package org.rostlab.gemudb.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OmimEntry {
	private String linkid;

	public OmimEntry() {
	}

	public OmimEntry(String id) {
		this.linkid = id;
	}
	@XmlElement
	public String getLinkId() {
		return linkid;
	}
}
