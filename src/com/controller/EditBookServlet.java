package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;
import com.dao.BookDao;

@WebServlet("/EditBookServlet")
public class EditBookServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int bookId = Integer.parseInt(request.getParameter("bookId"));
		BookDao bookDao = new BookDao();
		BookBean  book = bookDao.getBookById(bookId);
		request.setAttribute("book", book);
		RequestDispatcher rd = request.getRequestDispatcher("UpdateBook.jsp");
		rd.forward(request,response);
				
	}
}
