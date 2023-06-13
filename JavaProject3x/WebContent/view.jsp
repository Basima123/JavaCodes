<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.java3x.dto.Java3xDTO"%>
<%@ page import="java.lang.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RETRIEVE</title>
</head>
<%
Java3xDTO dto = new Java3xDTO();
if (session.getAttribute("dto") != null) {
	System.out.println("Initilaize session to dto");
	dto = (Java3xDTO) session.getAttribute("dto");
} else
	System.out.println("Session is empty");
%>
<body>
	<h2>RETRIEVE RECORD</h2>
	<br>
	<form action="ViewController" method="get">
		<table>
			<tr>
				<td>ID Number</td>
				<td>:</td>
				<td><input type="text" name="id" id="id"
					value=<%=dto.getName()%>> <select name="idType"
					id="idType">
						<option value=UIN>UIN</option>
						<option value=FIN>FIN</option>
						<option value=PPN>PPN</option>
						<option value=XIN>XIN</option>
				</select></td>
				<td></td>
				<td><input type="submit" name="submit"
					value="Retrieve Personal Data"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" id="name"
					value=<%=dto.getName()%>></td>
			</tr>
			<tr>
			<tr>
				<td>Relationship to <%=dto.getName()%></td>
				<td>:</td>
				<td><select name="relation" id="relation">

						<option value=spouse
							<%if (dto.getRelation() != null && dto.getRelation().equalsIgnoreCase("Husband/Wife")) {%>
							selected <%}%>>Husband/Wife</option>
						<option value=kid
							<%if (dto.getRelation() != null && dto.getRelation().equalsIgnoreCase("Son/Daughter")) {%>
							selected>
							<%
							}
							%>Son/Daughter
						</option>
						<option value=sibbling
							<%if (dto.getRelation() != null && dto.getRelation().equalsIgnoreCase("Brother/Sister")) {%>
							selected <%}%>>Brother/Sister</option>
						<option value=parent
							<%if (dto.getRelation() != null && dto.getRelation().equalsIgnoreCase("Father/Mother")) {%>
							selected <%}%>>Father/Mother</option>
				</select></td>
				<td>Gender :</td>
				<td><input type="radio" name="gender" id="gender" value="male"
					<%if (dto.getGender() != null && dto.getGender().equalsIgnoreCase("male")) {%>
					checked <%}%>>Male <input type="radio" name="gender"
					id="gender" value="female"
					<%if (dto.getGender() != null && dto.getGender().equalsIgnoreCase("Female")) {%>
					checked <%}%>>Female</td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td>:</td>
				<td><input type="date" name="dob" id="dob"
					value=<%=dto.getDob()%>></td>
				<td>Citizenship :</td>
				<td><select name="citizen" id="citizen">
						<option value="sc"
							<%if (dto.getCitizen() != null && (dto.getCitizen().equalsIgnoreCase("Singapore Citizen"))) {%>
							selected <%}%>>Singapore Citizen</option>
						<option value="spr"
							<%if (dto.getCitizen() != null && (dto.getCitizen().equalsIgnoreCase("Singapore Permanent citizen"))) {%>
							selected <%}%>>Singapore Permanent citizen</option>
						<option value="nc"
							<%if (dto.getCitizen() != null && (dto.getCitizen().equalsIgnoreCase("Non citizen"))) {%>
							selected <%}%>>Non citizen</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="3">Applicable for occupier who is a non-citizen
					with>=6 months visit pass</td>
			</tr>
			<tr>
				<td>Card Type</td>
				<td>:</td>
				<td><select name="cardType" id="cardType">
						<option value="svp"
							<%if (dto.getCard() != null && (dto.getCard().equalsIgnoreCase("Social Visit Pass"))) {%>
							selected <%}%>>Social Visit Pass</option>
						<option value="wp"
							<%if (dto.getCard() != null && (dto.getCard().equalsIgnoreCase("Work Permit"))) {%>
							selected <%}%>>Work Permit</option>
						<option value="ep"
							<%if (dto.getCard() != null && (dto.getCard().equalsIgnoreCase("Employment Pass"))) {%>
							selected <%}%>>Employment Pass</option>
						<option value="dp"
							<%if (dto.getCard() != null && (dto.getCard().equalsIgnoreCase("Dependent Pass"))) {%>
							selected <%}%>>Dependent Pass</option>
						<option value="sp"
							<%if (dto.getCard() != null && (dto.getCard().equalsIgnoreCase("Student Pass"))) {%>
							selected <%}%>>Student Pass</option>
				</select></td>
			<tr>
				<td>Date of Issue</td>
				<td>:</td>
				<td><input type="date" name="doi" id="doi"
					value=<%=dto.getDoi()%>></td>
				<td>Expiry Date :</td>
				<td><input type="date" name="expiry" id="expiry"
					value=<%=dto.getExpiry()%>></td>
				
			
			<tr>
				<td>Card Type</td>
				<td>:</td>
				<td><select name="cardType" id="cardType" disabled>
						<option value="svp">Social Visit Pass</option>
						<option value="wp">Work Permit</option>
						<option value="ep">Employment Pass</option>
						<option value="dp">Dependent Pass</option>
						<option value="sp">Student Pass</option>
				</select></td>
			<tr>
				<td>Date of Issue</td>
				<td>:</td>
				<td><input type="date" name="doi" id="doi" disabled></td>
				<td>Expiry Date :</td>
				<td><input type="date" name="expiry" id="expiry" disabled></td>
			</tr>
		</table>
	</form>
</body>
</html>