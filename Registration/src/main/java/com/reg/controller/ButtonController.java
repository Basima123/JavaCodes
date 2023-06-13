package com.reg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ButtonController
 */
@WebServlet("/ButtonController")
public class ButtonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ButtonController() {
        super();
        // TODO Auto-generated constructor stub
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//doGet(request, response);
		String buttonAction = request.getParameter("buttonAction");
		if (buttonAction.equalsIgnoreCase("Register"))
		{
			response.sendRedirect("Login.jsp");
		}
		else if (buttonAction.equalsIgnoreCase("Login"))
		{
			response.sendRedirect("Update.jsp");
		}
		else
		{
			System.out.println("page not found");
		}
	}

}
