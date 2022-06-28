package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";// how ?
		String url = "jdbc:mysql://localhost:3306/mihir22";
		String userName = "root";
		String password = "root";

		// type1 type2 type3 type4

		try {
			Class.forName(driver);// load driver
			Connection con = DriverManager.getConnection(url, userName, password);
			if (con != null) {
				System.out.println("dbConnected");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
