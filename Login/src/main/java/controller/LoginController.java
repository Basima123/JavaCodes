package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.RegDao.RegDao;
import com.dto.RegDto.RegDto;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("login process Starts");
		String uname=request.getParameter("uname");
		String password=request.getParameter("pass");
		RegDto regDto=new RegDto();
	     regDto.setUsername(uname);
	     regDto.setPassword(password);
	     System.out.println(regDto.getPassword());
	     boolean status=RegDao.check(regDto);
	    RequestDispatcher rd=null;
	     if(status) {
	    	 System.out.println("login sucessfully"); 
	    	rd=request.getRequestDispatcher("view.jsp");
	    	// String  arr[]= RegDao.view(regDto);
	    	 regDto=RegDao.view(regDto);
	    	// System.out.println(arr[0]);
	    	 HttpSession session=request.getSession();
	    	 session.setAttribute("dto",regDto);
	        // session.setAttribute("vname",arr[0]);  
	        // session.setAttribute("vuname", arr[1]);
	        // session.setAttribute("vpassword", arr[2]);
	         
	     }
	     else {
	    	 System.out.println("user name password is incorrect");
	    	 rd=request.getRequestDispatcher("login.jsp");
	     }
	     rd.forward(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
