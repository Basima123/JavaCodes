package com.simple.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.simple.dao.SimpleDAO;
import com.simple.dto.SimpleDTO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("start get");
		doPost(request, response);
	}

	/**
	 * @param SimpleDTO
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// doGet(request, response);
         System.out.println("start controller");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("Name :" + name);
		System.out.println("password : " + password);

		SimpleDTO sim = new SimpleDTO();
		sim.setName(name);
		sim.setPassword(password);
       boolean status=SimpleDAO.checkLogin(sim);
       if(status)
       {
    	 response.sendRedirect("Home.jsp") ; 
       }
       else
       {
    	   request.getRequestDispatcher("Login.jsp");
       }
		

	}

}
