package com.galosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
