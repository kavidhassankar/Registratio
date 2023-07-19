package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Occupation;
import com.demo.Student.Registration.repository.OccupationRepository;

@Service
public class OccupationService {

	@Autowired
	OccupationRepository occupationRepository;

	public void create(Occupation occupation) {
		
		occupationRepository.save(occupation);
		
		
	}
	
	
	
	

}
