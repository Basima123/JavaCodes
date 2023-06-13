<!DOCTYPE html>
<%@page import="com.dto.User"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.*"%>
<%

User u = new User();

if (session.getAttribute("user") != null) {
	u = (User) session.getAttribute("user");

	System.out.println("user detail :" + u.toString());
} else {
	u = new User("","",new Date(),"","","","","","","","");
	System.out.println("empty");
}

%>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>


</head>

<body>

	<form action="SignUp" method="get">
	<script type="text/javascript">
function validFom()
{
	alert('hi')
	var name=document.getElementById("name").value;
	
	if(name=='')
		{
		alert('please enter valid name');
		return false;
		}
	else
		{
		return true;
		}
	}
</script>
		<table>
			<tr>
				<td colspan="2">Register Form</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" id="name"
					value=<%=u.getName()%>></td>
			</tr>
			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input type="number" name="age" id="age"
					value=<%=u.getAge()%>></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td>:</td>
				<td><input type="date" name="dob" id="dob"
					value=<%=u.getDob()%>></td>
			</tr>
			<tr>
				<td>Language Known</td>
				<td>:</td>
				<td><input type="checkbox" name="lang" id="lang" value="Tamil"
					<%if (u.getLang() != null && u.getLang().contains("Tamil")) {%>
					checked <%}%>>Tamil <input type="checkbox" name="lang"
					id="lang" value="English"
					<%if (u.getLang() != null && u.getLang().contains("English")) {%>
					checked <%}%>>English <input type="checkbox" name="lang"
					id="lang" value="Hindi"
					<%if (u.getLang() != null && u.getLang().contains("Hindi")) {%>
					checked <%}%>>Hindi</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>:</td>
				<td><input type="radio" name="gender" id="gender" value="Male"
				<%if(u.getGender()!=null && u.getGender().equalsIgnoreCase("Male")){ %>
					checked <%}%> >Male <input
					type="radio" name="gender" id="gender" value="Female"
					<%if(u.getGender()!=null && u.getGender().equalsIgnoreCase("Female")){ %>
					checked <%}%>
					>Female</td>
			</tr>
			<tr>
				<td>UserName</td>
				<td>:</td>
				<td><input type="text" name="username" id="username"
					value=<%=u.getUsername() %>></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="text" name="password" id="password"
					value=<%=u.getPassword()%> ></td>
			</tr>
			<tr>
				<td>Email</td>
				<td>:</td>
				<td><input type="text" name="email" id="email"
					value=<%=u.getEmail() %> ></td>
			</tr>
			<tr>
				<td>contact</td>
				<td>:</td>
				<td><input type="number" name="contact" id="contact"
					value=<%=u.getContact() %>></td>
			</tr>
			<tr>
				<td>Address</td>
				<td>:</td>
				<td><textarea name="address" id="address"
						><%=u.getAddress() %></textarea></td>
			</tr>
			<tr>
				<td>Type</td>
				<td>:</td>
				<td><select id="type" name="type" >
						<option value="User"
							<%if(u.getType()!=null && u.getType().equalsIgnoreCase("User"))
						{%>
							selected <%}%> >User</option>
						<option value="Admin"
							<%if(u.getType()!=null && u.getType().equalsIgnoreCase("Admin"))
						{%>
							selected <%}%> >Admin</option>
				</select></td>
		</tr>
			<tr>
				<td colspan="2" align="center"><input type="button"
					name="buttonaction" value="Register" onclick="validFom();">&nbsp;&nbsp; <input
					type="reset" value="Clear"></td>
			</tr>
		</table>
	</form>
</body>
</html>