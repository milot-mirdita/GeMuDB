package org.rostlab.gemudb.service.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.rostlab.gemudb.dom.MutationType;

@XmlRootElement
@XmlType(propOrder = {  "type", "reliability", "conservation", "sequence" })
public class FunctionalEffectPrediction {
	private MutationType type;
	private String reliability;
	private String conservation;
	private String sequence;

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

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
