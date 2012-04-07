package org.rostlab.snapdb.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Proteinid")
public class ProteinId {
	private Long id;
	
	public ProteinId() {
	}
	
	
	public ProteinId(Long id) {
		this.id = id;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
