package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.EmployeeLeaveTracker;

@Repository
public interface EmployeeLeaveTrackerJPARepository extends JpaRepository<EmployeeLeaveTracker, Integer>{

}
