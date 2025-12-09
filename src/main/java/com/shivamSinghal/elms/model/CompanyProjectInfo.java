package com.shivamSinghal.elms.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CompanyProjectInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_id_sequence")
	@SequenceGenerator(name = "project_id_sequence", sequenceName = "project_id_sequence", allocationSize = 1)
	private Integer projectId;
	private String projectName;
	private String projectLocation;
	private String projectCustomerName;
	private Integer projectAllocationNumber;
	private LocalDate projectStartDate;
	private LocalDate projectEndDate;
	private String projectStatus;
	
	@OneToMany(mappedBy = "project")
	private List<EmployeeProjectInfo> employeeProjectInfo=new ArrayList<>();
	
	public CompanyProjectInfo() {
		
	}
	
	public CompanyProjectInfo(Integer projectId, String projectName, String projectLocation, String projectCustomerName,
			Integer projectAllocationNumber, LocalDate projectStartDate, LocalDate projectEndDate,
			String projectStatus) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLocation = projectLocation;
		this.projectCustomerName = projectCustomerName;
		this.projectAllocationNumber = projectAllocationNumber;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
		this.projectStatus = projectStatus;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectLocation() {
		return projectLocation;
	}
	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}
	public String getProjectCustomerName() {
		return projectCustomerName;
	}
	public void setProjectCustomerName(String projectCustomerName) {
		this.projectCustomerName = projectCustomerName;
	}
	public Integer getProjectAllocationNumber() {
		return projectAllocationNumber;
	}
	public void setProjectAllocationNumber(Integer projectAllocationNumber) {
		this.projectAllocationNumber = projectAllocationNumber;
	}
	public LocalDate getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(LocalDate projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public LocalDate getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(LocalDate projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	
	public List<EmployeeProjectInfo> getEmployeeProjectInfo() {
		return employeeProjectInfo;
	}

	public void setEmployeeProjectInfo(List<EmployeeProjectInfo> employeeProjectInfo) {
		this.employeeProjectInfo = employeeProjectInfo;
	}

	@Override
	public String toString() {
		return "CompanyProjectInfo [projectId=" + projectId + ", projectName=" + projectName + ", projectLocation="
				+ projectLocation + ", projectCustomerName=" + projectCustomerName + ", projectAllocationNumber="
				+ projectAllocationNumber + ", projectStartDate=" + projectStartDate
				+ ", projectEndDate=" + projectEndDate + ", projectStatus=" + projectStatus + "]";
	}
	
	
}
