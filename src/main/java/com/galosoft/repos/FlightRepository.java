package com.galosoft.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.galosoft.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	//@Query("from Flight where departureCity:=departureCity")
	List<Flight>findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") String departureDate);

                                                                                                                               	

}
