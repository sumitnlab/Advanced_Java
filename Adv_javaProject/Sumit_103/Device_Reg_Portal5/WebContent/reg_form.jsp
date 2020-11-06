<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<script type="text/javascript">
function dovalidations(){

		var username = document.getElementById("username").value;
		if(parseInt(username.length) < 4){
			alert("Please provide valid Character atleast 4 char");
			return false;
		} 
		 if(!isNaN(username)){
				document.getElementById('username').innerHTML =" ** only characters are allowed";
				return false;
			}
		 var password = document.getElementById("password").value;
		if(parseInt(password.length) < 6)
		{
			alert("Please provide valid password atleast 6 digit");
			return false;
		} 
		var email = document.getElementById("email").value;
		if(parseInt(email.length) < 6){
				alert("Enter Proper Email Address");
				return false;
			}
		
		return true;
	}
	
</script>

</head>
<body style="background-color: LightGrey;
	background-color: AliceBlue; background-image: url('${pageContext.request.contextPath}/resources/image/2.jpeg');">
	<h1 style="color: black; float:center; text-align: center; font-family:cursive;">N-lab Device Registration Portal</h1>
	
	<div style="display: flex; margin-top:75px; justify-content:center; align-items:center; ">
	<spr:form action="reg.htm" method="post" commandName="device" onsubmit="return dovalidations()" >
	<div style="align-items: center; text-align: center; justify-content: center; 
	border: 4px solid ; border-color:black;
	padding:60px;
	box-shadow:0px 3px 7px 3px black;
	background:white;
	">
	<table align="center" >
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:input path="userName" id="username"  />
			</td>
		</tr>
		
		<tr>
			<td>
				Email:
			</td>
			<td>
				<spr:input path="email" id="email" />
			</td>
		</tr>
		<tr>
			<td>
				Password:
			</td>
			<td>
				<spr:password path="userPass" id="password"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" style="text-decoration: none;" >Back</a><br>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</div>
	</spr:form>
	</div>
	
</body>
</html>