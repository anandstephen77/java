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
	float: right;
	font-size: 28px;
	width:260px;
	text-align:center;
	color: white;
	margin-top: 30px;
	margin-right: 30px;
	margin-left: 30px;
	margin-bottom: 30px;
	padding: 10px 0;
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
	width: 260px;
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
    if(document.mymusic.m_id.value=="") {
        alert("Please provide M Id");
        document.mymusic.m_id.focus();
        return false;
    }
    if(document.mymusic.album_id.value=="") {
        alert("Please provide Album Id");
        document.mymusic.album_id.focus();
        return false;
    }
    if(document.mymusic.artist_id.value=="") {
        alert("Please provide Artist Id");
        document.mymusic.artist_id.focus();
        return false;
    }
    if(document.mymusic.title_id.value=="") {
        alert("Please provide title Id");
        document.mymusic.title_id.focus();
        return false;
    }
    if(document.mymusic.genre_id.value=="") {
        alert("Please provide Genre Id");
        document.mymusic.genre_id.focus();
        return false;
    }
}
</script>
</head>
<body background="E:\musicalbum.jpg" style="background-repeat:no-repeat;background-size:cover;">
<form action =Controller name=mymusic onsubmit="return validation()">
<input type="hidden" name="action" value="Add5"><p/><br>
<div class="login-box">
   <h1><center> Music Album Details</center></h1>
   <div class="textbox">
           <center><font color="white">Enter Music Id:</font></center> <input type=text name="m_id">
    </div>
   <div class="textbox"> 
           <center><font color="white"> Enter Album Id:</font></center> <input type=text name="album_id">
    </div>
    <div class="textbox">
            <center><font color="white">Enter Artist Id:</font></center> <input type=text name="artist_id">
    </div>
    <div class="textbox">
            <center><font color="white">Enter Title Id:</font></center> <input type=text name="title_id">
    </div>
    <div class="textbox">
           <center><font color="white"> Enter Genre Id:</font></center> <input type=text name="genre_id">
    </div>
            <input type=submit class="btn" value="Add To Music Album">

  </div>  
</form>
</body>
</html>