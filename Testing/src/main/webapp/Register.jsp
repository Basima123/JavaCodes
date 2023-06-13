<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
h2 {
	color: blue;
}

table {
	color: green;
}
</style>
</head>
<body>
	<h2>Form Registration</h2>

	<form action="register.java" method="post">

		<table border="1">

			<tr>
				<td><label for="name">Name :</label> <input type="text"
					name="name" id="name" required></td>
			<tr>
				<td><label for="address">Address :</label> <textarea
						id="address" name="address" rows="3" cols="12" required></textarea></td>
			</tr>
			<tr>
				<td><label for="contact">contact :</label> <input type="tel"
					name="contact" id="contact" required></td>
			</tr>
			<tr>
				<td><label for="email">email :</label> <input type="email"
					name="email" id="email" required></td>
			</tr>
			<tr>
				<td><label for="password">password :</label> <input
					type="password" name="password" id="password" required></td>
			</tr>
			<tr>
				<td colspan="1"> <input type="submit" value="Submit" ></td>
			</tr>
		</table>
	</form>
</body>
</html>