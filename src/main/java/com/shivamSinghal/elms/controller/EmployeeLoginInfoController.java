package com.shivamSinghal.elms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.dto.EmployeeLoginInfoDto;
import com.shivamSinghal.elms.service.EmployeeLoginInfoService;

@RestController
@RequestMapping("/employeeLoginInfo")
public class EmployeeLoginInfoController {

	@Autowired
	EmployeeLoginInfoService employeeLoginInfoService;
	
	
	@GetMapping("/verifyCredential")
	public ResponseEntity<EmployeeLoginInfoDto> getEmployeeLoginInfoController(@RequestParam String employeeId, @RequestParam String password){
		EmployeeLoginInfoDto res=employeeLoginInfoService.getEmployeeLoginInfoService(employeeId,password);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@PostMapping("/addLoginInfo")
	public ResponseEntity<EmployeeLoginInfoDto> addEmployeeLoginInfoController(@RequestBody EmployeeLoginInfoDto employeeLoginInfoDto){
		EmployeeLoginInfoDto res=employeeLoginInfoService.addEmployeeLoginInfoService(employeeLoginInfoDto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@PutMapping("/upateLoginInfo")
	public ResponseEntity<Integer> updateEmployeeLoginInfoController(@RequestBody EmployeeLoginInfoDto employeeLoginInfoDto){
		int res=employeeLoginInfoService.updateEmployeeLoginInfoService(employeeLoginInfoDto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@DeleteMapping("/deleteLoginInfo")
	public ResponseEntity<Integer> deleteEmployeeLoginInfoController(@RequestBody EmployeeLoginInfoDto employeeLoginInfoDto){
		int res=employeeLoginInfoService.deleteEmployeeLoginInfoService(employeeLoginInfoDto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
}
