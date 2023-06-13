package com.occupier.controller;

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

import com.occupier.dao.OccupierDAO;
import com.occupier.dto.OccupierDTO;

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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String buttonAction=request.getParameter("buttonAction");
		if(buttonAction.equalsIgnoreCase("inclusion"))
		{
			//response.sendRedirect("contact.jsp");
			RequestDispatcher rs=request.getRequestDispatcher("contact.jsp");
					rs.forward(request, response);
		}
		else if(buttonAction.equalsIgnoreCase("deletion"))
		{
			response.sendRedirect("delete.jsp");
		}
		else if(buttonAction.equalsIgnoreCase("enquiry"))
		{
			response.sendRedirect("view.jsp");
		}
		else if(buttonAction.equalsIgnoreCase("report"))
		{
			ArrayList<OccupierDTO> list=new ArrayList<OccupierDTO>();
			try {
				list=OccupierDAO.viewAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session=request.getSession();
			session.setAttribute("list", list);
			response.sendRedirect("report.jsp");
		}
		
	}

}
