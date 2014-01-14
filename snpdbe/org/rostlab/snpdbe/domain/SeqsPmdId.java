package org.rostlab.snpdbe.domain;

// default package
// Generated 21.08.2012 14:34:26 by Hibernate Tools 3.4.0.CR1

/**
 * SeqsPmdId generated by hbm2java
 */
public class SeqsPmdId implements java.io.Serializable {

	private String pmdId;
	private byte nr;

	public SeqsPmdId() {
	}

	public SeqsPmdId(String pmdId, byte nr) {
		this.pmdId = pmdId;
		this.nr = nr;
	}

	public String getPmdId() {
		return this.pmdId;
	}

	public void setPmdId(String pmdId) {
		this.pmdId = pmdId;
	}

	public byte getNr() {
		return this.nr;
	}

	public void setNr(byte nr) {
		this.nr = nr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SeqsPmdId))
			return false;
		SeqsPmdId castOther = (SeqsPmdId) other;

		return ((this.getPmdId() == castOther.getPmdId()) || (this.getPmdId() != null
				&& castOther.getPmdId() != null && this.getPmdId().equals(
				castOther.getPmdId())))
				&& (this.getNr() == castOther.getNr());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPmdId() == null ? 0 : this.getPmdId().hashCode());
		result = 37 * result + this.getNr();
		return result;
	}

}