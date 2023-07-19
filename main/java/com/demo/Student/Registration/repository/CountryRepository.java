package com.demo.Student.Registration.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.Student.Registration.entity.Country;

@Repository
public interface CountryRepository  extends CrudRepository<Country, UUID>{


	

}
