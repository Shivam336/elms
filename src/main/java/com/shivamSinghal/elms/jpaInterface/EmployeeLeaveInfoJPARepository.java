package com.shivamSinghal.elms.jpaInterface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.EmployeeLeaveInfoCustomQueries;
import com.shivamSinghal.elms.dto.EmployeeLeaveInfoDto;
import com.shivamSinghal.elms.model.EmployeeLeaveInfo;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeLeaveInfoJPARepository extends JpaRepository<EmployeeLeaveInfo, Integer>{

	@Query(value = EmployeeLeaveInfoCustomQueries.GET_EMPLOYEE_LEAVE_INFO_BY_EMPLOYEE_ID, nativeQuery = true )
	List<EmployeeLeaveInfoDto> getEmployeeLeaveInfoByEmployeeId(@Param(value = "employee_id") Integer employee_id);

	@Modifying
	@Transactional
	@Query(value = EmployeeLeaveInfoCustomQueries.UPDATE_EMPLOYEE_LEAVE_INFO_BY_EMPLOYEE_ID, nativeQuery = true )
	int updateEmployeeLeaveInfoByEmployeeIdAndLeaveId(@Param(value = "employee_leave_info") EmployeeLeaveInfoDto employeeLeaveInfoDto);

}
