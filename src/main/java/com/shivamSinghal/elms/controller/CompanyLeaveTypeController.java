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

import com.shivamSinghal.elms.model.CompanyLeaveType;
import com.shivamSinghal.elms.service.CompanyLeaveTypeService;

@RestController
@RequestMapping("/companyLeaveType")
public class CompanyLeaveTypeController {
	
	@Autowired
	CompanyLeaveTypeService companyLeaveTypeService;
	
	@GetMapping("/getLeaveTypeById/{leaveId}")
	public ResponseEntity<CompanyLeaveType> getLeaveTypeController(@PathVariable Integer leaveId){
		CompanyLeaveType res=companyLeaveTypeService.getLeaveTypeService(leaveId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@PostMapping("/addLeaveType")
	public ResponseEntity<CompanyLeaveType> addLeaveTypeController(@RequestBody CompanyLeaveType companyLeaveType){
		CompanyLeaveType res=companyLeaveTypeService.addLeaveTypeService(companyLeaveType);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@PutMapping("/updateLeaveTypeById/{leaveId}")
	public ResponseEntity<Integer> updateLeaveTypeController(@PathVariable Integer leaveId,@RequestBody CompanyLeaveType companyLeaveType){
		int res=companyLeaveTypeService.updateLeaveTypeService(leaveId,companyLeaveType);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
	
	@DeleteMapping("/deleteLeaveTypeById/{leaveId}")
	public ResponseEntity<Integer> deleteLeaveTypeController(@PathVariable Integer leaveId){
		int res=companyLeaveTypeService.deleteLeaveTypeService(leaveId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
	}
}
