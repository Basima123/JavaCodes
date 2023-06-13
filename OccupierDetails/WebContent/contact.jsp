<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
<script>

function nextBtnClick() {
	alert('nextBtnClick');
	var isValid = chkInpData();
	if(isValid == true) {
		document.getElementById("contactForm").method = "Post";
		document.getElementById("contactForm").action = "ContactController";
		document.getElementById("contactForm").submit();
	}
	//add for other fields
}


function resetButtonClick() {
	alert("resetButtonClick");
	document.getElementById("name").value ="";
	document.getElementById("idNo").value="";
	document.getElementById("idType").value="";
	document.getElementById("telHome").value="";
	document.getElementById("telOffice").value="";
	document.getElementById("hp").value="";
	document.getElementById("fax").value="";
	document.getElementById("email").value="";
	//add for other fields
}
function validateEmail(email)
{
	var emailFormat="/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/";
	if(email.value.match(emailFormat))
		{
		return true;
		}
	else
	alert("Enter valid email address");
	
	}

function chkInpData(){
	var isValid = true;
	var name = document.getElementById("name").value;
	var idNo = document.getElementById("idNo").value;
	var idType = document.getElementById("idType").value;
	var telHome=document.getElementById("telHome").value;
	var telOffice=document.getElementById("telOffice").value;
	var hp=document.getElementById("hp").value;
	var fax=document.getElementById("fax").value;
	var email=document.getElementById("email").value;
	
	if(name == "") {
		isValid = false;
		alert("Please enter name");
	}
	
	if(isValid == true)  {
		if(idNo == ""){
			isValid = false;
			alert("Please enter ID Number");
		}
	}
	
	if(isValid == true)  {
		if(idType == "" ) {
			isValid = false;
			alert("Please enter ID Type");
		}
	}
		if(isValid==true){
			if(telHome=="")
				{
				isValid=false;
				alert("Please enter valid home number ");
				}
		}
			if(isValid==true)
				{
				if(telOffice=="")
					{
					isvalid=false;
					alert("plz enter office number");
					}
				}
			if(isValid==true)
			{
			if(hp=="")
				{
				isvalid=false;
				alert("plz enter handphone number");
				}
		}
			if(isValid==true)
			{
			if(fax=="")
				{
				isvalid=false;
				alert("plz enter fax number");
				}
	}	
	
	if(isValid == true)  {
		if(email == "") {
			return false;
			alert("email should not be empty");
		}
		else
			validateEmail(email);
	}
		
		}
		
		
		
</script>
</head>
<body>
	<h3 align="center">CONTACT INFO</h3>
	<form id="contactForm">
		<table style="width: 40%">

			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" id="name" maxlength="6"
					onkeypress="return /[0-9a-zA-Z]/i.test(event.key)"></td>
			</tr>
			<tr>
				<td>Id Number</td>
				<td>:</td>
				<td><input type="text" name="idNo" id="idNo"
					onkeypress="return /[0-9]/i.test(event.key)"></td>
			</tr>
			<tr>
				<td>Id Type</td>
				<td>:</td>
				<td><select name="idType" id="idType" required>
						<option value="empty"></option>
						<option value="uin">UIN</option>
						<option value="fin">FIN</option>
						<option value="ppn">PPN</option>
						<option value="xin">XIN</option>
				</select></td>
			</tr>
			<tr>
				<td>Telephone(Home)</td>
				<td>:</td>
				<td><input type="number" name="telHome" id="telHome"
					maxlength="8" onkeypress="return /[0-9]/i.test(event.key)"></td>
			</tr>
			<tr>
				<td>Telephone(office)</td>
				<td>:</td>
				<td><input type="number" name="telOffice" id="telOffice"
					maxlength="8" onkeypress="return/[1-9]/i.test(event.key)"></td>
			</tr>
			<tr>
				<td>Hand Phone</td>
				<td>:</td>
				<td><input type="number" name="hp" id="hp" maxlength="8"
					onkeypress="return/[1-9]/i.test(event.key)"></td>
			</tr>
			<tr>
				<td>Fax</td>
				<td>:</td>
				<td><input type="number" name="fax" id="fax" maxlength="8"
					onkeypress="return/[1-9]/i.test(event.key)"></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td>:</td>
				<td><input type="email" name="email" id="email"></td>
			</tr>

			<tr>
				<td colspan="3" align="center"><input type="button"
					name="buttonAction" value="Next" onclick="nextBtnClick();">
					<input type="button" name="reset" value="Reset"
					onclick="resetButtonClick();"></td>
			</tr>
		</table>
	</form>
</body>
</html>