package com.demo.Student.Registration.controller;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Student;
import com.demo.Student.Registration.service.StudentRegistrationService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/student/regis")
public class StudentRegistrationController {

	@Autowired
	StudentRegistrationService stuRegisService;

	@PostMapping(value = "/create", produces = "application/json")
	public Student create(@RequestBody Student request) throws Exception {

		stuRegisService.save(request);

		return request;
	}

	@GetMapping(value = "/get/{Id}", produces = "application/json")
	public Optional<Student> get(@PathVariable UUID Id) {

		return stuRegisService.find(Id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public Iterable<Student> getAll() {

		return stuRegisService.findAll();
	}

	@DeleteMapping(value = "/delete/{Id}")
	public void delete(@PathVariable("Id") UUID Id) {

		stuRegisService.delete(Id);
	}

	@PutMapping(value = "/update")
	public Student update(@RequestBody Student request) throws Exception {
		stuRegisService.save(request);
		return request;
	}
}
