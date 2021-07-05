package com.example.proj1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj1.model.Student;
import com.example.proj1.repo.Studentrepo;


@RestController
public class Studentcontroller {
	
	@Autowired
	Studentrepo repo;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		repo.save(student);
		return "home.jsp";
	}
	
	@RequestMapping("/students")
	@ResponseBody
	public List<Student> getStudents() {
		return repo.findAll();
		
	}
	
	@RequestMapping("/student/{s_id}")
	@ResponseBody
	public Optional<Student> getStudent(@PathVariable("s_id") int s_id) {	
		return repo.findById(s_id);
	}
}
