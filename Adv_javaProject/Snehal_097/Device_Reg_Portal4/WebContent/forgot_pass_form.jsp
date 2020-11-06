<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<link src="common.jsp">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spr:form action="forgot.htm" method="post" commandName="device" >
	<table align="center" >
		<tr>
			<td>Email:</td>
			<td>
				<spr:input path="Email"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Next" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>