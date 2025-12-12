package com.shivamSinghal.elms.dto;

public class EmployeeLeaveInfoDto {
	
	private Integer id;
	private Integer leaveCount;
	private Integer leaveId;
	private Integer employeeId;
	
	public EmployeeLeaveInfoDto() {
		
	}
	
	public EmployeeLeaveInfoDto(Integer leaveCount, Integer leaveId, Integer employeeId) {
		super();
		this.leaveCount = leaveCount;
		this.leaveId = leaveId;
		this.employeeId = employeeId;
	}
		
	public EmployeeLeaveInfoDto(Integer id, Integer leaveCount, Integer leaveId, Integer employeeId) {
		super();
		this.id = id;
		this.leaveCount = leaveCount;
		this.leaveId = leaveId;
		this.employeeId = employeeId;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(Integer leaveCount) {
		this.leaveCount = leaveCount;
	}
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "EmployeeLeaveInfoDto [id=" + id + ", leaveCount=" + leaveCount + ", leaveId=" + leaveId
				+ ", employeeId=" + employeeId + "]";
	}
	
	
	
	
}
