package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.CompanyRole;

@Repository
public interface CompanyRoleJPARepository extends JpaRepository<CompanyRole, Integer>{

}
