package com.sms.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String buttonAction = request.getParameter("buttonAction");
		if (buttonAction.equalsIgnoreCase("register")) {
			response.sendRedirect("register1.jsp");
		} else if (buttonAction.equalsIgnoreCase("Add Student")) {
			response.sendRedirect("add.jsp");
		} else if (buttonAction.equalsIgnoreCase("Login")) {
			response.sendRedirect("login.jsp");
		} else if(buttonAction.equalsIgnoreCase("Search")) {
			String id1=request.getParameter("id");
			int id=Integer.parseInt(id1);
			try {
				StudentDTO status=StudentDAO.view(id);
			
			if(status!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("list", status);
			RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
			rd.include(request, response);
			}
			else
				System.out.println("Id not found");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (buttonAction.equalsIgnoreCase("Update")) {
			response.sendRedirect("update.jsp");
		} else if (buttonAction.equalsIgnoreCase("Delete")) {
			ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
			try {
				list=StudentDAO.viewall();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session=request.getSession();
			session.setAttribute("list",list);
			response.sendRedirect("delete.jsp");
	
		} else if (buttonAction.equalsIgnoreCase("View")) {
			ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
			try {
				list=StudentDAO.viewall();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session=request.getSession();
			session.setAttribute("list",list);
			response.sendRedirect("viewAll.jsp");
		} else {
			System.out.println("page not found");
		}
	}}
