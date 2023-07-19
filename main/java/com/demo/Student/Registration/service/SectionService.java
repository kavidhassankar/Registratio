package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Section;
import com.demo.Student.Registration.repository.SectionRepository;

@Service
public class SectionService {

	@Autowired
	SectionRepository sectionRepository;

	public void create(Section section) {
		
		sectionRepository.save(section);
		
	}
	
	
}
