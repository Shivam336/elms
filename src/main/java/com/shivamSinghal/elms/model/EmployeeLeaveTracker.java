package com.shivamSinghal.elms.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeLeaveTracker 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="employee_id", referencedColumnName = "employeeId")
	private EmployeePersonalInfo employeePersonalInfo;
	
	
	@ManyToOne
	@JoinColumn(name="leave_id",referencedColumnName = "leaveId")
	private CompanyLeaveType companyLeaveType;
	
	private int daysRequested;
	private String leaveApprovalStatus;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String reason;
	private Date requestDate;
	private Date approvalDate;
	
	public EmployeeLeaveTracker() {
		
	}
	
	
	public EmployeeLeaveTracker(int id, EmployeePersonalInfo employeePersonalInfo, CompanyLeaveType companyLeaveType,
			int daysRequested, String leaveApprovalStatus, Date leaveStartDate, Date leaveEndDate, String reason,
			Date requestDate, Date approvalDate) {
		super();
		this.id = id;
		this.employeePersonalInfo = employeePersonalInfo;
		this.companyLeaveType = companyLeaveType;
		this.daysRequested = daysRequested;
		this.leaveApprovalStatus = leaveApprovalStatus;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.reason = reason;
		this.requestDate = requestDate;
		this.approvalDate = approvalDate;
	}
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public EmployeePersonalInfo getEmployeePersonalInfo() {
		return employeePersonalInfo;
	}


	public void setEmployeePersonalInfo(EmployeePersonalInfo employeePersonalInfo) {
		this.employeePersonalInfo = employeePersonalInfo;
	}


	public CompanyLeaveType getCompanyLeaveType() {
		return companyLeaveType;
	}


	public void setCompanyLeaveType(CompanyLeaveType companyLeaveType) {
		this.companyLeaveType = companyLeaveType;
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
		return "EmployeeLeaveTracker [id=" + id + ", daysRequested=" + daysRequested + ", leaveApprovalStatus="
				+ leaveApprovalStatus + ", leaveStartDate=" + leaveStartDate + ", leaveEndDate=" + leaveEndDate
				+ ", reason=" + reason + ", requestDate=" + requestDate + ", approvalDate=" + approvalDate + "]";
	}


	
	
	
}
