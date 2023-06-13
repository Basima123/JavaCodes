package com.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.customer.dto.customerDTO;

import utility.JdbcConnection;

public class CustomerDAO {
	public static boolean insert (customerDTO cust)
	{
		Connection con = null;
		PreparedStatement pst = null;
		boolean status = false;
		int result = 0;
		con=JdbcConnection.getConnection();
		try {
			pst = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, cust.getName());
			pst.setString(2, cust.getAddress());
			pst.setLong(3, cust.getContact());
			pst.setString(4, cust.getEmail());
			result=pst.executeUpdate();
			if(result>1)
			{
				status=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JdbcConnection.closePreparedStatement(pst);
			JdbcConnection.closeConnection(con);
		}
		return status;
		
		
		
	}
	
	public static boolean update(customerDTO cust)
	{
		Connection con = null;
		PreparedStatement pst = null;
		boolean status = false;
		int result = 0;
		con=JdbcConnection.getConnection();
		try {
			pst = con.prepareStatement("update customer set name=?,address=?,contact=?,email=? where name=?");
			pst.setString(1, cust.getName());
			pst.setString(2, cust.getAddress());
			pst.setLong(3, cust.getContact());
			pst.setString(4, cust.getEmail());
			result=pst.executeUpdate();
			if(result>1)
			{
				status=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JdbcConnection.closePreparedStatement(pst);
			JdbcConnection.closeConnection(con);
		}
		return status;
		
		
		
	}

}


