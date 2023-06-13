package com.my.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.my.dao.ProductDao;
import com.my.dto.ProductDTO;


public class Pro1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String size=request.getParameter("size");
		String category=request.getParameter("category");
	String price = request.getParameter("price");
	ProductDTO pro=new ProductDTO(id,name,size,category,price);
	
	int insertresult=0;
			try {
				insertresult=ProductDao.insert(pro);
			} catch(SQLException e) 
			{e.printStackTrace();}
			System.out.println(insertresult + " row inserted ");}}




	

	
	


