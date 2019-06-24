<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
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
				<form class="login100-form validate-form" action="UserController" method="post">
				<input type="hidden" name="COMMAND" value="USER">
				<%
					String msg=(String)request.getAttribute("msg");
				if(msg!=null) {
					%>
					<h3 style="color:red;"><%= msg %></h3>
				<%}
				%>
				
				
					<span class="login100-form-title p-b-55">
						Login
					</span>

					<div class="wrap-input100 validate-input m-b-16" >
						<input class="input100" type="text" name="emailId" placeholder="Email"  required>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-envelope"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-16">
						<input class="input100" type="password" name="password" placeholder="Password" required >
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-lock"></span>
						</span>
					</div>

					<div class="container-login100-form-btn p-t-25">
					<input type="Submit" name="Login" class="login100-form-btn">				
					</div>

					<div class="text-center w-full p-t-115">
						<span class="txt1">
							Not a member?
						</span>

						<a class="txt1 bo1 hov1" href="signup.jsp">
							Sign up now
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/main.js"></script>


</body>
</html>