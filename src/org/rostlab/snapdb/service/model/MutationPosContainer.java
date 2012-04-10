package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MutationPosContainer {
	private List<MutationsPos> mutationsPos;

	public MutationPosContainer() {
	}

	public MutationPosContainer(int size) {
		mutationsPos = new ArrayList<MutationsPos>(size);
	}

	@XmlElement
	public List<MutationsPos> getMutationsPos() {
		return mutationsPos;
	}

	public void setMutationsPos(List<MutationsPos> mutationsPos) {
		this.mutationsPos = mutationsPos;
	}
}
