package com.occupier.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.occupier.dao.OccupierDAO;
import com.occupier.dto.OccupierDTO;


@WebServlet("/OccupierController")
public class OccupierController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OccupierController() {
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
		//String name = request.getParameter("name");
		//String idNo = request.getParameter("idNo");
		//String idType = request.getParameter("idType");
		String gender = request.getParameter("gender");
		String dob1 = request.getParameter("dob");
		try {
			Date dob = new SimpleDateFormat("dd-MM-yyy").parse(dob1);

			String status = request.getParameter("status");
			String citizen = request.getParameter("citizen");
			String nation = request.getParameter("nation");
			String race = request.getParameter("race");

			OccupierDTO dto = new OccupierDTO();
			HttpSession session=request.getSession();
			if( session.getAttribute("dto")!=null) {
				dto=(OccupierDTO)session.getAttribute("dto");
			
			//dto.setName(name);
			//dto.setIdNo(idNo);
			//dto.setIdType(idType);
			dto.setGender(gender);
			dto.setDob(dob);
			dto.setStatus(status);
			dto.setCitizen(citizen);
			dto.setNation(nation);
			dto.setRace(race);
			System.out.println (dto.getName());
			}
			else
				System.out.println("DTO is empty");
			int result;
			
			try {
				result = OccupierDAO.insert(dto);
		

			if (result>0) {
				System.out.println("inserted Successfully");

			} 
			else
			{
				System.out.println("cant insert");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
