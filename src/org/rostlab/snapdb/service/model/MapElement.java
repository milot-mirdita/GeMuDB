package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlElement;

public class MapElement {

	public MapElement() {
	}
	public MapElement(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@XmlElement
	public String key;

	@XmlElement
	public String value;
}