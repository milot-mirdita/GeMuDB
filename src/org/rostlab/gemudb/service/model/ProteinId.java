package org.rostlab.gemudb.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Proteinid")
public class ProteinId {
	private String refId;

	public ProteinId() {
	}

	public ProteinId(String id) {
		this.refId = id;
	}

	@XmlElement(name = "refid")
	public String getRefId() {
		return refId;
	}

	public void setId(String id) {
		this.refId = id;
	}

}
