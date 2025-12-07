package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.EmployeeLeaveInfo;

@Repository
public interface EmployeeLeaveInfoJPARepository extends JpaRepository<EmployeeLeaveInfo, Integer>{

}
