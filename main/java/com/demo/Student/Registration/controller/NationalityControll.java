package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Nationality;
import com.demo.Student.Registration.service.NationalityService;

@RestController
@RequestMapping("/api/national")
public class NationalityControll {
	
	@Autowired
	NationalityService nationalityService;
	
	@PostMapping(value = "/create")
	public void create(@RequestBody Nationality nationality) {

		nationalityService.create(nationality);

}
}
