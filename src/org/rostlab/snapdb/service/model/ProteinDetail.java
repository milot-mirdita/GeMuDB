package org.rostlab.snapdb.service.model;

public class ProteinDetail {
	private String officialGenFullName;
	private String officialGenSymbol;
	private String genLocation;

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
