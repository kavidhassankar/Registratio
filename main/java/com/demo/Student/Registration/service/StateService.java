package com.demo.Student.Registration.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.Student.Registration.entity.State;
import com.demo.Student.Registration.enumeration.Status;
import com.demo.Student.Registration.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	StateRepository stateRepository;

	public void create(State stateobj) {

		State obj = new State();
		obj.setId(stateobj.getId());
		obj.setShortName(stateobj.getShortName());
		obj.setName(stateobj.getName());
		obj.setStatus(Status.ACTIVE);
		obj.setCountryId(stateobj.getCountryId());

		stateRepository.save(stateobj);

	}

	public void update(State stateobj) {

		stateRepository.save(stateobj);

	}

	public void delete(UUID id) {
		stateRepository.deleteById(id);

	}

	public Optional<State> find(UUID id) {
		
		return stateRepository.findById(id);
	}

}
