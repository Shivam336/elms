package com.shivamSinghal.elms.model;

import java.time.LocalDate;
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
	private LocalDate leaveStartDate;
	private LocalDate leaveEndDate;
	private String reason;
	private LocalDate requestDate;
	private LocalDate approvalDate;
	
	public EmployeeLeaveTracker() {
		
	}
	
	
	public EmployeeLeaveTracker(int id,
			int daysRequested, String leaveApprovalStatus, LocalDate leaveStartDate, LocalDate leaveEndDate, String reason,
			LocalDate requestDate, LocalDate approvalDate) {
		super();
		this.id = id;
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


	public LocalDate getLeaveStartDate() {
		return leaveStartDate;
	}


	public void setLeaveStartDate(LocalDate leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}


	public LocalDate getLeaveEndDate() {
		return leaveEndDate;
	}


	public void setLeaveEndDate(LocalDate leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public LocalDate getRequestDate() {
		return requestDate;
	}


	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}


	public LocalDate getApprovalDate() {
		return approvalDate;
	}


	public void setApprovalDate(LocalDate approvalDate) {
		this.approvalDate = approvalDate;
	}


	@Override
	public String toString() {
		return "EmployeeLeaveTracker [id=" + id + ", daysRequested=" + daysRequested + ", leaveApprovalStatus="
				+ leaveApprovalStatus + ", leaveStartDate=" + leaveStartDate + ", leaveEndDate=" + leaveEndDate
				+ ", reason=" + reason + ", requestDate=" + requestDate + ", approvalDate=" + approvalDate + "]";
	}


	
	
	
}
