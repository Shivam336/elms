package com.shivamSinghal.elms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompanyLeaveType {
	
	@Id
	private int leaveId;
	private String leaveName;
	private int maxLeavePerYear;
	private int isCarryForwardAllowed;
	private String leaveCategory;
	public CompanyLeaveType(int leaveId, String leaveName, int maxLeavePerYear, int isCarryForwardAllowed,
			String leaveCategory) {
		super();
		this.leaveId = leaveId;
		this.leaveName = leaveName;
		this.maxLeavePerYear = maxLeavePerYear;
		this.isCarryForwardAllowed = isCarryForwardAllowed;
		this.leaveCategory = leaveCategory;
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
	@Override
	public String toString() {
		return "CompanyLeaveType [leaveId=" + leaveId + ", leaveName=" + leaveName + ", maxLeavePerYear="
				+ maxLeavePerYear + ", isCarryForwardAllowed=" + isCarryForwardAllowed + ", leaveCategory="
				+ leaveCategory + "]";
	}
	
	
}
