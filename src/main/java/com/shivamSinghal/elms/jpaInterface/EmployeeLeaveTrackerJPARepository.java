package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivamSinghal.elms.model.EmployeeLeaveTracker;

public interface EmployeeLeaveTrackerJPARepository extends JpaRepository<EmployeeLeaveTracker, Integer>{

}
