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
	margin-top: 30px;
	margin-right: 30px;
	margin-left: 30px;
	margin-bottom: 30px;
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
	transition: 0.5s;
	transition-property: background;
}
.btn submit:hover{
background: #0D9DBB;
}
</style>
<script type ="text/javascript">
function validation() {
    if(document.mygenre.genre_id.value=="") {
        alert("Please provide genre Id");
        document.mygenre.genre_id.focus();
        return false;
    }
    if(document.mygenre.genre_name.value=="") {
        alert("Please provide Genre Name");
        document.mygenre.genre_name.focus();
        return false;
    }
    if(document.mygenre.genre_type.value=="") {
        alert("Please provide Genre type");
        document.mygenre.genre_type.focus();
        return false;
    }
}
</script>
</head>
<body background=" E:\genre.jpg" style="background-repeat:no-repeat;background-size:cover;">
<form action =Controller name=mygenre onsubmit="return validation()">
<input type="hidden" name="action" value="Add4"><p/><br>
 <div class="login-box">
   <h1>Genre   Details </h1>
   <div class="textbox">
           <center><font color="white">Enter Genre Id: </font></center> <input type=text name="genre_id">
    </div>
   <div class="textbox"> 
           <center><font color="white"> Enter Genre Name :</font></center> <input type=text name="genre_name">
    </div>
    <div class="textbox">
           <center><font color="white"> Enter Genre Type :</font></center> <input type=text name="genre_type">
    </div>        
    
            <input type=submit class="btn" value="Add To Genre">
   </div>
</form>
</body>
</html>