package com.shivamSinghal.elms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.EmployeeProjectInfoDao;
import com.shivamSinghal.elms.dto.EmployeeProjectInfoDto;
import com.shivamSinghal.elms.model.CompanyProjectInfo;
import com.shivamSinghal.elms.model.CompanyRole;
import com.shivamSinghal.elms.model.EmployeePersonalInfo;
import com.shivamSinghal.elms.model.EmployeeProjectInfo;

@Service
public class EmployeeProjectInfoService {

	@Autowired
	EmployeeProjectInfoDao employeeProjectInfoDao;
	
	public EmployeeProjectInfoDto addEmployeeProjectInfoService(EmployeeProjectInfoDto employeeProjectInfo) {
		
		EmployeeProjectInfo obj= new EmployeeProjectInfo();
		
		EmployeePersonalInfo objEmployeePersonalInfo = new EmployeePersonalInfo();
		objEmployeePersonalInfo.setEmployeeId(employeeProjectInfo.getEmployeeId());
		
		obj.setEmployee(objEmployeePersonalInfo);
		
		CompanyProjectInfo objCompanyProjectInfo = new CompanyProjectInfo();
		objCompanyProjectInfo.setProjectId(employeeProjectInfo.getProjectId());
		
		obj.setProject(objCompanyProjectInfo);
		
		CompanyRole objCompanyRole = new CompanyRole();
		objCompanyRole.setRoleId(employeeProjectInfo.getRoleId());
		
		obj.setRole(objCompanyRole);
		obj.setDelFlg(employeeProjectInfo.getDelFlg());
		obj.setAssignmentStartDate(employeeProjectInfo.getAssignmentStartDate());
		obj.setAssignmentEndDate(employeeProjectInfo.getAssignmentEndDate());
		
		EmployeeProjectInfo result=employeeProjectInfoDao.addEmployeeProjectInfoDao(obj);
		
		EmployeeProjectInfoDto response= new EmployeeProjectInfoDto(result.getEmployee().getEmployeeId(),
				result.getProject().getProjectId(), 
				result.getRole().getRoleId(), 
				result.getDelFlg(),
				result.getAssignmentStartDate(),
				result.getAssignmentEndDate());
		return response;
	}

	public List<EmployeeProjectInfoDto> getEmployeeProjectInfoService(Integer employeeId) {
		
		List<EmployeeProjectInfoDto>result=employeeProjectInfoDao.getEmployeeProjectInfoByEmployeeIdDao(employeeId);
		
		return result;
	}

	public int deleteEmployeeProjectInfoService(Integer employeeId, Integer projectId) {
		int res=employeeProjectInfoDao.deleteEmployeeProjectInfoDao(employeeId,projectId);
		return res;
	}

	public int updateEmployeeProjectInfoService(EmployeeProjectInfoDto employeeProjectInfo) {
		int res=employeeProjectInfoDao.updateEmployeeProjectInfoDao(employeeProjectInfo);
		return res;
	}

}
