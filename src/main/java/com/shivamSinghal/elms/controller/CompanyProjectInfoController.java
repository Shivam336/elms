package com.shivamSinghal.elms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.model.CompanyProjectInfo;
import com.shivamSinghal.elms.service.CompanyProjectInfoService;

@RestController
@RequestMapping("/companyProjectInfo")
public class CompanyProjectInfoController {
	
	@Autowired
	CompanyProjectInfoService companyProjectInfoServce;
	
	@GetMapping("/getProjectInfoById/{projectId}")
	public ResponseEntity<CompanyProjectInfo> getProjectInfo(@PathVariable Integer projectId){
		CompanyProjectInfo res=companyProjectInfoServce.getProjectInfoService(projectId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@PostMapping("/addNewProject")
	public ResponseEntity<CompanyProjectInfo> addNewProjectInfo(@RequestBody CompanyProjectInfo companyProjectInfo){
		CompanyProjectInfo res=companyProjectInfoServce.addProjectInfoService(companyProjectInfo);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@PutMapping("/updateProjectById/{projectId}")
	public int updateProjectInfo(@PathVariable Integer projectId, @RequestBody CompanyProjectInfo companyProjectInfo) {
		int res=companyProjectInfoServce.updateProjectInfoService(projectId,companyProjectInfo);
		return res;
	}
	
	@DeleteMapping("/deleteProjectById/{projectId}")
	public int deleteProjectInfo(@PathVariable Integer projectId) {
		int res=companyProjectInfoServce.deleteProjectInfoService(projectId);
		return res;
	}
	
}
