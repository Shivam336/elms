package com.shivamSinghal.elms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.dto.EmployeeLoginInfoDto;
import com.shivamSinghal.elms.jpaInterface.EmployeeLoginInfoJPARepository;
import com.shivamSinghal.elms.model.EmployeeLoginInfo;

@Repository
public class EmployeeLoginInfoDao {

	@Autowired
	EmployeeLoginInfoJPARepository employeeLoginInfoJPARepository;
	
	public EmployeeLoginInfoDto getEmployeeLoginInfoDao(String employeeId, String password) {
		EmployeeLoginInfoDto res=employeeLoginInfoJPARepository.getEmployeeLoginInfo(employeeId,password);
		return res;
	}

	public EmployeeLoginInfo addEmployeeLoginInfoDao(EmployeeLoginInfo obj) {
		EmployeeLoginInfo res=employeeLoginInfoJPARepository.save(obj);
		return res;
	}

	public int updateEmployeeLoginInfoDao(EmployeeLoginInfoDto employeeLoginInfoDto) {
		int res=employeeLoginInfoJPARepository.updateEmployeeLoginInfo(employeeLoginInfoDto);
		return res;
	}

	public int deleteEmployeeLoginInfoDao(EmployeeLoginInfoDto employeeLoginInfoDto) {
		int res=employeeLoginInfoJPARepository.deleteEmployeeLoginInfo(employeeLoginInfoDto);
		return res;
	}

}
