package com.shivamSinghal.elms.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class EmployeeProjectInfoDto {

	private Integer id;
	private LocalDateTime assignmentStartDate;
	private LocalDateTime assignmentEndDate;
	private Integer delFlg;
	private Integer employeeId;
	private Integer projectId;
	private Integer roleId;
	
	public EmployeeProjectInfoDto() {
		
	}
	
	
	public EmployeeProjectInfoDto(Integer id, LocalDateTime assignmentStartDate, LocalDateTime assignmentEndDate,
			Integer delFlg, Integer employeeId, Integer projectId, Integer roleId) {
		super();
		this.id = id;
		this.assignmentStartDate = assignmentStartDate;
		this.assignmentEndDate = assignmentEndDate;
		this.delFlg = delFlg;
		this.employeeId = employeeId;
		this.projectId = projectId;
		this.roleId = roleId;
	}


	public EmployeeProjectInfoDto(Integer employeeId, Integer projectId, Integer roleId, Integer delFlg,
			LocalDateTime assignmentStartDate, LocalDateTime assignmentEndDate) {
		super();
		this.employeeId = employeeId;
		this.projectId = projectId;
		this.roleId = roleId;
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

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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
		return "EmployeeProjectInfoDto [id=" + id + ", employeeId=" + employeeId + ", projectId=" + projectId
				+ ", roleId=" + roleId + ", delFlg=" + delFlg + ", assignmentStartDate=" + assignmentStartDate
				+ ", assignmentEndDate=" + assignmentEndDate + "]";
	}

}
