package com.demo.Student.Registration.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Student.Registration.entity.City;
import com.demo.Student.Registration.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository cityRepository;

	public void create(City city) {
		
		cityRepository.save(city);
		
	}

	public void update(City countr) {
	
		cityRepository.save(countr);
	}

	public void delete(UUID id) {
		cityRepository.deleteById(id);
		
	}

	public Optional<City> find(UUID id) {

		return cityRepository.findById(id);
	}

}
