package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class NcbiSnpDetailContainer {
	private List<NcbiSnpDetail> ncbiSnpDetail;

	public NcbiSnpDetailContainer() {
	}

	public NcbiSnpDetailContainer(int size) {
		ncbiSnpDetail = new ArrayList<NcbiSnpDetail>(size);
	}

	@XmlElement
	public List<NcbiSnpDetail> getNcbiSnpDetailContainer() {
		return ncbiSnpDetail;
	}

	public void addNcbiSnpDetail(final NcbiSnpDetail nsd) {
		ncbiSnpDetail.add(nsd);
	}

	public void setNcbiSnpDetailContainer(List<NcbiSnpDetail> ncbiSnpDetail) {
		this.ncbiSnpDetail = ncbiSnpDetail;
	}
}
