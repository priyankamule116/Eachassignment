package com.capg.security;

import java.io.IOException;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.capg.security.jwt.JwtUtils;

@Component
public class AuthorizationFilter extends OncePerRequestFilter{
	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	MyAppuserDetailsService userDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authorizationHeaderValue = request.getHeader("Authorization");
		String jwt= null;
		String userName=null;
		
		if (authorizationHeaderValue != null && authorizationHeaderValue.startsWith("Bearer ")) {
		jwt=authorizationHeaderValue.substring(7);
		
		userName=jwtUtils.extractUsername(jwt);
		}
		if(userName != null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userDetails = this.userDetailsService.loadUserByUsername(userName);
			
			if(jwtUtils.validateToken(jwt, userDetails)) {
			UsernamePasswordAuthenticationToken authentication=	new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities()) ;
			authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}
		filterChain.doFilter(request, response);
	}

}
