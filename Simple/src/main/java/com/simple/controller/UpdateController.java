package com.simple.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simple.dao.SimpleDAO;
import com.simple.dto.SimpleDTO;


@WebServlet("/u")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
				System.out.println("Name :" +name);
		System.out.println("password : " +password);
		
SimpleDTO sim=new SimpleDTO(name,password);
		
		int updateresult=0;
		try {
			updateresult=SimpleDAO.update(sim);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(updateresult+"row updated");
	
	
	
	}

}
