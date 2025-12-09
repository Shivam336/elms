package com.shivamSinghal.elms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.dto.EmployeeProjectInfoDto;
import com.shivamSinghal.elms.jpaInterface.EmployeeProjectInfoJPARepository;
import com.shivamSinghal.elms.model.EmployeeProjectInfo;

@Repository
public class EmployeeProjectInfoDao {

	@Autowired
	EmployeeProjectInfoJPARepository employeeProjectInfoJPARepository;
	
	public EmployeeProjectInfo addEmployeeProjectInfoDao(EmployeeProjectInfo employeeProjectInfo) {
		EmployeeProjectInfo res=employeeProjectInfoJPARepository.save(employeeProjectInfo);
		return res;
	}
	
	public List<EmployeeProjectInfoDto> getEmployeeProjectInfoByEmployeeIdDao(Integer employeeId){
		List<EmployeeProjectInfoDto> res=employeeProjectInfoJPARepository.getEmployeeProjectInfoByEmployeeId(employeeId);
		return res;
	}

	public int deleteEmployeeProjectInfoDao(Integer employeeId, Integer projectId) {
		int res=employeeProjectInfoJPARepository.deleteEmployeeProjectInfo(employeeId,projectId);
		return res;
	}

	public int updateEmployeeProjectInfoDao(EmployeeProjectInfoDto employeeProjectInfo) {
		int res=employeeProjectInfoJPARepository.updateEmployeeProjectInfo(employeeProjectInfo);
		return res;
	}

}
