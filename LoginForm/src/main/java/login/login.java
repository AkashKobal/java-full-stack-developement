package login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/loginForm")
public class login  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		
		String my_name = req.getParameter("name");
		String my_password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>Your Details</h1>");
		out.print("<h3>Your Name :"+my_name+"</h3>");
		out.print("<h3>Your Passowrd :"+my_password+"</h3>");

	}
}
