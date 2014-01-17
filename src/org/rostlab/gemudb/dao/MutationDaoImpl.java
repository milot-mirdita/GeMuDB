package org.rostlab.gemudb.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.rostlab.gemudb.dom.Mutation;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class MutationDaoImpl extends BaseDao implements MutationDao {

	final private String colList = " lsequenceid, lpos, ltype, leffect_a, lreliability_a, "
			+ "leffect_c, lreliability_c, leffect_d, lreliability_d, leffect_e, lreliability_e, "
			+ "leffect_f, lreliability_f, leffect_g, lreliability_g, leffect_h, lreliability_h, "
			+ "leffect_i, lreliability_i, leffect_k, lreliability_k, leffect_l, lreliability_l, "
			+ "leffect_m, lreliability_m, leffect_n, lreliability_n, leffect_p, lreliability_p, "
			+ "leffect_q, lreliability_q, leffect_r, lreliability_r, leffect_s, lreliability_s, "
			+ "leffect_t, lreliability_t, leffect_v, lreliability_v, leffect_w, lreliability_w, "
			+ "leffect_x, lreliability_x, leffect_y, lreliability_y ";

	@Override
	public void create(final Mutation mut) {

		jdbcTemplate.update("INSERT INTO mutation (" + colList + ") "
				+ "VALUES (?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, " + "?, ?, ?, ? )",
				new PreparedStatementSetter() {
					public void setValues(PreparedStatement preparedStatement)
							throws SQLException {
						preparedStatement.setLong(1, mut.getLsequenceid());
						preparedStatement.setInt(2, mut.getPos());
						preparedStatement.setInt(3, mut.getType().getCode());
						preparedStatement.setBoolean(4, mut.getMutEffect()[0]);
						preparedStatement.setInt(5, mut.getMutReliability()[0]);
						preparedStatement.setBoolean(6, mut.getMutEffect()[1]);
						preparedStatement.setInt(7, mut.getMutReliability()[1]);
						preparedStatement.setBoolean(8, mut.getMutEffect()[2]);
						preparedStatement.setInt(9, mut.getMutReliability()[2]);
						preparedStatement.setBoolean(10, mut.getMutEffect()[3]);
						preparedStatement.setInt(11, mut.getMutReliability()[3]);
						preparedStatement.setBoolean(12, mut.getMutEffect()[4]);
						preparedStatement.setInt(13, mut.getMutReliability()[4]);
						preparedStatement.setBoolean(14, mut.getMutEffect()[5]);
						preparedStatement.setInt(15, mut.getMutReliability()[5]);
						preparedStatement.setBoolean(16, mut.getMutEffect()[6]);
						preparedStatement.setInt(17, mut.getMutReliability()[6]);
						preparedStatement.setBoolean(18, mut.getMutEffect()[7]);
						preparedStatement.setInt(19, mut.getMutReliability()[7]);
						preparedStatement.setBoolean(20, mut.getMutEffect()[8]);
						preparedStatement.setInt(21, mut.getMutReliability()[8]);
						preparedStatement.setBoolean(22, mut.getMutEffect()[9]);
						preparedStatement.setInt(23, mut.getMutReliability()[9]);
						preparedStatement.setBoolean(24, mut.getMutEffect()[10]);
						preparedStatement.setInt(25,
								mut.getMutReliability()[10]);
						preparedStatement.setBoolean(26, mut.getMutEffect()[11]);
						preparedStatement.setInt(27,
								mut.getMutReliability()[11]);
						preparedStatement.setBoolean(28, mut.getMutEffect()[12]);
						preparedStatement.setInt(29,
								mut.getMutReliability()[12]);
						preparedStatement.setBoolean(30, mut.getMutEffect()[13]);
						preparedStatement.setInt(31,
								mut.getMutReliability()[13]);
						preparedStatement.setBoolean(32, mut.getMutEffect()[14]);
						preparedStatement.setInt(33,
								mut.getMutReliability()[14]);
						preparedStatement.setBoolean(34, mut.getMutEffect()[15]);
						preparedStatement.setInt(35,
								mut.getMutReliability()[15]);
						preparedStatement.setBoolean(36, mut.getMutEffect()[16]);
						preparedStatement.setInt(37,
								mut.getMutReliability()[16]);
						preparedStatement.setBoolean(38, mut.getMutEffect()[17]);
						preparedStatement.setInt(39,
								mut.getMutReliability()[17]);
						preparedStatement.setBoolean(40, mut.getMutEffect()[18]);
						preparedStatement.setInt(41,
								mut.getMutReliability()[18]);
						preparedStatement.setBoolean(42, mut.getMutEffect()[19]);
						preparedStatement.setInt(43,
								mut.getMutReliability()[19]);
						preparedStatement.setBoolean(44, mut.getMutEffect()[20]);
						preparedStatement.setInt(45,
								mut.getMutReliability()[20]);
					}
				});
	}

	@Override
	public List<Mutation> selectById(final long lsequence) {
		return jdbcTemplate.query("SELECT " + colList
				+ " FROM mutation WHERE lsequenceid = ?",
				new Object[] { lsequence }, new MutationRowMapper());
	}

	@Override
	public List<Mutation> selectByIdAndLimit(final long lsequence,
			final int pos, final int size, final int ltype) {
		return jdbcTemplate
				.query("SELECT "
						+ colList
						+ " FROM mutation WHERE lsequenceid = ? AND lpos >= ? AND lpos < ? AND ltype = ?",
						new Object[] { lsequence, pos, pos + size,ltype },
						new MutationRowMapper());
	}
	
	@Override
	public List<Mutation> selectByIdAndLimit(final long lsequence,
			final int pos, final int size) {
		return jdbcTemplate
				.query("SELECT "
						+ colList
						+ " FROM mutation WHERE lsequenceid = ? AND lpos >= ? AND lpos < ?",
						new Object[] { lsequence, pos, pos + size },
						new MutationRowMapper());
	}

	@Override
	public void deleteAll() {
		jdbcTemplate.update("DELETE from mutation");
	}

	@Override
	public List<Mutation> selectByIdAndType(long lsequence, int ltype) {
		return jdbcTemplate.query("SELECT " + colList
				+ " FROM mutation WHERE lsequenceid = ? AND ltype = ?",
				new Object[] { lsequence, ltype }, new MutationRowMapper());

	}

	
	@Override
	public void insertBatch(final List<Mutation> mutation) {

		final String sql = "INSERT INTO mutation (" + colList + ") "
				+ "VALUES (?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, " + "?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, " + "?, ?, ?, ? )";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement preparedStatement, int i)
					throws SQLException {
				Mutation mut = mutation.get(i);
				preparedStatement.setLong(1, mut.getLsequenceid());
				preparedStatement.setInt(2, mut.getPos());
				preparedStatement.setInt(3, mut.getType().getCode());
				preparedStatement.setBoolean(4, mut.getMutEffect()[0]);
				preparedStatement.setInt(5, mut.getMutReliability()[0]);
				preparedStatement.setBoolean(6, mut.getMutEffect()[1]);
				preparedStatement.setInt(7, mut.getMutReliability()[1]);
				preparedStatement.setBoolean(8, mut.getMutEffect()[2]);
				preparedStatement.setInt(9, mut.getMutReliability()[2]);
				preparedStatement.setBoolean(10, mut.getMutEffect()[3]);
				preparedStatement.setInt(11, mut.getMutReliability()[3]);
				preparedStatement.setBoolean(12, mut.getMutEffect()[4]);
				preparedStatement.setInt(13, mut.getMutReliability()[4]);
				preparedStatement.setBoolean(14, mut.getMutEffect()[5]);
				preparedStatement.setInt(15, mut.getMutReliability()[5]);
				preparedStatement.setBoolean(16, mut.getMutEffect()[6]);
				preparedStatement.setInt(17, mut.getMutReliability()[6]);
				preparedStatement.setBoolean(18, mut.getMutEffect()[7]);
				preparedStatement.setInt(19, mut.getMutReliability()[7]);
				preparedStatement.setBoolean(20, mut.getMutEffect()[8]);
				preparedStatement.setInt(21, mut.getMutReliability()[8]);
				preparedStatement.setBoolean(22, mut.getMutEffect()[9]);
				preparedStatement.setInt(23, mut.getMutReliability()[9]);
				preparedStatement.setBoolean(24, mut.getMutEffect()[10]);
				preparedStatement.setInt(25, mut.getMutReliability()[10]);
				preparedStatement.setBoolean(26, mut.getMutEffect()[11]);
				preparedStatement.setInt(27, mut.getMutReliability()[11]);
				preparedStatement.setBoolean(28, mut.getMutEffect()[12]);
				preparedStatement.setInt(29, mut.getMutReliability()[12]);
				preparedStatement.setBoolean(30, mut.getMutEffect()[13]);
				preparedStatement.setInt(31, mut.getMutReliability()[13]);
				preparedStatement.setBoolean(32, mut.getMutEffect()[14]);
				preparedStatement.setInt(33, mut.getMutReliability()[14]);
				preparedStatement.setBoolean(34, mut.getMutEffect()[15]);
				preparedStatement.setInt(35, mut.getMutReliability()[15]);
				preparedStatement.setBoolean(36, mut.getMutEffect()[16]);
				preparedStatement.setInt(37, mut.getMutReliability()[16]);
				preparedStatement.setBoolean(38, mut.getMutEffect()[17]);
				preparedStatement.setInt(39, mut.getMutReliability()[17]);
				preparedStatement.setBoolean(40, mut.getMutEffect()[18]);
				preparedStatement.setInt(41, mut.getMutReliability()[18]);
				preparedStatement.setBoolean(42, mut.getMutEffect()[19]);
				preparedStatement.setInt(43,mut.getMutReliability()[19]);
				preparedStatement.setBoolean(44, mut.getMutEffect()[20]);
				preparedStatement.setInt(45,mut.getMutReliability()[20]);
			}

			@Override
			public int getBatchSize() {
				return mutation.size();
			}
		});
	}
}
