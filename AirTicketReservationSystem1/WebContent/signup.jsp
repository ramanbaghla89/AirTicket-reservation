<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="usercss/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="usercss/icon-font.min.css">
<link rel="stylesheet" type="text/css" href="usercss/util.css">
<link rel="stylesheet" type="text/css" href="usercss/main.css">
</head>
<body>


<div class="limiter">
<div class="container-login100" style="background-image: url('images/background.jpg'); background-size:cover;">

<div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">

<form class="login100-form validate-form" action="UserController" method="get">

<input type="hidden" name="COMMAND" value="ADD">
<span class="login100-form-title p-b-55">
SignUp
</span>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="text" name="emailId" placeholder="Email">
<span class="focus-input100"></span>
<span class="symbol-input100">
<span class="lnr lnr-envelope"></span>
</span>
</div>

<div class="wrap-input100 validate-input m-b-16">
<input class="input100" required="required" type="password" name="password" placeholder="Password">
<span class="focus-input100"></span>
<span class="symbol-input100">
<span class="lnr lnr-lock"></span>
</span>
</div>

<div class="wrap-input100 validate-input m-b-16">
<input class="input100" required="required" type="text" name="firstName" placeholder="First Name">
<span class="focus-input100"></span>
<span class="symbol-input100">
<span class="lnr lnr-user"></span>
</span>
</div>

<div class="wrap-input100 validate-input m-b-16">
<input class="input100" required="required" type="text" name="lastName" placeholder="Last Name">
<span class="focus-input100"></span>
<span class="symbol-input100">
<span class="lnr lnr-user"></span>
</span>
</div>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="text" name="address" placeholder="Address">
<span class="focus-input100"></span>
<span class="symbol-input100">

<span class="lnr lnr-phone"></span>
</span>
</div>
<div class="container-login100-form-btn p-t-25">
<button class="login100-form-btn" type="submit" value="save" >Sign Up</button>
</div>

</form>
</div>
</div>
</div>
</body>
</html>