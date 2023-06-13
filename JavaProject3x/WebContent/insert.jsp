<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERT</title>
</head>
<body>
<h2>INSERT RECORD</h2>
<br>
<form action="InsertController" method="post">
<table>
<tr>
<td>ID Number</td><td>:</td>
<td><input type="text" name="idNo" id="idNo" required>

<select name="idType" id="idType">
<option value="empty"></option>
<option value="UIN">UIN</option>
<option value="FIN">FIN</option>
<option value="PPN">PPN</option>
<option value="XIN">XIN</option>
</select></td>
</tr>
<tr>
<td>Name</td><td>:</td>
<td><input type="text" name="name" id="name" required></td>
</tr>
<tr>
<tr>
<td>Relationship</td><td>:</td>
<td><select name="relation" id="relation" required>
<option value="empty"></option>
<option value="spouse">Husband/Wife</option>
<option value="kid">Son/Daughter</option>
<option value="sibbling">Brother/Sister</option>
<option value="parents">Father/Mother</option>
</select></td>
</tr>
<tr>
<td>Gender</td><td>:</td>
<td><input type="radio" name="gender" id="gender" value="male">Male
<input type="radio" name="gender" id="gender" value="female">Female
</td>
</tr>
<tr>
<td>Date of Birth</td><td>:</td>
<td><input type="date" name="dob" id="dob"  placeholder="dd-mm-yyyy" required></td>
</tr>
<tr>
<td>Citizenship</td><td>:</td>
<td><select name="citizen" id="citizen" required onchange="citizenshipChange();">
<option value="empty"></option>
<option value="sc">Singapore Citizen</option>
<option value="spr">Singapore Permanent citizen</option>
<option value="nc">Non citizen</option>
</select></td></tr>
<tr>
<td colspan="3">
Applicable for occupier who is a non-citizen with>=6 months visit pass
</td>
</tr>
<tr>
<td>Card Type</td><td>:</td>
<td><select name="cardType" id="cardType">
<option value="empty"></option>
<option value="svp">Social Visit Pass</option>
<option value="wp">Work Permit</option>
<option value="ep">Employment Pass</option>
<option value="dp">Dependent Pass</option>
<option value="sp">Student Pass</option>
</select></td>
<tr>
<td>Date of Issue</td><td>:</td>
<td><input type="date" name="doi" id="doi" placeholder="dd-mm-yyyy"></td>
</tr>
<tr>
<td>Expiry Date</td><td>:</td>
<td><input type="date" name="expiry" id="expiry"  placeholder="dd-mm-yyyy" ></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="Submit"></td>
<td><input type="reset" name="reset" value="Reset"></td>
</tr>
</table>
<script type="text/javascript">
function citizenshipChange()
{
	var citizenship =document.getElementById("citizen").value;
	alert(citizenship);
	if(citizenship=="nc")
		{
		alert('NC');
		document.getElementById("cardType").disabled=true;
		}
	}
</script>
</form>
</body>
</html>