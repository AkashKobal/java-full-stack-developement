package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class register extends HttpServlet {
	// invoke doPost method	
	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		
		
		// get inputs form html to java file
		String my_name = req.getParameter("name1");
		String my_email = req.getParameter("email1");
		String my_password = req.getParameter("password1");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Successfully Submited</h1>");
		
		/*
		
		// database connectivity
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/registrationForm","root","Akash@123");
			PreparedStatement ps = conn.prepareStatement("insert into details(?,?,?)");  // ?,? = positional parameters
			ps.setString(1, my_name);
			ps.setString(2, my_email);
			ps.setString(3, my_password);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				
				PrintWriter out = resp.getWriter();
				
				resp.setContentType("text/html");
				out.print("<h3>Successfully Registered</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			} 
			else {
				PrintWriter out = resp.getWriter();
				
				resp.setContentType("text/html");
				out.print("<h3>Uncessfully Register</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		*/
				
	}

}
