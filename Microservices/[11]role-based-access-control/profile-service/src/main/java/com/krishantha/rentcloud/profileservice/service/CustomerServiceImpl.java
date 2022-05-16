package com.krishantha.rentcloud.profileservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.rentcloud.commons.model.Customer;
import com.krishantha.rentcloud.profileservice.repository.CustomerRepositiry;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepositiry customerRepositiry;

	@Override
	public Customer save(Customer customer) {
		return customerRepositiry.save(customer);
	}

	@Override
	public Customer fetchById(int profileId) {
		Optional<Customer> customer = customerRepositiry.findById(profileId);
		if (customer.isPresent())
			return customer.get();
		else
			return null;
	}

	@Override
	public List<Customer> fetchAllProfileData() {
		return customerRepositiry.findAll();
	}

}
