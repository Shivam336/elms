package com.shivamSinghal.elms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.dto.EmployeeLeaveInfoDto;
import com.shivamSinghal.elms.jpaInterface.EmployeeLeaveInfoJPARepository;
import com.shivamSinghal.elms.model.EmployeeLeaveInfo;

@Repository
public class EmployeeLeaveInfoDao {
	
	@Autowired
	EmployeeLeaveInfoJPARepository employeeLeaveInfoJPARepository;

	public List<EmployeeLeaveInfoDto> getEmployeeLeaveInfoDaoByEmployeeId(Integer employee_id) {
		List<EmployeeLeaveInfoDto> res=employeeLeaveInfoJPARepository.getEmployeeLeaveInfoByEmployeeId(employee_id);
		return res;
	}

	public EmployeeLeaveInfo addEmployeeLeaveInfoDao(EmployeeLeaveInfo obj) {
		EmployeeLeaveInfo res = employeeLeaveInfoJPARepository.save(obj);
		return res;
	}

	public int updateEmployeeLeaveInfoDao(EmployeeLeaveInfoDto employeeLeaveInfoDto) {
		int res = employeeLeaveInfoJPARepository.updateEmployeeLeaveInfoByEmployeeIdAndLeaveId(employeeLeaveInfoDto);
		return res;
	}

}
