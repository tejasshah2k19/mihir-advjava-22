package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VotingFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String age = request.getParameter("age");
		// validation
		boolean isError = false;
		if (age == null || age.trim().length() == 0) {
			request.setAttribute("ageError", "Please Enter Age");
			isError = true;
		} else {
			isError = false;
		}
		
		if(isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("InputAge.jsp");
			rd.forward(request, response);
		}else {
			chain.doFilter(request, response);//go ahead all are ok
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
