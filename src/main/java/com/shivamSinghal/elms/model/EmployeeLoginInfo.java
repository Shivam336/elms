package com.shivamSinghal.elms.model;

import java.util.Date;

public class EmployeeLoginInfo {
	private int employeeId;
	private String companyEmail;
	private String password;
	private Date passwordExpiryDate;
	private int accountLocked;
	public EmployeeLoginInfo(int employeeId, String companyEmail, String password, Date passwordExpiryDate,
			int accountLocked) {
		super();
		this.employeeId = employeeId;
		this.companyEmail = companyEmail;
		this.password = password;
		this.passwordExpiryDate = passwordExpiryDate;
		this.accountLocked = accountLocked;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	@Override
	public String toString() {
		return "EmployeeLoginInfo [employeeId=" + employeeId + ", companyEmail=" + companyEmail + ", password="
				+ password + ", passwordExpiryDate=" + passwordExpiryDate + ", accountLocked=" + accountLocked + "]";
	}
	
	
}
