package com.IPProject.data;

import java.sql.DriverManager;

import java.sql.Connection;

public class ConnectionFactory {
	
	public static Connection getCon() throws Exception{
		
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_resv","root","root");
		
		return con;
	}

}
