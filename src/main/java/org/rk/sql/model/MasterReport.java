package org.rk.sql.model;

public class MasterReport {
	
	private String masterID;
	private String status;
	private String queue;
	private String flag;
	
	
	
	public MasterReport(String masterID, String status, String queue, String flag) {
		super();
		this.masterID = masterID;
		this.status = status;
		this.queue = queue;
		this.flag = flag;
	}
	public String getMasterID() {
		return masterID;
	}
	public void setMasterID(String masterID) {
		this.masterID = masterID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	

}
