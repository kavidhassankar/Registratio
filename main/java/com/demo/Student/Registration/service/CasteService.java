package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Caste;
import com.demo.Student.Registration.repository.CasteRepository;

@Service
public class CasteService {
	
	@Autowired
	CasteRepository casteRepository;

	public void create(Caste caste) {
		
		casteRepository.save(caste);
	}

}
