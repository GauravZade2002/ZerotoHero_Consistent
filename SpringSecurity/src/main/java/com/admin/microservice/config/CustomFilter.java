package com.admin.microservice.config;

import java.io.IOException;

import org.springframework.stereotype.Component;
import com.admin.microservice.SpringSecurityApplication;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class CustomFilter implements Filter {

    private final SpringSecurityApplication springSecurityApplication;

    CustomFilter(SpringSecurityApplication springSecurityApplication) {
        this.springSecurityApplication = springSecurityApplication;
    }

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		/*
		 * Every request is going through this filter and it is also known and customer filter
		 * servlet based filter after implementing Filter(I)
		 */
		HttpServletRequest  http = (HttpServletRequest) request;
		System.out.print(http.getRequestURL());
		chain.doFilter(request, response);
		
	}

}
