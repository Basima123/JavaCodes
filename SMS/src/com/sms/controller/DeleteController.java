package com.sms.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	int status=0;
	RequestDispatcher rd=null;
	String buttonAction =request.getParameter("buttonAction");
	if(buttonAction.equalsIgnoreCase("delete"))
	{
String[] lists=request.getParameterValues("rowkey");
			for(String list:lists)
			{
				System.out.println(list +" delete these rows");
				try {
					status=StudentDAO.delete(list);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		if(status>0)
		{
			System.out.println("Deleted Successfully");
			List<StudentDTO> list=new ArrayList<StudentDTO>();
			HttpSession session=request.getSession();
			session.setAttribute("list", list);
			rd=request.getRequestDispatcher("viewAll.jsp");
			rd.include(request, response);
		}
		
		else
		{
			System.out.println("Unable to delete");
		}
	} 
		if(buttonAction.equalsIgnoreCase("delete all"))
		{
			try {
				status=StudentDAO.deleteAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(status>0)
			{
				System.out.println("All records deleted");
				rd=request.getRequestDispatcher("viewAll.jsp");
				rd.forward(request, response);
						
			}
			else
				System.out.println("Cant delete");
		}
			
			/*
			 * if(buttonAction.equalIgnoreCase("delete")) { list=StudentDAO.delete(); }
			 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
