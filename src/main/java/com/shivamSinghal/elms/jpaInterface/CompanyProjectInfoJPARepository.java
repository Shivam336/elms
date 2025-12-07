package com.shivamSinghal.elms.jpaInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivamSinghal.elms.model.CompanyProjectInfo;

@Repository
public interface CompanyProjectInfoJPARepository extends JpaRepository<CompanyProjectInfo, Integer> {

}
