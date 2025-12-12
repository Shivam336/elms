package com.shivamSinghal.elms.customQueries;

public class EmployeeLeaveInfoCustomQueries {
	public EmployeeLeaveInfoCustomQueries() {
		
	}
	
	public static final String GET_EMPLOYEE_LEAVE_INFO_BY_EMPLOYEE_ID="SELECT * FROM EMPLOYEE_LEAVE_INFO WHERE EMPLOYEE_ID = :employee_id";
	public static final String UPDATE_EMPLOYEE_LEAVE_INFO_BY_EMPLOYEE_ID = "UPDATE EMPLOYEE_LEAVE_INFO SET "
			+ " LEAVE_COUNT = :#{#employee_leave_info.leaveCount}"
			+ " WHERE LEAVE_ID = :#{#employee_leave_info.leaveId} AND EMPLOYEE_ID = :#{#employee_leave_info.employeeId}";
}
