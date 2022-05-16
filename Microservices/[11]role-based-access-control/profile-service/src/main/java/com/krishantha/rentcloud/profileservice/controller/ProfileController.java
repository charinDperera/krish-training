package com.krishantha.rentcloud.profileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.krishantha.rentcloud.commons.model.Customer;
import com.krishantha.rentcloud.profileservice.service.CustomerService;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('create_profile')")
	public Customer save(@RequestBody Customer customer) {
		 return customerService.save(customer);
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public Customer fetchData(@RequestParam int profileId) {
		return customerService.fetchById(profileId);
	}
	
	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_operator')")
	public List<Customer> fetchData(){
		return customerService.fetchAllProfileData();
	} 
		
}
