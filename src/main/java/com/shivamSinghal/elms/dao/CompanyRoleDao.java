package com.shivamSinghal.elms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.jpaInterface.CompanyRoleJPARepository;
import com.shivamSinghal.elms.model.CompanyRole;

@Repository
public class CompanyRoleDao {

	@Autowired
	CompanyRoleJPARepository companyRoleJPARepository;
	
	public CompanyRole getCompanyRoleByIdDao(Integer roleId) {
		CompanyRole res=companyRoleJPARepository.getCompanyRoleById(roleId);
		return res;
	}

	public CompanyRole addCompanyRoleByIdDao(CompanyRole companyRole) {
		CompanyRole res=companyRoleJPARepository.save(companyRole);
		return res;
	}

	public int updateCompanyRoleByIdDao(Integer roleId, CompanyRole companyRole) {
		int res=companyRoleJPARepository.updateCompanyRoleById(roleId,companyRole);
		return res;
	}

	public int deleteCompanyRoleByIdDao(Integer roleId) {
		int res=companyRoleJPARepository.deleteCompanyRoleById(roleId);
		return res;
	}

}
