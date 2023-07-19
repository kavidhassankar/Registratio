package com.demo.Student.Registration.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Student.Registration.entity.Student;

@Repository
public interface StudentRigsRepository extends JpaRepository<Student, UUID> {

	


	
	
	
	

}
