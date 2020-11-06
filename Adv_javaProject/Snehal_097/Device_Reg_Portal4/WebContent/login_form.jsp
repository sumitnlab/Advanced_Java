<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<script type="text/javascript">

</script>
</head>
<body style="background-color: AliceBlue; background-image: url('${pageContext.request.contextPath}/resources/image/2.jpeg'); opacity: 1; " >
	<h1 style="color: black; float:center;  font-family:cursive;">N-lab Device Registration Portal</h1>
	
	<div style="display: flex; margin-top:45px; justify-content:center; align-items:center; ">
	<spr:form action="login.htm" method="post" commandName="device" >
	<div style="align-items: center; text-align: center; justify-content: center; 
	border: 2px solid ; border-color:black;
	padding:50px;
	box-shadow:0px 3px 7px 3px black;
	background:white;
	">
		<h1 style="color: Tomato">Login Here</h1><br>
		
				<label style="color: red;">User Name:</label><br>
			
				<spr:input path="userName" id="userName"/><br><br>
		
				<label style="color: red;">Password:</label><br>
			
				<spr:password path="userPass" id="userPass"/><br><br>
				
				<a href="index.jsp" >Back to Sign In</a><br><br>
				
				
			
				
				 <input type="submit"  value="Login" ><br>
				<a href="prep_reg_form.htm" >New User</a><br>
					
				
			<a href="prep_forgot_form.htm" >Forgot Password</a><br>
			
				<a href="forgot_password.html" >Mail_send </a>
			
				
			
							
		</div>
	</spr:form>
	  
	  
	  
	</div>
</body>
</html>