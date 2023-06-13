package com.simple.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simple.dao.SimpleDAO;
import com.simple.dto.SimpleDTO;

@WebServlet("/RetrieveAll")
public class RetrieveAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();    
        out.println("<h1>Name List</h1>");  
          
        List<SimpleDTO> list = null;
		try {
			list = SimpleDAO.viewall();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Name</th><th>Password</th></tr>");
                 for(SimpleDTO e:list){  
                     out.print("<tr><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td>");  
                    }  
                    out.print("</table>");  
                      
                    out.close();     		
	}

}
