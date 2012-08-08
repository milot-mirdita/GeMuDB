package org.rostlab.gemudb.service.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
@XmlType(propOrder = { "position", "externalMutations" })
public class ExternalMutationPos {
	private Integer position;
	private List<ExternalMutationDetail> externalMutations;

	public ExternalMutationPos() {

	}

	public ExternalMutationPos(final Integer pos,
			List<ExternalMutationDetail> externalMutations) {
		this.position = pos;
		this.externalMutations = externalMutations;
	}

	@XmlElement(name = "position")
	public Integer getPosition() {
		return position;
	}

	@XmlElement(name = "externalMutations")
	public List<ExternalMutationDetail> getExternalMutations() {
		return externalMutations;
	}

	public void setPosition(final int position) {
		this.position = position;
	}

	public void addMutationData(final ExternalMutationDetail mutData) {
		externalMutations.add(mutData);
	}

}
