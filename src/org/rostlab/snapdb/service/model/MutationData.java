package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "aa","wildType", "data" })
public class MutationData implements Comparable<MutationData> {

	private String aa;
	private List<MutationPredictionData> data;

	private Boolean wildType = false;

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

	@XmlElement(name = "wildType")
	public Boolean isWildType() {
		return wildType;
	}

	public void setWildType(Boolean wildType) {
		this.wildType = wildType;
	}

	@Override
	public int compareTo(MutationData o) {
		if (this.isWildType() && o.isWildType() == false)
			return -1;
		else if (this.isWildType() == false && o.isWildType() == false)
			return this.getAa().compareTo(o.getAa());
		else if (this.isWildType() == false && o.isWildType())
			return 1;
		else
			return 0;
	}

}
