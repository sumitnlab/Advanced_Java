<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Device Form</title>

</head>
<body>
	<div style="">
		<spr:form action="device_add.htm" method="post" commandName="deviceDetails" >
	<table align="center" class="styled-table">
	
		<tr>
			<td>
				CustomerName:
			</td>
			<td>
				<spr:input path="custName"/>
			</td>
		</tr> 	
		 <tr>
			<td>
				ModelName:
			</td>
			<td>
				<spr:input path="modelName"/>
			</td>
		</tr> 
		<tr>
			<td>
				PurchaseDate:
			</td>
			<td>
				<spr:input path="purchaseDate"/>
			</td>
		</tr>
		<tr>
			<td>
				Phone:
			</td>
			<td>
				<spr:input path="Mobile"/>
			</td>
		</tr>
		<tr>
			<td>
				ModelNo:
			</td>
			<td>
				<spr:input path="modelNo"/>
			</td>
		</tr>
		<tr>
			<td>
				IMEI No:
			</td>
			<td>
				<spr:input path="imeiNo"/>
			</td>
		</tr>
		<tr>
			<td>
				UIDAI No:
			</td>
			<td>
				<spr:input path="uidaiNo"/>
			</td>
		</tr>
		<tr>
			<td>
				Company:
			</td>
			<td>
				<spr:input path="company"/>
			</td>
		</tr>
		<tr>
			<td>
				Email:
			</td>
			<td>
				<spr:input path="Email"/>
			</td>
		</tr>
		<tr>
			<td>
				Price:
			</td>
			<td>
				<spr:input path="price"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.jsp">Back</a>
			</td>
			<td>
				<input type="submit"  value="Add" >
			</td>
		</tr>
	</table>
	</spr:form>
	</div>
</body>
</html>