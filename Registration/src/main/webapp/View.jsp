<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.reg.dto.RegDTO" %>
	<%@ page import="java.lang.*" %>
	<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<% 
List<RegDTO> list=new ArrayList<RegDTO>();
if(session.getAttribute("list")!=null)
{
list=(ArrayList<RegDTO>)session.getAttribute("list");	
}
else
{
	
}
%>

<title>View</title>
</head>
<body style="background-color: #CCC9F8">
	<h2 align="center">Registration</h2>
	<form action="ViewController" method="post">
		<table style="background-color: #E5E0ED" border="1">
			<tr>
				<td><label>Name </label></td>
				<td>Age</td>
				<td>Date Of Birth</td>
				<td>Language</td>
				<td>Gender</td>
				<td>User Name</td>
				<td>Password</td>
				<td>Email</td>
				<td>Contact</td>
				<td>Address</td>
				<td>Type</td>
			</tr>
			<% for(RegDTO r:list){ %>
			<tr>
			<td><input type="checkbox" name="rowkey" id="rowkey" value=<%= r.getUname() %>></td>
				<td><label><%=r.getName() %> </label></td>
				<td><%=r.getAge() %></td>
				<td><%=r.getDate() %>></td>
				<td><%=r.getLang() %></td>
				<td><%=r.getGender() %></td>
				<td><%=r.getUname() %></td>
				<td><%=r.getPassword() %></td>
				<td><%=r.getEmail() %></td>
				<td><%=r.getContact() %></td>
				<td><%=r.getAddress() %></td>
				<td><%=r.getType() %></td>
				<td><a href="delete?Uname="<%=r.getUname() %>>Delete</a></td>
				<%} %>
			</tr>
		</table>
	</form>
</body>
</html>