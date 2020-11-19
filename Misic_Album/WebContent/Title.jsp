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
    if(document.mytitle.title_id.value=="") {
        alert("Please provide title Id");
        document.mytitle.title_id.focus();
        return false;
    }
    if(document.mytitle.title_name.value=="") {
        alert("Please provide Title Name");
        document.mytitle.title_name.focus();
        return false;
    }
    if(document.mytitle.writer.value=="") {
        alert("Please provide Writer");
        document.mytitle.writer.focus();
        return false;
    }
    if(document.mytitle.singer.value=="") {
        alert("Please provide singer");
        document.mytitle.singer.focus();
        return false;
    }
    if(document.mytitle.director.value=="") {
        alert("Please provide Director");
        document.mytitle.director.focus();
        return false;
    }
    if(document.mytitle.lyrisist.value=="") {
        alert("Please provide Lyrisist");
        document.mytitle.lyrisist.focus();
        return false;
    }
}
</script>
</head>
<body background="E:\title1.jpg" style="background-repeat:no-repeat;background-size:cover;">
<form action =Controller name=mytitle onsubmit="return validation()">
<input type="hidden" name="action" value="Add3"><p/><br>

 <div class="login-box">

 
   <h1><center>Title Details</center></h1>
   <div class="textbox">
           <center><font color="white">Enter Title Id: </font></center> <input type=text name="title_id">
    </div>
   <div class="textbox">
           <center><font color="white"> Enter Title Name :</font></center> <input type=text name="title_name">
    </div>
   <div class="textbox"> 
           <center><font color="white">Enter Writer :</font></center>  <input type=text name="writer">
   </div>
   <div class="textbox">
           <center><font color="white"> Enter Singer: </font></center> <input type=text name="singer">
   </div>
   <div class="textbox">
            <center><font color="white">Enter Director :</font></center> <input type=text name="director">
    </div>
    <div class="textbox">
           <center><font color="white"> Enter Lyrisist :</font></center>  <input type=text name="lyrisist">
     </div>       
            <input type=submit class="btn" value="Add To Title">
  </div>
</form>
</body>
</html>