package com.demo.Student.Registration.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.Country;
import com.demo.Student.Registration.enumeration.Status;
import com.demo.Student.Registration.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	public void create(Country country) {
		Country obj = new Country();
		obj.setId(country.getId());
		obj.setName(country.getName());
		obj.setShortName(country.getShortName());
		obj.setStatus(Status.ACTIVE);
		countryRepository.save(country);

	}


	public void delete(UUID Id) {

		countryRepository.deleteById(Id);
	}

	public Optional<Country> find(UUID id) {

		return countryRepository.findById(id);
	}

	

	public void update(Country countr) {
		
		countryRepository.save(countr);
	}
}

