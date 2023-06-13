package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbReg {
	public static Connection getConnection() throws ClassNotFoundException {
		Connection con=null;
		String dbURL="jdbc:derby:C:/Users/Basima Banu/MyDB;create=true";
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");			
			System.out.println("--------Driver Loaded---------");
			
					con=DriverManager.getConnection(dbURL, "root", "root");
					System.out.println("------------Connection Called-------");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
			}
			
}
