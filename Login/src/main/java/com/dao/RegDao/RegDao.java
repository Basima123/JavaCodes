package com.dao.RegDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dto.RegDto.RegDto;

import utility.JdbcConnection;

public class RegDao {
	
	public static boolean insert(RegDto regDto) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean status=false;
		String sql="insert into info(Name,Username,Password) values(?,?,?)";
		try { 
			System.out.println(regDto.toString());
			con=JdbcConnection.getConnection();
			if(con!=null) {
				pst=con.prepareStatement(sql);
				pst.setString(1, regDto.getName());
				pst.setString(2,regDto.getUsername());
				pst.setString(3,regDto.getPassword());
				
			
			}
			int result = pst.executeUpdate();
			System.out.println("inserted"+result);
			if(result>0) {
				status=true;}
			System.out.println("Insert status :"+status);
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				JdbcConnection.closeStatement(pst);
				JdbcConnection.closeConnection(con);
		}
		
		return status;
	}
	public static boolean check(RegDto regDto) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean status=false;
		String query="select Password from info where UserName=?";
		System.out.println(query);
		String password="";
		try {
			 System.out.print("connecting to check");
			con=JdbcConnection.getConnection();
		    pst=con.prepareStatement(query);
		      pst.setString(1,regDto.getUsername());  
		      ResultSet rs=pst.executeQuery();
			 System.out.println("Trying to connect");
		     while(rs.next()) {
		    	// System.out.println("Name:"+rs.getString("Name"));
		    	// System.out.println("User Name:"+rs.getString("UserName"));
		    	 password= rs.getString("Password");
		    	 System.out.println(password);
		     }
		     System.out.println("checking....");
		     System.out.println(password);
		     System.out.println(regDto.getPassword());
			 if(password.equals(regDto.getPassword())) {
		         status=true;
			}
			 else {
				 System.out.println("password incorrect");
				 
				  status=false;
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcConnection.closeStatement(pst);
			JdbcConnection.closeConnection(con);
	}
	
          return status;
	}
	
	/*public static String[] view(RegDto regDto) {
		
		Connection con=null;
		PreparedStatement pst=null;
		boolean status=false;{
		String query="select * from info where UserName=?";
		System.out.println(query);
		String password="";
		String name="";
		String uname="";
		String arr[]=new String[3];
		try {
			 System.out.print("connecting to view");
			con=JdbcConnection.getConnection();
		    pst=con.prepareStatement(query);
		      pst.setString(1,regDto.getUsername());  
		      ResultSet rs=pst.executeQuery();
			 System.out.println("Trying to connect");
		     while(rs.next()) {
		    	/*System.out.println("Name:"+rs.getString("Name"));
		    	 System.out.println("User Name:"+rs.getString("UserName"));
		    	 System.out.println("");
                 name=rs.getString("Name");
                 uname=rs.getString("UserName");
		    	 password= rs.getString("Password");
		     }
		   /*  System.out.println("checking....");
		     System.out.println(password);
		     System.out.println(regDto.getPassword());
			 if(password.equals(regDto.getPassword())) {
		         status=true;
			}
			 else {
				 System.out.println("password incorrect");
				 
				  status=false;
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcConnection.closeStatement(pst);
			JdbcConnection.closeConnection(con);
	}
	
		arr[0]=name;
		arr[1]=uname;
		arr[2]=password;
		System.out.println("...view ends...");
         return arr;
}
	}*/
	public static RegDto view(RegDto regdto){
		// RegDto regdto=new RegDto();
		 Connection con=null;                                                          
		 PreparedStatement pst=null;                                                   
	//	 boolean status=false; 
		 String name="",uname="",pass="";
		 String query="select * from info where UserName=?";
		 try {
			 System.out.print("connecting to view");
				con=JdbcConnection.getConnection();
			    pst=con.prepareStatement(query);
			      pst.setString(1,regdto.getUsername());  
			      ResultSet rs=pst.executeQuery();
				 System.out.println("Trying to connect");
		 while(rs.next()) {
		    	System.out.println("Name:"+rs.getString("Name"));
		    	 System.out.println("User Name:"+rs.getString("UserName"));
		    	 System.out.println("");
              name=rs.getString("Name");
              uname=rs.getString("UserName");
		    	 pass= rs.getString("Password");
		     }
		   /*  System.out.println("checking....");
		     System.out.println(password);
		     System.out.println(regDto.getPassword());*/
			 if(pass.equals(regdto.getPassword())) {
		         regdto.setName(name);
		         regdto.setUsername(uname);
		         regdto.setPassword(pass);
			}
			 else {
				 System.out.println("password incorrect");
				 // status=false;
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcConnection.closeStatement(pst);
			JdbcConnection.closeConnection(con);
		}
		return regdto;
		
	}
	public static ArrayList<RegDto> Viewall() {
		ArrayList<RegDto> al=new ArrayList<RegDto>();
		Connection con=null;
		PreparedStatement pst=null;
		  boolean status=false;
		  String query="select* from info";
		  RegDto regDto=null;
		try {
			  System.out.println("Connecting to view all");
			  con=JdbcConnection.getConnection();
			  pst=con.prepareStatement(query);
			  ResultSet rs=pst.executeQuery();
			  while(rs.next()) {
				  
				   regDto=new RegDto();
				  String name=rs.getString("Name");
				 String userName=rs.getString("UserName");
				 String password=rs.getString("Password");
				      regDto.setName(name);
				      regDto.setUsername(userName);
				      regDto.setPassword(password);
				  /* regDto.setName(rs.getString("Name"));
				   regDto.setName(rs.getString("UserName"));
				   regDto.setName(rs.getString("Password"));*/
				   // String n= regDto.getUsername();
				//  System.out.println(n);
				   al.add(regDto);
				   System.out.println("data retrived");	  
			  }
			
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			JdbcConnection.closeStatement(pst);
			JdbcConnection.closeConnection(con);
	}
	      System.out.println("view db connections ends");
		  return al;
	}
	public static boolean deleting(String uname) {
		String username=uname;
		int num=0;
		boolean status=false;
		Connection con=null;
		PreparedStatement ps=null;
		String query="delete from info where UserName=?";
		try {
			System.out.println("trying to delete ur data");
			con=JdbcConnection.getConnection();
			ps=con.prepareStatement(query);
			
			System.out.println("query excution");
			ps.setString(1,username);
			 num=ps.executeUpdate();
			 System.out.println("deleted row:"+num);
			 if(num!=0) {
				 status=true;
			 }
			 
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			JdbcConnection.closeStatement(ps);
			JdbcConnection.closeConnection(con);
		}
		return status;
	}
	public static boolean update(RegDto regDto) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean status=false;
		int num=0;
		System.out.println("this upadte dao");
		String query="update info set Name=?,Password=?where UserName=?";
		try {
			con=JdbcConnection.getConnection();
			if(con!=null) {
				System.out.println("execution");
				System.out.println(regDto.getUsername());
				System.out.println(regDto.getPassword());
				System.out.println(regDto.getName());
				pst=con.prepareStatement(query);
				System.out.println("Hello");
				pst.setString(1, regDto.getName());
				pst.setString(2,regDto.getPassword());
			   pst.setString(3,regDto.getUsername());
				  num=pst.executeUpdate();
				 System.out.println("updating data:"+num);
				 if(num!=0) {
					 status=true;
				 }
			}
			
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			JdbcConnection.closeStatement(pst);
			JdbcConnection.closeConnection(con);
		}
		return status;
		
	}

}
