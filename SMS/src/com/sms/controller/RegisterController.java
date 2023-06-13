package com.sms.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// doGet(request, response);
		System.out.println("reg controller starts");
		StudentDTO student = new StudentDTO();
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		String name = request.getParameter("name");
		String dob1 = request.getParameter("dob");
		
		try {
			Date dob;
			dob = new SimpleDateFormat("dd-MM-yyyy").parse(dob1);
			student.setDob(dob);
			System.out.println("date:"+dob            );
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String lang[] = request.getParameterValues("lan");
		String lan = "";
		for (int i = 0; i < lang.length; i++) {
			lan += lang[i] + ",";
		}
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String access = request.getParameter("access");
		System.out.println("id  : "+id);
		System.out.println("lan  : "+lan);

		student.setId(id);
		student.setName(name);

		student.setAddress(address);
		student.setGender(gender);
		student.setLanguage(lan);
		student.setUserName(uname);
		student.setPassword(password);
		student.setAccess(access);

		HttpSession session = request.getSession();
		session.setAttribute("student", student);

		{
		
		boolean status=false;
		try {
			status = StudentDAO.studentIdCheck(student.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			System.out.println("Id already exist");
			RequestDispatcher rd=request.getRequestDispatcher("register1.jsp");
			rd.forward(request, response);
		}
		else
		try {
			status = StudentDAO.insertStudent(student);

			if (status) {
				System.out.println("Registered successfully");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// call dao for insert
//		StudentDAO dao=new StudentDAO();
//		boolean status=dao.insertStudent(student);
		// status true
		// success page
		// status false
		// errror page
		System.out.println("========================>");
	}

	}}
