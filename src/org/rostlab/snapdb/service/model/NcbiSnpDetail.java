package org.rostlab.snapdb.service.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "snpid", "position", "mutation", "effect", "omimEntries" })
public class NcbiSnpDetail {
	private Integer snpid;
	private Integer position;
	private Character mutation;
	private Boolean effect;
	private List<OmimEntry> omimEntries;

	@XmlElement(name = "snpid")
	public Integer getSnpid() {
		return snpid;
	}

	@XmlElement(name = "position")
	public Integer getPosition() {
		return position;
	}

	@XmlElement(name = "position")
	public Character getMutation() {
		return mutation;
	}

	@XmlElement(name = "effect")
	public Boolean getEffect() {
		return effect;
	}

	@XmlElement(name = "omimEntries")
	public List<OmimEntry> getOmimEntries() {
		return omimEntries;
	}

	public void setMutation(Character mutation) {
		this.mutation = mutation;
	}

	public void setSnpid(Integer snpid) {
		this.snpid = snpid;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setEffect(Boolean effect) {
		this.effect = effect;
	}

	public void addOmimEntry(final OmimEntry omimEntry) {
		omimEntries.add(omimEntry);
	}

}
