package com.shivamSinghal.elms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
	    uniqueConstraints = {
	        @UniqueConstraint(columnNames = {"employee_id", "leave_id"})
	    }
	)

public class EmployeeLeaveInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employee_leave_info_sequence")
	@SequenceGenerator(name="employee_leave_info_sequence", sequenceName = "employee_leave_info_sequence", allocationSize = 1)
	private Integer id;
	
	private Integer leaveCount;
	
	@ManyToOne
	@JoinColumn(name="leave_id",referencedColumnName = "leaveId")
	private CompanyLeaveType companyLeaveType;
	
	@ManyToOne
	@JoinColumn(name="employee_id",referencedColumnName = "employeeId")
	private EmployeePersonalInfo employeePersonalInfo;
	
	public EmployeeLeaveInfo() {
		
	}
	
	public EmployeeLeaveInfo(Integer id, Integer leaveCount) {
		super();
		this.id = id;
		this.leaveCount = leaveCount;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public void setCompanyLeaveType(CompanyLeaveType companyLeaveType) {
		this.companyLeaveType = companyLeaveType;
	}

	public Integer getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(Integer leaveCount) {
		this.leaveCount = leaveCount;
	}

	@Override
	public String toString() {
		return "EmployeeLeaveInfo [id=" + id + ", leaveCount=" + leaveCount + "]";
	}
	
	
}
