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
	float: left;
	font-size: 30px;
	color: white;
	margin-bottom: 30px;
	margin-top: 30px;
	margin-right: 12px;
	margin-left: 12px;
	padding: 59px 0;
}

.textbox {
	width: 200px;
	overflow: hidden;
	font-size: 17px;
	padding: 8px 0;
	margin: 8px 0;
	border-bottom: 1px solid;
	color: white;
	'
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
.btn type:hover{
background: #0D9DBB;
}
</style>
<script type="text/javascript">
	function validation() {
		if (document.myalbum.album_id.value == "") {
			alert("Please provide Album Id");
			document.myalbum.album_id.focus();
			return false;
		}
		if (document.myalbum.album_name.value == "") {
			alert("Please provide Album Name");
			document.myalbum.album_name.focus();
			return false;
		}
		if (document.myalbum.year.value == "") {
			alert("Please provide Year");
			document.myalbum.year.focus();
			return false;
		}
	}
</script>
</head>
<body background="E:\m6.jpeg"
	style="background-repeat: no-repeat; background-size: cover; height:100%">
	<form action=Controller name=myalbum onsubmit="return validation()">
		<input type="hidden" name="action" value="Add1">
		<p />
		<br>

		<div class="login-box">
			<h1><center><font color="white">Album Details</font></center></h1>
		
			<div class="textbox">
				<center><font color="white">Enter Album Id: </center></font> <input type=text name="album_id">
			</div>
			<div class="textbox">
				<center><font color="white">Enter Album Name : </center></font> <input type=text name="album_name">

			</div>
			<div class="textbox">
				<center><font color="white">Enter Year :</center></font><input type=text name="year">
			</div>
			<input type=submit class="btn" value="Add To Album">
		</div>
	</form>
</body>
</html>