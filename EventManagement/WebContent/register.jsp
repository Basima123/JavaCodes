<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>Registration</h2>
<form action="RegisterServlet" method="post">
<table border="1">
<tr><td>
ID :</td><td> <input type="text" id="personId" name="personId">
</td></tr>
<tr><td>
NAME :</td><td> <input type="text" id="personName" name="personName">
</td></tr>
<tr><td>
PASSWORD : </td><td><input type="password" id="password" name="password">
</td></tr>
<tr><td>
CONFIRM PASSWORD :</td><td> <input type="password" id="cpassword" name="cpassword">
</td></tr>
<tr><td>
GENDER:</td>
<td><input type="radio" id="gender" value="male">male
 <input type="radio" id="gender" value="female">female</td>
</tr>
<tr><td>
DOB: </td><td><input type="date" id="dob" name="dob">
</td></tr>
</table>

<input type="submit" value="SignUp">
<input type="reset" value="Reset">
<br>
<a href="login.jsp">Already Registered?Click here to logIn</a>
</form>

</body>
</html>