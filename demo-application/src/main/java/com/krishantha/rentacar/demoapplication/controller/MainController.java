package com.krishantha.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greetingGet() {
		return "Hello Springboot GET";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String greetingPost() {
		return "Hello Springboot POST";
	}
}
