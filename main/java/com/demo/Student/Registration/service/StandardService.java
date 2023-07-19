package com.demo.Student.Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Standard;
import com.demo.Student.Registration.repository.StandardRepository;

@Service
public class StandardService {

	@Autowired
	StandardRepository standardRepository;

	public void create(Standard standard) {

		standardRepository.save(standard);
	}

}
