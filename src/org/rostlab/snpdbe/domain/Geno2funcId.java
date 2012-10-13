package org.rostlab.snpdbe.domain;

// default package
// Generated 21.08.2012 14:34:26 by Hibernate Tools 3.4.0.CR1

/**
 * Geno2funcId generated by hbm2java
 */
public class Geno2funcId implements java.io.Serializable {

	private String md5;
	private short pos;
	private char mt;

	public Geno2funcId() {
	}

	public Geno2funcId(String md5, short pos, char mt) {
		this.md5 = md5;
		this.pos = pos;
		this.mt = mt;
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public short getPos() {
		return this.pos;
	}

	public void setPos(short pos) {
		this.pos = pos;
	}

	public char getMt() {
		return this.mt;
	}

	public void setMt(char mt) {
		this.mt = mt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Geno2funcId))
			return false;
		Geno2funcId castOther = (Geno2funcId) other;

		return ((this.getMd5() == castOther.getMd5()) || (this.getMd5() != null
				&& castOther.getMd5() != null && this.getMd5().equals(
				castOther.getMd5())))
				&& (this.getPos() == castOther.getPos())
				&& (this.getMt() == castOther.getMt());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMd5() == null ? 0 : this.getMd5().hashCode());
		result = 37 * result + this.getPos();
		result = 37 * result + this.getMt();
		return result;
	}

}
