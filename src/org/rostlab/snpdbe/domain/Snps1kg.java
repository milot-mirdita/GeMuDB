package org.rostlab.snpdbe.domain;

// default package
// Generated 21.08.2012 14:34:26 by Hibernate Tools 3.4.0.CR1

/**
 * Snps1kg generated by hbm2java
 */
public class Snps1kg implements java.io.Serializable {

	private Snps1kgId id;
	private Integer mutId;
	private String proteinAcc;
	private Integer proteinVer;
	private String mrnaAcc;
	private Integer exon;
	private String locusSymbol;
	private Integer chromosome;
	private Character mrnaWt;
	private Integer mrnaPos;
	private Character mrnaMt;
	private Character chromWt;
	private Integer chromPos;
	private Character chromMt;
	private Float ldaf;
	private Integer ac;
	private Integer an;
	private Character wt;

	public Snps1kg() {
	}

	public Snps1kg(Snps1kgId id) {
		this.id = id;
	}

	public Snps1kg(Snps1kgId id, Integer mutId, String proteinAcc,
			Integer proteinVer, String mrnaAcc, Integer exon,
			String locusSymbol, Integer chromosome, Character mrnaWt,
			Integer mrnaPos, Character mrnaMt, Character chromWt,
			Integer chromPos, Character chromMt, Float ldaf, Integer ac,
			Integer an, Character wt) {
		this.id = id;
		this.mutId = mutId;
		this.proteinAcc = proteinAcc;
		this.proteinVer = proteinVer;
		this.mrnaAcc = mrnaAcc;
		this.exon = exon;
		this.locusSymbol = locusSymbol;
		this.chromosome = chromosome;
		this.mrnaWt = mrnaWt;
		this.mrnaPos = mrnaPos;
		this.mrnaMt = mrnaMt;
		this.chromWt = chromWt;
		this.chromPos = chromPos;
		this.chromMt = chromMt;
		this.ldaf = ldaf;
		this.ac = ac;
		this.an = an;
		this.wt = wt;
	}

	public Snps1kgId getId() {
		return this.id;
	}

	public void setId(Snps1kgId id) {
		this.id = id;
	}

	public Integer getMutId() {
		return this.mutId;
	}

	public void setMutId(Integer mutId) {
		this.mutId = mutId;
	}

	public String getProteinAcc() {
		return this.proteinAcc;
	}

	public void setProteinAcc(String proteinAcc) {
		this.proteinAcc = proteinAcc;
	}

	public Integer getProteinVer() {
		return this.proteinVer;
	}

	public void setProteinVer(Integer proteinVer) {
		this.proteinVer = proteinVer;
	}

	public String getMrnaAcc() {
		return this.mrnaAcc;
	}

	public void setMrnaAcc(String mrnaAcc) {
		this.mrnaAcc = mrnaAcc;
	}

	public Integer getExon() {
		return this.exon;
	}

	public void setExon(Integer exon) {
		this.exon = exon;
	}

	public String getLocusSymbol() {
		return this.locusSymbol;
	}

	public void setLocusSymbol(String locusSymbol) {
		this.locusSymbol = locusSymbol;
	}

	public Integer getChromosome() {
		return this.chromosome;
	}

	public void setChromosome(Integer chromosome) {
		this.chromosome = chromosome;
	}

	public Character getMrnaWt() {
		return this.mrnaWt;
	}

	public void setMrnaWt(Character mrnaWt) {
		this.mrnaWt = mrnaWt;
	}

	public Integer getMrnaPos() {
		return this.mrnaPos;
	}

	public void setMrnaPos(Integer mrnaPos) {
		this.mrnaPos = mrnaPos;
	}

	public Character getMrnaMt() {
		return this.mrnaMt;
	}

	public void setMrnaMt(Character mrnaMt) {
		this.mrnaMt = mrnaMt;
	}

	public Character getChromWt() {
		return this.chromWt;
	}

	public void setChromWt(Character chromWt) {
		this.chromWt = chromWt;
	}

	public Integer getChromPos() {
		return this.chromPos;
	}

	public void setChromPos(Integer chromPos) {
		this.chromPos = chromPos;
	}

	public Character getChromMt() {
		return this.chromMt;
	}

	public void setChromMt(Character chromMt) {
		this.chromMt = chromMt;
	}

	public Float getLdaf() {
		return this.ldaf;
	}

	public void setLdaf(Float ldaf) {
		this.ldaf = ldaf;
	}

	public Integer getAc() {
		return this.ac;
	}

	public void setAc(Integer ac) {
		this.ac = ac;
	}

	public Integer getAn() {
		return this.an;
	}

	public void setAn(Integer an) {
		this.an = an;
	}

	public Character getWt() {
		return this.wt;
	}

	public void setWt(Character wt) {
		this.wt = wt;
	}

}
