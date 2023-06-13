<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body bgcolor="#E8C8C1">
<form action="RegisterController" method="post">
<h1>  Register Form</h1>
<table border="1" style="#FDDFD9 ">
<tr><td><label>Name :</label></td>
<td><input type="text" id="name" name="name"></td>
<tr><td><label>Password :</label></td>
<td><input type="password" id="password" name="password"></td></tr>
<tr><td>
<input type="submit" name="submit" value="create">
<input type="reset"  name="reset" value="Reset">
</td></tr>
</table>
</form>
</body>
</html>