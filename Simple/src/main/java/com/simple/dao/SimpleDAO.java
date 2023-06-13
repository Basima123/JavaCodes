package com.simple.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.dto.SimpleDTO;

import utility.Dsim;

public class SimpleDAO {
	static Connection con = null;
	public static boolean checkLogin(SimpleDTO s)
	{

		boolean result=false;
		try {
		con=Dsim.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from ssss where name=? and password=?");
		ps.setString(1,s.getName());
		ps.setString(2,s.getPassword());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			result=true;
		}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}finally {
			
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return result;
	}
		public static boolean insert(SimpleDTO s) throws SQLException 
	{
		int result = 0;
		boolean status=false;
		try {
			con = Dsim.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into ssss values(?,?)");
			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			result = ps.executeUpdate();
			if(result>0)
			{
				status=true;
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			con.close();

		}
		return status;
	}
	public static int update(SimpleDTO s) throws SQLException {
		int result = 0;
		try {
			con = Dsim.getConnection();
			PreparedStatement ps = con.prepareStatement("update  ssss set name=?,password=? where name=?");
			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getName());
			result = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
			con.close();
		}

		return result;
	}

	
	
	public static int delete(String name) throws SQLException
	{
	int result=0;
	try {
		con=Dsim.getConnection();
		PreparedStatement ps= con.prepareStatement("delete from ssss where name=?");
		ps.setString(1,name);
		result=ps.executeUpdate();
		ps.close();
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		con.close();
	}
	 return result;
	}
	
	public static SimpleDTO view(String name) throws SQLException
	{
		System.out.println("view start");
		SimpleDTO s=new SimpleDTO();
		
		try {
		con=Dsim.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from ssss where name=?");
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		if(rs!=null)
		{
			while(rs.next())
			{
				s.setName(rs.getString(1));
				s.setPassword(rs.getString(2));
			}
			
		}
		
		}catch (SQLException e)
		{
			e.printStackTrace();
		}finally {
			
		con.close();
		}
		return s;
	}
	
public static ArrayList<SimpleDTO> viewall() throws SQLException
{
	System.out.println("view ALL");
	ArrayList<SimpleDTO> result= new ArrayList<SimpleDTO>();
	//List<Emp> list=new ArrayList<Emp>();
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	try
	{
	con=Dsim.getConnection();
	 ps=con.prepareStatement("select * from ssss");
	 rs=ps.executeQuery();
	 if(rs!=null)
	 {
		 System.out.println("rs :"+rs);
	 while(rs.next())
	 {
		SimpleDTO s =new SimpleDTO();
		s.setName(rs.getString(1));
		s.setPassword(rs.getString(2));
		result.add(s);
	 }
	 }
	}catch (SQLException e)
	{
		e.printStackTrace();
	}finally {
		ps.close();	
		rs.close();
	    con.close();
	}
	
			return result;
}
}
	

