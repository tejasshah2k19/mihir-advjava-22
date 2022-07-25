package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.util.DbConnection;
import com.util.Validators;

//1 extends HttpServlet 
//2 override - service 
public class SignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("SignupServlet()");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);

		if (Validators.isRequired(firstName) == false) {
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else if (Validators.isAlpha(firstName) == false) {
			request.setAttribute("firstNameError", "Please Enter Valid FirstName");
		}

		// db insert
		UserDao userDao = new UserDao();
		
		//data
		UserBean userBean = new UserBean();
		userBean.setFirstName(firstName);
		userBean.setEmail(email);
		userBean.setPassword(password);
		
		
		userDao.insertUser(userBean);
		
		// redirect login page
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
//		response.setContentType("text/html");// MIME -> audio/mp3 video/mp4
//
//		PrintWriter out = response.getWriter();
//
//		out.print("<html><body>");
//		out.print("<b>FirstName : </b>" + firstName + "<br><br>");
//		out.print("<b>Email</b> : " + email);
//		out.print("</body></html>");

	}
}
