package com.krishantha.rentcloud.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishantha.rentcloud.commons.model.Customer;

public interface CustomerRepositiry extends JpaRepository<Customer, Integer> {

}
