package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.CompanyLeaveType;

@Repository
public interface CompanyLeaveTypeJPARepository extends JpaRepository<CompanyLeaveType, Integer>{

}
