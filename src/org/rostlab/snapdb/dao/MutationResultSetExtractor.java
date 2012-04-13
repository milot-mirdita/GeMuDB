package org.rostlab.snapdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.dom.MutationType;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MutationResultSetExtractor implements ResultSetExtractor<Mutation> {

	@Override
	public Mutation extractData(ResultSet rs) throws SQLException {
		Mutation mut = new Mutation();
		mut.setLsequenceid(rs.getLong("lsequenceid"));
		mut.setType(MutationType.parseCode(rs.getInt("ltype")));
		mut.setPos(rs.getInt("lpos"));
		mut.getMutEffect()[0]=(rs.getInt("leffect_a") != 0);
		mut.getMutEffect()[1]=(rs.getInt("leffect_c") != 0);
		mut.getMutEffect()[2]=(rs.getInt("leffect_d") != 0);
		mut.getMutEffect()[3]=(rs.getInt("leffect_e") != 0);
		mut.getMutEffect()[4]=(rs.getInt("leffect_f") != 0);
		mut.getMutEffect()[5]=(rs.getInt("leffect_g") != 0);
		mut.getMutEffect()[6]=(rs.getInt("leffect_h") != 0);
		mut.getMutEffect()[7]=(rs.getInt("leffect_i") != 0);
		mut.getMutEffect()[8]=(rs.getInt("leffect_k") != 0);
		mut.getMutEffect()[9]=(rs.getInt("leffect_l") != 0);
		mut.getMutEffect()[10]=(rs.getInt("leffect_m") != 0);
		mut.getMutEffect()[11]=(rs.getInt("leffect_n") != 0);
		mut.getMutEffect()[12]=(rs.getInt("leffect_p") != 0);
		mut.getMutEffect()[13]=(rs.getInt("leffect_q") != 0);
		mut.getMutEffect()[14]=(rs.getInt("leffect_r") != 0);
		mut.getMutEffect()[15]=(rs.getInt("leffect_s") != 0);
		mut.getMutEffect()[16]=(rs.getInt("leffect_t") != 0);
		mut.getMutEffect()[17]=(rs.getInt("leffect_v") != 0);
		mut.getMutEffect()[18]=(rs.getInt("leffect_w") != 0);
		mut.getMutEffect()[19]=(rs.getInt("leffect_x") != 0);
		mut.getMutEffect()[20]=(rs.getInt("leffect_y") != 0);
		mut.getMutReliability()[0]=rs.getInt("lreliability_a");
		mut.getMutReliability()[1]=rs.getInt("lreliability_c");
		mut.getMutReliability()[2]=rs.getInt("lreliability_d");
		mut.getMutReliability()[3]=rs.getInt("lreliability_e");
		mut.getMutReliability()[4]=rs.getInt("lreliability_f");
		mut.getMutReliability()[5]=rs.getInt("lreliability_g");
		mut.getMutReliability()[6]=rs.getInt("lreliability_h");
		mut.getMutReliability()[7]=rs.getInt("lreliability_i");
		mut.getMutReliability()[8]=rs.getInt("lreliability_k");
		mut.getMutReliability()[9]=rs.getInt("lreliability_l");
		mut.getMutReliability()[10]=rs.getInt("lreliability_m");
		mut.getMutReliability()[11]=rs.getInt("lreliability_n");
		mut.getMutReliability()[12]=rs.getInt("lreliability_p");
		mut.getMutReliability()[13]=rs.getInt("lreliability_q");
		mut.getMutReliability()[14]=rs.getInt("lreliability_r");
		mut.getMutReliability()[15]=rs.getInt("lreliability_s");
		mut.getMutReliability()[16]=rs.getInt("lreliability_t");
		mut.getMutReliability()[17]=rs.getInt("lreliability_v");
		mut.getMutReliability()[18]=rs.getInt("lreliability_w");
		mut.getMutReliability()[19]=rs.getInt("lreliability_x");
		mut.getMutReliability()[20]=rs.getInt("lreliability_y");
		return mut;
	}

}