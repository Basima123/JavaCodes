<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER DETAILS</title>
</head>
<body>
<form action="CreateController" method="post">
<label for "username"> NAME :</label>
<input type="text" name ="username"><br><br>
<label for "DOB"> DOB :</label> 
<input type ="date" name ="dob"><br><br>
GENDER : <input type = "radio" id = "gender" name="gender" value="Male">MALE
<input type = "radio" id = "gender" name="gender" value="Female">FEMALE<br><br>
LANGUAGE : <input type ="checkbox" name ="lang" id = "lang" value= "Tamil" >TAMIL 
<input type = "checkbox" id = "lang" name ="lang" value= "English" >ENGLISH
<input type = "checkbox" id = "lang" name ="lang" value= malay" >MALAY <br><br>
ADDRESS : <textarea row="3" col="7" name="address"></textarea><br><br>
<input type ="submit" value="submit">
<input type ="button" value="Cancel">
<input type ="button" value="Reset">
</form> 
</body>
</html>