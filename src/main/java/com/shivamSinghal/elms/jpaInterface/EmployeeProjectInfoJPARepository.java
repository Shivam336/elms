package com.shivamSinghal.elms.jpaInterface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.EmployeeProjectInfoCustomQueries;
import com.shivamSinghal.elms.dto.EmployeeProjectInfoDto;
import com.shivamSinghal.elms.model.EmployeeProjectInfo;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeProjectInfoJPARepository extends JpaRepository<EmployeeProjectInfo, Integer>{
	
	@Query(value = EmployeeProjectInfoCustomQueries.GET_EMPLOYEE_PROJECT_INFO_BY_EMPLOYEE_ID, nativeQuery = true)
	List<EmployeeProjectInfoDto> getEmployeeProjectInfoByEmployeeId(@Param(value = "employeeId") Integer employeeId);

	@Modifying
	@Transactional
	@Query(value = EmployeeProjectInfoCustomQueries.DELETE_EMPLOYEE_PROJECT_INFO_BY_EMPLOYEE_ID, nativeQuery = true)
	int deleteEmployeeProjectInfo(@Param(value = "employeeId") Integer employeeId,@Param(value = "projectId") Integer projectId);

	@Modifying
	@Transactional
	@Query(value = EmployeeProjectInfoCustomQueries.UPDATE_EMPLOYEE_PROJECT_INFO_BY_EMPLOYEE_ID, nativeQuery = true)
	int updateEmployeeProjectInfo(@Param(value = "employeeProjectInfo") EmployeeProjectInfoDto employeeProjectInfo);
}
