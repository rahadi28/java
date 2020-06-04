package com.enigmacamp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/experiment?serverTimezone=UTC";
	static final String USER = "root";
	static final String PASS = "P@ssw0rd";

	private static Connection conn;

	private DatabaseConnection() {
		super();
	}

	private static void openConnection() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (conn == null) {
			openConnection();
		}
		return conn;
	}
}