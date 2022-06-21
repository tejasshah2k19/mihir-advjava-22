package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VotingServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String age = request.getParameter("age");
		int ageInt = Integer.parseInt(age);

		if (ageInt >= 18) {
			request.setAttribute("msg", "Eligible");
		} else {
			request.setAttribute("msg", "Not Eligibe");
		}

		RequestDispatcher rd = request.getRequestDispatcher("OutputAge.jsp");
		rd.forward(request, response);
	}
}
