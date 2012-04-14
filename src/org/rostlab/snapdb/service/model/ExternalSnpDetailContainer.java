package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class ExternalSnpDetailContainer {
	private List<ExternalSnpDetail> externalSnpDetail;

	public ExternalSnpDetailContainer() {
	}

	public ExternalSnpDetailContainer(int size) {
		externalSnpDetail = new ArrayList<ExternalSnpDetail>(size);
	}

	@XmlElement
	public List<ExternalSnpDetail> getExternalSnpDetailContainer() {
		return externalSnpDetail;
	}

	public void addExternalSnpDetail(final ExternalSnpDetail nsd) {
		externalSnpDetail.add(nsd);
	}

	public void setExternalSnpDetailContainer(
			List<ExternalSnpDetail> ncbiSnpDetail) {
		this.externalSnpDetail = ncbiSnpDetail;
	}
}
