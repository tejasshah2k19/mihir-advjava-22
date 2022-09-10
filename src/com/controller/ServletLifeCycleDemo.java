package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycleDemo")
public class ServletLifeCycleDemo extends HttpServlet {
	public void init() throws ServletException {
		// one
		System.out.println("init()"); // allocation
	}

	// n time -- request
	// logic
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service()");
	}

	// one
	public void destroy() {
		System.out.println("destroy()");// free
	}

}


//load class 
//instance 
//init 
//service 