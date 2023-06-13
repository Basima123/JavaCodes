package com.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dao.StudentDAO;
import com.sms.dto.StudentDTO;

/**
 * Servlet implementation class ViewAllController
 */
@WebServlet("/ViewAllController")
public class ViewAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter(); 
		
		
		try {
			ArrayList<StudentDTO> list=null;
			list=StudentDAO.viewall();
			StudentDTO dto=new StudentDTO();
			Date dob=dto.getDob();	
			SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
			String date1=formatter.format(dob);
			Date date;
			try {
				date = new SimpleDateFormat("dd-MM-yyyy").parse(date1);
				dto.setDob(date);
				System.out.println(date);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 out.print("<table border='1' width='100%'");  
		        out.print("<tr><th>Name</th><th>Password</th></tr>");
		                 for(StudentDTO e:list){  
		                     out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td>"+"<td>"+e.getDob()+"</td><td>"+
		                    		 "<td>"+e.getAddress()+"</td><td>"+"<td>"+e.getGender()+"</td><td>"+"<td>"+e.getLanguage()+
		                    		 "</td><td>"+"<td>"+e.getUserName()+"</td><td>"+"<td>"+e.getPassword()+"</td><td>"+e.getAccess()+"</td></tr");  
		                    }  
		                    out.print("</table>");  
		                      
		                    out.close();     

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
