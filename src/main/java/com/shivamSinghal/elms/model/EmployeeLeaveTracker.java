package com.shivamSinghal.elms.model;

import java.util.Date;

public class EmployeeLeaveTracker {
	private int employeeId;
	private int leaveId;
	private int daysRequested;
	private String leaveApprovalStatus;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String reason;
	private Date requestDate;
	private Date approvalDate;
	public EmployeeLeaveTracker(int employeeId, int leaveId, int daysRequested,
			String leaveApprovalStatus, Date leaveStartDate, Date leaveEndDate, String reason, Date requestDate,
			Date approvalDate) {
		super();
		this.employeeId = employeeId;
		this.leaveId = leaveId;
		this.daysRequested = daysRequested;
		this.leaveApprovalStatus = leaveApprovalStatus;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.reason = reason;
		this.requestDate = requestDate;
		this.approvalDate = approvalDate;
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
	public int getDaysRequested() {
		return daysRequested;
	}
	public void setDaysRequested(int daysRequested) {
		this.daysRequested = daysRequested;
	}
	public String getLeaveApprovalStatus() {
		return leaveApprovalStatus;
	}
	public void setLeaveApprovalStatus(String leaveApprovalStatus) {
		this.leaveApprovalStatus = leaveApprovalStatus;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	@Override
	public String toString() {
		return "EmployeeLeaveTracker [employeeId=" + employeeId + ", leaveId=" + leaveId + ", daysRequested="
				+ daysRequested + ", leaveApprovalStatus=" + leaveApprovalStatus
				+ ", leaveStartDate=" + leaveStartDate + ", leaveEndDate=" + leaveEndDate + ", reason=" + reason
				+ ", requestDate=" + requestDate + ", approvalDate=" + approvalDate + "]";
	}
	
	
}
