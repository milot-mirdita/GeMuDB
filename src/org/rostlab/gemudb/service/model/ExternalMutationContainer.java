package org.rostlab.gemudb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class ExternalMutationContainer {
	private List<ExternalMutationPos> externalMutationPos;

	public ExternalMutationContainer() {
	}

	public ExternalMutationContainer(int size) {
		externalMutationPos = new ArrayList<ExternalMutationPos>(size);
	}

	@XmlElement
	public List<ExternalMutationPos> getExternalMutationPosition() {
		return externalMutationPos;
	}

	public void addExternalMutationPos(final ExternalMutationPos nsd) {
		externalMutationPos.add(nsd);
	}

}
