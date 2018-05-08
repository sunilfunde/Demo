package com.cpc.formulation.security;

import java.io.IOException;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

   
	@Override
	public void onAuthenticationFailure(HttpServletRequest arg0, HttpServletResponse arg1,
			org.springframework.security.core.AuthenticationException arg2) throws IOException, ServletException {
		System.out.println("Fail" + arg2);
        arg1.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);		
	}
}
