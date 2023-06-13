package com.reg.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.Region;

import com.reg.dao.RegDAO;
import com.reg.dto.RegDTO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password = request.getParameter("password");
		//RegDTO r=new RegDTO(uname,password);
		RegDTO r= new RegDTO();
		r.setUname(uname);
		r.setPassword(password);
	try {
		boolean status=RegDAO.loginCheck(uname,password);
	
	if(status)
	{
		if(uname==r.getUname()&& password==r.getPassword())
		{
		System.out.println("Login Successfully");
		response.sendRedirect("Register.jsp");
	} else
	{
		System.out.println("Incorrect Username or Password ");
	}
	
	} 
	}catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
//			RegDTO login =RegDAO.login(r);
//		
//HttpSession session = request.getSession();
//session.setAttribute("login",login);






		