package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.EmployeePersonalInfo;

@Repository
public interface EmployeePersonalInfoJPARepository extends JpaRepository<EmployeePersonalInfo, Integer>{

}
