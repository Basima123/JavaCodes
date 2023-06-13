package com.my.dao;
import com.my.confi.Dbdem;
import com.my.dto.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProductDao {
		static Connection con = null;
		

		public static int insert(ProductDTO p) throws SQLException {
			int result = 0;
			try {
				con = Dbdem.getConnection();
				PreparedStatement pst = con.prepareStatement("insert into product1 values(?,?,?,?,?);");
				pst.setString(1, p.getId());
				pst.setString(2, p.getName());
				pst.setString(3, p.getSize());
				pst.setString(4, p.getCategory());
				pst.setString(5, p.getPrice());
				result = pst.executeUpdate();
				pst.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				con.close();
			}
			return result;
		}

		public static int update(ProductDTO p) throws SQLException {
			int result = 0;
			try {
				con = Dbdem.getConnection();
				PreparedStatement pst = con.prepareStatement("update product1 set(id=?,name=?,size=?,category=?,price=? where id=?);");
				pst.setString(1, p.getId());
				pst.setString(2, p.getName());
				pst.setString(3, p.getSize());
				pst.setString(4, p.getCategory());
				pst.setString(5, p.getPrice());
				result = pst.executeUpdate();
				pst.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				con.close();
			}
			return result;
		}
		
		public static int delete(String id) throws SQLException {
			int result=0;
			try {
				con=Dbdem.getConnection();
				PreparedStatement pst = con.prepareStatement("delete from product1 where id=?;");
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
