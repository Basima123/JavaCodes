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
import javax.servlet.http.HttpSession;

import com.reg.dao.RegDAO;
import com.reg.dto.RegDTO;

@WebServlet("/RegController")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String buttonAction=request.getParameter("buttonAction");
		if(buttonAction.equalsIgnoreCase("Back"))
		{
			response.sendRedirect("home.jsp");
		}
		
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
		System.out.println("name=" + name + ", age=" + age + ", dob=" + date + ", lang=" + lang + ", gender=" + gender
				+ ", uname=" + uname + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + ", type=" + type );
		

		RegDTO r=new RegDTO(name,age,date,lang,gender,uname,password,email,contact,address,type);
		System.out.println(r);
		HttpSession session=request.getSession();
		session.setAttribute("user", session);
		try {
			if(RegDAO.usernameCheck(r.getUname()))
			{
				System.out.println("Name already exist");
				String message="Try another Name";
						session.setAttribute("message",message);
						RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
						rd.forward(request, response);
			}
				
						else
						{
							int status=RegDAO.insert(r);
							if(status>1)
							{
							System.out.println(r	+ "row inserted");
							RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
							rd.forward(request, response);
							}
						}
		}
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
		
		
		
		
		
		

