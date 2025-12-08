package com.shivamSinghal.elms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.jpaInterface.CompanyLeaveTypeJPARepository;
import com.shivamSinghal.elms.model.CompanyLeaveType;

@Repository
public class CompanyLeaveTypeControllerDao {
	
	@Autowired
	CompanyLeaveTypeJPARepository companyLeaveTypeJPARepository;
	
	public CompanyLeaveType getLeaveTypeDao(Integer leaveId) {
		CompanyLeaveType res=companyLeaveTypeJPARepository.getByLeaveId(leaveId);
		return res;
	}

	public CompanyLeaveType addLeaveTypeDao(CompanyLeaveType companyLeaveType) {
		CompanyLeaveType res=companyLeaveTypeJPARepository.save(companyLeaveType);
		return res;
	}

	public int updateLeaveTypeDao(Integer leaveId, CompanyLeaveType companyLeaveType) {
		int res=companyLeaveTypeJPARepository.updateLeaveTypeById(leaveId,companyLeaveType);
		return res;
	}

	public int deleteLeaveTypeDao(Integer leaveId) {
		int res=companyLeaveTypeJPARepository.deleteLeaveTypeById(leaveId);
		return res;
	}

}
