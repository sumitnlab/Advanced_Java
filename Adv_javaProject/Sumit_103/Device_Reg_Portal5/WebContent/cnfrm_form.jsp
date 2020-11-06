<%@page import="com.dev.dto.Device"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			List<Device> ulist = (List<Device>)request.getAttribute("device");
			for(Device id : ulist){	
		%>
		
     	<div style="display: flex; align-items: center;justify-content: center;">
     	<div style="float: inherit;"><h2>Are You Sure ?</h2></div><br><br>
		<div><a href="prep_reset_form.htm?userId=<%=id.getUserId()%>"> Yes </a>
		</div>
		<% } %>
			<div><a href="login_form" style="text-decoration: none;">No</a></div>     	
     	</div>
	
</body>
</html>