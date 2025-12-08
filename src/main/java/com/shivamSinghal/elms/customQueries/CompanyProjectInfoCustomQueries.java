package com.shivamSinghal.elms.customQueries;

public class CompanyProjectInfoCustomQueries {
	public CompanyProjectInfoCustomQueries() {
		
	}
	
	public static final String UPDATE_PROJECT_INFO_BY_ID=
			"UPDATE CompanyProjectInfo SET "
			+ "projectName = :#{#projectInfo.projectName},"
			+ "projectLocation = :#{#projectInfo.projectLocation},"
			+ "projectCustomerName = :#{#projectInfo.projectCustomerName},"
			+ "projectAllocationNumber = :#{#projectInfo.projectAllocationNumber},"
			+ "projectStartDate = :#{#projectInfo.projectStartDate},"
			+ "projectEndDate = :#{#projectInfo.projectEndDate},"
			+ "projectStatus = :#{#projectInfo.projectStatus}"
			+ " WHERE projectId = :projectId";
	
	public static final String DELETE_PROJECT_INFO_BY_ID = 
			"UPDATE CompanyProjectInfo SET "
			+ "projectStatus = 'INACIVE'"
			+ " WHERE projectId = :projectId";

}
