package org.rostlab.gemudb.dom;

import java.util.Arrays;

public class Mutation {
	private long lsequenceid;
	private Character orgAminoAcid;
	private Boolean[] mutEffect = new Boolean[21];
	private Integer[] mutReliability = new Integer[21];

	private Integer pos;
	private MutationType type;
	public Mutation() {
		Arrays.fill(mutEffect, false);
		Arrays.fill(mutReliability, 255);
	}
	public long getLsequenceid() {
		return lsequenceid;
	}

	public void setLsequenceid(long lsequenceid) {
		this.lsequenceid = lsequenceid;
	}

	public Integer getPos() {
		return pos;
	}

	public MutationType getType() {
		return type;
	}

	public void setPos(Integer pos) {
		this.pos = pos;
	}

	public void setType(MutationType type) {
		this.type = type;
	}

	public Boolean[] getMutEffect() {
		return mutEffect;
	}

	public Integer[] getMutReliability() {
		return mutReliability;
	}

	public void setMutEffect(Boolean[] mutEffect) {
		this.mutEffect = mutEffect;
	}

	public void setMutReliability(Integer[] mutReliability) {
		this.mutReliability = mutReliability;
	}

	public Character getOrgAminoAcid() {
		return orgAminoAcid;
	}

	public void setOrgAminoAcid(Character orgAminoAcid) {
		this.orgAminoAcid = orgAminoAcid;
	}

}
