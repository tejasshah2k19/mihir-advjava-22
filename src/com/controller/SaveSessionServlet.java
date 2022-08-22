package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SaveSessionServlet")
public class SaveSessionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String dataName = request.getParameter("dataName");
		String dataValue = request.getParameter("dataValue");

		HttpSession session = request.getSession();// first time -> new
		// already visited -> old : existing

		session.setMaxInactiveInterval(60);// 60seconds

		session.setAttribute(dataName, dataValue);
		response.sendRedirect("InputSession.jsp");
	}
}
