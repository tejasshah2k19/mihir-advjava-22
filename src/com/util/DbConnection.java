package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	// static method can call without object , using class name you can call
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";// how ?
		String url = "jdbc:mysql://localhost:3306/mihir22";// path of database
		String userName = "root";
		String password = "root";
		Connection con = null;
		// type1 type2 type3 type4

		try {
			Class.forName(driver);// load driverd
			con = DriverManager.getConnection(url, userName, password);
			if (con != null) {
				System.out.println("dbConnected");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
