package com.reg.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reg.dto.RegDTO;

import utility.DbReg;

public class RegDAO {

	static Connection con = null;

	public static int insert(RegDTO s) throws SQLException {
		int result = 0;
		try {
			con = DbReg.getConnection();
		
		PreparedStatement ps = con.prepareStatement("insert into regist values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, s.getName());
		ps.setInt(2, s.getAge());
		ps.setDate(3, new Date(s.getDate().getTime()));
		// pst.setDate(5, new java.sql.Date(f1.getDob().getTime()));
		ps.setString(4, s.getLang());
		ps.setString(5, s.getGender());
		ps.setString(6, s.getUname());
		ps.setString(7, s.getPassword());
		ps.setString(8, s.getEmail());
		ps.setLong(9, s.getContact());
		ps.setString(10, s.getAddress());
		ps.setString(11, s.getType());
		result = ps.executeUpdate();
		ps.close();
		con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static int update(RegDTO s) throws SQLException, ClassNotFoundException {

		int result = 0;
		con = DbReg.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(
					"update regist set name=?,age=?,date=?,lang=?,gender=?,uname=?,password=?,email=?,contact=?,address=?,type=? where name=?");
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setDate(3, (Date) s.getDate());
			ps.setString(4, s.getLang());
			ps.setString(5, s.getGender());
			ps.setString(6, s.getUname());
			ps.setString(7, s.getPassword());
			ps.setString(8, s.getEmail());
			ps.setLong(9, s.getContact());
			ps.setString(10, s.getAddress());
			ps.setString(11, s.getType());
			ps.setString(12, s.getName());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
		return result;
	}

	public static boolean loginCheck(String name, String password) throws SQLException, ClassNotFoundException {
		boolean status = false;
		PreparedStatement pst = null;
		try {
			RegDTO dto = new RegDTO();
			con = DbReg.getConnection();
			pst = con.prepareStatement("select uname,password from regist");
			ResultSet rs = pst.executeQuery();
			while (rs.next())
				dto.setUname(rs.getString("uname"));
			dto.setPassword(rs.getString("password"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pst.close();
			con.close();
		}
		return status;

	}

	public static boolean usernameCheck(String s) throws SQLException, ClassNotFoundException {
		Boolean status = false;
		PreparedStatement pst=null;
		try {
			con = DbReg.getConnection();
			pst = con.prepareStatement("select * from regist where Uname=?");
			pst.setString(1, s);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				status = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pst.close();
		con.close();
		return status;

	}

	public static RegDTO regist(RegDTO r) throws SQLException {
		PreparedStatement ps =null;
		
		try {
			con = DbReg.getConnection();
			ps = con.prepareStatement("Select * from regist where uname=?,password=?");
			ps.setString(1, r.getUname());
			ps.setString(2, r.getPassword());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				r.setName(rs.getString("name"));
				r.setAge(rs.getInt("age"));
				r.setDate(rs.getDate("date"));
				r.setLang(rs.getString("lang"));
				r.setGender(rs.getString("gender"));
				r.setUname(rs.getString("uname"));
				r.setPassword(rs.getString("password"));
				r.setEmail(rs.getString("email"));
				r.setContact(rs.getLong("contact"));
				r.setAddress(rs.getString("address"));
				r.setType(rs.getString("type"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			ps.close();
			con.close();
		}

		return r;

	}

	public static List<RegDTO> viewAll(RegDTO r) throws SQLException {
		List<RegDTO> s = new ArrayList<RegDTO>();
		PreparedStatement ps=null;
		try {
			con = DbReg.getConnection();
		
		ps = con.prepareStatement("select * from regist");
		
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			r.setName(rs.getString(1));
			r.setAge(rs.getInt(2));
			r.setDate(rs.getDate(3));
			r.setLang(rs.getString(4));
			r.setGender(rs.getString(5));
			r.setUname(rs.getString(6));
			r.setPassword(rs.getString(7));
			r.setEmail(rs.getString(8));
			r.setContact(rs.getLong(9));
			r.setAddress(rs.getString(10));
			r.setType(rs.getString(11));
			s.add(r);
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			ps.close();
			con.close();
		}
		
		return s;

	}

	public static List<RegDTO> view(RegDTO r) throws SQLException, ClassNotFoundException {
		
		con = DbReg.getConnection();
		PreparedStatement pst = null;
		List<RegDTO> s;
		try {
			pst=con.prepareStatement("Select * from regist where username=? password=?");
			s = new ArrayList<>();
			pst.setString(1, r.getUname());
			pst.setString(2, r.getPassword());
			ResultSet rs = pst.executeQuery();
			while (rs.next())

			{
				r.setName(rs.getString(1));
				r.setAge(rs.getInt(2));
				r.setDate(rs.getDate(3));
				r.setLang(rs.getString(4));
				r.setGender(rs.getNString(5));
				r.setUname(rs.getString(6));
				r.setPassword(rs.getString(7));
				r.setEmail(rs.getString(8));
				r.setContact(rs.getInt(9));
				r.setAddress(rs.getString(10));
				r.setType(rs.getString(11));
				s.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			pst.close();
			con.close();
			
		}
		return s;
	}

	public static boolean delete(String s) throws SQLException, ClassNotFoundException {
		boolean status = false;
		try {
			con = DbReg.getConnection();
			PreparedStatement pst = con.prepareStatement("Delete * from table where Uname=?");
			pst.setString(1, s);
			int result = pst.executeUpdate();
			if (result > 0) {
				status = true;
			}
			pst.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}
		return status;
	}

	public static boolean deleteAll() throws SQLException {
		boolean status = false;
		PreparedStatement pst=null;
		try {
			
			pst = con.prepareStatement("delete * from regist");
			int result = pst.executeUpdate();
			if (result > 0) {
				status = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
		pst.close();
		con.close();
	}
		return status;
	}
}
