package com.sms.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.dao.StudentDAO;
import com.sms.dto.StudentDTO;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		String buttonAction=request.getParameter("buttonAction");
		if(buttonAction.equalsIgnoreCase("view"))
		{
			ArrayList<StudentDTO> list=new ArrayList<StudentDTO>();
			try {
				list=StudentDAO.viewall();
				HttpSession session=request.getSession();
				session.setAttribute("list", list);
				RequestDispatcher rd=request.getRequestDispatcher("viewAll.jsp");  
				rd.include(request, response) ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("viewAll.jsp");
		}
		
		if(buttonAction.equalsIgnoreCase("update"))
		{
		boolean status=false;	
		String id1=request.getParameter("id");
		int	id=Integer.parseInt(id1);
		String name = request.getParameter("name");
		String dob1 = request.getParameter("dob");
		Date dob;
		try {
			dob = (Date)new SimpleDateFormat("yyyy-MM-dd").parse(dob1);
		
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String lang[] = request.getParameterValues("lan");
		String lan="";
		for(int i=0 ;i<lang.length; i++)
		{
			lan+= ","+lang[i] ;
		}
		String uname = request.getParameter("uname");
		String password=request.getParameter("password");
		String access = request.getParameter("access");
		StudentDTO student = new StudentDTO();
		student.setId(id);
		student.setName(name);
		student.setDob(dob);
		student.setAddress(address);
		student.setGender(gender);
		student.setLanguage(lan);
		student.setUserName(uname);
		student.setPassword(password);
		student.setAccess(access);
		
		
	HttpSession session=request.getSession();
	session.setAttribute("student", student);
	
	//StudentDTO dto=new StudentDTO();
	
	status = StudentDAO.updateStudent(student);
		}catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	

if(status)
{
	System.out.println("Updated Successfully");
	ArrayList<StudentDTO> list=new ArrayList<StudentDTO>();
	try {
		list=StudentDAO.viewall();
		HttpSession session=request.getSession();
		session.setAttribute("list", list);
		RequestDispatcher rd=request.getRequestDispatcher("viewAll.jsp");  
		rd.include(request, response) ;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
else
{
	System.out.println("Error");
RequestDispatcher rd=request.getRequestDispatcher("error.jsp");  
rd.forward(request, response); 
		} 

		
	}
	}
}


