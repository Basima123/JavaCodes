package com.my.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.my.confi.Dbdem;

public class DelPro {
	static Connection con=null;
	public static int delete(String id) throws SQLException {
		int result=0;
		try {
			con=Dbdem.getConnection();
			PreparedStatement pst = con.prepareStatement("delete from forms where id=?;");
			pst.setString(1,id);
			result=pst.executeUpdate();
			pst.close();
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			con.close();}
	
return result;
		
}

}
