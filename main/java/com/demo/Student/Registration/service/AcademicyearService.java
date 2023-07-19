package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.AcademicYear;
import com.demo.Student.Registration.repository.AcademicYearRepository;

@Service
public class AcademicyearService {
	
	@Autowired
	AcademicYearRepository academicYearRepository;

	public void create(AcademicYear academicYear) {
		// TODO Auto-generated method stub
		
		academicYearRepository.save(academicYear);
	}

}
