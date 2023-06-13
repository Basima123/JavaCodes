<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.simple.dto.SimpleDTO"%>
<%@page import="java.util.*"%>
<html>
<% 
ArrayList<SimpleDTO> list=new ArrayList<SimpleDTO>();
if (session.getAttribute("list") != null) {
	list = (ArrayList<SimpleDTO>) session.getAttribute("list");
} 

%>
<head>
<meta charset="ISO-8859-1">
<title>VIEW ALL</title>
</head>
<body>
<table>
<tr><td>User Name</td><td>Password</td></tr>
<% for(SimpleDTO dto:list) 
{%>
<tr><td><%=dto.getName() %></td><td><%=dto.getPassword() %></td></tr>
<%} %>
</table>
</body>
</html>