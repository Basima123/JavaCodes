package com.customer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.dto.AddressDTO;
import com.customer.dto.CustomerDTO;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
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
				if (buttonAction.equalsIgnoreCase("back"))
				{
					response.sendRedirect("home.jsp");
				}
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		 String age1=request.getParameter("age");
		 int age=Integer.parseInt(age1);
		 String block1=request.getParameter("block");
		 int block=Integer.parseInt(block1);
		 String level1=request.getParameter("level");
		 int level=Integer.valueOf(level1);
		 String unit1=request.getParameter("unit");
		 int unit=Integer.parseInt(unit1);
		 String street=request.getParameter("street");
		 Long postal=Long.parseLong(request.getParameter("postal"));
		 Long mobileNo=Long.parseLong(request.getParameter("mobileNo"));
		 Long homeNo=Long.parseLong(request.getParameter("homeNo"));
		 
		 HttpSession session=request.getSession();
		 session.setAttribute("session", session);
		 
		CustomerDTO cust=new CustomerDTO();
		AddressDTO addr=new AddressDTO();		
		
		cust.setName(name);
		cust.setAge(age);
		cust.setGender(gender);
		cust.setHomeNo(homeNo);
		cust.setMobileNo(mobileNo);
		addr.setBlock(block);
		addr.setLevel(level);
		addr.setUnit(unit);
		addr.setStreet(street);
		addr.setPostal(postal);
		
		
	}

}
