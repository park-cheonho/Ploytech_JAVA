package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	/*
	public Connection getConnection(String url, String user, String password) {
		Connection conn = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public Connection getConnection() {
		
		String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
		String user 	= "hr";
		String password = "hr";
	
		return getConnection(url, user, password);
	}
	*/
	
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url 		= "jdbc:oracle:thin:@localhost:1521:xe";
			String user 	= "hr";
			String password = "hr";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
