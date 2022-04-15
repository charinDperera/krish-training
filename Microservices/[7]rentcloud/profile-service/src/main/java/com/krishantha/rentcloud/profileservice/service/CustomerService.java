package com.krishantha.rentcloud.profileservice.service;

import java.util.List;

import com.krishantha.rentcloud.commons.model.Customer;

public interface CustomerService {
	Customer save(Customer customer);

	Customer fetchById(int profileId);

	List<Customer> fetchAllProfileData();
}
