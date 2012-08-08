package org.rostlab.gemudb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class MutationPosContainer {
	private List<MutationPos> mutationsPos;

	public MutationPosContainer() {
	}

	public MutationPosContainer(int size) {
		mutationsPos = new ArrayList<MutationPos>(size);
	}

	@XmlElement
	public List<MutationPos> getMutationsPos() {
		return mutationsPos;
	}

	public void setMutationsPos(List<MutationPos> mutationsPos) {
		this.mutationsPos = mutationsPos;
	}
}
