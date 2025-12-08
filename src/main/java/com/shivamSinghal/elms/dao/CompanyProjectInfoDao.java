package com.shivamSinghal.elms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.jpaInterface.CompanyProjectInfoJPARepository;
import com.shivamSinghal.elms.model.CompanyProjectInfo;

@Repository
public class CompanyProjectInfoDao {
	
	@Autowired
	CompanyProjectInfoJPARepository companyProjectInfoJPARepository;

	public CompanyProjectInfo getProjectInfoDao(Integer projectId) {
		CompanyProjectInfo res=companyProjectInfoJPARepository.getByProjectId(projectId);
		return res;
	}

	public CompanyProjectInfo addProjectInfoDao(CompanyProjectInfo companyProjectInfo) {
		CompanyProjectInfo res=companyProjectInfoJPARepository.save(companyProjectInfo);
		return res;
	}

	public int updateProjectInfoDao(Integer projectId, CompanyProjectInfo companyProjectInfo) {
		int res=companyProjectInfoJPARepository.updateProjectInfoByProjectId(projectId,companyProjectInfo);
		return res;
	}

	public int deleteProjectInfoDao(Integer projectId) {
		int res=companyProjectInfoJPARepository.deleteProjectInfoByProjectId(projectId);
		return res;
	}
	
	
	
}
