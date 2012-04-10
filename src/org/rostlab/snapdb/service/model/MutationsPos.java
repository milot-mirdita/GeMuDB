package org.rostlab.snapdb.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"position", "mutations"})
public class MutationsPos {
	private int position; 
	private List<MutationData> mutations;
	
	public MutationsPos() {
		mutations = new ArrayList<MutationData>();
	}
	
	public int getPosition() {
		return position;
	}
	public List<MutationData> getMutations() {
		return mutations;
	}
	public void setPosition(final int position) {
		this.position = position;
	}
	public void setMutations(final List<MutationData> mutations) {
		this.mutations = mutations;
	}
	
	public void addMutationData(final MutationData mutData ){
		mutations.add(mutData);
	}
	
	
}
