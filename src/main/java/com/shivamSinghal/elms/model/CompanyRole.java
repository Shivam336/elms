package com.shivamSinghal.elms.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CompanyRole {
	
	@Id
	private int roleId;
	private String roleName;
	
	@OneToMany(mappedBy = "role")
	private List<EmployeeProjectInfo> employeeProjectInfo;
	
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
	@Override
	public String toString() {
		return "CompanyRole [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
}
