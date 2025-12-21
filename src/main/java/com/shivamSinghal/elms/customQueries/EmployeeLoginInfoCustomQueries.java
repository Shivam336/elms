package com.shivamSinghal.elms.customQueries;

public class EmployeeLoginInfoCustomQueries {

	public EmployeeLoginInfoCustomQueries() {
		
	}
	
	//public static final String GET_EMPLOYEE_LOGIN_INFO = "SELECT c from EmployeeLoginInfo c WHERE c.employeePersonalInfo.employeeId = :employeeId AND c.password = :password";

	public static final String GET_EMPLOYEE_LOGIN_INFO = "SELECT * from EMPLOYEE_LOGIN_INFO WHERE EMPLOYEE_ID = :employeeId AND PASSWORD = :password";
	public static final String UPDATE_EMPLOYEE_LOGIN_INFO = "UPDATE EMPLOYEE_LOGIN_INFO SET PASSWORD = :#{#employeeLoginInfoDto.password} WHERE EMPLOYEE_ID = :#{#employeeLoginInfoDto.employeeId}";
	public static final String DELETE_EMPLOYEE_LOGIN_INFO = "UPDATE EMPLOYEE_LOGIN_INFO SET ACCOUNT_LOCKED = :#{#employeeLoginInfoDto.accountLocked} WHERE EMPLOYEE_ID = :#{#employeeLoginInfoDto.employeeId}";
	public static final String FIND_EMPLOYEE_LOGIN_INFO_BY_EMPLOYEE_ID = "SELECT * from EMPLOYEE_LOGIN_INFO WHERE EMPLOYEE_ID = :employeeId";

}
