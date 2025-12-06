package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivamSinghal.elms.model.EmployeeLoginInfo;

public interface EmployeeLoginInfoJPARepository extends JpaRepository<EmployeeLoginInfo, Integer>{

}
