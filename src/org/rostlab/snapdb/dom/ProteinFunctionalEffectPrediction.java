package org.rostlab.snapdb.dom;

import java.util.ArrayList;
import java.util.List;

public class ProteinFunctionalEffectPrediction {
	private String refid;
	private String sequence;
	private List<Prediction> predictions = new ArrayList<Prediction>();

	public String getRefId() {
		return refid;
	}

	public String getSequence() {
		return sequence;
	}

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
