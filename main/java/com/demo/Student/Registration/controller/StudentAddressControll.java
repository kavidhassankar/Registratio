//package com.demo.Student.Registration.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.Student.Registration.dto.StudentAddressDto;
//import com.demo.Student.Registration.service.StudAddressService;
//
//@RestController
//@RequestMapping("/api/StuAddres")
//public class StudentAddressControll {
//	
//	@Autowired
//	StudAddressService studAddressService;
//
//	@PostMapping(value = "/create")
//	public void create(@RequestBody StudentAddressDto stuAddressDto) {
//		
//		
//		studAddressService.create(stuAddressDto);
//	}
//
//}
