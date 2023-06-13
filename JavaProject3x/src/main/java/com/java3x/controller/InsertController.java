package com.java3x.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java3x.dao.Java3xDAO;
import com.java3x.dto.Java3xDTO;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("InsertController dopost starts");
		boolean status = false;
		Java3xDTO dto = new Java3xDTO();
		String idNo = request.getParameter("idNo");
		System.out.println(idNo);
		String idType = request.getParameter("idType");
		String name = request.getParameter("name");
		String relation = request.getParameter("relation");
		System.out.println(relation);
		String gender = request.getParameter("gender");
		String dob1 = request.getParameter("dob");
		try {
			Date dob = new SimpleDateFormat("dd-MM-yyyy").parse(dob1);

			String citizen = request.getParameter("citizen");
			String card = request.getParameter("cardType");
			
			String doi1 = request.getParameter("doi");
			if (doi1.isEmpty()) {
				dto.setDoi(null);
			} else {
				Date doi = new SimpleDateFormat("dd-MM-yyyy").parse(doi1);
				dto.setDoi(doi);
			}
			String expiry1 = request.getParameter("expiry");
			if (expiry1.isEmpty()) {
				dto.setExpiry(null);
			} else {
				Date expiry = new SimpleDateFormat("dd-MM-yyyy").parse(expiry1);
				dto.setExpiry(expiry);

			}

			dto.setIdNo(idNo);
			dto.setIdType(idType);
			dto.setName(name);
			dto.setRelation(relation);
			dto.setGender(gender);
			dto.setDob(dob);
			dto.setCitizen(citizen);
			dto.setCard(card);

			try {
				status = Java3xDAO.insert(dto);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (status) {
			System.out.println("Inserted Successsfully");
		} else
			System.out.println("Cant Insert");
	}

}
