<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.sms.dto.StudentDTO"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
<style type="text/css">
table{
width:100%;
border: 1px solid;
border-collapse:collapse;
}
th,td{
border-collapse:collapse;
border: 1px solid;
}

</style>
</head>


<%
SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
StudentDTO dto = new StudentDTO();
if (session.getAttribute("list") != null) {
	dto = (StudentDTO) session.getAttribute("list");
} else
	System.out.println("Invalid ID");
%>

<body>
	<h2 align="center">Student Details</h2>
	<form action="home.jsp" method="post" style="background-color:">
		<input type="submit" name="back" value="BACK">
	</form>
	<br>
	<br>
	<form action="ViewController" method="get">

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

			<tr align="center">
				<td><%=dto.getId()%></td>
				<td><%=dto.getName()%></td>
				<td><%=formatter.format(dto.getDob())%></td>
				<td><%=dto.getAddress()%></td>
				<td><%=dto.getGender()%></td>
				<td><%=dto.getLanguage()%></td>
				<td><%=dto.getUserName()%></td>
				<td><%=dto.getPassword()%></td>
				<td><%=dto.getAccess()%></td>
			</tr>

		</table>
	</form>

</body>
</html>