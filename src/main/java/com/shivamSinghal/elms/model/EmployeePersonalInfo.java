package com.shivamSinghal.elms.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class EmployeePersonalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_id_sequence")
	@SequenceGenerator(name="employee_id_sequence", sequenceName = "employee_id_sequence", allocationSize = 1)
//	@Column(name="employee_id")
	private Integer employeeId;
	private String fname;
	private String lname;
	private String phone;
	private String personalEmail;
	private String fatherName;
	private String motherName;
	private String homeAddress;
	private String status;
	private Integer delFlg;
	private String baseLocation;
	
	@OneToMany(mappedBy = "employee")
	private List<EmployeeProjectInfo> employeeProjectInfo=new ArrayList<>();
	
	@OneToOne(mappedBy = "employeePersonalInfo")
	private EmployeeLoginInfo employeeLoginInfo;
	
	@OneToOne(mappedBy= "employeePersonalInfo")
	private List<EmployeeLeaveInfo> employeeLeaveInfos;
	
	@OneToMany(mappedBy = "employeePersonalInfo")
	private List<EmployeeLeaveTracker> employeeLeaveTracker=new ArrayList<>();
	
	public EmployeePersonalInfo() {
		
	}
	
	public EmployeePersonalInfo(Integer employeeId, String fname, String lname, String phone, String personalEmail,
			String fatherName, String motherName, String homeAddress, String status, Integer delFlg, String baseLocation) {
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
	public Integer getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(Integer delFlg) {
		this.delFlg = delFlg;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
	public List<EmployeeProjectInfo> getEmployeeProjectInfo() {
		return employeeProjectInfo;
	}

	public void setEmployeeProjectInfo(List<EmployeeProjectInfo> employeeProjectInfo) {
		this.employeeProjectInfo = employeeProjectInfo;
	}

	public EmployeeLoginInfo getEmployeeLoginInfo() {
		return employeeLoginInfo;
	}

	public void setEmployeeLoginInfo(EmployeeLoginInfo employeeLoginInfo) {
		this.employeeLoginInfo = employeeLoginInfo;
	}

	public List<EmployeeLeaveInfo> getEmployeeLeaveInfos() {
		return employeeLeaveInfos;
	}

	public void setEmployeeLeaveInfos(List<EmployeeLeaveInfo> employeeLeaveInfos) {
		this.employeeLeaveInfos = employeeLeaveInfos;
	}

	public List<EmployeeLeaveTracker> getEmployeeLeaveTracker() {
		return employeeLeaveTracker;
	}

	public void setEmployeeLeaveTracker(List<EmployeeLeaveTracker> employeeLeaveTracker) {
		this.employeeLeaveTracker = employeeLeaveTracker;
	}

	@Override
	public String toString() {
		return "EmployeePersonalInfo [employeeId=" + employeeId + ", fname=" + fname + ", lname=" + lname + ", phone="
				+ phone + ", personalEmail=" + personalEmail + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", homeAddress=" + homeAddress + ", status=" + status + ", delFlg=" + delFlg
				+ ", baseLocation=" + baseLocation + "]";
	}
	
	
}
