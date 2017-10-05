package com.tekcel.assignment;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection dbConnection;

	private DBConnection() {

	}

	public static Connection getInstance() {
		if (dbConnection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekcel", "root", "");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dbConnection;
	}
}
