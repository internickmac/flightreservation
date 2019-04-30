package com.galosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.galosoft.entities.Flight;
import com.galosoft.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
