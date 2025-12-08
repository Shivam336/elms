package com.shivamSinghal.elms.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CompanyRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String roleName;
	
	@OneToMany(mappedBy = "role")
	private List<EmployeeProjectInfo> employeeProjectInfo;
	
	public CompanyRole() {
		
	}
	
	public CompanyRole(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public List<EmployeeProjectInfo> getEmployeeProjectInfo() {
		return employeeProjectInfo;
	}

	public void setEmployeeProjectInfo(List<EmployeeProjectInfo> employeeProjectInfo) {
		this.employeeProjectInfo = employeeProjectInfo;
	}

	@Override
	public String toString() {
		return "CompanyRole [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
}
