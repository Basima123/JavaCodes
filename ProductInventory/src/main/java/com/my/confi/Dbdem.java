
package com.my.confi;

import java.sql.Connection;
import java.sql.DriverManager;


public class Dbdem {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(ProductConfi.DRIVER_CLASS);
			System.out.println("driver class loaded");
		 con = DriverManager.getConnection(ProductConfi.URL, ProductConfi.USER, ProductConfi.PASS);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}

