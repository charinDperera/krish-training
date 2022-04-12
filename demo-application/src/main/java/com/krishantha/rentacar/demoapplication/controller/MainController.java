package com.krishantha.rentacar.demoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krishantha.rentacar.demoapplication.model.Student;
import com.krishantha.rentacar.demoapplication.service.StudentService;

@RestController
public class MainController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greetingGet() {
		return "Hello Springboot GET";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String greetingPost() {
		return "Hello Springboot POST";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
}
