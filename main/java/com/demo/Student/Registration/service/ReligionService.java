package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Religion;
import com.demo.Student.Registration.repository.ReligionRepository;

@Service
public class ReligionService {
	
	@Autowired
	ReligionRepository religionRepository;

	public void create(Religion religion) {
	
		religionRepository.save(religion);
		
	}
	

}
