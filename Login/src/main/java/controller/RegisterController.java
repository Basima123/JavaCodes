package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegDao.RegDao;
import com.dto.RegDto.RegDto;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		System.out.println("trying to register");
		String name=request.getParameter("name");
		String userName=request.getParameter("uname");
		String password=request.getParameter("pass");
		RegDto regDto = new RegDto();
		regDto.setName(name);
		regDto.setUsername(userName);
		regDto.setPassword(password);
		System.out.println(regDto.getName());
		boolean status = RegDao.insert(regDto);
		RequestDispatcher rd = null;
		if (status) {
			rd = request.getRequestDispatcher("login.jsp");
			System.out.println("register successfull!");
		}    
		else {
			System.out.println("register not success");
		}
		rd.forward(request, response);
		System.out.println("register page end");
		//doGet(request, response);
	}

}
