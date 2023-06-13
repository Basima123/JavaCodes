<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.occupier.dto.OccupierDTO"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REPORT</title>
</head>
<% 
ArrayList<OccupierDTO> list=new ArrayList<OccupierDTO>();
if(session.getAttribute("list")!=null)
{
	list=(ArrayList<OccupierDTO>)session.getAttribute("list");
	
}
else
	System.out.println("List is empty");



%>
<body>
	<form action="ViewAllController" method="get">
		<table style="border: solid 1px" style="width:100%"
			style="border-collapse: collapse">
			<tr>
				<th>Name</th>
				<th>IdNo</th>
				<th>IdType</th>
				<th>TelHome</th>
				<th>TelOffice</th>
				<th>HandPhone</th>
				<th>Fax</th>
				<th>Email</th>
				<th>Gender</th>
				<th>DOB</th>
				<th>Status</th>
				<th>Citizen</th>
				<th>Race</th>
			</tr>


			<%for(OccupierDTO dto:list) {%>
			<tr>
				<th><%= dto.getName()%></th>
				<th><%=dto.getIdNo() %></th>
				<th><%=dto.getIdType() %></th>
				<th><%=dto.getTelHome() %></th>
				<th><%=dto.getTelOffice() %></th>
				<th><%=dto.getHp() %></th>
				<th><%=dto.getFax() %></th>
				<th><%=dto.getEmail() %></th>
				<th><%=dto.getGender() %></th>
				<th><%=dto.getDob() %></th>
				<th><%=dto.getStatus() %></th>
				<th><%=dto.getCitizen() %></th>
				<th><%=dto.getRace() %></th>
			</tr>
			<%} %>

		</table>

	</form>

</body>
</html>
