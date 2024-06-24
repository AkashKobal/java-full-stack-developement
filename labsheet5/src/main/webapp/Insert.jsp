<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form action="./InsertData" method="post"><br>
<input type="text" name="rollno" placeholder="Roll No:"/><br>
<input type="text" name="name" placeholder="Enter Name:"/><br>

Enter Section:<select name="section"> <br>
<option>A</option> 
<option>B</option> 
<option>C</option> 
<option>D</option>
</select><br> 
<input type="text" name="sub1" placeholder="Enter Subject 1 Mark:"/><br>
<input type="text" name="sub2" placeholder="Enter Subject 2 Mark:"/><br>
<input type="text" name="sub3" placeholder="Enter Subject 3 Mark:"/><br>
<input type="text" name="sub4" placeholder="Enter Subject 4 Mark:"/><br>
<input type="text" name="sub5" placeholder="Enter Subject 5 Mark:"/><br>
<input type="text" name="sub6" placeholder="Enter Subject 6 Mark:"/><br>
<input type="text" name="lab1" placeholder="Enter Lab 1 Mark:"/><br>
<input type="text" name="lab2" placeholder="Enter Lab 2 Mark:"/><br>
<input type="submit"/><br>
</form>
</body>
</html>
