package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivamSinghal.elms.model.Employee;

public interface EmployeeJPARepository extends JpaRepository<Employee, Integer>{

}
