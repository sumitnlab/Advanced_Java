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
	<spr:form action="device_add.htm" method="post" commandName="deviceDetails" >
	<table align="center" class="styled-table">
	
		<tr>
		
			<td>
				custName:
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
				Mobile:
			</td>
			<td>
				<spr:input path="Mobile"/>
			</td>
		</tr>
		<tr>
			<td>
				modelNo:
			</td>
			<td>
				<spr:input path="modelNo"/>
			</td>
		</tr>
		<tr>
			<td>
				imeiNo:
			</td>
			<td>
				<spr:input path="imeiNo"/>
			</td>
		</tr>
		<tr>
			<td>
				uidaiNo:
			</td>
			<td>
				<spr:input path="uidaiNo"/>
			</td>
		</tr>
		<tr>
			<td>
				company:
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
				price:
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
</body>
</html>