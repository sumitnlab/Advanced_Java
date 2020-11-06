<%@page import="com.dev.dto.DeviceDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Product List Form</title>

</head>
<body>
	<div class="Container">
			<table align="center">
		<% 
		List<DeviceDetails> elist = (List<DeviceDetails>)request.getAttribute("expList");
		for(DeviceDetails exp : elist){
		%>
		<tr>
			<td>
				<%=exp.getCustName()%>
			</td>
			<td>
				<%=exp.getCompany()%>
			</td>
			<td>
				<%=exp.getImeiNo()%>
			</td>
			<td>
				<%=exp.getMobile()%>
			</td>
			<td>
				<%=exp.getModelName()%>
			</td>
			<td>
				<%=exp.getEmail()%>
			</td>
			<td>
				<%=exp.getModelNo()%>
			</td>
			<td>
				<%=exp.getPurchaseDate()%>
			</td>
			<td>
				<%=exp.getUidaiNo()%>
			</td>
			<td>
				<spr:input path="userId"/>
			</td>
			
			<td>
				<a href="device_delete.htm?deviceId=<%=exp.getDeviceId()%>">Delete</a>
			</td>
			<td>
				<a href="device_update_form.htm?deviceId=<%=exp.getDeviceId()%>">Update</a>
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	
	
	</div>
	
</body>
</html>