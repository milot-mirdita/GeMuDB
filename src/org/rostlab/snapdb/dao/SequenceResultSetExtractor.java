package org.rostlab.snapdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rostlab.snapdb.dom.Sequence;
import org.springframework.jdbc.core.ResultSetExtractor;

public class SequenceResultSetExtractor implements ResultSetExtractor<Sequence> {

	@Override
	public Sequence extractData(ResultSet rs) throws SQLException {
		Sequence seq = new Sequence();
		seq.setId(rs.getLong("lid"));
		seq.setSequence(rs.getString("szsequence"));
		seq.setSequenceHash(rs.getString("szsequencehash"));
		seq.setRefId(rs.getString("szrefid"));
		return seq;
	}

}