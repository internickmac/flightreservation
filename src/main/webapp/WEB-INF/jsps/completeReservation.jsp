<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complete Reservation</title>
</head>
<body>
	<h2>Complete Reservation</h2>
	<p><b>Airline:</b>${flight.operatingAirlines}</p>
	<p><b>Departure City:</b> ${flight.departureCity}</p>
	<p><b>Arrival City:</b> ${flight.arrivalCity}</p>

	<form action="completeReservation" method="POST">
	<h2>Passenger details</h2>
		<p>First Name: <input type="text" name="passengerFirstName"></p>
		<p>Last Name: <input type="text" name="passengerLastName"></p>
		<p>Email: <input type="text" name="passengerEmail"></p>
		<p>Phone: <input type="text" name="passengerPhone"></p>
	
	<h2>Card Details</h2>
		<p>Name on the card: <input type="text" name="nameOnTheCard"></p>
		<p>Card Number: <input type="text" name="cardNumber"></p>
		<p>Expiration Date: <input type="text" name="expirationDate"></p>
		<p>Security Code: <input type="text" name="securityCode"></p>
		<input type="hidden" name="flightId" value="${flight.id}">
		
		<input type="submit" value="Confirm">	
	</form>
</body>
</html>