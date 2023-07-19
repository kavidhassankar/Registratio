package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Session;
import com.demo.Student.Registration.service.SessionService;

@RestController
@RequestMapping("/api/session")
public class SessionControll {
	@Autowired
	SessionService sessionService;

	@PostMapping(value = "/create")
	public void create(@RequestBody Session  session) {
		
		sessionService.create(session);
	
	}

}
