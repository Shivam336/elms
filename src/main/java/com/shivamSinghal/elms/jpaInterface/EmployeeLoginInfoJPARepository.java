package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.EmployeeLoginInfoCustomQueries;
import com.shivamSinghal.elms.dto.EmployeeLoginInfoDto;
import com.shivamSinghal.elms.model.EmployeeLoginInfo;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeLoginInfoJPARepository extends JpaRepository<EmployeeLoginInfo, Integer>{

	@Query(value = EmployeeLoginInfoCustomQueries.GET_EMPLOYEE_LOGIN_INFO, nativeQuery =true)
	EmployeeLoginInfoDto getEmployeeLoginInfo(@Param(value = "employeeId") String employeeId,@Param(value = "password") String password);

	@Modifying
	@Transactional
	@Query(value = EmployeeLoginInfoCustomQueries.UPDATE_EMPLOYEE_LOGIN_INFO, nativeQuery =true)
	int updateEmployeeLoginInfo(@Param(value ="employeeLoginInfoDto") EmployeeLoginInfoDto employeeLoginInfoDto);

	
	@Modifying
	@Transactional
	@Query(value =EmployeeLoginInfoCustomQueries.DELETE_EMPLOYEE_LOGIN_INFO, nativeQuery =true)
	int deleteEmployeeLoginInfo(@Param(value ="employeeLoginInfoDto") EmployeeLoginInfoDto employeeLoginInfoDto);

}
