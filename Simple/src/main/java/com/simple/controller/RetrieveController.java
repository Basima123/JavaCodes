package com.simple.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simple.dao.SimpleDAO;
import com.simple.dto.SimpleDTO;


@WebServlet("/Retrieve")
public class RetrieveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RetrieveController post start");
	String name = request.getParameter("name");
		//SimpleDTO s= new SimpleDTO();
	//s.setName(name);
		 try {
			 
			SimpleDTO view = SimpleDAO.view(name);
			System.out.println(view);
			HttpSession session=request.getSession();
			session.setAttribute("view", view);
			response.sendRedirect("view.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}


