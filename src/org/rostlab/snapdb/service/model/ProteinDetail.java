package org.rostlab.snapdb.service.model;

public class ProteinDetail {
	private String organismName;
	private String definition;
	private String officialGenFullName;
	private String officialGenSymbol;
	private String genLocation;

	public String getOrganismName() {
		return organismName;
	}

	public String getDefinition() {
		return definition;
	}

	public void setOrganismName(String organismName) {
		this.organismName = organismName;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getOfficialGenFullName() {
		return officialGenFullName;
	}

	public String getOfficialGenSymbol() {
		return officialGenSymbol;
	}

	public String getGenLocation() {
		return genLocation;
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

}
