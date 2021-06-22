package com.example.demo.config;



import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionManager {
	
	 public static Connection getConnection() {
	        try {
	            String connStr = "jdbc:mysql://localhost:3306/productocafe";
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection connection = DriverManager
	                        .getConnection(connStr, "root", "root");
	            
	            return connection;
	        }
	        catch (Exception ex) {
	            throw new RuntimeException(ex.getMessage());
	        }
	    }

}
