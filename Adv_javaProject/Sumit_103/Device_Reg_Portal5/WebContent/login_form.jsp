<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<script type="text/javascript">
function dovalidations(){

		var username = document.getElementById("username").value;
		
		if(parseInt(username.length) < 4){
			alert("Please provide valid Character atleast 4 Character");
			return false;
		} 
		 if(!isNaN(username)){
				document.getElementById('username').innerHTML =" Invalid Credential";
				return false;
			}
		 var password = document.getElementById("password").value;
		if(parseInt(password.length) < 6)
		{
			alert("Enter a Valid Password");
			return false;
		} 
		
		return true;
	}
	
</script>


</head>
<body style="background-color: AliceBlue; background-image: url('${pageContext.request.contextPath}/resources/image/2.jpeg'); opacity: 1; " >
<!-- 	
<h1 style="color: black; float:center;  font-family:cursive;">N-lab Device Registration Portal</h1>
 -->	
 
 
	<div style="display: flex; margin-top:40px; justify-content:center; align-items:center; ">
	<spr:form action="login.htm" method="post" commandName="device" onsubmit="return dovalidations()">
	<div style="align-items: center; text-align: center; justify-content: center; 
	border: 2px solid ; border-color:black;
	padding:80px;
	opacity:1;
	box-shadow:0px 3px 7px 3px black;
	background:white;
	">
		<h1 style="color: black">Login</h1><br>
		
				<label style="color: black;" >User Name:</label><br><br>
			
				<spr:input path="userName" id="username" /><br><br>
		
				<label style="color: black;" >Password:</label><br><br>
			
				<spr:password path="userPass"  id="password" /><br><br>
				
				
				<input type="submit" style="font-size: 20px;"  value="Login" ><br><br>
			<div>
				<a href="prep_reg_form.htm" style="text-decoration: none; color:tomato;">New User? Register </a><br>	
				<a href="prep_forgot_form.htm" style=" text-decoration: none;">Forgot Password</a><br>
			
			</div>
			<a href="forgot_password.html" style="text-decoration: none;" >Get Update By Email </a>
			
							
		</div>
	</spr:form>
	</div>
</body>
</html>