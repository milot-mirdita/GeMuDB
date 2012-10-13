package org.rostlab.snpdbe.domain;

// default package
// Generated 21.08.2012 14:34:26 by Hibernate Tools 3.4.0.CR1

/**
 * DbSnpValCode generated by hbm2java
 */
public class DbSnpValCode implements java.io.Serializable {

	private byte code;
	private String abbrev;
	private String descrip;
	private String createTime;
	private String lastUpdatedTime;

	public DbSnpValCode() {
	}

	public DbSnpValCode(byte code) {
		this.code = code;
	}

	public DbSnpValCode(byte code, String abbrev, String descrip,
			String createTime, String lastUpdatedTime) {
		this.code = code;
		this.abbrev = abbrev;
		this.descrip = descrip;
		this.createTime = createTime;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public byte getCode() {
		return this.code;
	}

	public void setCode(byte code) {
		this.code = code;
	}

	public String getAbbrev() {
		return this.abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastUpdatedTime() {
		return this.lastUpdatedTime;
	}

	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

}
