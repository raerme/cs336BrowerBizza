<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<h1>Brower Bizza Group Login</h1>

Please enter username and password:
<br>

<form method = "post" action = "LoginController">
	Username: <input type = "text" name = "username">
	<br>
	Password: <input type = "password" name = "password">
	<br>
	
	<input type = "submit" name="action" value = "Log In">
	<br>
	<input type = "submit" name="action" value = "Create New Account">
	
</form>

<br>

</body>
</html>