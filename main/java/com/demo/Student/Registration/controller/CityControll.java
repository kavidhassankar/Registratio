package com.demo.Student.Registration.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.City;
import com.demo.Student.Registration.service.CityService;

@RestController
@RequestMapping("/api/city")
public class CityControll {
	
	@Autowired
	CityService cityService;
	
	@PostMapping(value = "/create")
	public void create(@RequestBody City city) {
		
		cityService.create(city);
		
	}
	
	@PutMapping(value = "/update")
	public void update(@RequestBody City countr) {
		

		cityService.update(countr);
	}
	
	@DeleteMapping(value = "/delete/{Id}")
	public void delete(@PathVariable("Id") UUID Id) {

		cityService.delete(Id);
	}
	
	@GetMapping(value = "/get/{Id}")
	public Optional<City> get(@PathVariable UUID Id) {
		
		return cityService.find(Id);
		
	}


	
	

}
