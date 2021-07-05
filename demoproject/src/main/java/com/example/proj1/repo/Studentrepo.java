package com.example.proj1.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.proj1.model.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {
	
}
