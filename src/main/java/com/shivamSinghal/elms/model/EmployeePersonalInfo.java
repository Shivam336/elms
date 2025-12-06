package com.shivamSinghal.elms.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class EmployeePersonalInfo {
	
	@Id
	private int employeeId;
	private String fname;
	private String lname;
	private String phone;
	private String personalEmail;
	private String fatherName;
	private String motherName;
	private String homeAddress;
	private String status;
	private int delFlg;
	private String baseLocation;
	
	@OneToMany(mappedBy = "employee")
	private List<EmployeeProjectInfo> employeeProjectInfo;
	
	
	public EmployeePersonalInfo(int employeeId, String fname, String lname, String phone, String personalEmail,
			String fatherName, String motherName, String homeAddress, String status, int delFlg, String baseLocation) {
		super();
		this.employeeId = employeeId;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.personalEmail = personalEmail;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.homeAddress = homeAddress;
		this.status = status;
		this.delFlg = delFlg;
		this.baseLocation = baseLocation;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "EmployeePersonalInfo [employeeId=" + employeeId + ", fname=" + fname + ", lname=" + lname + ", phone="
				+ phone + ", personalEmail=" + personalEmail + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", homeAddress=" + homeAddress + ", status=" + status + ", delFlg=" + delFlg
				+ ", baseLocation=" + baseLocation + "]";
	}
	
	
}
