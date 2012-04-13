package org.rostlab.snapdb.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
	protected JdbcTemplate	jdbcTemplate;

	
	public void setJdbcTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}
	
	public long getLastId(){
		return jdbcTemplate.queryForInt( "select last_insert_id()" );
	}
}
