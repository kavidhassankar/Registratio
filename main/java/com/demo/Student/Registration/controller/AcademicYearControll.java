package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.AcademicYear;
import com.demo.Student.Registration.service.AcademicyearService;

@RestController
@RequestMapping("/api/academicYear")
public class AcademicYearControll {

	@Autowired
	AcademicyearService academicyearService;
	
	@PostMapping(value = "/create")
	public void create(@RequestBody AcademicYear academicYear) {
		
		academicyearService.create(academicYear);
	
	}

}
