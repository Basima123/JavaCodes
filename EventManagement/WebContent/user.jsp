<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My profile</title>
</head>
<body>
<h2>My profile</h2>
<form action="" method="post">
<table border="1">
<tr><td>
ID :</td><td> <input type="text" id="personId" name="personId">
</td></tr>
<tr><td>
NAME :</td><td> <input type="text" id="personName" name="personName">
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
</form>
<input type="submit" value="Back" >
</body>
</html>