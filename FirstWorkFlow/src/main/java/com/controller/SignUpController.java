package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dto.User;

@WebServlet("/SignUp")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		System.out.println("-------------------------------------");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String date = request.getParameter("dob");
		System.out.println(" dob "+ date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		try {
			dob = sdf.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String[] langList = request.getParameterValues("lang");
		String lang = "";
		for (int i = 0; i < langList.length; i++) {
			lang += langList[i] + " ";
		}
		String gender = request.getParameter("gender");
		String username = request.getParameter("username");
		String pswd = request.getParameter("password");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String type = request.getParameter("type");
		System.out.println("dob-------->"+dob);

		User user = new User(name, age, dob, lang, gender, username, pswd, email, contact, address, type);
	//User user=new User();
	//user.setName(name);
		System.out.println(user);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);

		if (UserDao.usernameCheck(user.getUsername())) {
			System.out.println("Try with another username");
		
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			//session.getAttribute("user");

			rd.forward(request, response);
		} else {
			boolean status = UserDao.insert(user);

			if (status) {

				System.out.println(" row inserted");
				RequestDispatcher rd = request.getRequestDispatcher("LogIn.jsp");
				rd.forward(request, response);
			}
		else {

//			System.out.println(" Existing usernAME");
//			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
//			rd.forward(request, response);

			System.out.println("Error in registration");
		}
	}
}
}