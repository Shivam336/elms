package com.shivamSinghal.elms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.model.Employee;

@RestController
@RequestMapping("/employeeCrud")
public class ElmsController {
	
	@GetMapping(value={"","/","readAll"})
	public String readAllEmployee() {
		return "hello";
	}
	
//	@PostMapping(value= {"add"})
//	public String addEmployee(@RequestParam(required = false) String employeeEmail,@RequestParam(required = false) String employeeFirstName, @RequestParam(required = false)String employeeLastName,@RequestParam(required = false) String employeePassword) {
//		return employeeEmail+" - "+employeeFirstName+" - "+employeePassword;
//	}
	
	@PostMapping(value= {"add"})
	public String addEmployee(@RequestBody Employee employee) {
		return employee.toString();
	}
	
}
