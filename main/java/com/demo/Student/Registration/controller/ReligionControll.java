package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Religion;
import com.demo.Student.Registration.service.ReligionService;

@RestController
@RequestMapping("/api/religion")
public class ReligionControll {
	
	@Autowired
	ReligionService religionService; 
	
	@PostMapping(value = "/create")
	public void create(@RequestBody Religion religion) {
		
		religionService.create(religion);
		
	}
}
