package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProteinDetail")
public class ProteinDetail {
	private String organismName;
	private String definition;
	private String officialGenFullName;
	private String officialGenSymbol;
	private String genLocation;
	private String source;

	@XmlElement(name = "OrganismName")
	public String getOrganismName() {
		return organismName;
	}

	@XmlElement(name = "Definition")
	public String getDefinition() {
		return definition;
	}

	@XmlElement(name = "OfficialGenFullName")
	public String getOfficialGenFullName() {
		return officialGenFullName;
	}

	@XmlElement(name = "OfficialGenSymbol")
	public String getOfficialGenSymbol() {
		return officialGenSymbol;
	}

	@XmlElement(name = "GenLocation")
	public String getGenLocation() {
		return genLocation;
	}

	@XmlElement(name = "Source")
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
