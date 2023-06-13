package com.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dto.RegisterDTO;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		Long contact=Long.parseLong(request.getParameter("contact"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		RegisterDTO user=new RegisterDTO ();
		user.setName(name);
		user.setContact(contact);
		user.setAddress(address);
		user.setEmail(email);
		user.setPassword(password);
		
		System.out.println(user);
		
		
		
		// TODO Auto-generated method stub
	}

}
