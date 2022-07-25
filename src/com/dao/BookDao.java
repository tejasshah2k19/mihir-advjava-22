package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.BookBean;
import com.util.DbConnection;

public class BookDao {

	public void addBook(BookBean book) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into books (bookName,price) values (?,?)");
			pstmt.setString(1, book.getBookName());
			pstmt.setInt(2, book.getPrice());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BookBean> getAllBooks() {

		ArrayList<BookBean> books = new ArrayList<BookBean>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from books");
			// id name price
			// 1 x 12
			// 2 y 22
			// 3 z 33
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
//				;//first row 

				BookBean b = new BookBean();
				b.setBookName(rs.getString("bookName"));
				b.setBookId(rs.getInt("bookId"));
				b.setPrice(rs.getInt("price"));
				books.add(b);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}
	
	public void deleteBook(int bookId) {
	
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from books where bookId = ?");
			pstmt.setInt(1, bookId);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
