
package com.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.customer.dto.AddressDTO;
import com.customer.dto.CustomerDTO;

import provider.JdbcConnection;

public class CustomerDAO {
	public static String getCustomerId() {
		String id = "00002";
		return id;
	}

	public static boolean insert(CustomerDTO cust) throws SQLException {
		boolean result = false;
		//boolean flag1=false, flag2=false;
		//int status;
		PreparedStatement ps,ps1 = null;
		Connection con = null;
		try {
			
			con = JdbcConnection.getConnection();
			con.setAutoCommit(false);
			String id=getCustomerId();
			ps = con.prepareStatement("insert into customer1(id,name,age,gender,homeNo,mobileNo) values(?,?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2, cust.getName());
			ps.setInt(3, cust.getAge());
			ps.setString(4, cust.getGender());
			ps.setLong(5, cust.getHomeNo());
			ps.setLong(6, cust.getMobileNo());
			int i = ps.executeUpdate();
			if (i > 0) {
				AddressDTO addr=cust.getAddr();
				if(addr!=null)
				{
				ps1 = con.prepareStatement("insert into address1(id,block,level,unit,street,postal) values(?,?,?,?,?,?)");
				ps1.setString(1, id);
				ps1.setInt(2, addr.getBlock());
				ps1.setInt(3, addr.getLevel());
				ps1.setInt(4, addr.getUnit());
				ps1.setString(5, addr.getStreet());
				ps1.setLong(6, addr.getPostal());
				int j = ps1.executeUpdate();
				if (j > 0) {
					System.out.println("Address status :" + j);
					result = true;
				}
				}
			}
			if(result)
			{
				con.commit();
			}
			else
			{
				con.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps1.close();
			con.close();
		}
		return result;
	}
	public static boolean update(CustomerDTO cust) throws SQLException {
		boolean result = false;
		int i, j;
		PreparedStatement ps,ps1 = null;
		Connection con = null;
		try {
			con = JdbcConnection.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(
					"update customer1 set id =?,name=?,age=?,gender=?,homeNo=?,mobileNo=? where id=?");
			ps.setString(1, getCustomerId());
			ps.setString(2, cust.getName());
			ps.setInt(3, cust.getAge());
			ps.setString(4, cust.getGender());
			ps.setLong(5, cust.getHomeNo());
			ps.setLong(6, cust.getMobileNo());
			ps.setString(1, cust.getCustomerId());
			i = ps.executeUpdate();
			if (i > 0) {
				System.out.println(" Customer status : " + i);
				AddressDTO addr = cust.getAddr();
				if (addr != null) {
					ps1 = con.prepareStatement("update address1 set id=?,block=?,level=?,unit=?,street=?,postal=? where name=?");
					ps1.setString(1, getCustomerId());
					ps1.setInt(1, addr.getBlock());
					ps1.setInt(2, addr.getLevel());
					ps1.setInt(3, addr.getUnit());
					ps1.setString(4, addr.getStreet());
					ps1.setLong(5, addr.getPostal());
					ps1.setString(6, getCustomerId());
					j = ps1.executeUpdate();
					if (j > 0) {
						System.out.println(" Address status :" + j);
						result = true;
					}
					if (result) {
						con.commit();
					} else
						con.rollback();
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps1.close();
			con.close();
		}
		return result;

	}
	
	public static List<CustomerDTO> viewAll() throws SQLException
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		con=JdbcConnection.getConnection();
		ps=con.prepareStatement("select * from customer1");
		List<CustomerDTO> list=new ArrayList<CustomerDTO>();
		return list;
		
	}
	
}
