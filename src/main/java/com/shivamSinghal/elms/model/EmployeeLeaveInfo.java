package com.shivamSinghal.elms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeLeaveInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="employee_id",referencedColumnName = "employeeId")
	private EmployeePersonalInfo employeePersonalInfo;
	
	@OneToOne
	@JoinColumn(name="leave_id",referencedColumnName = "leaveId")
	private CompanyLeaveType companyLeaveType;
	
	private int leaveCount;
	
		
	public EmployeeLeaveInfo(int id, EmployeePersonalInfo employeePersonalInfo, CompanyLeaveType companyLeaveType, int leaveCount) {
		super();
		this.id = id;
		this.employeePersonalInfo = employeePersonalInfo;
		this.companyLeaveType = companyLeaveType;
		this.leaveCount = leaveCount;
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

	public void setEmployeePersonalInfo(EmployeePersonalInfo employee) {
		this.employeePersonalInfo = employee;
	}

	public CompanyLeaveType getCompanyLeaveType() {
		return companyLeaveType;
	}

	public void setCompanyLeaveType(CompanyLeaveType leave) {
		this.companyLeaveType = companyLeaveType;
	}

	public int getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}

	@Override
	public String toString() {
		return "EmployeeLeaveInfo [id=" + id + ", leaveCount=" + leaveCount + "]";
	}
	
	
}
