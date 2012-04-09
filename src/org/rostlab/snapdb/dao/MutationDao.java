package org.rostlab.snapdb.dao;

import java.util.List;

import org.rostlab.snapdb.dom.Mutation;
import org.springframework.jdbc.core.JdbcTemplate;

public interface MutationDao {

	public void setJdbcTemplate(JdbcTemplate ds);

	public void create(final Mutation mutation);

	public List<Mutation> selectById(final long lid);
	
	public void deleteAll();

	List<Mutation> selectByIdAndLimit(long lsequence, int pos, int size);

	public List<Mutation> selectByIdAndType(long id, int code);

}