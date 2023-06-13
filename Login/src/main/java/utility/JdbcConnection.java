package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnection {

	 public static Connection getConnection() {
		 Connection con=null;
		 try {
				Class.forName(JdbcPswd.JDBC_DRIVER);
				System.out.println("Connection established");
				con=DriverManager.getConnection(JdbcPswd.JDBC_DATABASE,JdbcPswd.JDBC_USERNAME,JdbcPswd.JDBC_PASSWORD);
	         
			} catch (ClassNotFoundException e) {
				System.out.println("connection not established");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("sql error");
				e.printStackTrace();
			}
		 return con;
		 
	 }
	 public static void closeStatement(PreparedStatement pst) {
			if(pst!=null) {
				try {
					pst.close();
				} catch (SQLException e) {
					System.out.println("statement not closed ");
					e.printStackTrace();
				}

			}}
		public static void closeConnection(Connection con) {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("connection not closed ");
					e.printStackTrace();
				}
	}
		}

}
