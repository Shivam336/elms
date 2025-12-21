package com.shivamSinghal.elms.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shivamSinghal.elms.dto.EmployeeLoginInfoDto;
import com.shivamSinghal.elms.jpaInterface.EmployeeLoginInfoJPARepository;

@Service
public class CustomEmployeeDetailService implements UserDetailsService {

    @Autowired
    private EmployeeLoginInfoJPARepository employeeLoginRepository;

    @Override
    public UserDetails loadUserByUsername(String employeeId) throws UsernameNotFoundException {
    	EmployeeLoginInfoDto employeeInfo = employeeLoginRepository.findByEmployeeId(employeeId);
              //  .orElseThrow(() -> new UsernameNotFoundException("Employee not found: " + employeeId));
        
    	if(employeeInfo==null) throw new UsernameNotFoundException("Employee not found: " + employeeId);
    	
        
        //List<GrantedAuthority> authorities = Arrays.stream(user.getRole().split(",")) .map(SimpleGrantedAuthority::new) .collect(Collectors.toList());

        //System.out.println(authorities.toString());
        return new org.springframework.security.core.userdetails.User(
        		String.valueOf(employeeInfo.getEmployeeId()),
                employeeInfo.getPassword(),
                Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
