package org.rk.sql.bo;

import java.util.List;

import org.rk.sql.dao.MasterDAO;
import org.rk.sql.model.MasterReport;
import org.rk.sql.response.MasterReportResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MasterBO {

	@Autowired
	MasterDAO masterDAO;
	
	public MasterReportResp getMasterReport()
	{
		List<MasterReport> masterReportList = masterDAO.getMasterReport();
		
		MasterReportResp res = new MasterReportResp();
		for(int i=0;i<masterReportList.size();i++)
		{
		res.setMasterID(masterReportList.get(i).getMasterID());
		res.setQueue(masterReportList.get(i).getQueue());
		res.setStatus(masterReportList.get(i).getStatus());
		res.setFlag(masterReportList.get(i).getFlag());
		}
		return res;
		
	}

}
