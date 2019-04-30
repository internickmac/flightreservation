package com.galosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.galosoft.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
