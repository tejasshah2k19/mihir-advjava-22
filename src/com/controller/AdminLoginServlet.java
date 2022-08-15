package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();

		String adminEmail = config.getInitParameter("email");
		String adminPassword = config.getInitParameter("password");

		String gEmail = context.getInitParameter("gemail");
		String gPassword = context.getInitParameter("gpassword");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		RequestDispatcher rd = null;
		if ((email.equals(adminEmail) && password.equals(adminPassword))
				|| (email.equals(gEmail) && password.equals(gPassword))) {
			rd = request.getRequestDispatcher("AdminHome.jsp");
		} else {
			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("AdminLogin.jsp");
		}
		rd.forward(request, response);

	}
}
