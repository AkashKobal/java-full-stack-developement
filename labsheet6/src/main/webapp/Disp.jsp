<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<%
try {
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/god","root","Akash@123");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from employee");
%>
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
<tr><th>E.No</th><th>Name</th><th>Gender</th><th>Department</th><th>Salary</th><tr>
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getInt(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
<TD><%=rs.getFloat(5)%></TD>
</TR>
<% } %>
<%
// close all the connections.
rs.close();
st.close();
con.close();
} catch (Exception ex) {
%>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}
%>
</TABLE><TABLE>
<TR>
<TD><FORM ACTION="disp.jsp" method="get" >
<button type="submit"><-- back</button></TD>
</TR>
</TABLE>
</font>
</body>
</html>
