<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.occupier.dto.OccupierDTO"%>
<%@ page import="java.lang.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Occupier Info</title>
</head>
<%OccupierDTO dto=new OccupierDTO();
if(session.getAttribute("dto")!=null)
{
	dto=(OccupierDTO)session.getAttribute("dto");
}

%>
<body>
	<h3>Occupier Info</h3>
	<form action="OccupierController" method="post">
		<br>
		<table style="border-padding: 15px">
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" id="name" disabled
					value=<%=dto.getName() %>></td>
			</tr>
			<tr>
				<td>ID Number</td>
				<td>:</td>
				<td><input type="text" name="idNo" id="idNo" disabled
					value=<%=dto.getIdNo() %>></td>
			</tr>
			<tr>
				<td>ID Type</td>
				<td>:</td>
				<td><select name="idType" id="idType" disabled>
						<option value="uin"
							<%if(dto.getIdType()!=null && dto.getIdType().equalsIgnoreCase("uin")){ %>
							selected>UIN
							<%} %>
						</option>
						<option value="fin"
							<%if(dto.getIdType()!=null && dto.getIdType().equalsIgnoreCase("fin")){ %>
							selected>FIN
							<%}%>
						</option>
						<option value="ppn"
							<%if(dto.getIdType()!=null && dto.getIdType().equalsIgnoreCase("ppn")){ %>
							selected>PPN
							<%}%>
						</option>
						<option value="xin"
							<%if(dto.getIdType()!=null && dto.getIdType().equalsIgnoreCase("xin")){ %>
							selected>XIN
							<%}%>
						</option>
				</select>
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
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="SUBMIT">
					<input type="reset" name="reset" value="RESET"></td>
			</tr>

		</table>
	</form>
</body>
</html>

<!-- 1. Name - Char66 | Data to be
2. ID Number - Char20 |&gt; flow from previous page
3. ID Type - (* UIN / FIN / PPN / XIN) | i.e. Contact-Info JSP
4. Gender - (*M/F)
5. Date of Birth
6. Marital Status
- Single
- Married
- Divorce
- Separated
7. Citizenship
- Singapore Citizen
- Permanent Resident
- Non-Citizen
8. Nationality
- Singapore
- China
- Malaysia
- Indonesia
- India
- Taiwan
- Hong Kong
9. Race
- Chinese
- Malay
- Indian
- Other -->