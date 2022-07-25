package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;
import com.dao.BookDao;

@WebServlet("/BookListServlet")
public class BookListServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BookDao bookDao = new BookDao();

		ArrayList<BookBean> books = bookDao.getAllBooks();
		request.setAttribute("books", books);

		RequestDispatcher rd = request.getRequestDispatcher("ListBooks.jsp");
		rd.forward(request, response);
	}
}
