package ControllerServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import LoginBean.LoginBean;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		LoginBean bean=new LoginBean();
		bean.setName(name);
		bean.setPassword(password);
		request.setAttribute("bean",bean);
		boolean status=bean.validate();
		if(status){
		RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");
		rd.forward(request,response);
		}
		else{
		RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");
		rd.forward(request,response);
		}

	}

}
