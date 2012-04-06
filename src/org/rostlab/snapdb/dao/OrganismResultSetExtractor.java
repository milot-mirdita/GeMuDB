package org.rostlab.snapdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rostlab.snapdb.dom.Organism;
import org.springframework.jdbc.core.ResultSetExtractor;

public class OrganismResultSetExtractor implements ResultSetExtractor<Organism> {

	@Override
	public Organism extractData(ResultSet rs) throws SQLException {
		Organism org = new Organism();
		org.setId(rs.getLong("lid"));
		org.setName(rs.getString("szname"));
		return org;
	}

}