package com.shivamSinghal.elms.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeLoginInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String companyEmail;
	private String password;
	private Date passwordExpiryDate;
	private int accountLocked;
	
	@OneToOne
	@JoinColumn(name="employee_Id", referencedColumnName ="employeeId")
	private EmployeePersonalInfo employeePersonalInfo;
	
	
	public EmployeeLoginInfo() {
		
	}
	
	public EmployeeLoginInfo(int id, String companyEmail, String password, Date passwordExpiryDate, int accountLocked,
			EmployeePersonalInfo employeePersonalInfo) {
		super();
		this.id = id;
		this.companyEmail = companyEmail;
		this.password = password;
		this.passwordExpiryDate = passwordExpiryDate;
		this.accountLocked = accountLocked;
		this.employeePersonalInfo = employeePersonalInfo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Date getPasswordExpiryDate() {
		return passwordExpiryDate;
	}
	public void setPasswordExpiryDate(Date passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}
	public int getAccountLocked() {
		return accountLocked;
	}
	public void setAccountLocked(int accountLocked) {
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
				+ ", passwordExpiryDate=" + passwordExpiryDate + ", accountLocked=" + accountLocked
				+ ", employeePersonalInfo=" + employeePersonalInfo + "]";
	}
	
	
}
