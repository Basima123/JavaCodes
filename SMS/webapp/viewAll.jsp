<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="com.sms.dto.StudentDTO"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>




<meta charset="ISO-8859-1">
<title>view all</title>
<style>
table, td, th {
	border: 1px solid;
}

table {
	width: 100%;
	border-collapse: collapse;
}
</style>
</head>

<%
SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
if (session.getAttribute("list") != null) {
	list = (ArrayList<StudentDTO>) session.getAttribute("list");
}
else
	System.out.println("List is null");
%>
<body>
	<h2 align="center">Student Details</h2>
	<form action="home.jsp" method="post" style="background-color:">
		<input type="submit" name="back" value="BACK">
	</form>
	<br>
	<br>
	<form action="ViewAllController" method="get">
	
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>DOB</th>
				<th>Address</th>
				<th>Gender</th>
				<th>Language</th>
				<th>User Name</th>
				<th>Password</th>
				<th>Access</th>
			</tr>
			<%
			for (StudentDTO dto : list) {
			%>
			<tr><td><%=dto.getId()%></td>
				<td><%=dto.getName()%></td>
				<td><%=formatter.format(dto.getDob())%></td>
				<td><%=dto.getAddress() %></td>
				<td><%=dto.getGender() %></td>
				<td><%=dto.getLanguage() %></td>
				<td><%=dto.getUserName() %></td>
				<td><%=dto.getPassword() %></td>
				<td><%=dto.getAccess() %></td>
				<%
				}
				%>
			</tr>
		</table>
		</form>
</body>
</html>