package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MutationPredictionData {

	public MutationPredictionData() {
	}

	public MutationPredictionData(String type, Integer score, Boolean effect) {
		this.type = type;
		this.score = score;
		this.effect = effect;
	}

	@XmlElement
	public String type;

	@XmlElement
	public Integer score;
	@XmlElement
	public Boolean effect;

}