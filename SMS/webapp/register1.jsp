<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
</head>
<body style="background-color: #AEA1B9">
	<h1>Registration</h1>
	<form action="home.jsp" method="post" style="background-color:">
		<input type="submit" name="back" value="BACK">
	</form>
	<br>
	<br>
	<form action="RegisterController" method="post">
		<table border="1">
		<tr>
				<td><label>Id</label></td>
				<td><input type="number" id="id" name="id" maxlength="8"></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td><label>DOB</label></td>
				<td><input type="date" id="dob" name="dob"
					placeholder="dd-mm-yyyy"></td>
			</tr>
			<tr>
				<td><label>Address</label>
				<td><textarea id="address" name="address" rows="3" cols="12"></textarea>
				</td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><input type="radio" id="gender" name="gender" value="Male">Male
					<input type="radio" id="gender" name="gender" value="Female">Female
				</td>
			</tr>
			<tr>
				<td><label>Language</label></td>
				<td><input type="checkbox" id="lan" name="lan" value="English">English
					<input type="checkbox" id="lan" name="lan" value="Tamil">Tamil
					<input type="checkbox" id="lan" name="lan" value="Malay">Malay
					<input type="checkbox" id="lan" name="lan" value="Mandarin">Mandarin
				</td>
			</tr>
			<tr>
				<td><label>User Name</label></td>
				<td><input type="text" id="uname" name="uname"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" id="password" name="password">
				</td>
			</tr>
			<tr>
				<td>Access </td>
				<td><select name="access" id="access" value="access">
				<option value ="user" >User</option>
				<option value ="admin">Admin</option></select>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" name="submit" value="SUBMIT"> 
					<input type="reset" name="reset" value="RESET">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>