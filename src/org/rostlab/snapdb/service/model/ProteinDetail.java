package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProteinDetail {
	private String organismName;
	private String definition;
	private String officialGenFullName;
	private String officialGenSymbol;
	private String genLocation;
	private String source;

	@XmlElement(name = "organismName")
	public String getOrganismName() {
		return organismName;
	}

	@XmlElement(name = "definition")
	public String getDefinition() {
		return definition;
	}

	@XmlElement(name = "officialGenFullName")
	public String getOfficialGenFullName() {
		return officialGenFullName;
	}

	@XmlElement(name = "officialGenSymbol")
	public String getOfficialGenSymbol() {
		return officialGenSymbol;
	}

	@XmlElement(name = "genLocation")
	public String getGenLocation() {
		return genLocation;
	}

	@XmlElement(name = "source")
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setOfficialGenFullName(String officialGenFullName) {
		this.officialGenFullName = officialGenFullName;
	}

	public void setOfficialGenSymbol(String officialGenSymbol) {
		this.officialGenSymbol = officialGenSymbol;
	}

	public void setGenLocation(String genLocation) {
		this.genLocation = genLocation;
	}

	public void setOrganismName(String organismName) {
		this.organismName = organismName;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

}
