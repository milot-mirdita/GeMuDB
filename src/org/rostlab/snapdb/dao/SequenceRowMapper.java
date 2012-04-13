package org.rostlab.snapdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rostlab.snapdb.dom.Sequence;
import org.springframework.jdbc.core.RowMapper;

public class SequenceRowMapper implements RowMapper<Sequence> {

	@Override
	public Sequence mapRow(ResultSet rs, int line)
			throws SQLException {
		SequenceResultSetExtractor extractor = new SequenceResultSetExtractor();
		return extractor.extractData(rs);
	}

}