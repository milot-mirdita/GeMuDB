package org.rostlab.snapdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rostlab.snapdb.dom.Mutation;
import org.springframework.jdbc.core.RowMapper;

public class MutationRowMapper implements RowMapper<Mutation> {

	@Override
	public Mutation mapRow(ResultSet rs, int line)
			throws SQLException {
		MutationResultSetExtractor extractor = new MutationResultSetExtractor();
		return extractor.extractData(rs);
	}

}