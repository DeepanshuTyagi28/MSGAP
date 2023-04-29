package com.ttn.commonutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHandler {
	public static Connection con = null;
	public static ResultSet rs = null;
	private static String url;
	private static String user;
	private static String pass;

	public static ResultSet executeDBSelectQuery(String query) throws SQLException {

		try {
			url = PropertyReader.getProperty("DB_URL");
			user = PropertyReader.getProperty("DB_USER");
			pass = PropertyReader.getProperty("DB_PASSWORD");
			// Load mysql jdbc driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Create Connection to DB
			String connUrl = "jdbc:sqlserver://"+url+";username="+user+";password="+pass;
			con = DriverManager.getConnection(connUrl);
			// Create Statement Object
			Statement stmt = con.createStatement();

			// Execute the SQL Query. Store results in ResultSet
			rs = stmt.executeQuery(query);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return rs;
	}

	public static void closeConnection() {
		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
