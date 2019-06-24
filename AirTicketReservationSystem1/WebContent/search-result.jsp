<%@page import="com.IPProject.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search results</title>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="images/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min1.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/animate.css">
	<link rel="stylesheet" type="text/css" href="css/select2.min.css">
	<link rel="stylesheet" type="text/css" href="css/perfect-scrollbar.css">
	
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100">
					<table>
						<thead>
							<tr class="table100-head">
								<th class="column1">Flight ID</th>
								<th class="column2">Flight Name</th>
								<th class="column3">Source</th>
								<th class="column4">Destination</th>
								<th class="column5">Class</th>
								<th class="column6">Departure Date</th>
								<th class="column7">Departure Time</th>
								<th class="column8">Duration</th>
								<th class="column9">Price</th>
								<th class="coulomn10">Book</th>
							</tr>
						</thead>
						<c:forEach var="tempFlight" items="${FLIGHT_LIST}">
						 
						<c:url var="bookLink" value="book_ticket.jsp">
				
						</c:url>
	
						<tbody>
								<tr>
									<td class="column1">${tempFlight.flightId}</td>
									<td class="column2">${tempFlight.flightName}</td>
									<td class="column3">${tempFlight.source}</td>
									<td class="column4">${tempFlight.destination}</td>
									<td class="column5">${tempFlight.classOfFlight}</td>
									<td class="column6">${tempFlight.departureDate}</td>
									<td class="column7">${tempFlight.departureTime}</td>
									<td class="column8">${tempFlight.duration}</td>
									<td class="column9">${tempFlight.priceAdults}</td>
									<td class="column10"><a href="${bookLink}">Book</a></td>
								</tr>
																
						</tbody>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>



<script src="js/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="js/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>