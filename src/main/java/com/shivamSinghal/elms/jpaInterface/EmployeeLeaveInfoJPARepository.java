package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivamSinghal.elms.model.EmployeeLeaveInfo;

public interface EmployeeLeaveInfoJPARepository extends JpaRepository<EmployeeLeaveInfo, Integer>{

}
