<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.customer.dto.customerDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view customer Details</title>
</head>
<body>
	<%
	customerDTO customer = (customerDTO) request.getAttribute("cust");
	%>


	<table>
		<tr>
			<td colspan="2" align="center">welcome <%=customer.getName() + "!!" %></td>
		<tr>
			<td>Name :</td>
			<td><%=customer.getName()%></td>
		</tr>
		<tr>
			<td>Address :</td>
			<td><%=customer.getAddress()%></td>

		</tr>
		<tr>
			<td>contact :</td>
			<td><%=customer.getContact()%></td>
		</tr>
		<tr>
			<td>Email Id :</td>
			<td><%=customer.getEmail()%></td>
		</tr>

	</table>
</body>
</html>