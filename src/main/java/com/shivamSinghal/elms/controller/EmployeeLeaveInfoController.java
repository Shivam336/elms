package com.shivamSinghal.elms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.dto.EmployeeLeaveInfoDto;
import com.shivamSinghal.elms.service.EmployeeLeaveInfoService;

@RestController
@RequestMapping("employeeLeaveInfo")
public class EmployeeLeaveInfoController {
	
	@Autowired
	EmployeeLeaveInfoService employeeLeaveInfoService;
	
	@GetMapping("/getEmployeeLeaveInfo/{employee_id}")
	public ResponseEntity<List<EmployeeLeaveInfoDto>> getEmployeeLeaveInfoControllerByEmployeeId(@PathVariable Integer employee_id){
		
		List<EmployeeLeaveInfoDto> res=employeeLeaveInfoService.getEmployeeLeaveInfoServiceByEmployeeId(employee_id);
		
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@PostMapping("/addEmployeeLeaveInfo")
	public ResponseEntity<EmployeeLeaveInfoDto> addEmployeeLeaveInfoController(@RequestBody EmployeeLeaveInfoDto employeeLeaveInfoDto){
		
		EmployeeLeaveInfoDto res=employeeLeaveInfoService.addEmployeeLeaveInfoService(employeeLeaveInfoDto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@PutMapping("/updateEmployeeLeaveInfo")
	public ResponseEntity<Integer> updateEmployeeLeaveInfoController(@RequestBody EmployeeLeaveInfoDto employeeLeaveInfoDto){
		
		int res=employeeLeaveInfoService.updateEmployeeLeaveInfoService(employeeLeaveInfoDto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
}
