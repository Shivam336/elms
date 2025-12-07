package com.shivamSinghal.elms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.EmployeePersonalInfoDao;
import com.shivamSinghal.elms.model.EmployeePersonalInfo;

@Service
public class EmployeePersonalInfoService {
	
	@Autowired
	EmployeePersonalInfoDao employeePersonalInfoDao;

	public EmployeePersonalInfo createNewEmployee(EmployeePersonalInfo employeePersonalInfo) {
		EmployeePersonalInfo res = employeePersonalInfoDao.createNewEmployeeDao(employeePersonalInfo);
		return res;
	}

	public EmployeePersonalInfo getEmployeeById(Integer employeeId) {
		EmployeePersonalInfo employeePersonalInfoService = employeePersonalInfoDao.getEmployeeByIdDao(employeeId);
		return employeePersonalInfoService;
	}

	public int updateEmployee(Integer employeeId,EmployeePersonalInfo employeePersonalInfo) {
		int employeePersonalInfoService = employeePersonalInfoDao.updateEmployee(employeeId,employeePersonalInfo);
		return employeePersonalInfoService;
	}

	public int deleteEmployee(Integer employeeId) {
		int employeePersonalInfoService = employeePersonalInfoDao.deleteEmployee(employeeId);
		return employeePersonalInfoService;
	}

}
