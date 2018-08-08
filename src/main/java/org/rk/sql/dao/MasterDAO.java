package org.rk.sql.dao;

import java.util.List;

import org.rk.sql.model.MasterReport;
import org.springframework.stereotype.Service;

@Service
public interface MasterDAO {
	
	public List<MasterReport> getMasterReport();

}
