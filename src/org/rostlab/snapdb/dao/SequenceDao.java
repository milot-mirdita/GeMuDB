package org.rostlab.snapdb.dao;

import java.util.List;

import org.rostlab.snapdb.dom.Sequence;
import org.springframework.jdbc.core.JdbcTemplate;

public interface SequenceDao {

	public void setJdbcTemplate(JdbcTemplate ds);

	public void create(Sequence seq);

	public Sequence selectById(long lid);

	public Sequence selectByRefId(String refId);

	public List<Sequence> selectAll();

	public void deleteAll();

	public void delete(long lid);

	public Sequence selectByHash(String sequence);
	
	
}