package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();

		String adminEmail = config.getInitParameter("email");
		String adminPassword = config.getInitParameter("password");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		RequestDispatcher rd = null;
		if (email.equals(adminEmail) && password.equals(adminPassword)) {
			rd = request.getRequestDispatcher("AdminHome.jsp");
		} else {
			rd = request.getRequestDispatcher("AdminLogin.jsp");
		}
		rd.forward(request, response);

	}
}
