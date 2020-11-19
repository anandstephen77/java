<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	
	
	background-sze: cover;
	 
 
}

.login-box {
	width: 250px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: black;
}

.login-box h1 {
	font-size: 30px;
	width:250px;
	color:white;
	margin-bottom: 30px;
	margin-top: 30px;
	margin-right: 30px;
	margin-left: 30px;
	padding: 12px 0;
}

.textbox {
	width: 200px;
	overflow: hidden;
	font-size: 17px;
	padding: 8px 0;
	margin: 8px 0;
	border-bottom: 1px solid;
	color:white;'
}

.textbox input {
	border: none;
	outline: noone;
	background: none;
	color: white;
	font-size: 18px;
	width: 150px;
	float: left;
	margin: 10ox;
}

.btn {
	width: 80%;
	background: none;
	border: 2px solid back;
	color: white;
	padding: 5px;
	font-size: 18px;
	cursor: pointer;
	margin: 12px 0;
}
</style>
<script type ="text/javascript">
function validation() {
    if(document.myregistration.email_id.value=="") {
        alert("Please provide Email Id");
        document.myregistration.email_id.focus();
        return false;
    }
    if(document.myregistration.password.value=="") {
        alert("Please provide Password");
        document.myregistration.password.focus();
        return false;
    }
   
}
</script>
</head>
<body background="E:\m4.jpg" style="background-repeat:no-repeat;background-size:cover;">
<form action =Controller name=myregistration onsubmit="return validation()">
<input type="hidden" name="action" value="Add6"><p/><br>

<div class="login-box">
			<h1>
				<center>Registration Page &nbsp  &nbsp &nbsp &nbsp  &nbsp &nbsp </center>
			</h1>

			<div class="textbox">
			<center>	<font color:"white">Enter Email Id :</center> </font><input type="text" name="email_id">
			</div>

			<div class="textbox">
			<center>	<font color:"white">Enter Password : </center></font><input type="password" name="password">
			</div>

			<input type="submit" class="btn" value="login">
		</div>
</form>
</body>
</html>