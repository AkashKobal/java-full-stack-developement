package allCompo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/allCompo")
public class allCompo extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("name");
		String rollNo = req.getParameter("rollNo");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String phoneNo = req.getParameter("phoneNo");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		
		/*
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Student Info</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Student Information</h1>");
		out.print("<p>Name: "+name+"</p>");
		out.print("<p>Roll No: "+rollNo+"</p>");
		out.print("<p>Email: "+email+"</p>");
		out.print("<p>Password: "+password+"</p>");
		out.print("<p>Date of Birth: "+dob+"</p>");
		out.print("<p>Phone No: "+phoneNo+"</p>");
		out.print("<p>Gender :"+gender+"</p>");
		out.print("<p>Address: "+address+"</p>");
		*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/allCompo", "root", "Akash@123");
			PreparedStatement ps = con.prepareStatement("insert into allCompo values(?,?,?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,rollNo);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.setString(5,dob);
			ps.setString(6,phoneNo);
			ps.setString(7,gender);
			ps.setString(8,address);
			
			ps.executeUpdate();
			out.print("<p>Data Inserted Successfully</p>");

			
			
		}
		catch (Exception e) {
			System.out.println("Error: " + e);
	
		}
		
		
		
	}


}

/*
create database allCompo;

use allCompo;

create table allCompo(name varchar(255),rollNo varchar(255),email varchar(255),password varchar(255),dob varchar(
255),phoneNo varchar(255),gender varchar(255),address varchar(255));

select * from allCompo;

 */
