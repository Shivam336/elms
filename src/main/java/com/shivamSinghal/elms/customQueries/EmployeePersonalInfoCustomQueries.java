package com.shivamSinghal.elms.customQueries;

public class EmployeePersonalInfoCustomQueries {
	public static final String UPDATE_BY_EMPLOYEE_ID =
	        "UPDATE EmployeePersonalInfo SET " +
	        "baseLocation = :#{#employee.baseLocation}, " +
	        "delFlg = :#{#employee.delFlg}, " +
	        "fatherName = :#{#employee.fatherName}, " +
	        "fname = :#{#employee.fname}, " +
	        "homeAddress = :#{#employee.homeAddress}, " +
	        "lname = :#{#employee.lname}, " +
	        "motherName = :#{#employee.motherName}, " +
	        "personalEmail = :#{#employee.personalEmail}, " +
	        "phone = :#{#employee.phone}, " +
	        "status = :#{#employee.status} " +
	        "WHERE employeeId = :employeeId";
	
	public static final String DELETE_BY_EMPLOYEE_ID =
	        "UPDATE EmployeePersonalInfo SET " +
	        "delFlg = 1" +
	        "WHERE employeeId = :employeeId";
	
	public EmployeePersonalInfoCustomQueries() {
		
	}
			
				
}
