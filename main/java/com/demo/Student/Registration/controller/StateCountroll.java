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

import com.demo.Student.Registration.entity.State;
import com.demo.Student.Registration.service.StateService;

@RestController
@RequestMapping("/api/State")
public class StateCountroll {

	@Autowired
	public StateService stateService;

	@PostMapping(value = "/create")
	public void create(@RequestBody State stateobj) {
//		
//		State state=new State();
//		state.setId(stateobj.getId());
//		state.setCountryId(stateobj.getCountryId());
//		
		stateService.create(stateobj);

	}

	@PutMapping(value = "/update")
	public void update(@RequestBody State state) {
//		Optional<State> stat = stateService.getById(state.getId());

		stateService.update(state);
	}

	@GetMapping(value = "/get/{Id}")
	public Optional<State> get(@PathVariable UUID Id) {

		return stateService.find(Id);
	}

	@DeleteMapping(value = "/delete/{Id}")
	public void delete(@PathVariable("Id") UUID Id) {

		stateService.delete(Id);
	}

}
