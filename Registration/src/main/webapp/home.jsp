<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home.jsp</title>
</head>
<body>
<h2>LOGIN PAGE</h2>
<form action="LoginController" method="post">
<table style="background-color:#FCCEC4">
<tr><td>UserName </td>
<td><input type="text" id="uname" name="uname" >
</td></tr>
<tr><td>Password</td>
<td><input type="password" id="password" name="password" >
</td></tr>
<tr><td colspan="2" align="center">
<input type="submit" name="login" value="Login">&nbsp;&nbsp;
<input type="reset" name="reset" value="Reset">&nbsp;&nbsp;
<td></tr>
<tr>
<td><a href="Register.jsp">Click here to register !!</a></td></tr>
</table>
</form>
</body>
</html>