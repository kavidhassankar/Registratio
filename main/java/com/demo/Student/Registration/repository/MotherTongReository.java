package com.demo.Student.Registration.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.demo.Student.Registration.entity.MotherTong;

public interface MotherTongReository extends CrudRepository<MotherTong, UUID>{

}
