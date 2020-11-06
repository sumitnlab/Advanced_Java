<%@page import="com.dev.dto.Device"%>
<%@ include file="Cache-Control.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link src="common.jsp">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body style=" background-repeat:repeat-x;
background-image: url('${pageContext.request.contextPath}/resources/image/homeback1.jpg'); opacity: 1; " >

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
	<div style=" display: flex; justify-content: space-between; align-items: center;">
		<div style="padding-left: 20px; justify-content: space-between;">
		<a href="prep_device_add_form.htm" style="color:white; text-decoration: none;">Add Device</a></div>
		<a href="view_device.htm" style="color:white; text-decoration: none;" >View Your Device</a>
		<!--  <a href="view_device.htm" style="color:white; text-decoration: none;" >Delete Device</a> -->
		<a href="index.jsp" style="color:white; text-decoration: none;">Logout</a>
		
	</div>
	
	</header>
	<h1 style="font-family:cursive;"> Welcome <%=(session.getAttribute("device")!=null) ? ((Device)session.getAttribute("device")).getUserName() : "!!!!!!!!" %> </h1>
	
	<table>
	<tr><td>&nbsp;&nbsp;</td></tr>
	</table>
		<spr:form>
		<input type="hidden" id="userId" path="userId">
		</spr:form>
	 <% session.invalidate(); %>
	
</body>
</html>