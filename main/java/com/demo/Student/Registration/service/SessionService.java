package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Session;
import com.demo.Student.Registration.repository.SessionRepository;

@Service
public class SessionService {
	
	@Autowired
	SessionRepository sessionService;

	public void create(Session session) {
	
		sessionService.save(session);
	}

}
