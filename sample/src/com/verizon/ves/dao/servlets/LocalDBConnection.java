package com.verizon.ves.dao.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalDBConnection {
	
	private static Connection connection;	
	
	public static Connection getConnection()
 {
		if (connection == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl", "hr",
						"password");
				System.out.println("connection established!!");

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
	}
	
		
		return connection;
	}
	

}
