package org.rostlab.snapdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rostlab.snapdb.dom.Organism;
import org.springframework.jdbc.core.RowMapper;

public class OrgansimRowMapper implements RowMapper<Organism> {

	@Override
	public Organism mapRow(ResultSet rs, int line)
			throws SQLException {
		OrganismResultSetExtractor extractor = new OrganismResultSetExtractor();
		return extractor.extractData(rs);
	}

}