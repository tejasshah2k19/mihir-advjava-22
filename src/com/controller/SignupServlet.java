package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1 extends HttpServlet 
//2 override - service 
public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SignupServlet()");
	}
}
