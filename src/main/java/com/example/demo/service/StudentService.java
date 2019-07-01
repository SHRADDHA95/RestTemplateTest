package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public List<Student> getStudent();

	public Student getStudentById(int id);

}
