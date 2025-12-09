package com.shivamSinghal.elms.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.dto.EmployeeProjectInfoDto;
import com.shivamSinghal.elms.service.EmployeeProjectInfoService;

@RestController
@RequestMapping("employeeProjectInfo")
public class EmployeeProjectInfoController {
	
	@Autowired
	EmployeeProjectInfoService employeeProjectInfoService;
	
	@GetMapping("/getEmployeeProjectInfoByEmployeeId/{employeeId}")
	public ResponseEntity<List<EmployeeProjectInfoDto>> getEmployeeProjectInfoController(@PathVariable Integer employeeId){
		List<EmployeeProjectInfoDto> res= employeeProjectInfoService.getEmployeeProjectInfoService(employeeId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	
	@PostMapping("/addEmployeeProjectInfo")
	public ResponseEntity<EmployeeProjectInfoDto> addEmployeeProjectInfoController(@RequestBody EmployeeProjectInfoDto employeeProjectInfo){
		EmployeeProjectInfoDto res=employeeProjectInfoService.addEmployeeProjectInfoService(employeeProjectInfo);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	
	@PutMapping("/updateEmployeeProjectInfo")	
	public ResponseEntity<Integer> updateEmployeeProjectInfoController(@RequestBody EmployeeProjectInfoDto employeeProjectInfo){
		int res=employeeProjectInfoService.updateEmployeeProjectInfoService(employeeProjectInfo);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	
	@DeleteMapping("/deleteEmployeeProjectInfo")
	public ResponseEntity<Integer> deleteEmployeeProjectInfoController(@RequestParam Integer employeeId, @RequestParam Integer projectId){
		int res=employeeProjectInfoService.deleteEmployeeProjectInfoService(employeeId,projectId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
}
