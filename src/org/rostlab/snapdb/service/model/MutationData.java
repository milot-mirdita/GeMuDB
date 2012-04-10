package org.rostlab.snapdb.service.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlType(propOrder={"aa", "data"})
public class MutationData {
	private String aa;
	private HashMap<String, String> data;

	public MutationData() {
		data = new HashMap<String, String>();
	}

	public MutationData(String aa) {
		super();
		this.aa = "" + aa;
	}
	 @XmlElement(name="aa")
	public String getAa() {
		return aa;
	}
	@XmlElement(name="data")
	@XmlJavaTypeAdapter(MapAdapter.class)
	public Map<String, String> getData() {
		return data;
	}

	public String getDataByKey(String key) {
		return data.get(key);
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public void addData(String key, String value) {
		data.put(key, value);
	}

}
