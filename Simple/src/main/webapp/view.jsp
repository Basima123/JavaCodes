<%@page import="java.net.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.simple.dto.SimpleDTO"%>
<html>
<% SimpleDTO dto=new SimpleDTO();
if (session.getAttribute("view") != null) {
	dto = (SimpleDTO) session.getAttribute("view");
} 

%>
<head>
<meta charset="ISO-8859-1">
<title>view</title>
</head>
<body>
<form action="">
<table>
<tr><td>User Name</td><td>Password</td></tr>
<tr><td><%=dto.getName() %></td><td><%=dto.getPassword() %></td></tr>
</table>
</form>
</body>
</html>