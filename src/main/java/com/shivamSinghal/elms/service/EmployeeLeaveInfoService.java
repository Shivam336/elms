package com.shivamSinghal.elms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.EmployeeLeaveInfoDao;
import com.shivamSinghal.elms.dto.EmployeeLeaveInfoDto;
import com.shivamSinghal.elms.model.CompanyLeaveType;
import com.shivamSinghal.elms.model.EmployeeLeaveInfo;
import com.shivamSinghal.elms.model.EmployeePersonalInfo;

@Service
public class EmployeeLeaveInfoService {
	
	@Autowired
	EmployeeLeaveInfoDao employeeLeaveInfoDao;
	
	public List<EmployeeLeaveInfoDto> getEmployeeLeaveInfoServiceByEmployeeId(Integer employee_id) {
		
		List<EmployeeLeaveInfoDto> res=employeeLeaveInfoDao.getEmployeeLeaveInfoDaoByEmployeeId(employee_id);
		return res;
	}

	public EmployeeLeaveInfoDto addEmployeeLeaveInfoService(EmployeeLeaveInfoDto employeeLeaveInfoDto) {
		EmployeeLeaveInfo obj=new EmployeeLeaveInfo();
		
		EmployeePersonalInfo epi=new EmployeePersonalInfo();
		epi.setEmployeeId(employeeLeaveInfoDto.getEmployeeId());
		obj.setEmployeePersonalInfo(epi);
		
		CompanyLeaveType clt=new CompanyLeaveType();
		clt.setLeaveId(employeeLeaveInfoDto.getLeaveId());
		obj.setCompanyLeaveType(clt);
		
		obj.setLeaveCount(employeeLeaveInfoDto.getLeaveCount());
		
		EmployeeLeaveInfo eli= employeeLeaveInfoDao.addEmployeeLeaveInfoDao(obj);
		
		EmployeeLeaveInfoDto res=new EmployeeLeaveInfoDto(eli.getId(), eli.getLeaveCount(), eli.getCompanyLeaveType().getLeaveId(), eli.getEmployeePersonalInfo().getEmployeeId());
		
		
		return res;
	}

	public int updateEmployeeLeaveInfoService(EmployeeLeaveInfoDto employeeLeaveInfoDto) {
		
		int res = employeeLeaveInfoDao.updateEmployeeLeaveInfoDao(employeeLeaveInfoDto);
		
		return res;
	}
}
