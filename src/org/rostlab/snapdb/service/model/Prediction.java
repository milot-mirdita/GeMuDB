package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"type", "reliability", "conservation"})
public class Prediction {
	private PredictionType type;
	private String reliability;
	private String conservation;

	public PredictionType getType() {
		return type;
	}

	public String getReliability() {
		return reliability;
	}

	public String getConservation() {
		return conservation;
	}

	public void setType(PredictionType type) {
		this.type = type;
	}

	public void setReliability(String reliability) {
		this.reliability = reliability;
	}

	public void setConservation(String conservation) {
		this.conservation = conservation;
	}

}
