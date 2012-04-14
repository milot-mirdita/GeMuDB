package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Proteinprediction")
@XmlType(propOrder = { "sequence", "prediction" })
public class ProteinFunctionalEffectPrediction {
	private String sequence;
	private List<Prediction> predictions = new ArrayList<Prediction>();

	@XmlElement(name = "sequence")
	public String getSequence() {
		return sequence;
	}

	@XmlElement(name = "predictions")
	public List<Prediction> getPrediction() {
		return predictions;
	}

	public void addPrediction(Prediction p) {
		predictions.add(p);
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
