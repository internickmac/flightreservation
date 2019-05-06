package com.galosoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galosoft.dto.ReservationRequest;
import com.galosoft.entities.Flight;
import com.galosoft.entities.Passenger;
import com.galosoft.entities.Reservation;
import com.galosoft.repos.FlightRepository;
import com.galosoft.repos.PassengerRepository;
import com.galosoft.repos.ReservationRepository;
import com.galosoft.util.EmailUtil;
import com.galosoft.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	PDFGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.getOne(flightId);
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		String filePath = "//home//bruno//Descargas//javaEE//SpringTasks//flightreservation//reservations" + savedReservation.getId()+".pdf";
		
		pdfGenerator.generateItinerary(savedReservation, filePath);
		
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		return savedReservation;
	}

}


























