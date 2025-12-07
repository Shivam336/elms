package com.shivamSinghal.elms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.jpaInterface.EmployeePersonalInfoJPARepository;
import com.shivamSinghal.elms.model.EmployeePersonalInfo;
import com.shivamSinghal.elms.service.EmployeePersonalInfoService;

@Repository
public class EmployeePersonalInfoDao {

	@Autowired
	EmployeePersonalInfoJPARepository employeePersonalInfoJpaRepository;
	
	public EmployeePersonalInfo createNewEmployeeDao(EmployeePersonalInfo employeePersonalInfo) {
		EmployeePersonalInfo res=employeePersonalInfoJpaRepository.save(employeePersonalInfo);
		return res;
	}

	public EmployeePersonalInfo getEmployeeByIdDao(Integer employeeId) {
		return employeePersonalInfoJpaRepository.getByEmployeeId(employeeId);
	}

}
