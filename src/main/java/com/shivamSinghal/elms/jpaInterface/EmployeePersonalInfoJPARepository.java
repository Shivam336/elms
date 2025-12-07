package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.EmployeePersonalInfo;
import com.shivamSinghal.elms.service.EmployeePersonalInfoService;

@Repository
public interface EmployeePersonalInfoJPARepository extends JpaRepository<EmployeePersonalInfo, Integer>{

	EmployeePersonalInfo getByEmployeeId(Integer employeeId);

}
