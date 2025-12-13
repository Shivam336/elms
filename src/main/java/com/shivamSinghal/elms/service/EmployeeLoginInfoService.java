package com.shivamSinghal.elms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.EmployeeLoginInfoDao;
import com.shivamSinghal.elms.dto.EmployeeLoginInfoDto;
import com.shivamSinghal.elms.model.EmployeeLoginInfo;
import com.shivamSinghal.elms.model.EmployeePersonalInfo;

@Service
public class EmployeeLoginInfoService {

	@Autowired
	EmployeeLoginInfoDao employeeLoginInfoDao;
	
	
	public EmployeeLoginInfoDto getEmployeeLoginInfoService(String employeeId, String password) {
		EmployeeLoginInfoDto res=employeeLoginInfoDao.getEmployeeLoginInfoDao(employeeId,password);
		return res;
	}


	public EmployeeLoginInfoDto addEmployeeLoginInfoService(EmployeeLoginInfoDto employeeLoginInfoDto) {
		
		EmployeeLoginInfo obj=new EmployeeLoginInfo();
		obj.setAccountLocked(employeeLoginInfoDto.getAccountLocked());
		obj.setCompanyEmail(employeeLoginInfoDto.getCompanyEmail());
		obj.setPassword(employeeLoginInfoDto.getPassword());
		obj.setPasswordExpiryDate(employeeLoginInfoDto.getPasswordExpiryDate());
		
		EmployeePersonalInfo obj2=new EmployeePersonalInfo();
		obj2.setEmployeeId(employeeLoginInfoDto.getEmployeeId());
		obj.setEmployeePersonalInfo(obj2);
		
		EmployeeLoginInfo res=employeeLoginInfoDao.addEmployeeLoginInfoDao(obj);
		
		EmployeeLoginInfoDto res2=new EmployeeLoginInfoDto(res.getId(), res.getAccountLocked(), res.getCompanyEmail(), res.getPassword(), res.getPasswordExpiryDate(), res.getEmployeePersonalInfo().getEmployeeId());
		
		
		return res2;
	}


	public int updateEmployeeLoginInfoService(EmployeeLoginInfoDto employeeLoginInfoDto) {
		int res=employeeLoginInfoDao.updateEmployeeLoginInfoDao(employeeLoginInfoDto);
		return res;
	}


	public int deleteEmployeeLoginInfoService(EmployeeLoginInfoDto employeeLoginInfoDto) {
		int res=employeeLoginInfoDao.deleteEmployeeLoginInfoDao(employeeLoginInfoDto);
		return res;
	}

}
