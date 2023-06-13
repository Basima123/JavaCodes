<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
table {
	align: center;
	border-padding: 10px;
	border-spacing: 10px;
	width: 50%;
}
</style>
</head>
<body>

	<h2 align="center">HOME PAGE</h2>
	<br>
	<br>
	<form action="HomeController" method="post">
		<table>
			<tr>
				<td><input type="submit" name="buttonAction" value="INCLUSION"></td>
				<td><input type="submit" name="buttonAction" value="DELETION"></td>
				<td><input type="submit" name="buttonAction" value="ENQUIRY"></td>
				<td><input type="submit" name="buttonAction" value="REPORT"></td>
			</tr>

		</table>

	</form>


</body>
</html>