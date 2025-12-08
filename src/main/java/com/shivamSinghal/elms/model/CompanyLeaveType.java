package com.shivamSinghal.elms.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CompanyLeaveType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "leave_id_sequence")
	@SequenceGenerator(name = "leave_id_sequence", sequenceName = "leave_id_sequence", allocationSize = 1)
	private Integer leaveId;
	private String leaveName;
	private int maxLeavePerYear;
	private int isCarryForwardAllowed;
	private String leaveCategory;
	private int delFlg;
	
	@OneToOne(mappedBy = "companyLeaveType")
	private EmployeeLeaveInfo employeeLeaveInfo;
	
	@OneToMany(mappedBy = "companyLeaveType")
	private List<EmployeeLeaveTracker> employeeLeaveTracker=new ArrayList<>();
	
	
	public CompanyLeaveType() {
		
	}

	
	public CompanyLeaveType(Integer leaveId, String leaveName, int maxLeavePerYear, int isCarryForwardAllowed,
			String leaveCategory, int delFlg) {
		super();
		this.leaveId = leaveId;
		this.leaveName = leaveName;
		this.maxLeavePerYear = maxLeavePerYear;
		this.isCarryForwardAllowed = isCarryForwardAllowed;
		this.leaveCategory = leaveCategory;
		this.delFlg = delFlg;
	}



	public Integer getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Integer leaveId) {
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
	
	

	public int getDelFlg() {
		return delFlg;
	}


	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}


	@Override
	public String toString() {
		return "CompanyLeaveType [leaveId=" + leaveId + ", leaveName=" + leaveName + ", maxLeavePerYear="
				+ maxLeavePerYear + ", isCarryForwardAllowed=" + isCarryForwardAllowed + ", leaveCategory="
				+ leaveCategory + ", delFlg=" + delFlg + "]";
	}
	
	
	
	
	
}
