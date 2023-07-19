package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.MotherTong;
import com.demo.Student.Registration.service.MothertTongService;

@RestController
@RequestMapping("/api/mothertoumg")
public class MotherTongeConroll {
	
	@Autowired
	MothertTongService mothertToungService;
	
	@PostMapping(value = "/create")
	public void create(@RequestBody MotherTong mother) {

		mothertToungService.create(mother);

	
	
	}

}
