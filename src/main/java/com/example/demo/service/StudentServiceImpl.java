package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	List<Student> list = new ArrayList<Student>();

	@Override
	public List<Student> getStudent() {
		list.clear();
		list.add(new Student(1, "Shraddha", "Shrivastav"));
		list.add(new Student(2, "John", "Doe"));
		return list;

	}

	@Override
	public Student getStudentById(int id) {
		getStudent();
        return list.stream().filter(st -> st.getId() == id).findFirst().get();
	}

}
