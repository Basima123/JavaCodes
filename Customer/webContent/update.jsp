<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<style type="text/css">
table {
	height: 100%;
	width: 100%; border-spacing : 2px;
	border: 1px solid white;
	border-collapse: collapse;
	border-spacing: 2px;
}

th, td {
	padding: 5px;
}
</style>
</head>
<body>
	<h2>Update Customer</h2>
	<form action="UpdateController" method="post">
	<input type="submit" name="buttonAction" value="Back">
		<table>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input type="text" name="age" id="age"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>:</td>
				<td><input type="radio" name="gender" id="gender" value="M">Male
					<input type="radio" name="gender" id="gender" value="F">Female</td>
			</tr>
			<tr>
				<th>Address</th>

			</tr>

			<tr>
				<td>Block</td>
				<td>:</td>
				<td><input type="text" name="block" id="block" maxlength="4"></td>
				<td>Level</td>
				<td>:</td>
				<td><input type="text" name="level" id="level" maxlength="2"></td>
				<td>Unit</td>
				<td>:</td>
				<td><input type="text" name="unit" id="unit" maxlength="4"></td>
			</tr>
			<tr>
				<td>Street</td>
				<td>:</td>
				<td><textarea rows="2" cols="10" name="street" id="street"
						maxlength="40">
					</textarea></td>
				<td>postal</td>
				<td>:</td>
				<td><input type="text" name="postal" id="postal" maxlength="6"></td>
			<tr>
				<th>Contact number</th>

			</tr>
			<tr>
				<td>Home</td>
				<td>:</td>
				<td><input type="text" name="homeNo" id="homeNo" maxlength="8"></td>
				<td>Mobile</td>
				<td>:</td>
				<td><input type="text" name="mobileNo" id="mobileNo"
					maxlength="8"></td>
			</tr>
			
			<tr align="center"><td>
				<input type="submit" name="update" value="UPDATE">
				<input type="reset" name="reset" value="RESET"></td>
			</tr>
		</table>
</form>
</body>
</html>