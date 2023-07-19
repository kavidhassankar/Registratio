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

import com.demo.Student.Registration.entity.Country;
import com.demo.Student.Registration.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryCountrol {

	@Autowired
	public CountryService countryService;

	@PostMapping(value = "/create")
	public void create(@RequestBody Country country) {

		countryService.create(country);

	}

	@PutMapping(value = "/update")
	public void update(@RequestBody Country countr) {
		//Optional<Country> country = countryService.getById(countr.getId());
	
		countryService.update(countr);
	
	}

	@DeleteMapping(value = "/delete/{Id}")
	public void delete(@PathVariable("Id") UUID Id) {

		countryService.delete(Id);
	}

	@GetMapping(value = "/get/{Id}")
	public Optional<Country> get(@PathVariable UUID Id) {

		return countryService.find(Id);

	}

}
