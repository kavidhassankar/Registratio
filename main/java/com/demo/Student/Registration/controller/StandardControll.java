package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Standard;
import com.demo.Student.Registration.service.StandardService;

@RestController
@RequestMapping("/api/standard")
public class StandardControll {
	
	@Autowired
	StandardService standardService;
	

	@PostMapping(value = "/create")
	public void create(@RequestBody Standard standard) {
		
		standardService.create(standard);

}
}
