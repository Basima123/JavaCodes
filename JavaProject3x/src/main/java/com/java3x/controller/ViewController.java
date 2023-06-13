package com.java3x.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java3x.dao.Java3xDAO;
import com.java3x.dto.Java3xDTO;

/**
 * Servlet implementation class ViewController
 */
@WebServlet("/ViewController")
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String idNo=request.getParameter("idNo");
		 String idType=request.getParameter("idType");
		 Java3xDTO dto=new Java3xDTO();
		 dto.setIdNo(idNo);
		 dto.setIdType(idType);
		 try {
			 System.out.println("calling DAO");
			dto=Java3xDAO.view(dto);
			System.out.println("return from DAO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HttpSession session=request.getSession();
		 if(dto!=null)
		 {
		 session.setAttribute("dto", dto);
		 RequestDispatcher rs=request.getRequestDispatcher("view.jsp");
		 rs.include(request, response);
		 }
		 else
		 {
			 System.out.println("dto is empty");
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
