package com.capg.security;

import org.springframework.stereotype.Component;

@Component
public class LoginResponce {
	private String jwt;

	
	public LoginResponce() {
		super();
	}


	public LoginResponce(String jwt) {
		super();
		this.jwt = jwt;
	}


	public String getJwt() {
		return jwt;
	}


	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
}
