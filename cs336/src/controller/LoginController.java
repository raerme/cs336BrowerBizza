package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Authenticator;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginController() {
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = null;
		String action = request.getParameter("action");
		if("Log In".equals(action)){
			String username = request.getParameter("username");
			String password = request.getParameter("password");	
			
			Authenticator auth = new Authenticator();
			String result = auth.loginAuthenticator(username, password);
			
			if(result.equals("fail")) {
				rd = request.getRequestDispatcher("/LoginFail.jsp");
			}
			else if(result.equals("success")) {
				rd = request.getRequestDispatcher("/LoginSuccess.jsp");
			}

			HttpSession userSession = request.getSession();
		}
		else if("Create New Account".equals(action)){
			rd = request.getRequestDispatcher("/CreateAccount.jsp");
		}

		rd.forward(request, response);
	}
}
