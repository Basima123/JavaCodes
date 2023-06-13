<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
<style>
table {
	bgcolor: "F08080";
	align
	="center";
	width
	="70%";
}
</style>
</head>
<body>
	<form action="InsertCustomer" method="post">
		<table>
			<tr>
				<td colspan="2" align="center">Customer Details</td></tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" id="name" maxlength="20"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address" id="address"
					maxlength="40"></td>
			</tr>
			<tr>
				<td>contact :</td>
				<td><input type="tel" name="contact" id="contact" maxlength="10"></td>
			</tr>
			<tr>
				<td>Email Id :</td>
				<td><input type="email" name="email" id="email" maxlength="20"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="submit">
				<input type="submit" value="insert">
				<input type="submit" value="delete">
		</table>
	</form>

</body>
</html>