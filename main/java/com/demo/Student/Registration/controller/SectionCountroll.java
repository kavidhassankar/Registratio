 package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Section;
import com.demo.Student.Registration.service.SectionService;


@RestController
@RequestMapping("/api/ssection")
public class SectionCountroll {
	
	@Autowired
	SectionService sectionService;

	
	@PostMapping(value = "/create")
	public void create(@RequestBody Section section) {
		
		sectionService.create(section);
	

	}
}
