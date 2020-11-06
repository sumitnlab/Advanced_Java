<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('${pageContext.request.contextPath}/resources/image/2.jpg'); opacity: 1; " >
	<div style="display: flex; margin-top:75px; justify-content:center; align-items:center; ">
	
	
	<spr:form action="reset.htm" method="post" commandName="device" >
	<div  style="align-items: center; text-align: center; justify-content: center; 
	border: 4px solid ; border-color:black;
	padding:60px;
	box-shadow:0px 3px 7px 3px black;
	background:white;
	">
		<table align="center" >
		<tr>
			
			<td>
				<spr:hidden path="userId"/>
			</td>
		</tr>
	
		<tr>
			<td>Enter Password:</td>
			<td>
				<spr:password path="userPass"/>
			</td>
		</tr>
		<tr>
			<td>Re-Enter Password:</td>
			<td>
				<input type="userPass"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" >Cancle</a>
			</td>
			<td>
				<input type="submit"  value="Reset" >
			</td>
		</tr>
	</table>
	</div>
	</spr:form>
	</div>
</body>
</html>