package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.CompanyLeaveTypeCustomQueries;
import com.shivamSinghal.elms.model.CompanyLeaveType;

import jakarta.transaction.Transactional;

@Repository
public interface CompanyLeaveTypeJPARepository extends JpaRepository<CompanyLeaveType, Integer>{
	
	CompanyLeaveType getByLeaveId(Integer leaveId);

	@Modifying
	@Transactional
	@Query(value=CompanyLeaveTypeCustomQueries.UPDATE_COMPANY_LEAVE_TYPE)
	int updateLeaveTypeById(@Param(value = "leaveId") Integer leaveId,@Param(value="companyLeaveType") CompanyLeaveType companyLeaveType);

	@Modifying
	@Transactional
	@Query(value=CompanyLeaveTypeCustomQueries.DELETE_COMPANY_LEAVE_TYPE)
	int deleteLeaveTypeById(@Param(value="leaveId") Integer leaveId);
	
}
