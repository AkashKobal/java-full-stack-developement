<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration Form</h1>
<form action="register" method="post">
<input type="text" name="name" placeholder="Enter Name" required><br><br>
<input type="text" name="email" placeholder="Enter Email" required><br><br>
<input type="text" name="phone" placeholder="Enter Phone" required><br><br>
<textarea name="address" placeholder="Enter Address" required></textarea><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>