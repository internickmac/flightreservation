package com.galosoft.services;

import com.galosoft.dto.ReservationRequest;
import com.galosoft.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
