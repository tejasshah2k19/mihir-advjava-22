package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDao;
@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int bookId = Integer.parseInt(request.getParameter("bookId"));
		
		BookDao bookDao = new BookDao();
		bookDao.deleteBook(bookId);
		
		response.sendRedirect("BookListServlet");//goto list book servlet
	}
}
