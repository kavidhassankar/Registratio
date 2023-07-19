package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Nationality;
import com.demo.Student.Registration.repository.NationaltyRepository;

@Service
public class NationalityService {
	
	@Autowired
	NationaltyRepository nationaltyRepository;

	public void create(Nationality nationality) {
		
		Nationality nationali = new Nationality();
	
		nationali.setId(nationality.getId());
		nationali.setShortName(nationality.getShortName());
		nationali.setName(nationality.getName());
		
		nationaltyRepository.save(nationality);
		
	}
	
	
	
	

}
