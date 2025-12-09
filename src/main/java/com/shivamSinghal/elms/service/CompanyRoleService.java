package com.shivamSinghal.elms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.CompanyRoleDao;
import com.shivamSinghal.elms.model.CompanyRole;

@Service
public class CompanyRoleService {
	
	@Autowired
	CompanyRoleDao companyRoleDao;

	public CompanyRole getCompanyRoleService(Integer roleId) {
		CompanyRole res=companyRoleDao.getCompanyRoleByIdDao(roleId);
		return res;
	}

	public CompanyRole addCompanyRoleService(CompanyRole companyRole) {
		CompanyRole res=companyRoleDao.addCompanyRoleByIdDao(companyRole);
		return res;
	}

	public int updateCompanyRoleByIdService(Integer roleId, CompanyRole companyRole) {
		int res=companyRoleDao.updateCompanyRoleByIdDao(roleId, companyRole);
		return res;
	}

	public int deleteCompanyRoleService(Integer roleId) {
		int res=companyRoleDao.deleteCompanyRoleByIdDao(roleId);
		return res;
	}

}
