package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class RestAPI {

	@Autowired
	StudentService studentService;

	@GetMapping(value = "/getData/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		/*Student resp = studentService.getStudentById(id);

		return new ResponseEntity<Student>(resp, HttpStatus.OK);*/

		try {
			Student resp = studentService.getStudentById(id);

			return new ResponseEntity<Student>(resp, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}

	}

}
