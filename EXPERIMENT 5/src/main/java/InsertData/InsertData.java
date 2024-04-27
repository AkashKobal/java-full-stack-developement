package InsertData;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{ 
		    Class.forName("com.mysql.jdbc.Driver"); 
		    Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3308/module2","root","Akash@123"); 
		    PreparedStatement st = con.prepareStatement("insert into studentMarks values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		    
		    
		     st.setInt(1, Integer.valueOf(request.getParameter("rollno")));
		     st.setString(2, request.getParameter("name"));
		     st.setString(3, request.getParameter("section"));
		     st.setInt(4, Integer.valueOf(request.getParameter("sub1")));
		     st.setInt(5, Integer.valueOf(request.getParameter("sub2")));
		     st.setInt(6, Integer.valueOf(request.getParameter("sub3")));
		     st.setInt(7, Integer.valueOf(request.getParameter("sub4")));
		     st.setInt(8, Integer.valueOf(request.getParameter("sub5")));
		     st.setInt(9, Integer.valueOf(request.getParameter("sub6")));
		     st.setInt(10, Integer.valueOf(request.getParameter("lab1")));
		     st.setInt(11, Integer.valueOf(request.getParameter("lab2")));
		     
		     st.executeUpdate();
		     st.close();
		     con.close(); 
		     PrintWriter out = response.getWriter();
		     out.println("<html><body><b>Successfully Inserted"
		     + "</b></body></html>");
		}catch(Exception e){
		      System.out.println(e);} 
		}
		}

