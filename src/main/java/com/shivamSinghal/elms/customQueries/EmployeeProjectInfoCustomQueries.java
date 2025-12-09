package com.shivamSinghal.elms.customQueries;

public class EmployeeProjectInfoCustomQueries {
	EmployeeProjectInfoCustomQueries(){
		
	}
	
	public static final String GET_EMPLOYEE_PROJECT_INFO_BY_EMPLOYEE_ID="SELECT * FROM employee_project_info WHERE EMPLOYEE_ID =:employeeId";
	public static final String DELETE_EMPLOYEE_PROJECT_INFO_BY_EMPLOYEE_ID = "UPDATE employee_project_info SET DEL_FLG=1 WHERE EMPLOYEE_ID =:employeeId AND PROJECT_ID =:projectId";
	public static final String UPDATE_EMPLOYEE_PROJECT_INFO_BY_EMPLOYEE_ID = "UPDATE employee_project_info SET "
			+ "ASSIGNMENT_END_DATE = :#{#employeeProjectInfo.assignmentEndDate}, "
			+ "ASSIGNMENT_START_DATE = :#{#employeeProjectInfo.assignmentStartDate}, "
			+ "DEL_FLG = :#{#employeeProjectInfo.delFlg}, "
			+ "ROLE_ID = :#{#employeeProjectInfo.roleId} "
			+ "WHERE EMPLOYEE_ID = :#{#employeeProjectInfo.employeeId} "
			+ "AND PROJECT_ID = :#{#employeeProjectInfo.projectId}";
}
