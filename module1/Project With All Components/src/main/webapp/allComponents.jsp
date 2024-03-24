<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Components</h1>
<form action="allCompo" method="post">
<input type="text" name = "name" placeholder="Name :" ><br><br>
<input type="text" name = "rollNo" placeholder="Roll No :" ><br><br>
<input type="email" name = "email" placeholder="Email :" ><br><br>
<input type="password" name = "password" placeholder="Password :" ><br><br>
<input type="date" name = "dob" placeholder="DOB : "><br><br>
<input type="number" name="phoneNo" placeholder="Phone No. :"><br><br>
<input type="radio" name = "gender" value="Male"> Male
<input type="radio" name ="gender" value="Female">Female<br><br>
<textarea name="address" rows="3" cols="15" placeholder="Address :"></textarea> <br><br>
<input type="submit" value="Submit">
</form>

</body>
</html>