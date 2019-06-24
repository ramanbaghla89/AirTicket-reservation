<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, td, th {  
  border: 1px solid #ddd;
  text-align: left;
}

table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 15px;
}
</style>

</head>
<body>
<h2 style="background-color:blue;">Flight Booking Receipt</h2>
<div style="background-color:skyblue;">
<p><b>Booking Ref No:</b>2019/INF/0234516</p>
<p><b>Booked on:</b> May 22 2019 1:05PM</p>
<p><b>Booking Class:</b>Economy</p>
<p>Please quote your Booking Ref.No. for all communications related to this booking</p></br>
</div>
<div style="background-color:white;">
<p><b>Itinerary Details:</b></p>
<table>
<tr>
<th></th>
<th>Flight Id</th>
<th>Departure</th>
<th>Arrival</th>
<th>Baggage</th>
</tr>
<tr>
<td>Onward</td>
<td>1003</td>
<td>Delhi</td>
<td>Hyderabad</td>
<td>CheckIn: 15 KG </td>
</tr>
</table>
<p><b>Please Note:</b> In case of baggage allowance in pieces, Airlines typically permit 23KG baggage weight per piece *Please contact the respective Airlines for any information on Baggage allowance/Terminal details for your flight if it is not mentioned in the receipt</p></br>
</div>
<p><b>Passenger details:</b></p>
<div style="background-color:skyblue;">
<table>
<tr>
<td>Passengers</td>
<td>Status</td>
</tr>
<tr>
<th>MANTHAN</th>
<th>SUCCESS</th>
</tr>
</table>
<p><b>Important:</b>To avoid any difficulty in the Refund processing, cancel/amend your tickets with our customer care instead of doing so directly with the airline</p>
</div>
<p><b>Payments details:</b></p>
<div>
<table>
  <tr>
<th>Total Amount</th>
<th>Paid by card</th>
<th>Paid by voucher</th>
<th>Akshaya patra donation</th>
<th>Member Name</th>
<th>Email id</th>
  </tr>
  <tr>
    <td>Rs. 2,883.00</td>
    <td>Rs. 2,883.00</td>
<td>Rs. 0.00 </td>
<td>	Rs. 0.00</td>
<td>ABCD</td>
<td>manthan@gmail.com</td>
  </tr>
</table>
</div>
<p><b>Important information</b></p>
<ul>
<li>This booking receipt also serves as your E-TICKET</li>
<li>Please quote Airline PNR for all communications with the airline</li>
<li>All departure and arrival times are local to airport</li>
<li>Please carry a print of this itinerary receipt at the time of Check-in</li>
<li>Please carry a valid photo identity card (Passport, Voter ID Card, PAN Card, Driving License) at the time of check-in, without which the airline may deny you a seat on the flight</li>
<li>Your travel on this itinerary is subject to Airline terms and conditions</li>
<li>Disclaimer: Passengers of all nationalities are advised to confirm with respective embassies for all the VISA requirements. This communication is for informational and general purpose only & Program Name assumes no responsibilities, legal or otherwise, of its applicability and accuracy</li>
<li>Weather Report : Partly cloudy throughout the day with Min Temp 27.73°C,Max Temp 36.93°C</li>
<li>Weather Report :</li>
<li>Currency : NA</li>

<button type="button" name="Print" value="button">Print</button>

</body>
</html>