package com.reg.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reg.dao.RegDAO;
import com.reg.dto.RegDTO;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age1=request.getParameter("age");
		int age=Integer.parseInt(age1);
		String date1=request.getParameter("date");
		Date date = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy").parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String langu[] =request.getParameterValues("lang");
		String lang="";
		for(int i=0;i<langu.length;i++)
		{
			lang=lang+langu[i]+ "," ;
		}
		String gender=request.getParameter("gender");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String contact1=request.getParameter("contact");
		long contact=Long.parseLong(contact1);
		String address=request.getParameter("address");
		String type=request.getParameter("type");
		String buttonAction=request.getParameter("buttonAction");


		RegDTO r=new RegDTO(name,age,date,lang,gender,uname,password,email,contact,address,type);
		System.out.println(r);
		
		RequestDispatcher rd=null;
		if (buttonAction.equalsIgnoreCase("Update"))
		{		
			int updateresult=0;

			try {
				updateresult=RegDAO.update(r);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(updateresult + "row updated");

			//response.sendRedirect("Login.jsp");
			rd=request.getRequestDispatcher("Update.jsp");
			
		rd.forward(request, response);
	}
	}}


