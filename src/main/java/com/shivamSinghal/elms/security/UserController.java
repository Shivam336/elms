package com.shivamSinghal.elms.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@PreAuthorize("hasRole('USER')")
    @GetMapping("/profile")
    public String userProfile() {
        return "This is USER profile data";
    }
}