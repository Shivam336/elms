package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.customQueries.EmployeePersonalInfoCustomQueries;
import com.shivamSinghal.elms.model.EmployeePersonalInfo;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeePersonalInfoJPARepository extends JpaRepository<EmployeePersonalInfo, Integer>{

	EmployeePersonalInfo getByEmployeeId(Integer employeeId);

	@Modifying
	@Transactional
	@Query(value = EmployeePersonalInfoCustomQueries.UPDATE_BY_EMPLOYEE_ID)
	int updateByEmployeeId(@Param("employeeId") Integer employeeId, @Param("employee") EmployeePersonalInfo employeePersonalInfo);

	@Modifying
	@Transactional
	@Query(value = EmployeePersonalInfoCustomQueries.DELETE_BY_EMPLOYEE_ID)
	int deleteByEmployeeId(@Param("employeeId") Integer employeeId);

}
