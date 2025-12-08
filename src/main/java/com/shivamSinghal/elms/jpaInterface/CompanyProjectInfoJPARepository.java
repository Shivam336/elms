package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.CompanyProjectInfoCustomQueries;
import com.shivamSinghal.elms.model.CompanyProjectInfo;

import jakarta.transaction.Transactional;

@Repository
public interface CompanyProjectInfoJPARepository extends JpaRepository<CompanyProjectInfo, Integer> {

	CompanyProjectInfo getByProjectId(Integer projectId);

	@Modifying
	@Transactional
	@Query(value = CompanyProjectInfoCustomQueries.UPDATE_PROJECT_INFO_BY_ID)
	int updateProjectInfoByProjectId(@Param(value="projectId") Integer projectId,@Param(value ="projectInfo") CompanyProjectInfo companyProjectInfo);

	
	@Modifying
	@Transactional
	@Query(value=CompanyProjectInfoCustomQueries.DELETE_PROJECT_INFO_BY_ID)
	int deleteProjectInfoByProjectId(@Param("projectId")Integer projectId);

}
