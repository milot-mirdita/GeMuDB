package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "snpid", "source", "position", "mutation", "effect",
		"hasOmim", "omimEntries" })
public class ExternalMutationDetail {
	private Integer snpid = null;
	private Integer position = null;
	private Character mutation = null;
	private Boolean effect = null;
	private String source = null;
	private List<OmimEntry> omimEntries = new ArrayList<OmimEntry>();

	@XmlElement(name = "source")
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@XmlElement(name = "snpid")
	public Integer getSnpid() {
		return snpid;
	}

	@XmlElement(name = "position")
	public Integer getPosition() {
		return position;
	}

	@XmlElement(name = "mutation")
	public String getMutation() {
		return mutation.toString();
	}

	@XmlElement(name = "effect")
	public Boolean getEffect() {
		return effect;
	}

	@XmlElement(name = "omimEntries")
	public List<OmimEntry> getOmimEntries() {
		return omimEntries;
	}

	@XmlElement(name = "hasOmim")
	public Boolean getHasOmim() {
		return omimEntries.size() == 0 ? false : true;
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

	public boolean isComplete() {
		if (effect != null && position != null && mutation != null
				&& snpid != null)
			return true;
		else
			return false;
	}

}
