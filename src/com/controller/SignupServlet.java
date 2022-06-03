package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1 extends HttpServlet 
//2 override - service 
public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("SignupServlet()");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);

		response.setContentType("text/html");// MIME -> audio/mp3 video/mp4

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<b>FirstName : </b>" + firstName + "<br><br>");
		out.print("<b>Email</b> : " + email);
		out.print("</body></html>");

	}
}
