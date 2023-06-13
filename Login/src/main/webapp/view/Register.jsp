<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="RegisterController" method="post">
 Name:<input type="text" name="name" id="name"><br><br>
 User_Name<input type="text" name="uname" id="uname"><br><br>
 Password:<input type="password" name="pass" id="pass"><br><br>
 <input type="submit" value="Register">
 <button type="submit" formaction="login.jsp">
            login
        </button>
 </form>

</body>
</html>