package com.shivamSinghal.elms.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeProjectInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "employee_id", referencedColumnName = "employeeId")
	private EmployeePersonalInfo employee;
	
	@ManyToOne
	@JoinColumn(name = "project_id", referencedColumnName = "projectId")
	private CompanyProjectInfo project;
	
	@ManyToOne
	@JoinColumn(name = "role_id", referencedColumnName = "roleId")
	private CompanyRole role;
	
	private int delFlg;
	private Date assignmentStartDate;
	private Date assignmentEndDate;
	
	public EmployeeProjectInfo() {
		
	}
	
	public EmployeeProjectInfo(int id, EmployeePersonalInfo employee, CompanyProjectInfo project, CompanyRole role, int delFlg, Date assignmentStartDate,
			Date assignmentEndDate) {
		super();
		this.id = id;
		this.employee = employee;
		this.project = project;
		this.role = role;
		this.delFlg = delFlg;
		this.assignmentStartDate = assignmentStartDate;
		this.assignmentEndDate = assignmentEndDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}
	public Date getAssignmentStartDate() {
		return assignmentStartDate;
	}
	public void setAssignmentStartDate(Date assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}
	public Date getAssignmentEndDate() {
		return assignmentEndDate;
	}
	public void setAssignmentEndDate(Date assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}
	
	@Override
	public String toString() {
		return "EmployeeProjectInfo [id=" + id + ", employee=" + employee + ", project=" + project + ", role=" + role
				+ ", delFlg=" + delFlg + ", assignmentStartDate=" + assignmentStartDate + ", assignmentEndDate="
				+ assignmentEndDate + "]";
	}
	
	
}
