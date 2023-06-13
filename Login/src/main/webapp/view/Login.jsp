<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>login page</h2>
<form action="LoginController" method="post">
<input type="text" name="uname" id="uname" required>
<input type="password" name="pass" id="pass" required>
<input type="submit" value="login">
</form>

</body>
</html>