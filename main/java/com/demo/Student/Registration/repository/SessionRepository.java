package com.demo.Student.Registration.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.demo.Student.Registration.entity.Session;

public interface SessionRepository extends CrudRepository<Session, UUID>{

}
