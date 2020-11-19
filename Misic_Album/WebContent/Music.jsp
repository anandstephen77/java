<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

header {
	-webkit-background-size:cover;
	background-size:cover;
	background-position:center center;
	position: relative;
	
}

.nav-area{
float:right;
list-style:none;
margin:30px;

}
.nav-area li{
display:inline-block;
}
.nav-area li a{
color:white;
text-decoration:none;
padding:5px 20px;
font-family:poppins;
font-size:16px;
}
.nav-area li a:hover{
background:#fff;
color:#333;
}
.left-area{
float:left;
list-style:none;
margin:30px;

}
.left-area li{
display:inline-block;
}
.left-area li a{
color:white;
text-decoration:none;
padding:5px 20px;
font-family:poppins;
font-size:16px;
}
.left-area li a:hover{
background:#fff;
color:#333;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="E:\m.jpg"
	style="background-repeat: no-repeat; background-size: cover;">
<header>
<div class="left-area">
<ul>
		<li><a href="#Home"><span>Home</span></a></li>


		<li><a href="#Contact"><span>Contact</span></a> </li>


		<li><a href="#Information"><span>information</span></a> </li>
		</ul>
</div>
<ul class="nav-area">

		<li><a href="Login.jsp">Login</a></li>

		<li><a href="Registration.jsp">Register</a></li>
</ul>

		</header>

<main>
    <section id="Home">
            <div class="section-inner">
                <img src="m.jpg" class="profile-img">
                <h1>Music Album</h1>
            </div>
        </section>
        
    <section id="Contact">
            <div class="section-inner">
                <img src="m.jpg" class="profile-img">
                <h1>Information</h1>
            </div>
        </section>
       
    <section id="Information">
            <div class="section-inner">
                <img src="m.jpg" class="profile-img">
                <h1>Contact</h1>
                <p>You can contact through this mobile number : 7893088341</p>
            </div>
        </section>
        </main>

</body>
</html>