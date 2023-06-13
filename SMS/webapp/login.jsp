<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body style="background-color: #9276AC">
	<h1 align="left">User Login</h1>
	<form action="home.jsp" method="post" style="background-color:">
		<input type="submit" name="back" value="BACK">
	</form>
	
	<br><br>
	<form action="LoginController" method=post>
		<table border="1">
			<tr>
				<td><label>User Name </label></td>
				<td><input type="text" id="uname" name="uname"></td>
			</tr>
			<tr>
				<td><label>Password </label></td>
				<td><input type="password" id="password" name="password">
				</td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" name="submit"
					value="Submit"> <input type="reset" name="reset"
					value="Reset"></td>
			</tr>
		</table>
	</form>
	<a href="register1.jsp">Click here to Register </a>
</body>
</html>