package provider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	public static Connection getConnection() throws SQLException
	{
		Connection con=null;
		try {
			Class.forName(JdbcPassword.DRIVER);
			System.out.println("****** Driver Loaded*****");
			con=DriverManager.getConnection(JdbcPassword.URL, JdbcPassword.USER, JdbcPassword.PASSWORD);
			System.out.println("******Connection called*******");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
