<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action ="reg.jsp" method="post">
    	FullName : <input type = "text" name = "fullname"><br>
   	UserName : <input type = "text" name = "username"><br> 
   	Password : <input type = "text" name = "password"><br>
   	<input type ="submit" value = "Register">
   	<a href="login.jsp">Login</a>
   </form>
</body>
</html>