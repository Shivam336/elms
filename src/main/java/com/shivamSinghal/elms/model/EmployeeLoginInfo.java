package com.shivamSinghal.elms.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class EmployeeLoginInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_login_info_sequence")
	@SequenceGenerator(name = "employee_login_info_sequence", sequenceName = "employee_login_info_sequence", allocationSize = 1)
	private Integer id;
	private String companyEmail;
	private String password;
	private LocalDateTime passwordExpiryDate;
	private Integer accountLocked;
	
	@OneToOne
	@JoinColumn(name="employee_Id", referencedColumnName ="employeeId")
	private EmployeePersonalInfo employeePersonalInfo;
	
	
	public EmployeeLoginInfo() {
		
	}
	
	public EmployeeLoginInfo(Integer id, String companyEmail, String password, LocalDateTime passwordExpiryDate, Integer accountLocked) {
		super();
		this.id = id;
		this.companyEmail = companyEmail;
		this.password = password;
		this.passwordExpiryDate = passwordExpiryDate;
		this.accountLocked = accountLocked;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getPasswordExpiryDate() {
		return passwordExpiryDate;
	}
	public void setPasswordExpiryDate(LocalDateTime passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}
	public Integer getAccountLocked() {
		return accountLocked;
	}
	public void setAccountLocked(Integer accountLocked) {
		this.accountLocked = accountLocked;
	}
	
	public EmployeePersonalInfo getEmployeePersonalInfo() {
		return employeePersonalInfo;
	}
	public void setEmployeePersonalInfo(EmployeePersonalInfo employeePersonalInfo) {
		this.employeePersonalInfo = employeePersonalInfo;
	}
	
	@Override
	public String toString() {
		return "EmployeeLoginInfo [id=" + id + ", companyEmail=" + companyEmail + ", password=" + password
				+ ", passwordExpiryDate=" + passwordExpiryDate + ", accountLocked=" + accountLocked + "]";
	}
	
	
}
