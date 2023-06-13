package com.occupier.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.occupier.dto.OccupierDTO;

/**
 * Servlet implementation class ContactController
 */
@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactController() {
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
		System.out.println("ContactController doPost Starts");
		String name=request.getParameter("name");
		String idNo=request.getParameter("idNo");
		String idType=request.getParameter("idType");
		String telHome1=request.getParameter("telHome");
		long telHome=Long.parseLong(telHome1);
		String telOffice1=request.getParameter("telOffice");
		long telOffice=Long.parseLong(telOffice1);
		String hp1=request.getParameter("hp");
		long hp=Long.parseLong(hp1);
		String fax1=request.getParameter("fax");
		long fax=Long.parseLong(fax1);
		String email=request.getParameter("email");
		
		OccupierDTO dto=new OccupierDTO();//object reference
		dto.setName(name);
		dto.setIdNo(idNo);
		dto.setIdType(idType);
		dto.setTelHome(telHome);
		dto.setTelOffice(telOffice);
		dto.setHp(hp);
		dto.setFax(fax);
		dto.setEmail(email);
		
		HttpSession session=request.getSession();
		session.setAttribute("dto", dto);
		RequestDispatcher rd=request.getRequestDispatcher("occupier.jsp");
		rd.include(request, response);
		System.out.println("ContactController doPost Ends");
		
	}
	}

