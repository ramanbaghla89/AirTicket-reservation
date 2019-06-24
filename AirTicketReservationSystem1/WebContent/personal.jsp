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

<input type="hidden" name="COMMAND" value="ADDMORE">

<span class="login100-form-title p-b-55">
Add Personal Details
</span>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="text" name="email_id" placeholder="Email ID" value="${USER.emailId}">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="text" name="father_name" placeholder="Father's Name" value="${USER.fatherName}">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16">
<select class="input100" required="required" name="sex" placeholder="Sex" value="${USER.sex}">
	<option >Male</option>
	<option>Female</option>
	<option>Other</option>
</select>
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16">
<input class="input100" required="required" type="number" name="adults_no" placeholder="Number of adults" value="${USER.adultNo }">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16">
<input class="input100" required="required" type="number" name="children_no" placeholder="Number of children" value="${USER.childrenNo }">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="number" name="infants_no" placeholder="Number of Infants" value="${USER.infantsNo }">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="text" name="phone" placeholder="Phone Number" value="${USER.phone }">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="wrap-input100 validate-input m-b-16" >
<input class="input100" required="required" type="Date" name="dob" placeholder="Date of birth" value="${USER.dateOfBirth }">
<span class="focus-input100"></span>
<span class="symbol-input100">
</span>
</div>

<div class="container-login100-form-btn p-t-25">
<button class="login100-form-btn" type="submit" value="save" >Continue </button>
</div>

</form>
</div>
</div>
</div>
</body>
</html>