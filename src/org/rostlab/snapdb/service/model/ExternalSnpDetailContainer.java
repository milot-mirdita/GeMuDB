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
	private List<ExternalSnpDetail> ncbiSnpDetail;

	public ExternalSnpDetailContainer() {
	}

	public ExternalSnpDetailContainer(int size) {
		ncbiSnpDetail = new ArrayList<ExternalSnpDetail>(size);
	}

	@XmlElement
	public List<ExternalSnpDetail> getNcbiSnpDetailContainer() {
		return ncbiSnpDetail;
	}

	public void addNcbiSnpDetail(final ExternalSnpDetail nsd) {
		ncbiSnpDetail.add(nsd);
	}

	public void setNcbiSnpDetailContainer(List<ExternalSnpDetail> ncbiSnpDetail) {
		this.ncbiSnpDetail = ncbiSnpDetail;
	}
}
