package com.shivamSinghal.elms.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CompanyRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_role_sequence")
	@SequenceGenerator(name = "company_role_sequence", sequenceName = "company_role_sequence", allocationSize = 1)
	private Integer roleId;
	private String roleName;
	private int delFlg;
	
	@OneToMany(mappedBy = "role")
	private List<EmployeeProjectInfo> employeeProjectInfo;
	
	public CompanyRole() {
		
	}
	
	
	public CompanyRole(Integer roleId, String roleName, int delFlg) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.delFlg = delFlg;
	}


	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
	
	public int getDelFlg() {
		return delFlg;
	}


	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}


	public List<EmployeeProjectInfo> getEmployeeProjectInfo() {
		return employeeProjectInfo;
	}

	public void setEmployeeProjectInfo(List<EmployeeProjectInfo> employeeProjectInfo) {
		this.employeeProjectInfo = employeeProjectInfo;
	}


	@Override
	public String toString() {
		return "CompanyRole [roleId=" + roleId + ", roleName=" + roleName + ", delFlg=" + delFlg + "]";
	}

	
	
}
