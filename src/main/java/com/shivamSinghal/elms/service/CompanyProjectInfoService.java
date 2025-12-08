package com.shivamSinghal.elms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dao.CompanyProjectInfoDao;
import com.shivamSinghal.elms.model.CompanyProjectInfo;

@Service
public class CompanyProjectInfoService {
	
	@Autowired
	CompanyProjectInfoDao companyProjectInfoDao;
	
	public CompanyProjectInfo getProjectInfoService(Integer projectId) {
		CompanyProjectInfo res=companyProjectInfoDao.getProjectInfoDao(projectId);
		return res;
	}

	public CompanyProjectInfo addProjectInfoService(CompanyProjectInfo companyProjectInfo) {
		CompanyProjectInfo res=companyProjectInfoDao.addProjectInfoDao(companyProjectInfo);
		return res;
	}

	public int updateProjectInfoService(Integer projectId, CompanyProjectInfo companyProjectInfo) {
		int res = companyProjectInfoDao.updateProjectInfoDao(projectId,companyProjectInfo);
		return res;
	}

	public int deleteProjectInfoService(Integer projectId) {
		int res = companyProjectInfoDao.deleteProjectInfoDao(projectId);
		return res;
	}
}
