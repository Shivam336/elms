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

import com.shivamSinghal.elms.model.CompanyRole;
import com.shivamSinghal.elms.service.CompanyRoleService;

@RestController
@RequestMapping("companyRole")
public class CompanyRoleController {
	
	@Autowired
	CompanyRoleService companyRoleService;
	
	@GetMapping("/getCompanyRoleById/{roleId}")
	public ResponseEntity<CompanyRole> getCompanyRoleController(@PathVariable Integer roleId){
		CompanyRole res=companyRoleService.getCompanyRoleService(roleId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@PostMapping("/addCompanyRole")
	public ResponseEntity<CompanyRole> addCompanyRoleController(@RequestBody CompanyRole companyRole){
		CompanyRole res=companyRoleService.addCompanyRoleService(companyRole);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@PutMapping("/updateCompanyRoleById/{roleId}")
	public ResponseEntity<Integer> updateCompanyRoleByIdController(@PathVariable Integer roleId, @RequestBody CompanyRole companyRole){
		int res=companyRoleService.updateCompanyRoleByIdService(roleId,companyRole);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@DeleteMapping("/deleteCompanyRoleById/{roleId}")
	public ResponseEntity<Integer> deleteCompanyRoleController(@PathVariable Integer roleId){
		int res=companyRoleService.deleteCompanyRoleService(roleId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
}
