package com.occupier.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.occupier.dao.OccupierDAO;
import com.occupier.dto.OccupierDTO;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/ViewController")
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String buttonAction=request.getParameter("buttonAction");
		String name=request.getParameter("name");
		if(buttonAction!=null && buttonAction.equalsIgnoreCase("search")) {
			OccupierDTO status=null;
			try {
				status = OccupierDAO.view(name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(status!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("dto", status);
				RequestDispatcher rs=request.getRequestDispatcher("view.jsp");
				rs.forward(request, response);
			}
			else
				System.out.println("cant get the data");
			
		}
		else if(buttonAction!=null && buttonAction.equalsIgnoreCase("edit"))
				{
			OccupierDTO status=null;
			try {
				status = OccupierDAO.view(name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(status!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("dto", status);
				RequestDispatcher rs=request.getRequestDispatcher("edit.jsp");
				rs.forward(request, response);
			}
			else
				System.out.println("cant get the data");
				}
		else
			System.out.println("CANT REDIRECT");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
