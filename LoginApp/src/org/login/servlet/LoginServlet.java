package org.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.login.dto.User;
import org.login.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		LoginService loginService = new LoginService();
		boolean result = loginService.authentication(userId, password);
		if(result){
			User user = loginService.getUserDetail(userId);
			request.setAttribute("user",user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("success.jsp");
			return;
		}else{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
