package org.rostlab.snapdb.dom;

public class Sequence {
	private long id;
	private String sequence;
	private String sequenceHash;
	private String refId;
	private Organism organism;

	public Sequence() {
	}

	public Sequence(long id, String sequence, String refId) {
		this.id = id;
		this.sequence = sequence;
		this.refId = refId;
	}

	public long getId() {
		return id;
	}

	public String getSequence() {
		return sequence;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSequence(String sequnece) {
		this.sequence = sequnece;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getSequenceHash() {
		return sequenceHash;
	}

	public void setSequenceHash(String sequenceHash) {
		this.sequenceHash = sequenceHash;
	}

	public Organism getOrganism() {
		return organism;
	}

	public void setOrganism(Organism organism) {
		this.organism = organism;
	}

}
