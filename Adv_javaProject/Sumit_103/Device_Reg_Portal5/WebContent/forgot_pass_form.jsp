<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:LightGrey;">
	<div style="display: flex; justify-content: center; align-items: center; margin-top: 150px;
	padding: 40px; text-align: center; background-image: url('');">
		<spr:form action="forgot.htm" method="post" commandName="device" >
	<table align="center" >
		<tr>
			<td style="font-size:20px;">Email:</td>
			<td>
				<spr:input path="Email"/><br>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="index.jsp" style="text-decoration: none;" >Back</a><br><br>
			</td>
			<td>
				<input type="submit"  value="Next" ><br><br>
			</td>
		</tr>
	</table>
	</spr:form>
		
	</div>
</body>
</html>