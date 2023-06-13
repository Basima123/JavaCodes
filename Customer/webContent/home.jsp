<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body bgcolor="#798584">
	<h2>Customer Database</h2>
	<form action="HomeController" method="post">
		<table border="1">
			<tr>
				<td><input type="submit" name="buttonAction" value="ENQUIRE"></td>
				<td><input type="submit" name="buttonAction" value="UPDATE"></td>
				<td><input type="submit" name="buttonAction" value="CREATE"></td>
				<td><input type="submit" name="buttonAction" value="DELETE"></td>
			</tr>
		</table>
	</form>
</body>
</html>