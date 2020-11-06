<%@page import="com.dev.dto.Device"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="com.dev.dto.Device"%>
<%@ include file="cache_control.jsp" %>
<%
	Device user = (Device)session.getAttribute("user");
	String userName = "", profilePic = "";
	if(user!=null){
		userName = user.getUserName();
		profilePic = user.getProfilePic();
	}
%>    
<%	
	Device device = (Device)session.getAttribute("device");
	if(device !=null && device.getUserId()>0)
	{

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body style=" background-repeat:repeat-x;
background-image: url('${pageContext.request.contextPath}/resources/image/homeback1.jpg'); opacity: 1; " >
<!-- session <% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); %>
 -->

<header style="
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 20px;
  line-height: 35px;
  border-radius: 4px">
	<h1 style="color:white; float:center; text-align: center; font-family:cursive;">Welcome to N-lab Device Registration Portal</h1>
	<hr>
	<img alt="upload profile" src="<%="images"+profilePic%>" height="150" width="150" >
	
	<div style=" display: flex; justify-content: space-between; align-items: center;">
		
		<div style="padding-left: 20px; justify-content: space-between;">
		
		<a href="prep_device_add_form.htm" style="color:white; text-decoration: none;">Add Device</a></div>
		
		<a href="view_device.htm" style="color:white; text-decoration: none;" >View Your Device</a>
		
		<a href="view_device.htm" style="color:white; text-decoration: none;" >Delete Device</a> 
		
		<a href="logout.jsp" style="color:white; text-decoration: none;">Logout</a>
		
		<a href="file_upload_form.html"style="color:white; text-decoration: none;" >File Upload</a>
		
	</div>
	
	</header>
		<h1 style="font-family:cursive;"> Welcome <%=(session.getAttribute("device")!=null) ? ((Device)session.getAttribute("device")).getUserName() : "Error" %> </h1>
	 
	<table>
	<tr><td>&nbsp;&nbsp;</td></tr>
	</table>
</body>
</html>
<% 
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>