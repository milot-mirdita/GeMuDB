package org.rostlab.snapdb.dao;

import java.util.List;

import org.rostlab.snapdb.dom.Organism;

public class OrganismDaoImpl extends BaseDao implements OrganismDao {
	final private String colList = " lid, szname ";

	@Override
	public void create(Organism org) {
		jdbcTemplate.update("INSERT INTO organism (lid, szname) "
				+ "VALUES ( ?)", new Object[] { org.getName() });
		org.setId(getLastId());
	}

	@Override
	public Organism selectById(long lid) {
		return jdbcTemplate.queryForObject("SELECT "+colList+
				 " FROM organism WHERE lid = ?", new Object[] { lid }, new OrgansimRowMapper());
	}

	@Override
	public List<Organism> selectAll() {
		return jdbcTemplate.query("SELECT "+colList+
								  " FROM organism",
				new OrgansimRowMapper());
	}





}
