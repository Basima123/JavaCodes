<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.occupier.dto.OccupierDTO"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<%
OccupierDTO dto=new OccupierDTO();
if(session.getAttribute("dto")!=null)
{
	dto=(OccupierDTO)session.getAttribute("dto");
}
else
	System.out.println("DTO is empty");
%>
<meta charset="ISO-8859-1">
<title>VIEW</title>
</head>
<body>
	<h2>Retrieve Data</h2>
	<form action="ViewController" method="get">
		<table style="width: 60%">
			<tr>
				<td>SEARCH NAME</td>
				<td>:</td>
				<td><input type="text" name="search" id="search"></td>
				<td><input type="submit" name="buttonAction" value="SEARCH"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" id="name" maxlength="66"></td>
			</tr>
			<tr>
				<td>Id Number</td>
				<td>:</td>
				<td><input type="text" name="idNo" id="idNo"></td>
			</tr>
			<tr>
				<td>Id Type</td>
				<td>:</td>
				<td><select name="idType" id="idType" required>
						<option value="uin">UIN</option>
						<option value="fin">FIN</option>
						<option value="ppn">PPN</option>
						<option value="xin">XIN</option>
				</select></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td>:</td>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female</td>
			<tr>
				<td>Date of Birth</td>
				<td>:</td>
				<td><input type="date" name="dob" id="dob"
					placeholder="dd-mm-yyyy"></td>
			</tr>
			<tr>
				<td>Marital Status</td>
				<td>:</td>
				<td><select name="status" id="status">
						<option value="single">Single</option>
						<option value="married">Married</option>
						<option value="divorce">Divorce</option>
						<option value="separated">Separated</option>
				</select></td>
			</tr>
			<tr>
				<td>Citizenship</td>
				<td>:</td>
				<td><select name="Citizen" id="Citizen">
						<option value="sc">Singapore Citizen</option>
						<option value="pr">Permanent Resident</option>
						<option value="nc">Non-Citizen</option>
				</select></td>
			</tr>
			<tr>
				<td>Nationality</td>
				<td>:</td>
				<td><select name="nation" id="nation">
						<option value="singapore">Singapore</option>
						<option value="china">China</option>
						<option value="malaysia">Malaysia</option>
						<option value="indonesia">Indonesia</option>
						<option value="taiwan">Taiwan</option>
						<option value="hong kong">Hong Kong</option>
				</select></td>
			</tr>
			<tr>
				<td>Race</td>
				<td>:</td>
				<td><select name="race" id="race">
						<option value="chinese">Chinese</option>
						<option value="malay">Malay</option>
						<option value="indian">Indian</option>
						<option value="others">Others</option>
				</select></td>
			</tr>
			<tr>
				<td>Telephone(Home)</td>
				<td>:</td>
				<td><input type="number" name="telHome" id="telHome"
					maxlength="8"></td>
			</tr>
			<tr>
				<td>Telephone(office)</td>
				<td>:</td>
				<td><input type="number" name="telOffice" id="telOffice"
					maxlength="8"></td>
			</tr>
			<tr>
				<td>Hand Phone</td>
				<td>:</td>
				<td><input type="number" name="hp" id="hp" maxlength="8"></td>
			</tr>
			<tr>
				<td>Fax</td>
				<td>:</td>
				<td><input type="number" name="fax" id="fax" maxlength="8"></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td>:</td>
				<td><input type="email" name="email" id="email"></td>
			</tr>
			<tr>
				<td><input type="submit" name="buttonAction" value="EDIT">
					<input type="submit" name="buttonAction" value="BACK"></td>
			</tr>
		</table>
	</form>

</body>
</html>