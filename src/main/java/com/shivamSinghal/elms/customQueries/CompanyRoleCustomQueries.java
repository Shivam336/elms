package com.shivamSinghal.elms.customQueries;

public class CompanyRoleCustomQueries {
	
	CompanyRoleCustomQueries(){
		
	}
	
	public static final String GET_COMPANY_ROLE_BY_ID="SELECT c FROM CompanyRole c WHERE c.roleId = :roleId";
	
	public static final String UPDATE_COMPANY_ROLE_BY_ID="UPDATE CompanyRole SET roleName = :#{#companyRole.roleName} WHERE roleId =:roleId";
	
	public static final String DELETE_COMPANY_ROLE_BY_ID="UPDATE CompanyRole SET delFlg=1 where roleId =:roleId";
	
}
