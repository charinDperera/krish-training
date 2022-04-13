package com.krishantha.rentcloud.profileservice.service;

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

}
