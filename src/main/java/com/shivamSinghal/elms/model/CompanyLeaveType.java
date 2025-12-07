package com.shivamSinghal.elms.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CompanyLeaveType {
	
	@Id
	private int leaveId;
	private String leaveName;
	private int maxLeavePerYear;
	private int isCarryForwardAllowed;
	private String leaveCategory;
	
	@OneToOne(mappedBy = "companyLeaveType")
	private EmployeeLeaveInfo employeeLeaveInfo;
	
	@OneToMany(mappedBy = "companyLeaveType")
	private List<EmployeeLeaveTracker> employeeLeaveTracker;
	
	
	public CompanyLeaveType() {
		
	}


	


	public CompanyLeaveType(int leaveId, String leaveName, int maxLeavePerYear, int isCarryForwardAllowed,
			String leaveCategory, EmployeeLeaveInfo employeeLeaveInfo,
			List<EmployeeLeaveTracker> employeeLeaveTracker) {
		super();
		this.leaveId = leaveId;
		this.leaveName = leaveName;
		this.maxLeavePerYear = maxLeavePerYear;
		this.isCarryForwardAllowed = isCarryForwardAllowed;
		this.leaveCategory = leaveCategory;
		this.employeeLeaveInfo = employeeLeaveInfo;
		this.employeeLeaveTracker = employeeLeaveTracker;
	}





	public int getLeaveId() {
		return leaveId;
	}





	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}





	public String getLeaveName() {
		return leaveName;
	}





	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}





	public int getMaxLeavePerYear() {
		return maxLeavePerYear;
	}





	public void setMaxLeavePerYear(int maxLeavePerYear) {
		this.maxLeavePerYear = maxLeavePerYear;
	}





	public int getIsCarryForwardAllowed() {
		return isCarryForwardAllowed;
	}





	public void setIsCarryForwardAllowed(int isCarryForwardAllowed) {
		this.isCarryForwardAllowed = isCarryForwardAllowed;
	}





	public String getLeaveCategory() {
		return leaveCategory;
	}





	public void setLeaveCategory(String leaveCategory) {
		this.leaveCategory = leaveCategory;
	}





	public EmployeeLeaveInfo getEmployeeLeaveInfo() {
		return employeeLeaveInfo;
	}





	public void setEmployeeLeaveInfo(EmployeeLeaveInfo employeeLeaveInfo) {
		this.employeeLeaveInfo = employeeLeaveInfo;
	}





	public List<EmployeeLeaveTracker> getEmployeeLeaveTracker() {
		return employeeLeaveTracker;
	}





	public void setEmployeeLeaveTracker(List<EmployeeLeaveTracker> employeeLeaveTracker) {
		this.employeeLeaveTracker = employeeLeaveTracker;
	}





	@Override
	public String toString() {
		return "CompanyLeaveType [leaveId=" + leaveId + ", leaveName=" + leaveName + ", maxLeavePerYear="
				+ maxLeavePerYear + ", isCarryForwardAllowed=" + isCarryForwardAllowed + ", leaveCategory="
				+ leaveCategory + "]";
	}
	
	
	
	
}
