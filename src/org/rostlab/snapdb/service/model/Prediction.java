package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.rostlab.snapdb.dom.MutationType;

@XmlRootElement
@XmlType(propOrder={"type", "reliability", "conservation"})
public class Prediction {
	private MutationType type;
	private String reliability;
	private String conservation;

	public MutationType getType() {
		return type;
	}

	public String getReliability() {
		return reliability;
	}

	public String getConservation() {
		return conservation;
	}

	public void setType(MutationType mt) {
		this.type = mt;
	}

	public void setReliability(String reliability) {
		this.reliability = reliability;
	}

	public void setConservation(String conservation) {
		this.conservation = conservation;
	}

}
