
package utility;

import java.sql.Connection;
import java.sql.*;
public class Dsim {
	
	public static Connection getConnection(){
Connection con =null;
try {
	Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	String dbURL = "jdbc:derby:C:/Users/Basima Banu/MyDB;create=true";
System.out.println("Driver Loaded");
		con=DriverManager.getConnection(dbURL,"root","root");
		System.out.println("con Loaded"+con);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return con;
}
	}
