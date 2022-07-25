package com.capg.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.security.LoginRequest;
import com.capg.security.LoginResponce;
import com.capg.security.MyAppuserDetailsService;
import com.capg.security.jwt.JwtUtils;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
		 
		@Autowired
		AuthenticationManager authenticationManager;
	
		@Autowired
		MyAppuserDetailsService userDetailsService;
		
		@Autowired
		JwtUtils jwtUtils;
		@PostMapping("/")
		public LoginResponce login(@RequestBody LoginRequest loginrequest) throws Exception {
			try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginrequest.getUsername(), loginrequest.getPassword()));
		}catch(BadCredentialsException e) {
			throw new Exception("Bad Credential");
		}
		 
	UserDetails userDetails=userDetailsService.loadUserByUsername(loginrequest.getUsername());
	 
	jwtUtils.generateToken(userDetails);
	
	String jwt = jwtUtils.generateToken(userDetails);
	 
	return  new LoginResponce(jwt); 
 }	
}
