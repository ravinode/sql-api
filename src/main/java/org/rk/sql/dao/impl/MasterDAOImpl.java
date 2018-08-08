package org.rk.sql.dao.impl;

import java.util.List;

import org.rk.sql.dao.MasterDAO;
import org.rk.sql.model.MasterReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MasterDAOImpl implements MasterDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<MasterReport> getMasterReport() {

		List<MasterReport> result = jdbcTemplate.query("SELECT MASTER_ID, QUEUE_NAME, STATUS, FLAG FROM MASTER",
				(rs, rowNum) -> new MasterReport(

						rs.getString("MASTER_ID"), rs.getString("QUEUE_NAME"), rs.getString("STATUS"),
						rs.getString("FLAG")));
		return result;
	}

}
