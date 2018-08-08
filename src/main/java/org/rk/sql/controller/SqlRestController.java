package org.rk.sql.controller;

import org.rk.sql.bo.MasterBO;
import org.rk.sql.response.MasterReportResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqlRestController {
	
	@Autowired
	MasterBO masterBO;
	
	@RequestMapping(value = "/getMasterReport", method = RequestMethod.GET)
	public MasterReportResp getMasterReport()
	{
		return masterBO.getMasterReport();
		
	}

}
