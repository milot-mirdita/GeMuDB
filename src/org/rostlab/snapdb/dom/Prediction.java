package org.rostlab.snapdb.dom;

public class Prediction {
	private String type;
	private String reliability;
	private String conservation;

	public String getType() {
		return type;
	}

	public String getReliability() {
		return reliability;
	}

	public String getConservation() {
		return conservation;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setReliability(String reliability) {
		this.reliability = reliability;
	}

	public void setConservation(String conservation) {
		this.conservation = conservation;
	}

}
