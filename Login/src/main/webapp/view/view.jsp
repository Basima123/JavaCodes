<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view</title>
</head>
<body>
<h1>Welcome</h1>
   <%--String name=session.getAttribute("vname").toString();
      String uname=session.getAttribute("vuname").toString();
      String password=session.getAttribute("vpassword").toString();
      
   --%>
   <%   
        RegDto dto=(RegDto)session.getAttribute("dto");
          String name=dto.getName();
          String uname=dto.getUsername();
          String password=dto.getPassword();
   %>
  <form method="post" action=ViewController>
  Name:<input type="text" value="<%=name %>" name="name" required><br><br>
  User_Name:<input type="text" value="<%=uname %>" name="uname" readonly><br><br>
  Password:<input type="text" value="<%=password %>" name="pass" required><br><br>
  <input type="submit" value="Update" formaction="View">
  <input type="submit" value="ViewAll" formaction="ViewAll">
  </form>

</body>
</html>