<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add products</title>
</head>
<body>
<h1> ADD NEW PRODUCT </h1>
<form action="addProduct.jsp" method="post">
<table border="1" bgcolor="#D2EDEB">
<tr><td>Id </td>
<td><input type="text" name="id"></td></tr>
<tr><td>Name </td>
<td><input type="text" name="uname"></td></tr>
<tr><td>size </td>
<td><input type="text" name="size"></td></tr>
<tr><td>category</td>
<td><input type="text" name="category"></td></tr>

<tr><td colspan="2">
<input type="submit" name="add" value="ADD">
<input type="submit" name="submit" value="UPDATE">
<input type="reset" name="reset" value="RESET">
<input type="submit" name="delete" value="DELETE"></td> </tr>


</table>
</form>
</body>
</html>