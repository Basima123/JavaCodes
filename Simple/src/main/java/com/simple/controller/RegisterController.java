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
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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

		// doGet(request, response);
         System.out.println("start controller");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("Name :" + name);
		System.out.println("password : " + password);

		SimpleDTO sim = new SimpleDTO();
		sim.setName(name);
		sim.setPassword(password);

		
		try {
		boolean	insertresult = SimpleDAO.insert(sim);
		if(insertresult)
		{
			
			response.sendRedirect("Retrieve.jsp");
			System.out.println(insertresult + "row inserted");
		}
		else
		{
			response.sendRedirect("register.jsp");
		}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
