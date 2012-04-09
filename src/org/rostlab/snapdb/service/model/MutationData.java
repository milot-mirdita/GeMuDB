package org.rostlab.snapdb.service.model;

import java.util.HashMap;
import java.util.Map;

public class MutationData {
	private Character aa;
	private Map<String, Object> data;

	public MutationData() {
		data = new HashMap<String, Object>();
	}

	public MutationData(Character aa) {
		super();
		this.aa = aa;
	}

	public Character getAa() {
		return aa;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public Object getDataByKey(String key) {
		return data.get(key);
	}

	public void setAa(Character aa) {
		this.aa = aa;
	}

	public void addData(String key, Object value) {
		data.put(key, value);
	}

}
