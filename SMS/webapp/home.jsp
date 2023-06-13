<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
table {
	border-collapse: collapse;
	padding: 10px;
	border-spacing: 30px;
	width : 100%;
}

td {
	border-collapse: collapse;
	padding: 10px;
	border-spacing: 10px;
	width :50%;
}

th {
	background-color: "#798584";
	border-collapse: "collapse";
	padding: 10px;
	width :50%;
}

body {
	background-image: url("C:/Users/Basima Banu/Desktop/natural/scene3.jpg");
}
</style>
</head>
<body>
	<h2>Welcome to our Student Management System</h2>
	<form action="HomeController" method="post">
		<table>
			<tr align="left" style="background-color: #798584">
				<td><input type="submit" name="buttonAction" value="Register">
				
				<input type="submit" name="buttonAction" value="Login"></td>
				<td>Search ID :
				<input type="text" name="id" id="id">
				<input type="submit" name="buttonAction" value="Search"></td>
			</tr>

			<tr align="center">
				<td><input type="submit" name="buttonAction"
					value="Add Student"></td>
			</tr>
			<tr align="center">
				<td><input type="submit" name="buttonAction" value="Update">
				</td>
			</tr>
			<tr align="center">
				<td><input type="submit" name="buttonAction" value="Delete">
				</td>
			</tr>
			<tr align="center">
				<td><input type="submit" name="buttonAction" value="View">
				</td>
			</tr>
			<tr>
				
			</tr>

		</table>
	</form>
</body>
</html>