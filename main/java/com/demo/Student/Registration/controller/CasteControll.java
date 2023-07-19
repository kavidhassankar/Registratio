package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Caste;
import com.demo.Student.Registration.service.CasteService;

@RestController
@RequestMapping("/api/caste")
public class CasteControll {
	
	@Autowired
	CasteService casteService;

	@PostMapping(value = "/create")
	public void create(@RequestBody Caste caste) {
		
		casteService.create(caste);
	
	}

}
