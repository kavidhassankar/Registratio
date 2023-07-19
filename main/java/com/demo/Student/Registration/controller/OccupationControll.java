package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Occupation;
import com.demo.Student.Registration.service.OccupationService;

@RestController
@RequestMapping("api/occupatio")
public class OccupationControll {
	
	@Autowired
	OccupationService occupationSe;
	
	@PostMapping(value = "/create")
	public void create(@RequestBody Occupation occupation) {
		
		occupationSe.create(occupation);
	

}
}
