package com.my.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.my.confi.Dbdem;
import com.my.dto.ProductDTO;

public class updatePro {
	static Connection con = null;
	

	public static int update(ProductDTO p) throws SQLException {
		int result = 0;
		try {
			con = Dbdem.getConnection();
			PreparedStatement pst = con.prepareStatement("update product set id=?,name=?,size=?,category=?,price=? where id=?"); 
			pst.setString(1, p.getId());
			pst.setString(2, p.getName());
			pst.setString(3, p.getSize());
			pst.setString(4, p.getCategory());
			pst.setString(5, p.getPrice());
			pst.setString(6, p.getId());;
			result = pst.executeUpdate();
			pst.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			con.close();
		}
		return result;
	}

}
