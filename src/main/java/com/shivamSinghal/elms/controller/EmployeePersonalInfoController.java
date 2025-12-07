package com.shivamSinghal.elms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.model.EmployeePersonalInfo;
import com.shivamSinghal.elms.service.EmployeePersonalInfoService;

@RestController
@RequestMapping("/employeePersonalInfo")
public class EmployeePersonalInfoController {
	
	@Autowired
	EmployeePersonalInfoService employeePersonalInfoService;
	
	@GetMapping("/getEmployeeById/{employeeId}")
	public ResponseEntity<EmployeePersonalInfo> getEmployeeById(@PathVariable Integer employeeId) {
		EmployeePersonalInfo response= employeePersonalInfoService.getEmployeeById(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@PostMapping("/addNewEmployee")
	public ResponseEntity<EmployeePersonalInfo> addNewEmployee(@RequestBody EmployeePersonalInfo employeePersonalInfo) {
		EmployeePersonalInfo res=employeePersonalInfoService.createNewEmployee(employeePersonalInfo);
		return ResponseEntity.status(HttpStatus.CREATED).body(res);
	}
	
	@PutMapping("/updateEmployeeById/{employeeId}")
	public ResponseEntity<Integer> updateEmployee(@PathVariable Integer employeeId,@RequestBody EmployeePersonalInfo employeePersonalInfo){
		int res=employeePersonalInfoService.updateEmployee(employeeId,employeePersonalInfo);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
		
	}
	
	@DeleteMapping("/deleteEmployeeById/{employeeId}")
	public ResponseEntity<Integer> deleteEmployee(@PathVariable Integer employeeId){
		int res=employeePersonalInfoService.deleteEmployee(employeeId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
}
