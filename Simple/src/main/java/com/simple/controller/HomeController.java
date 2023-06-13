package com.simple.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simple.dao.SimpleDAO;
import com.simple.dto.SimpleDTO;


@WebServlet("/Home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String buttonAction=request.getParameter("buttonAction");	
		if (buttonAction.equalsIgnoreCase("register")) {	
			response.sendRedirect("register.jsp");
		}else if (buttonAction.equalsIgnoreCase("Update")) {	
			response.sendRedirect("Update.jsp");
		}else if (buttonAction.equalsIgnoreCase("Delete")) {	
			response.sendRedirect("Delete.jsp");
		}else if (buttonAction.equalsIgnoreCase("Retrieve")) {	
				response.sendRedirect("Retrieve.jsp");	
		}else if (buttonAction.equalsIgnoreCase("Retrieve all")) {	
			try {
				ArrayList<SimpleDTO> list=SimpleDAO.viewall();
				if(list!=null)
				{
					System.out.println(list.size());
					HttpSession session=request.getSession();
					session.setAttribute("list", list);
					response.sendRedirect("viewall.jsp");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		else{
			System.out.println("page not found");
		}
		}

}
