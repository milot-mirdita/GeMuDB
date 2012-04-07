package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name ="Proteinprediction")
@XmlType(propOrder={"refId", "sequence", "prediction"})
public class ProteinFunctionalEffectPrediction {
	private String refid;
	private String sequence;
	private List<Prediction> predictions = new ArrayList<Prediction>();

	@XmlElement(name = "refid")
	public String getRefId() {
		return refid;
	}
	@XmlElement(name = "sequence")
	public String getSequence() {
		return sequence;
	}

	@XmlElement(name = "predictions")
	public List<Prediction> getPrediction() {
		return predictions;
	}
	
	public void addPrediction(Prediction p){
		predictions.add(p);
	}

	public void setRefId(String id) {
		this.refid = id;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
