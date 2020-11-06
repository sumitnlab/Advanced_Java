<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<header style="
  color: black;
  text-align: center;
  padding: 25px;
  text-decoration: none;
  font-size: 20px;
  line-height: 18px;
  border-radius: 3px;
  background-color: skyblue" >
  
  <div style="float: left; height: 40px; color: white; margin-top:10px;"></div>
  <h1 style="color: black; float:center; text-align: center; font-family:cursive;">Welcome to N-lab Device Registration Portal</h1>
  <a style="text-decoration:none; float: right; margin-left:20px;" href="prep_reg_form.htm" >Sign up</a>
  <a style="text-decoration:none; float: right;" href="prep_log_form.htm" >Sign In</a></option>
  </header>
  <marquee>Device Registration Portal (DRP)
		With the Device Registration Portal (DRP), 
		register and track mobile and portable devices connected to your internal network.</marquee>
  <p style="font-family:  Times New Roman; font-style:italic; font-size:30px; color:tomato"> University Networking & Infrastructure (UNI) utilizes the Dynamic Host Configuration Protocol (DHCP) to manage the IP addresses across campus. 
  All computers on campus must be registered through our DHCP N-lab Device Registration Portal application.</p>
  
  <h2>To Register Your Device Login First</h2>
  <div>Instructions</div>
  <ol style="font-family: bold; font-size: 23px;">
  	
	  <li>You can Add Device to see Details for Future purpose</li>
	  <li>You can Update it Anytime and Anywhere</li>
	  <li>Also You can Delete it!!!!</li>
  </ol>
  
 <% session.invalidate(); %>
</body>
</html>