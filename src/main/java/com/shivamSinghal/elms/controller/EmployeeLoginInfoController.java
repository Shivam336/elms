package com.shivamSinghal.elms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivamSinghal.elms.dto.EmployeeLoginInfoDto;
import com.shivamSinghal.elms.security.AuthResponseDto;
import com.shivamSinghal.elms.security.CustomEmployeeDetailService;
import com.shivamSinghal.elms.security.JwtUtil;
import com.shivamSinghal.elms.service.EmployeeLoginInfoService;


@RestController
@RequestMapping("/employeeLoginInfo")
public class EmployeeLoginInfoController {

	@Autowired
	EmployeeLoginInfoService employeeLoginInfoService;
	
	 @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private CustomEmployeeDetailService employeeDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
	
	
	@GetMapping("/verifyCredential")
	public ResponseEntity<AuthResponseDto> getEmployeeLoginInfoController(@RequestParam String employeeId, @RequestParam String password){
//		EmployeeLoginInfoDto res=employeeLoginInfoService.getEmployeeLoginInfoService(employeeId,password);
//		return ResponseEntity.status(HttpStatus.OK).body(res);
//		
//		

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(employeeId, password)
        );

        final UserDetails userDetails = employeeDetailsService.loadUserByUsername(employeeId);
        final String jwt = jwtUtil.generateToken(userDetails);
        System.out.println("JWT: "+jwt);
        return ResponseEntity.ok(new AuthResponseDto(jwt, 900));
    
	}
	
	@PostMapping("/addLoginInfo")
	public ResponseEntity<String> addEmployeeLoginInfoController(@RequestBody EmployeeLoginInfoDto employeeLoginInfoDto){
			
		employeeLoginInfoDto.setPassword(passwordEncoder.encode(employeeLoginInfoDto.getPassword()));
		
		EmployeeLoginInfoDto res=employeeLoginInfoService.addEmployeeLoginInfoService(employeeLoginInfoDto);
		
        return ResponseEntity.ok("Employee Login added successfully");
	
	
	
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
