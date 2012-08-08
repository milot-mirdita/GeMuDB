package org.rostlab.gemudb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "aa", "data" })
public class MutationData {

	private String aa;
	private List<MutationPredictionData> data;


	public MutationData() {
		data = new ArrayList<MutationPredictionData>();
	}

	public MutationData(String aa) {
		super();
		this.aa = "" + aa;
	}

	@XmlElement(name = "aa")
	public String getAa() {
		return aa;
	}

	@XmlElement(name = "data")
	public List<MutationPredictionData> getData() {
		return data;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public void addData(MutationPredictionData obj) {
		data.add(obj);
	}

}
