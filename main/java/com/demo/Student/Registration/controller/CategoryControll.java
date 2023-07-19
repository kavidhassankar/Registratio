package com.demo.Student.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Student.Registration.entity.Category;
import com.demo.Student.Registration.service.CategoryService;


@RestController
@RequestMapping("/api/category")
public class CategoryControll {
	
	@Autowired
	CategoryService CategoryService;
	
	@PostMapping(value = "/create")
	public void create(@RequestBody Category category) {
	
		CategoryService.create(category);
	
	}
}
