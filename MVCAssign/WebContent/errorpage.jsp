<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ page isErrorPage="true" %>
     
     <%@ include file="login.jsp" %>
  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1> <%= exception.getMessage() %></h1>
  
 

</body>
</html>