package com.occupier.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static Connection getConnection()
	{
		Connection con=null;
		
			try {
				Class.forName(JdbcPassword.DRIVER);
				System.out.println("--------DRIVER LOADED--------------");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	try {
		con=DriverManager.getConnection(JdbcPassword.URL,JdbcPassword.USER,JdbcPassword.PASSWORD);
		System.out.println("--------CONNECTION CALLED--------------");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return con;
		
	}

}
