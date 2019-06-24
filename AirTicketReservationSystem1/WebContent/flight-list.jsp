<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Ticket Bookings</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://fonts.googleapis.com/css?family=PT+Sans:400" rel="stylesheet">

	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div id="booking" class="section">
		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="booking-form">
						<form action="FlightController" method ="GET">
						<input type="hidden" name="COMMAND" value="SEARCH"/>
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<span class="form-label">FROM</span>
										<input class="form-control" type="text" placeholder="CITY" name="searchSource" required="required">
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<span class="form-label">TO</span>
										<input class="form-control" type="text" placeholder="CITY" name="searchDestination" required="required">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="form-group">
										<span class="form-label">DEPART ON</span>
										<input class="form-control" type="date" name="searchdeparture" required>
									</div>
								</div>
								</div>



								<div class="row">
								<div class="col-md-3">
									<div class="form-btn">
										<button class="submit-btn" type="Submit" value="Search">SEARCH</button>
									</div>
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
</html>