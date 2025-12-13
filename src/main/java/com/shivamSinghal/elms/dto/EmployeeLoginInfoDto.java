package com.shivamSinghal.elms.dto;

import java.time.LocalDateTime;


public class EmployeeLoginInfoDto {
	private Integer id;
	private String companyEmail;
	private String password;
	private LocalDateTime passwordExpiryDate;
	private Integer accountLocked;
	private Integer employeeId;
	
	public EmployeeLoginInfoDto() {
		
	}
	
	public EmployeeLoginInfoDto(Integer accountLocked, String companyEmail,String password,LocalDateTime passwordExpiryDate,Integer employeeId) {
		this.accountLocked=accountLocked;
		this.companyEmail=companyEmail;
		this.password=password;
		this.passwordExpiryDate=passwordExpiryDate;
		this.employeeId=employeeId;
	}
	
	public EmployeeLoginInfoDto(Integer id,Integer accountLocked, String companyEmail,String password,LocalDateTime passwordExpiryDate,Integer employeeId) {
		this.id=id;
		this.accountLocked=accountLocked;
		this.companyEmail=companyEmail;
		this.password=password;
		this.passwordExpiryDate=passwordExpiryDate;
		this.employeeId=employeeId;
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

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "EmployeeLoginInfoDto [id=" + id + ", companyEmail=" + companyEmail + ", password=" + password
				+ ", passwordExpiryDate=" + passwordExpiryDate + ", accountLocked=" + accountLocked + ", employeeId="
				+ employeeId + "]";
	}
	
	
}
