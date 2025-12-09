package com.shivamSinghal.elms.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class EmployeeProjectInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_project_info_sequence")
	@SequenceGenerator(name="employee_project_info_sequence", sequenceName = "employee_project_info_sequence", allocationSize = 1)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
	private EmployeePersonalInfo employee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id", referencedColumnName = "projectId")
	private CompanyProjectInfo project;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id", referencedColumnName = "roleId")
	private CompanyRole role;
	
	private Integer delFlg;
	private LocalDateTime assignmentStartDate;
	private LocalDateTime assignmentEndDate;
	
	public EmployeeProjectInfo() {
		
	}
	
	public EmployeeProjectInfo(Integer id, EmployeePersonalInfo employee, CompanyProjectInfo project, CompanyRole role, Integer delFlg, LocalDateTime assignmentStartDate,
			LocalDateTime assignmentEndDate) {
		super();
		this.id = id;
		this.employee = employee;
		this.project = project;
		this.role = role;
		this.delFlg = delFlg;
		this.assignmentStartDate = assignmentStartDate;
		this.assignmentEndDate = assignmentEndDate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	public EmployeePersonalInfo getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeePersonalInfo employee) {
		this.employee = employee;
	}

	public CompanyProjectInfo getProject() {
		return project;
	}

	public void setProject(CompanyProjectInfo project) {
		this.project = project;
	}

	public CompanyRole getRole() {
		return role;
	}

	public void setRole(CompanyRole role) {
		this.role = role;
	}
	public Integer getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(Integer delFlg) {
		this.delFlg = delFlg;
	}
	public LocalDateTime getAssignmentStartDate() {
		return assignmentStartDate;
	}
	public void setAssignmentStartDate(LocalDateTime assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}
	public LocalDateTime getAssignmentEndDate() {
		return assignmentEndDate;
	}
	public void setAssignmentEndDate(LocalDateTime assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}
	
	@Override
	public String toString() {
		return "EmployeeProjectInfo [id=" + id + ", employee=" + employee + ", project=" + project + ", role=" + role
				+ ", delFlg=" + delFlg + ", assignmentStartDate=" + assignmentStartDate + ", assignmentEndDate="
				+ assignmentEndDate + "]";
	}
	
	
}
