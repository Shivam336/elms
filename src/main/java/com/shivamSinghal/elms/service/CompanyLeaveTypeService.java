package com.shivamSinghal.elms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.CompanyLeaveTypeControllerDao;
import com.shivamSinghal.elms.model.CompanyLeaveType;

@Service
public class CompanyLeaveTypeService {

	@Autowired
	CompanyLeaveTypeControllerDao companyLeaveTypeControllerDao;
	
	public CompanyLeaveType getLeaveTypeService(Integer leaveId) {
		CompanyLeaveType res=companyLeaveTypeControllerDao.getLeaveTypeDao(leaveId);
		return res;
	}

	public CompanyLeaveType addLeaveTypeService(CompanyLeaveType companyLeaveType) {
		CompanyLeaveType res=companyLeaveTypeControllerDao.addLeaveTypeDao(companyLeaveType);
		return res;
	}

	public int updateLeaveTypeService(Integer leaveId, CompanyLeaveType companyLeaveType) {
		int res=companyLeaveTypeControllerDao.updateLeaveTypeDao(leaveId,companyLeaveType);
		return res;
	}

	public int deleteLeaveTypeService(Integer leaveId) {
		int res=companyLeaveTypeControllerDao.deleteLeaveTypeDao(leaveId);
		return res;
	}

}
