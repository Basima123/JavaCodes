<%@page import="com.reg.dto.RegDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import=""%>
<head>
<meta charset="ISO-8859-1">
<%
RegDTO r = new RegDTO();
if (session.getAttribute("login") != null) {
	r = (RegDTO) session.getAttribute("login");
} else {
	r = new RegDTO();

}
%>
<title>update</title>
</head>
<body style="background-color: #CCC9F8">
	<h2 align="center">Registration</h2>
	<form action="UpdateController" method="post">
		<table style="background-color: #E5E0ED" border="1">
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" id="name" name="name"
					value=<%=r.getName()%>></td>
			</tr>
			<tr>
				<td><label>Age</label></td>
				<td><input type="number" id="age" name="age"
					value=<%=r.getAge()%>></td>
			</tr>
			<tr>
				<td><label>Date of Birth</label></td>
				<td><input type="date" id="date" name="date"
					value=<%=r.getDate()%> placeholder="DD-MM-YYYY"></td>
			</tr>
			<tr>
				<td><label>Language</label></td>
				<td><input type="checkbox" name="lang" value="english"
					<%if (r.getLang() != null && r.getLang().contains("english")) {%>
					checked <%}%>>English <input type="checkbox" name="lang"
					value="tamil"
					<%if (r.getLang() != null && r.getLang().contains("tamil")) {%>
					checked <%}%>>Tamil <input type="checkbox" name="lang"
					value="malay"
					<%if (r.getLang() != null && r.getLang().contains("malay")) {%>
					checked <%}%>>Malay <input type="checkbox" name="lang"
					value="chinese"
					<%if (r.getLang() != null && r.getLang().contains("chinese")) {%>
					checked <%}%>>Chinese</td>
			</tr>
			<tr>
				<td><label>Gender</label></td>

				<td><input type="radio" id="gender" name="gender" value="male">
					<%
					if (r.getGender() != null && r.getGender().equalsIgnoreCase("male")) {
					%>checked<%
					}
					%>Male <input type="radio" id="gender" name="gender" value="female"
					<%if (r.getGender() != null && r.getGender().equalsIgnoreCase("female")) {%>
					checked <%}%>> Female</td>
			<tr>
				<td><label>User Name</label></td>
				<td><input type="text" id="uname" name="uname"
					value=<%=r.getUname()%>></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" id="password" name="password"
					value=<%=r.getPassword()%>></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="email" id="email" name="email"
					value=<%=r.getEmail()%>></td>
			</tr>
			<tr>
				<td><label>Contact</label></td>
				<td><input type="tel" id="contact" name="contact"
					value=<%=r.getContact() %>></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><textarea id="address" rows="3" cols="15" name="address"
						<%=r.getAddress()%>></textarea></td>
			</tr>
			<tr>
				<td><label>Type</label></td>
				<td><select name="type" id="type">
						<option value="user"
							<%if (r.getType() != null && r.getType().contains("user")) {%>
							selected <%}%>>user</option>
						<option value="admin"
							<%if (r.getType() != null && r.getType().contains("admin")) {%>
							selected <%}%>>admin</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="buttonAction" value="Update">&nbsp;&nbsp;
					<input type="submit" name="buttonAction" value="Edit" onclick="edit();">&nbsp;&nbsp;
					<input type="submit" name="buttonAction" value="View"></td>
			</tr>
		</table>
	</form>

</body>
</html>