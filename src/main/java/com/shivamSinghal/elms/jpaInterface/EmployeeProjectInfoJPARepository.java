package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.EmployeeProjectInfo;

@Repository
public interface EmployeeProjectInfoJPARepository extends JpaRepository<EmployeeProjectInfo, Integer>{

}
