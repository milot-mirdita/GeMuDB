package org.rostlab.snapdb.dao;

import java.util.List;

import org.rostlab.snapdb.dom.Organism;
import org.springframework.jdbc.core.JdbcTemplate;

public interface OrganismDao {

	public void setJdbcTemplate(JdbcTemplate ds);

	public void create(Organism organsim);

	public Organism selectById(long lid);

	public List<Organism> selectAll();

}