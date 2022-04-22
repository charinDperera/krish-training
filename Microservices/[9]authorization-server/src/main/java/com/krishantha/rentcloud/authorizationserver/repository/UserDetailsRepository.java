package com.krishantha.rentcloud.authorizationserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishantha.rentcloud.authorizationserver.model.User;

public interface UserDetailsRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String name);
}
