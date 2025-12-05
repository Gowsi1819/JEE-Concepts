package com.jee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static final String URL="jdbc:postgresql://localhost:5432/Login";
	private static final String Username="postgres";
	private static final String password="root";
	
	public static Connection loadDriver() {
			try {
				
				Class.forName("org.postgresql.Driver");
			    return DriverManager.getConnection(URL,Username,password);
			    
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		 return null;
	}
	

}
