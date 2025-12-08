package com.shivamSinghal.elms.customQueries;

public class CompanyLeaveTypeCustomQueries {
	public CompanyLeaveTypeCustomQueries() {
		
	}
	
	public static final String UPDATE_COMPANY_LEAVE_TYPE="UPDATE CompanyLeaveType SET "
			+ "leaveName = :#{#companyLeaveType.leaveName} ,"
			+ "maxLeavePerYear = :#{#companyLeaveType.maxLeavePerYear},"
			+ "isCarryForwardAllowed = :#{#companyLeaveType.isCarryForwardAllowed},"
			+ "leaveCategory = :#{#companyLeaveType.leaveCategory} where leaveId = :leaveId";
	
	public static final String DELETE_COMPANY_LEAVE_TYPE="UPDATE CompanyLeaveType SET delFlg=1 where leaveId = :leaveId";
}
