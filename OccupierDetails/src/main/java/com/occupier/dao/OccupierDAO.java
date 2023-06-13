package com.occupier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.occupier.dto.OccupierDTO;
import com.occupier.utility.JdbcConnection;

public class OccupierDAO {

	public static int insert(OccupierDTO dto) throws SQLException {
		System.out.println("Started");
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			System.out.println("inside try");
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(
					"insert into occupier(name,idNo,idType,telHome,telOffice,hp,fax,email,gender,dob,status,citizen,nation,race)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getIdNo());
			ps.setString(3, dto.getIdType());
			ps.setLong(4, dto.getTelHome());
			ps.setLong(5, dto.getTelOffice());
			ps.setLong(6, dto.getHp());
			ps.setLong(7, dto.getFax());
			ps.setString(8, dto.getEmail());
			ps.setString(9, dto.getGender());
			ps.setDate(10, new java.sql.Date( dto.getDob().getTime() ));
			//ps.setDate(3,new java.sql.Date(dto.getDob().getTime()));
			ps.setString(11, dto.getStatus());
			ps.setString(12, dto.getCitizen());
			ps.setString(13, dto.getNation());
			ps.setString(14, dto.getRace());

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
	public static int update(OccupierDTO dto)
	{
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		con=JdbcConnection.getConnection();
		try {
			ps=con.prepareStatement("UPDATE OCCUPIER SET name=?,idNo=?,idType=?,telHome=?,telOffice=?,hp=?,fax=?,email=?,gender=?,dob=?,status=?,citizen=?,nation=?,race=? WHERE NAME=?)");
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getIdNo());
			ps.setString(3, dto.getIdType());
			ps.setLong(4, dto.getTelHome());
			ps.setLong(5, dto.getTelOffice());
			ps.setLong(6, dto.getHp());
			ps.setLong(7, dto.getFax());
			ps.setString(8, dto.getEmail());
			ps.setString(9, dto.getGender());
			ps.setDate(10, new java.sql.Date( dto.getDob().getTime() ));
			//ps.setDate(3,new java.sql.Date(dto.getDob().getTime()));
			ps.setString(11, dto.getStatus());
			ps.setString(12, dto.getCitizen());
			ps.setString(13, dto.getNation());
			ps.setString(14, dto.getRace());
			ps.setString(15, dto.getName());

			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
public static OccupierDTO view(String name) throws SQLException
{
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	OccupierDTO dto=new OccupierDTO();
	con=JdbcConnection.getConnection();
	try {
		ps=con.prepareStatement("select * from occupier where name=?");
		ps.setString(1, name);
		rs=ps.executeQuery();
		while(rs.next())
		{
			dto.setName(rs.getString(1));
			dto.setIdNo(rs.getString(2));
			dto.setIdType(rs.getString(3));
			dto.setTelHome(rs.getLong(4));
			dto.setTelOffice(rs.getLong(5));
			dto.setHp(rs.getLong(6));
			dto.setFax(rs.getLong(7));
			dto.setEmail(rs.getString(8));
			dto.setGender(rs.getString(9));
			dto.setDob(rs.getDate(10));
			dto.setStatus(rs.getString(11));
			dto.setCitizen(rs.getString(12));
			dto.setNation(rs.getString(13));
			dto.setRace(rs.getString(14));		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		ps.close();
		con.close();
		
	}
	
	return dto;
}
	
	public static ArrayList<OccupierDTO> viewAll() throws SQLException
	{
		Connection con=null;
		PreparedStatement ps =null;
		ResultSet rs=null;
		ArrayList<OccupierDTO> list=new ArrayList<OccupierDTO>();
		OccupierDTO dto=new OccupierDTO();
		con=JdbcConnection.getConnection();
		try {
			ps=con.prepareStatement("select * from occupierDTO");
			rs=ps.executeQuery();
			while(rs.next())
			{
				dto.setName(rs.getString(1));
				dto.setIdNo(rs.getString(2));
				dto.setIdType(rs.getString(3));
				dto.setTelHome(rs.getLong(4));
				dto.setTelOffice(rs.getLong(5));
				dto.setHp(rs.getLong(6));
				dto.setFax(rs.getLong(7));
				dto.setEmail(rs.getString(8));
				dto.setGender(rs.getString(9));
				dto.setDob(rs.getDate(10));
				dto.setStatus(rs.getString(11));
				dto.setCitizen(rs.getString(12));
				dto.setNation(rs.getString(13));
				dto.setRace(rs.getString(14));
				list.add(dto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally	
		{
			ps.close();
			con.close();
			
		}
		return list;
		
	}

}
