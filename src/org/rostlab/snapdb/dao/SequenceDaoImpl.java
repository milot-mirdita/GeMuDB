package org.rostlab.snapdb.dao;

import java.util.List;

import org.rostlab.snapdb.dom.Sequence;

public class SequenceDaoImpl extends BaseDao implements SequenceDao {
	final private String colList = "lid, szsequence, szsequencehash, szrefid ";

	@Override
	public void create(Sequence seq) {
		jdbcTemplate.update(
				"INSERT INTO sequence (szsequence, szsequencehash, szrefid) "
						+ "VALUES (?, MD5(?), ?)",
				new Object[] { seq.getSequence(), seq.getSequence(),
						seq.getRefId() });
		seq.setId(getLastId());
	}

	@Override
	public Sequence selectById(long lid) {
		 List<Sequence> list =jdbcTemplate.query("SELECT " + colList
				+ " FROM Sequence WHERE lid = ?", new Object[] { lid },
				new SequenceRowMapper());
		 if(list.size()==0){
			 return null;
		 }else{
			 return list.get(0);
		 }
	}

	@Override
	public List<Sequence> selectAll() {
		return jdbcTemplate.query("SELECT " + colList + " FROM sequence",
				new SequenceRowMapper());
	}

	@Override
	public void deleteAll() {
		jdbcTemplate.update("DELETE from sequence");
	}

	@Override
	public void delete(long lid) {
		jdbcTemplate.update("DELETE FROM sequence WHERE lid = ?",
				new Object[] { lid });
	}

	@Override
	public Sequence selectByRefId(String refId) {
		 List<Sequence> list = jdbcTemplate.query("SELECT " + colList
				+ " FROM sequence WHERE szrefid = ?", new Object[] { refId },
				new SequenceRowMapper());
		 if(list.size()==0){
			 return null;
		 }else{
			 return list.get(0);
		 }
	}

	@Override
	public Sequence selectByHash(String sequence) {
		return jdbcTemplate.queryForObject("SELECT " + colList
				+ " FROM sequence WHERE szsequencehash = MD5(?)",
				new Object[] { sequence }, new SequenceRowMapper());
	}

}
