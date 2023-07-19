package com.demo.Student.Registration.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.Student.Registration.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, UUID> {

	
}
