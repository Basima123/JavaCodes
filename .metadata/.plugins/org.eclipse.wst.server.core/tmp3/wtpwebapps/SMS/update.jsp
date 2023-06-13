<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.lang.*" %>	
<%@ page import=" com.sms.dto.StudentDTO "%>
<!DOCTYPE html>
<html>
<head>
<title>Update</title>
</head>
<%StudentDTO dto=new StudentDTO();
if(session.getAttribute("list")!= null)
{
	dto=(StudentDTO)session.getAttribute("list");
}
else
	System.out.println("List is empty");
%>
<body style="background-color: #AEA1B9">
	<h1>Update</h1>
	<form action="home.jsp" method="post" style="background-color:">
		<input type="submit" name="back" value="BACK">
	</form>
	<br>
	<br>
	<form action="UpdateController" method="post">
		<table border="1">
			<tr>
				<td><label>Id</label></td>
				<td><input type="number" id="id" name="id" value=<%=dto.getId()%>></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" id="name" name="name" value=<%=dto.getName() %>></td>
			</tr>
			<tr>
				<td><label>DOB</label></td>
				<td><input type="date" id="dob" name="dob"
					placeholder=yyyy/mm/dd value=<%=dto.getDob() %> ></td>
			</tr>
			<tr>
				<td><label>Address</label>
				<td><textarea id="address" name="address" rows="3" cols="12"><%=dto.getAddress() %></textarea>
				</td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				
				<td><input type="radio" id="gender" name="gender" value="Male" 
				<%if(dto.getGender()!=null && dto.getGender().equalsIgnoreCase("male")){ %> checked <%} %>>Male
					<input type="radio" id="gender" name="gender" value="Female"
					<%if(dto.getGender()!=null && dto.getGender().equalsIgnoreCase("female")){ %> checked  <%} %>>Female
				</td>
			</tr>
			<tr>
				<td><label>Language</label></td>
				<td><input type="checkbox" id="lan" name="lan" value="English" 
				<%if(dto.getLanguage()!=null &&  dto.getLanguage().contains("English")){ %> checked  <%} %>>English
					<input type="checkbox" id="lan" name="lan" value="Tamil"
					<%if(dto.getLanguage()!=null && dto.getLanguage().contains("Tamil")){ %> checked  <%} %>>Tamil
					<input type="checkbox" id="lan" name="lan" value="Malay"
					<%if(dto.getLanguage()!=null && dto.getLanguage().contains("Malay")){ %> checked  <%} %>>Malay
					<input type="checkbox" id="lan" name="lan" value="Mandarin"
					<%if(dto.getLanguage()!=null && dto.getLanguage().contains("Mandarin")){ %> checked  <%} %>>Mandarin
				</td>
			</tr>
			<tr>
				<td><label>User Name</label></td>
				<td><input type="text" id="uname" name="uname" value=<%=dto.getUserName() %>></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" id="password" name="password" value=<%=dto.getPassword() %>>
				</td>
			</tr>
			<tr>
				<td>Access</td>
				<td><select name="access" id="access" name="access">
						<option value="user"
						<%if(dto.getAccess()!=null && dto.getAccess().equalsIgnoreCase("user")){ %> selected
						<%} %>>User</option>
						<option value="admin" 
						<%if(dto.getAccess()!=null && dto.getAccess().equalsIgnoreCase("Admin")){ %> selected <%} %>>Admin</option>
				</select>
			</tr>
			<tr align="center">
				<td colspan="2">
				<input type="submit" name="buttonAction" value="UPDATE"> 
				<input type="submit" name="Edit" value="EDIT">
				<input type="submit" name="buttonAction" value="VIEW"></td>
			</tr>
		</table>
	</form>
</body>
</html>