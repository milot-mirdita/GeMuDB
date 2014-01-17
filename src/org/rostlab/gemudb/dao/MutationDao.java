package org.rostlab.gemudb.dao;

import java.util.List;

import org.rostlab.gemudb.dom.Mutation;
import org.springframework.jdbc.core.JdbcTemplate;

public interface MutationDao {

	public void setJdbcTemplate(JdbcTemplate ds);

	public void create(final Mutation mutation);

	public List<Mutation> selectById(final long lid);

	public void deleteAll();
	
	List<Mutation> selectByIdAndLimit(long lsequence, int pos, int size);

	List<Mutation> selectByIdAndLimit(long lsequence, int pos, int size, int type);

	public List<Mutation> selectByIdAndType(long id, int type);

	public void insertBatch(List<Mutation> mutation);


}