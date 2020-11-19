<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	
	background: url(E:\Login.jpg) no-repeat;
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
	color:white;
	width:300px;
	text-align:center;
	margin-top: 10px;
	margin-right: 30px;
	margin-left: 30px;
	margin-bottom: 50px;
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="E:\Login.jpg" style="background-repeat:no-repeat;background-size:cover;">
	<form action=Controller name=mylogin onsubmit="return validation()">
		<input type="hidden" name="action" value="Add7">
		<p />
		<br>

		<div class="login-box">
			<h1>
			Login Page &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
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