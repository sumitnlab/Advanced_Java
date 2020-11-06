<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
	<spr:form action="device_update.htm" method="post" commandName="deviceDetails" >
	<table align="center">
	
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
			<td>
				<spr:input path="userId"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="view_device.htm">Back</a>
			</td>
			<td>
				<input type="submit"  value="Update" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>