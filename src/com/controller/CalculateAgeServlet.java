package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateAgeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean isError = false;
		String bYear = request.getParameter("birthYear");
		// validate
		if (bYear == null || bYear.trim().length() == 0) {
			isError = true;
			request.setAttribute("birthYearError", "Please Enter Birth Year ");
		}

		if (isError == true) {
			// go back
			RequestDispatcher rd = request.getRequestDispatcher("BirthYear.jsp");
			rd.forward(request, response);
		} else {

			// process
			int year = Integer.parseInt(bYear);

			Calendar c = Calendar.getInstance();

			int y = c.get(Calendar.YEAR);
			int age = y - year;

			// data set
			request.setAttribute("age", age + "");// key->dataname ,value

			// jsp
			RequestDispatcher rd = request.getRequestDispatcher("Age.jsp");
			rd.forward(request, response);
		}
	}
}
