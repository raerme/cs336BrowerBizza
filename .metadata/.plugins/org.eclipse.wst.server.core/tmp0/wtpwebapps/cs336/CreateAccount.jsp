<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User Account</title>
</head>
<body>
Create User Account
<br>

<form action = "CreateAccountController" method = "POST">
	First Name: <input type = "text" name = "fname">
	<br>
	Last Name: <input type = "text" name = "lname">
	<br>
	Username: <input type = "text" name = "username">
	<br>
	Password: <input type = "text" name = "password">
	<br>
	<br>
	
<input type = "submit" value = "Create Account">
<br>
<a href="Login.jsp">Return to Login Page</a>
<br>
</form>



</body>
</html>