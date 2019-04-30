package com.galosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
