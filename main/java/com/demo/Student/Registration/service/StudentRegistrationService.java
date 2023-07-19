package com.demo.Student.Registration.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Student;
import com.demo.Student.Registration.repository.StudentRigsRepository;

@Service
public class StudentRegistrationService {

	@Autowired
	StudentRigsRepository stuRegRepository;

	public void save(Student request) {

		stuRegRepository.saveAndFlush(request);

	}

	public Optional<Student> find(UUID id) {

		return stuRegRepository.findById(id);
	}

	public Iterable<Student> findAll() {
		return stuRegRepository.findAll();
	}

	public void delete(UUID id) {

		stuRegRepository.deleteById(id);
	}

	public void update(Student request) {

	}

	public Student getById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
