package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.CompanyRoleCustomQueries;
import com.shivamSinghal.elms.model.CompanyRole;

import jakarta.transaction.Transactional;

@Repository
public interface CompanyRoleJPARepository extends JpaRepository<CompanyRole, Integer>{

	@Query(value=CompanyRoleCustomQueries.GET_COMPANY_ROLE_BY_ID)
	CompanyRole getCompanyRoleById(@Param(value="roleId") Integer roleId);

	@Modifying
	@Transactional
	@Query(value=CompanyRoleCustomQueries.UPDATE_COMPANY_ROLE_BY_ID)
	int updateCompanyRoleById(@Param(value="roleId") Integer roleId,@Param(value="companyRole") CompanyRole companyRole);

	@Modifying
	@Transactional
	@Query(value=CompanyRoleCustomQueries.DELETE_COMPANY_ROLE_BY_ID)
	int deleteCompanyRoleById(@Param(value="roleId") Integer roleId);

}
