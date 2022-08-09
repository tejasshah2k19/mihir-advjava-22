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

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int bookId = Integer.parseInt(request.getParameter("bookId"));
		String bookName = request.getParameter("bookName");
		int price = Integer.parseInt(request.getParameter("price"));
	
		BookBean book = new BookBean();
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setPrice(price);
		
		BookDao bookDao = new BookDao();
		bookDao.updateBook(book);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("BookListServlet");
		rd.forward(request, response);
		
		
		
		
	}
}
