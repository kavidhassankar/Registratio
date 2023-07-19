//package com.demo.Student.Registration.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.Student.Registration.entity.Student;
//import com.demo.Student.Registration.service.StudentRegistrationService;
//
//@RestController
//@RequestMapping ("/pdfcreate")
//public class PdfController {
//	
//	@Autowired
//	StudentRegistrationService studentRegistrationService;
//	
//	
//	
//	@GetMapping(value = "/get/{Id}", produces = "application/json")
//	public Optional<Student> get(@PathVariable UUID Id) {
//		
//		
//		Student student=studentRegistrationService.getById(Id);
//		
//		Map<String, Object> response = new HashMap<String, Object>();
//		
//		response.put("jdd", student);
//		
//		
//		byte[] report = flyingSaucerPDFUtil.generatePdf("sales/salePdf", response);
//		
//		
//		
//		return null;
//		
//		
//	}
//}
// 