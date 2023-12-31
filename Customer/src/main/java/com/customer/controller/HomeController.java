package com.customer.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.dao.CustomerDAO;
import com.customer.dto.CustomerDTO;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String buttonAction=request.getParameter("buttonAction");
		if(buttonAction.equalsIgnoreCase("enquire"))
		{
			List <CustomerDTO> list=new ArrayList<CustomerDTO> ();
			try {
				list=CustomerDAO.viewAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session=request.getSession();
			session.setAttribute("customer", list);
		response.sendRedirect("view.jsp");
			}
		else if(buttonAction.equalsIgnoreCase("update"))
			{
				response.sendRedirect("update.jsp");
			}
		else if(buttonAction.equalsIgnoreCase("create"))
		{
			response.sendRedirect("add.jsp");
		}
		
		else if (buttonAction.equalsIgnoreCase("delete"))
		{
			response.sendRedirect("delete.jsp");
		}
		else
			System.out.println("page not found");
	}

}
