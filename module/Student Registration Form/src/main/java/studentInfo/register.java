package studentInfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNo = req.getParameter("phone");
		String address = req.getParameter("address");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/module1", "root", "Akash@123");
			PreparedStatement ps = con.prepareStatement("insert into StudentRegistrationForm values(?,?,?,?)");
			
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,phoneNo);
			ps.setString(4,address);
			
			int count = ps.executeUpdate();
			if (count > 0) {
				resp.setContentType("text/html");
				resp.getWriter().println("<h3>Data Inserted Successfully</h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
			} else {
				resp.setContentType("text/html");
				resp.getWriter().println("<h3>Data Inserted UnSuccessfully</h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
			}
			
			
			
			
		}
		catch (Exception e) {
			System.out.println("Error: " + e);
			resp.setContentType("text/html");
			resp.getWriter().println("<h3>Data Inserted UnSuccessfully</h3>");

			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.include(req, resp);
		}
		
	}
	

}
/*
 create database module1;
 use module1;
 create table StudentRegistrationForm(name varchar(50), email varchar(50), phone varchar(50), address varchar(50));
 select * from StudentRegistrationForm;
 */
