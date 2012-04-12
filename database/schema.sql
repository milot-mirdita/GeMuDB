DROP TABLE IF EXISTS `mutation`;
DROP TABLE IF EXISTS `sequence`;
DROP TABLE IF EXISTS `organism`;

CREATE TABLE organism (
	 lid INTEGER UNSIGNED auto_increment,
	 szname VARCHAR(256),
	 PRIMARY KEY(lid)
) ENGINE=MyISAM;

CREATE TABLE sequence (
	 lid INTEGER UNSIGNED auto_increment,
	 szrefid VARCHAR(100),
	 szsequence LONGTEXT NOT NULL,
	 szsequencehash VARCHAR(32),
	 szchain VARCHAR(16),
     PRIMARY KEY(lid),
	 UNIQUE (szrefid),
	 UNIQUE (szsequencehash)
) ENGINE=MyISAM;

CREATE TABLE mutation (
	 lsequenceid INTEGER UNSIGNED,
	 lpos SMALLINT UNSIGNED,
     ltype TINYINT UNSIGNED NOT NULL,
	 leffect_a BIT NOT NULL,
	 lreliability_a TINYINT UNSIGNED NOT NULL,
	 leffect_c BIT NOT NULL,
	 lreliability_c TINYINT UNSIGNED NOT NULL,
	 leffect_d BIT NOT NULL,
	 lreliability_d TINYINT UNSIGNED NOT NULL,
	 leffect_e BIT NOT NULL,
	 lreliability_e TINYINT UNSIGNED NOT NULL,
	 leffect_f BIT NOT NULL,
	 lreliability_f TINYINT UNSIGNED NOT NULL,
	 leffect_g BIT NOT NULL,
	 lreliability_g TINYINT UNSIGNED NOT NULL,
	 leffect_h BIT NOT NULL,
	 lreliability_h TINYINT UNSIGNED NOT NULL,
	 leffect_i BIT NOT NULL,
	 lreliability_i TINYINT UNSIGNED NOT NULL,
	 leffect_k BIT NOT NULL,
	 lreliability_k TINYINT UNSIGNED NOT NULL,
	 leffect_l BIT NOT NULL,
	 lreliability_l TINYINT UNSIGNED NOT NULL,
	 leffect_m BIT NOT NULL,
	 lreliability_m TINYINT UNSIGNED NOT NULL,
	 leffect_n BIT NOT NULL,
	 lreliability_n TINYINT UNSIGNED NOT NULL,
	 leffect_p BIT NOT NULL,
	 lreliability_p TINYINT UNSIGNED NOT NULL,
	 leffect_q BIT NOT NULL,
	 lreliability_q TINYINT UNSIGNED NOT NULL,
	 leffect_r BIT NOT NULL,
	 lreliability_r TINYINT UNSIGNED NOT NULL,
	 leffect_s BIT NOT NULL,
	 lreliability_s TINYINT UNSIGNED NOT NULL,
	 leffect_t BIT NOT NULL,
	 lreliability_t TINYINT UNSIGNED NOT NULL,
	 leffect_v BIT NOT NULL,
	 lreliability_v TINYINT UNSIGNED NOT NULL,
	 leffect_w BIT NOT NULL,
	 lreliability_w TINYINT UNSIGNED NOT NULL,
	 leffect_y BIT NOT NULL,
	 lreliability_y TINYINT UNSIGNED NOT NULL,
	 PRIMARY KEY(lsequenceid,lpos,ltype)
) ENGINE=MyISAM;