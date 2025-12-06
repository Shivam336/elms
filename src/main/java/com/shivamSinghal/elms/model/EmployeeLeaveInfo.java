package com.shivamSinghal.elms.model;

public class EmployeeLeaveInfo {
	private int employeeId;
	private int leaveId;
	private int leaveCount;
	public EmployeeLeaveInfo(int employeeId, int leaveId, int leaveCount) {
		super();
		this.employeeId = employeeId;
		this.leaveId = leaveId;
		this.leaveCount = leaveCount;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}
	@Override
	public String toString() {
		return "EmployeeLeaveInfo [employeeId=" + employeeId + ", leaveId=" + leaveId + ", leaveCount=" + leaveCount
				+ "]";
	}
	
	
}
