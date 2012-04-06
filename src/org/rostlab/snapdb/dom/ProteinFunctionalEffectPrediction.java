package org.rostlab.snapdb.dom;

import java.util.ArrayList;
import java.util.List;

public class ProteinFunctionalEffectPrediction {
	private String id;
	private String sequence;
	private List<Prediction> prediction = new ArrayList<Prediction>();

	public String getId() {
		return id;
	}

	public String getSequence() {
		return sequence;
	}

	public List<Prediction> getPrediction() {
		return prediction;
	}
	
	public void addPrediction(Prediction p){
		prediction.add(p);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}