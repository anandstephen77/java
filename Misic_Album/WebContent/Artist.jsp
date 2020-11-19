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
	text-align:center;
	font-size: 30px;
	color: white;
	width:220px;
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
</style>
<script type ="text/javascript">
function validation() {
    if(document.myartist.artist_id.value=="") {
        alert("Please provide artist Id");
        document.myartist.artist_id.focus();
        return false;
    }
    if(document.myartist.artist_name.value=="") {
        alert("Please provide Artist Name");
        document.myalbum.artist_name.focus();
        return false;
    }
    if(document.myartist.profession.value=="") {
        alert("Please provide Profession");
        document.myartist.profession.focus();
        return false;
    }
}
</script>
</head>
<body background="E:\music1.png " style="background-repeat:no-repeat;background-size:cover;">
<form action =Controller name=myartist onsubmit="return validation()">
<input type="hidden" name="action" value="Add2"><p/><br>

 
<div class="login-box">
  
   <h1><font color="white">Artist Details &nbsp &nbsp &nbsp  &nbsp &nbsp  &nbsp  &nbsp &nbsp   </font></h1>
   <div class="textbox">
            <center><font color="white">Enter Artist Id:</center> </font><input type=text name="artist_id">
    </div>
    <div class="textbox">
            <center><font color="white">Enter Artist Name :</font></center><input type=text name="artist_name">
    </div>
    <div class="textbox">
            <center><font color="white">Enter profession : </font></center><input type=text name="profession">
    </div>        
            <input type=submit class="btn" value="Add To Artist">
   </div>
</form>
</body>
</html>