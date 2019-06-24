<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="usercss/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="usercss/icon-font.min.css">
<link rel="stylesheet" type="text/css" href="usercss/util.css">
<link rel="stylesheet" type="text/css" href="usercss/main.css">
</head>
<body>
<c:url var="updateLink" value="UserController">
	<c:param name="COMMAND" value="LOAD"/>
	</c:url>
<div class="limiter">
		<div class="container-login100" style="background-image: url('images/background.jpg'); background-size:cover;">

			<div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-55">
					 CONFIRM BOOKING OR GO BACK
					</span>

<!-- 					<div class="wrap-input100 validate-input m-b-16" > -->
<!-- 						<input class="input100" required="required" type="text" name="emailId" placeholder="Email""> -->
<!-- 						<span class="focus-input100"></span> -->
<!-- 						<span class="symbol-input100"> -->
<!-- 							<span class="lnr lnr-envelope"></span> -->
<!-- 						</span> -->
<!-- 					</div> -->

					<div class="container-login100-form-btn p-t-25">
						<a href="${updateLink}" class="login100-form-btn">
							YES</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/main.js"></script>

	

</body>
</html>

